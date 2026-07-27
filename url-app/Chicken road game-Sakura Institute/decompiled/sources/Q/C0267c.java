package Q;

import A.AbstractC0017m;
import java.util.Iterator;
import k.C0746l;
import k.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import s1.C1193i;

/* renamed from: Q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267c extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f3834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0267c(int i2, Function1 function1) {
        super(1);
        this.f3833d = i2;
        this.f3834e = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:4:0x0027->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i2;
        M m4;
        switch (this.f3833d) {
            case 0:
                o oVar = (o) obj;
                synchronized (q.f3878b) {
                    i2 = q.f3880d;
                    q.f3880d = i2 + 1;
                }
                return new C0272h(i2, oVar, this.f3834e);
            case 1:
                long j4 = ((M0.j) obj).f3554a;
                return new M0.j(u3.d.c(((Number) this.f3834e.invoke(Integer.valueOf((int) (j4 >> 32)))).intValue(), (int) (4294967295L & j4)));
            case 2:
                long j5 = ((M0.j) obj).f3554a;
                return new M0.j(u3.d.c(((Number) this.f3834e.invoke(Integer.valueOf((int) (j5 >> 32)))).intValue(), (int) (4294967295L & j5)));
            case 3:
                throw AbstractC0017m.e(obj);
            default:
                C0746l c0746l = (C0746l) obj;
                s1.v vVar = ((C1193i) c0746l.c()).f10510e;
                Intrinsics.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i4 = s1.v.f10569n;
                Iterator it = AbstractC0864b.t((t1.h) vVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        s1.v vVar2 = (s1.v) it.next();
                        if (vVar2 instanceof t1.h) {
                            Function1 function1 = ((t1.h) vVar2).f10654t;
                            if (function1 != null) {
                                m4 = (M) function1.invoke(c0746l);
                                if (m4 == null) {
                                }
                            }
                        } else if (vVar2 instanceof t1.f) {
                            ((t1.f) vVar2).getClass();
                        }
                        m4 = null;
                        if (m4 == null) {
                        }
                    } else {
                        m4 = null;
                    }
                }
                if (m4 != null) {
                    return m4;
                }
                Function1 function12 = this.f3834e;
                if (function12 != null) {
                    return (M) function12.invoke(c0746l);
                }
                return null;
        }
    }
}
