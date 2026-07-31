package b6;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6.c f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1355d;

    public j1(int i, p6.c cVar, List list, m0.z0 z0Var) {
        this.f1352a = i;
        this.f1353b = cVar;
        this.f1354c = list;
        this.f1355d = z0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(q1.o oVar, g6.c cVar) {
        int i = this.f1352a;
        p6.c cVar2 = this.f1353b;
        List list = this.f1354c;
        m0.z0 z0Var = this.f1355d;
        i1 i1Var = new i1(oVar, i, cVar2, list, z0Var);
        j0 j0Var = new j0(1, z0Var);
        float f6 = u.t.f7095a;
        Object i8 = r2.r.i(oVar, new u.r(new r.s1(16), j0Var, i1Var, new c.e(27), null), cVar);
        c6.m mVar = c6.m.f1757a;
        h6.a aVar = h6.a.f3204d;
        if (i8 != aVar) {
            i8 = mVar;
        }
        return i8 == aVar ? i8 : mVar;
    }
}
