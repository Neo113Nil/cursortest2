package z1;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable {
    public static final i d = new i(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4270a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f4271b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f4272c;

    public i(byte[] bArr) {
        b1.d.e(bArr, "data");
        this.f4270a = bArr;
    }

    public int a() {
        return this.f4270a.length;
    }

    public String b() {
        byte[] bArr = this.f4270a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = A1.b.f27a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f4270a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        b1.d.e(iVar, "other");
        int a2 = a();
        int a3 = iVar.a();
        int min = Math.min(a2, a3);
        for (int i = 0; i < min; i++) {
            int d2 = d(i) & 255;
            int d3 = iVar.d(i) & 255;
            if (d2 == d3) {
            }
        }
        if (a2 == a3) {
            return 0;
        }
    }

    public byte d(int i) {
        return this.f4270a[i];
    }

    public boolean e(int i, byte[] bArr, int i2, int i3) {
        b1.d.e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f4270a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && k0.w.b(i, i2, i3, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int a2 = iVar.a();
            byte[] bArr = this.f4270a;
            if (a2 == bArr.length && iVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i iVar, int i) {
        b1.d.e(iVar, "other");
        return iVar.e(0, this.f4270a, 0, i);
    }

    public i g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f4270a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                b1.d.d(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b3 = copyOf[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i2] = (byte) (b3 + 32);
                    }
                }
                return new i(copyOf);
            }
            i++;
        }
    }

    public final String h() {
        String str = this.f4272c;
        if (str != null) {
            return str;
        }
        byte[] c2 = c();
        b1.d.e(c2, "<this>");
        String str2 = new String(c2, i1.a.f2499a);
        this.f4272c = str2;
        return str2;
    }

    public int hashCode() {
        int i = this.f4271b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f4270a);
        this.f4271b = hashCode;
        return hashCode;
    }

    public void i(f fVar, int i) {
        b1.d.e(fVar, "buffer");
        fVar.r(0, i, this.f4270a);
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
        int i;
        byte[] bArr = this.f4270a;
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
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                    break;
                }
                i3 += b3 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b2 = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i3 += b2 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b4 = bArr[i6];
                    if ((b4 & 192) == 128) {
                        int i7 = (b4 ^ 3968) ^ (b3 << 6);
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
            } else if ((b3 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b5 = bArr[i2 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i8];
                        if ((b6 & 192) == 128) {
                            int i9 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b3 << 12);
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
            } else if ((b3 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b7 = bArr[i2 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i2 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i10];
                            if ((b9 & 192) == 128) {
                                int i11 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b3 << 18);
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
            String h = h();
            String substring = h.substring(0, i3);
            b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String u02 = i1.l.u0(i1.l.u0(i1.l.u0(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= h.length()) {
                return "[text=" + u02 + ']';
            }
            return "[size=" + bArr.length + " text=" + u02 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new i(T0.g.t0(0, 64, bArr))).b());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
