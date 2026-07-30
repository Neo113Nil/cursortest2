package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ah implements Serializable, Comparable {
    public static final zg Companion = new zg();
    public static final ah dgRBjINgWbAK = new ah(new byte[0]);
    public transient int OPXfSBeufaJ8;
    public final byte[] rtx2ld2ELZv4;
    public transient String wdg6QnbFHrFF;

    public ah(byte[] bArr) {
        bArr.getClass();
        this.rtx2ld2ELZv4 = bArr;
    }

    public String OPXfSBeufaJ8(Charset charset) {
        charset.getClass();
        return new String(this.rtx2ld2ELZv4, charset);
    }

    public String PxuCJdSBwIXG() {
        byte[] bArr = PxuCJdSBwIXG.PxuCJdSBwIXG;
        byte[] bArr2 = this.rtx2ld2ELZv4;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, pj.PxuCJdSBwIXG);
    }

    public boolean RAsUl2FVSrh6(int i, ah ahVar) {
        ahVar.getClass();
        return ahVar.rtx2ld2ELZv4(0, this.rtx2ld2ELZv4, 0, i);
    }

    public int TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.length;
    }

    public String Y1f8riQaR6yg() {
        byte[] bArr = this.rtx2ld2ELZv4;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f2.PxuCJdSBwIXG;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte a92UlCVFR9N8(int i) {
        return this.rtx2ld2ELZv4[i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ah ahVar = (ah) obj;
        ahVar.getClass();
        int TSizfFm2Yiuu = TSizfFm2Yiuu();
        int TSizfFm2Yiuu2 = ahVar.TSizfFm2Yiuu();
        int min = Math.min(TSizfFm2Yiuu, TSizfFm2Yiuu2);
        for (int i = 0; i < min; i++) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(i) & 255;
            int a92UlCVFR9N82 = ahVar.a92UlCVFR9N8(i) & 255;
            if (a92UlCVFR9N8 != a92UlCVFR9N82) {
                return a92UlCVFR9N8 < a92UlCVFR9N82 ? -1 : 1;
            }
        }
        if (TSizfFm2Yiuu == TSizfFm2Yiuu2) {
            return 0;
        }
        return TSizfFm2Yiuu < TSizfFm2Yiuu2 ? -1 : 1;
    }

    public void cpQdD2nAriOS(yf yfVar, int i) {
        yfVar.rZjpSjn4zoMv(i, this.rtx2ld2ELZv4);
    }

    public ah dgRBjINgWbAK() {
        int i = 0;
        while (true) {
            byte[] bArr = this.rtx2ld2ELZv4;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ah(copyOf);
            }
            i++;
        }
    }

    public byte[] e9gEMXR7LXtO() {
        return this.rtx2ld2ELZv4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            int TSizfFm2Yiuu = ahVar.TSizfFm2Yiuu();
            byte[] bArr = this.rtx2ld2ELZv4;
            if (TSizfFm2Yiuu == bArr.length && ahVar.rtx2ld2ELZv4(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.OPXfSBeufaJ8;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.rtx2ld2ELZv4);
        this.OPXfSBeufaJ8 = hashCode;
        return hashCode;
    }

    public ah lS5Rgt96tfkO(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.rtx2ld2ELZv4, 0, TSizfFm2Yiuu());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new ah(digest);
    }

    public boolean rtx2ld2ELZv4(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.rtx2ld2ELZv4;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        ah ahVar = this;
        byte[] bArr = ahVar.rtx2ld2ELZv4;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String x50lh2ztY7Y5 = ahVar.x50lh2ztY7Y5();
            String bEKsvqmvPh2y = pa2.bEKsvqmvPh2y(pa2.bEKsvqmvPh2y(pa2.bEKsvqmvPh2y(x50lh2ztY7Y5.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= x50lh2ztY7Y5.length()) {
                return o0.dgRBjINgWbAK("[text=", bEKsvqmvPh2y, ']');
            }
            return "[size=" + bArr.length + " text=" + bEKsvqmvPh2y + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + ahVar.Y1f8riQaR6yg() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            u9.e9gEMXR7LXtO(o0.r3s1LDPKFs1S(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            ahVar = new ah(na.uVlwi32qvXeJ(bArr, 0, 64));
        }
        sb.append(ahVar.Y1f8riQaR6yg());
        sb.append("…]");
        return sb.toString();
    }

    public ah wdg6QnbFHrFF(int i, int i2) {
        if (i < 0) {
            u9.XL4ISE6Oc65B("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.rtx2ld2ELZv4;
        if (i2 > bArr.length) {
            u9.e9gEMXR7LXtO(o0.r3s1LDPKFs1S(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ah(na.uVlwi32qvXeJ(bArr, i, i2));
        }
        u9.XL4ISE6Oc65B("endIndex < beginIndex");
        return null;
    }

    public final String x50lh2ztY7Y5() {
        String str = this.wdg6QnbFHrFF;
        if (str != null) {
            return str;
        }
        byte[] e9gEMXR7LXtO = e9gEMXR7LXtO();
        e9gEMXR7LXtO.getClass();
        String str2 = new String(e9gEMXR7LXtO, pj.PxuCJdSBwIXG);
        this.wdg6QnbFHrFF = str2;
        return str2;
    }
}
