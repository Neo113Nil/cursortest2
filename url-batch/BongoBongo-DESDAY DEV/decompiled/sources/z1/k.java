package z1;

import g1.InterfaceC0110a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements InterfaceC0110a {

    /* renamed from: a, reason: collision with root package name */
    public final s f4453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4454b;

    public k(o oVar, s sVar) {
        this.f4454b = oVar;
        this.f4453a = sVar;
    }

    @Override // g1.InterfaceC0110a
    public final Object b() {
        o oVar = this.f4454b;
        s sVar = this.f4453a;
        try {
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
        } catch (Throwable th) {
            oVar.g(3, 3, null);
            t1.b.b(sVar);
            throw th;
        }
        if (!sVar.g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.g(false, this)) {
        }
        oVar.g(1, 9, null);
        t1.b.b(sVar);
        return V0.e.f946c;
    }
}
