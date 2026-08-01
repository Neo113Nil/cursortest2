package y1;

import f1.InterfaceC0090a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements InterfaceC0090a {

    /* renamed from: a, reason: collision with root package name */
    public final s f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f4256b;

    public k(o oVar, s sVar) {
        this.f4256b = oVar;
        this.f4255a = sVar;
    }

    @Override // f1.InterfaceC0090a
    public final Object b() {
        o oVar = this.f4256b;
        s sVar = this.f4255a;
        try {
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
        } catch (Throwable th) {
            oVar.g(3, 3, null);
            s1.b.b(sVar);
            throw th;
        }
        if (!sVar.g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (sVar.g(false, this)) {
        }
        oVar.g(1, 9, null);
        s1.b.b(sVar);
        return U0.f.f904c;
    }
}
