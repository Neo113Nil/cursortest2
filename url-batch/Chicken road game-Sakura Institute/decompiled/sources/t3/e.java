package t3;

import androidx.lifecycle.a1;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends a1 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public x3.e f8779a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.x f8780b;

    @Override // androidx.lifecycle.y0
    public final w0 a(Class cls) {
        androidx.lifecycle.x xVar = this.f8780b;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (xVar == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        x3.e eVar = this.f8779a;
        r6.k.c(eVar);
        r6.k.c(xVar);
        o0 b9 = q0.b(eVar, xVar, canonicalName, null);
        f fVar = new f(b9.f1014g);
        fVar.a("androidx.lifecycle.savedstate.vm.tag", b9);
        return fVar;
    }

    @Override // androidx.lifecycle.y0
    public final w0 c(Class cls, q3.b bVar) {
        String str = (String) ((LinkedHashMap) bVar.f5679a).get(s3.d.f8527a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        x3.e eVar = this.f8779a;
        if (eVar == null) {
            return new f(q0.d(bVar));
        }
        r6.k.c(eVar);
        androidx.lifecycle.x xVar = this.f8780b;
        r6.k.c(xVar);
        o0 b9 = q0.b(eVar, xVar, str, null);
        f fVar = new f(b9.f1014g);
        fVar.a("androidx.lifecycle.savedstate.vm.tag", b9);
        return fVar;
    }

    @Override // androidx.lifecycle.a1
    public final void d(w0 w0Var) {
        x3.e eVar = this.f8779a;
        if (eVar != null) {
            androidx.lifecycle.x xVar = this.f8780b;
            r6.k.c(xVar);
            q0.a(w0Var, eVar, xVar);
        }
    }
}
