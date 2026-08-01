package d2;

import com.appsflyer.R;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r2 implements n0.n, androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final v f3523d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.q f3524e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3525i;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.w f3526r;

    /* renamed from: s, reason: collision with root package name */
    public Function2 f3527s = y0.f3601a;

    public r2(v vVar, n0.q qVar) {
        this.f3523d = vVar;
        this.f3524e = qVar;
    }

    public final void b() {
        if (!this.f3525i) {
            this.f3525i = true;
            this.f3523d.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.w wVar = this.f3526r;
            if (wVar != null) {
                wVar.f(this);
            }
            this.f3526r = null;
        }
        this.f3524e.l();
    }

    public final void c(Function2 function2) {
        this.f3523d.setOnReadyForComposition(new a3.d(4, this, function2));
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            b();
        } else {
            if (oVar != androidx.lifecycle.o.ON_CREATE || this.f3525i) {
                return;
            }
            c(this.f3527s);
        }
    }
}
