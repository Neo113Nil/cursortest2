package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r11 implements sg0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ r11(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e61 e61Var = (e61) obj;
                if (ng0Var != ng0.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                vg0Var.f().f(this);
                Bundle d = e61Var.a().d("androidx.savedstate.Restarter");
                if (d == null) {
                    return;
                }
                ArrayList<String> stringArrayList = d.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    dd0.j("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, r11.class.getClassLoader()).asSubclass(b61.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(e61Var instanceof wj)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + e61Var).toString());
                                }
                                mj0 g = ((wj) e61Var).g();
                                c51 a = e61Var.a();
                                g.getClass();
                                LinkedHashMap linkedHashMap = g.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    tn1 tn1Var = (tn1) linkedHashMap.get(str3);
                                    if (tn1Var != null) {
                                        xa0.i(tn1Var, a, e61Var.f());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    a.l();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(qy0.j("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(qy0.k("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                if (ng0Var != ng0.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                kr0 kr0Var = ((wj) obj).l;
                OnBackInvokedDispatcher a2 = tj.a((wj) vg0Var);
                kr0Var.getClass();
                a2.getClass();
                kr0Var.e = a2;
                kr0Var.b(kr0Var.g);
                return;
            case 2:
                new HashMap();
                i40[] i40VarArr = (i40[]) obj;
                if (i40VarArr.length > 0) {
                    i40 i40Var = i40VarArr[0];
                    throw null;
                }
                if (i40VarArr.length <= 0) {
                    return;
                }
                i40 i40Var2 = i40VarArr[0];
                throw null;
            default:
                if (ng0Var == ng0.ON_CREATE) {
                    vg0Var.f().f(this);
                    ((z51) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + ng0Var).toString());
                }
        }
    }
}
