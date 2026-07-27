package j5;

import g4.AbstractC0464i;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final i f10496d = new i(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10497a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f10498b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f10499c;

    public i(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f10497a = data;
    }

    public int a() {
        return this.f10497a.length;
    }

    public String b() {
        byte[] bArr = this.f10497a;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b6 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = k5.b.f10725a;
            cArr[i2] = cArr2[(b6 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f10497a;
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
        i other = (i) obj;
        kotlin.jvm.internal.i.e(other, "other");
        int a6 = a();
        int a7 = other.a();
        int min = Math.min(a6, a7);
        for (int i2 = 0; i2 < min; i2++) {
            int d6 = d(i2) & 255;
            int d7 = other.d(i2) & 255;
            if (d6 == d7) {
            }
        }
        if (a6 == a7) {
            return 0;
        }
    }

    public byte d(int i2) {
        return this.f10497a[i2];
    }

    public boolean e(int i2, byte[] other, int i3, int i6) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i2 >= 0) {
            byte[] bArr = this.f10497a;
            if (i2 <= bArr.length - i6 && i3 >= 0 && i3 <= other.length - i6 && b.a(i2, i3, i6, bArr, other)) {
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
            int a6 = iVar.a();
            byte[] bArr = this.f10497a;
            if (a6 == bArr.length && iVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i other, int i2) {
        kotlin.jvm.internal.i.e(other, "other");
        return other.e(0, this.f10497a, 0, i2);
    }

    public String g(Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        return new String(this.f10497a, charset);
    }

    public i h(int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = a();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f10497a;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException(B0.o.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i3 - i2 >= 0) {
            return (i2 == 0 && i3 == bArr.length) ? this : new i(AbstractC0464i.Q(bArr, i2, i3));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public int hashCode() {
        int i2 = this.f10498b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f10497a);
        this.f10498b = hashCode;
        return hashCode;
    }

    public i i() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f10497a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i2];
            if (b6 >= 65 && b6 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b6 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b7 = copyOf[i3];
                    if (b7 >= 65 && b7 <= 90) {
                        copyOf[i3] = (byte) (b7 + 32);
                    }
                }
                return new i(copyOf);
            }
            i2++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f10497a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final String k() {
        String str = this.f10499c;
        if (str != null) {
            return str;
        }
        byte[] c2 = c();
        kotlin.jvm.internal.i.e(c2, "<this>");
        String str2 = new String(c2, B4.a.f287a);
        this.f10499c = str2;
        return str2;
    }

    public void l(f buffer, int i2) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        buffer.H(this.f10497a, 0, i2);
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
        byte b6;
        int i2;
        byte[] bArr = this.f10497a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b7 = bArr[i3];
            if (b7 >= 0) {
                int i8 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (Byte.MAX_VALUE <= b7 && b7 < 160))) || b7 == 65533) {
                    break;
                }
                i6 += b7 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i7 = i8;
                    if (i3 < length && (b6 = bArr[i3]) >= 0) {
                        i3++;
                        i8 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if ((b6 != 10 && b6 != 13 && ((b6 >= 0 && b6 < 32) || (Byte.MAX_VALUE <= b6 && b6 < 160))) || b6 == 65533) {
                            break loop0;
                        }
                        i6 += b6 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b7 >> 5) == -2) {
                int i9 = i3 + 1;
                if (length > i9) {
                    byte b8 = bArr[i9];
                    if ((b8 & 192) == 128) {
                        int i10 = (b8 ^ 3968) ^ (b7 << 6);
                        if (i10 >= 128) {
                            i2 = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            }
                            i6 += i10 < 65536 ? 1 : 2;
                            i3 += 2;
                            i7 = i2;
                        }
                    }
                }
            } else if ((b7 >> 4) == -2) {
                int i11 = i3 + 2;
                if (length > i11) {
                    byte b9 = bArr[i3 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i11];
                        if ((b10 & 192) == 128) {
                            int i12 = ((b10 ^ (-123008)) ^ (b9 << 6)) ^ (b7 << 12);
                            if (i12 >= 2048) {
                                if (55296 > i12 || i12 >= 57344) {
                                    i2 = i7 + 1;
                                    if (i7 == 64) {
                                        break;
                                    }
                                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        break;
                                    }
                                    i6 += i12 < 65536 ? 1 : 2;
                                    i3 += 3;
                                    i7 = i2;
                                }
                            }
                        }
                    }
                }
            } else if ((b7 >> 3) == -2) {
                int i13 = i3 + 3;
                if (length > i13) {
                    byte b11 = bArr[i3 + 1];
                    if ((b11 & 192) == 128) {
                        byte b12 = bArr[i3 + 2];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i13];
                            if ((b13 & 192) == 128) {
                                int i14 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b7 << 18);
                                if (i14 <= 1114111) {
                                    if (55296 > i14 || i14 >= 57344) {
                                        if (i14 >= 65536) {
                                            i2 = i7 + 1;
                                            if (i7 == 64) {
                                                break;
                                            }
                                            if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                                break;
                                            }
                                            i6 += i14 < 65536 ? 1 : 2;
                                            i3 += 4;
                                            i7 = i2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i6 != -1) {
            String k3 = k();
            String substring = k3.substring(0, i6);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            String M5 = B4.r.M(B4.r.M(B4.r.M(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i6 >= k3.length()) {
                return B0.o.j("[text=", M5, ']');
            }
            return "[size=" + bArr.length + " text=" + M5 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(B0.o.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new i(AbstractC0464i.Q(bArr, 0, 64))).b());
        sb.append("…]");
        return sb.toString();
    }
}
