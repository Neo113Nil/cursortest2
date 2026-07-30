package f8;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final i f3600i = new i(new byte[0]);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f3601f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f3602g;

    /* renamed from: h, reason: collision with root package name */
    public transient String f3603h;

    public i(byte[] bArr) {
        r6.k.f(bArr, "data");
        this.f3601f = bArr;
    }

    public static /* synthetic */ i A(i iVar, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = -1234567890;
        }
        return iVar.z(i7, i8);
    }

    public static int l(i iVar, i iVar2) {
        iVar.getClass();
        r6.k.f(iVar2, "other");
        return iVar.h(0, iVar2.m());
    }

    public static int w(i iVar, i iVar2) {
        iVar.getClass();
        r6.k.f(iVar2, "other");
        return iVar.q(iVar2.m());
    }

    public i B() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f3601f;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i7];
            if (b9 >= 65 && b9 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                r6.k.e(copyOf, "copyOf(this, size)");
                copyOf[i7] = (byte) (b9 + 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b10 = copyOf[i8];
                    if (b10 >= 65 && b10 <= 90) {
                        copyOf[i8] = (byte) (b10 + 32);
                    }
                }
                return new i(copyOf);
            }
            i7++;
        }
    }

    public final String C() {
        String str = this.f3603h;
        if (str != null) {
            return str;
        }
        byte[] m8 = m();
        r6.k.f(m8, "<this>");
        String str2 = new String(m8, z6.a.f10114a);
        this.f3603h = str2;
        return str2;
    }

    public void D(f fVar, int i7) {
        fVar.write(this.f3601f, 0, i7);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        r6.k.f(iVar, "other");
        int e9 = e();
        int e10 = iVar.e();
        int min = Math.min(e9, e10);
        for (int i7 = 0; i7 < min; i7++) {
            int p6 = p(i7) & 255;
            int p8 = iVar.p(i7) & 255;
            if (p6 != p8) {
                return p6 < p8 ? -1 : 1;
            }
        }
        if (e9 == e10) {
            return 0;
        }
        return e9 < e10 ? -1 : 1;
    }

    public int e() {
        return this.f3601f.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int e9 = iVar.e();
            byte[] bArr = this.f3601f;
            if (e9 == bArr.length && iVar.y(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        byte[] bArr = this.f3601f;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b9 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = g8.b.f4537a;
            cArr[i7] = cArr2[(b9 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public int h(int i7, byte[] bArr) {
        r6.k.f(bArr, "other");
        byte[] bArr2 = this.f3601f;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i7, 0);
        if (max > length) {
            return -1;
        }
        while (!t6.a.o(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public int hashCode() {
        int i7 = this.f3602g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f3601f);
        this.f3602g = hashCode;
        return hashCode;
    }

    public byte[] m() {
        return this.f3601f;
    }

    public byte p(int i7) {
        return this.f3601f[i7];
    }

    public int q(byte[] bArr) {
        r6.k.f(bArr, "other");
        int e9 = e();
        byte[] bArr2 = this.f3601f;
        for (int min = Math.min(e9, bArr2.length - bArr.length); -1 < min; min--) {
            if (t6.a.o(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b9;
        int i7;
        byte[] bArr = this.f3601f;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            if (i8 >= length) {
                break;
            }
            byte b10 = bArr[i8];
            if (b10 >= 0) {
                int i11 = i10 + 1;
                if (i10 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i9 += b10 < 65536 ? 1 : 2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b9 = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == 64) {
                            break loop0;
                        }
                        if ((b9 != 10 && b9 != 13 && ((b9 >= 0 && b9 < 32) || (Byte.MAX_VALUE <= b9 && b9 < 160))) || b9 == 65533) {
                            break loop0;
                        }
                        i9 += b9 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length > i12) {
                    byte b11 = bArr[i12];
                    if ((b11 & 192) == 128) {
                        int i13 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i13 >= 128) {
                            i7 = i10 + 1;
                            if (i10 == 64) {
                                break;
                            }
                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                break;
                            }
                            i9 += i13 < 65536 ? 1 : 2;
                            i8 += 2;
                            i10 = i7;
                        }
                    }
                }
            } else if ((b10 >> 4) == -2) {
                int i14 = i8 + 2;
                if (length > i14) {
                    byte b12 = bArr[i8 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i14];
                        if ((b13 & 192) == 128) {
                            int i15 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i15 >= 2048) {
                                if (55296 > i15 || i15 >= 57344) {
                                    i7 = i10 + 1;
                                    if (i10 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        break;
                                    }
                                    i9 += i15 < 65536 ? 1 : 2;
                                    i8 += 3;
                                    i10 = i7;
                                }
                            }
                        }
                    }
                }
            } else if ((b10 >> 3) == -2) {
                int i16 = i8 + 3;
                if (length > i16) {
                    byte b14 = bArr[i8 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i8 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i16];
                            if ((b16 & 192) == 128) {
                                int i17 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i17 <= 1114111) {
                                    if (55296 > i17 || i17 >= 57344) {
                                        if (i17 >= 65536) {
                                            i7 = i10 + 1;
                                            if (i10 == 64) {
                                                break;
                                            }
                                            if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                                break;
                                            }
                                            i9 += i17 < 65536 ? 1 : 2;
                                            i8 += 4;
                                            i10 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i9 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + g() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(a0.m.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new i(e6.k.a0(bArr, 0, 64))).g());
            sb.append("…]");
            return sb.toString();
        }
        String C = C();
        String substring = C.substring(0, i9);
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String t2 = z6.o.t(z6.o.t(z6.o.t(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i9 >= C.length()) {
            return "[text=" + t2 + ']';
        }
        return "[size=" + bArr.length + " text=" + t2 + "…]";
    }

    public boolean x(int i7, i iVar, int i8) {
        r6.k.f(iVar, "other");
        return iVar.y(0, this.f3601f, i7, i8);
    }

    public boolean y(int i7, byte[] bArr, int i8, int i9) {
        r6.k.f(bArr, "other");
        if (i7 < 0) {
            return false;
        }
        byte[] bArr2 = this.f3601f;
        return i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && t6.a.o(i7, i8, i9, bArr2, bArr);
    }

    public i z(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = e();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3601f;
        if (i8 > bArr.length) {
            throw new IllegalArgumentException(a0.m.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i8 - i7 >= 0) {
            return (i7 == 0 && i8 == bArr.length) ? this : new i(e6.k.a0(bArr, i7, i8));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }
}
