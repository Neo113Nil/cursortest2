package j0;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3755d;

    public /* synthetic */ l(int i) {
        this.f3755d = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [c6.d, java.lang.Object] */
    @Override // p6.c
    public final Object i(Object obj) {
        int i = this.f3755d;
        c6.m mVar = c6.m.f1757a;
        switch (i) {
            case 0:
                w1.k0 k0Var = (w1.k0) obj;
                k0Var.d(m.f3766b, (int) (k0Var.a().G() >> 32));
                k0Var.d(m.f3765a, 0.0f);
                return mVar;
            case 1:
                d2.u.a((d2.j) obj, 0);
                return mVar;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return mVar;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                w6.d[] dVarArr = d2.u.f2215a;
                d2.v vVar = d2.s.f2198l;
                w6.d dVar = d2.u.f2215a[5];
                vVar.a((d2.j) obj, Boolean.TRUE);
                return mVar;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                float f6 = k0.b.f4149a;
                return mVar;
            case 5:
                q6.i.c((w1.x1) obj, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                throw new ClassCastException();
            case 6:
                q6.i.c((w1.x1) obj, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                throw new ClassCastException();
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context = (Context) obj;
                q6.i.e(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                Context context2 = (Context) obj;
                q6.i.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case x.v0.f8304b /* 9 */:
                q6.i.e((l4.b) obj, "$this$initializer");
                return new o4.h();
            case x.v0.f8306d /* 10 */:
                o4.o oVar = (o4.o) obj;
                q6.i.e(oVar, "it");
                return oVar.f5672f;
            case 11:
                o4.o oVar2 = (o4.o) obj;
                q6.i.e(oVar2, "it");
                if (!(oVar2 instanceof o4.q)) {
                    return null;
                }
                h4.j jVar = ((o4.q) oVar2).i;
                return jVar.j(jVar.f3189b);
            case 12:
                return new p4.a(androidx.lifecycle.l0.b((l4.b) obj));
            case 13:
                return q.h0.b(r.d.m(700, 6, null), 2);
            case 14:
                o4.o oVar3 = ((o4.d) ((q.p) obj).c()).f5621e;
                q6.i.c(oVar3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i8 = o4.o.f5669h;
                for (o4.o oVar4 : h0.a.G((p4.h) oVar3)) {
                }
                return null;
            case x.v0.f8308f /* 15 */:
                return q.h0.c(r.d.m(700, 6, null), 2);
            case 16:
                return ((o4.d) obj).i;
            case 17:
                return mVar;
            case 18:
                r.s0 s0Var = (r.s0) obj;
                long j7 = s0Var.f6422f;
                ((w0.s) r.o1.f6383b.getValue()).b(s0Var, r.o1.f6382a, s0Var.f6423g);
                long j8 = s0Var.f6422f;
                if (j7 != j8) {
                    r.l0 l0Var = s0Var.f6429n;
                    if (l0Var != null) {
                        if (l0Var.f6338a > j8) {
                            s0Var.l();
                        } else {
                            l0Var.f6344g = j8;
                            if (l0Var.f6339b == null) {
                                l0Var.f6345h = s6.a.C((1.0d - l0Var.f6342e.a(0)) * s0Var.f6422f);
                            }
                        }
                    } else if (j8 != 0) {
                        s0Var.o();
                    }
                }
                return mVar;
            case 19:
                ((p6.a) obj).b();
                return mVar;
            case 20:
                return new r.l(((Float) obj).floatValue());
            case 21:
                return new r.l(((Integer) obj).intValue());
            case 22:
                return Integer.valueOf((int) ((r.l) obj).f6337a);
            case 23:
                return new r.l(((r2.f) obj).f6520d);
            case 24:
                return new r2.f(((r.l) obj).f6337a);
            case 25:
                r2.g gVar = (r2.g) obj;
                return new r.m(Float.intBitsToFloat((int) (gVar.f6521a >> 32)), Float.intBitsToFloat((int) (gVar.f6521a & 4294967295L)));
            case 26:
                r.m mVar2 = (r.m) obj;
                float f8 = mVar2.f6357a;
                float f9 = mVar2.f6358b;
                return new r2.g((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L));
            case 27:
                e1.e eVar = (e1.e) obj;
                return new r.m(Float.intBitsToFloat((int) (eVar.f2469a >> 32)), Float.intBitsToFloat((int) (eVar.f2469a & 4294967295L)));
            case 28:
                r.m mVar3 = (r.m) obj;
                float f10 = mVar3.f6357a;
                float f11 = mVar3.f6358b;
                return new e1.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            default:
                e1.b bVar = (e1.b) obj;
                return new r.m(Float.intBitsToFloat((int) (bVar.f2455a >> 32)), Float.intBitsToFloat((int) (bVar.f2455a & 4294967295L)));
        }
    }
}
