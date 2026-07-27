package s0;

import G.C0225u;
import G.InterfaceC0218q;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import com.chicken.road.kedro.laqer.R;

/* loaded from: classes.dex */
public final class l1 implements InterfaceC0218q, InterfaceC0479t {

    /* renamed from: d, reason: collision with root package name */
    public final C1166s f10258d;

    /* renamed from: e, reason: collision with root package name */
    public final C0225u f10259e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10260i;

    /* renamed from: j, reason: collision with root package name */
    public C0483x f10261j;

    /* renamed from: k, reason: collision with root package name */
    public O.a f10262k = AbstractC1140e0.f10197a;

    public l1(C1166s c1166s, C0225u c0225u) {
        this.f10258d = c1166s;
        this.f10259e = c0225u;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n enumC0474n) {
        if (enumC0474n == EnumC0474n.ON_DESTROY) {
            c();
        } else {
            if (enumC0474n != EnumC0474n.ON_CREATE || this.f10260i) {
                return;
            }
            e(this.f10262k);
        }
    }

    public final void c() {
        if (!this.f10260i) {
            this.f10260i = true;
            this.f10258d.getView().setTag(R.id.wrapped_composition_tag, null);
            C0483x c0483x = this.f10261j;
            if (c0483x != null) {
                c0483x.f(this);
            }
        }
        this.f10259e.l();
    }

    public final void e(O.a aVar) {
        this.f10258d.setOnViewTreeOwnersAvailable(new q.n0(this, 8, aVar));
    }
}
