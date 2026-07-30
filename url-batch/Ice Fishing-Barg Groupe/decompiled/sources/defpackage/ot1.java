package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ot1 implements l01 {
    public static final mt1 Companion = new mt1();
    public final qz1 rtx2ld2ELZv4;

    public ot1(qz1 qz1Var) {
        this.rtx2ld2ELZv4 = qz1Var;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        if (e01Var != e01.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        o01Var.rtx2ld2ELZv4().a92UlCVFR9N8(this);
        qz1 qz1Var = this.rtx2ld2ELZv4;
        Bundle RAsUl2FVSrh6 = qz1Var.TSizfFm2Yiuu().RAsUl2FVSrh6("androidx.savedstate.Restarter");
        if (RAsUl2FVSrh6 == null) {
            return;
        }
        ArrayList<String> stringArrayList = RAsUl2FVSrh6.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            u9.rtx2ld2ELZv4("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, ot1.class.getClassLoader()).asSubclass(kz1.class);
                asSubclass.getClass();
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        newInstance.getClass();
                        if (!(qz1Var instanceof pr2)) {
                            rc1.a92UlCVFR9N8(qz1Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                            return;
                        }
                        or2 RAsUl2FVSrh62 = ((pr2) qz1Var).RAsUl2FVSrh6();
                        cr1 TSizfFm2Yiuu = qz1Var.TSizfFm2Yiuu();
                        LinkedHashMap linkedHashMap = RAsUl2FVSrh62.PxuCJdSBwIXG;
                        LinkedHashMap linkedHashMap2 = RAsUl2FVSrh62.PxuCJdSBwIXG;
                        Iterator it = zk.l(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            dr2 dr2Var = (dr2) linkedHashMap2.get(it.next());
                            if (dr2Var != null) {
                                ni0.rtx2ld2ELZv4(dr2Var, TSizfFm2Yiuu, qz1Var.rtx2ld2ELZv4());
                            }
                        }
                        if (!zk.l(linkedHashMap2.keySet()).isEmpty()) {
                            TSizfFm2Yiuu.dgRBjINgWbAK();
                        }
                    } catch (Exception e) {
                        rc1.dgRBjINgWbAK("Failed to instantiate ", str2, e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(o0.x50lh2ztY7Y5("Class ", str2, " wasn't found"), e3);
            }
        }
    }
}
