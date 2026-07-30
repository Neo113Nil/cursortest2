package g8;

import androidx.lifecycle.r0;
import d6.o;
import f8.g0;
import f8.i0;
import f8.l;
import f8.m;
import f8.r;
import f8.s;
import f8.u;
import f8.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final w f4548e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f4549b;

    /* renamed from: c, reason: collision with root package name */
    public final m f4550c;

    /* renamed from: d, reason: collision with root package name */
    public final o f4551d;

    static {
        String str = w.f3645g;
        f4548e = j4.i.m("/", false);
    }

    public f(ClassLoader classLoader) {
        s sVar = m.f3625a;
        k.f(sVar, "systemFileSystem");
        this.f4549b = classLoader;
        this.f4550c = sVar;
        this.f4551d = d6.a.d(new r0(11, this));
    }

    @Override // f8.m
    public final void a(w wVar, w wVar2) {
        k.f(wVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // f8.m
    public final void b(w wVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // f8.m
    public final void c(w wVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // f8.m
    public final l e(w wVar) {
        k.f(wVar, "path");
        if (!m4.f.g(wVar)) {
            return null;
        }
        w wVar2 = f4548e;
        wVar2.getClass();
        String C = c.b(wVar2, wVar, true).h(wVar2).f3646f.C();
        for (d6.j jVar : (List) this.f4551d.getValue()) {
            l e9 = ((m) jVar.f2618f).e(((w) jVar.f2619g).l(C));
            if (e9 != null) {
                return e9;
            }
        }
        return null;
    }

    @Override // f8.m
    public final r f(w wVar) {
        if (!m4.f.g(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        w wVar2 = f4548e;
        wVar2.getClass();
        String C = c.b(wVar2, wVar, true).h(wVar2).f3646f.C();
        for (d6.j jVar : (List) this.f4551d.getValue()) {
            try {
                return ((m) jVar.f2618f).f(((w) jVar.f2619g).l(C));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // f8.m
    public final r g(w wVar) {
        k.f(wVar, "file");
        throw new IOException("resources are not writable");
    }

    @Override // f8.m
    public final g0 h(w wVar) {
        k.f(wVar, "file");
        if (!m4.f.g(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        w wVar2 = f4548e;
        wVar2.getClass();
        InputStream resourceAsStream = this.f4549b.getResourceAsStream(c.b(wVar2, wVar, false).h(wVar2).f3646f.C());
        if (resourceAsStream != null) {
            Logger logger = u.f3642a;
            return new f8.d(resourceAsStream, 1, new i0());
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }
}
