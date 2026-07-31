package u0;

import I.C0122u;
import I.InterfaceC0115q;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;
import com.gates.olympus.miruv.R;

/* loaded from: classes.dex */
public final class Z0 implements InterfaceC0115q, InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final C0997t f8273d;

    /* renamed from: e, reason: collision with root package name */
    public final C0122u f8274e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8275f;

    /* renamed from: g, reason: collision with root package name */
    public C0238x f8276g;

    /* renamed from: h, reason: collision with root package name */
    public Q.a f8277h = Z.f8272a;

    public Z0(C0997t c0997t, C0122u c0122u) {
        this.f8273d = c0997t;
        this.f8274e = c0122u;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        if (enumC0229n == EnumC0229n.ON_DESTROY) {
            c();
        } else {
            if (enumC0229n != EnumC0229n.ON_CREATE || this.f8275f) {
                return;
            }
            d(this.f8277h);
        }
    }

    public final void c() {
        if (!this.f8275f) {
            this.f8275f = true;
            this.f8273d.getView().setTag(R.id.wrapped_composition_tag, null);
            C0238x c0238x = this.f8276g;
            if (c0238x != null) {
                c0238x.f(this);
            }
        }
        this.f8274e.l();
    }

    public final void d(Q.a aVar) {
        this.f8273d.setOnViewTreeOwnersAvailable(new t.o(this, 6, aVar));
    }
}
