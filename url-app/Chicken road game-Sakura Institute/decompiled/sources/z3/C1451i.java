package z3;

import A.AbstractC0017m;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import z2.C1436t;

/* renamed from: z3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1451i implements Serializable, Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final C1451i f12000j = new C1451i(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12001d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f12002e;

    /* renamed from: i, reason: collision with root package name */
    public transient String f12003i;

    public C1451i(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f12001d = data;
    }

    public static int j(C1451i c1451i, C1451i other) {
        c1451i.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c1451i.h(other.f12001d, 0);
    }

    public static int q(C1451i c1451i, C1451i other) {
        c1451i.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c1451i.o(other.f12001d, -1234567890);
    }

    public static /* synthetic */ C1451i w(C1451i c1451i, int i2, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return c1451i.v(i2, i4);
    }

    public C1451i B() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f12001d;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b4 = bArr[i2];
            if (b4 >= 65 && b4 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i2] = (byte) (b4 + 32);
                for (int i4 = i2 + 1; i4 < copyOf.length; i4++) {
                    byte b5 = copyOf[i4];
                    if (b5 >= 65 && b5 <= 90) {
                        copyOf[i4] = (byte) (b5 + 32);
                    }
                }
                return new C1451i(copyOf);
            }
            i2++;
        }
    }

    public final String C() {
        String str = this.f12003i;
        if (str != null) {
            return str;
        }
        byte[] l4 = l();
        Intrinsics.checkNotNullParameter(l4, "<this>");
        String str2 = new String(l4, Charsets.UTF_8);
        this.f12003i = str2;
        return str2;
    }

    public void D(C1448f buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.w(this.f12001d, 0, i2);
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
    public final int compareTo(C1451i other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int c4 = c();
        int c5 = other.c();
        int min = Math.min(c4, c5);
        for (int i2 = 0; i2 < min; i2++) {
            int n2 = n(i2) & 255;
            int n4 = other.n(i2) & 255;
            if (n2 == n4) {
            }
        }
        if (c4 == c5) {
            return 0;
        }
    }

    public int c() {
        return this.f12001d.length;
    }

    public String e() {
        byte[] bArr = this.f12001d;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b4 : bArr) {
            int i4 = i2 + 1;
            char[] cArr2 = A3.b.f843a;
            cArr[i2] = cArr2[(b4 >> 4) & 15];
            i2 += 2;
            cArr[i4] = cArr2[b4 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1451i) {
            C1451i c1451i = (C1451i) obj;
            int c4 = c1451i.c();
            byte[] bArr = this.f12001d;
            if (c4 == bArr.length && c1451i.s(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int h(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte[] bArr = this.f12001d;
        int length = bArr.length - other.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!m3.s.f(max, 0, other.length, bArr, other)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int hashCode() {
        int i2 = this.f12002e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f12001d);
        this.f12002e = hashCode;
        return hashCode;
    }

    public byte[] l() {
        return this.f12001d;
    }

    public byte n(int i2) {
        return this.f12001d[i2];
    }

    public int o(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i2 == -1234567890) {
            i2 = c();
        }
        byte[] bArr = this.f12001d;
        for (int min = Math.min(i2, bArr.length - other.length); -1 < min; min--) {
            if (m3.s.f(min, 0, other.length, bArr, other)) {
                return min;
            }
        }
        return -1;
    }

    public boolean r(int i2, C1451i other, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.s(0, this.f12001d, i2, i4);
    }

    public boolean s(int i2, byte[] other, int i4, int i5) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 >= 0) {
            byte[] bArr = this.f12001d;
            if (i2 <= bArr.length - i5 && i4 >= 0 && i4 <= other.length - i5 && m3.s.f(i2, i4, i5, bArr, other)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016e, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0175, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0167, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01aa, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ad, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b0, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x013a, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01b3, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x008a, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00b9, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0079, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ec, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012e, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00cc, code lost:
    
        if (r8 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b4;
        int i2;
        byte[] bArr = this.f12001d;
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
            byte b5 = bArr[i4];
            if (b5 >= 0) {
                int i7 = i6 + 1;
                if (i6 == 64) {
                    break;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (Byte.MAX_VALUE <= b5 && b5 < 160))) || b5 == 65533) {
                    break;
                }
                i5 += b5 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i6 = i7;
                    if (i4 < length && (b4 = bArr[i4]) >= 0) {
                        i4++;
                        i7 = i6 + 1;
                        if (i6 == 64) {
                            break loop0;
                        }
                        if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                            break loop0;
                        }
                        i5 += b4 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b5 >> 5) == -2) {
                int i8 = i4 + 1;
                if (length > i8) {
                    byte b6 = bArr[i8];
                    if ((b6 & 192) == 128) {
                        int i9 = (b6 ^ 3968) ^ (b5 << 6);
                        if (i9 >= 128) {
                            int i10 = i6 + 1;
                            if (i6 == 64) {
                                break;
                            }
                            if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                break;
                            }
                            i5 += i9 < 65536 ? 1 : 2;
                            Unit unit = Unit.f7487a;
                            i4 += 2;
                            i6 = i10;
                        }
                    }
                }
            } else if ((b5 >> 4) == -2) {
                int i11 = i4 + 2;
                if (length > i11) {
                    byte b7 = bArr[i4 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i11];
                        if ((b8 & 192) == 128) {
                            int i12 = ((b7 << 6) ^ (b8 ^ (-123008))) ^ (b5 << 12);
                            if (i12 >= 2048) {
                                if (55296 > i12 || i12 >= 57344) {
                                    i2 = i6 + 1;
                                    if (i6 == 64) {
                                        break;
                                    }
                                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        break;
                                    }
                                    i5 += i12 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.f7487a;
                                    i4 += 3;
                                    i6 = i2;
                                }
                            }
                        }
                    }
                }
            } else if ((b5 >> 3) == -2) {
                int i13 = i4 + 3;
                if (length > i13) {
                    byte b9 = bArr[i4 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i4 + 2];
                        if ((b10 & 192) == 128) {
                            byte b11 = bArr[i13];
                            if ((b11 & 192) == 128) {
                                int i14 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
                                if (i14 <= 1114111) {
                                    if (55296 > i14 || i14 >= 57344) {
                                        if (i14 >= 65536) {
                                            i2 = i6 + 1;
                                            if (i6 == 64) {
                                                break;
                                            }
                                            if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                                break;
                                            }
                                            i5 += i14 < 65536 ? 1 : 2;
                                            Unit unit3 = Unit.f7487a;
                                            i4 += 4;
                                            i6 = i2;
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
                return "[hex=" + e() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            Intrinsics.checkNotNullParameter(this, "<this>");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(AbstractC0017m.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C1451i(C1436t.i(bArr, 0, 64))).e());
            sb.append("…]");
            return sb.toString();
        }
        String C3 = C();
        String substring = C3.substring(0, i5);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String l4 = kotlin.text.u.l(kotlin.text.u.l(kotlin.text.u.l(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i5 >= C3.length()) {
            return "[text=" + l4 + ']';
        }
        return "[size=" + bArr.length + " text=" + l4 + "…]";
    }

    public C1451i v(int i2, int i4) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i4 == -1234567890) {
            i4 = c();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f12001d;
        if (i4 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0017m.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i4 - i2 >= 0) {
            return (i2 == 0 && i4 == bArr.length) ? this : new C1451i(C1436t.i(bArr, i2, i4));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }
}
