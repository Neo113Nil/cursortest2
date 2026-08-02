package com.squareup.moshi;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSource;

/* loaded from: classes.dex */
public final class JsonUtf8Reader extends JsonReader {
    public static final ByteString CLOSING_BLOCK_COMMENT;
    public static final ByteString DOUBLE_QUOTE_OR_SLASH;
    public static final ByteString LINEFEED_OR_CARRIAGE_RETURN;
    public static final ByteString SINGLE_QUOTE_OR_SLASH;
    public static final ByteString UNQUOTED_STRING_TERMINALS;
    public final Buffer buffer;
    public int peeked;
    public long peekedLong;
    public int peekedNumberLength;
    public String peekedString;
    public final BufferedSource source;
    public JsonValueSource valueSource;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SINGLE_QUOTE_OR_SLASH = ByteString.Companion.encodeUtf8("'\\");
        DOUBLE_QUOTE_OR_SLASH = ByteString.Companion.encodeUtf8("\"\\");
        UNQUOTED_STRING_TERMINALS = ByteString.Companion.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
        LINEFEED_OR_CARRIAGE_RETURN = ByteString.Companion.encodeUtf8("\n\r");
        CLOSING_BLOCK_COMMENT = ByteString.Companion.encodeUtf8("*/");
    }

    public JsonUtf8Reader(JsonUtf8Reader jsonUtf8Reader) {
        super(jsonUtf8Reader);
        this.peeked = 0;
        RealBufferedSource peek = jsonUtf8Reader.source.peek();
        this.source = peek;
        this.buffer = peek.bufferField;
        this.peeked = jsonUtf8Reader.peeked;
        this.peekedLong = jsonUtf8Reader.peekedLong;
        this.peekedNumberLength = jsonUtf8Reader.peekedNumberLength;
        this.peekedString = jsonUtf8Reader.peekedString;
        try {
            peek.require(jsonUtf8Reader.buffer.size);
        } catch (IOException unused) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            throw null;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            pushScope(3);
            this.peeked = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
        }
    }

    public final void checkLenient() {
        if (this.lenient) {
            return;
        }
        syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.clear();
        this.source.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e6, code lost:
    
        if (r4 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        if (r4 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
    
        if (r4 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ee, code lost:
    
        r24.peekedNumberLength = r1;
        r10 = 17;
        r24.peeked = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c3, code lost:
    
        if (isLiteral(r14) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c5, code lost:
    
        if (r4 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c7, code lost:
    
        if (r5 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cd, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cf, code lost:
    
        if (r2 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r8 != r16) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        if (r2 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d7, code lost:
    
        if (r2 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01da, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01db, code lost:
    
        r24.peekedLong = r8;
        r11.skip(r1);
        r10 = 16;
        r24.peeked = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int doPeek() {
        int i;
        String str;
        String str2;
        long j;
        int i2;
        char c;
        int i3;
        char c2;
        int[] iArr = this.scopes;
        int i4 = this.stackSize - 1;
        int i5 = iArr[i4];
        BufferedSource bufferedSource = this.source;
        long j2 = 0;
        Buffer buffer = this.buffer;
        if (i5 == 1) {
            iArr[i4] = 2;
        } else if (i5 == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            buffer.readByte();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace != 59) {
                    if (nextNonWhitespace == 93) {
                        this.peeked = 4;
                        return 4;
                    }
                    syntaxError("Unterminated array");
                    throw null;
                }
                checkLenient();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i4] = 4;
                if (i5 == 5) {
                    int nextNonWhitespace2 = nextNonWhitespace(true);
                    buffer.readByte();
                    if (nextNonWhitespace2 != 44) {
                        if (nextNonWhitespace2 != 59) {
                            if (nextNonWhitespace2 == 125) {
                                this.peeked = 2;
                                return 2;
                            }
                            syntaxError("Unterminated object");
                            throw null;
                        }
                        checkLenient();
                    }
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    buffer.readByte();
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 != 125) {
                    checkLenient();
                    if (isLiteral((char) nextNonWhitespace3)) {
                        this.peeked = 14;
                        return 14;
                    }
                    syntaxError("Expected name");
                    throw null;
                }
                if (i5 == 5) {
                    syntaxError("Expected name");
                    throw null;
                }
                buffer.readByte();
                this.peeked = 2;
                return 2;
            }
            if (i5 == 4) {
                iArr[i4] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                buffer.readByte();
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        syntaxError("Expected ':'");
                        throw null;
                    }
                    checkLenient();
                    if (bufferedSource.request(1L) && buffer.getByte(0L) == 62) {
                        buffer.readByte();
                    }
                }
            } else if (i5 == 6) {
                iArr[i4] = 7;
            } else if (i5 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 18;
                    return 18;
                }
                checkLenient();
            } else {
                if (i5 == 9) {
                    this.valueSource.discard();
                    this.valueSource = null;
                    this.stackSize--;
                    return doPeek();
                }
                if (i5 == 8) {
                    a$$ExternalSyntheticBUOutline0.m$1("JsonReader is closed");
                    return 0;
                }
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            buffer.readByte();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                buffer.readByte();
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    buffer.readByte();
                    this.peeked = 1;
                    return 1;
                }
                byte b = buffer.getByte(0L);
                if (b != 116 && b != 84) {
                    if (b != 102 && b != 70) {
                        if (b != 110 && b != 78) {
                            j = 0;
                            i2 = 0;
                            if (i2 != 0) {
                                boolean z = true;
                                long j3 = j;
                                int i6 = 0;
                                boolean z2 = false;
                                char c3 = 0;
                                while (true) {
                                    int i7 = i6 + 1;
                                    if (!bufferedSource.request(i7)) {
                                        break;
                                    }
                                    byte b2 = buffer.getByte(i6);
                                    if (b2 != 43) {
                                        if (b2 == 69 || b2 == 101) {
                                            if (c3 != 2 && c3 != 4) {
                                                break;
                                            }
                                            c3 = 5;
                                            i6 = i7;
                                        } else if (b2 == 45) {
                                            c2 = 6;
                                            if (c3 == 0) {
                                                z2 = true;
                                                c3 = 1;
                                                i6 = i7;
                                            } else {
                                                if (c3 != 5) {
                                                    break;
                                                }
                                                c3 = c2;
                                                i6 = i7;
                                            }
                                        } else if (b2 == 46) {
                                            if (c3 != 2) {
                                                break;
                                            }
                                            c3 = 3;
                                            i6 = i7;
                                        } else {
                                            if (b2 < 48 || b2 > 57) {
                                                break;
                                            }
                                            if (c3 == 1 || c3 == 0) {
                                                j3 = -(b2 - 48);
                                                c3 = 2;
                                            } else if (c3 == 2) {
                                                if (j3 == j) {
                                                    break;
                                                }
                                                long j4 = (10 * j3) - (b2 - 48);
                                                z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j3 = j4;
                                            } else if (c3 == 3) {
                                                c3 = 4;
                                            } else if (c3 == 5 || c3 == 6) {
                                                c3 = 7;
                                            }
                                            i6 = i7;
                                        }
                                        if (i3 != 0) {
                                            return i3;
                                        }
                                        if (!isLiteral(buffer.getByte(j))) {
                                            syntaxError("Expected value");
                                            throw null;
                                        }
                                        checkLenient();
                                        this.peeked = 10;
                                        return 10;
                                    }
                                    c2 = 6;
                                    if (c3 != 5) {
                                        break;
                                    }
                                    c3 = c2;
                                    i6 = i7;
                                }
                            } else {
                                return i2;
                            }
                        } else {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        }
                    } else {
                        i = 6;
                        str2 = "false";
                        str = "FALSE";
                    }
                } else {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                }
                int length = str2.length();
                int i8 = 1;
                while (true) {
                    if (i8 < length) {
                        int i9 = i8 + 1;
                        j = j2;
                        if (!bufferedSource.request(i9) || ((c = buffer.getByte(i8)) != str2.charAt(i8) && c != str.charAt(i8))) {
                            break;
                        }
                        i8 = i9;
                        j2 = j;
                    } else {
                        j = j2;
                        if (!bufferedSource.request(length + 1) || !isLiteral(buffer.getByte(length))) {
                            buffer.skip(length);
                            this.peeked = i;
                            i2 = i;
                        }
                    }
                }
                i2 = 0;
                if (i2 != 0) {
                }
            } else if (i5 == 1) {
                buffer.readByte();
                this.peeked = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            syntaxError("Unexpected value");
            throw null;
        }
        checkLenient();
        this.peeked = 7;
        return 7;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
        } else {
            int i2 = this.stackSize;
            this.stackSize = i2 - 1;
            int[] iArr = this.pathIndices;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.peeked = 0;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
            return;
        }
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.peeked = 0;
    }

    public final int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final int findString(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i2 = this.stackSize - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final boolean isLiteral(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
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

    @Override // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
            return false;
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 17) {
            long j = this.peekedNumberLength;
            Buffer buffer = this.buffer;
            buffer.getClass();
            this.peekedString = buffer.readString(j, Charsets.UTF_8);
        } else if (i == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
            return 0.0d;
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("JSON forbids NaN and infinities: ", " at path ", parseDouble);
                m.append(getPath());
                throw new JsonEncodingException(m.toString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            Path$$ExternalSyntheticBUOutline0.m("Expected a double but was ", this.peekedString, getPath());
            return 0.0d;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j == i2) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (i == 17) {
            long j2 = this.peekedNumberLength;
            Buffer buffer = this.buffer;
            buffer.getClass();
            this.peekedString = buffer.readString(j2, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String nextQuotedValue = i == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
            return 0;
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                Path$$ExternalSyntheticBUOutline0.m("Expected an int but was ", this.peekedString, getPath());
                return 0;
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            Path$$ExternalSyntheticBUOutline0.m("Expected an int but was ", this.peekedString, getPath());
            return 0;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 17) {
            long j = this.peekedNumberLength;
            Buffer buffer = this.buffer;
            buffer.getClass();
            this.peekedString = buffer.readString(j, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String nextQuotedValue = i == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                long parseLong = Long.parseLong(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
            return 0L;
        }
        this.peeked = 11;
        try {
            long longValueExact = new BigDecimal(this.peekedString).longValueExact();
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            Path$$ExternalSyntheticBUOutline0.m("Expected a long but was ", this.peekedString, getPath());
            return 0L;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextName() {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            str = nextUnquotedValue();
        } else if (i == 13) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 12) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else {
            if (i != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
                return null;
            }
            str = this.peekedString;
            this.peekedString = null;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1.skip(r3);
        r2 = com.squareup.moshi.JsonUtf8Reader.LINEFEED_OR_CARRIAGE_RETURN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 != 47) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        checkLenient();
        r5 = r5.indexOfElement(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r5 = r1.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        if (r5.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        checkLenient();
        r10 = r1.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r10 == 42) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.indexOf(com.squareup.moshi.JsonUtf8Reader.CLOSING_BLOCK_COMMENT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r5 = r5 + r2.data.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
    
        r5 = r1.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.indexOfElement(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005b, code lost:
    
        r5 = r1.size;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int nextNonWhitespace(boolean z) {
        byte b;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                BufferedSource bufferedSource = this.source;
                if (!bufferedSource.request(i2)) {
                    if (!z) {
                        return -1;
                    }
                    Path$$ExternalSyntheticBUOutline0.m$1("End of input");
                    return 0;
                }
                long j = i;
                Buffer buffer = this.buffer;
                b = buffer.getByte(j);
                if (b != 10 && b != 32 && b != 13 && b != 9) {
                    break;
                }
                i = i2;
            }
        }
        return b;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void nextNull() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
        } else {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String nextQuotedValue(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.source.indexOfElement(byteString);
            if (indexOfElement == -1) {
                syntaxError("Unterminated string");
                throw null;
            }
            Buffer buffer = this.buffer;
            if (buffer.getByte(indexOfElement) != 92) {
                if (sb == null) {
                    String readString = buffer.readString(indexOfElement, Charsets.UTF_8);
                    buffer.readByte();
                    return readString;
                }
                sb.append(buffer.readString(indexOfElement, Charsets.UTF_8));
                buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(buffer.readString(indexOfElement, Charsets.UTF_8));
            buffer.readByte();
            sb.append(readEscapeCharacter());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BufferedSource nextSource() {
        int i;
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        Buffer buffer = new Buffer();
        ByteString byteString = JsonValueSource.STATE_END_OF_JSON;
        if (i2 == 3) {
            buffer.m4339writeUtf8("[");
            byteString = JsonValueSource.STATE_JSON;
        } else {
            if (i2 != 1) {
                if (i2 == 9) {
                    buffer.m4339writeUtf8("\"");
                    byteString = JsonValueSource.STATE_DOUBLE_QUOTED;
                } else if (i2 == 8) {
                    buffer.m4339writeUtf8("'");
                    byteString = JsonValueSource.STATE_SINGLE_QUOTED;
                } else if (i2 == 17 || i2 == 16 || i2 == 10) {
                    buffer.m4339writeUtf8(nextString());
                } else if (i2 == 5) {
                    buffer.m4339writeUtf8("true");
                } else if (i2 == 6) {
                    buffer.m4339writeUtf8("false");
                } else if (i2 == 7) {
                    buffer.m4339writeUtf8("null");
                } else {
                    if (i2 != 11) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(peek());
                        Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
                        return null;
                    }
                    String nextString = nextString();
                    JsonUtf8Writer jsonUtf8Writer = new JsonUtf8Writer(buffer);
                    try {
                        jsonUtf8Writer.value(nextString);
                        jsonUtf8Writer.close();
                    } catch (Throwable th) {
                        try {
                            jsonUtf8Writer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                i = 0;
                if (this.peeked != 0) {
                    int[] iArr = this.pathIndices;
                    int i3 = this.stackSize - 1;
                    iArr[i3] = iArr[i3] + 1;
                    this.peeked = 0;
                }
                this.valueSource = new JsonValueSource(this.source, buffer, byteString, i);
                pushScope(9);
                return Okio.buffer(this.valueSource);
            }
            buffer.m4339writeUtf8("{");
            byteString = JsonValueSource.STATE_JSON;
        }
        i = 1;
        if (this.peeked != 0) {
        }
        this.valueSource = new JsonValueSource(this.source, buffer, byteString, i);
        pushScope(9);
        return Okio.buffer(this.valueSource);
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextString() {
        String readString;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            readString = nextUnquotedValue();
        } else if (i == 9) {
            readString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            readString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 11) {
            readString = this.peekedString;
            this.peekedString = null;
        } else if (i == 16) {
            readString = Long.toString(this.peekedLong);
        } else {
            if (i != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(peek());
                Path$$ExternalSyntheticBUOutline0.m(sb, " at path ", getPath());
                return null;
            }
            long j = this.peekedNumberLength;
            Buffer buffer = this.buffer;
            buffer.getClass();
            readString = buffer.readString(j, Charsets.UTF_8);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return readString;
    }

    public final String nextUnquotedValue() {
        long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        Buffer buffer = this.buffer;
        if (indexOfElement == -1) {
            return buffer.readUtf8();
        }
        buffer.getClass();
        return buffer.readString(indexOfElement, Charsets.UTF_8);
    }

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader.Token peek() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
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
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader peekJson() {
        return new JsonUtf8Reader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() {
        if (hasNext()) {
            this.peekedString = nextName();
            this.peeked = 11;
        }
    }

    public final char readEscapeCharacter() {
        int i;
        BufferedSource bufferedSource = this.source;
        if (!bufferedSource.request(1L)) {
            syntaxError("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.buffer;
        byte readByte = buffer.readByte();
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
            syntaxError("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!bufferedSource.request(4L)) {
            Path$$ExternalSyntheticBUOutline0.m$1("Unterminated escape sequence at path ".concat(getPath()));
            return (char) 0;
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte b = buffer.getByte(i2);
            char c2 = (char) (c << 4);
            if (b >= 48 && b <= 57) {
                i = b - 48;
            } else if (b >= 97 && b <= 102) {
                i = b - 87;
            } else {
                if (b < 65 || b > 70) {
                    syntaxError("\\u".concat(buffer.readString(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = b - 55;
            }
            c = (char) (i + c2);
        }
        buffer.skip(4L);
        return c;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectName(JsonReader.Options options) {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return findName(this.peekedString, options);
        }
        int select = this.source.select(options.doubleQuoteSuffix);
        if (select != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[select];
            return select;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = 15;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectString(JsonReader.Options options) {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return findString(this.peekedString, options);
        }
        int select = this.source.select(options.doubleQuoteSuffix);
        if (select != -1) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return select;
        }
        String nextString = nextString();
        int findString = findString(nextString, options);
        if (findString == -1) {
            this.peeked = 11;
            this.peekedString = nextString;
            this.pathIndices[this.stackSize - 1] = r0[r4] - 1;
        }
        return findString;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipName() {
        if (this.failOnUnknown) {
            JsonReader.Token peek = peek();
            nextName();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek);
            Path$$ExternalSyntheticBUOutline0.m(sb, " at ", getPath());
            return;
        }
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
            Buffer buffer = this.buffer;
            if (indexOfElement == -1) {
                indexOfElement = buffer.size;
            }
            buffer.skip(indexOfElement);
        } else if (i == 13) {
            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 12) {
            skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb2, " at path ", getPath());
            return;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = "null";
    }

    public final void skipQuotedValue(ByteString byteString) {
        while (true) {
            long indexOfElement = this.source.indexOfElement(byteString);
            if (indexOfElement == -1) {
                syntaxError("Unterminated string");
                throw null;
            }
            Buffer buffer = this.buffer;
            if (buffer.getByte(indexOfElement) != 92) {
                buffer.skip(indexOfElement + 1);
                return;
            } else {
                buffer.skip(indexOfElement + 1);
                readEscapeCharacter();
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() {
        if (this.failOnUnknown) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            Path$$ExternalSyntheticBUOutline0.m(sb, " at ", getPath());
            return;
        }
        int i = 0;
        do {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            if (i2 == 3) {
                pushScope(1);
            } else if (i2 == 1) {
                pushScope(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(peek());
                        Path$$ExternalSyntheticBUOutline0.m(sb2, " at path ", getPath());
                        return;
                    }
                    this.stackSize--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(peek());
                        Path$$ExternalSyntheticBUOutline0.m(sb3, " at path ", getPath());
                        return;
                    }
                    this.stackSize--;
                } else {
                    Buffer buffer = this.buffer;
                    if (i2 == 14 || i2 == 10) {
                        long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
                        if (indexOfElement == -1) {
                            indexOfElement = buffer.size;
                        }
                        buffer.skip(indexOfElement);
                    } else if (i2 == 9 || i2 == 13) {
                        skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (i2 == 8 || i2 == 12) {
                        skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else if (i2 == 17) {
                        buffer.skip(this.peekedNumberLength);
                    } else if (i2 == 18) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(peek());
                        Path$$ExternalSyntheticBUOutline0.m(sb4, " at path ", getPath());
                        return;
                    }
                }
                this.peeked = 0;
            }
            i++;
            this.peeked = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
        this.pathNames[i3] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.source + ")";
    }

    public JsonUtf8Reader(BufferedSource bufferedSource) {
        this.peeked = 0;
        if (bufferedSource != null) {
            this.source = bufferedSource;
            this.buffer = bufferedSource.getBuffer();
            pushScope(6);
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2("source == null");
        throw null;
    }
}
