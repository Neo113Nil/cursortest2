package androidx.lifecycle;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1341b = i;
        this.f1342c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [W0.a, X0.e] */
    @Override // W0.a
    public final Object a() {
        switch (this.f1341b) {
            case 0:
                return H.e((P) this.f1342c);
            case 1:
                return (List) this.f1342c;
            default:
                try {
                    return (List) ((X0.e) this.f1342c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return Q0.q.f671a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(W0.a aVar) {
        super(0);
        this.f1341b = 2;
        this.f1342c = (X0.e) aVar;
    }
}
