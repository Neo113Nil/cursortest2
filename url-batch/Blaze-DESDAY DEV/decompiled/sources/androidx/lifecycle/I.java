package androidx.lifecycle;

import f1.InterfaceC0090a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends g1.e implements InterfaceC0090a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1491b = i;
        this.f1492c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f1.a, g1.e] */
    @Override // f1.InterfaceC0090a
    public final Object b() {
        switch (this.f1491b) {
            case 0:
                return H.e((P) this.f1492c);
            case 1:
                return (List) this.f1492c;
            default:
                try {
                    return (List) ((g1.e) this.f1492c).b();
                } catch (SSLPeerUnverifiedException unused) {
                    return V0.p.f917a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0090a interfaceC0090a) {
        super(0);
        this.f1491b = 2;
        this.f1492c = (g1.e) interfaceC0090a;
    }
}
