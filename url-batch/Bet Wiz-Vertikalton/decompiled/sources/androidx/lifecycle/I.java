package androidx.lifecycle;

import d1.InterfaceC0081a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends e1.e implements InterfaceC0081a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1446b = i;
        this.f1447c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d1.a, e1.e] */
    @Override // d1.InterfaceC0081a
    public final Object a() {
        switch (this.f1446b) {
            case 0:
                return H.e((P) this.f1447c);
            case 1:
                return (List) this.f1447c;
            default:
                try {
                    return (List) ((e1.e) this.f1447c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return W0.q.f896a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0081a interfaceC0081a) {
        super(0);
        this.f1446b = 2;
        this.f1447c = (e1.e) interfaceC0081a;
    }
}
