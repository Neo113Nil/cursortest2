package androidx.lifecycle;

import c1.InterfaceC0085a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends d1.e implements InterfaceC0085a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1460b = i;
        this.f1461c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c1.a, d1.e] */
    @Override // c1.InterfaceC0085a
    public final Object b() {
        switch (this.f1460b) {
            case 0:
                return H.e((P) this.f1461c);
            case 1:
                return (List) this.f1461c;
            default:
                try {
                    return (List) ((d1.e) this.f1461c).b();
                } catch (SSLPeerUnverifiedException unused) {
                    return S0.p.f795a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0085a interfaceC0085a) {
        super(0);
        this.f1460b = 2;
        this.f1461c = (d1.e) interfaceC0085a;
    }
}
