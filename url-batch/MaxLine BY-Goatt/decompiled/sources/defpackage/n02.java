package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n02 implements em1 {
    public final em1 m;
    public final w50 n = new w50(2, false);

    public n02(em1 em1Var) {
        this.m = em1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.em1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Function1 function1, o30 o30Var) {
        m02 m02Var;
        int i;
        boolean z;
        Object s;
        if (o30Var instanceof m02) {
            m02Var = (m02) o30Var;
            int i2 = m02Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m02Var.p = i2 - Integer.MIN_VALUE;
                Object obj = m02Var.n;
                b50 b50Var = b50.m;
                i = m02Var.p;
                int i3 = 2;
                if (i != 0) {
                    ca2.b(obj);
                    w50 w50Var = this.n;
                    m02Var.m = function1;
                    m02Var.p = 1;
                    synchronized (w50Var.b) {
                        z = w50Var.a;
                    }
                    if (z) {
                        s = Unit.a;
                    } else {
                        fs fsVar = new fs(1, q41.b(m02Var));
                        fsVar.u();
                        synchronized (w50Var.b) {
                            ((ArrayList) w50Var.c).add(fsVar);
                        }
                        fsVar.w(new q30(i3, w50Var, fsVar));
                        s = fsVar.s();
                        if (s != b50Var) {
                            s = Unit.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj);
                            return obj;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = m02Var.m;
                    ca2.b(obj);
                }
                em1 em1Var = this.m;
                m02Var.m = null;
                m02Var.p = 2;
                Object B = em1Var.B(function1, m02Var);
                return B != b50Var ? b50Var : B;
            }
        }
        m02Var = new m02(this, o30Var);
        Object obj2 = m02Var.n;
        b50 b50Var2 = b50.m;
        i = m02Var.p;
        int i32 = 2;
        if (i != 0) {
        }
        em1 em1Var2 = this.m;
        m02Var.m = null;
        m02Var.p = 2;
        Object B2 = em1Var2.B(function1, m02Var);
        if (B2 != b50Var2) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        return f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return f.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
