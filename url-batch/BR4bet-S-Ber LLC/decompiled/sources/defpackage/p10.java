package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p10 implements ks {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ p10(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ks
    public final void f(ms msVar, gs gsVar) {
        View view;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                n40 n40Var = (n40) obj;
                if (gsVar != gs.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                msVar.e().f(this);
                Bundle c = n40Var.a().c("androidx.savedstate.Restarter");
                if (c == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    g9.s("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, p10.class.getClassLoader()).asSubclass(k40.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(n40Var instanceof uc0)) {
                                    g9.s("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    return;
                                }
                                tc0 d = ((uc0) n40Var).d();
                                s3 a = n40Var.a();
                                d.getClass();
                                LinkedHashMap linkedHashMap = d.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    pc0 pc0Var = (pc0) linkedHashMap.get(str3);
                                    pc0Var.getClass();
                                    xf.b(pc0Var, a, n40Var.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    a.f();
                                }
                            } catch (Exception e) {
                                g9.o("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(f60.f("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                m3 m3Var = (m3) obj;
                if (m3Var.j == null) {
                    sc scVar = (sc) m3Var.getLastNonConfigurationInstance();
                    if (scVar != null) {
                        m3Var.j = scVar.a;
                    }
                    if (m3Var.j == null) {
                        m3Var.j = new tc0();
                    }
                }
                m3Var.f.f(this);
                return;
            case 2:
                new HashMap();
                uo[] uoVarArr = (uo[]) obj;
                if (uoVarArr.length > 0) {
                    uo uoVar = uoVarArr[0];
                    throw null;
                }
                if (uoVarArr.length <= 0) {
                    return;
                }
                uo uoVar2 = uoVarArr[0];
                throw null;
            case 3:
                if (gsVar != gs.ON_STOP || (view = ((pm) obj).J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (gsVar != gs.ON_CREATE) {
                    g9.t(gsVar, "Next event must be ON_CREATE, it was ");
                    return;
                }
                msVar.e().f(this);
                i40 i40Var = (i40) obj;
                if (i40Var.b) {
                    return;
                }
                Bundle c2 = i40Var.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = i40Var.c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c2 != null) {
                    bundle.putAll(c2);
                }
                i40Var.c = bundle;
                i40Var.b = true;
                return;
        }
    }
}
