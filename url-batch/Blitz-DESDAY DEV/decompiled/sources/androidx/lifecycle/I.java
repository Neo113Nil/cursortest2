package androidx.lifecycle;

import f1.InterfaceC0099a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends g1.e implements InterfaceC0099a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1549c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1548b = i;
        this.f1549c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f1.a, g1.e] */
    @Override // f1.InterfaceC0099a
    public final Object a() {
        switch (this.f1548b) {
            case 0:
                return H.e((P) this.f1549c);
            case 1:
                return (List) this.f1549c;
            default:
                try {
                    return (List) ((g1.e) this.f1549c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return X0.s.f992a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC0099a interfaceC0099a) {
        super(0);
        this.f1548b = 2;
        this.f1549c = (g1.e) interfaceC0099a;
    }
}
