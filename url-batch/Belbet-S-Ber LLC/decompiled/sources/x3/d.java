package x3;

import a4.f0;
import java.io.IOException;
import t3.r;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i f3899a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3900b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.d f3901c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final l f3902e;

    public d(i iVar, e eVar, y3.d dVar) {
        i3.d.e(eVar, "finder");
        this.f3899a = iVar;
        this.f3900b = eVar;
        this.f3901c = dVar;
        this.f3902e = dVar.g();
    }

    public final r a(boolean z4) {
        try {
            r e4 = this.f3901c.e(z4);
            if (e4 == null) {
                return e4;
            }
            e4.f3519m = this;
            return e4;
        } catch (IOException e5) {
            b(e5);
            throw e5;
        }
    }

    public final void b(IOException iOException) {
        this.d = true;
        this.f3900b.c(iOException);
        l g3 = this.f3901c.g();
        i iVar = this.f3899a;
        synchronized (g3) {
            try {
                if (!(iOException instanceof f0)) {
                    if (!(g3.f3933g != null) || (iOException instanceof a4.a)) {
                        g3.f3934j = true;
                        if (g3.f3937m == 0) {
                            l.d(iVar.f3913f, g3.f3929b, iOException);
                            g3.f3936l++;
                        }
                    }
                } else if (((f0) iOException).f171f == 8) {
                    int i = g3.f3938n + 1;
                    g3.f3938n = i;
                    if (i > 1) {
                        g3.f3934j = true;
                        g3.f3936l++;
                    }
                } else if (((f0) iOException).f171f != 9 || !iVar.f3923r) {
                    g3.f3934j = true;
                    g3.f3936l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
