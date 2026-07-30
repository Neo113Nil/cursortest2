package H6;

import D6.C0093a;
import R5.C0164d;
import java.io.IOException;
import kotlin.collections.C0633l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements x, i {

    /* renamed from: a, reason: collision with root package name */
    public final t f1064a;

    public m(t routePlanner, int i2) {
        switch (i2) {
            case 1:
                Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
                this.f1064a = routePlanner;
                break;
            default:
                Intrinsics.checkNotNullParameter(routePlanner, "delegate");
                this.f1064a = routePlanner;
                break;
        }
    }

    @Override // H6.i
    public r a() {
        w e7;
        IOException iOException = null;
        while (true) {
            t tVar = this.f1064a;
            if (!tVar.f1116k.j()) {
                try {
                    e7 = tVar.e();
                } catch (IOException e8) {
                    if (iOException == null) {
                        iOException = e8;
                    } else {
                        C0164d.a(iOException, e8);
                    }
                    if (!tVar.b(null)) {
                        throw iOException;
                    }
                }
                if (e7.e()) {
                    break;
                }
                v g7 = e7.g();
                if (g7.f1123b == null && g7.f1124c == null) {
                    g7 = e7.b();
                }
                w wVar = g7.f1123b;
                Throwable th = g7.f1124c;
                if (th != null) {
                    throw th;
                }
                if (wVar == null) {
                    break;
                }
                tVar.f1120o.addFirst(wVar);
            } else {
                throw new IOException("Canceled");
            }
        }
        return e7.c();
    }

    @Override // H6.x
    public boolean b(r rVar) {
        return this.f1064a.b(rVar);
    }

    @Override // H6.i
    public x c() {
        return this.f1064a;
    }

    @Override // H6.x
    public C0633l d() {
        return this.f1064a.f1120o;
    }

    @Override // H6.x
    public w e() {
        return this.f1064a.a();
    }

    @Override // H6.x
    public C0093a f() {
        return this.f1064a.f1115i;
    }

    @Override // H6.x
    public boolean g() {
        return this.f1064a.f1116k.j();
    }

    @Override // H6.x
    public boolean h(D6.s url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f1064a.h(url);
    }
}
