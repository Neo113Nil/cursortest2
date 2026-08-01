package androidx.lifecycle;

import i1.InterfaceC0181a;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public final class K extends j1.i implements InterfaceC0181a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj) {
        super(0);
        this.f1913b = i;
        this.f1914c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i1.a, j1.i] */
    @Override // i1.InterfaceC0181a
    public final Object c() {
        InterfaceC0203e compileStatement;
        switch (this.f1913b) {
            case 0:
                return J.f((S) this.f1914c);
            case 1:
                compileStatement = r0.database.compileStatement(((androidx.room.B) this.f1914c).createQuery());
                return compileStatement;
            case 2:
                l0.h hVar = (l0.h) this.f1914c;
                String str = hVar.f3263b;
                l0.d dVar = new l0.d();
                dVar.f3251a = null;
                l0.g gVar = new l0.g(hVar.f3262a, hVar.f3263b, dVar, hVar.f3264c);
                gVar.setWriteAheadLoggingEnabled(hVar.e);
                return gVar;
            case 3:
                return (List) this.f1914c;
            default:
                try {
                    return (List) ((j1.i) this.f1914c).c();
                } catch (SSLPeerUnverifiedException unused) {
                    return X0.t.f1385a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC0181a interfaceC0181a) {
        super(0);
        this.f1913b = 4;
        this.f1914c = (j1.i) interfaceC0181a;
    }
}
