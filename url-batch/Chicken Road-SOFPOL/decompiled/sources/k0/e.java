package k0;

import c6.m;
import r.q;
import r.q1;
import r.u;
import v.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f4154a;

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f4155b;

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f4156c;

    static {
        q qVar = new q(0.4f, 0.0f, 0.6f, 1.0f);
        f4154a = new q1(120, 0, u.f6437a);
        f4155b = new q1(150, 0, qVar);
        f4156c = new q1(120, 0, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if ((r10 instanceof v.d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if ((r9 instanceof v.d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r.c cVar, float f6, v.h hVar, v.h hVar2, i6.i iVar) {
        q1 q1Var;
        q1 q1Var2 = null;
        if (hVar2 != null) {
            boolean z3 = hVar2 instanceof l;
            q1Var = f4154a;
            if (!z3) {
                if (!(hVar2 instanceof v.b)) {
                    if (!(hVar2 instanceof v.f)) {
                    }
                }
            }
            q1Var2 = q1Var;
        } else if (hVar != null) {
            boolean z7 = hVar instanceof l;
            q1Var = f4155b;
            if (!z7 && !(hVar instanceof v.b)) {
                if (hVar instanceof v.f) {
                    q1Var2 = f4156c;
                }
            }
            q1Var2 = q1Var;
        }
        q1 q1Var3 = q1Var2;
        h6.a aVar = h6.a.f3204d;
        if (q1Var3 != null) {
            Object c8 = r.c.c(cVar, new r2.f(f6), q1Var3, null, iVar, 12);
            if (c8 == aVar) {
                return c8;
            }
        } else {
            Object e8 = cVar.e(new r2.f(f6), iVar);
            if (e8 == aVar) {
                return e8;
            }
        }
        return m.f1757a;
    }
}
