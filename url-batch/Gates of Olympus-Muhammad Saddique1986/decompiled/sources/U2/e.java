package U2;

import A1.i;
import R1.n;
import T2.l;
import T2.m;
import T2.q;
import T2.r;
import T2.v;
import f2.j;
import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final v f4524e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f4525b;

    /* renamed from: c, reason: collision with root package name */
    public final m f4526c;

    /* renamed from: d, reason: collision with root package name */
    public final n f4527d;

    static {
        String str = v.f4446e;
        f4524e = i.l("/", false);
    }

    public e(ClassLoader classLoader) {
        r rVar = m.f4427a;
        j.f(rVar, "systemFileSystem");
        this.f4525b = classLoader;
        this.f4526c = rVar;
        this.f4527d = R1.a.d(new A.h(17, this));
    }

    @Override // T2.m
    public final l b(v vVar) {
        j.f(vVar, "path");
        if (!i.b(vVar)) {
            return null;
        }
        v vVar2 = f4524e;
        vVar2.getClass();
        String o3 = c.b(vVar2, vVar, true).d(vVar2).f4447d.o();
        for (R1.i iVar : (List) this.f4527d.getValue()) {
            l b3 = ((m) iVar.f4150d).b(((v) iVar.f4151e).e(o3));
            if (b3 != null) {
                return b3;
            }
        }
        return null;
    }

    @Override // T2.m
    public final q c(v vVar) {
        if (!i.b(vVar)) {
            throw new FileNotFoundException("file not found: " + vVar);
        }
        v vVar2 = f4524e;
        vVar2.getClass();
        String o3 = c.b(vVar2, vVar, true).d(vVar2).f4447d.o();
        for (R1.i iVar : (List) this.f4527d.getValue()) {
            try {
                return ((m) iVar.f4150d).c(((v) iVar.f4151e).e(o3));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + vVar);
    }
}
