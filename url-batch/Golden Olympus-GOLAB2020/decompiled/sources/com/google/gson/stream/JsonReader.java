package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import com.ironsource.mediationsdk.metadata.a;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class JsonReader implements Closeable, AutoCloseable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int i4 = jsonReader.peeked;
                if (i4 == 0) {
                    i4 = jsonReader.doPeek();
                }
                if (i4 == 13) {
                    jsonReader.peeked = 9;
                    return;
                }
                if (i4 == 12) {
                    jsonReader.peeked = 8;
                    return;
                }
                if (i4 == 14) {
                    jsonReader.peeked = 10;
                    return;
                }
                throw new IllegalStateException("Expected a name but was " + jsonReader.peek() + jsonReader.locationString());
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.in = reader;
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() {
        nextNonWhitespace(true);
        int i4 = this.pos - 1;
        this.pos = i4;
        char[] cArr = NON_EXECUTE_PREFIX;
        if (i4 + cArr.length > this.limit && !fillBuffer(cArr.length)) {
            return;
        }
        int i5 = 0;
        while (true) {
            char[] cArr2 = NON_EXECUTE_PREFIX;
            if (i5 >= cArr2.length) {
                this.pos += cArr2.length;
                return;
            } else if (this.buffer[this.pos + i5] != cArr2[i5]) {
                return;
            } else {
                i5++;
            }
        }
    }

    private boolean fillBuffer(int i4) {
        int i5;
        int i6;
        char[] cArr = this.buffer;
        int i7 = this.lineStart;
        int i8 = this.pos;
        this.lineStart = i7 - i8;
        int i9 = this.limit;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.limit = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i11 = this.limit;
            int read = reader.read(cArr, i11, cArr.length - i11);
            if (read == -1) {
                return false;
            }
            i5 = this.limit + read;
            this.limit = i5;
            if (this.lineNumber == 0 && (i6 = this.lineStart) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i6 + 1;
                i4++;
            }
        } while (i5 < i4);
        return true;
    }

    private boolean isLiteral(char c4) {
        if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
            return false;
        }
        if (c4 != '#') {
            if (c4 == ',') {
                return false;
            }
            if (c4 != '/' && c4 != '=') {
                if (c4 == '{' || c4 == '}' || c4 == ':') {
                    return false;
                }
                if (c4 != ';') {
                    switch (c4) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z4) {
        char c4;
        char[] cArr = this.buffer;
        int i4 = this.pos;
        int i5 = this.limit;
        while (true) {
            if (i4 == i5) {
                this.pos = i4;
                if (!fillBuffer(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i4 = this.pos;
                i5 = this.limit;
            }
            int i6 = i4 + 1;
            c4 = cArr[i4];
            if (c4 == '\n') {
                this.lineNumber++;
                this.lineStart = i6;
            } else if (c4 != ' ' && c4 != '\r' && c4 != '\t') {
                if (c4 == '/') {
                    this.pos = i6;
                    if (i6 == i5) {
                        this.pos = i4;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            break;
                        }
                    }
                    checkLenient();
                    int i7 = this.pos;
                    char c5 = cArr[i7];
                    if (c5 == '*') {
                        this.pos = i7 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i4 = this.pos + 2;
                        i5 = this.limit;
                    } else {
                        if (c5 != '/') {
                            break;
                        }
                        this.pos = i7 + 1;
                        skipToEndOfLine();
                        i4 = this.pos;
                        i5 = this.limit;
                    }
                } else {
                    if (c4 != '#') {
                        this.pos = i6;
                        return c4;
                    }
                    this.pos = i6;
                    checkLenient();
                    skipToEndOfLine();
                    i4 = this.pos;
                    i5 = this.limit;
                }
            }
            i4 = i6;
        }
        return c4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String nextQuotedValue(char c4) {
        char[] cArr = this.buffer;
        StringBuilder sb = null;
        do {
            int i4 = this.pos;
            int i5 = this.limit;
            while (true) {
                int i6 = i5;
                int i7 = i4;
                while (i4 < i6) {
                    int i8 = i4 + 1;
                    char c5 = cArr[i4];
                    if (c5 == c4) {
                        this.pos = i8;
                        int i9 = (i8 - i7) - 1;
                        if (sb == null) {
                            return new String(cArr, i7, i9);
                        }
                        sb.append(cArr, i7, i9);
                        return sb.toString();
                    }
                    if (c5 == '\\') {
                        this.pos = i8;
                        int i10 = i8 - i7;
                        int i11 = i10 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i10 * 2, 16));
                        }
                        sb.append(cArr, i7, i11);
                        sb.append(readEscapeCharacter());
                        i4 = this.pos;
                        i5 = this.limit;
                    } else {
                        if (c5 == '\n') {
                            this.lineNumber++;
                            this.lineStart = i8;
                        }
                        i4 = i8;
                    }
                }
                break;
            }
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String nextUnquotedValue() {
        String sb;
        StringBuilder sb2 = null;
        int i4 = 0;
        do {
            int i5 = 0;
            while (true) {
                int i6 = this.pos;
                if (i6 + i5 < this.limit) {
                    char c4 = this.buffer[i6 + i5];
                    if (c4 != '\t' && c4 != '\n' && c4 != '\f' && c4 != '\r' && c4 != ' ') {
                        if (c4 != '#') {
                            if (c4 != ',') {
                                if (c4 != '/' && c4 != '=') {
                                    if (c4 != '{' && c4 != '}' && c4 != ':') {
                                        if (c4 != ';') {
                                            switch (c4) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i5++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i5 >= this.buffer.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i5, 16));
                    }
                    sb2.append(this.buffer, this.pos, i5);
                    this.pos += i5;
                } else if (fillBuffer(i5 + 1)) {
                }
            }
            i4 = i5;
            if (sb2 != null) {
                sb = new String(this.buffer, this.pos, i4);
            } else {
                sb2.append(this.buffer, this.pos, i4);
                sb = sb2.toString();
            }
            this.pos += i4;
            return sb;
        } while (fillBuffer(1));
        if (sb2 != null) {
        }
        this.pos += i4;
        return sb;
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i4;
        char c4 = this.buffer[this.pos];
        if (c4 == 't' || c4 == 'T') {
            str = a.f17681g;
            str2 = "TRUE";
            i4 = 5;
        } else if (c4 == 'f' || c4 == 'F') {
            str = "false";
            str2 = "FALSE";
            i4 = 6;
        } else {
            if (c4 != 'n' && c4 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i4 = 7;
        }
        int length = str.length();
        for (int i5 = 1; i5 < length; i5++) {
            if (this.pos + i5 >= this.limit && !fillBuffer(i5 + 1)) {
                return 0;
            }
            char c5 = this.buffer[this.pos + i5];
            if (c5 != str.charAt(i5) && c5 != str2.charAt(i5)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i4;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r19.peekedLong = r11;
        r19.pos += r8;
        r19.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r19.peekedNumberLength = r8;
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        if (isLiteral(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() {
        int i4;
        char[] cArr = this.buffer;
        int i5 = this.pos;
        int i6 = this.limit;
        int i7 = 0;
        int i8 = 0;
        char c4 = 0;
        boolean z4 = false;
        int i9 = 1;
        long j4 = 0;
        while (true) {
            char c5 = 2;
            if (i5 + i8 == i6) {
                if (i8 == cArr.length) {
                    return i7;
                }
                if (!fillBuffer(i8 + 1)) {
                    i4 = i7;
                    break;
                }
                i5 = this.pos;
                i6 = this.limit;
            }
            char c6 = cArr[i5 + i8];
            i4 = i7;
            if (c6 != '+') {
                if (c6 == 'E' || c6 == 'e') {
                    if (c4 != 2 && c4 != 4) {
                        return i4;
                    }
                    c4 = 5;
                } else if (c6 == '-') {
                    c5 = 6;
                    if (c4 == 0) {
                        c4 = 1;
                        z4 = true;
                    } else if (c4 != 5) {
                        return i4;
                    }
                } else if (c6 != '.') {
                    if (c6 < '0' || c6 > '9') {
                        break;
                    }
                    if (c4 == 1 || c4 == 0) {
                        j4 = -(c6 - '0');
                    } else if (c4 == 2) {
                        if (j4 == 0) {
                            return i4;
                        }
                        long j5 = (10 * j4) - (c6 - '0');
                        i9 &= (j4 > MIN_INCOMPLETE_INTEGER || (j4 == MIN_INCOMPLETE_INTEGER && j5 < j4)) ? 1 : i4;
                        j4 = j5;
                    } else if (c4 == 3) {
                        c4 = 4;
                    } else if (c4 == 5 || c4 == 6) {
                        c4 = 7;
                    }
                } else {
                    if (c4 != 2) {
                        return i4;
                    }
                    c4 = 3;
                }
                i8++;
                i7 = i4;
            } else {
                c5 = 6;
                if (c4 != 5) {
                    return i4;
                }
            }
            c4 = c5;
            i8++;
            i7 = i4;
        }
    }

    private void push(int i4) {
        int i5 = this.stackSize;
        int[] iArr = this.stack;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[i5 * 2];
            int[] iArr3 = new int[i5 * 2];
            String[] strArr = new String[i5 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            System.arraycopy(this.pathIndices, 0, iArr3, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = iArr2;
            this.pathIndices = iArr3;
            this.pathNames = strArr;
        }
        int[] iArr4 = this.stack;
        int i6 = this.stackSize;
        this.stackSize = i6 + 1;
        iArr4[i6] = i4;
    }

    private char readEscapeCharacter() {
        int i4;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i5 = this.pos;
        int i6 = i5 + 1;
        this.pos = i6;
        char c4 = cArr[i5];
        if (c4 == '\n') {
            this.lineNumber++;
            this.lineStart = i6;
            return c4;
        }
        if (c4 == '\"' || c4 == '\'' || c4 == '/' || c4 == '\\') {
            return c4;
        }
        if (c4 == 'b') {
            return '\b';
        }
        if (c4 == 'f') {
            return '\f';
        }
        if (c4 == 'n') {
            return '\n';
        }
        if (c4 == 'r') {
            return '\r';
        }
        if (c4 == 't') {
            return '\t';
        }
        if (c4 != 'u') {
            throw syntaxError("Invalid escape sequence");
        }
        if (i5 + 5 > this.limit && !fillBuffer(4)) {
            throw syntaxError("Unterminated escape sequence");
        }
        int i7 = this.pos;
        int i8 = i7 + 4;
        char c5 = 0;
        while (i7 < i8) {
            char c6 = this.buffer[i7];
            char c7 = (char) (c5 << 4);
            if (c6 >= '0' && c6 <= '9') {
                i4 = c6 - '0';
            } else if (c6 >= 'a' && c6 <= 'f') {
                i4 = c6 - 'W';
            } else {
                if (c6 < 'A' || c6 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.buffer, this.pos, 4));
                }
                i4 = c6 - '7';
            }
            c5 = (char) (c7 + i4);
            i7++;
        }
        this.pos += 4;
        return c5;
    }

    private void skipQuotedValue(char c4) {
        char[] cArr = this.buffer;
        do {
            int i4 = this.pos;
            int i5 = this.limit;
            while (i4 < i5) {
                int i6 = i4 + 1;
                char c5 = cArr[i4];
                if (c5 == c4) {
                    this.pos = i6;
                    return;
                }
                if (c5 == '\\') {
                    this.pos = i6;
                    readEscapeCharacter();
                    i4 = this.pos;
                    i5 = this.limit;
                } else {
                    if (c5 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i6;
                    }
                    i4 = i6;
                }
            }
            this.pos = i4;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i4 = this.pos;
            if (cArr[i4] != '\n') {
                for (int i5 = 0; i5 < length; i5++) {
                    if (this.buffer[this.pos + i5] != str.charAt(i5)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i4 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() {
        char c4;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i4 = this.pos;
            int i5 = i4 + 1;
            this.pos = i5;
            c4 = cArr[i4];
            if (c4 == '\n') {
                this.lineNumber++;
                this.lineStart = i5;
                return;
            }
        } while (c4 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        checkLenient();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void skipUnquotedValue() {
        do {
            int i4 = 0;
            while (true) {
                int i5 = this.pos;
                if (i5 + i4 < this.limit) {
                    char c4 = this.buffer[i5 + i4];
                    if (c4 != '\t' && c4 != '\n' && c4 != '\f' && c4 != '\r' && c4 != ' ') {
                        if (c4 != '#') {
                            if (c4 != ',') {
                                if (c4 != '/' && c4 != '=') {
                                    if (c4 != '{' && c4 != '}' && c4 != ':') {
                                        if (c4 != ';') {
                                            switch (c4) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i4++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.pos = i5 + i4;
                }
            }
            this.pos += i4;
            return;
        } while (fillBuffer(1));
    }

    private IOException syntaxError(String str) {
        throw new MalformedJsonException(str + locationString());
    }

    public void beginArray() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
    }

    public void beginObject() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 1) {
            push(3);
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    int doPeek() {
        int nextNonWhitespace;
        int[] iArr = this.stack;
        int i4 = this.stackSize;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int nextNonWhitespace2 = nextNonWhitespace(true);
            if (nextNonWhitespace2 != 44) {
                if (nextNonWhitespace2 != 59) {
                    if (nextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i4 - 1] = 4;
                if (i5 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (nextNonWhitespace != 59) {
                        if (nextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 == 125) {
                    if (i5 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) nextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i5 == 4) {
                iArr[i4 - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i6 = this.pos;
                        if (cArr[i6] == '>') {
                            this.pos = i6 + 1;
                        }
                    }
                }
            } else if (i5 == 6) {
                if (this.lenient) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i5 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i5 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i5 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i5 = this.stackSize;
        this.stackSize = i5 - 1;
        int[] iArr = this.pathIndices;
        int i6 = i5 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.peeked = 0;
    }

    public void endObject() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i5 = this.stackSize;
        int i6 = i5 - 1;
        this.stackSize = i6;
        this.pathNames[i6] = null;
        int[] iArr = this.pathIndices;
        int i7 = i5 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.peeked = 0;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i4 = this.stackSize;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.stack[i5];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(this.pathIndices[i5]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.pathNames[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean hasNext() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        return (i4 == 2 || i4 == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    String locationString() {
        return " at line " + (this.lineNumber + 1) + " column " + ((this.pos - this.lineStart) + 1) + " path " + getPath();
    }

    public boolean nextBoolean() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i4 == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
    }

    public double nextDouble() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.peekedLong;
        }
        if (i4 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i4 == 8 || i4 == 9) {
            this.peekedString = nextQuotedValue(i4 == 8 ? '\'' : '\"');
        } else if (i4 == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i4 != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + locationString());
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i6 = this.stackSize - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return parseDouble;
    }

    public int nextInt() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 15) {
            long j4 = this.peekedLong;
            int i5 = (int) j4;
            if (j4 == i5) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i6 = this.stackSize - 1;
                iArr[i6] = iArr[i6] + 1;
                return i5;
            }
            throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
        }
        if (i4 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i4 != 8 && i4 != 9 && i4 != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (i4 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i4 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i7 = this.stackSize - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        int i8 = (int) parseDouble;
        if (i8 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i9 = this.stackSize - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return i8;
    }

    public long nextLong() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.peekedLong;
        }
        if (i4 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i4 != 8 && i4 != 9 && i4 != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (i4 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i4 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i6 = this.stackSize - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        long j4 = (long) parseDouble;
        if (j4 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i7 = this.stackSize - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return j4;
    }

    public String nextName() {
        String nextQuotedValue;
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 14) {
            nextQuotedValue = nextUnquotedValue();
        } else if (i4 == 12) {
            nextQuotedValue = nextQuotedValue('\'');
        } else {
            if (i4 != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + locationString());
            }
            nextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public void nextNull() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + locationString());
    }

    public String nextString() {
        String str;
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 10) {
            str = nextUnquotedValue();
        } else if (i4 == 8) {
            str = nextQuotedValue('\'');
        } else if (i4 == 9) {
            str = nextQuotedValue('\"');
        } else if (i4 == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i4 == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (i4 != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + locationString());
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i5 = this.stackSize - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    public JsonToken peek() {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        switch (i4) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z4) {
        this.lenient = z4;
    }

    public void skipValue() {
        int i4 = 0;
        do {
            int i5 = this.peeked;
            if (i5 == 0) {
                i5 = doPeek();
            }
            if (i5 == 3) {
                push(1);
            } else if (i5 == 1) {
                push(3);
            } else {
                if (i5 == 4) {
                    this.stackSize--;
                } else if (i5 == 2) {
                    this.stackSize--;
                } else {
                    if (i5 == 14 || i5 == 10) {
                        skipUnquotedValue();
                    } else if (i5 == 8 || i5 == 12) {
                        skipQuotedValue('\'');
                    } else if (i5 == 9 || i5 == 13) {
                        skipQuotedValue('\"');
                    } else if (i5 == 16) {
                        this.pos += this.peekedNumberLength;
                    }
                    this.peeked = 0;
                }
                i4--;
                this.peeked = 0;
            }
            i4++;
            this.peeked = 0;
        } while (i4 != 0);
        int[] iArr = this.pathIndices;
        int i6 = this.stackSize;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.pathNames[i6 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }
}
