package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u70 implements jx {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ u70(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.jx
    public final void i(lx lxVar, fx fxVar) {
        View view;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                sb0 sb0Var = (sb0) obj;
                if (fxVar != fx.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                lxVar.e().f(this);
                Bundle g = sb0Var.a().g("androidx.savedstate.Restarter");
                if (g == null) {
                    return;
                }
                ArrayList<String> stringArrayList = g.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    s9.u("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, u70.class.getClassLoader()).asSubclass(pb0.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(sb0Var instanceof tm0)) {
                                    s9.t(sb0Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                sm0 d = ((tm0) sb0Var).d();
                                i5 a = sb0Var.a();
                                d.getClass();
                                LinkedHashMap linkedHashMap = d.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    om0 om0Var = (om0) linkedHashMap.get(str3);
                                    if (om0Var != null) {
                                        bi.g(om0Var, a, sb0Var.e());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    a.O();
                                }
                            } catch (Exception e) {
                                s9.q("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(r7.c("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                b bVar = (b) obj;
                if (bVar.j == null) {
                    td tdVar = (td) bVar.getLastNonConfigurationInstance();
                    if (tdVar != null) {
                        bVar.j = tdVar.a;
                    }
                    if (bVar.j == null) {
                        bVar.j = new sm0();
                    }
                }
                bVar.f.f(this);
                return;
            case 2:
                new HashMap();
                is[] isVarArr = (is[]) obj;
                if (isVarArr.length > 0) {
                    is isVar = isVarArr[0];
                    throw null;
                }
                if (isVarArr.length <= 0) {
                    return;
                }
                is isVar2 = isVarArr[0];
                throw null;
            case 3:
                if (fxVar != fx.ON_STOP || (view = ((a) obj).J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (fxVar != fx.ON_CREATE) {
                    s9.t(fxVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    lxVar.e().f(this);
                    ((ob0) obj).b();
                    return;
                }
        }
    }
}
