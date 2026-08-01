package f5;

import a2.r;
import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.o;
import androidx.lifecycle.o0;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.z0;
import c6.l;
import d.h;
import d.k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4107d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4108e;

    public /* synthetic */ b(e eVar, int i3) {
        this.f4107d = i3;
        this.f4108e = eVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, o oVar) {
        switch (this.f4107d) {
            case 0:
                if (oVar != o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                uVar.g().f(this);
                e eVar = this.f4108e;
                Bundle b10 = eVar.b().b("androidx.savedstate.Restarter");
                if (b10 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    i0.l("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    String str = stringArrayList.get(i3);
                    i3++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(eVar instanceof a1)) {
                                    r.q(eVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                z0 f3 = ((a1) eVar).f();
                                l b11 = eVar.b();
                                f3.getClass();
                                LinkedHashMap linkedHashMap = f3.f750a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    u0 u0Var = (u0) linkedHashMap.get(str3);
                                    if (u0Var != null) {
                                        o0.a(u0Var, b11, eVar.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b11.l();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(v4.a.k("Failed to instantiate ", str2), e2);
                            }
                        } catch (NoSuchMethodException e9) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
                        }
                    } catch (ClassNotFoundException e10) {
                        throw new RuntimeException(n0.l.g("Class ", str2, " wasn't found"), e10);
                    }
                }
                return;
            default:
                k kVar = (k) this.f4108e;
                if (kVar.f3246s == null) {
                    h hVar = (h) kVar.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        kVar.f3246s = hVar.f3232a;
                    }
                    if (kVar.f3246s == null) {
                        kVar.f3246s = new z0();
                    }
                }
                kVar.f3790d.f(this);
                return;
        }
    }
}
