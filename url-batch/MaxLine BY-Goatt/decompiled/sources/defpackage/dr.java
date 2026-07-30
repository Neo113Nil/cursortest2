package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class dr implements Serializable, Comparable {
    public static final dr p = new dr(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] m;
    public transient int n;
    public transient String o;

    public dr(byte[] bArr) {
        bArr.getClass();
        this.m = bArr;
    }

    public static int f(dr drVar, dr drVar2) {
        drVar.getClass();
        drVar2.getClass();
        return drVar.e(0, drVar2.g());
    }

    public static int j(dr drVar, dr drVar2) {
        drVar.getClass();
        drVar2.getClass();
        return drVar.i(drVar2.g());
    }

    public static /* synthetic */ dr n(dr drVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return drVar.m(i, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            lh.c(in1.k(readInt, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        dr drVar = new dr(bArr);
        Field declaredField = dr.class.getDeclaredField("m");
        declaredField.setAccessible(true);
        declaredField.set(this, drVar.m);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.m.length);
        objectOutputStream.write(this.m);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dr drVar) {
        drVar.getClass();
        int c = c();
        int c2 = drVar.c();
        int min = Math.min(c, c2);
        for (int i = 0; i < min; i++) {
            int h = h(i) & 255;
            int h2 = drVar.h(i) & 255;
            if (h != h2) {
                return h < h2 ? -1 : 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        return c < c2 ? -1 : 1;
    }

    public dr b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.m, 0, c());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new dr(digest);
    }

    public int c() {
        return this.m.length;
    }

    public String d() {
        byte[] bArr = this.m;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = ap.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int e(int i, byte[] bArr) {
        bArr.getClass();
        int length = this.m.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!o70.q(max, 0, bArr.length, this.m, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dr) {
            dr drVar = (dr) obj;
            int c = drVar.c();
            byte[] bArr = this.m;
            if (c == bArr.length && drVar.l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] g() {
        return this.m;
    }

    public byte h(int i) {
        return this.m[i];
    }

    public int hashCode() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.m);
        this.n = hashCode;
        return hashCode;
    }

    public int i(byte[] bArr) {
        bArr.getClass();
        for (int min = Math.min(c(), this.m.length - bArr.length); -1 < min; min--) {
            if (o70.q(min, 0, bArr.length, this.m, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean k(int i, dr drVar, int i2) {
        drVar.getClass();
        return drVar.l(0, this.m, i, i2);
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.m;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && o70.q(i, i2, i3, bArr2, bArr);
    }

    public dr m(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = c();
        }
        if (i < 0) {
            lh.e("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.m;
        if (i2 > bArr.length) {
            lh.c(q40.o(new StringBuilder("endIndex > length("), this.m.length, ')'));
            return null;
        }
        if (i2 - i < 0) {
            lh.e("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        li.a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return new dr(copyOfRange);
    }

    public dr o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.m;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new dr(copyOf);
            }
            i++;
        }
    }

    public final String p() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        byte[] g = g();
        g.getClass();
        String str2 = new String(g, yt.b);
        this.o = str2;
        return str2;
    }

    public void q(fq fqVar, int i) {
        fqVar.C(i, this.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0138, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0177, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0170, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0144, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b9, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0100, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        dr drVar = this;
        byte[] bArr = drVar.m;
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
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            Unit unit = Unit.a;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
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
                                    Unit unit2 = Unit.a;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
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
                                            Unit unit3 = Unit.a;
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
            String p2 = drVar.p();
            String m = tp2.m(tp2.m(tp2.m(p2.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= p2.length()) {
                return "[text=" + m + ']';
            }
            return "[size=" + drVar.m.length + " text=" + m + "…]";
        }
        if (drVar.m.length <= 64) {
            return "[hex=" + drVar.d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(drVar.m.length);
        sb.append(" hex=");
        byte[] bArr2 = drVar.m;
        if (64 > bArr2.length) {
            lh.c(q40.o(new StringBuilder("endIndex > length("), drVar.m.length, ')'));
            return null;
        }
        if (64 != bArr2.length) {
            li.a(64, bArr2.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, 64);
            copyOfRange.getClass();
            drVar = new dr(copyOfRange);
        }
        sb.append(drVar.d());
        sb.append("…]");
        return sb.toString();
    }
}
