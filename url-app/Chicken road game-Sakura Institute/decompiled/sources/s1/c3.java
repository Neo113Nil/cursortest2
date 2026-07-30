package s1;

import com.android.installreferrer.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c3 implements g0.q, androidx.lifecycle.t {

    /* renamed from: f, reason: collision with root package name */
    public final r f8188f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.u f8189g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8190h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.lifecycle.x f8191i;

    /* renamed from: j, reason: collision with root package name */
    public q6.e f8192j = d1.f8197a;

    public c3(r rVar, g0.u uVar) {
        this.f8188f = rVar;
        this.f8189g = uVar;
    }

    public final void a() {
        if (!this.f8190h) {
            this.f8190h = true;
            this.f8188f.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.x xVar = this.f8191i;
            if (xVar != null) {
                xVar.f(this);
            }
        }
        this.f8189g.l();
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            a();
        } else {
            if (nVar != androidx.lifecycle.n.ON_CREATE || this.f8190h) {
                return;
            }
            d(this.f8192j);
        }
    }

    public final void d(q6.e eVar) {
        this.f8188f.setOnViewTreeOwnersAvailable(new q.t0(this, 8, eVar));
    }
}
