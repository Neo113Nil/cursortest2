package T2;

import h2.AbstractC0508a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class I extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final v f4389e;

    /* renamed from: b, reason: collision with root package name */
    public final v f4390b;

    /* renamed from: c, reason: collision with root package name */
    public final m f4391c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4392d;

    static {
        String str = v.f4446e;
        f4389e = A1.i.l("/", false);
    }

    public I(v vVar, m mVar, LinkedHashMap linkedHashMap) {
        this.f4390b = vVar;
        this.f4391c = mVar;
        this.f4392d = linkedHashMap;
    }

    @Override // T2.m
    public final l b(v vVar) {
        l lVar;
        Throwable th;
        f2.j.f(vVar, "path");
        v vVar2 = f4389e;
        vVar2.getClass();
        U2.f fVar = (U2.f) this.f4392d.get(U2.c.b(vVar2, vVar, true));
        Throwable th2 = null;
        if (fVar == null) {
            return null;
        }
        boolean z3 = fVar.f4529b;
        l lVar2 = new l(!z3, z3, z3 ? null : Long.valueOf(fVar.f4530c), null, fVar.f4531d, null);
        long j3 = fVar.f4532e;
        if (j3 == -1) {
            return lVar2;
        }
        q c2 = this.f4391c.c(this.f4390b);
        try {
            z p3 = AbstractC0508a.p(c2.d(j3));
            try {
                lVar = U2.b.f(p3, lVar2);
                f2.j.c(lVar);
                try {
                    p3.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    p3.close();
                } catch (Throwable th5) {
                    R1.a.a(th4, th5);
                }
                th = th4;
                lVar = null;
            }
        } catch (Throwable th6) {
            if (c2 != null) {
                try {
                    c2.close();
                } catch (Throwable th7) {
                    R1.a.a(th6, th7);
                }
            }
            lVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        f2.j.c(lVar);
        try {
            c2.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        f2.j.c(lVar);
        return lVar;
    }

    @Override // T2.m
    public final q c(v vVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
