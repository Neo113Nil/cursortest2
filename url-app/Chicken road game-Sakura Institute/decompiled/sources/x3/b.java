package x3;

import a0.m;
import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.w0;
import b.j;
import b.o;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9673f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9674g;

    public /* synthetic */ b(int i7, Object obj) {
        this.f9673f = i7;
        this.f9674g = obj;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        switch (this.f9673f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f fVar = (f) this.f9674g;
                if (nVar != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                vVar.f().f(this);
                Bundle a3 = fVar.b().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    String str = stringArrayList.get(i7);
                    i7++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        k.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                k.e(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof c1)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                b1 e9 = ((c1) fVar).e();
                                e b9 = fVar.b();
                                e9.getClass();
                                LinkedHashMap linkedHashMap = e9.f949a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    k.f(str3, "key");
                                    w0 w0Var = (w0) linkedHashMap.get(str3);
                                    k.c(w0Var);
                                    q0.a(w0Var, b9, fVar.f());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b9.d();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException("Failed to instantiate " + str2, e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(m.j("Class ", str2, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                new HashMap();
                i[] iVarArr = (i[]) this.f9674g;
                if (iVarArr.length > 0) {
                    i iVar = iVarArr[0];
                    throw null;
                }
                if (iVarArr.length <= 0) {
                    return;
                }
                i iVar2 = iVarArr[0];
                throw null;
            case 2:
                if (nVar == n.ON_CREATE) {
                    vVar.f().f(this);
                    ((s0) this.f9674g).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + nVar).toString());
                }
            default:
                o oVar = (o) this.f9674g;
                if (oVar.f1199j == null) {
                    j jVar = (j) oVar.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        oVar.f1199j = jVar.f1168a;
                    }
                    if (oVar.f1199j == null) {
                        oVar.f1199j = new b1();
                    }
                }
                oVar.f8494f.f(this);
                return;
        }
    }
}
