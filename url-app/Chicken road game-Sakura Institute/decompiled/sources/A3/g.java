package A3;

import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import y2.C1336k;
import y2.InterfaceC1335j;
import z3.l;
import z3.m;
import z3.q;
import z3.r;
import z3.v;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final v f854e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f855b;

    /* renamed from: c, reason: collision with root package name */
    public final m f856c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1335j f857d;

    static {
        String str = v.f12037e;
        f854e = E1.i.i("/", false);
    }

    public g(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        r systemFileSystem = m.f12017a;
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f855b = classLoader;
        this.f856c = systemFileSystem;
        this.f857d = C1336k.a(new e(0, this));
    }

    @Override // z3.m
    public final l b(v child) {
        Intrinsics.checkNotNullParameter(child, "path");
        if (!E1.i.f(child)) {
            return null;
        }
        v vVar = f854e;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String C3 = c.b(vVar, child, true).h(vVar).f12038d.C();
        for (Pair pair : (List) this.f857d.getValue()) {
            l b4 = ((m) pair.f7485d).b(((v) pair.f7486e).j(C3));
            if (b4 != null) {
                return b4;
            }
        }
        return null;
    }

    @Override // z3.m
    public final q c(v child) {
        Intrinsics.checkNotNullParameter(child, "file");
        if (!E1.i.f(child)) {
            throw new FileNotFoundException("file not found: " + child);
        }
        v vVar = f854e;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        String C3 = c.b(vVar, child, true).h(vVar).f12038d.C();
        for (Pair pair : (List) this.f857d.getValue()) {
            try {
                return ((m) pair.f7485d).c(((v) pair.f7486e).j(C3));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + child);
    }
}
