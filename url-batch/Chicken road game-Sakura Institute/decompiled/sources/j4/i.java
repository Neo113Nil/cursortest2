package j4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import f8.w;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import l5.u;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import s7.q;
import t3.v;
import u3.t;
import z0.h0;
import z0.j0;
import z0.p0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class i implements f2.o, f2.p, u, o5.h, v3.c, p0 {

    /* renamed from: g, reason: collision with root package name */
    public static i f5019g;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5020f;

    public /* synthetic */ i(int i7) {
        this.f5020f = i7;
    }

    public static final String c(byte[] bArr, byte[][] bArr2, int i7) {
        int i8;
        boolean z8;
        int i9;
        int i10;
        byte[] bArr3 = PublicSuffixDatabase.f6965e;
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = (i11 + length) / 2;
            while (i12 > -1 && bArr[i12] != 10) {
                i12--;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i8 = i13 + i14;
                if (bArr[i8] == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i8 - i13;
            int i16 = i7;
            boolean z9 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z9) {
                    i9 = 46;
                    z8 = false;
                } else {
                    byte b9 = bArr2[i16][i17];
                    byte[] bArr4 = t7.b.f8932a;
                    int i19 = b9 & 255;
                    z8 = z9;
                    i9 = i19;
                }
                byte b10 = bArr[i13 + i18];
                byte[] bArr5 = t7.b.f8932a;
                i10 = i9 - (b10 & 255);
                if (i10 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                }
                if (bArr2[i16].length != i17) {
                    z9 = z8;
                } else {
                    if (i16 == bArr2.length - 1) {
                        break;
                    }
                    i16++;
                    i17 = -1;
                    z9 = true;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i20 = i15 - i18;
                    int length2 = bArr2[i16].length - i17;
                    int length3 = bArr2.length;
                    for (int i21 = i16 + 1; i21 < length3; i21++) {
                        length2 += bArr2[i21].length;
                    }
                    if (length2 >= i20) {
                        if (length2 <= i20) {
                            Charset charset = StandardCharsets.UTF_8;
                            r6.k.e(charset, "UTF_8");
                            return new String(bArr, i13, i15, charset);
                        }
                    }
                }
                i11 = i8 + 1;
            }
            length = i12;
        }
        return null;
    }

    public static final float d(float f9, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float abs = Math.abs(f9);
        float signum = Math.signum(f9);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i7 = -(binarySearch + 1);
        int i8 = i7 - 1;
        if (i8 >= fArr.length - 1) {
            float f14 = fArr[fArr.length - 1];
            float f15 = fArr2[fArr.length - 1];
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return (f15 / f14) * f9;
        }
        if (i8 == -1) {
            float f16 = fArr[0];
            f12 = fArr2[0];
            f13 = f16;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f17 = fArr[i8];
            float f18 = fArr[i7];
            f10 = fArr2[i8];
            f11 = f17;
            f12 = fArr2[i7];
            f13 = f18;
        }
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f11 == f13 ? 0.0f : (abs - f11) / (f13 - f11)))) + f10) * signum;
    }

    public static ArrayList h(List list) {
        r6.k.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q) obj) != q.f8662g) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e6.n.a0(arrayList, 10));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList2.add(((q) obj2).f8669f);
        }
        return arrayList2;
    }

    public static byte[] j(List list) {
        r6.k.f(list, "protocols");
        f8.f fVar = new f8.f();
        ArrayList h3 = h(list);
        int size = h3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = h3.get(i7);
            i7++;
            String str = (String) obj;
            fVar.Q(str.length());
            fVar.X(str);
        }
        return fVar.w(fVar.f3598g);
    }

    public static t3.h k(Context context, v vVar, Bundle bundle, androidx.lifecycle.o oVar, t3.o oVar2) {
        String uuid = UUID.randomUUID().toString();
        r6.k.e(uuid, "randomUUID().toString()");
        r6.k.f(vVar, "destination");
        r6.k.f(oVar, "hostLifecycleState");
        return new t3.h(context, vVar, bundle, oVar, oVar2, uuid, null);
    }

    public static Typeface l(String str, f2.k kVar, int i7) {
        if (i7 == 0 && r6.k.a(kVar, f2.k.f3278h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int G = a8.d.G(kVar, i7);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(G) : Typeface.create(str, G);
    }

    public static w m(String str, boolean z8) {
        r6.k.f(str, "<this>");
        f8.i iVar = g8.c.f4538a;
        f8.f fVar = new f8.f();
        fVar.X(str);
        return g8.c.d(fVar, z8);
    }

    public static w n(File file) {
        String str = w.f3645g;
        String file2 = file.toString();
        r6.k.e(file2, "toString(...)");
        return m(file2, false);
    }

    public static boolean p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static final m q(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < mVarArr.length; i7++) {
                if (mVarArr[i7].equals(nVar)) {
                    return mVarArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean r(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z8;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z8 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z8 ? q(packageInfo2, o.f5028a) : q(packageInfo2, o.f5028a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z8 = true;
        if (packageInfo != null) {
            if ((!z8 ? q(packageInfo2, o.f5028a) : q(packageInfo2, o.f5028a[0])) == null) {
            }
        }
        return false;
    }

    @Override // f2.p
    public Typeface a(f2.k kVar, int i7) {
        return l(null, kVar, i7);
    }

    @Override // f2.p
    public Typeface b(f2.m mVar, f2.k kVar, int i7) {
        String str;
        mVar.getClass();
        int i8 = kVar.f3280f / 100;
        if (i8 >= 0 && i8 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i8 || i8 >= 4) {
            if (i8 != 4) {
                if (i8 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i8 || i8 >= 8) && 8 <= i8 && i8 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface l8 = l(str, kVar, i7);
            if (!r6.k.a(l8, Typeface.create(Typeface.DEFAULT, a8.d.G(kVar, i7))) && !r6.k.a(l8, l(null, kVar, i7))) {
                typeface = l8;
            }
        }
        return typeface == null ? l("sans-serif", kVar, i7) : typeface;
    }

    @Override // z0.p0
    public j0 g(long j8, m2.k kVar, m2.b bVar) {
        return new h0(t.a(0L, j8));
    }

    @Override // o5.h
    public boolean i(Object obj) {
        switch (this.f5020f) {
            case 18:
                ((l5.v) obj).getClass();
                break;
        }
        return true;
    }

    public Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f5020f) {
            case 26:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    @Override // v3.c
    public void e() {
    }

    @Override // v3.c
    public void f(int i7, Object obj) {
    }
}
