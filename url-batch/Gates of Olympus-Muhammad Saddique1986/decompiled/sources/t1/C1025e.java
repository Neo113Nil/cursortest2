package t1;

import androidx.lifecycle.C0294x;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import java.util.LinkedHashMap;
import q1.C0812b;
import s1.C0966d;

/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025e extends Z implements X {

    /* renamed from: a, reason: collision with root package name */
    public y1.e f8868a;

    /* renamed from: b, reason: collision with root package name */
    public C0294x f8869b;

    @Override // androidx.lifecycle.X
    public final V a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f8869b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        y1.e eVar = this.f8868a;
        f2.j.c(eVar);
        C0294x c0294x = this.f8869b;
        f2.j.c(c0294x);
        N b3 = P.b(eVar, c0294x, canonicalName, null);
        C1026f c1026f = new C1026f(b3.f5185e);
        c1026f.a("androidx.lifecycle.savedstate.vm.tag", b3);
        return c1026f;
    }

    @Override // androidx.lifecycle.X
    public final V b(Class cls, C0812b c0812b) {
        String str = (String) ((LinkedHashMap) c0812b.f6877a).get(C0966d.f8358a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        y1.e eVar = this.f8868a;
        if (eVar == null) {
            return new C1026f(P.d(c0812b));
        }
        f2.j.c(eVar);
        C0294x c0294x = this.f8869b;
        f2.j.c(c0294x);
        N b3 = P.b(eVar, c0294x, str, null);
        C1026f c1026f = new C1026f(b3.f5185e);
        c1026f.a("androidx.lifecycle.savedstate.vm.tag", b3);
        return c1026f;
    }

    @Override // androidx.lifecycle.Z
    public final void d(V v3) {
        y1.e eVar = this.f8868a;
        if (eVar != null) {
            C0294x c0294x = this.f8869b;
            f2.j.c(c0294x);
            P.a(v3, eVar, c0294x);
        }
    }
}
