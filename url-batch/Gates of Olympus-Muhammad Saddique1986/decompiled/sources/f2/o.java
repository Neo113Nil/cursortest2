package f2;

import d2.C0408a;
import l2.InterfaceC0600a;
import l2.InterfaceC0603d;
import l2.InterfaceC0604e;

/* loaded from: classes.dex */
public class o extends p implements InterfaceC0603d {
    public o(Class cls, String str, String str2) {
        super(C0434a.f5811d, cls, str, str2, 1);
    }

    @Override // f2.b
    public final InterfaceC0600a a() {
        v.f5833a.getClass();
        return this;
    }

    @Override // l2.InterfaceC0603d
    public Object get(Object obj) {
        l();
        throw null;
    }

    @Override // l2.InterfaceC0603d
    public final void l() {
        if (this.f5827j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC0600a e3 = e();
        if (e3 == this) {
            throw new C0408a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((InterfaceC0603d) ((InterfaceC0604e) e3)).l();
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        return get(obj);
    }
}
