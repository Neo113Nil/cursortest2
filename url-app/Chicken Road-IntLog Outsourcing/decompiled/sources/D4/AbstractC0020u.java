package D4;

import k4.AbstractC1215a;
import k4.C1219e;
import k4.C1224j;
import k4.InterfaceC1220f;
import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;

/* renamed from: D4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0020u extends AbstractC1215a implements InterfaceC1220f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0019t f542b = new C0019t(C1219e.f10719a, C0018s.f534e);

    public AbstractC0020u() {
        super(C1219e.f10719a);
    }

    public abstract void C(InterfaceC1223i interfaceC1223i, Runnable runnable);

    public void D(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        C(interfaceC1223i, runnable);
    }

    public boolean E() {
        return !(this instanceof u0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, t4.l] */
    @Override // k4.AbstractC1215a, k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h key) {
        kotlin.jvm.internal.i.e(key, "key");
        boolean z = key instanceof C0019t;
        C1224j c1224j = C1224j.f10720a;
        if (z) {
            C0019t c0019t = (C0019t) key;
            InterfaceC1222h interfaceC1222h = this.f10715a;
            if ((interfaceC1222h == c0019t || c0019t.f537b == interfaceC1222h) && ((InterfaceC1221g) c0019t.f536a.invoke(this)) != null) {
                return c1224j;
            }
        } else if (C1219e.f10719a == key) {
            return c1224j;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, t4.l] */
    @Override // k4.AbstractC1215a, k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h key) {
        InterfaceC1221g interfaceC1221g;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof C0019t)) {
            if (C1219e.f10719a == key) {
                return this;
            }
            return null;
        }
        C0019t c0019t = (C0019t) key;
        InterfaceC1222h interfaceC1222h = this.f10715a;
        if ((interfaceC1222h == c0019t || c0019t.f537b == interfaceC1222h) && (interfaceC1221g = (InterfaceC1221g) c0019t.f536a.invoke(this)) != null) {
            return interfaceC1221g;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0024y.h(this);
    }
}
