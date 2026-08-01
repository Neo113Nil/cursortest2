package w1;

import d1.InterfaceC0081a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements InterfaceC0081a {

    /* renamed from: a, reason: collision with root package name */
    public final s f4111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4112b;

    public k(o oVar, s sVar) {
        this.f4112b = oVar;
        this.f4111a = sVar;
    }

    @Override // d1.InterfaceC0081a
    public final Object a() {
        o oVar = this.f4112b;
        s sVar = this.f4111a;
        try {
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
        } catch (Throwable th) {
            oVar.g(3, 3, null);
            q1.b.b(sVar);
            throw th;
        }
        if (!sVar.g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.g(false, this)) {
        }
        oVar.g(1, 9, null);
        q1.b.b(sVar);
        return V0.e.f878c;
    }
}
