package K0;

import E.InterfaceC0012m;
import P1.u;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b0.C0178i;
import com.fc.barca.football.R;
import io.appmetrica.analytics.impl.C0642l9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p.C1169e;
import p.C1171g;
import s0.EnumC1186c;
import x0.InterfaceC1239b;

/* loaded from: classes.dex */
public final class j implements InterfaceC1239b, InterfaceC0012m, P1.m, S.d {

    /* renamed from: b, reason: collision with root package name */
    public static j f852b;

    /* renamed from: c, reason: collision with root package name */
    public static j f853c;

    /* renamed from: d, reason: collision with root package name */
    public static j f854d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f855a;

    public /* synthetic */ j(int i3) {
        this.f855a = i3;
    }

    public static final n h(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < nVarArr.length; i3++) {
                if (nVarArr[i3].equals(oVar)) {
                    return nVarArr[i3];
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
    public static final boolean i(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? h(packageInfo2, p.f862a) : h(packageInfo2, p.f862a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z = true;
        if (packageInfo != null) {
            if ((!z ? h(packageInfo2, p.f862a) : h(packageInfo2, p.f862a[0])) == null) {
            }
        }
        return false;
    }

    @Override // S.d
    public void c(int i3, Serializable serializable) {
        String str;
        switch (this.f855a) {
            case C0642l9.f7778D /* 20 */:
                break;
            default:
                switch (i3) {
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
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    public long d() {
        switch (this.f855a) {
            case 3:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public CharSequence g(Preference preference) {
        switch (this.f855a) {
            case 18:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f2424a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f2424a.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        j jVar = new j(4);
        HashMap hashMap = new HashMap();
        EnumC1186c enumC1186c = EnumC1186c.f10290a;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(enumC1186c, new B0.c(30000L, 86400000L, set));
        EnumC1186c enumC1186c2 = EnumC1186c.f10292c;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(enumC1186c2, new B0.c(1000L, 86400000L, set));
        EnumC1186c enumC1186c3 = EnumC1186c.f10291b;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(B0.e.f123b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(enumC1186c3, new B0.c(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < EnumC1186c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new B0.b(jVar, hashMap);
    }

    @Override // S.d
    public void l() {
        switch (this.f855a) {
            case C0642l9.f7778D /* 20 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // P1.m
    public void onMethodCall(P1.l lVar, P1.n nVar) {
        switch (this.f855a) {
            case 12:
                ((O1.j) nVar).success(null);
                break;
            default:
                ((O1.j) nVar).success(null);
                break;
        }
    }

    public /* synthetic */ j(int i3, Object obj) {
        this.f855a = i3;
    }

    public j(P.k fragmentManager) {
        this.f855a = 16;
        kotlin.jvm.internal.j.e(fragmentManager, "fragmentManager");
        new CopyOnWriteArrayList();
    }

    public j() {
        this.f855a = 29;
        new C1169e(0);
        new C1171g();
    }

    public j(G1.b bVar) {
        this.f855a = 13;
        new P1.o(bVar, "flutter/deferredcomponent", u.f1272b, null).b(new C0178i(11, this));
        A0.f.H().getClass();
        new HashMap();
    }

    private final void e() {
    }

    private final void f(int i3, Serializable serializable) {
    }

    @Override // E.InterfaceC0012m
    public void a(int i3, int i4, int i5, boolean z) {
    }

    @Override // E.InterfaceC0012m
    public void b(int i3, int i4, int i5, int i6) {
    }
}
