package androidx.lifecycle;

import j1.InterfaceC0170a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import l0.C0277d;
import l0.C0280g;
import l0.C0281h;

/* loaded from: classes.dex */
public final class K extends k1.f implements InterfaceC0170a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj) {
        super(0);
        this.f1864b = i;
        this.f1865c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j1.a, k1.f] */
    @Override // j1.InterfaceC0170a
    public final Object c() {
        switch (this.f1864b) {
            case 0:
                return J.f((S) this.f1865c);
            case 1:
                return ((h0.r) this.f1865c).k();
            case 2:
                C0281h c0281h = (C0281h) this.f1865c;
                String str = c0281h.f3525b;
                C0277d c0277d = new C0277d();
                c0277d.f3513a = null;
                C0280g c0280g = new C0280g(c0281h.f3524a, c0281h.f3525b, c0277d, c0281h.f3526c);
                c0280g.setWriteAheadLoggingEnabled(c0281h.f3527e);
                return c0280g;
            case 3:
                return (List) this.f1865c;
            default:
                try {
                    return (List) ((k1.f) this.f1865c).c();
                } catch (SSLPeerUnverifiedException unused) {
                    return Y0.s.f1516a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC0170a interfaceC0170a) {
        super(0);
        this.f1864b = 4;
        this.f1865c = (k1.f) interfaceC0170a;
    }
}
