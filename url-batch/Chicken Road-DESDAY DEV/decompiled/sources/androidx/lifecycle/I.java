package androidx.lifecycle;

import a1.InterfaceC0059a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends b1.e implements InterfaceC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1401b = i;
        this.f1402c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a1.a, b1.e] */
    @Override // a1.InterfaceC0059a
    public final Object a() {
        switch (this.f1401b) {
            case 0:
                return H.e((P) this.f1402c);
            case 1:
                return (List) this.f1402c;
            default:
                try {
                    return (List) ((b1.e) this.f1402c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return T0.q.f829a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0059a interfaceC0059a) {
        super(0);
        this.f1401b = 2;
        this.f1402c = (b1.e) interfaceC0059a;
    }
}
