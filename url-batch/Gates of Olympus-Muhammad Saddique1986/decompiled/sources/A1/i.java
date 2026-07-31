package A1;

import G2.s;
import H0.m;
import S1.n;
import T2.C0231f;
import T2.C0234i;
import T2.v;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import b0.I;
import b0.K;
import b0.Q;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import n2.AbstractC0721a;
import n2.AbstractC0737q;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public class i implements Q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f220d;

    public /* synthetic */ i(int i3, boolean z3) {
        this.f220d = i3;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f7453e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > i7 && bArr[i9] != 10) {
                i9 += i7;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i4 = i10 + i11;
                if (bArr[i4] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i4 - i10;
            int i13 = i3;
            boolean z4 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z4) {
                    i5 = 46;
                    z3 = false;
                } else {
                    byte b3 = bArr2[i13][i14];
                    byte[] bArr4 = H2.b.f2632a;
                    int i16 = b3 & 255;
                    z3 = z4;
                    i5 = i16;
                }
                byte b4 = bArr[i10 + i15];
                byte[] bArr5 = H2.b.f2632a;
                i6 = i5 - (b4 & 255);
                if (i6 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z4 = z3;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    z4 = true;
                    i14 = -1;
                }
            }
            if (i6 >= 0) {
                if (i6 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset charset = StandardCharsets.UTF_8;
                            f2.j.e(charset, "UTF_8");
                            return new String(bArr, i10, i12, charset);
                        }
                    }
                }
                i8 = i4 + 1;
                i7 = -1;
            }
            length = i9;
            i7 = -1;
        }
        return null;
    }

    public static final boolean b(v vVar) {
        v vVar2 = U2.e.f4524e;
        return !AbstractC0737q.r(vVar.b(), ".class", true);
    }

    public static final float c(float f3, float[] fArr, float[] fArr2) {
        float f4;
        float f5;
        float f6;
        float f7;
        float max;
        float abs = Math.abs(f3);
        float signum = Math.signum(f3);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i3 = -(binarySearch + 1);
            int i4 = i3 - 1;
            if (i4 >= fArr.length - 1) {
                float f8 = fArr[fArr.length - 1];
                float f9 = fArr2[fArr.length - 1];
                if (f8 == 0.0f) {
                    return 0.0f;
                }
                return (f9 / f8) * f3;
            }
            if (i4 == -1) {
                float f10 = fArr[0];
                f6 = fArr2[0];
                f7 = f10;
                f5 = 0.0f;
                f4 = 0.0f;
            } else {
                float f11 = fArr[i4];
                float f12 = fArr[i3];
                f4 = fArr2[i4];
                f5 = f11;
                f6 = fArr2[i3];
                f7 = f12;
            }
            max = signum * (((f6 - f4) * Math.max(0.0f, Math.min(1.0f, f5 == f7 ? 0.0f : (abs - f5) / (f7 - f5)))) + f4);
        }
        return max;
    }

    public static ArrayList e(List list) {
        f2.j.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s) obj) != s.f2273e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.E0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f2280d);
        }
        return arrayList2;
    }

    public static byte[] f(List list) {
        f2.j.f(list, "protocols");
        C0231f c0231f = new C0231f();
        Iterator it = e(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0231f.E(str.length());
            c0231f.I(str);
        }
        return c0231f.l(c0231f.f4409e);
    }

    public static Typeface g(String str, H0.k kVar, int i3) {
        Typeface create;
        if (H0.i.a(i3, 0) && f2.j.a(kVar, H0.k.f2597f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f2601d, H0.i.a(i3, 1));
        return create;
    }

    public static Typeface h(String str, H0.k kVar, int i3) {
        if (H0.i.a(i3, 0) && f2.j.a(kVar, H0.k.f2597f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int x3 = l0.c.x(kVar, i3);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(x3) : Typeface.create(str, x3);
    }

    public static C0234i j(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr[i3] = (byte) (U2.b.a(str.charAt(i4 + 1)) + (U2.b.a(str.charAt(i4)) << 4));
        }
        return new C0234i(bArr);
    }

    public static C0234i k(String str) {
        f2.j.f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC0721a.f7347a);
        f2.j.e(bytes, "this as java.lang.String).getBytes(charset)");
        C0234i c0234i = new C0234i(bytes);
        c0234i.f4413f = str;
        return c0234i;
    }

    public static v l(String str, boolean z3) {
        f2.j.f(str, "<this>");
        C0234i c0234i = U2.c.f4517a;
        C0231f c0231f = new C0231f();
        c0231f.I(str);
        return U2.c.d(c0231f, z3);
    }

    public static v m(File file) {
        String str = v.f4446e;
        String file2 = file.toString();
        f2.j.e(file2, "toString(...)");
        return l(file2, false);
    }

    public static boolean o() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // b0.Q
    public K d(long j3, O0.k kVar, O0.b bVar) {
        return new I(O2.d.g(0L, j3));
    }

    public Typeface i(m mVar, H0.k kVar, int i3) {
        String str;
        switch (this.f220d) {
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                mVar.getClass();
                return g("sans-serif", kVar, i3);
            default:
                mVar.getClass();
                int i4 = kVar.f2601d / 100;
                if (i4 >= 0 && i4 < 2) {
                    str = "sans-serif-thin";
                } else if (2 > i4 || i4 >= 4) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            str = "sans-serif-medium";
                        } else if ((6 > i4 || i4 >= 8) && 8 <= i4 && i4 < 11) {
                            str = "sans-serif-black";
                        }
                    }
                    str = "sans-serif";
                } else {
                    str = "sans-serif-light";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface h3 = h(str, kVar, i3);
                    if (!f2.j.a(h3, Typeface.create(Typeface.DEFAULT, l0.c.x(kVar, i3))) && !f2.j.a(h3, h(null, kVar, i3))) {
                        typeface = h3;
                    }
                }
                return typeface == null ? h("sans-serif", kVar, i3) : typeface;
        }
    }

    public Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f220d) {
            case 21:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public i(int i3) {
        this.f220d = i3;
        switch (i3) {
            case 26:
                new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                new G0.b();
                G0.c cVar = new G0.c();
                cVar.f2081a = G0.a.f2072a;
                cVar.f2082b = G0.a.f2073b;
                cVar.f2083c = 0;
                break;
        }
    }
}
