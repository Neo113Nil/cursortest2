package M0;

import E.AbstractC0005f;
import T.E;
import T.F;
import W.AbstractC0108a;
import W.J;
import W.t;
import W.u;
import i2.AbstractC0457a;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class h extends AbstractC0457a {

    /* renamed from: l, reason: collision with root package name */
    public static final D0.d f1719l = new D0.d(6);

    /* renamed from: k, reason: collision with root package name */
    public final D0.d f1720k;

    public h(D0.d dVar) {
        this.f1720k = dVar;
    }

    public static a I(u uVar, int i4, int i5) {
        int a02;
        String concat;
        int z = uVar.z();
        Charset X4 = X(z);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        uVar.k(bArr, 0, i6);
        if (i5 == 2) {
            concat = "image/" + U.i.D(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            a02 = 2;
        } else {
            a02 = a0(0, bArr);
            String D3 = U.i.D(new String(bArr, 0, a02, StandardCharsets.ISO_8859_1));
            concat = D3.indexOf(47) == -1 ? "image/".concat(D3) : D3;
        }
        int i7 = bArr[a02 + 1] & 255;
        int i8 = a02 + 2;
        int Z3 = Z(bArr, i8, z);
        String str = new String(bArr, i8, Z3 - i8, X4);
        int W4 = W(z) + Z3;
        return new a(concat, str, i6 <= W4 ? J.f3264b : Arrays.copyOfRange(bArr, W4, i6), i7);
    }

    public static c J(u uVar, int i4, int i5, boolean z, int i6, D0.d dVar) {
        int i7 = uVar.f3352b;
        int a02 = a0(i7, uVar.f3351a);
        String str = new String(uVar.f3351a, i7, a02 - i7, StandardCharsets.ISO_8859_1);
        uVar.M(a02 + 1);
        int m4 = uVar.m();
        int m5 = uVar.m();
        long B4 = uVar.B();
        if (B4 == KeyboardMap.kValueMask) {
            B4 = -1;
        }
        long B5 = uVar.B();
        long j4 = B5 == KeyboardMap.kValueMask ? -1L : B5;
        ArrayList arrayList = new ArrayList();
        int i8 = i7 + i4;
        while (uVar.f3352b < i8) {
            i M4 = M(i5, uVar, z, i6, dVar);
            if (M4 != null) {
                arrayList.add(M4);
            }
        }
        return new c(str, m4, m5, B4, j4, (i[]) arrayList.toArray(new i[0]));
    }

    public static d K(u uVar, int i4, int i5, boolean z, int i6, D0.d dVar) {
        int i7 = uVar.f3352b;
        int a02 = a0(i7, uVar.f3351a);
        String str = new String(uVar.f3351a, i7, a02 - i7, StandardCharsets.ISO_8859_1);
        uVar.M(a02 + 1);
        int z4 = uVar.z();
        boolean z5 = (z4 & 2) != 0;
        boolean z6 = (z4 & 1) != 0;
        int z7 = uVar.z();
        String[] strArr = new String[z7];
        for (int i8 = 0; i8 < z7; i8++) {
            int i9 = uVar.f3352b;
            int a03 = a0(i9, uVar.f3351a);
            strArr[i8] = new String(uVar.f3351a, i9, a03 - i9, StandardCharsets.ISO_8859_1);
            uVar.M(a03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = i7 + i4;
        while (uVar.f3352b < i10) {
            i M4 = M(i5, uVar, z, i6, dVar);
            if (M4 != null) {
                arrayList.add(M4);
            }
        }
        return new d(str, z5, z6, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e L(int i4, u uVar) {
        if (i4 < 4) {
            return null;
        }
        int z = uVar.z();
        Charset X4 = X(z);
        byte[] bArr = new byte[3];
        uVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i5 = i4 - 4;
        byte[] bArr2 = new byte[i5];
        uVar.k(bArr2, 0, i5);
        int Z3 = Z(bArr2, 0, z);
        String str2 = new String(bArr2, 0, Z3, X4);
        int W4 = W(z) + Z3;
        return new e(str, str2, Q(bArr2, W4, Z(bArr2, W4, z), X4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01a0, code lost:
    
        if (r10 == 67) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i M(int i4, u uVar, boolean z, int i5, D0.d dVar) {
        int D3;
        i iVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Throwable th;
        i iVar2;
        ?? r02;
        i bVar;
        boolean z9;
        int i6 = i4;
        u uVar2 = uVar;
        int z10 = uVar2.z();
        int z11 = uVar2.z();
        int z12 = uVar2.z();
        int z13 = i6 >= 3 ? uVar2.z() : 0;
        if (i6 == 4) {
            D3 = uVar2.D();
            if (!z) {
                D3 = (((D3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) << 21) | (D3 & KotlinVersion.MAX_COMPONENT_VALUE) | (((D3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 7) | (((D3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 14);
            }
        } else {
            D3 = i6 == 3 ? uVar2.D() : uVar2.C();
        }
        int G4 = i6 >= 3 ? uVar2.G() : 0;
        if (z10 == 0 && z11 == 0 && z12 == 0 && z13 == 0 && D3 == 0 && G4 == 0) {
            uVar2.M(uVar2.f3353c);
            return null;
        }
        int i7 = uVar2.f3352b + D3;
        if (i7 > uVar2.f3353c) {
            AbstractC0108a.s("Id3Decoder", "Frame size exceeds remaining tag data");
            uVar2.M(uVar2.f3353c);
            return null;
        }
        if (dVar != null) {
            switch (dVar.f339a) {
                case 6:
                    iVar = null;
                    z9 = false;
                    break;
                default:
                    iVar = null;
                    if ((z10 == 67 && z11 == 79 && z12 == 77 && (z13 == 77 || i6 == 2)) || (z10 == 77 && z11 == 76 && z12 == 76 && (z13 == 84 || i6 == 2))) {
                        z9 = true;
                        break;
                    }
                    z9 = false;
                    break;
            }
            if (!z9) {
                uVar2.M(i7);
                return iVar;
            }
        } else {
            iVar = null;
        }
        if (i6 == 3) {
            z4 = (G4 & 128) != 0;
            z7 = (G4 & 64) != 0;
            z8 = false;
            z6 = (G4 & 32) != 0;
            z5 = z4;
        } else if (i6 == 4) {
            boolean z14 = (G4 & 64) != 0;
            boolean z15 = (G4 & 8) != 0;
            z7 = (G4 & 4) != 0;
            z8 = (G4 & 2) != 0;
            z5 = (G4 & 1) != 0;
            boolean z16 = z15;
            z6 = z14;
            z4 = z16;
        } else {
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
        }
        if (z4 || z7) {
            AbstractC0108a.s("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            uVar2.M(i7);
            return iVar;
        }
        if (z6) {
            D3--;
            uVar2.N(1);
        }
        if (z5) {
            D3 -= 4;
            uVar2.N(4);
        }
        if (z8) {
            D3 = b0(D3, uVar2);
        }
        int i8 = D3;
        try {
        } catch (Exception e4) {
            th = e4;
        } catch (OutOfMemoryError e5) {
            th = e5;
        } catch (Throwable th2) {
            th = th2;
        }
        if (z10 == 84 && z11 == 88 && z12 == 88 && (i6 == 2 || z13 == 88)) {
            bVar = T(i8, uVar2);
        } else if (z10 == 84) {
            bVar = R(i8, uVar2, Y(i6, z10, z11, z12, z13));
        } else if (z10 == 87 && z11 == 88 && z12 == 88 && (i6 == 2 || z13 == 88)) {
            bVar = V(i8, uVar2);
        } else if (z10 == 87) {
            bVar = U(i8, uVar2, Y(i6, z10, z11, z12, z13));
        } else if (z10 == 80 && z11 == 82 && z12 == 73 && z13 == 86) {
            bVar = P(i8, uVar2);
        } else if (z10 == 71 && z11 == 69 && z12 == 79 && (z13 == 66 || i6 == 2)) {
            bVar = N(i8, uVar2);
        } else if (i6 == 2) {
            if (z10 == 80 && z11 == 73 && z12 == 67) {
                bVar = I(uVar2, i8, i6);
            }
            if (z10 != 67 && z11 == 79 && z12 == 77 && (z13 == 77 || i6 == 2)) {
                bVar = L(i8, uVar2);
            } else {
                if (z10 != 67 && z11 == 72 && z12 == 65 && z13 == 80) {
                    try {
                        bVar = J(uVar2, i8, i6, z, i5, dVar);
                        i6 = i4;
                        uVar2 = uVar;
                        uVar2.M(i7);
                        iVar2 = bVar;
                        r02 = iVar;
                    } catch (Exception e6) {
                        e = e6;
                        i6 = i4;
                        uVar2 = uVar;
                        th = e;
                        uVar2.M(i7);
                        iVar2 = iVar;
                        r02 = th;
                        if (iVar2 == null) {
                        }
                        return iVar2;
                    } catch (OutOfMemoryError e7) {
                        e = e7;
                        i6 = i4;
                        uVar2 = uVar;
                        th = e;
                        uVar2.M(i7);
                        iVar2 = iVar;
                        r02 = th;
                        if (iVar2 == null) {
                        }
                        return iVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        uVar2 = uVar;
                        uVar2.M(i7);
                        throw th;
                    }
                    if (iVar2 == null) {
                        AbstractC0108a.t("Id3Decoder", "Failed to decode frame: id=" + Y(i6, z10, z11, z12, z13) + ", frameSize=" + i8, r02);
                    }
                    return iVar2;
                }
                if (z10 != 67 && z11 == 84 && z12 == 79 && z13 == 67) {
                    i6 = i4;
                    uVar2 = uVar;
                    bVar = K(uVar2, i8, i6, z, i5, dVar);
                } else {
                    i6 = i4;
                    uVar2 = uVar;
                    if (z10 != 77 && z11 == 76 && z12 == 76 && z13 == 84) {
                        bVar = O(i8, uVar2);
                    } else {
                        String Y2 = Y(i6, z10, z11, z12, z13);
                        byte[] bArr = new byte[i8];
                        uVar2.k(bArr, 0, i8);
                        bVar = new b(Y2, bArr);
                    }
                }
            }
        } else {
            if (z10 == 65) {
                if (z11 == 80) {
                    if (z12 == 73) {
                    }
                }
            }
            if (z10 != 67) {
            }
            if (z10 != 67) {
            }
            if (z10 != 67) {
            }
            i6 = i4;
            uVar2 = uVar;
            if (z10 != 77) {
            }
            String Y22 = Y(i6, z10, z11, z12, z13);
            byte[] bArr2 = new byte[i8];
            uVar2.k(bArr2, 0, i8);
            bVar = new b(Y22, bArr2);
        }
        uVar2.M(i7);
        iVar2 = bVar;
        r02 = iVar;
        if (iVar2 == null) {
        }
        return iVar2;
    }

    public static f N(int i4, u uVar) {
        int z = uVar.z();
        Charset X4 = X(z);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        uVar.k(bArr, 0, i5);
        int a02 = a0(0, bArr);
        String n = F.n(new String(bArr, 0, a02, StandardCharsets.ISO_8859_1));
        int i6 = a02 + 1;
        int Z3 = Z(bArr, i6, z);
        String Q4 = Q(bArr, i6, Z3, X4);
        int W4 = W(z) + Z3;
        int Z4 = Z(bArr, W4, z);
        String Q5 = Q(bArr, W4, Z4, X4);
        int W5 = W(z) + Z4;
        return new f(n, Q4, Q5, i5 <= W5 ? J.f3264b : Arrays.copyOfRange(bArr, W5, i5));
    }

    public static l O(int i4, u uVar) {
        int G4 = uVar.G();
        int C4 = uVar.C();
        int C5 = uVar.C();
        int z = uVar.z();
        int z4 = uVar.z();
        t tVar = new t();
        tVar.p(uVar);
        int i5 = ((i4 - 10) * 8) / (z + z4);
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = tVar.i(z);
            int i8 = tVar.i(z4);
            iArr[i6] = i7;
            iArr2[i6] = i8;
        }
        return new l(G4, C4, C5, iArr, iArr2);
    }

    public static m P(int i4, u uVar) {
        byte[] bArr = new byte[i4];
        uVar.k(bArr, 0, i4);
        int a02 = a0(0, bArr);
        String str = new String(bArr, 0, a02, StandardCharsets.ISO_8859_1);
        int i5 = a02 + 1;
        return new m(str, i4 <= i5 ? J.f3264b : Arrays.copyOfRange(bArr, i5, i4));
    }

    public static String Q(byte[] bArr, int i4, int i5, Charset charset) {
        return (i5 <= i4 || i5 > bArr.length) ? "" : new String(bArr, i4, i5 - i4, charset);
    }

    public static n R(int i4, u uVar, String str) {
        if (i4 < 1) {
            return null;
        }
        int z = uVar.z();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        uVar.k(bArr, 0, i5);
        return new n(str, null, S(bArr, z, 0));
    }

    public static a0 S(byte[] bArr, int i4, int i5) {
        if (i5 >= bArr.length) {
            return I.o("");
        }
        v2.F j4 = I.j();
        int Z3 = Z(bArr, i5, i4);
        while (i5 < Z3) {
            j4.b(new String(bArr, i5, Z3 - i5, X(i4)));
            i5 = W(i4) + Z3;
            Z3 = Z(bArr, i5, i4);
        }
        a0 f4 = j4.f();
        return f4.isEmpty() ? I.o("") : f4;
    }

    public static n T(int i4, u uVar) {
        if (i4 < 1) {
            return null;
        }
        int z = uVar.z();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        uVar.k(bArr, 0, i5);
        int Z3 = Z(bArr, 0, z);
        return new n("TXXX", new String(bArr, 0, Z3, X(z)), S(bArr, z, W(z) + Z3));
    }

    public static o U(int i4, u uVar, String str) {
        byte[] bArr = new byte[i4];
        uVar.k(bArr, 0, i4);
        return new o(str, null, new String(bArr, 0, a0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o V(int i4, u uVar) {
        if (i4 < 1) {
            return null;
        }
        int z = uVar.z();
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        uVar.k(bArr, 0, i5);
        int Z3 = Z(bArr, 0, z);
        String str = new String(bArr, 0, Z3, X(z));
        int W4 = W(z) + Z3;
        return new o("WXXX", str, Q(bArr, W4, a0(W4, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int W(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    public static Charset X(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String Y(int i4, int i5, int i6, int i7, int i8) {
        return i4 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static int Z(byte[] bArr, int i4, int i5) {
        int a02 = a0(i4, bArr);
        if (i5 == 0 || i5 == 3) {
            return a02;
        }
        while (a02 < bArr.length - 1) {
            if ((a02 - i4) % 2 == 0 && bArr[a02 + 1] == 0) {
                return a02;
            }
            a02 = a0(a02 + 1, bArr);
        }
        return bArr.length;
    }

    public static int a0(int i4, byte[] bArr) {
        while (i4 < bArr.length) {
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
        return bArr.length;
    }

    public static int b0(int i4, u uVar) {
        byte[] bArr = uVar.f3351a;
        int i5 = uVar.f3352b;
        int i6 = i5;
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= i5 + i4) {
                return i4;
            }
            if ((bArr[i6] & 255) == 255 && bArr[i7] == 0) {
                System.arraycopy(bArr, i6 + 2, bArr, i7, (i4 - (i6 - i5)) - 2);
                i4--;
            }
            i6 = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c0(u uVar, int i4, int i5, boolean z) {
        int C4;
        long C5;
        int i6;
        int i7;
        int i8 = uVar.f3352b;
        while (true) {
            try {
                boolean z4 = true;
                if (uVar.a() < i5) {
                    uVar.M(i8);
                    return true;
                }
                if (i4 >= 3) {
                    C4 = uVar.m();
                    C5 = uVar.B();
                    i6 = uVar.G();
                } else {
                    C4 = uVar.C();
                    C5 = uVar.C();
                    i6 = 0;
                }
                if (C4 == 0 && C5 == 0 && i6 == 0) {
                    uVar.M(i8);
                    return true;
                }
                if (i4 == 4 && !z) {
                    if ((8421504 & C5) != 0) {
                        uVar.M(i8);
                        return false;
                    }
                    C5 = (((C5 >> 24) & 255) << 21) | (C5 & 255) | (((C5 >> 8) & 255) << 7) | (((C5 >> 16) & 255) << 14);
                }
                if (i4 == 4) {
                    i7 = (i6 & 64) != 0 ? 1 : 0;
                } else {
                    if (i4 == 3) {
                        i7 = (i6 & 32) != 0 ? 1 : 0;
                    } else {
                        i7 = 0;
                        z4 = false;
                    }
                    if (z4) {
                        i7 += 4;
                    }
                    if (C5 < i7) {
                        uVar.M(i8);
                        return false;
                    }
                    if (uVar.a() < C5) {
                        uVar.M(i8);
                        return false;
                    }
                    uVar.N((int) C5);
                }
            } catch (Throwable th) {
                uVar.M(i8);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E H(int i4, byte[] bArr) {
        g gVar;
        ArrayList arrayList = new ArrayList();
        u uVar = new u(i4, bArr);
        boolean z = false;
        if (uVar.a() < 10) {
            AbstractC0108a.s("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int C4 = uVar.C();
            if (C4 == 4801587) {
                int z4 = uVar.z();
                uVar.N(1);
                int z5 = uVar.z();
                int y4 = uVar.y();
                if (z4 == 2) {
                    if ((z5 & 64) != 0) {
                        AbstractC0108a.s("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    gVar = new g(z4, z4 >= 4 && (z5 & 128) != 0, y4);
                } else {
                    if (z4 == 3) {
                        if ((z5 & 64) != 0) {
                            int m4 = uVar.m();
                            uVar.N(m4);
                            y4 -= m4 + 4;
                        }
                    } else if (z4 == 4) {
                        if ((z5 & 64) != 0) {
                            int y5 = uVar.y();
                            uVar.N(y5 - 4);
                            y4 -= y5;
                        }
                        if ((z5 & 16) != 0) {
                            y4 -= 10;
                        }
                    } else {
                        AbstractC0005f.u(z4, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    gVar = new g(z4, z4 >= 4 && (z5 & 128) != 0, y4);
                }
                if (gVar != null) {
                    return null;
                }
                int i5 = gVar.f1716a;
                int i6 = uVar.f3352b;
                int i7 = i5 == 2 ? 6 : 10;
                int i8 = gVar.f1718c;
                if (gVar.f1717b) {
                    i8 = b0(i8, uVar);
                }
                uVar.L(i6 + i8);
                if (!c0(uVar, i5, i7, false)) {
                    if (i5 != 4 || !c0(uVar, 4, i7, true)) {
                        AbstractC0005f.u(i5, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z = true;
                }
                while (uVar.a() >= i7) {
                    i M4 = M(i5, uVar, z, i7, this.f1720k);
                    if (M4 != null) {
                        arrayList.add(M4);
                    }
                }
                return new E(arrayList);
            }
            AbstractC0108a.s("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(C4))));
        }
        gVar = null;
        if (gVar != null) {
        }
    }

    @Override // i2.AbstractC0457a
    public final E n(H0.a aVar, ByteBuffer byteBuffer) {
        return H(byteBuffer.limit(), byteBuffer.array());
    }
}
