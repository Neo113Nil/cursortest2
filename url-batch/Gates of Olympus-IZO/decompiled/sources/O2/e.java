package O2;

import A2.l;
import L1.j;
import L1.o;
import N2.m;
import N2.q;
import N2.r;
import N2.v;
import Z1.i;
import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final v f2999e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f3000b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3001c;

    /* renamed from: d, reason: collision with root package name */
    public final o f3002d;

    static {
        String str = v.f2966e;
        f2999e = F0.a.l("/", false);
    }

    public e(ClassLoader classLoader) {
        r rVar = m.f2947a;
        i.f(rVar, "systemFileSystem");
        this.f3000b = classLoader;
        this.f3001c = rVar;
        this.f3002d = I2.d.F(new l(13, this));
    }

    @Override // N2.m
    public final N2.l b(v vVar) {
        i.f(vVar, "path");
        if (!F0.a.c(vVar)) {
            return null;
        }
        v vVar2 = f2999e;
        vVar2.getClass();
        String o3 = c.b(vVar2, vVar, true).d(vVar2).f2967d.o();
        for (j jVar : (List) this.f3002d.getValue()) {
            N2.l b2 = ((m) jVar.f2708d).b(((v) jVar.f2709e).e(o3));
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    @Override // N2.m
    public final q c(v vVar) {
        if (!F0.a.c(vVar)) {
            throw new FileNotFoundException("file not found: " + vVar);
        }
        v vVar2 = f2999e;
        vVar2.getClass();
        String o3 = c.b(vVar2, vVar, true).d(vVar2).f2967d.o();
        for (j jVar : (List) this.f3002d.getValue()) {
            try {
                return ((m) jVar.f2708d).c(((v) jVar.f2709e).e(o3));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + vVar);
    }
}
