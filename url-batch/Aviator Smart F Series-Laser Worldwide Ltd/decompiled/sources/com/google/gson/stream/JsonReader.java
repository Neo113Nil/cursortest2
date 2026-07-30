package com.google.gson.stream;

import cn.hutool.core.util.g1;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
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
                int i8 = jsonReader.peeked;
                if (i8 == 0) {
                    i8 = jsonReader.doPeek();
                }
                if (i8 == 13) {
                    jsonReader.peeked = 9;
                    return;
                }
                if (i8 == 12) {
                    jsonReader.peeked = 8;
                    return;
                }
                if (i8 == 14) {
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
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() {
        nextNonWhitespace(true);
        int i8 = this.pos;
        this.pos = i8 - 1;
        if (i8 + 4 <= this.limit || fillBuffer(5)) {
            int i9 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                this.pos = i9 + 5;
            }
        }
    }

    private boolean fillBuffer(int i8) {
        int i9;
        int i10;
        char[] cArr = this.buffer;
        int i11 = this.lineStart;
        int i12 = this.pos;
        this.lineStart = i11 - i12;
        int i13 = this.limit;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.limit = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i15 = this.limit;
            int read = reader.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i9 = this.limit + read;
            this.limit = i9;
            if (this.lineNumber == 0 && (i10 = this.lineStart) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i10 + 1;
                i8++;
            }
        } while (i9 < i8);
        return true;
    }

    private String getPath(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i8 = 0;
        while (true) {
            int i9 = this.stackSize;
            if (i8 >= i9) {
                return sb.toString();
            }
            int i10 = this.stack[i8];
            if (i10 == 1 || i10 == 2) {
                int i11 = this.pathIndices[i8];
                if (z7 && i11 > 0 && i8 == i9 - 1) {
                    i11--;
                }
                sb.append('[');
                sb.append(i11);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append('.');
                String str = this.pathNames[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
            i8++;
        }
    }

    private boolean isLiteral(char c8) {
        if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
            return false;
        }
        if (c8 != '#') {
            if (c8 == ',') {
                return false;
            }
            if (c8 != '/' && c8 != '=') {
                if (c8 == '{' || c8 == '}' || c8 == ':') {
                    return false;
                }
                if (c8 != ';') {
                    switch (c8) {
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

    private int nextNonWhitespace(boolean z7) {
        char[] cArr = this.buffer;
        int i8 = this.pos;
        int i9 = this.limit;
        while (true) {
            if (i8 == i9) {
                this.pos = i8;
                if (!fillBuffer(1)) {
                    if (!z7) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i8 = this.pos;
                i9 = this.limit;
            }
            int i10 = i8 + 1;
            char c8 = cArr[i8];
            if (c8 == '\n') {
                this.lineNumber++;
                this.lineStart = i10;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.pos = i10;
                    if (i10 == i9) {
                        this.pos = i8;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            return c8;
                        }
                    }
                    checkLenient();
                    int i11 = this.pos;
                    char c9 = cArr[i11];
                    if (c9 == '*') {
                        this.pos = i11 + 1;
                        if (!skipTo(g1.WAR_URL_SEPARATOR)) {
                            throw syntaxError("Unterminated comment");
                        }
                        i8 = this.pos + 2;
                        i9 = this.limit;
                    } else {
                        if (c9 != '/') {
                            return c8;
                        }
                        this.pos = i11 + 1;
                        skipToEndOfLine();
                        i8 = this.pos;
                        i9 = this.limit;
                    }
                } else {
                    if (c8 != '#') {
                        this.pos = i10;
                        return c8;
                    }
                    this.pos = i10;
                    checkLenient();
                    skipToEndOfLine();
                    i8 = this.pos;
                    i9 = this.limit;
                }
            }
            i8 = i10;
        }
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
    private String nextQuotedValue(char c8) {
        char[] cArr = this.buffer;
        StringBuilder sb = null;
        do {
            int i8 = this.pos;
            int i9 = this.limit;
            while (true) {
                int i10 = i9;
                int i11 = i8;
                while (i8 < i10) {
                    int i12 = i8 + 1;
                    char c9 = cArr[i8];
                    if (c9 == c8) {
                        this.pos = i12;
                        int i13 = (i12 - i11) - 1;
                        if (sb == null) {
                            return new String(cArr, i11, i13);
                        }
                        sb.append(cArr, i11, i13);
                        return sb.toString();
                    }
                    if (c9 == '\\') {
                        this.pos = i12;
                        int i14 = i12 - i11;
                        int i15 = i14 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i14 * 2, 16));
                        }
                        sb.append(cArr, i11, i15);
                        sb.append(readEscapeCharacter());
                        i8 = this.pos;
                        i9 = this.limit;
                    } else {
                        if (c9 == '\n') {
                            this.lineNumber++;
                            this.lineStart = i12;
                        }
                        i8 = i12;
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
        int i8 = 0;
        do {
            int i9 = 0;
            while (true) {
                int i10 = this.pos;
                if (i10 + i9 < this.limit) {
                    char c8 = this.buffer[i10 + i9];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i9++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i9 >= this.buffer.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i9, 16));
                    }
                    sb2.append(this.buffer, this.pos, i9);
                    this.pos += i9;
                } else if (fillBuffer(i9 + 1)) {
                }
            }
            i8 = i9;
            if (sb2 != null) {
                sb = new String(this.buffer, this.pos, i8);
            } else {
                sb2.append(this.buffer, this.pos, i8);
                sb = sb2.toString();
            }
            this.pos += i8;
            return sb;
        } while (fillBuffer(1));
        if (sb2 != null) {
        }
        this.pos += i8;
        return sb;
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i8;
        char c8 = this.buffer[this.pos];
        if (c8 == 't' || c8 == 'T') {
            str = "true";
            str2 = "TRUE";
            i8 = 5;
        } else if (c8 == 'f' || c8 == 'F') {
            str = "false";
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (c8 != 'n' && c8 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        for (int i9 = 1; i9 < length; i9++) {
            if (this.pos + i9 >= this.limit && !fillBuffer(i9 + 1)) {
                return 0;
            }
            char c9 = this.buffer[this.pos + i9];
            if (c9 != str.charAt(i9) && c9 != str2.charAt(i9)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i8;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        r18.peekedLong = r11;
        r18.pos += r8;
        r18.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        r18.peekedNumberLength = r8;
        r18.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0093, code lost:
    
        if (isLiteral(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() {
        char[] cArr = this.buffer;
        int i8 = this.pos;
        int i9 = this.limit;
        int i10 = 0;
        int i11 = 0;
        char c8 = 0;
        boolean z7 = true;
        long j8 = 0;
        boolean z8 = false;
        while (true) {
            if (i8 + i11 == i9) {
                if (i11 == cArr.length) {
                    return i10;
                }
                if (!fillBuffer(i11 + 1)) {
                    break;
                }
                i8 = this.pos;
                i9 = this.limit;
            }
            char c9 = cArr[i8 + i11];
            if (c9 != '+') {
                if (c9 == 'E' || c9 == 'e') {
                    i10 = 0;
                    if (c8 != 2 && c8 != 4) {
                        return 0;
                    }
                    c8 = 5;
                } else if (c9 == '-') {
                    i10 = 0;
                    if (c8 == 0) {
                        c8 = 1;
                        z8 = true;
                    } else if (c8 != 5) {
                        return 0;
                    }
                } else if (c9 == '.') {
                    i10 = 0;
                    if (c8 != 2) {
                        return 0;
                    }
                    c8 = 3;
                } else {
                    if (c9 < '0' || c9 > '9') {
                        break;
                    }
                    if (c8 == 1 || c8 == 0) {
                        j8 = -(c9 - '0');
                        i10 = 0;
                        c8 = 2;
                    } else {
                        if (c8 == 2) {
                            if (j8 == 0) {
                                return 0;
                            }
                            long j9 = (10 * j8) - (c9 - '0');
                            z7 &= j8 > -922337203685477580L || (j8 == -922337203685477580L && j9 < j8);
                            j8 = j9;
                        } else if (c8 == 3) {
                            i10 = 0;
                            c8 = 4;
                        } else if (c8 == 5 || c8 == 6) {
                            i10 = 0;
                            c8 = 7;
                        }
                        i10 = 0;
                    }
                }
                i11++;
            } else {
                i10 = 0;
                if (c8 != 5) {
                    return 0;
                }
            }
            c8 = 6;
            i11++;
        }
    }

    private void push(int i8) {
        int i9 = this.stackSize;
        int[] iArr = this.stack;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.stack = Arrays.copyOf(iArr, i10);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i10);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i10);
        }
        int[] iArr2 = this.stack;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        iArr2[i11] = i8;
    }

    private char readEscapeCharacter() {
        int i8;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i9 = this.pos;
        int i10 = i9 + 1;
        this.pos = i10;
        char c8 = cArr[i9];
        if (c8 == '\n') {
            this.lineNumber++;
            this.lineStart = i10;
        } else if (c8 != '\"' && c8 != '\'' && c8 != '/' && c8 != '\\') {
            if (c8 == 'b') {
                return '\b';
            }
            if (c8 == 'f') {
                return '\f';
            }
            if (c8 == 'n') {
                return '\n';
            }
            if (c8 == 'r') {
                return '\r';
            }
            if (c8 == 't') {
                return '\t';
            }
            if (c8 != 'u') {
                throw syntaxError("Invalid escape sequence");
            }
            if (i9 + 5 > this.limit && !fillBuffer(4)) {
                throw syntaxError("Unterminated escape sequence");
            }
            int i11 = this.pos;
            int i12 = i11 + 4;
            char c9 = 0;
            while (i11 < i12) {
                char c10 = this.buffer[i11];
                char c11 = (char) (c9 << 4);
                if (c10 >= '0' && c10 <= '9') {
                    i8 = c10 - '0';
                } else if (c10 >= 'a' && c10 <= 'f') {
                    i8 = c10 - 'W';
                } else {
                    if (c10 < 'A' || c10 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.buffer, this.pos, 4));
                    }
                    i8 = c10 - '7';
                }
                c9 = (char) (c11 + i8);
                i11++;
            }
            this.pos += 4;
            return c9;
        }
        return c8;
    }

    private void skipQuotedValue(char c8) {
        char[] cArr = this.buffer;
        do {
            int i8 = this.pos;
            int i9 = this.limit;
            while (i8 < i9) {
                int i10 = i8 + 1;
                char c9 = cArr[i8];
                if (c9 == c8) {
                    this.pos = i10;
                    return;
                }
                if (c9 == '\\') {
                    this.pos = i10;
                    readEscapeCharacter();
                    i8 = this.pos;
                    i9 = this.limit;
                } else {
                    if (c9 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i10;
                    }
                    i8 = i10;
                }
            }
            this.pos = i8;
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
            int i8 = this.pos;
            if (cArr[i8] != '\n') {
                for (int i9 = 0; i9 < length; i9++) {
                    if (this.buffer[this.pos + i9] != str.charAt(i9)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i8 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() {
        char c8;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 + 1;
            this.pos = i9;
            c8 = cArr[i8];
            if (c8 == '\n') {
                this.lineNumber++;
                this.lineStart = i9;
                return;
            }
        } while (c8 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        checkLenient();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void skipUnquotedValue() {
        do {
            int i8 = 0;
            while (true) {
                int i9 = this.pos;
                if (i9 + i8 < this.limit) {
                    char c8 = this.buffer[i9 + i8];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i8++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.pos = i9 + i8;
                }
            }
            this.pos += i8;
            return;
        } while (fillBuffer(1));
    }

    private IOException syntaxError(String str) {
        throw new MalformedJsonException(str + locationString());
    }

    public void beginArray() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
    }

    public void beginObject() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 1) {
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
        int i8 = this.stackSize;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
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
            if (i9 == 3 || i9 == 5) {
                iArr[i8 - 1] = 4;
                if (i9 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
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
                    if (i9 == 5) {
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
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i10 = this.pos;
                        if (cArr[i10] == '>') {
                            this.pos = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.lenient) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i9 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i9 == 8) {
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
            if (i9 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i9 = this.stackSize;
        this.stackSize = i9 - 1;
        int[] iArr = this.pathIndices;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.peeked = 0;
    }

    public void endObject() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i9 = this.stackSize;
        int i10 = i9 - 1;
        this.stackSize = i10;
        this.pathNames[i10] = null;
        int[] iArr = this.pathIndices;
        int i11 = i9 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.peeked = 0;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public boolean hasNext() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        return (i8 == 2 || i8 == 4 || i8 == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    String locationString() {
        return " at line " + (this.lineNumber + 1) + " column " + ((this.pos - this.lineStart) + 1) + " path " + getPath();
    }

    public boolean nextBoolean() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i9 = this.stackSize - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        }
        if (i8 == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
    }

    public double nextDouble() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i9 = this.stackSize - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.peekedLong;
        }
        if (i8 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i8 == 8 || i8 == 9) {
            this.peekedString = nextQuotedValue(i8 == 8 ? '\'' : '\"');
        } else if (i8 == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i8 != 11) {
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
        int i10 = this.stackSize - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public int nextInt() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 15) {
            long j8 = this.peekedLong;
            int i9 = (int) j8;
            if (j8 == i9) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
            throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
        }
        if (i8 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i8 != 8 && i8 != 9 && i8 != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (i8 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i8 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        int i12 = (int) parseDouble;
        if (i12 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public long nextLong() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i9 = this.stackSize - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.peekedLong;
        }
        if (i8 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i8 != 8 && i8 != 9 && i8 != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (i8 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i8 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        long j8 = (long) parseDouble;
        if (j8 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j8;
    }

    public String nextName() {
        String nextQuotedValue;
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 14) {
            nextQuotedValue = nextUnquotedValue();
        } else if (i8 == 12) {
            nextQuotedValue = nextQuotedValue('\'');
        } else {
            if (i8 != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + locationString());
            }
            nextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public void nextNull() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i9 = this.stackSize - 1;
            iArr[i9] = iArr[i9] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + locationString());
    }

    public String nextString() {
        String str;
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 10) {
            str = nextUnquotedValue();
        } else if (i8 == 8) {
            str = nextQuotedValue('\'');
        } else if (i8 == 9) {
            str = nextQuotedValue('\"');
        } else if (i8 == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i8 == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (i8 != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + locationString());
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i9 = this.stackSize - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    public JsonToken peek() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        switch (i8) {
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

    public final void setLenient(boolean z7) {
        this.lenient = z7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() {
        int i8 = 0;
        do {
            int i9 = this.peeked;
            if (i9 == 0) {
                i9 = doPeek();
            }
            switch (i9) {
                case 1:
                    push(3);
                    i8++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i8 == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i8--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i8++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i8--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i8 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i8 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i8 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i8 > 0);
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}
