package u0;

import I.C0176u;
import I.InterfaceC0169q;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;
import com.gatesof.olympus.martu.marku.R;
import p.C0758d0;

/* loaded from: classes.dex */
public final class k1 implements InterfaceC0169q, InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final C1123s f9388d;

    /* renamed from: e, reason: collision with root package name */
    public final C0176u f9389e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9390f;

    /* renamed from: g, reason: collision with root package name */
    public C0294x f9391g;

    /* renamed from: h, reason: collision with root package name */
    public Q.a f9392h = AbstractC1097e0.f9337a;

    public k1(C1123s c1123s, C0176u c0176u) {
        this.f9388d = c1123s;
        this.f9389e = c0176u;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        if (enumC0285n == EnumC0285n.ON_DESTROY) {
            c();
        } else {
            if (enumC0285n != EnumC0285n.ON_CREATE || this.f9390f) {
                return;
            }
            f(this.f9392h);
        }
    }

    public final void c() {
        if (!this.f9390f) {
            this.f9390f = true;
            this.f9388d.getView().setTag(R.id.wrapped_composition_tag, null);
            C0294x c0294x = this.f9391g;
            if (c0294x != null) {
                c0294x.f(this);
            }
        }
        this.f9389e.l();
    }

    public final void f(Q.a aVar) {
        this.f9388d.setOnViewTreeOwnersAvailable(new C0758d0(this, 11, aVar));
    }
}
