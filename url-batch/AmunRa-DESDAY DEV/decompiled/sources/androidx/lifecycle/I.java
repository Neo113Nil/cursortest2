package androidx.lifecycle;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends Z0.e implements Y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1376b = i;
        this.f1377c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y0.a, Z0.e] */
    @Override // Y0.a
    public final Object a() {
        switch (this.f1376b) {
            case 0:
                return H.e((P) this.f1377c);
            case 1:
                return (List) this.f1377c;
            default:
                try {
                    return (List) ((Z0.e) this.f1377c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return R0.q.f712a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(Y0.a aVar) {
        super(0);
        this.f1376b = 2;
        this.f1377c = (Z0.e) aVar;
    }
}
