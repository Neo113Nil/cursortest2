package v1;

import c1.InterfaceC0085a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements InterfaceC0085a {

    /* renamed from: a, reason: collision with root package name */
    public final s f4083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4084b;

    public k(o oVar, s sVar) {
        this.f4084b = oVar;
        this.f4083a = sVar;
    }

    @Override // c1.InterfaceC0085a
    public final Object b() {
        o oVar = this.f4084b;
        s sVar = this.f4083a;
        try {
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
        } catch (Throwable th) {
            oVar.g(3, 3, null);
            p1.b.b(sVar);
            throw th;
        }
        if (!sVar.g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.g(false, this)) {
        }
        oVar.g(1, 9, null);
        p1.b.b(sVar);
        return R0.f.f780c;
    }
}
