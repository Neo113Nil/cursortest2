package X4;

import T4.C0151a;
import g4.C0463h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n implements y, j {

    /* renamed from: a, reason: collision with root package name */
    public final u f3583a;

    public /* synthetic */ n(u uVar) {
        this.f3583a = uVar;
    }

    @Override // X4.y
    public boolean a(T4.q url) {
        kotlin.jvm.internal.i.e(url, "url");
        return this.f3583a.a(url);
    }

    @Override // X4.j
    public s b() {
        x e3;
        IOException iOException = null;
        while (true) {
            u uVar = this.f3583a;
            if (!uVar.f3642l.k()) {
                try {
                    e3 = uVar.e();
                } catch (IOException e6) {
                    if (iOException == null) {
                        iOException = e6;
                    } else {
                        K1.b.C(iOException, e6);
                    }
                    if (!uVar.f(null)) {
                        throw iOException;
                    }
                }
                if (e3.e()) {
                    break;
                }
                w g6 = e3.g();
                if (g6.f3649b == null && g6.f3650c == null) {
                    g6 = e3.b();
                }
                x xVar = g6.f3649b;
                Throwable th = g6.f3650c;
                if (th != null) {
                    throw th;
                }
                if (xVar == null) {
                    break;
                }
                uVar.f3646p.addFirst(xVar);
            } else {
                throw new IOException("Canceled");
            }
        }
        return e3.c();
    }

    @Override // X4.j
    public y c() {
        return this.f3583a;
    }

    @Override // X4.y
    public C0463h d() {
        return this.f3583a.f3646p;
    }

    @Override // X4.y
    public x e() {
        return this.f3583a.b();
    }

    @Override // X4.y
    public boolean f(s sVar) {
        return this.f3583a.f(sVar);
    }

    @Override // X4.y
    public C0151a g() {
        return this.f3583a.f3640j;
    }

    @Override // X4.y
    public boolean h() {
        return this.f3583a.f3642l.k();
    }
}
