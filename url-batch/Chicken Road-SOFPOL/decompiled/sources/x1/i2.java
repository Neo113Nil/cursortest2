package x1;

import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i2 implements m0.u, androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final t f8458d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.y f8459e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8460f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.w f8461g;

    /* renamed from: h, reason: collision with root package name */
    public p6.e f8462h = z0.f8612a;

    public i2(t tVar, m0.y yVar) {
        this.f8458d = tVar;
        this.f8459e = yVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            e();
        } else {
            if (oVar != androidx.lifecycle.o.ON_CREATE || this.f8460f) {
                return;
            }
            f(this.f8462h);
        }
    }

    public final void e() {
        if (!this.f8460f) {
            this.f8460f = true;
            this.f8458d.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.w wVar = this.f8461g;
            if (wVar != null) {
                wVar.f(this);
            }
        }
        this.f8459e.m();
    }

    public final void f(p6.e eVar) {
        this.f8458d.setOnViewTreeOwnersAvailable(new f1.n(9, this, eVar));
    }
}
