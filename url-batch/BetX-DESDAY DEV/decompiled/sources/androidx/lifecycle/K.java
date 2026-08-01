package androidx.lifecycle;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class K extends X0.g implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj) {
        super(0);
        this.f1457b = i;
        this.f1458c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [W0.a, X0.g] */
    @Override // W0.a
    public final Object a() {
        switch (this.f1457b) {
            case 0:
                return J.e((V) this.f1458c);
            case 1:
                return (List) this.f1458c;
            default:
                try {
                    return (List) ((X0.g) this.f1458c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return O0.q.f695a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(W0.a aVar) {
        super(0);
        this.f1457b = 2;
        this.f1458c = (X0.g) aVar;
    }
}
