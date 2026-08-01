package p3;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final i f3029i = new i(new byte[0]);

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f3030f;
    public transient int g;
    public transient String h;

    public i(byte[] bArr) {
        u2.c.e(bArr, "data");
        this.f3030f = bArr;
    }

    public int a() {
        return this.f3030f.length;
    }

    public String b() {
        byte[] bArr = this.f3030f;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b2 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = q3.b.f3137a;
            cArr[i4] = cArr2[(b2 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f3030f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        u2.c.e(iVar, "other");
        int a4 = a();
        int a5 = iVar.a();
        int min = Math.min(a4, a5);
        for (int i4 = 0; i4 < min; i4++) {
            int d4 = d(i4) & 255;
            int d5 = iVar.d(i4) & 255;
            if (d4 != d5) {
                return d4 < d5 ? -1 : 1;
            }
        }
        if (a4 == a5) {
            return 0;
        }
        return a4 < a5 ? -1 : 1;
    }

    public byte d(int i4) {
        return this.f3030f[i4];
    }

    public boolean e(int i4, byte[] bArr, int i5, int i6) {
        u2.c.e(bArr, "other");
        if (i4 < 0) {
            return false;
        }
        byte[] bArr2 = this.f3030f;
        return i4 <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && m0.a.a(i4, i5, i6, bArr2, bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int a4 = iVar.a();
            byte[] bArr = this.f3030f;
            if (a4 == bArr.length && iVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i iVar, int i4) {
        u2.c.e(iVar, "other");
        return iVar.e(0, this.f3030f, 0, i4);
    }

    public i g() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f3030f;
            if (i4 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i4];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                u2.c.d(copyOf, "copyOf(this, size)");
                copyOf[i4] = (byte) (b2 + 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b4 = copyOf[i5];
                    if (b4 >= 65 && b4 <= 90) {
                        copyOf[i5] = (byte) (b4 + 32);
                    }
                }
                return new i(copyOf);
            }
            i4++;
        }
    }

    public final String h() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        byte[] c = c();
        u2.c.e(c, "<this>");
        String str2 = new String(c, b3.a.f967a);
        this.h = str2;
        return str2;
    }

    public int hashCode() {
        int i4 = this.g;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.f3030f);
        this.g = hashCode;
        return hashCode;
    }

    public void i(f fVar, int i4) {
        fVar.v(this.f3030f, i4);
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
        i iVar;
        byte b2;
        int i4;
        byte[] bArr = this.f3030f;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                int i8 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                    break;
                }
                i6 += b4 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i7 = i8;
                    if (i5 < length && (b2 = bArr[i5]) >= 0) {
                        i5++;
                        i8 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i6 += b2 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b4 >> 5) == -2) {
                int i9 = i5 + 1;
                if (length > i9) {
                    byte b5 = bArr[i9];
                    if ((b5 & 192) == 128) {
                        int i10 = (b5 ^ 3968) ^ (b4 << 6);
                        if (i10 >= 128) {
                            i4 = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            }
                            i6 += i10 < 65536 ? 1 : 2;
                            i5 += 2;
                            i7 = i4;
                        }
                    }
                }
            } else if ((b4 >> 4) == -2) {
                int i11 = i5 + 2;
                if (length > i11) {
                    byte b6 = bArr[i5 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i11];
                        if ((b7 & 192) == 128) {
                            int i12 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b4 << 12);
                            if (i12 >= 2048) {
                                if (55296 > i12 || i12 >= 57344) {
                                    i4 = i7 + 1;
                                    if (i7 == 64) {
                                        break;
                                    }
                                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        break;
                                    }
                                    i6 += i12 < 65536 ? 1 : 2;
                                    i5 += 3;
                                    i7 = i4;
                                }
                            }
                        }
                    }
                }
            } else if ((b4 >> 3) == -2) {
                int i13 = i5 + 3;
                if (length > i13) {
                    byte b8 = bArr[i5 + 1];
                    if ((b8 & 192) == 128) {
                        byte b9 = bArr[i5 + 2];
                        if ((b9 & 192) == 128) {
                            byte b10 = bArr[i13];
                            if ((b10 & 192) == 128) {
                                int i14 = (((b10 ^ 3678080) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b4 << 18);
                                if (i14 <= 1114111) {
                                    if (55296 > i14 || i14 >= 57344) {
                                        if (i14 >= 65536) {
                                            i4 = i7 + 1;
                                            if (i7 == 64) {
                                                break;
                                            }
                                            if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                                break;
                                            }
                                            i6 += i14 < 65536 ? 1 : 2;
                                            i5 += 4;
                                            i7 = i4;
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
            String h = h();
            String substring = h.substring(0, i6);
            u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String Z = b3.m.Z(b3.m.Z(b3.m.Z(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i6 >= h.length()) {
                return "[text=" + Z + ']';
            }
            return "[size=" + bArr.length + " text=" + Z + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            iVar = this;
        } else {
            l0.g.g(64, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            u2.c.d(copyOfRange, "copyOfRange(...)");
            iVar = new i(copyOfRange);
        }
        sb.append(iVar.b());
        sb.append("…]");
        return sb.toString();
    }
}
