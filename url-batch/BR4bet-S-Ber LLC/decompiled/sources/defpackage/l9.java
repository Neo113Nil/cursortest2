package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class l9 implements Serializable, Comparable {
    public static final l9 i = new l9(new byte[0]);
    public final byte[] f;
    public transient int g;
    public transient String h;

    public l9(byte[] bArr) {
        bArr.getClass();
        this.f = bArr;
    }

    public int a() {
        return this.f.length;
    }

    public String b() {
        byte[] bArr = this.f;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = b9.a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l9 l9Var = (l9) obj;
        l9Var.getClass();
        int a = a();
        int a2 = l9Var.a();
        int min = Math.min(a, a2);
        for (int i2 = 0; i2 < min; i2++) {
            int d = d(i2) & 255;
            int d2 = l9Var.d(i2) & 255;
            if (d != d2) {
                return d < d2 ? -1 : 1;
            }
        }
        if (a == a2) {
            return 0;
        }
        return a < a2 ? -1 : 1;
    }

    public byte d(int i2) {
        return this.f[i2];
    }

    public boolean e(int i2, byte[] bArr, int i3, int i4) {
        bArr.getClass();
        if (i2 >= 0) {
            byte[] bArr2 = this.f;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr2[i5 + i2] == bArr[i5 + i3]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l9) {
            l9 l9Var = (l9) obj;
            int a = l9Var.a();
            byte[] bArr = this.f;
            if (a == bArr.length && l9Var.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(l9 l9Var, int i2) {
        l9Var.getClass();
        return l9Var.e(0, this.f, 0, i2);
    }

    public l9 g() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b2 = copyOf[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i3] = (byte) (b2 + 32);
                    }
                }
                return new l9(copyOf);
            }
            i2++;
        }
    }

    public final String h() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        byte[] c = c();
        c.getClass();
        String str2 = new String(c, la.a);
        this.h = str2;
        return str2;
    }

    public int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f);
        this.g = hashCode;
        return hashCode;
    }

    public void i(h9 h9Var, int i2) {
        h9Var.u(this.f, i2);
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
        int i2;
        l9 l9Var = this;
        byte[] bArr = l9Var.f;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i4 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b3 = bArr[i7];
                    if ((b3 & 192) == 128) {
                        int i8 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i8 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                break;
                            }
                            i4 += i8 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i9];
                        if ((b5 & 192) == 128) {
                            int i10 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i10 >= 2048) {
                                if (55296 > i10 || i10 >= 57344) {
                                    i2 = i5 + 1;
                                    if (i5 == 64) {
                                        break;
                                    }
                                    if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                        break;
                                    }
                                    i4 += i10 < 65536 ? 1 : 2;
                                    i3 += 3;
                                    i5 = i2;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i3 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i11];
                            if ((b8 & 192) == 128) {
                                int i12 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i12 <= 1114111) {
                                    if (55296 > i12 || i12 >= 57344) {
                                        if (i12 >= 65536) {
                                            i2 = i5 + 1;
                                            if (i5 == 64) {
                                                break;
                                            }
                                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                                break;
                                            }
                                            i4 += i12 < 65536 ? 1 : 2;
                                            i3 += 4;
                                            i5 = i2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i4 != -1) {
            String h = l9Var.h();
            String S = n70.S(n70.S(n70.S(h.substring(0, i4), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= h.length()) {
                return "[text=" + S + ']';
            }
            return "[size=" + bArr.length + " text=" + S + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + l9Var.b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 != bArr.length) {
            b9.k(64, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            copyOfRange.getClass();
            l9Var = new l9(copyOfRange);
        }
        sb.append(l9Var.b());
        sb.append("…]");
        return sb.toString();
    }
}
