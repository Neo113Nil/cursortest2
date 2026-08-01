package n0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l1 implements s0 {

    /* renamed from: d, reason: collision with root package name */
    public final s0 f6747d;

    /* renamed from: e, reason: collision with root package name */
    public final b7.o0 f6748e = new b7.o0();

    public l1(s0 s0Var) {
        this.f6747d = s0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // n0.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Function1 function1, nd.c cVar) {
        k1 k1Var;
        int i3;
        boolean z10;
        Object r9;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i10 = k1Var.f6739r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k1Var.f6739r = i10 - Integer.MIN_VALUE;
                Object obj = k1Var.f6737e;
                md.a aVar = md.a.f6622d;
                i3 = k1Var.f6739r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    b7.o0 o0Var = this.f6748e;
                    k1Var.f6736d = function1;
                    k1Var.f6739r = 1;
                    synchronized (o0Var.f1326b) {
                        z10 = o0Var.f1325a;
                    }
                    if (z10) {
                        r9 = Unit.f5554a;
                    } else {
                        ge.h hVar = new ge.h(1, md.f.b(k1Var));
                        hVar.s();
                        synchronized (o0Var.f1326b) {
                            ((ArrayList) o0Var.f1327c).add(hVar);
                        }
                        hVar.u(new b1.a(1, o0Var, hVar));
                        r9 = hVar.r();
                        if (r9 != aVar) {
                            r9 = Unit.f5554a;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            cf.c.M(obj);
                            return obj;
                        }
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = k1Var.f6736d;
                    cf.c.M(obj);
                }
                s0 s0Var = this.f6747d;
                k1Var.f6736d = null;
                k1Var.f6739r = 2;
                Object s3 = s0Var.s(function1, k1Var);
                return s3 != aVar ? aVar : s3;
            }
        }
        k1Var = new k1(this, cVar);
        Object obj2 = k1Var.f6737e;
        md.a aVar2 = md.a.f6622d;
        i3 = k1Var.f6739r;
        if (i3 != 0) {
        }
        s0 s0Var2 = this.f6747d;
        k1Var.f6736d = null;
        k1Var.f6739r = 2;
        Object s32 = s0Var2.s(function1, k1Var);
        if (s32 != aVar2) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
