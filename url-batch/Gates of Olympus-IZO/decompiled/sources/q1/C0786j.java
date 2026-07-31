package q1;

import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;
import java.util.Iterator;

/* renamed from: q1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0786j implements InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6911e;

    public /* synthetic */ C0786j(int i3, Object obj) {
        this.f6910d = i3;
        this.f6911e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        switch (this.f6910d) {
            case 0:
                C0775D c0775d = (C0775D) this.f6911e;
                Z1.i.f(c0775d, "this$0");
                c0775d.f6844r = enumC0229n.a();
                if (c0775d.f6830c != null) {
                    Iterator<E> it = c0775d.f6834g.iterator();
                    while (it.hasNext()) {
                        C0784h c0784h = (C0784h) it.next();
                        c0784h.getClass();
                        c0784h.f6897g = enumC0229n.a();
                        c0784h.i();
                    }
                    break;
                }
                break;
            default:
                u1.e eVar = (u1.e) this.f6911e;
                Z1.i.f(eVar, "this$0");
                if (enumC0229n != EnumC0229n.ON_START) {
                    if (enumC0229n == EnumC0229n.ON_STOP) {
                        eVar.f8517f = false;
                        break;
                    }
                } else {
                    eVar.f8517f = true;
                    break;
                }
                break;
        }
    }
}
