package x4;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.o;
import androidx.lifecycle.r0;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import b.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8653d;

    /* renamed from: e, reason: collision with root package name */
    public final f f8654e;

    public /* synthetic */ b(f fVar, int i) {
        this.f8653d = i;
        this.f8654e = fVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f8653d) {
            case 0:
                if (oVar != o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                uVar.g().f(this);
                f fVar = this.f8654e;
                Bundle a8 = fVar.b().a("androidx.savedstate.Restarter");
                if (a8 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a8.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        i.b(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i.b(newInstance);
                                if (!(fVar instanceof x0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + fVar).toString());
                                }
                                w0 f6 = ((x0) fVar).f();
                                e b8 = fVar.b();
                                f6.getClass();
                                LinkedHashMap linkedHashMap = f6.f877a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    i.e(str3, "key");
                                    r0 r0Var = (r0) linkedHashMap.get(str3);
                                    if (r0Var != null) {
                                        l0.a(r0Var, b8, fVar.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b8.g();
                                }
                            } catch (Exception e8) {
                                throw new RuntimeException("Failed to instantiate " + str2, e8);
                            }
                        } catch (NoSuchMethodException e9) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
                        }
                    } catch (ClassNotFoundException e10) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e10);
                    }
                }
                return;
            default:
                l lVar = (l) this.f8654e;
                if (lVar.f989h == null) {
                    b.i iVar = (b.i) lVar.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        lVar.f989h = iVar.f975a;
                    }
                    if (lVar.f989h == null) {
                        lVar.f989h = new w0();
                    }
                }
                lVar.f2714d.f(this);
                return;
        }
    }
}
