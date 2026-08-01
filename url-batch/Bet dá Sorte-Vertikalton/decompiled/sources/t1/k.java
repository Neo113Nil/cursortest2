package t1;

import a1.InterfaceC0058a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements InterfaceC0058a {

    /* renamed from: a, reason: collision with root package name */
    public final s f3863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3864b;

    public k(o oVar, s sVar) {
        this.f3864b = oVar;
        this.f3863a = sVar;
    }

    @Override // a1.InterfaceC0058a
    public final Object a() {
        o oVar = this.f3864b;
        s sVar = this.f3863a;
        try {
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
        } catch (Throwable th) {
            oVar.g(3, 3, null);
            n1.b.b(sVar);
            throw th;
        }
        if (!sVar.g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.g(false, this)) {
        }
        oVar.g(1, 9, null);
        n1.b.b(sVar);
        return S0.d.f774c;
    }
}
