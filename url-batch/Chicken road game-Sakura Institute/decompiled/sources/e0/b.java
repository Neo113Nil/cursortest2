package e0;

import l.u;
import l.v1;
import l.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f2666a;

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f2667b;

    /* renamed from: c, reason: collision with root package name */
    public static final v1 f2668c;

    static {
        u uVar = new u(0.4f, 0.0f, 0.6f, 1.0f);
        f2666a = new v1(120, 0, z.f5732a);
        f2667b = new v1(150, 0, uVar);
        f2668c = new v1(120, 0, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if ((r10 instanceof p.d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if ((r9 instanceof p.d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l.d dVar, float f9, p.h hVar, p.h hVar2, j6.c cVar) {
        v1 v1Var;
        v1 v1Var2 = null;
        if (hVar2 != null) {
            boolean z8 = hVar2 instanceof p.l;
            v1Var = f2666a;
            if (!z8) {
                if (!(hVar2 instanceof p.b)) {
                    if (!(hVar2 instanceof p.f)) {
                    }
                }
            }
            v1Var2 = v1Var;
        } else if (hVar != null) {
            boolean z9 = hVar instanceof p.l;
            v1Var = f2667b;
            if (!z9 && !(hVar instanceof p.b)) {
                if (hVar instanceof p.f) {
                    v1Var2 = f2668c;
                }
            }
            v1Var2 = v1Var;
        }
        v1 v1Var3 = v1Var2;
        i6.a aVar = i6.a.f4956f;
        if (v1Var3 != null) {
            Object c4 = l.d.c(dVar, new m2.e(f9), v1Var3, null, cVar, 12);
            if (c4 == aVar) {
                return c4;
            }
        } else {
            Object e9 = dVar.e(cVar, new m2.e(f9));
            if (e9 == aVar) {
                return e9;
            }
        }
        return d6.z.f2639a;
    }
}
