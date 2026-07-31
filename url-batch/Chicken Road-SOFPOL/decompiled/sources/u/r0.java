package u;

import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f7082a = new s1(18);

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f7083b = new o0();

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f7084c = new n0();

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f7085d = new p0();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e1 e1Var, long j7, i6.c cVar) {
        q0 q0Var;
        int i;
        q6.p pVar;
        e1 e1Var2;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i8 = q0Var.f7075j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                q0Var.f7075j = i8 - Integer.MIN_VALUE;
                Object obj = q0Var.i;
                i = q0Var.f7075j;
                if (i != 0) {
                    s6.a.K(obj);
                    pVar = new q6.p();
                    t.d dVar = new t.d(e1Var, j7, pVar, null, 1);
                    q0Var.f7073g = e1Var;
                    q0Var.f7074h = pVar;
                    q0Var.f7075j = 1;
                    Object f6 = e1Var.f(t.j0.f6794d, dVar, q0Var);
                    h6.a aVar = h6.a.f3204d;
                    if (f6 == aVar) {
                        return aVar;
                    }
                    e1Var2 = e1Var;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q6.p pVar2 = q0Var.f7074h;
                    e1 e1Var3 = q0Var.f7073g;
                    s6.a.K(obj);
                    pVar = pVar2;
                    e1Var2 = e1Var3;
                }
                return new e1.b(e1Var2.h(pVar.f6202d));
            }
        }
        q0Var = new q0(cVar);
        Object obj2 = q0Var.i;
        i = q0Var.f7075j;
        if (i != 0) {
        }
        return new e1.b(e1Var2.h(pVar.f6202d));
    }
}
