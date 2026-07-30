package B1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import g1.C4523c;
import g1.C4524d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import s1.InterfaceC4991d;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class l implements InterfaceC4991d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f99a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f100b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f101c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(k kVar, C3112dq c3112dq) {
        try {
            int m8 = kVar.m();
            if ((m8 & 65496) == 65496 || m8 == 19789 || m8 == 18761) {
                int k6 = k(kVar, 225);
                if (k6 != -1) {
                    byte[] bArr = (byte[]) c3112dq.f(k6, byte[].class);
                    try {
                        return l(kVar, bArr, k6);
                    } finally {
                        c3112dq.k(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + m8);
                return -1;
            }
        } catch (j unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(k kVar) {
        try {
            int m8 = kVar.m();
            if (m8 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int u7 = (m8 << 8) | kVar.u();
            if (u7 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int u9 = (u7 << 8) | kVar.u();
            if (u9 == -1991225785) {
                kVar.s(21L);
                try {
                    return kVar.u() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (u9 == 1380533830) {
                kVar.s(4L);
                if (((kVar.m() << 16) | kVar.m()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int m9 = (kVar.m() << 16) | kVar.m();
                if ((m9 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = m9 & com.anythink.basead.exoplayer.k.p.f8630b;
                if (i == 88) {
                    kVar.s(4L);
                    short u10 = kVar.u();
                    return (u10 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (u10 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                kVar.s(4L);
                return (kVar.u() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((kVar.m() << 16) | kVar.m()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int m10 = (kVar.m() << 16) | kVar.m();
            if (m10 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i4 = 0;
            boolean z8 = m10 == 1635150182;
            kVar.s(4L);
            int i9 = u9 - 16;
            if (i9 % 4 == 0) {
                while (i4 < 5 && i9 > 0) {
                    int m11 = (kVar.m() << 16) | kVar.m();
                    if (m11 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (m11 == 1635150182) {
                        z8 = true;
                    }
                    i4++;
                    i9 -= 4;
                }
            }
            return z8 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(k kVar, C3112dq c3112dq) {
        boolean j9;
        if (h(kVar) == ImageHeaderParser$ImageType.JPEG) {
            int k6 = k(kVar, 226);
            while (k6 > 0) {
                byte[] bArr = (byte[]) c3112dq.f(k6, byte[].class);
                try {
                    int x3 = kVar.x(k6, bArr);
                    if (x3 != k6) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + k6 + ", actually read: " + x3);
                        }
                        j9 = false;
                    } else {
                        j9 = j(k6, bArr, f100b);
                    }
                    if (j9) {
                        c3112dq.k(bArr);
                        return true;
                    }
                    c3112dq.k(bArr);
                    k6 = k(kVar, 226);
                } catch (Throwable th) {
                    c3112dq.k(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(int i, byte[] bArr, byte[] bArr2) {
        boolean z8 = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z8) {
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                if (bArr[i4] != bArr2[i4]) {
                    return false;
                }
            }
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(k kVar, int i) {
        while (true) {
            short u7 = kVar.u();
            if (u7 == 255) {
                short u9 = kVar.u();
                if (u9 == 218) {
                    break;
                }
                if (u9 != 217) {
                    int m8 = kVar.m() - 2;
                    if (u9 == i) {
                        return m8;
                    }
                    long j9 = m8;
                    long s3 = kVar.s(j9);
                    if (s3 != j9) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder h9 = AbstractC5051n.h(u9, m8, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            h9.append(s3);
                            Log.d("DfltImageHeaderParser", h9.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) u7));
                return -1;
            }
        }
    }

    public static int l(k kVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int x3 = kVar.x(i, bArr);
        if (x3 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + x3);
                return -1;
            }
        } else if (j(i, bArr, f99a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s3 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (s3 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s3));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i9 = i4 + 6;
            short s6 = byteBuffer.remaining() - i9 >= 2 ? byteBuffer.getShort(i9) : (short) -1;
            for (int i10 = 0; i10 < s6; i10++) {
                int i11 = (i10 * 12) + i4 + 8;
                short s9 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : (short) -1;
                if (s9 == 274) {
                    int i12 = i11 + 2;
                    short s10 = byteBuffer.remaining() - i12 >= 2 ? byteBuffer.getShort(i12) : (short) -1;
                    if (s10 >= 1 && s10 <= 12) {
                        int i13 = i11 + 4;
                        int i14 = byteBuffer.remaining() - i13 >= 4 ? byteBuffer.getInt(i13) : -1;
                        if (i14 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder h9 = AbstractC5051n.h(i10, s9, "Got tagIndex=", " tagType=", " formatCode=");
                                h9.append((int) s10);
                                h9.append(" componentCount=");
                                h9.append(i14);
                                Log.d("DfltImageHeaderParser", h9.toString());
                            }
                            int i15 = i14 + f101c[s10];
                            if (i15 <= 4) {
                                int i16 = i11 + 8;
                                if (i16 >= 0 && i16 <= byteBuffer.remaining()) {
                                    if (i15 >= 0 && i15 + i16 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i16 >= 2) {
                                            return byteBuffer.getShort(i16);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s9));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i16 + " tagType=" + ((int) s9));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s10));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s10));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // s1.InterfaceC4991d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        N1.g.c(byteBuffer, "Argument must not be null");
        return h(new C4523c(byteBuffer));
    }

    @Override // s1.InterfaceC4991d
    public final boolean b(InputStream inputStream, C3112dq c3112dq) {
        N1.g.c(inputStream, "Argument must not be null");
        C4524d c4524d = new C4524d(1, inputStream);
        N1.g.c(c3112dq, "Argument must not be null");
        return i(c4524d, c3112dq);
    }

    @Override // s1.InterfaceC4991d
    public final int c(InputStream inputStream, C3112dq c3112dq) {
        C4524d c4524d = new C4524d(1, inputStream);
        N1.g.c(c3112dq, "Argument must not be null");
        return g(c4524d, c3112dq);
    }

    @Override // s1.InterfaceC4991d
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return h(new C4524d(1, inputStream));
    }

    @Override // s1.InterfaceC4991d
    public final boolean e(ByteBuffer byteBuffer, C3112dq c3112dq) {
        C4523c c4523c = new C4523c(byteBuffer);
        N1.g.c(c3112dq, "Argument must not be null");
        return i(c4523c, c3112dq);
    }

    @Override // s1.InterfaceC4991d
    public final int f(ByteBuffer byteBuffer, C3112dq c3112dq) {
        C4523c c4523c = new C4523c(byteBuffer);
        N1.g.c(c3112dq, "Argument must not be null");
        return g(c4523c, c3112dq);
    }
}
