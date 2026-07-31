package androidx.compose.foundation.gestures;

import I2.l;
import R1.c;
import Z1.q;
import n.X;
import n.e0;
import o.C0737m;
import o.InterfaceC0728d;
import o.J;
import o.P;
import o.Q;
import o.S;
import o.T;
import o.V;
import o.h0;
import o.o0;
import q.j;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f3623a = new Q();

    /* renamed from: b, reason: collision with root package name */
    public static final P f3624b = new P();

    /* renamed from: c, reason: collision with root package name */
    public static final S f3625c = new S();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o0 o0Var, long j3, c cVar) {
        T t3;
        int i3;
        q qVar;
        if (cVar instanceof T) {
            t3 = (T) cVar;
            int i4 = t3.f6463g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t3.f6463g = i4 - Integer.MIN_VALUE;
                Object obj = t3.f6462f;
                Q1.a aVar = Q1.a.f3113d;
                i3 = t3.f6463g;
                if (i3 != 0) {
                    l.Q(obj);
                    qVar = new q();
                    X x3 = X.f6036d;
                    V v3 = new V(o0Var, j3, qVar, null);
                    t3.f6460d = o0Var;
                    t3.f6461e = qVar;
                    t3.f6463g = 1;
                    if (o0Var.e(x3, v3, t3) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q qVar2 = t3.f6461e;
                    o0 o0Var2 = t3.f6460d;
                    l.Q(obj);
                    qVar = qVar2;
                    o0Var = o0Var2;
                }
                return new a0.c(o0Var.g(qVar.f3477d));
            }
        }
        t3 = new T(cVar);
        Object obj2 = t3.f6462f;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = t3.f6463g;
        if (i3 != 0) {
        }
        return new a0.c(o0Var.g(qVar.f3477d));
    }

    public static final U.l b(U.l lVar, h0 h0Var, J j3, e0 e0Var, boolean z3, boolean z4, C0737m c0737m, j jVar, InterfaceC0728d interfaceC0728d) {
        return lVar.e(new ScrollableElement(e0Var, interfaceC0728d, c0737m, j3, h0Var, jVar, z3, z4));
    }
}
