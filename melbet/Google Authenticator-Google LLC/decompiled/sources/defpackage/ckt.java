package defpackage;

import android.accounts.Account;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import androidx.preference.ListPreference;
import androidx.preference.SwitchPreferenceCompat;
import j$.util.Map;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckt implements hut {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ckt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v16, types: [bbt, java.lang.Object] */
    @Override // defpackage.hut
    public final void a(Throwable th) {
        int i = this.b;
        if (i == 1) {
            ((hkf) ((hkf) ((hkf) bss.a.g()).h(th)).i("com/google/android/apps/authenticator2/loginrequirement/LoginRequirement$1", "onFailure", (char) 135, "LoginRequirement.java")).s("Could not save consent");
            return;
        }
        if (i == 2) {
            th.getClass();
            ((hkf) ((hkf) dev.a.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/PrivacyScreenImpl$configure$<anonymous>", "onFailure", 112, "PrivacyScreenImpl.kt")).s("Failed to get Privacy Screen data");
            return;
        }
        if (i == 3) {
            th.getClass();
            ((hkf) ((hkf) dfb.a.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/lifecycle/PrivacyScreenProcessObserver$onStart$<anonymous>", "onFailure", 39, "PrivacyScreenProcessObserver.kt")).s("Failed to check if Privacy Screen should be shown");
        } else if (i != 4) {
            if (i != 5) {
                return;
            }
            this.a.e(th instanceof Exception ? (Exception) th : new Exception(th));
        } else {
            th.getClass();
            ((hkf) ((hkf) dfj.c.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/settings/PrivacyScreenSettingsFragment$loadPreferencesCallback$<anonymous>$<anonymous>", "onFailure", 48, "PrivacyScreenSettingsFragment.kt")).s("Failed to load preferences");
            ((dfj) this.a).aI();
        }
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [bbt, java.lang.Object] */
    @Override // defpackage.hut
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                cld cldVar = (cld) obj;
                WeakHashMap weakHashMap = cku.b;
                synchronized (weakHashMap) {
                    Map.EL.putIfAbsent(weakHashMap, Integer.valueOf(((cku) this.a).c.hashCode()), cldVar);
                }
                return;
            case 1:
                ((bss) this.a).d.a();
                return;
            case 2:
                dfe dfeVar = (dfe) obj;
                dfeVar.getClass();
                dfg dfgVar = dfeVar.c;
                if (dfgVar == null) {
                    dfgVar = dfg.a;
                }
                ((dev) this.a).e.set(dfgVar.c);
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    Object obj2 = ((dfb) this.a).b.a;
                    dev devVar = (dev) obj2;
                    devVar.a();
                    devVar.c.post(new ath(obj2, 9));
                    return;
                }
                return;
            case 4:
                dfg dfgVar2 = (dfg) obj;
                dfgVar2.getClass();
                dfj dfjVar = (dfj) this.a;
                dfjVar.aG().b = Boolean.valueOf(dfgVar2.c);
                SwitchPreferenceCompat switchPreferenceCompat = dfjVar.d;
                ListPreference listPreference = null;
                if (switchPreferenceCompat == null) {
                    ksp.a("featureSwitch");
                    switchPreferenceCompat = null;
                }
                switchPreferenceCompat.k(dfgVar2.c);
                ListPreference listPreference2 = dfjVar.e;
                if (listPreference2 == null) {
                    ksp.a("authDelayList");
                    listPreference2 = null;
                }
                listPreference2.I(dfgVar2.c);
                ListPreference listPreference3 = dfjVar.e;
                if (listPreference3 == null) {
                    ksp.a("authDelayList");
                } else {
                    listPreference = listPreference3;
                }
                dff b = dff.b(dfgVar2.d);
                if (b == null) {
                    b = dff.UNKNOWN_DELAY;
                }
                b.getClass();
                listPreference.o(b.ordinal() != 0 ? String.valueOf(b.f) : "1");
                dfjVar.aH(true);
                dfjVar.aI();
                return;
            case 5:
                this.a.b((Bitmap) obj);
                return;
            case 6:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((egh) this.a).h((Account) it.next());
                }
                return;
            case 7:
                new File(((fdl) this.a).b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
                return;
            default:
                if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
                    return;
                }
                Object obj3 = this.a;
                synchronized (((fdl) obj3).h) {
                    ((fdl) obj3).d();
                }
                return;
        }
    }
}
