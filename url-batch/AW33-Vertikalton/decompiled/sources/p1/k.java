package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f3428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3429b;

    public k(o oVar, s sVar) {
        this.f3429b = oVar;
        this.f3428a = sVar;
    }

    @Override // W0.a
    public final Object a() {
        o oVar = this.f3429b;
        s sVar = this.f3428a;
        try {
        } catch (IOException e2) {
            oVar.e(2, 2, e2);
        } catch (Throwable th) {
            oVar.e(3, 3, null);
            j1.b.b(sVar);
            throw th;
        }
        if (!sVar.e(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.e(false, this)) {
        }
        oVar.e(1, 9, null);
        j1.b.b(sVar);
        return P0.d.f626c;
    }
}
