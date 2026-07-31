package H5;

import o5.AbstractC0561a;
import o5.C0565e;
import o5.InterfaceC0566f;
import o5.InterfaceC0567g;
import o5.InterfaceC0568h;
import o5.InterfaceC0569i;

/* renamed from: H5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0161v extends AbstractC0561a implements InterfaceC0566f {

    /* renamed from: g, reason: collision with root package name */
    public static final C0160u f1107g = new C0160u(C0565e.f5619f, C0159t.f1100f);

    public AbstractC0161v() {
        super(C0565e.f5619f);
    }

    public abstract void F(InterfaceC0569i interfaceC0569i, Runnable runnable);

    public void G(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        F(interfaceC0569i, runnable);
    }

    public boolean H() {
        return !(this instanceof u0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, x5.l] */
    @Override // o5.AbstractC0561a, o5.InterfaceC0569i
    public final InterfaceC0567g m(InterfaceC0568h key) {
        InterfaceC0567g interfaceC0567g;
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof C0160u) {
            C0160u c0160u = (C0160u) key;
            InterfaceC0568h interfaceC0568h = this.f5615f;
            if ((interfaceC0568h == c0160u || c0160u.f1105g == interfaceC0568h) && (interfaceC0567g = (InterfaceC0567g) c0160u.f1104f.invoke(this)) != null) {
                return interfaceC0567g;
            }
        } else if (C0565e.f5619f == key) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0165z.g(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((o5.InterfaceC0567g) r3.f1104f.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return o5.C0570j.f5620f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (o5.C0565e.f5619f == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, x5.l] */
    @Override // o5.AbstractC0561a, o5.InterfaceC0569i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0569i y(InterfaceC0568h key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof C0160u) {
            C0160u c0160u = (C0160u) key;
            InterfaceC0568h interfaceC0568h = this.f5615f;
            if (interfaceC0568h != c0160u && c0160u.f1105g != interfaceC0568h) {
                return this;
            }
        }
    }
}
