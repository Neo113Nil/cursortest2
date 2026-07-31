package q1;

import androidx.lifecycle.C0238x;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import java.util.LinkedHashMap;
import n1.C0675b;
import p1.C0765d;

/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781e extends Z implements X {

    /* renamed from: a, reason: collision with root package name */
    public u1.e f6889a;

    /* renamed from: b, reason: collision with root package name */
    public C0238x f6890b;

    @Override // androidx.lifecycle.X
    public final V a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f6890b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        u1.e eVar = this.f6889a;
        Z1.i.c(eVar);
        C0238x c0238x = this.f6890b;
        Z1.i.c(c0238x);
        N b2 = P.b(eVar, c0238x, canonicalName, null);
        C0782f c0782f = new C0782f(b2.f3984e);
        c0782f.a("androidx.lifecycle.savedstate.vm.tag", b2);
        return c0782f;
    }

    @Override // androidx.lifecycle.X
    public final V b(Class cls, C0675b c0675b) {
        String str = (String) ((LinkedHashMap) c0675b.f5876a).get(C0765d.f6760a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        u1.e eVar = this.f6889a;
        if (eVar == null) {
            return new C0782f(P.d(c0675b));
        }
        Z1.i.c(eVar);
        C0238x c0238x = this.f6890b;
        Z1.i.c(c0238x);
        N b2 = P.b(eVar, c0238x, str, null);
        C0782f c0782f = new C0782f(b2.f3984e);
        c0782f.a("androidx.lifecycle.savedstate.vm.tag", b2);
        return c0782f;
    }

    @Override // androidx.lifecycle.Z
    public final void d(V v3) {
        u1.e eVar = this.f6889a;
        if (eVar != null) {
            C0238x c0238x = this.f6890b;
            Z1.i.c(c0238x);
            P.a(v3, eVar, c0238x);
        }
    }
}
