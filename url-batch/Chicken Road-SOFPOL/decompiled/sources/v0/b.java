package v0;

import a0.g1;
import androidx.lifecycle.m0;
import m0.a2;
import m0.v0;
import w0.n;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public i f7428d;

    /* renamed from: e, reason: collision with root package name */
    public e f7429e;

    /* renamed from: f, reason: collision with root package name */
    public String f7430f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7431g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f7432h;
    public g1 i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f7433j = new m0(15, this);

    public b(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f7428d = iVar;
        this.f7429e = eVar;
        this.f7430f = str;
        this.f7431g = obj;
        this.f7432h = objArr;
    }

    public final void a() {
        String a8;
        e eVar = this.f7429e;
        if (this.i != null) {
            throw new IllegalArgumentException(("entry(" + this.i + ") is not null").toString());
        }
        if (eVar != null) {
            m0 m0Var = this.f7433j;
            Object b8 = m0Var.b();
            if (b8 == null || eVar.c(b8)) {
                this.i = eVar.f(this.f7430f, m0Var);
                return;
            }
            if (b8 instanceof n) {
                n nVar = (n) b8;
                if (nVar.d() == v0.f5133f || nVar.d() == v0.i || nVar.d() == v0.f5134g) {
                    a8 = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a8 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a8 = j.a(b8);
            }
            throw new IllegalArgumentException(a8);
        }
    }

    @Override // m0.a2
    public final void e() {
        a();
    }

    @Override // m0.a2
    public final void f() {
        g1 g1Var = this.i;
        if (g1Var != null) {
            g1Var.P();
        }
    }

    @Override // m0.a2
    public final void i() {
        g1 g1Var = this.i;
        if (g1Var != null) {
            g1Var.P();
        }
    }
}
