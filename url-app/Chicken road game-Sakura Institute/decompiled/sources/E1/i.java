package E1;

import Z.G;
import Z.I;
import Z.P;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import com.google.firebase.components.ComponentRegistrar;
import g2.u;
import j2.InterfaceC0711a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import p1.InterfaceC0992b;
import q.AbstractC1024c;
import u1.InterfaceC1220d;
import z3.C1448f;
import z3.C1451i;
import z3.v;

/* loaded from: classes.dex */
public class i implements F0.q, P, InterfaceC0992b, u, InterfaceC0711a, InterfaceC1220d {

    /* renamed from: e, reason: collision with root package name */
    public static i f2294e;

    /* renamed from: i, reason: collision with root package name */
    public static i f2295i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2296d;

    public /* synthetic */ i(int i2) {
        this.f2296d = i2;
    }

    public static final boolean f(v vVar) {
        v vVar2 = A3.g.f854e;
        return !kotlin.text.u.h(true, vVar.c(), ".class");
    }

    public static Typeface g(String str, F0.k kVar, int i2) {
        Typeface create;
        if (F0.i.a(i2, 0) && Intrinsics.a(kVar, F0.k.f2614i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f2618d, F0.i.a(i2, 1));
        return create;
    }

    public static v i(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C1451i c1451i = A3.c.f844a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        C1448f c1448f = new C1448f();
        c1448f.B(str);
        return A3.c.d(c1448f, z4);
    }

    public static v j(File file) {
        String str = v.f12037e;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        return i(file2, false);
    }

    public static final n m(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].equals(oVar)) {
                    return nVarArr[i2];
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
    public static final boolean n(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z4;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z4 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z4 ? m(packageInfo2, p.f2305a) : m(packageInfo2, p.f2305a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z4 = true;
        if (packageInfo != null) {
            if ((!z4 ? m(packageInfo2, p.f2305a) : m(packageInfo2, p.f2305a[0])) == null) {
            }
        }
        return false;
    }

    @Override // Z.P
    public I a(long j4, M0.k kVar, M0.b bVar) {
        return new G(j0.c.h(0L, j4));
    }

    @Override // F0.q
    public Typeface b(F0.k kVar, int i2) {
        return g(null, kVar, i2);
    }

    @Override // F0.q
    public Typeface c(F0.m mVar, F0.k kVar, int i2) {
        return g(mVar.f2620e, kVar, i2);
    }

    @Override // j2.InterfaceC0711a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // u1.InterfaceC1220d
    public void e(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC1024c.f9242c /* 9 */:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // u1.InterfaceC1220d
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public List l(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Z1.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f4561a;
            if (str != null) {
                Z1.q qVar = new Z1.q(str, 3, bVar);
                bVar = new Z1.b(str, bVar.f4562b, bVar.f4563c, bVar.f4564d, qVar, bVar.f4566f);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f2296d) {
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public i(m1.k fragmentManager) {
        this.f2296d = 18;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        new CopyOnWriteArrayList();
    }

    public i(k3.n block) {
        this.f2296d = 24;
        Intrinsics.checkNotNullParameter(block, "block");
    }
}
