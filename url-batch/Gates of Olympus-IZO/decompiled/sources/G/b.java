package G;

import L1.z;
import R1.i;
import m.AbstractC0614y;
import m.C0593d;
import m.C0610u;
import m.x0;
import q.C0767b;
import q.C0771f;
import q.l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f1506a;

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f1507b;

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f1508c;

    static {
        C0610u c0610u = new C0610u(0.4f, 0.0f, 0.6f, 1.0f);
        f1506a = new x0(120, 0, AbstractC0614y.f5880a);
        f1507b = new x0(150, 0, c0610u);
        f1508c = new x0(120, 0, c0610u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0017, code lost:
    
        if ((r5 instanceof q.C0769d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if ((r4 instanceof q.C0769d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0593d c0593d, float f3, q.h hVar, q.h hVar2, i iVar) {
        x0 x0Var;
        x0 x0Var2 = null;
        if (hVar2 != null) {
            boolean z3 = hVar2 instanceof l;
            x0Var = f1506a;
            if (!z3) {
                if (!(hVar2 instanceof C0767b)) {
                    if (!(hVar2 instanceof C0771f)) {
                    }
                }
            }
            x0Var2 = x0Var;
        } else if (hVar != null) {
            boolean z4 = hVar instanceof l;
            x0Var = f1507b;
            if (!z4 && !(hVar instanceof C0767b)) {
                if (hVar instanceof C0771f) {
                    x0Var2 = f1508c;
                }
            }
            x0Var2 = x0Var;
        }
        z zVar = z.f2729a;
        if (x0Var2 != null) {
            Object c3 = C0593d.c(c0593d, new M0.e(f3), x0Var2, iVar);
            return c3 == Q1.a.f3113d ? c3 : zVar;
        }
        Object e3 = c0593d.e(new M0.e(f3), iVar);
        return e3 == Q1.a.f3113d ? e3 : zVar;
    }
}
