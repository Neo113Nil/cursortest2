package T3;

import a.AbstractC0124a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Serializable;
import java.util.Arrays;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final j f2976d = new j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2977a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f2978b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f2979c;

    public j(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f2977a = data;
    }

    public int a() {
        return this.f2977a.length;
    }

    public String b() {
        byte[] bArr = this.f2977a;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = U3.b.f3114a;
            cArr[i4] = cArr2[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f2977a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j other = (j) obj;
        kotlin.jvm.internal.i.e(other, "other");
        int a3 = a();
        int a4 = other.a();
        int min = Math.min(a3, a4);
        for (int i4 = 0; i4 < min; i4++) {
            int d4 = d(i4) & 255;
            int d5 = other.d(i4) & 255;
            if (d4 != d5) {
                return d4 < d5 ? -1 : 1;
            }
        }
        if (a3 == a4) {
            return 0;
        }
        return a3 < a4 ? -1 : 1;
    }

    public byte d(int i4) {
        return this.f2977a[i4];
    }

    public boolean e(int i4, int i5, int i6, byte[] other) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i4 < 0) {
            return false;
        }
        byte[] bArr = this.f2977a;
        return i4 <= bArr.length - i6 && i5 >= 0 && i5 <= other.length - i6 && AbstractC0124a.c(i4, i5, i6, bArr, other);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int a3 = jVar.a();
            byte[] bArr = this.f2977a;
            if (a3 == bArr.length && jVar.e(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(j other, int i4) {
        kotlin.jvm.internal.i.e(other, "other");
        return other.e(0, 0, i4, this.f2977a);
    }

    public j g() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f2977a;
            if (i4 >= bArr.length) {
                return this;
            }
            byte b4 = bArr[i4];
            if (b4 >= 65 && b4 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
                copyOf[i4] = (byte) (b4 + 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b5 = copyOf[i5];
                    if (b5 >= 65 && b5 <= 90) {
                        copyOf[i5] = (byte) (b5 + 32);
                    }
                }
                return new j(copyOf);
            }
            i4++;
        }
    }

    public final String h() {
        String str = this.f2979c;
        if (str != null) {
            return str;
        }
        byte[] c4 = c();
        kotlin.jvm.internal.i.e(c4, "<this>");
        String str2 = new String(c4, AbstractC1504a.f15936a);
        this.f2979c = str2;
        return str2;
    }

    public int hashCode() {
        int i4 = this.f2978b;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.f2977a);
        this.f2978b = hashCode;
        return hashCode;
    }

    public void i(g gVar, int i4) {
        gVar.u(i4, this.f2977a);
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
        j jVar;
        byte b4;
        int i4;
        byte[] bArr = this.f2977a;
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
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                int i8 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (Byte.MAX_VALUE <= b5 && b5 < 160))) || b5 == 65533) {
                    break;
                }
                i6 += b5 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i7 = i8;
                    if (i5 < length && (b4 = bArr[i5]) >= 0) {
                        i5++;
                        i8 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                            break loop0;
                        }
                        i6 += b4 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b5 >> 5) == -2) {
                int i9 = i5 + 1;
                if (length > i9) {
                    byte b6 = bArr[i9];
                    if ((b6 & 192) == 128) {
                        int i10 = (b6 ^ 3968) ^ (b5 << 6);
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
            } else if ((b5 >> 4) == -2) {
                int i11 = i5 + 2;
                if (length > i11) {
                    byte b7 = bArr[i5 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i11];
                        if ((b8 & 192) == 128) {
                            int i12 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b5 << 12);
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
            } else if ((b5 >> 3) == -2) {
                int i13 = i5 + 3;
                if (length > i13) {
                    byte b9 = bArr[i5 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i5 + 2];
                        if ((b10 & 192) == 128) {
                            byte b11 = bArr[i13];
                            if ((b11 & 192) == 128) {
                                int i14 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
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
            String h2 = h();
            String substring = h2.substring(0, i6);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String Y2 = w3.o.Y(w3.o.Y(w3.o.Y(substring, "\\", "\\\\"), IOUtils.LINE_SEPARATOR_UNIX, "\\n"), "\r", "\\r");
            if (i6 >= h2.length()) {
                return "[text=" + Y2 + ']';
            }
            return "[size=" + bArr.length + " text=" + Y2 + "…]";
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
            jVar = this;
        } else {
            V3.b.k(64, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            jVar = new j(copyOfRange);
        }
        sb.append(jVar.b());
        sb.append("…]");
        return sb.toString();
    }
}
