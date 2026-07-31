package F0;

import N2.C0150f;
import N2.C0153i;
import N2.v;
import a.AbstractC0157a;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import b0.AbstractC0257H;
import b0.C0255F;
import b0.InterfaceC0263N;
import h1.C0438i;
import h2.AbstractC0439a;
import h2.AbstractC0454p;
import j0.InterfaceC0509a;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public class a implements P1.h, InterfaceC0263N, InterfaceC0509a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1442d;

    public /* synthetic */ a(int i3) {
        this.f1442d = i3;
    }

    public static final String b(byte[] bArr, byte[][] bArr2, int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f6746e;
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
                    byte b2 = bArr2[i13][i14];
                    byte[] bArr4 = B2.c.f415a;
                    int i16 = b2 & 255;
                    z3 = z4;
                    i5 = i16;
                }
                byte b3 = bArr[i10 + i15];
                byte[] bArr5 = B2.c.f415a;
                i6 = i5 - (b3 & 255);
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
                            Z1.i.e(charset, "UTF_8");
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

    public static final boolean c(v vVar) {
        v vVar2 = O2.e.f2999e;
        return !AbstractC0454p.c0(vVar.b(), ".class", true);
    }

    public static final float d(float f3, float[] fArr, float[] fArr2) {
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
        Z1.i.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A2.v) obj) != A2.v.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(M1.n.g0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((A2.v) it.next()).f191d);
        }
        return arrayList2;
    }

    public static byte[] f(List list) {
        Z1.i.f(list, "protocols");
        C0150f c0150f = new C0150f();
        Iterator it = e(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0150f.Q(str.length());
            c0150f.U(str);
        }
        return c0150f.k(c0150f.f2929e);
    }

    public static Typeface g(String str, l lVar, int i3) {
        Typeface create;
        if (j.a(i3, 0) && Z1.i.a(lVar, l.f1454f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f1458d, j.a(i3, 1));
        return create;
    }

    public static Typeface h(String str, l lVar, int i3) {
        if (j.a(i3, 0) && Z1.i.a(lVar, l.f1454f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int B = I2.l.B(lVar, i3);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(B) : Typeface.create(str, B);
    }

    public static C0153i j(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr[i3] = (byte) (O2.b.a(str.charAt(i4 + 1)) + (O2.b.a(str.charAt(i4)) << 4));
        }
        return new C0153i(bArr);
    }

    public static C0153i k(String str) {
        Z1.i.f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC0439a.f5056a);
        Z1.i.e(bytes, "this as java.lang.String).getBytes(charset)");
        C0153i c0153i = new C0153i(bytes);
        c0153i.f2933f = str;
        return c0153i;
    }

    public static v l(String str, boolean z3) {
        Z1.i.f(str, "<this>");
        C0153i c0153i = O2.c.f2992a;
        C0150f c0150f = new C0150f();
        c0150f.U(str);
        return O2.c.d(c0150f, z3);
    }

    public static v m(File file) {
        String str = v.f2966e;
        String file2 = file.toString();
        Z1.i.e(file2, "toString(...)");
        return l(file2, false);
    }

    public static boolean o() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // b0.InterfaceC0263N
    public AbstractC0257H a(long j3, M0.j jVar, M0.b bVar) {
        return new C0255F(AbstractC0157a.f(0L, j3));
    }

    public Typeface i(n nVar, l lVar, int i3) {
        String str;
        switch (this.f1442d) {
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                nVar.getClass();
                return g("sans-serif", lVar, i3);
            default:
                nVar.getClass();
                int i4 = lVar.f1458d / 100;
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
                    Typeface h3 = h(str, lVar, i3);
                    if (!Z1.i.a(h3, Typeface.create(Typeface.DEFAULT, I2.l.B(lVar, i3))) && !Z1.i.a(h3, h(null, lVar, i3))) {
                        typeface = h3;
                    }
                }
                return typeface == null ? h("sans-serif", lVar, i3) : typeface;
        }
    }

    public Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean p(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.f1442d) {
            case 20:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public a() {
        this.f1442d = 1;
        new E0.b();
        E0.c cVar = new E0.c();
        cVar.f731a = E0.a.f722a;
        cVar.f732b = E0.a.f723b;
        cVar.f733c = 0;
    }
}
