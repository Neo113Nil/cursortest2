package f8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final w f3611e;

    /* renamed from: b, reason: collision with root package name */
    public final w f3612b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3613c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3614d;

    static {
        String str = w.f3645g;
        f3611e = j4.i.m("/", false);
    }

    public j0(w wVar, m mVar, LinkedHashMap linkedHashMap) {
        this.f3612b = wVar;
        this.f3613c = mVar;
        this.f3614d = linkedHashMap;
    }

    @Override // f8.m
    public final void a(w wVar, w wVar2) {
        r6.k.f(wVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // f8.m
    public final void b(w wVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // f8.m
    public final void c(w wVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // f8.m
    public final l e(w wVar) {
        l lVar;
        Throwable th;
        r6.k.f(wVar, "path");
        w wVar2 = f3611e;
        wVar2.getClass();
        g8.g gVar = (g8.g) this.f3614d.get(g8.c.b(wVar2, wVar, true));
        Throwable th2 = null;
        if (gVar == null) {
            return null;
        }
        long j8 = gVar.f4558g;
        boolean z8 = gVar.f4553b;
        l lVar2 = new l(!z8, z8, z8 ? null : Long.valueOf(gVar.f4555d), null, gVar.f4557f, null);
        if (j8 == -1) {
            return lVar2;
        }
        r f9 = this.f3613c.f(this.f3612b);
        try {
            a0 n8 = a8.d.n(f9.c(j8));
            try {
                lVar = g8.b.f(n8, lVar2);
                r6.k.c(lVar);
                try {
                    n8.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    n8.close();
                } catch (Throwable th5) {
                    d6.a.a(th4, th5);
                }
                th = th4;
                lVar = null;
            }
        } catch (Throwable th6) {
            if (f9 != null) {
                try {
                    f9.close();
                } catch (Throwable th7) {
                    d6.a.a(th6, th7);
                }
            }
            lVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        r6.k.c(lVar);
        try {
            f9.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        r6.k.c(lVar);
        return lVar;
    }

    @Override // f8.m
    public final r f(w wVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // f8.m
    public final r g(w wVar) {
        r6.k.f(wVar, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // f8.m
    public final g0 h(w wVar) {
        Throwable th;
        a0 a0Var;
        r6.k.f(wVar, "file");
        w wVar2 = f3611e;
        wVar2.getClass();
        g8.g gVar = (g8.g) this.f3614d.get(g8.c.b(wVar2, wVar, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + wVar);
        }
        long j8 = gVar.f4555d;
        r f9 = this.f3613c.f(this.f3612b);
        try {
            a0Var = a8.d.n(f9.c(gVar.f4558g));
            try {
                f9.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (f9 != null) {
                try {
                    f9.close();
                } catch (Throwable th4) {
                    d6.a.a(th3, th4);
                }
            }
            th = th3;
            a0Var = null;
        }
        if (th != null) {
            throw th;
        }
        r6.k.c(a0Var);
        g8.b.f(a0Var, null);
        if (gVar.f4556e == 0) {
            return new g8.e(a0Var, j8, true);
        }
        return new g8.e(new q(a8.d.n(new g8.e(a0Var, gVar.f4554c, true)), new Inflater(true)), j8, false);
    }
}
