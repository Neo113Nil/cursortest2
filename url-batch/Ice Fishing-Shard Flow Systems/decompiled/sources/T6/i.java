package T6;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* renamed from: l, reason: collision with root package name */
    public static final i f2618l = new i(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2619d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f2620e;

    /* renamed from: i, reason: collision with root package name */
    public transient String f2621i;

    public i(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2619d = data;
    }

    public int a() {
        return this.f2619d.length;
    }

    public String b() {
        byte[] bArr = this.f2619d;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b7 : bArr) {
            int i5 = i2 + 1;
            char[] cArr2 = U6.b.f2738a;
            cArr[i2] = cArr2[(b7 >> 4) & 15];
            i2 += 2;
            cArr[i5] = cArr2[b7 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public byte[] c() {
        return this.f2619d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int a7 = a();
        int a8 = other.a();
        int min = Math.min(a7, a8);
        for (int i2 = 0; i2 < min; i2++) {
            int d7 = d(i2) & 255;
            int d8 = other.d(i2) & 255;
            if (d7 != d8) {
                return d7 < d8 ? -1 : 1;
            }
        }
        if (a7 == a8) {
            return 0;
        }
        return a7 < a8 ? -1 : 1;
    }

    public byte d(int i2) {
        return this.f2619d[i2];
    }

    public boolean e(int i2, byte[] other, int i5, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0) {
            return false;
        }
        byte[] bArr = this.f2619d;
        return i2 <= bArr.length - i7 && i5 >= 0 && i5 <= other.length - i7 && b.a(i2, i5, i7, bArr, other);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int a7 = iVar.a();
            byte[] bArr = this.f2619d;
            if (a7 == bArr.length && iVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.e(0, this.f2619d, 0, i2);
    }

    public String g(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.f2619d, charset);
    }

    public i h(int i2, int i5) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i5 == -1234567890) {
            i5 = a();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f2619d;
        if (i5 <= bArr.length) {
            if (i5 - i2 >= 0) {
                return (i2 == 0 && i5 == bArr.length) ? this : new i(kotlin.collections.o.g(bArr, i2, i5));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    public int hashCode() {
        int i2 = this.f2620e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f2619d);
        this.f2620e = hashCode;
        return hashCode;
    }

    public i i() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f2619d;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i2];
            if (b7 >= 65 && b7 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b7 + 32);
                for (int i5 = i2 + 1; i5 < copyOf.length; i5++) {
                    byte b8 = copyOf[i5];
                    if (b8 >= 65 && b8 <= 90) {
                        copyOf[i5] = (byte) (b8 + 32);
                    }
                }
                return new i(copyOf);
            }
            i2++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f2619d;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final String k() {
        String str = this.f2621i;
        if (str != null) {
            return str;
        }
        byte[] c7 = c();
        Intrinsics.checkNotNullParameter(c7, "<this>");
        String str2 = new String(c7, Charsets.UTF_8);
        this.f2621i = str2;
        return str2;
    }

    public void l(f buffer, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(this.f2619d, 0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00fb, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0137, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013b, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00db, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017a, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0181, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0173, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b3, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01b6, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b9, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0147, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01bc, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x007a, code lost:
    
        r3 = kotlin.Unit.f6114a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c9, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0103, code lost:
    
        if (r6 == 64) goto L181;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b7;
        int i2;
        byte[] bArr = this.f2619d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i5 = 0;
        int i7 = 0;
        int i8 = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            byte b8 = bArr[i5];
            if (b8 >= 0) {
                int i9 = i8 + 1;
                if (i8 == 64) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (Byte.MAX_VALUE <= b8 && b8 < 160))) || b8 == 65533) {
                    break;
                }
                i7 += b8 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i8 = i9;
                    if (i5 < length && (b7 = bArr[i5]) >= 0) {
                        i5++;
                        i9 = i8 + 1;
                        if (i8 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (Byte.MAX_VALUE <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i7 += b7 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b8 >> 5) == -2) {
                int i10 = i5 + 1;
                if (length > i10) {
                    byte b9 = bArr[i10];
                    if ((b9 & 192) == 128) {
                        int i11 = (b9 ^ 3968) ^ (b8 << 6);
                        if (i11 >= 128) {
                            i2 = i8 + 1;
                            if (i8 == 64) {
                                break;
                            }
                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                break;
                            }
                            i7 += i11 < 65536 ? 1 : 2;
                            Unit unit = Unit.f6114a;
                            i5 += 2;
                            i8 = i2;
                        }
                    }
                }
            } else if ((b8 >> 4) == -2) {
                int i12 = i5 + 2;
                if (length > i12) {
                    byte b10 = bArr[i5 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i12];
                        if ((b11 & 192) == 128) {
                            int i13 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
                            if (i13 >= 2048) {
                                if (55296 > i13 || i13 >= 57344) {
                                    i2 = i8 + 1;
                                    if (i8 == 64) {
                                        break;
                                    }
                                    if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                        break;
                                    }
                                    i7 += i13 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.f6114a;
                                    i5 += 3;
                                    i8 = i2;
                                }
                            }
                        }
                    }
                }
            } else if ((b8 >> 3) == -2) {
                int i14 = i5 + 3;
                if (length > i14) {
                    byte b12 = bArr[i5 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i5 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i14];
                            if ((b14 & 192) == 128) {
                                int i15 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                                if (i15 <= 1114111) {
                                    if (55296 > i15 || i15 >= 57344) {
                                        if (i15 >= 65536) {
                                            i2 = i8 + 1;
                                            if (i8 == 64) {
                                                break;
                                            }
                                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                                break;
                                            }
                                            i7 += i15 < 65536 ? 1 : 2;
                                            Unit unit3 = Unit.f6114a;
                                            i5 += 4;
                                            i8 = i2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i7 != -1) {
            String k7 = k();
            String substring = k7.substring(0, i7);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String j = kotlin.text.p.j(kotlin.text.p.j(kotlin.text.p.j(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i7 >= k7.length()) {
                return C4.p.i("[text=", j, ']');
            }
            return "[size=" + bArr.length + " text=" + j + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new i(kotlin.collections.o.g(bArr, 0, 64))).b());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
