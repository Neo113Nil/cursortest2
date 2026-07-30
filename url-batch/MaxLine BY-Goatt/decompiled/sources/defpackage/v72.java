package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v72 implements fd1 {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ v72(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        View view;
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                zd2 zd2Var = (zd2) obj;
                if (yc1Var != yc1.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                id1Var.getLifecycle().c(this);
                Bundle a = zd2Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    lh.g("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, v72.class.getClassLoader()).asSubclass(ud2.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(zd2Var instanceof u53)) {
                                    b71.u(zd2Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                t53 viewModelStore = ((u53) zd2Var).getViewModelStore();
                                wd2 savedStateRegistry = zd2Var.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    n53 n53Var = (n53) linkedHashMap.get(str3);
                                    if (n53Var != null) {
                                        ap.q(n53Var, savedStateRegistry, zd2Var.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(q40.l("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(q40.m("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                if (yc1Var != yc1.ON_STOP || (view = ((fr0) obj).mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                kr0 kr0Var = (kr0) obj;
                xx.access$ensureViewModelStore(kr0Var);
                kr0Var.getLifecycle().c(this);
                return;
            case 3:
                new HashMap();
                ru0[] ru0VarArr = (ru0[]) obj;
                if (ru0VarArr.length > 0) {
                    ru0 ru0Var = ru0VarArr[0];
                    throw null;
                }
                if (ru0VarArr.length <= 0) {
                    return;
                }
                ru0 ru0Var2 = ru0VarArr[0];
                throw null;
            default:
                if (yc1Var != yc1.ON_CREATE) {
                    b71.u(yc1Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    id1Var.getLifecycle().c(this);
                    ((sd2) obj).b();
                    return;
                }
        }
    }
}
