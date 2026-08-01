package androidx.lifecycle;

import g1.InterfaceC0110a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends h1.e implements InterfaceC0110a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1552b = i;
        this.f1553c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [g1.a, h1.e] */
    @Override // g1.InterfaceC0110a
    public final Object b() {
        switch (this.f1552b) {
            case 0:
                return H.e((P) this.f1553c);
            case 1:
                return (List) this.f1553c;
            default:
                try {
                    return (List) ((h1.e) this.f1553c).b();
                } catch (SSLPeerUnverifiedException unused) {
                    return W0.p.f959a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0110a interfaceC0110a) {
        super(0);
        this.f1552b = 2;
        this.f1553c = (h1.e) interfaceC0110a;
    }
}
