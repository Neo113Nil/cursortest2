package r1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f3560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3561b;

    public k(o oVar, s sVar) {
        this.f3561b = oVar;
        this.f3560a = sVar;
    }

    @Override // Y0.a
    public final Object a() {
        o oVar = this.f3561b;
        s sVar = this.f3560a;
        try {
        } catch (IOException e2) {
            oVar.f(2, 2, e2);
        } catch (Throwable th) {
            oVar.f(3, 3, null);
            l1.b.b(sVar);
            throw th;
        }
        if (!sVar.f(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.f(false, this)) {
        }
        oVar.f(1, 9, null);
        l1.b.b(sVar);
        return Q0.e.f694c;
    }
}
