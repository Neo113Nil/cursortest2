package b6;

import X5.C0217a;
import java.io.IOException;
import l5.C0504h;

/* loaded from: classes.dex */
public final class m implements x, i {

    /* renamed from: a, reason: collision with root package name */
    public final t f3674a;

    public /* synthetic */ m(t tVar) {
        this.f3674a = tVar;
    }

    @Override // b6.i
    public r a() {
        w d7;
        IOException iOException = null;
        while (true) {
            t tVar = this.f3674a;
            if (!tVar.f3730k.m()) {
                try {
                    d7 = tVar.d();
                } catch (IOException e4) {
                    if (iOException == null) {
                        iOException = e4;
                    } else {
                        i6.g.a(iOException, e4);
                    }
                    if (!tVar.e(null)) {
                        throw iOException;
                    }
                }
                if (d7.e()) {
                    break;
                }
                v g7 = d7.g();
                if (g7.f3737b == null && g7.f3738c == null) {
                    g7 = d7.c();
                }
                w wVar = g7.f3737b;
                Throwable th = g7.f3738c;
                if (th != null) {
                    throw th;
                }
                if (wVar == null) {
                    break;
                }
                tVar.f3734o.addFirst(wVar);
            } else {
                throw new IOException("Canceled");
            }
        }
        return d7.d();
    }

    @Override // b6.i
    public x b() {
        return this.f3674a;
    }

    @Override // b6.x
    public C0504h c() {
        return this.f3674a.f3734o;
    }

    @Override // b6.x
    public w d() {
        return this.f3674a.a();
    }

    @Override // b6.x
    public boolean e(r rVar) {
        return this.f3674a.e(rVar);
    }

    @Override // b6.x
    public boolean f(X5.o url) {
        kotlin.jvm.internal.i.e(url, "url");
        return this.f3674a.f(url);
    }

    @Override // b6.x
    public C0217a g() {
        return this.f3674a.f3728i;
    }

    @Override // b6.x
    public boolean h() {
        return this.f3674a.f3730k.m();
    }
}
