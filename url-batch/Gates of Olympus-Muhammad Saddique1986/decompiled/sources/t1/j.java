package t1;

import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8890e;

    public /* synthetic */ j(int i3, Object obj) {
        this.f8889d = i3;
        this.f8890e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        switch (this.f8889d) {
            case 0:
                C1013A c1013a = (C1013A) this.f8890e;
                f2.j.f(c1013a, "this$0");
                c1013a.f8823r = enumC0285n.a();
                if (c1013a.f8808c != null) {
                    Iterator<E> it = c1013a.f8812g.iterator();
                    while (it.hasNext()) {
                        C1028h c1028h = (C1028h) it.next();
                        c1028h.getClass();
                        c1028h.f8876g = enumC0285n.a();
                        c1028h.i();
                    }
                    break;
                }
                break;
            default:
                y1.e eVar = (y1.e) this.f8890e;
                f2.j.f(eVar, "this$0");
                if (enumC0285n != EnumC0285n.ON_START) {
                    if (enumC0285n == EnumC0285n.ON_STOP) {
                        eVar.f10392f = false;
                        break;
                    }
                } else {
                    eVar.f10392f = true;
                    break;
                }
                break;
        }
    }
}
