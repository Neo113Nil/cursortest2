package R0;

import X5.t;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import j.o;
import java.util.ArrayList;
import java.util.List;
import l5.AbstractC0508l;
import p.AbstractC0574c;
import p.C0572a;
import p.C0573b;
import u0.C0682l;

/* loaded from: classes.dex */
public final class g implements M0.a, P.d, Q4.f, o {

    /* renamed from: f, reason: collision with root package name */
    public static g f2068f;

    public static ArrayList d(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.f3037h) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0508l.C(arrayList, 10));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList2.add(((t) obj2).f3045f);
        }
        return arrayList2;
    }

    public static byte[] e(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        n6.f fVar = new n6.f();
        ArrayList d7 = d(protocols);
        int size = d7.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = d7.get(i7);
            i7++;
            String str = (String) obj;
            fVar.I(str.length());
            fVar.O(str);
        }
        return fVar.h(fVar.f5524g);
    }

    public static final k g(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            l lVar = new l(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < kVarArr.length; i7++) {
                if (kVarArr[i7].equals(lVar)) {
                    return kVarArr[i7];
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
    public static final boolean h(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z5;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z5 ? g(packageInfo2, m.f2076a) : g(packageInfo2, m.f2076a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z5 = true;
        if (packageInfo != null) {
            if ((!z5 ? g(packageInfo2, m.f2076a) : g(packageInfo2, m.f2076a[0])) == null) {
            }
        }
        return false;
    }

    @Override // j.o
    public boolean b(j.j jVar) {
        return false;
    }

    @Override // M0.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    public void f(C0682l c0682l, float f7) {
        C0573b c0573b = (C0573b) ((Drawable) c0682l.f5989f);
        C0572a c0572a = (C0572a) c0682l.f5990g;
        boolean useCompatPadding = c0572a.getUseCompatPadding();
        boolean preventCornerOverlap = c0572a.getPreventCornerOverlap();
        if (f7 != c0573b.f5645e || c0573b.f5646f != useCompatPadding || c0573b.f5647g != preventCornerOverlap) {
            c0573b.f5645e = f7;
            c0573b.f5646f = useCompatPadding;
            c0573b.f5647g = preventCornerOverlap;
            c0573b.b(null);
            c0573b.invalidateSelf();
        }
        if (!c0572a.getUseCompatPadding()) {
            c0682l.n(0, 0, 0, 0);
            return;
        }
        C0573b c0573b2 = (C0573b) ((Drawable) c0682l.f5989f);
        float f8 = c0573b2.f5645e;
        float f9 = c0573b2.f5641a;
        int ceil = (int) Math.ceil(AbstractC0574c.a(f8, f9, c0572a.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC0574c.b(f8, f9, c0572a.getPreventCornerOverlap()));
        c0682l.n(ceil, ceil2, ceil, ceil2);
    }

    @Override // P.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // P.d
    public void m(int i7, Object obj) {
        String str;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // j.o
    public void a(j.j jVar, boolean z5) {
    }
}
