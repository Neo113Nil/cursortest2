package N2;

import a.AbstractC0157a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class I extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final v f2909e;

    /* renamed from: b, reason: collision with root package name */
    public final v f2910b;

    /* renamed from: c, reason: collision with root package name */
    public final m f2911c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2912d;

    static {
        String str = v.f2966e;
        f2909e = F0.a.l("/", false);
    }

    public I(v vVar, m mVar, LinkedHashMap linkedHashMap) {
        this.f2910b = vVar;
        this.f2911c = mVar;
        this.f2912d = linkedHashMap;
    }

    @Override // N2.m
    public final l b(v vVar) {
        l lVar;
        Throwable th;
        Z1.i.f(vVar, "path");
        v vVar2 = f2909e;
        vVar2.getClass();
        O2.f fVar = (O2.f) this.f2912d.get(O2.c.b(vVar2, vVar, true));
        Throwable th2 = null;
        if (fVar == null) {
            return null;
        }
        boolean z3 = fVar.f3004b;
        l lVar2 = new l(!z3, z3, z3 ? null : Long.valueOf(fVar.f3005c), null, fVar.f3006d, null);
        long j3 = fVar.f3007e;
        if (j3 == -1) {
            return lVar2;
        }
        q c3 = this.f2911c.c(this.f2910b);
        try {
            z j4 = AbstractC0157a.j(c3.e(j3));
            try {
                lVar = O2.b.f(j4, lVar2);
                Z1.i.c(lVar);
                try {
                    j4.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    j4.close();
                } catch (Throwable th5) {
                    M1.B.o(th4, th5);
                }
                th = th4;
                lVar = null;
            }
        } catch (Throwable th6) {
            if (c3 != null) {
                try {
                    c3.close();
                } catch (Throwable th7) {
                    M1.B.o(th6, th7);
                }
            }
            lVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        Z1.i.c(lVar);
        try {
            c3.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        Z1.i.c(lVar);
        return lVar;
    }

    @Override // N2.m
    public final q c(v vVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
