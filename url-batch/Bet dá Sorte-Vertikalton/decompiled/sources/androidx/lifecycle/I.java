package androidx.lifecycle;

import a1.InterfaceC0058a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends b1.e implements InterfaceC0058a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1418b = i;
        this.f1419c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a1.a, b1.e] */
    @Override // a1.InterfaceC0058a
    public final Object a() {
        switch (this.f1418b) {
            case 0:
                return H.e((P) this.f1419c);
            case 1:
                return (List) this.f1419c;
            default:
                try {
                    return (List) ((b1.e) this.f1419c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return T0.q.f844a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0058a interfaceC0058a) {
        super(0);
        this.f1418b = 2;
        this.f1419c = (b1.e) interfaceC0058a;
    }
}
