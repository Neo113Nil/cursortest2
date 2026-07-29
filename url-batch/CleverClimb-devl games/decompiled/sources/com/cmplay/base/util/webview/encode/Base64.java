package com.cmplay.base.util.webview.encode;

import com.cmplay.policy.gdpr.DimenUtils;
import com.umeng.commonsdk.proguard.ao;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class Base64 {
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static char[] base64EncodeChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static byte[] base64DecodeChars = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ao.k, ao.l, ao.m, ao.n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte[] bArr, int i, int i2, boolean z);

        Coder() {
        }
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        Decoder decoder = new Decoder(i3, new byte[(i2 * 3) / 4]);
        if (!decoder.process(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (decoder.op == decoder.output.length) {
            return decoder.output;
        }
        byte[] bArr2 = new byte[decoder.op];
        System.arraycopy(decoder.output, 0, bArr2, 0, decoder.op);
        return bArr2;
    }

    static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.cmplay.base.util.webview.encode.Base64.Coder
        public int maxOutputSize(int i) {
            return ((i * 3) / 4) + 10;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
        @Override // com.cmplay.base.util.webview.encode.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            if (this.state == 6) {
                return false;
            }
            int i3 = i2 + i;
            int i4 = this.state;
            int i5 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i6 = i5;
            int i7 = 0;
            while (i < i3) {
                if (i4 == 0) {
                    while (true) {
                        int i8 = i + 4;
                        if (i8 <= i3 && (i6 = (iArr[bArr[i] & 255] << 18) | (iArr[bArr[i + 1] & 255] << 12) | (iArr[bArr[i + 2] & 255] << 6) | iArr[bArr[i + 3] & 255]) >= 0) {
                            bArr2[i7 + 2] = (byte) i6;
                            bArr2[i7 + 1] = (byte) (i6 >> 8);
                            bArr2[i7] = (byte) (i6 >> 16);
                            i7 += 3;
                            i = i8;
                        }
                    }
                    if (i >= i3) {
                        if (z) {
                            this.state = i4;
                            this.value = i6;
                            this.op = i7;
                            return true;
                        }
                        switch (i4) {
                            case 1:
                                this.state = 6;
                                return false;
                            case 2:
                                bArr2[i7] = (byte) (i6 >> 4);
                                i7++;
                                break;
                            case 3:
                                int i9 = i7 + 1;
                                bArr2[i7] = (byte) (i6 >> 10);
                                i7 = i9 + 1;
                                bArr2[i9] = (byte) (i6 >> 2);
                                break;
                            case 4:
                                this.state = 6;
                                return false;
                        }
                        this.state = i4;
                        this.op = i7;
                        return true;
                    }
                }
                int i10 = i + 1;
                int i11 = iArr[bArr[i] & 255];
                switch (i4) {
                    case 0:
                        if (i11 >= 0) {
                            i4++;
                            break;
                        } else {
                            if (i11 != -1) {
                                this.state = 6;
                                return false;
                            }
                            i = i10;
                        }
                    case 1:
                        if (i11 >= 0) {
                            i11 |= i6 << 6;
                            i4++;
                            break;
                        } else {
                            if (i11 != -1) {
                                this.state = 6;
                                return false;
                            }
                            i = i10;
                        }
                    case 2:
                        if (i11 >= 0) {
                            i11 |= i6 << 6;
                            i4++;
                            break;
                        } else {
                            if (i11 == -2) {
                                bArr2[i7] = (byte) (i6 >> 4);
                                i7++;
                                i4 = 4;
                            } else if (i11 != -1) {
                                this.state = 6;
                                return false;
                            }
                            i = i10;
                        }
                    case 3:
                        if (i11 >= 0) {
                            int i12 = i11 | (i6 << 6);
                            bArr2[i7 + 2] = (byte) i12;
                            bArr2[i7 + 1] = (byte) (i12 >> 8);
                            bArr2[i7] = (byte) (i12 >> 16);
                            i7 += 3;
                            i6 = i12;
                            i4 = 0;
                            continue;
                        } else if (i11 == -2) {
                            bArr2[i7 + 1] = (byte) (i6 >> 2);
                            bArr2[i7] = (byte) (i6 >> 10);
                            i7 += 2;
                            i4 = 5;
                        } else if (i11 != -1) {
                            this.state = 6;
                            return false;
                        }
                        i = i10;
                    case 4:
                        if (i11 == -2) {
                            i4++;
                            continue;
                        } else if (i11 != -1) {
                            this.state = 6;
                            return false;
                        }
                        i = i10;
                    case 5:
                        if (i11 != -1) {
                            this.state = 6;
                            return false;
                        }
                        continue;
                        i = i10;
                    default:
                        i = i10;
                }
                i6 = i11;
                i = i10;
            }
            if (z) {
            }
        }
    }

    static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i & 1) == 0;
            this.do_newline = (i & 2) == 0;
            this.do_cr = (i & 4) != 0;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = this.do_newline ? 19 : -1;
        }

        @Override // com.cmplay.base.util.webview.encode.Base64.Coder
        public int maxOutputSize(int i) {
            return ((i * 8) / 5) + 10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.cmplay.base.util.webview.encode.Base64.Coder
        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z2;
            int i7;
            byte b2;
            byte b3;
            int i8;
            int i9;
            byte b4;
            int i10;
            int i11;
            int i12;
            byte[] bArr2 = this.alphabet;
            byte[] bArr3 = this.output;
            int i13 = this.count;
            int i14 = i2 + i;
            int i15 = 0;
            switch (this.tailLen) {
                case 0:
                default:
                    i3 = i;
                    i4 = -1;
                    break;
                case 1:
                    if (i + 2 <= i14) {
                        int i16 = i + 1;
                        i3 = i16 + 1;
                        i4 = ((bArr[i] & 255) << 8) | ((this.tail[0] & 255) << 16) | (bArr[i16] & 255);
                        this.tailLen = 0;
                        break;
                    }
                    i3 = i;
                    i4 = -1;
                    break;
                case 2:
                    i3 = i + 1;
                    if (i3 <= i14) {
                        i4 = (bArr[i] & 255) | ((this.tail[0] & 255) << 16) | ((this.tail[1] & 255) << 8);
                        this.tailLen = 0;
                        break;
                    }
                    i3 = i;
                    i4 = -1;
                    break;
            }
            if (i4 != -1) {
                bArr3[0] = bArr2[(i4 >> 18) & 63];
                bArr3[1] = bArr2[(i4 >> 12) & 63];
                bArr3[2] = bArr2[(i4 >> 6) & 63];
                bArr3[3] = bArr2[i4 & 63];
                int i17 = i13 - 1;
                if (i17 == 0) {
                    if (this.do_cr) {
                        i12 = 5;
                        bArr3[4] = ao.k;
                    } else {
                        i12 = 4;
                    }
                    i6 = i12 + 1;
                    bArr3[i12] = 10;
                    i5 = 19;
                } else {
                    i5 = i17;
                    i6 = 4;
                }
            } else {
                i5 = i13;
                i6 = 0;
            }
            while (true) {
                int i18 = i3 + 3;
                if (i18 <= i14) {
                    int i19 = (bArr[i3 + 2] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16);
                    bArr3[i6] = bArr2[(i19 >> 18) & 63];
                    bArr3[i6 + 1] = bArr2[(i19 >> 12) & 63];
                    bArr3[i6 + 2] = bArr2[(i19 >> 6) & 63];
                    bArr3[i6 + 3] = bArr2[i19 & 63];
                    i6 += 4;
                    i5--;
                    if (i5 == 0) {
                        if (this.do_cr) {
                            i11 = i6 + 1;
                            bArr3[i6] = ao.k;
                        } else {
                            i11 = i6;
                        }
                        i6 = i11 + 1;
                        bArr3[i11] = 10;
                        i3 = i18;
                        i5 = 19;
                    } else {
                        i3 = i18;
                    }
                } else {
                    if (z) {
                        if (i3 - this.tailLen == i14 - 1) {
                            if (this.tailLen > 0) {
                                b4 = this.tail[0];
                                i15 = 1;
                            } else {
                                b4 = bArr[i3];
                            }
                            int i20 = (b4 & 255) << 4;
                            this.tailLen -= i15;
                            int i21 = i6 + 1;
                            bArr3[i6] = bArr2[(i20 >> 6) & 63];
                            i6 = i21 + 1;
                            bArr3[i21] = bArr2[i20 & 63];
                            if (this.do_padding) {
                                int i22 = i6 + 1;
                                bArr3[i6] = 61;
                                i6 = i22 + 1;
                                bArr3[i22] = 61;
                            }
                            if (this.do_newline) {
                                if (this.do_cr) {
                                    i10 = i6 + 1;
                                    bArr3[i6] = ao.k;
                                } else {
                                    i10 = i6;
                                }
                                i6 = i10 + 1;
                                bArr3[i10] = 10;
                            }
                        } else if (i3 - this.tailLen == i14 - 2) {
                            if (this.tailLen > 1) {
                                b2 = this.tail[0];
                                i15 = 1;
                            } else {
                                int i23 = i3 + 1;
                                byte b5 = bArr[i3];
                                i3 = i23;
                                b2 = b5;
                            }
                            int i24 = (b2 & 255) << 10;
                            if (this.tailLen > 0) {
                                i8 = i15 + 1;
                                b3 = this.tail[i15];
                            } else {
                                b3 = bArr[i3];
                                i8 = i15;
                            }
                            int i25 = ((b3 & 255) << 2) | i24;
                            this.tailLen -= i8;
                            int i26 = i6 + 1;
                            bArr3[i6] = bArr2[(i25 >> 12) & 63];
                            int i27 = i26 + 1;
                            bArr3[i26] = bArr2[(i25 >> 6) & 63];
                            int i28 = i27 + 1;
                            bArr3[i27] = bArr2[i25 & 63];
                            if (this.do_padding) {
                                i9 = i28 + 1;
                                bArr3[i28] = 61;
                            } else {
                                i9 = i28;
                            }
                            if (this.do_newline) {
                                if (this.do_cr) {
                                    bArr3[i9] = ao.k;
                                    i9++;
                                }
                                bArr3[i9] = 10;
                                i9++;
                            }
                            i6 = i9;
                        } else if (this.do_newline && i6 > 0 && i5 != 19) {
                            if (this.do_cr) {
                                i7 = i6 + 1;
                                bArr3[i6] = ao.k;
                            } else {
                                i7 = i6;
                            }
                            bArr3[i7] = 10;
                            i6 = i7 + 1;
                        }
                    } else if (i3 == i14 - 1) {
                        byte[] bArr4 = this.tail;
                        int i29 = this.tailLen;
                        this.tailLen = i29 + 1;
                        bArr4[i29] = bArr[i3];
                    } else if (i3 == i14 - 2) {
                        byte[] bArr5 = this.tail;
                        int i30 = this.tailLen;
                        this.tailLen = i30 + 1;
                        bArr5[i30] = bArr[i3];
                        byte[] bArr6 = this.tail;
                        int i31 = this.tailLen;
                        this.tailLen = i31 + 1;
                        z2 = true;
                        bArr6[i31] = bArr[i3 + 1];
                        this.op = i6;
                        this.count = i5;
                        return z2;
                    }
                    z2 = true;
                    this.op = i6;
                    this.count = i5;
                    return z2;
                }
            }
        }
    }

    private Base64() {
    }

    public static String encode(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(base64EncodeChars[i3 >>> 2]);
                stringBuffer.append(base64EncodeChars[(i3 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            if (i4 == length) {
                stringBuffer.append(base64EncodeChars[i3 >>> 2]);
                stringBuffer.append(base64EncodeChars[((i3 & 3) << 4) | ((i5 & DimenUtils.DENSITY_HIGH) >>> 4)]);
                stringBuffer.append(base64EncodeChars[(i5 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] & 255;
            stringBuffer.append(base64EncodeChars[i3 >>> 2]);
            stringBuffer.append(base64EncodeChars[((i3 & 3) << 4) | ((i5 & DimenUtils.DENSITY_HIGH) >>> 4)]);
            stringBuffer.append(base64EncodeChars[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
            stringBuffer.append(base64EncodeChars[i7 & 63]);
            i = i6;
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] decode(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3;
        byte b4;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i4 = 0;
        while (i4 < length) {
            while (true) {
                i = i4 + 1;
                b2 = base64DecodeChars[bytes[i4]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i4 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = base64DecodeChars[bytes[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (true) {
                i3 = i2 + 1;
                byte b5 = bytes[i2];
                if (b5 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = base64DecodeChars[b5];
                if (i3 >= length || b4 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & ao.m) << 4) | ((b4 & 60) >>> 2));
            while (true) {
                int i5 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b7 = base64DecodeChars[b6];
                if (i5 >= length || b7 != -1) {
                    break;
                }
                i3 = i5;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
