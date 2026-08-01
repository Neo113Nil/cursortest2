package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f3802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3803b;

    public k(o oVar, s sVar) {
        this.f3803b = oVar;
        this.f3802a = sVar;
    }

    @Override // W0.a
    public final Object a() {
        o oVar = this.f3803b;
        s sVar = this.f3802a;
        try {
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
        } catch (Throwable th) {
            oVar.g(3, 3, null);
            j1.b.b(sVar);
            throw th;
        }
        if (!sVar.g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.g(false, this)) {
        }
        oVar.g(1, 9, null);
        j1.b.b(sVar);
        return N0.e.f676c;
    }
}
