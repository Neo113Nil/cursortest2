package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h70 extends pr2 implements Function2 {
    public a82 m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ a82 p;
    public final /* synthetic */ i70 q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(a82 a82Var, i70 i70Var, Object obj, boolean z, o30 o30Var) {
        super(2, o30Var);
        this.p = a82Var;
        this.q = i70Var;
        this.r = obj;
        this.s = z;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        h70 h70Var = new h70(this.p, this.q, this.r, this.s, o30Var);
        h70Var.o = obj;
        return h70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h70) create((ql0) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.b(r3, r8) == r0) goto L16;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ql0 ql0Var;
        a82 a82Var;
        b50 b50Var = b50.m;
        int i = this.n;
        Object obj2 = this.r;
        i70 i70Var = this.q;
        a82 a82Var2 = this.p;
        if (i == 0) {
            ca2.b(obj);
            ql0 ql0Var2 = (ql0) this.o;
            ll2 h = i70Var.h();
            this.o = ql0Var2;
            this.m = a82Var2;
            this.n = 1;
            Integer num = new Integer(((AtomicInteger) h.b.n).incrementAndGet());
            if (num != b50Var) {
                ql0Var = ql0Var2;
                obj = num;
                a82Var = a82Var2;
            }
            return b50Var;
        }
        if (i != 1) {
            if (i != 2) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
            if (this.s) {
                i70Var.t.c(new h60(obj2 != null ? obj2.hashCode() : 0, a82Var2.m, obj2));
            }
            return Unit.a;
        }
        a82Var = this.m;
        ql0Var = (ql0) this.o;
        ca2.b(obj);
        a82Var.m = ((Number) obj).intValue();
        this.o = null;
        this.m = null;
        this.n = 2;
    }
}
