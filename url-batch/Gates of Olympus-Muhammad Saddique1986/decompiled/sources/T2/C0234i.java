package T2;

import java.io.Serializable;
import java.util.Arrays;
import n2.AbstractC0721a;
import n2.AbstractC0737q;

/* renamed from: T2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0234i implements Serializable, Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0234i f4410g = new C0234i(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4411d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f4412e;

    /* renamed from: f, reason: collision with root package name */
    public transient String f4413f;

    public C0234i(byte[] bArr) {
        f2.j.f(bArr, "data");
        this.f4411d = bArr;
    }

    public static int e(C0234i c0234i, C0234i c0234i2) {
        c0234i.getClass();
        f2.j.f(c0234i2, "other");
        return c0234i.d(0, c0234i2.f4411d);
    }

    public static int i(C0234i c0234i, C0234i c0234i2) {
        c0234i.getClass();
        f2.j.f(c0234i2, "other");
        return c0234i.h(-1234567890, c0234i2.f4411d);
    }

    public static /* synthetic */ C0234i m(C0234i c0234i, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return c0234i.l(i3, i4);
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
    public final int compareTo(C0234i c0234i) {
        f2.j.f(c0234i, "other");
        int b3 = b();
        int b4 = c0234i.b();
        int min = Math.min(b3, b4);
        for (int i3 = 0; i3 < min; i3++) {
            int g3 = g(i3) & 255;
            int g4 = c0234i.g(i3) & 255;
            if (g3 == g4) {
            }
        }
        if (b3 == b4) {
            return 0;
        }
    }

    public int b() {
        return this.f4411d.length;
    }

    public String c() {
        byte[] bArr = this.f4411d;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b3 : bArr) {
            int i4 = i3 + 1;
            char[] cArr2 = U2.b.f4516a;
            cArr[i3] = cArr2[(b3 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int d(int i3, byte[] bArr) {
        f2.j.f(bArr, "other");
        byte[] bArr2 = this.f4411d;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i3, 0);
        if (max <= length) {
            while (!O2.l.O(max, 0, bArr.length, bArr2, bArr)) {
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
        if (obj instanceof C0234i) {
            C0234i c0234i = (C0234i) obj;
            int b3 = c0234i.b();
            byte[] bArr = this.f4411d;
            if (b3 == bArr.length && c0234i.k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f4411d;
    }

    public byte g(int i3) {
        return this.f4411d[i3];
    }

    public int h(int i3, byte[] bArr) {
        f2.j.f(bArr, "other");
        if (i3 == -1234567890) {
            i3 = b();
        }
        byte[] bArr2 = this.f4411d;
        for (int min = Math.min(i3, bArr2.length - bArr.length); -1 < min; min--) {
            if (O2.l.O(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i3 = this.f4412e;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Arrays.hashCode(this.f4411d);
        this.f4412e = hashCode;
        return hashCode;
    }

    public boolean j(int i3, C0234i c0234i, int i4) {
        f2.j.f(c0234i, "other");
        return c0234i.k(0, this.f4411d, i3, i4);
    }

    public boolean k(int i3, byte[] bArr, int i4, int i5) {
        f2.j.f(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f4411d;
            if (i3 <= bArr2.length - i5 && i4 >= 0 && i4 <= bArr.length - i5 && O2.l.O(i3, i4, i5, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public C0234i l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f4411d;
        if (i4 > bArr.length) {
            throw new IllegalArgumentException(A.k.j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i4 - i3 >= 0) {
            return (i3 == 0 && i4 == bArr.length) ? this : new C0234i(S1.k.p0(bArr, i3, i4));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0234i n() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f4411d;
            if (i3 >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i3];
            if (b3 >= 65 && b3 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                f2.j.e(copyOf, "copyOf(this, size)");
                copyOf[i3] = (byte) (b3 + 32);
                for (int i4 = i3 + 1; i4 < copyOf.length; i4++) {
                    byte b4 = copyOf[i4];
                    if (b4 >= 65 && b4 <= 90) {
                        copyOf[i4] = (byte) (b4 + 32);
                    }
                }
                return new C0234i(copyOf);
            }
            i3++;
        }
    }

    public final String o() {
        String str = this.f4413f;
        if (str != null) {
            return str;
        }
        byte[] f3 = f();
        f2.j.f(f3, "<this>");
        String str2 = new String(f3, AbstractC0721a.f7347a);
        this.f4413f = str2;
        return str2;
    }

    public void p(C0231f c0231f, int i3) {
        f2.j.f(c0231f, "buffer");
        c0231f.z(this.f4411d, 0, i3);
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
        byte b3;
        int i3;
        byte[] bArr = this.f4411d;
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
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                int i7 = i6 + 1;
                if (i6 == 64) {
                    break;
                }
                if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                    break;
                }
                i5 += b4 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i6 = i7;
                    if (i4 < length && (b3 = bArr[i4]) >= 0) {
                        i4++;
                        i7 = i6 + 1;
                        if (i6 == 64) {
                            break loop0;
                        }
                        if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                            break loop0;
                        }
                        i5 += b3 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b4 >> 5) == -2) {
                int i8 = i4 + 1;
                if (length > i8) {
                    byte b5 = bArr[i8];
                    if ((b5 & 192) == 128) {
                        int i9 = (b5 ^ 3968) ^ (b4 << 6);
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
            } else if ((b4 >> 4) == -2) {
                int i10 = i4 + 2;
                if (length > i10) {
                    byte b6 = bArr[i4 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i10];
                        if ((b7 & 192) == 128) {
                            int i11 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b4 << 12);
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
            } else if ((b4 >> 3) == -2) {
                int i12 = i4 + 3;
                if (length > i12) {
                    byte b8 = bArr[i4 + 1];
                    if ((b8 & 192) == 128) {
                        byte b9 = bArr[i4 + 2];
                        if ((b9 & 192) == 128) {
                            byte b10 = bArr[i12];
                            if ((b10 & 192) == 128) {
                                int i13 = (((b10 ^ 3678080) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b4 << 18);
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
                throw new IllegalArgumentException(A.k.j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C0234i(S1.k.p0(bArr, 0, 64))).c());
            sb.append("…]");
            return sb.toString();
        }
        String o3 = o();
        String substring = o3.substring(0, i5);
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String x3 = AbstractC0737q.x(AbstractC0737q.x(AbstractC0737q.x(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i5 >= o3.length()) {
            return "[text=" + x3 + ']';
        }
        return "[size=" + bArr.length + " text=" + x3 + "…]";
    }
}
