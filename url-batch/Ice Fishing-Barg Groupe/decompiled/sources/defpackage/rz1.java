package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.ice.fishing.grenza.MainActivity;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rz1 implements kr2 {
    public final Application PxuCJdSBwIXG;
    public final Bundle TSizfFm2Yiuu;
    public final s01 Y1f8riQaR6yg;
    public final cr1 e9gEMXR7LXtO;
    public final hr2 lS5Rgt96tfkO;

    public rz1(Application application, MainActivity mainActivity, Bundle bundle) {
        hr2 hr2Var;
        this.e9gEMXR7LXtO = mainActivity.dgRBjINgWbAK.lS5Rgt96tfkO;
        this.Y1f8riQaR6yg = mainActivity.rtx2ld2ELZv4;
        this.TSizfFm2Yiuu = bundle;
        this.PxuCJdSBwIXG = application;
        if (application != null) {
            hr2.Companion.getClass();
            if (hr2.TSizfFm2Yiuu == null) {
                hr2.TSizfFm2Yiuu = new hr2(application);
            }
            hr2Var = hr2.TSizfFm2Yiuu;
            hr2Var.getClass();
        } else {
            hr2Var = new hr2(null);
        }
        this.lS5Rgt96tfkO = hr2Var;
    }

    @Override // defpackage.kr2
    public final dr2 PxuCJdSBwIXG(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return Y1f8riQaR6yg(canonicalName, cls);
        }
        u9.XL4ISE6Oc65B("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.kr2
    public final dr2 TSizfFm2Yiuu(ck ckVar, z71 z71Var) {
        return lS5Rgt96tfkO(kj0.e6tOsSdd2EFb(ckVar), z71Var);
    }

    public final dr2 Y1f8riQaR6yg(String str, Class cls) {
        s01 s01Var = this.Y1f8riQaR6yg;
        if (s01Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a7.class.isAssignableFrom(cls);
        Application application = this.PxuCJdSBwIXG;
        Constructor PxuCJdSBwIXG = (!isAssignableFrom || application == null) ? sz1.PxuCJdSBwIXG(cls, sz1.lS5Rgt96tfkO) : sz1.PxuCJdSBwIXG(cls, sz1.PxuCJdSBwIXG);
        if (PxuCJdSBwIXG == null) {
            if (application != null) {
                return this.lS5Rgt96tfkO.PxuCJdSBwIXG(cls);
            }
            mr2.Companion.getClass();
            if (mr2.PxuCJdSBwIXG == null) {
                mr2.PxuCJdSBwIXG = new mr2();
            }
            mr2.PxuCJdSBwIXG.getClass();
            return sj0.BRwzKIf41E4i(cls);
        }
        cr1 cr1Var = this.e9gEMXR7LXtO;
        cr1Var.getClass();
        Bundle RAsUl2FVSrh6 = cr1Var.RAsUl2FVSrh6(str);
        ez1.Companion.getClass();
        ez1 PxuCJdSBwIXG2 = dz1.PxuCJdSBwIXG(RAsUl2FVSrh6, this.TSizfFm2Yiuu);
        fz1 fz1Var = new fz1(str, PxuCJdSBwIXG2);
        fz1Var.gPXPFXrUH4XX(s01Var, cr1Var);
        f01 f01Var = s01Var.rtx2ld2ELZv4;
        if (f01Var == f01.OPXfSBeufaJ8 || f01Var.compareTo(f01.dgRBjINgWbAK) >= 0) {
            cr1Var.dgRBjINgWbAK();
        } else {
            s01Var.PxuCJdSBwIXG(new ww(s01Var, cr1Var));
        }
        dr2 lS5Rgt96tfkO = (!isAssignableFrom || application == null) ? sz1.lS5Rgt96tfkO(cls, PxuCJdSBwIXG, PxuCJdSBwIXG2) : sz1.lS5Rgt96tfkO(cls, PxuCJdSBwIXG, application, PxuCJdSBwIXG2);
        lS5Rgt96tfkO.PxuCJdSBwIXG("androidx.lifecycle.savedstate.vm.tag", fz1Var);
        return lS5Rgt96tfkO;
    }

    @Override // defpackage.kr2
    public final dr2 lS5Rgt96tfkO(Class cls, z71 z71Var) {
        LinkedHashMap linkedHashMap = z71Var.PxuCJdSBwIXG;
        String str = (String) linkedHashMap.get(nr2.lS5Rgt96tfkO);
        if (str == null) {
            u9.rtx2ld2ELZv4("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(mm2.RfyTYNmI9Srp) == null || linkedHashMap.get(mm2.EcgxDIVH5in8) == null) {
            if (this.Y1f8riQaR6yg != null) {
                return Y1f8riQaR6yg(str, cls);
            }
            u9.rtx2ld2ELZv4("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(hr2.Y1f8riQaR6yg);
        boolean isAssignableFrom = a7.class.isAssignableFrom(cls);
        Constructor PxuCJdSBwIXG = (!isAssignableFrom || application == null) ? sz1.PxuCJdSBwIXG(cls, sz1.lS5Rgt96tfkO) : sz1.PxuCJdSBwIXG(cls, sz1.PxuCJdSBwIXG);
        return PxuCJdSBwIXG == null ? this.lS5Rgt96tfkO.lS5Rgt96tfkO(cls, z71Var) : (!isAssignableFrom || application == null) ? sz1.lS5Rgt96tfkO(cls, PxuCJdSBwIXG, mm2.rZjpSjn4zoMv(z71Var)) : sz1.lS5Rgt96tfkO(cls, PxuCJdSBwIXG, application, mm2.rZjpSjn4zoMv(z71Var));
    }

    public rz1() {
        this.lS5Rgt96tfkO = new hr2(null);
    }
}
