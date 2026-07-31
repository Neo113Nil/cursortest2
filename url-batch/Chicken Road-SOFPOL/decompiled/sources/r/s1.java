package r;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6433d;

    public /* synthetic */ s1(int i) {
        this.f6433d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f6433d) {
            case 0:
                m mVar = (m) obj;
                return new e1.b((Float.floatToRawIntBits(mVar.f6357a) << 32) | (Float.floatToRawIntBits(mVar.f6358b) & 4294967295L));
            case 1:
                long j7 = ((r2.i) obj).f6522a;
                return new m((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m mVar2 = (m) obj;
                return new r2.i((Math.round(mVar2.f6357a) << 32) | (Math.round(mVar2.f6358b) & 4294967295L));
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                long j8 = ((r2.k) obj).f6528a;
                return new m((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                m mVar3 = (m) obj;
                int round = Math.round(mVar3.f6357a);
                if (round < 0) {
                    round = 0;
                }
                return new r2.k((round << 32) | ((Math.round(mVar3.f6358b) >= 0 ? r9 : 0) & 4294967295L));
            case 5:
                e1.c cVar = (e1.c) obj;
                return new o(cVar.f2457a, cVar.f2458b, cVar.f2459c, cVar.f2460d);
            case 6:
                o oVar = (o) obj;
                return new e1.c(oVar.f6372a, oVar.f6373b, oVar.f6374c, oVar.f6375d);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Float.valueOf(((l) obj).f6337a);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                l4.b bVar = (l4.b) obj;
                q6.i.e(bVar, "$this$initializer");
                return new r4.b(androidx.lifecycle.l0.b(bVar));
            case x.v0.f8304b /* 9 */:
                o4.o oVar2 = (o4.o) obj;
                q6.i.e(oVar2, "it");
                return Integer.valueOf(oVar2.f5671e.f4348a);
            case x.v0.f8306d /* 10 */:
                o4.o oVar3 = (o4.o) obj;
                q6.i.e(oVar3, "destination");
                o4.q qVar = oVar3.f5672f;
                if (qVar == null || qVar.i.f3189b != oVar3.f5671e.f4348a) {
                    return null;
                }
                return qVar;
            case 11:
                o4.o oVar4 = (o4.o) obj;
                q6.i.e(oVar4, "destination");
                o4.q qVar2 = oVar4.f5672f;
                if (qVar2 == null || qVar2.i.f3189b != oVar4.f5671e.f4348a) {
                    return null;
                }
                return qVar2;
            case 12:
                ((w1.h0) obj).a();
                return c6.m.f1757a;
            case 13:
                m0.o1 o1Var = (m0.o1) obj;
                int i = t.l.f6801a;
                u2 u2Var = x1.k0.f8488b;
                o1Var.getClass();
                Context context = (Context) m0.b.r(o1Var, u2Var);
                r2.c cVar2 = (r2.c) m0.b.r(o1Var, x1.b1.f8370h);
                t.o0 o0Var = (t.o0) m0.b.r(o1Var, t.p0.f6834a);
                if (o0Var == null) {
                    return null;
                }
                return new t.k(context, cVar2, o0Var.f6828a, o0Var.f6829b);
            case 14:
                return new t.u0(((Integer) obj).intValue());
            case x.v0.f8308f /* 15 */:
                m0.o1 o1Var2 = (m0.o1) obj;
                u2 u2Var2 = x1.k0.f8488b;
                o1Var2.getClass();
                if (((Context) m0.b.r(o1Var2, u2Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return u.e.f6956b;
                }
                u.c.f6945a.getClass();
                return u.b.f6933c;
            case 16:
                float f6 = u.t.f7095a;
                return c6.m.f1757a;
            case 17:
                ((Long) obj).getClass();
                return c6.m.f1757a;
            case 18:
                return Boolean.valueOf((((q1.k) obj).i == 2 ? 1 : 0) ^ 1);
            case 19:
                return new v0.d((Map) obj);
            case 20:
                return obj;
            case 21:
                synchronized (w0.m.f7537c) {
                    ?? r02 = w0.m.i;
                    int size = r02.size();
                    while (r6 < size) {
                        ((p6.c) r02.get(r6)).i(obj);
                        r6++;
                    }
                }
                return c6.m.f1757a;
            case 22:
                s1 s1Var = w0.m.f7535a;
                return c6.m.f1757a;
            case 23:
                return c6.m.f1757a;
            case 24:
                return Boolean.valueOf(obj == null);
            case 25:
                File file = (File) obj;
                q6.i.e(file, "it");
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                q6.i.d(absolutePath, "getAbsolutePath(...)");
                return new y3.r0(absolutePath);
            case 26:
                List list = (List) obj;
                return new z.p(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                return c6.m.f1757a;
        }
    }

    public /* synthetic */ s1(int i, z.k kVar) {
        this.f6433d = 27;
    }
}
