package G1;

import i1.InterfaceC0181a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m implements InterfaceC0181a {

    /* renamed from: a, reason: collision with root package name */
    public final u f385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f386b;

    public m(q qVar, u uVar) {
        this.f386b = qVar;
        this.f385a = uVar;
    }

    @Override // i1.InterfaceC0181a
    public final Object c() {
        q qVar = this.f386b;
        u uVar = this.f385a;
        try {
        } catch (IOException e) {
            qVar.a(2, 2, e);
        } catch (Throwable th) {
            qVar.a(3, 3, null);
            A1.c.b(uVar);
            throw th;
        }
        if (!uVar.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (uVar.a(false, this)) {
        }
        qVar.a(1, 9, null);
        A1.c.b(uVar);
        return W0.i.f1345a;
    }
}
