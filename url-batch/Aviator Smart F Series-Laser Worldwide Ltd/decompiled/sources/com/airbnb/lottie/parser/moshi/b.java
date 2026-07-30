package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import cn.hutool.core.util.g1;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import okio.ByteString;
import okio.c;
import okio.e;

/* loaded from: classes.dex */
final class b extends JsonReader {
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
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final c buffer;
    private int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;

    @Nullable
    private String peekedString;
    private final e source;
    private static final ByteString SINGLE_QUOTE_OR_SLASH = ByteString.encodeUtf8("'\\");
    private static final ByteString DOUBLE_QUOTE_OR_SLASH = ByteString.encodeUtf8("\"\\");
    private static final ByteString UNQUOTED_STRING_TERMINALS = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString LINEFEED_OR_CARRIAGE_RETURN = ByteString.encodeUtf8("\n\r");
    private static final ByteString CLOSING_BLOCK_COMMENT = ByteString.encodeUtf8(g1.WAR_URL_SEPARATOR);

    b(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        this.source = eVar;
        this.buffer = eVar.buffer();
        pushScope(6);
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() {
        int[] iArr = this.scopes;
        int i8 = this.stackSize;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            this.buffer.readByte();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace != 59) {
                    if (nextNonWhitespace != 93) {
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
                if (i9 == 5) {
                    int nextNonWhitespace2 = nextNonWhitespace(true);
                    this.buffer.readByte();
                    if (nextNonWhitespace2 != 44) {
                        if (nextNonWhitespace2 != 59) {
                            if (nextNonWhitespace2 != 125) {
                                throw syntaxError("Unterminated object");
                            }
                            this.peeked = 2;
                            return 2;
                        }
                        checkLenient();
                    }
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    this.buffer.readByte();
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 != 125) {
                    checkLenient();
                    if (!isLiteral((char) nextNonWhitespace3)) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 14;
                    return 14;
                }
                if (i9 == 5) {
                    throw syntaxError("Expected name");
                }
                this.buffer.readByte();
                this.peeked = 2;
                return 2;
            }
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.source.request(1L) && this.buffer.getByte(0L) == 62) {
                        this.buffer.readByte();
                    }
                }
            } else if (i9 == 6) {
                iArr[i8 - 1] = 7;
            } else if (i9 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 18;
                    return 18;
                }
                checkLenient();
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.buffer.readByte();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.buffer.readByte();
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.buffer.readByte();
                    this.peeked = 1;
                    return 1;
                }
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer.getByte(0L))) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i9 == 1) {
                this.buffer.readByte();
                this.peeked = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.peeked = 7;
        return 7;
    }

    private int findName(String str, JsonReader.a aVar) {
        int length = aVar.strings.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(aVar.strings[i8])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i8;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i8) {
        if (i8 == 9 || i8 == 10 || i8 == 12 || i8 == 13 || i8 == 32) {
            return false;
        }
        if (i8 != 35) {
            if (i8 == 44) {
                return false;
            }
            if (i8 != 47 && i8 != 61) {
                if (i8 == 123 || i8 == 125 || i8 == 58) {
                    return false;
                }
                if (i8 != 59) {
                    switch (i8) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.buffer.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.source.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        checkLenient();
        r3 = r6.buffer.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (skipToEndOfBlockComment() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int nextNonWhitespace(boolean z7) {
        while (true) {
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (!this.source.request(i9)) {
                    if (z7) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte b8 = this.buffer.getByte(i8);
                if (b8 != 10 && b8 != 32 && b8 != 13 && b8 != 9) {
                    break;
                }
                i8 = i9;
            }
        }
    }

    private String nextQuotedValue(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.source.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.getByte(indexOfElement) != 92) {
                if (sb == null) {
                    String readUtf8 = this.buffer.readUtf8(indexOfElement);
                    this.buffer.readByte();
                    return readUtf8;
                }
                sb.append(this.buffer.readUtf8(indexOfElement));
                this.buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.buffer.readUtf8(indexOfElement));
            this.buffer.readByte();
            sb.append(readEscapeCharacter());
        }
    }

    private String nextUnquotedValue() {
        long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        return indexOfElement != -1 ? this.buffer.readUtf8(indexOfElement) : this.buffer.readUtf8();
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i8;
        byte b8 = this.buffer.getByte(0L);
        if (b8 == 116 || b8 == 84) {
            str = "true";
            str2 = "TRUE";
            i8 = 5;
        } else if (b8 == 102 || b8 == 70) {
            str = "false";
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (b8 != 110 && b8 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        int i9 = 1;
        while (i9 < length) {
            int i10 = i9 + 1;
            if (!this.source.request(i10)) {
                return 0;
            }
            byte b9 = this.buffer.getByte(i9);
            if (b9 != str.charAt(i9) && b9 != str2.charAt(i9)) {
                return 0;
            }
            i9 = i10;
        }
        if (this.source.request(length + 1) && isLiteral(this.buffer.getByte(length))) {
            return 0;
        }
        this.buffer.skip(length);
        this.peeked = i8;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (isLiteral(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.peekedLong = r8;
        r16.buffer.skip(r5);
        r16.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.peekedNumberLength = r5;
        r16.peeked = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() {
        boolean z7 = true;
        long j8 = 0;
        int i8 = 0;
        char c8 = 0;
        boolean z8 = true;
        boolean z9 = false;
        while (true) {
            int i9 = i8 + 1;
            if (!this.source.request(i9)) {
                break;
            }
            byte b8 = this.buffer.getByte(i8);
            if (b8 != 43) {
                if (b8 == 69 || b8 == 101) {
                    if (c8 != 2 && c8 != 4) {
                        return 0;
                    }
                    c8 = 5;
                } else if (b8 != 45) {
                    if (b8 != 46) {
                        if (b8 < 48 || b8 > 57) {
                            break;
                        }
                        if (c8 == z7 || c8 == 0) {
                            j8 = -(b8 - 48);
                            c8 = 2;
                        } else if (c8 == 2) {
                            if (j8 == 0) {
                                return 0;
                            }
                            long j9 = (10 * j8) - (b8 - 48);
                            z8 &= j8 > -922337203685477580L || (j8 == -922337203685477580L && j9 < j8);
                            j8 = j9;
                        } else if (c8 == 3) {
                            c8 = 4;
                        } else if (c8 == 5 || c8 == 6) {
                            c8 = 7;
                        }
                    } else {
                        if (c8 != 2) {
                            return 0;
                        }
                        c8 = 3;
                    }
                } else if (c8 == 0) {
                    c8 = 1;
                    z9 = true;
                } else if (c8 != 5) {
                    return 0;
                }
                i8 = i9;
                z7 = true;
            } else if (c8 != 5) {
                return 0;
            }
            c8 = 6;
            i8 = i9;
            z7 = true;
        }
    }

    private char readEscapeCharacter() {
        int i8;
        if (!this.source.request(1L)) {
            throw syntaxError("Unterminated escape sequence");
        }
        byte readByte = this.buffer.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.lenient) {
                return (char) readByte;
            }
            throw syntaxError("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.source.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            byte b8 = this.buffer.getByte(i9);
            char c9 = (char) (c8 << 4);
            if (b8 >= 48 && b8 <= 57) {
                i8 = b8 - 48;
            } else if (b8 >= 97 && b8 <= 102) {
                i8 = b8 - 87;
            } else {
                if (b8 < 65 || b8 > 70) {
                    throw syntaxError("\\u" + this.buffer.readUtf8(4L));
                }
                i8 = b8 - 55;
            }
            c8 = (char) (c9 + i8);
        }
        this.buffer.skip(4L);
        return c8;
    }

    private void skipQuotedValue(ByteString byteString) {
        while (true) {
            long indexOfElement = this.source.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.getByte(indexOfElement) != 92) {
                this.buffer.skip(indexOfElement + 1);
                return;
            } else {
                this.buffer.skip(indexOfElement + 1);
                readEscapeCharacter();
            }
        }
    }

    private boolean skipToEndOfBlockComment() {
        long indexOf = this.source.indexOf(CLOSING_BLOCK_COMMENT);
        boolean z7 = indexOf != -1;
        c cVar = this.buffer;
        cVar.skip(z7 ? indexOf + r1.size() : cVar.size());
        return z7;
    }

    private void skipToEndOfLine() {
        long indexOfElement = this.source.indexOfElement(LINEFEED_OR_CARRIAGE_RETURN);
        c cVar = this.buffer;
        cVar.skip(indexOfElement != -1 ? indexOfElement + 1 : cVar.size());
    }

    private void skipUnquotedValue() {
        long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        c cVar = this.buffer;
        if (indexOfElement == -1) {
            indexOfElement = cVar.size();
        }
        cVar.skip(indexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 1) {
            pushScope(3);
            this.peeked = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.clear();
        this.source.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i9 = this.stackSize;
        this.stackSize = i9 - 1;
        int[] iArr = this.pathIndices;
        int i10 = i9 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.peeked = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
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

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        return (i8 == 2 || i8 == 4 || i8 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
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
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i9 = this.stackSize - 1;
            iArr[i9] = iArr[i9] + 1;
            return this.peekedLong;
        }
        if (i8 == 17) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (i8 == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i8 == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i8 == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i8 != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (this.lenient || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 16) {
            long j8 = this.peekedLong;
            int i9 = (int) j8;
            if (j8 == i9) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (i8 == 17) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (i8 == 9 || i8 == 8) {
            String nextQuotedValue = i8 == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i8 != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i12 = (int) parseDouble;
            if (i12 == parseDouble) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i13 = this.stackSize - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return i12;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() {
        String str;
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 14) {
            str = nextUnquotedValue();
        } else if (i8 == 13) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i8 == 12) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else {
            if (i8 != 15) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            str = this.peekedString;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() {
        String readUtf8;
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 10) {
            readUtf8 = nextUnquotedValue();
        } else if (i8 == 9) {
            readUtf8 = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i8 == 8) {
            readUtf8 = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i8 == 11) {
            readUtf8 = this.peekedString;
            this.peekedString = null;
        } else if (i8 == 16) {
            readUtf8 = Long.toString(this.peekedLong);
        } else {
            if (i8 != 17) {
                throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
            }
            readUtf8 = this.buffer.readUtf8(this.peekedNumberLength);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i9 = this.stackSize - 1;
        iArr[i9] = iArr[i9] + 1;
        return readUtf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        switch (i8) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.a aVar) {
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 < 12 || i8 > 15) {
            return -1;
        }
        if (i8 == 15) {
            return findName(this.peekedString, aVar);
        }
        int select = this.source.select(aVar.doubleQuoteSuffix);
        if (select != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = aVar.strings[select];
            return select;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, aVar);
        if (findName == -1) {
            this.peeked = 15;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i8 = this.peeked;
        if (i8 == 0) {
            i8 = doPeek();
        }
        if (i8 == 14) {
            skipUnquotedValue();
        } else if (i8 == 13) {
            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i8 == 12) {
            skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i8 != 15) {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i8 = 0;
        do {
            int i9 = this.peeked;
            if (i9 == 0) {
                i9 = doPeek();
            }
            if (i9 == 3) {
                pushScope(1);
            } else if (i9 == 1) {
                pushScope(3);
            } else {
                if (i9 == 4) {
                    i8--;
                    if (i8 < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (i9 == 2) {
                    i8--;
                    if (i8 < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (i9 == 14 || i9 == 10) {
                    skipUnquotedValue();
                } else if (i9 == 9 || i9 == 13) {
                    skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                } else if (i9 == 8 || i9 == 12) {
                    skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                } else if (i9 == 17) {
                    this.buffer.skip(this.peekedNumberLength);
                } else if (i9 == 18) {
                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.peeked = 0;
            }
            i8++;
            this.peeked = 0;
        } while (i8 != 0);
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.pathNames[i10 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.source + ")";
    }
}
