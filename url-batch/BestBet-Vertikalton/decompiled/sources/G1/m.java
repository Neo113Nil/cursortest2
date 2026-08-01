package G1;

import j1.InterfaceC0170a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m implements InterfaceC0170a {

    /* renamed from: a, reason: collision with root package name */
    public final u f401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f402b;

    public m(q qVar, u uVar) {
        this.f402b = qVar;
        this.f401a = uVar;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        q qVar = this.f402b;
        u uVar = this.f401a;
        try {
        } catch (IOException e2) {
            qVar.a(2, 2, e2);
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
        return X0.g.f1277c;
    }
}
