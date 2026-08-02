package S0;

import E.AbstractC0005f;
import E1.P;
import T.C0096n;
import T.D;
import T.E;
import T.F;
import W.AbstractC0108a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import v2.G;
import v2.I;
import y0.C;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2536a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static String b(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str2 = ((A) obj).f2382a.f2543g.n;
            if (F.m(str2)) {
                return "video/mp4";
            }
            if (F.i(str2)) {
                z = true;
            } else if (F.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean c(int i4, boolean z) {
        if ((i4 >>> 8) == 3368816) {
            return true;
        }
        if (i4 == 1751476579 && z) {
            return true;
        }
        for (int i5 = 0; i5 < 29; i5++) {
            if (f2536a[i5] == i4) {
                return true;
            }
        }
        return false;
    }

    public static M0.e d(int i4, W.u uVar) {
        int m4 = uVar.m();
        if (uVar.m() == 1684108385) {
            uVar.N(8);
            String v = uVar.v(m4 - 16);
            return new M0.e("und", v, v);
        }
        AbstractC0108a.s("MetadataUtil", "Failed to parse comment attribute: " + X.e.d(i4));
        return null;
    }

    public static M0.a e(W.u uVar) {
        int m4 = uVar.m();
        if (uVar.m() != 1684108385) {
            AbstractC0108a.s("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int m5 = uVar.m();
        byte[] bArr = j.f2428a;
        int i4 = m5 & 16777215;
        String str = i4 == 13 ? "image/jpeg" : i4 == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC0005f.u(i4, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        uVar.N(4);
        int i5 = m4 - 16;
        byte[] bArr2 = new byte[i5];
        uVar.k(bArr2, 0, i5);
        return new M0.a(str, null, bArr2, 3);
    }

    public static M0.n f(int i4, W.u uVar, String str) {
        int m4 = uVar.m();
        if (uVar.m() == 1684108385 && m4 >= 22) {
            uVar.N(10);
            int G4 = uVar.G();
            if (G4 > 0) {
                String j4 = AbstractC0005f.j(G4, "");
                int G5 = uVar.G();
                if (G5 > 0) {
                    j4 = j4 + "/" + G5;
                }
                return new M0.n(str, null, I.o(j4));
            }
        }
        AbstractC0108a.s("MetadataUtil", "Failed to parse index/count attribute: " + X.e.d(i4));
        return null;
    }

    public static int g(W.u uVar) {
        int m4 = uVar.m();
        if (uVar.m() == 1684108385) {
            uVar.N(8);
            int i4 = m4 - 16;
            if (i4 == 1) {
                return uVar.z();
            }
            if (i4 == 2) {
                return uVar.G();
            }
            if (i4 == 3) {
                return uVar.C();
            }
            if (i4 == 4 && (uVar.j() & 128) == 0) {
                return uVar.D();
            }
        }
        AbstractC0108a.s("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static M0.i h(int i4, String str, W.u uVar, boolean z, boolean z4) {
        int g4 = g(uVar);
        if (z4) {
            g4 = Math.min(1, g4);
        }
        if (g4 >= 0) {
            return z ? new M0.n(str, null, I.o(Integer.toString(g4))) : new M0.e("und", str, Integer.toString(g4));
        }
        AbstractC0108a.s("MetadataUtil", "Failed to parse uint8 attribute: " + X.e.d(i4));
        return null;
    }

    public static t1.h i(byte[] bArr) {
        UUID[] uuidArr;
        W.u uVar = new W.u(bArr);
        if (uVar.f3353c < 32) {
            return null;
        }
        uVar.M(0);
        int a3 = uVar.a();
        int m4 = uVar.m();
        if (m4 != a3) {
            AbstractC0108a.s("PsshAtomUtil", "Advertised atom size (" + m4 + ") does not match buffer size: " + a3);
            return null;
        }
        int m5 = uVar.m();
        if (m5 != 1886614376) {
            AbstractC0005f.u(m5, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e4 = j.e(uVar.m());
        if (e4 > 1) {
            AbstractC0005f.u(e4, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(uVar.t(), uVar.t());
        if (e4 == 1) {
            int D3 = uVar.D();
            uuidArr = new UUID[D3];
            for (int i4 = 0; i4 < D3; i4++) {
                uuidArr[i4] = new UUID(uVar.t(), uVar.t());
            }
        } else {
            uuidArr = null;
        }
        int D4 = uVar.D();
        int a4 = uVar.a();
        if (D4 == a4) {
            byte[] bArr2 = new byte[D4];
            uVar.k(bArr2, 0, D4);
            return new t1.h(uuid, e4, bArr2, uuidArr);
        }
        AbstractC0108a.s("PsshAtomUtil", "Atom data size (" + D4 + ") does not match the bytes left: " + a4);
        return null;
    }

    public static M0.n j(int i4, W.u uVar, String str) {
        int m4 = uVar.m();
        if (uVar.m() == 1684108385) {
            uVar.N(8);
            return new M0.n(str, null, I.o(uVar.v(m4 - 16)));
        }
        AbstractC0108a.s("MetadataUtil", "Failed to parse text attribute: " + X.e.d(i4));
        return null;
    }

    public static void k(int i4, E e4, C0096n c0096n, E e5, E... eArr) {
        if (e5 == null) {
            e5 = new E(new D[0]);
        }
        if (e4 != null) {
            v2.F j4 = I.j();
            for (D d4 : e4.f2655a) {
                if (X.a.class.isAssignableFrom(d4.getClass())) {
                    j4.b((D) X.a.class.cast(d4));
                }
            }
            G listIterator = j4.f().listIterator(0);
            while (listIterator.hasNext()) {
                X.a aVar = (X.a) listIterator.next();
                if (!aVar.f3486a.equals("com.android.capture.fps") || i4 == 2) {
                    e5 = e5.a(aVar);
                }
            }
        }
        for (E e6 : eArr) {
            e5 = e5.b(e6);
        }
        if (e5.f2655a.length > 0) {
            c0096n.f2829k = e5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C l(y0.o oVar, boolean z, boolean z4) {
        C c4;
        int i4;
        long j4;
        int i5;
        int i6;
        long j5;
        int i7;
        int[] iArr;
        long length = oVar.getLength();
        long j6 = -1;
        long j7 = 4096;
        if (length != -1 && length <= 4096) {
            j7 = length;
        }
        int i8 = (int) j7;
        W.u uVar = new W.u(64);
        int i9 = 0;
        int i10 = 0;
        boolean z5 = false;
        while (i10 < i8) {
            uVar.J(8);
            boolean z6 = true;
            if (!oVar.l(uVar.f3351a, i9, 8, true)) {
                break;
            }
            long B4 = uVar.B();
            int m4 = uVar.m();
            if (B4 == 1) {
                j4 = j6;
                oVar.E(uVar.f3351a, 8, 8);
                i6 = 16;
                uVar.L(16);
                B4 = uVar.t();
                i5 = i10;
            } else {
                j4 = j6;
                if (B4 == 0) {
                    long length2 = oVar.getLength();
                    if (length2 != j4) {
                        i5 = i10;
                        B4 = (length2 - oVar.m()) + 8;
                        i6 = 8;
                    }
                }
                i5 = i10;
                i6 = 8;
            }
            long j8 = B4;
            long j9 = i6;
            if (j8 < j9) {
                c4 = null;
                if (m4 != 1718773093 || i6 != 8) {
                    return new C0082a(j8, m4, i6);
                }
                j8 = j9;
            } else {
                c4 = null;
            }
            int i11 = i5 + i6;
            if (m4 == 1836019574) {
                i8 += (int) j8;
                if (length != -1 && i8 > length) {
                    i8 = (int) length;
                }
                i10 = i11;
                j6 = j4;
                i9 = 0;
            } else {
                if (m4 != 1953653099 && m4 != 1835297121 && m4 != 1835626086) {
                    if (m4 != 1836019558 && m4 != 1836475768) {
                        if (m4 == 1835295092) {
                            z5 = true;
                        }
                        if (m4 != 1937007212 || j8 <= 1000000) {
                            j5 = length;
                            if ((i11 + j8) - j9 < i8) {
                                int i12 = (int) (j8 - j9);
                                i10 = i11 + i12;
                                if (m4 != 1718909296) {
                                    i7 = 0;
                                    if (i12 != 0) {
                                        oVar.o(i12);
                                    }
                                } else {
                                    if (i12 < 8) {
                                        return new C0082a(i12, m4, 8);
                                    }
                                    uVar.J(i12);
                                    i7 = 0;
                                    oVar.E(uVar.f3351a, 0, i12);
                                    int m5 = uVar.m();
                                    if (c(m5, z4)) {
                                        z5 = true;
                                    }
                                    uVar.N(4);
                                    int a3 = uVar.a() / 4;
                                    if (!z5 && a3 > 0) {
                                        iArr = new int[a3];
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= a3) {
                                                z6 = z5;
                                                break;
                                            }
                                            int m6 = uVar.m();
                                            iArr[i13] = m6;
                                            if (c(m6, z4)) {
                                                break;
                                            }
                                            i13++;
                                        }
                                    } else {
                                        z6 = z5;
                                        iArr = c4;
                                    }
                                    if (!z6) {
                                        return new P(iArr, m5);
                                    }
                                    z5 = z6;
                                }
                            }
                        }
                        i4 = 0;
                        break;
                    }
                    i4 = 1;
                    break;
                }
                j5 = length;
                i7 = 0;
                i10 = i11;
                i9 = i7;
                j6 = j4;
                length = j5;
            }
        }
        c4 = null;
        i4 = i9;
        return !z5 ? t.f2528a : z != i4 ? i4 != 0 ? p.f2488b : p.f2489c : c4;
    }
}
