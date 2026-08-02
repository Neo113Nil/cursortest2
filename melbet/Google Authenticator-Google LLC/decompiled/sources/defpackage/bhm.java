package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhm implements baz {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static boolean g(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    private static final ImageHeaderParser$ImageType h(bhk bhkVar) {
        try {
            int a2 = bhkVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int d = (a2 << 8) | bhkVar.d();
            if (d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int d2 = (d << 8) | bhkVar.d();
            if (d2 == -1991225785) {
                bhkVar.c(21L);
                try {
                    return bhkVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (bhj unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (d2 == 1380533830) {
                bhkVar.c(4L);
                if (((bhkVar.a() << 16) | bhkVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int a3 = (bhkVar.a() << 16) | bhkVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = a3 & 255;
                if (i == 88) {
                    bhkVar.c(4L);
                    short d3 = bhkVar.d();
                    return (d3 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (d3 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                bhkVar.c(4L);
                return (bhkVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((bhkVar.a() << 16) | bhkVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int a4 = (bhkVar.a() << 16) | bhkVar.a();
            if (a4 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = a4 == 1635150182;
            boolean g = g(a4);
            bhkVar.c(4L);
            int i2 = d2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int a5 = (bhkVar.a() << 16) | bhkVar.a();
                    if (a5 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (a5 == 1635150182) {
                        z = true;
                    } else if (g(a5)) {
                        g = true;
                    }
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : g ? ImageHeaderParser$ImageType.HEIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (bhj unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    private static final boolean i(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int j(bhk bhkVar, int i) {
        short d;
        while (bhkVar.d() == 255 && (d = bhkVar.d()) != 218 && d != 217) {
            int a2 = bhkVar.a() - 2;
            if (d == i) {
                return a2;
            }
            long j = a2;
            if (bhkVar.c(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    private static final int k(bhk bhkVar, bek bekVar) {
        short o;
        int n;
        int i;
        int i2;
        short o2;
        try {
            int a2 = bhkVar.a();
            if ((a2 & 65496) != 65496 && a2 != 19789 && a2 != 18761) {
                return -1;
            }
            int j = j(bhkVar, 225);
            if (j == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) bekVar.a(j, byte[].class);
            try {
                if (bhkVar.b(bArr, j) == j && i(bArr, j, a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(j);
                    short o3 = ajz.o(6, byteBuffer);
                    byteBuffer.order(o3 != 18761 ? o3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    int n2 = ajz.n(10, byteBuffer);
                    short o4 = ajz.o(n2 + 6, byteBuffer);
                    for (int i3 = 0; i3 < o4; i3++) {
                        int i4 = n2 + 8 + (i3 * 12);
                        if (ajz.o(i4, byteBuffer) == 274 && (o = ajz.o(i4 + 2, byteBuffer)) > 0 && o <= 12 && (n = ajz.n(i4 + 4, byteBuffer)) >= 0 && (i = n + c[o]) <= 4 && (i2 = i4 + 8) >= 0 && i2 <= byteBuffer.remaining() && i >= 0 && i + i2 <= byteBuffer.remaining()) {
                            o2 = ajz.o(i2, byteBuffer);
                            break;
                        }
                    }
                }
                o2 = -1;
                return o2;
            } finally {
                bekVar.c(bArr);
            }
        } catch (bhj unused) {
            return -1;
        }
    }

    private static final boolean l(bhk bhkVar, bek bekVar) {
        if (h(bhkVar) != ImageHeaderParser$ImageType.JPEG) {
            return false;
        }
        int j = j(bhkVar, 226);
        while (j > 0) {
            byte[] bArr = (byte[]) bekVar.a(j, byte[].class);
            try {
                if (bhkVar.b(bArr, j) == j && i(bArr, j, b)) {
                    bekVar.c(bArr);
                    return true;
                }
                bekVar.c(bArr);
                j = j(bhkVar, 226);
            } catch (Throwable th) {
                bekVar.c(bArr);
                throw th;
            }
        }
        return false;
    }

    @Override // defpackage.baz
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return h(new bhl(inputStream, 0));
    }

    @Override // defpackage.baz
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return h(new bhl(byteBuffer, 1));
    }

    @Override // defpackage.baz
    public final int c(InputStream inputStream, bek bekVar) {
        return k(new bhl(inputStream, 0), bekVar);
    }

    @Override // defpackage.baz
    public final int d(ByteBuffer byteBuffer, bek bekVar) {
        return k(new bhl(byteBuffer, 1), bekVar);
    }

    @Override // defpackage.baz
    public final boolean e(InputStream inputStream, bek bekVar) {
        return l(new bhl(inputStream, 0), bekVar);
    }

    @Override // defpackage.baz
    public final boolean f(ByteBuffer byteBuffer, bek bekVar) {
        return l(new bhl(byteBuffer, 1), bekVar);
    }
}
