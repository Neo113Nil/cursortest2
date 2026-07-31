package n6;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final i f5525i = new i(new byte[0]);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f5526f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f5527g;

    /* renamed from: h, reason: collision with root package name */
    public transient String f5528h;

    public i(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f5526f = data;
    }

    public int a() {
        return this.f5526f.length;
    }

    public String b() {
        byte[] bArr = this.f5526f;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = o6.b.f5625a;
            cArr[i7] = cArr2[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f5526f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        kotlin.jvm.internal.i.e(other, "other");
        int a7 = a();
        int a8 = other.a();
        int min = Math.min(a7, a8);
        for (int i7 = 0; i7 < min; i7++) {
            int d7 = d(i7) & 255;
            int d8 = other.d(i7) & 255;
            if (d7 != d8) {
                return d7 < d8 ? -1 : 1;
            }
        }
        if (a7 == a8) {
            return 0;
        }
        return a7 < a8 ? -1 : 1;
    }

    public byte d(int i7) {
        return this.f5526f[i7];
    }

    public boolean e(int i7, byte[] other, int i8, int i9) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i7 < 0) {
            return false;
        }
        byte[] bArr = this.f5526f;
        return i7 <= bArr.length - i9 && i8 >= 0 && i8 <= other.length - i9 && b.a(i7, i8, i9, bArr, other);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int a7 = iVar.a();
            byte[] bArr = this.f5526f;
            if (a7 == bArr.length && iVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i other, int i7) {
        kotlin.jvm.internal.i.e(other, "other");
        return other.e(0, this.f5526f, 0, i7);
    }

    public String g(Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        return new String(this.f5526f, charset);
    }

    public i h(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = a();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f5526f;
        if (i8 <= bArr.length) {
            if (i8 - i7 >= 0) {
                return (i7 == 0 && i8 == bArr.length) ? this : new i(AbstractC0505i.H(bArr, i7, i8));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    public int hashCode() {
        int i7 = this.f5527g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.f5526f);
        this.f5527g = hashCode;
        return hashCode;
    }

    public i i() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f5526f;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i7];
            if (b7 >= 65 && b7 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
                copyOf[i7] = (byte) (b7 + 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b8 = copyOf[i8];
                    if (b8 >= 65 && b8 <= 90) {
                        copyOf[i8] = (byte) (b8 + 32);
                    }
                }
                return new i(copyOf);
            }
            i7++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f5526f;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final String k() {
        String str = this.f5528h;
        if (str != null) {
            return str;
        }
        byte[] c7 = c();
        kotlin.jvm.internal.i.e(c7, "<this>");
        String str2 = new String(c7, F5.a.f785a);
        this.f5528h = str2;
        return str2;
    }

    public void l(f fVar, int i7) {
        fVar.write(this.f5526f, 0, i7);
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
        byte b7;
        int i7;
        byte[] bArr = this.f5526f;
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
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                int i11 = i10 + 1;
                if (i10 == 64) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (Byte.MAX_VALUE <= b8 && b8 < 160))) || b8 == 65533) {
                    break;
                }
                i9 += b8 < 65536 ? 1 : 2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b7 = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (Byte.MAX_VALUE <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i9 += b7 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b8 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length > i12) {
                    byte b9 = bArr[i12];
                    if ((b9 & 192) == 128) {
                        int i13 = (b9 ^ 3968) ^ (b8 << 6);
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
            } else if ((b8 >> 4) == -2) {
                int i14 = i8 + 2;
                if (length > i14) {
                    byte b10 = bArr[i8 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i14];
                        if ((b11 & 192) == 128) {
                            int i15 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
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
            } else if ((b8 >> 3) == -2) {
                int i16 = i8 + 3;
                if (length > i16) {
                    byte b12 = bArr[i8 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i8 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i17 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
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
        if (i9 != -1) {
            String k4 = k();
            String substring = k4.substring(0, i9);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            String G6 = F5.q.G(F5.q.G(F5.q.G(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i9 >= k4.length()) {
                return "[text=" + G6 + ']';
            }
            return "[size=" + bArr.length + " text=" + G6 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new i(AbstractC0505i.H(bArr, 0, 64))).b());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
