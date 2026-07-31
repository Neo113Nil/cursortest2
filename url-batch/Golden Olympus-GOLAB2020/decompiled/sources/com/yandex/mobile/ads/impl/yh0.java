package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class yh0 extends hy1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f35137b = new a() { // from class: com.yandex.mobile.ads.impl.Wl
        @Override // com.yandex.mobile.ads.impl.yh0.a
        public final boolean a(int i4, int i5, int i6, int i7, int i8) {
            boolean b4;
            b4 = yh0.b(i4, i5, i6, i7, i8);
            return b4;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a f35138a;

    public interface a {
        boolean a(int i4, int i5, int i6, int i7, int i8);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f35139a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f35140b;

        /* renamed from: c, reason: collision with root package name */
        private final int f35141c;

        public b(int i4, int i5, boolean z4) {
            this.f35139a = i4;
            this.f35140b = z4;
            this.f35141c = i5;
        }
    }

    public yh0(a aVar) {
        this.f35138a = aVar;
    }

    private static int a(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i4, int i5, int i6, int i7, int i8) {
        return false;
    }

    private static yk1 d(int i4, sf1 sf1Var) {
        byte[] bArr = new byte[i4];
        sf1Var.a(bArr, 0, i4);
        int b4 = b(0, bArr);
        String str = new String(bArr, 0, b4, "ISO-8859-1");
        int i5 = b4 + 1;
        return new yk1(str, i4 <= i5 ? u82.f32878f : Arrays.copyOfRange(bArr, i5, i4));
    }

    private static h42 e(int i4, sf1 sf1Var) {
        if (i4 < 1) {
            return null;
        }
        int t4 = sf1Var.t();
        String b4 = b(t4);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        sf1Var.a(bArr, 0, i5);
        int a4 = a(bArr, 0, t4);
        String str = new String(bArr, 0, a4, b4);
        int a5 = a4 + a(t4);
        return new h42("TXXX", str, a(a5, a(bArr, a5, t4), b4, bArr));
    }

    private static g82 f(int i4, sf1 sf1Var) {
        if (i4 < 1) {
            return null;
        }
        int t4 = sf1Var.t();
        String b4 = b(t4);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        sf1Var.a(bArr, 0, i5);
        int a4 = a(bArr, 0, t4);
        String str = new String(bArr, 0, a4, b4);
        int a5 = a4 + a(t4);
        return new g82("WXXX", str, a(a5, b(a5, bArr), "ISO-8859-1", bArr));
    }

    private static int g(int i4, sf1 sf1Var) {
        byte[] c4 = sf1Var.c();
        int d4 = sf1Var.d();
        int i5 = d4;
        while (true) {
            int i6 = i5 + 1;
            if (i6 >= d4 + i4) {
                return i4;
            }
            if ((c4[i5] & 255) == 255 && c4[i6] == 0) {
                System.arraycopy(c4, i5 + 2, c4, i6, (i4 - (i5 - d4)) - 2);
                i4--;
            }
            i5 = i6;
        }
    }

    private static sn b(sf1 sf1Var, int i4, int i5, boolean z4, int i6, a aVar) {
        int d4 = sf1Var.d();
        int b4 = b(d4, sf1Var.c());
        String str = new String(sf1Var.c(), d4, b4 - d4, "ISO-8859-1");
        sf1Var.e(b4 + 1);
        int t4 = sf1Var.t();
        boolean z5 = (t4 & 2) != 0;
        boolean z6 = (t4 & 1) != 0;
        int t5 = sf1Var.t();
        String[] strArr = new String[t5];
        for (int i7 = 0; i7 < t5; i7++) {
            int d5 = sf1Var.d();
            int b5 = b(d5, sf1Var.c());
            strArr[i7] = new String(sf1Var.c(), d5, b5 - d5, "ISO-8859-1");
            sf1Var.e(b5 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = d4 + i4;
        while (sf1Var.d() < i8) {
            zh0 a4 = a(i5, sf1Var, z4, i6, aVar);
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        return new sn(str, z5, z6, strArr, (zh0[]) arrayList.toArray(new zh0[0]));
    }

    private static k01 c(int i4, sf1 sf1Var) {
        int z4 = sf1Var.z();
        int w4 = sf1Var.w();
        int w5 = sf1Var.w();
        int t4 = sf1Var.t();
        int t5 = sf1Var.t();
        rf1 rf1Var = new rf1();
        rf1Var.a(sf1Var.e(), sf1Var.c());
        rf1Var.c(sf1Var.d() * 8);
        int i5 = ((i4 - 10) * 8) / (t4 + t5);
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int b4 = rf1Var.b(t4);
            int b5 = rf1Var.b(t5);
            iArr[i6] = b4;
            iArr2[i6] = b5;
        }
        return new k01(z4, w4, w5, iArr, iArr2);
    }

    @Override // com.yandex.mobile.ads.impl.hy1
    protected final wz0 a(zz0 zz0Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    private static C2320wd a(int i4, int i5, sf1 sf1Var) {
        int b4;
        String b5;
        byte[] copyOfRange;
        int t4 = sf1Var.t();
        String b6 = b(t4);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        sf1Var.a(bArr, 0, i6);
        if (i5 == 2) {
            String str = "image/" + C2207rf.b(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            b5 = str;
            b4 = 2;
        } else {
            b4 = b(0, bArr);
            b5 = C2207rf.b(new String(bArr, 0, b4, "ISO-8859-1"));
            if (b5.indexOf(47) == -1) {
                b5 = "image/".concat(b5);
            }
        }
        int i7 = bArr[b4 + 1] & 255;
        int i8 = b4 + 2;
        int a4 = a(bArr, i8, t4);
        String str2 = new String(bArr, i8, a4 - i8, b6);
        int a5 = a4 + a(t4);
        if (i6 <= a5) {
            copyOfRange = u82.f32878f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, a5, i6);
        }
        return new C2320wd(b5, str2, i7, copyOfRange);
    }

    private static yd0 b(int i4, sf1 sf1Var) {
        byte[] copyOfRange;
        int t4 = sf1Var.t();
        String b4 = b(t4);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        sf1Var.a(bArr, 0, i5);
        int b5 = b(0, bArr);
        String str = new String(bArr, 0, b5, "ISO-8859-1");
        int i6 = b5 + 1;
        int a4 = a(bArr, i6, t4);
        String a5 = a(i6, a4, b4, bArr);
        int a6 = a4 + a(t4);
        int a7 = a(bArr, a6, t4);
        String a8 = a(a6, a7, b4, bArr);
        int a9 = a7 + a(t4);
        if (i5 <= a9) {
            copyOfRange = u82.f32878f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, a9, i5);
        }
        return new yd0(str, a5, a8, copyOfRange);
    }

    private static rn a(sf1 sf1Var, int i4, int i5, boolean z4, int i6, a aVar) {
        int d4 = sf1Var.d();
        int b4 = b(d4, sf1Var.c());
        String str = new String(sf1Var.c(), d4, b4 - d4, "ISO-8859-1");
        sf1Var.e(b4 + 1);
        int h4 = sf1Var.h();
        int h5 = sf1Var.h();
        long v4 = sf1Var.v();
        if (v4 == 4294967295L) {
            v4 = -1;
        }
        long v5 = sf1Var.v();
        long j4 = v5 == 4294967295L ? -1L : v5;
        ArrayList arrayList = new ArrayList();
        int i7 = d4 + i4;
        while (sf1Var.d() < i7) {
            zh0 a4 = a(i5, sf1Var, z4, i6, aVar);
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        return new rn(str, h4, h5, v4, j4, (zh0[]) arrayList.toArray(new zh0[0]));
    }

    private static g82 b(int i4, sf1 sf1Var, String str) {
        byte[] bArr = new byte[i4];
        sf1Var.a(bArr, 0, i4);
        return new g82(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    private static gq a(int i4, sf1 sf1Var) {
        if (i4 < 4) {
            return null;
        }
        int t4 = sf1Var.t();
        String b4 = b(t4);
        byte[] bArr = new byte[3];
        sf1Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i5 = i4 - 4;
        byte[] bArr2 = new byte[i5];
        sf1Var.a(bArr2, 0, i5);
        int a4 = a(bArr2, 0, t4);
        String str2 = new String(bArr2, 0, a4, b4);
        int a5 = a4 + a(t4);
        return new gq(str, str2, a(a5, a(bArr2, a5, t4), b4, bArr2));
    }

    private static String b(int i4) {
        if (i4 == 1) {
            return "UTF-16";
        }
        if (i4 == 2) {
            return "UTF-16BE";
        }
        if (i4 != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }

    private static int b(int i4, byte[] bArr) {
        while (i4 < bArr.length) {
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b1, code lost:
    
        if (r4 == 67) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0239 A[Catch: all -> 0x0210, UnsupportedEncodingException -> 0x0258, TRY_LEAVE, TryCatch #1 {all -> 0x0210, blocks: (B:61:0x0239, B:122:0x0258, B:136:0x020b, B:144:0x0222, B:145:0x0227), top: B:52:0x011e }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.yandex.mobile.ads.impl.sf1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.yandex.mobile.ads.impl.sf1] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zh0 a(int i4, sf1 sf1Var, boolean z4, int i5, a aVar) {
        int w4;
        ?? r12;
        int i6;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        zh0 zh0Var;
        boolean z7;
        boolean z8;
        sf1 sf1Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        sf1 sf1Var3;
        zh0 c2212rk;
        int i13 = i4;
        int t4 = sf1Var.t();
        int t5 = sf1Var.t();
        int t6 = sf1Var.t();
        int t7 = i13 >= 3 ? sf1Var.t() : 0;
        if (i13 == 4) {
            w4 = sf1Var.x();
            if (!z4) {
                w4 = (((w4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) << 21) | (w4 & KotlinVersion.MAX_COMPONENT_VALUE) | (((w4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 7) | (((w4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 14);
            }
        } else if (i13 == 3) {
            w4 = sf1Var.x();
        } else {
            w4 = sf1Var.w();
        }
        int i14 = w4;
        int z9 = i13 >= 3 ? sf1Var.z() : 0;
        if (t4 == 0 && t5 == 0 && t6 == 0 && t7 == 0 && i14 == 0 && z9 == 0) {
            sf1Var.e(sf1Var.e());
            return null;
        }
        int d4 = sf1Var.d() + i14;
        if (d4 > sf1Var.e()) {
            ms0.d("Id3Decoder", "Frame size exceeds remaining tag data");
            sf1Var.e(sf1Var.e());
            return null;
        }
        if (aVar != null) {
            boolean a4 = aVar.a(i13, t4, t5, t6, t7);
            i13 = i13;
            r12 = t5;
            i6 = t4;
            i7 = t6;
            i8 = t7;
            if (!a4) {
                sf1Var.e(d4);
                return null;
            }
        } else {
            r12 = t5;
            i6 = t4;
            i7 = t6;
            i8 = t7;
        }
        if (i13 == 3) {
            z5 = (z9 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            z7 = (z9 & 64) != 0;
            z8 = false;
            zh0Var = (z9 & 32) != 0 ? 1 : null;
            z6 = z5;
        } else if (i13 == 4) {
            zh0 zh0Var2 = (z9 & 64) != 0 ? 1 : null;
            boolean z10 = (z9 & 8) != 0;
            z7 = (z9 & 4) != 0;
            z8 = (z9 & 2) != 0;
            if ((z9 & 1) != 0) {
                boolean z11 = z10;
                zh0Var = zh0Var2;
                z5 = z11;
                z6 = true;
            } else {
                boolean z12 = z10;
                zh0Var = zh0Var2;
                z5 = z12;
                z6 = false;
            }
        } else {
            z5 = false;
            z6 = false;
            zh0Var = null;
            z7 = false;
            z8 = false;
        }
        if (!z5 && !z7) {
            if (zh0Var != null) {
                i14--;
                sf1Var.f(1);
            }
            if (z6) {
                i14 -= 4;
                sf1Var.f(4);
            }
            if (z8) {
                i14 = g(i14, sf1Var);
            }
            try {
                try {
                    try {
                        try {
                            if (i6 == 84 && r12 == 88 && i7 == 88 && (i13 == 2 || i8 == 88)) {
                                c2212rk = e(i14, sf1Var);
                            } else if (i6 == 84) {
                                c2212rk = a(i14, sf1Var, a(i13, i6, (int) r12, i7, i8));
                            } else if (i6 == 87 && r12 == 88 && i7 == 88 && (i13 == 2 || i8 == 88)) {
                                c2212rk = f(i14, sf1Var);
                            } else if (i6 == 87) {
                                c2212rk = b(i14, sf1Var, a(i13, i6, (int) r12, i7, i8));
                            } else {
                                zh0Var = null;
                                try {
                                    if (i6 == 80 && r12 == 82 && i7 == 73 && i8 == 86) {
                                        c2212rk = d(i14, sf1Var);
                                    } else if (i6 == 71 && r12 == 69 && i7 == 79 && (i8 == 66 || i13 == 2)) {
                                        c2212rk = b(i14, sf1Var);
                                    } else {
                                        if (i13 != 2) {
                                            if (i6 == 65) {
                                                if (r12 == 80) {
                                                    if (i7 == 73) {
                                                    }
                                                }
                                            }
                                            if (i6 != 67) {
                                            }
                                            if (i6 != 67) {
                                            }
                                            int i15 = i14;
                                            i9 = i7;
                                            i10 = i15;
                                            i11 = r12;
                                            i12 = i8;
                                            if (i6 != 67) {
                                            }
                                            i13 = i4;
                                            sf1Var3 = sf1Var;
                                            if (i6 != 77) {
                                            }
                                            String a5 = a(i13, i6, i11, i9, i12);
                                            byte[] bArr = new byte[i10];
                                            sf1Var3.a(bArr, 0, i10);
                                            c2212rk = new C2212rk(a5, bArr);
                                            r12 = sf1Var3;
                                            if (c2212rk == null) {
                                            }
                                            r12.e(d4);
                                            return c2212rk;
                                        }
                                        if (i6 == 80 && r12 == 73 && i7 == 67) {
                                            c2212rk = a(i14, i13, sf1Var);
                                        }
                                        if (i6 != 67 && r12 == 79 && i7 == 77 && (i8 == 77 || i13 == 2)) {
                                            c2212rk = a(i14, sf1Var);
                                        } else {
                                            if (i6 != 67 && r12 == 72 && i7 == 65 && i8 == 80) {
                                                int i16 = i14;
                                                i9 = i7;
                                                i10 = i16;
                                                i11 = r12;
                                                i12 = i8;
                                                try {
                                                    c2212rk = a(sf1Var, i10, i13, z4, i5, aVar);
                                                    i13 = i4;
                                                    r12 = sf1Var;
                                                } catch (UnsupportedEncodingException unused) {
                                                    r12 = sf1Var;
                                                    ms0.d("Id3Decoder", "Unsupported character encoding");
                                                    r12.e(d4);
                                                    return zh0Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sf1Var2 = sf1Var;
                                                    sf1Var2.e(d4);
                                                    throw th;
                                                }
                                            } else {
                                                int i152 = i14;
                                                i9 = i7;
                                                i10 = i152;
                                                i11 = r12;
                                                i12 = i8;
                                                if (i6 != 67 && i11 == 84 && i9 == 79 && i12 == 67) {
                                                    i13 = i4;
                                                    sf1 sf1Var4 = sf1Var;
                                                    c2212rk = b(sf1Var4, i10, i13, z4, i5, aVar);
                                                    r12 = sf1Var4;
                                                } else {
                                                    i13 = i4;
                                                    sf1Var3 = sf1Var;
                                                    if (i6 != 77 && i11 == 76 && i9 == 76 && i12 == 84) {
                                                        c2212rk = c(i10, sf1Var3);
                                                        r12 = sf1Var3;
                                                    } else {
                                                        String a52 = a(i13, i6, i11, i9, i12);
                                                        byte[] bArr2 = new byte[i10];
                                                        sf1Var3.a(bArr2, 0, i10);
                                                        c2212rk = new C2212rk(a52, bArr2);
                                                        r12 = sf1Var3;
                                                    }
                                                }
                                            }
                                            if (c2212rk == null) {
                                                ms0.d("Id3Decoder", "Failed to decode frame: id=" + a(i13, i6, i11, i9, i12) + ", frameSize=" + i10);
                                            }
                                            r12.e(d4);
                                            return c2212rk;
                                        }
                                    }
                                    int i17 = i14;
                                    i9 = i7;
                                    i10 = i17;
                                    i11 = r12;
                                    i12 = i8;
                                    r12 = sf1Var;
                                    if (c2212rk == null) {
                                    }
                                    r12.e(d4);
                                    return c2212rk;
                                } catch (UnsupportedEncodingException unused2) {
                                    r12 = sf1Var;
                                }
                            }
                            int i18 = i14;
                            i9 = i7;
                            i10 = i18;
                            i11 = r12;
                            i12 = i8;
                            r12 = sf1Var;
                            zh0Var = null;
                            if (c2212rk == null) {
                            }
                            r12.e(d4);
                            return c2212rk;
                        } catch (Throwable th2) {
                            th = th2;
                            sf1Var2 = r12;
                        }
                    } catch (UnsupportedEncodingException unused3) {
                        r12 = sf1Var;
                        zh0Var = null;
                    }
                } catch (UnsupportedEncodingException unused4) {
                }
            } catch (Throwable th3) {
                th = th3;
                sf1Var2 = sf1Var;
            }
        } else {
            ms0.d("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            sf1Var.e(d4);
            return null;
        }
    }

    private static String a(int i4, int i5, String str, byte[] bArr) {
        if (i5 > i4 && i5 <= bArr.length) {
            return new String(bArr, i4, i5 - i4, str);
        }
        return "";
    }

    private static h42 a(int i4, sf1 sf1Var, String str) {
        if (i4 < 1) {
            return null;
        }
        int t4 = sf1Var.t();
        String b4 = b(t4);
        int i5 = i4 - 1;
        byte[] bArr = new byte[i5];
        sf1Var.a(bArr, 0, i5);
        return new h42(str, null, new String(bArr, 0, a(bArr, 0, t4), b4));
    }

    private static String a(int i4, int i5, int i6, int i7, int i8) {
        if (i4 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    private static int a(byte[] bArr, int i4, int i5) {
        int b4 = b(i4, bArr);
        if (i5 == 0 || i5 == 3) {
            return b4;
        }
        while (b4 < bArr.length - 1) {
            if ((b4 - i4) % 2 == 0 && bArr[b4 + 1] == 0) {
                return b4;
            }
            b4 = b(b4 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(sf1 sf1Var, int i4, int i5, boolean z4) {
        int w4;
        long w5;
        int i6;
        int i7;
        int d4 = sf1Var.d();
        while (true) {
            try {
                boolean z5 = true;
                if (sf1Var.a() < i5) {
                    sf1Var.e(d4);
                    return true;
                }
                if (i4 >= 3) {
                    w4 = sf1Var.h();
                    w5 = sf1Var.v();
                    i6 = sf1Var.z();
                } else {
                    w4 = sf1Var.w();
                    w5 = sf1Var.w();
                    i6 = 0;
                }
                if (w4 == 0 && w5 == 0 && i6 == 0) {
                    sf1Var.e(d4);
                    return true;
                }
                if (i4 == 4 && !z4) {
                    if ((8421504 & w5) != 0) {
                        sf1Var.e(d4);
                        return false;
                    }
                    w5 = (((w5 >> 24) & 255) << 21) | (w5 & 255) | (((w5 >> 8) & 255) << 7) | (((w5 >> 16) & 255) << 14);
                }
                if (i4 == 4) {
                    i7 = (i6 & 64) != 0 ? 1 : 0;
                } else {
                    if (i4 == 3) {
                        i7 = (i6 & 32) != 0 ? 1 : 0;
                    } else {
                        i7 = 0;
                        z5 = false;
                    }
                    if (z5) {
                        i7 += 4;
                    }
                    if (w5 < i7) {
                        sf1Var.e(d4);
                        return false;
                    }
                    if (sf1Var.a() < w5) {
                        sf1Var.e(d4);
                        return false;
                    }
                    sf1Var.f((int) w5);
                }
            } catch (Throwable th) {
                sf1Var.e(d4);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wz0 a(int i4, byte[] bArr) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        sf1 sf1Var = new sf1(i4, bArr);
        boolean z4 = false;
        if (sf1Var.a() < 10) {
            ms0.d("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int w4 = sf1Var.w();
            if (w4 != 4801587) {
                ms0.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(w4))));
            } else {
                int t4 = sf1Var.t();
                sf1Var.f(1);
                int t5 = sf1Var.t();
                int s4 = sf1Var.s();
                if (t4 == 2) {
                    if ((t5 & 64) != 0) {
                        ms0.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(t4, s4, t4 >= 4 && (t5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0);
                } else {
                    if (t4 == 3) {
                        if ((t5 & 64) != 0) {
                            int h4 = sf1Var.h();
                            sf1Var.f(h4);
                            s4 -= h4 + 4;
                        }
                    } else if (t4 == 4) {
                        if ((t5 & 64) != 0) {
                            int s5 = sf1Var.s();
                            sf1Var.f(s5 - 4);
                            s4 -= s5;
                        }
                        if ((t5 & 16) != 0) {
                            s4 -= 10;
                        }
                    } else {
                        fr0.a("Skipped ID3 tag with unsupported majorVersion=", t4, "Id3Decoder");
                    }
                    bVar = new b(t4, s4, t4 >= 4 && (t5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0);
                }
                if (bVar != null) {
                    return null;
                }
                int d4 = sf1Var.d();
                int i5 = bVar.f35139a == 2 ? 6 : 10;
                int i6 = bVar.f35141c;
                if (bVar.f35140b) {
                    i6 = g(i6, sf1Var);
                }
                sf1Var.d(d4 + i6);
                if (!a(sf1Var, bVar.f35139a, i5, false)) {
                    if (bVar.f35139a != 4 || !a(sf1Var, 4, i5, true)) {
                        ms0.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVar.f35139a);
                        return null;
                    }
                    z4 = true;
                }
                while (sf1Var.a() >= i5) {
                    zh0 a4 = a(bVar.f35139a, sf1Var, z4, i5, this.f35138a);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                }
                return new wz0(arrayList);
            }
        }
        bVar = null;
        if (bVar != null) {
        }
    }
}
