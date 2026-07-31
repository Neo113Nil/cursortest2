package N2;

import H2.AbstractC0080b;
import h2.AbstractC0439a;
import h2.AbstractC0454p;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: N2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0153i implements Serializable, Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0153i f2930g = new C0153i(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2931d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f2932e;

    /* renamed from: f, reason: collision with root package name */
    public transient String f2933f;

    public C0153i(byte[] bArr) {
        Z1.i.f(bArr, "data");
        this.f2931d = bArr;
    }

    public static int e(C0153i c0153i, C0153i c0153i2) {
        c0153i.getClass();
        Z1.i.f(c0153i2, "other");
        return c0153i.d(0, c0153i2.f2931d);
    }

    public static int i(C0153i c0153i, C0153i c0153i2) {
        c0153i.getClass();
        Z1.i.f(c0153i2, "other");
        return c0153i.h(-1234567890, c0153i2.f2931d);
    }

    public static /* synthetic */ C0153i m(C0153i c0153i, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return c0153i.l(i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(C0153i c0153i) {
        Z1.i.f(c0153i, "other");
        int b2 = b();
        int b3 = c0153i.b();
        int min = Math.min(b2, b3);
        for (int i3 = 0; i3 < min; i3++) {
            int g3 = g(i3) & 255;
            int g4 = c0153i.g(i3) & 255;
            if (g3 == g4) {
            }
        }
        if (b2 == b3) {
            return 0;
        }
    }

    public int b() {
        return this.f2931d.length;
    }

    public String c() {
        byte[] bArr = this.f2931d;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b2 : bArr) {
            int i4 = i3 + 1;
            char[] cArr2 = O2.b.f2991a;
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public int d(int i3, byte[] bArr) {
        Z1.i.f(bArr, "other");
        byte[] bArr2 = this.f2931d;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i3, 0);
        if (max <= length) {
            while (!I2.d.m(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0153i) {
            C0153i c0153i = (C0153i) obj;
            int b2 = c0153i.b();
            byte[] bArr = this.f2931d;
            if (b2 == bArr.length && c0153i.k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f2931d;
    }

    public byte g(int i3) {
        return this.f2931d[i3];
    }

    public int h(int i3, byte[] bArr) {
        Z1.i.f(bArr, "other");
        if (i3 == -1234567890) {
            i3 = b();
        }
        byte[] bArr2 = this.f2931d;
        for (int min = Math.min(i3, bArr2.length - bArr.length); -1 < min; min--) {
            if (I2.d.m(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i3 = this.f2932e;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Arrays.hashCode(this.f2931d);
        this.f2932e = hashCode;
        return hashCode;
    }

    public boolean j(int i3, C0153i c0153i, int i4) {
        Z1.i.f(c0153i, "other");
        return c0153i.k(0, this.f2931d, i3, i4);
    }

    public boolean k(int i3, byte[] bArr, int i4, int i5) {
        Z1.i.f(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f2931d;
            if (i3 <= bArr2.length - i5 && i4 >= 0 && i4 <= bArr.length - i5 && I2.d.m(i3, i4, i5, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public C0153i l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f2931d;
        if (i4 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0080b.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i4 - i3 >= 0) {
            return (i3 == 0 && i4 == bArr.length) ? this : new C0153i(M1.k.a0(bArr, i3, i4));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0153i n() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f2931d;
            if (i3 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i3];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Z1.i.e(copyOf, "copyOf(this, size)");
                copyOf[i3] = (byte) (b2 + 32);
                for (int i4 = i3 + 1; i4 < copyOf.length; i4++) {
                    byte b3 = copyOf[i4];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i4] = (byte) (b3 + 32);
                    }
                }
                return new C0153i(copyOf);
            }
            i3++;
        }
    }

    public final String o() {
        String str = this.f2933f;
        if (str != null) {
            return str;
        }
        byte[] f3 = f();
        Z1.i.f(f3, "<this>");
        String str2 = new String(f3, AbstractC0439a.f5056a);
        this.f2933f = str2;
        return str2;
    }

    public void p(C0150f c0150f, int i3) {
        Z1.i.f(c0150f, "buffer");
        c0150f.O(this.f2931d, 0, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b2;
        int i3;
        byte[] bArr = this.f2931d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                int i7 = i6 + 1;
                if (i6 == 64) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                    break;
                }
                i5 += b3 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i6 = i7;
                    if (i4 < length && (b2 = bArr[i4]) >= 0) {
                        i4++;
                        i7 = i6 + 1;
                        if (i6 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i5 += b2 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i8 = i4 + 1;
                if (length > i8) {
                    byte b4 = bArr[i8];
                    if ((b4 & 192) == 128) {
                        int i9 = (b4 ^ 3968) ^ (b3 << 6);
                        if (i9 >= 128) {
                            i3 = i6 + 1;
                            if (i6 == 64) {
                                break;
                            }
                            if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                break;
                            }
                            i5 += i9 < 65536 ? 1 : 2;
                            i4 += 2;
                            i6 = i3;
                        }
                    }
                }
            } else if ((b3 >> 4) == -2) {
                int i10 = i4 + 2;
                if (length > i10) {
                    byte b5 = bArr[i4 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i10];
                        if ((b6 & 192) == 128) {
                            int i11 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b3 << 12);
                            if (i11 >= 2048) {
                                if (55296 > i11 || i11 >= 57344) {
                                    i3 = i6 + 1;
                                    if (i6 == 64) {
                                        break;
                                    }
                                    if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                        break;
                                    }
                                    i5 += i11 < 65536 ? 1 : 2;
                                    i4 += 3;
                                    i6 = i3;
                                }
                            }
                        }
                    }
                }
            } else if ((b3 >> 3) == -2) {
                int i12 = i4 + 3;
                if (length > i12) {
                    byte b7 = bArr[i4 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i4 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i12];
                            if ((b9 & 192) == 128) {
                                int i13 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b3 << 18);
                                if (i13 <= 1114111) {
                                    if (55296 > i13 || i13 >= 57344) {
                                        if (i13 >= 65536) {
                                            i3 = i6 + 1;
                                            if (i6 == 64) {
                                                break;
                                            }
                                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                                break;
                                            }
                                            i5 += i13 < 65536 ? 1 : 2;
                                            i4 += 4;
                                            i6 = i3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + c() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(AbstractC0080b.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C0153i(M1.k.a0(bArr, 0, 64))).c());
            sb.append("…]");
            return sb.toString();
        }
        String o3 = o();
        String substring = o3.substring(0, i5);
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String g02 = AbstractC0454p.g0(AbstractC0454p.g0(AbstractC0454p.g0(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i5 >= o3.length()) {
            return "[text=" + g02 + ']';
        }
        return "[size=" + bArr.length + " text=" + g02 + "…]";
    }
}
