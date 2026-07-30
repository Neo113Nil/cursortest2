package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mn1 extends z92 implements Function2 {
    public wu0 n;
    public nn1 o;
    public long[] p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ nn1 t;
    public final /* synthetic */ wu0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn1(nn1 nn1Var, wu0 wu0Var, o30 o30Var) {
        super(o30Var);
        this.t = nn1Var;
        this.u = wu0Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        mn1 mn1Var = new mn1(this.t, this.u, o30Var);
        mn1Var.s = obj;
        return mn1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mn1) create((xi2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        xi2 xi2Var;
        nn1 nn1Var;
        long[] jArr;
        int i;
        wu0 wu0Var;
        b50 b50Var = b50.m;
        int i2 = this.r;
        if (i2 == 0) {
            ca2.b(obj);
            xi2Var = (xi2) this.s;
            nn1Var = this.t;
            ln1 ln1Var = nn1Var.n;
            jArr = ln1Var.c;
            i = ln1Var.e;
            wu0Var = this.u;
        } else {
            if (i2 != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.q;
            jArr = this.p;
            nn1Var = this.o;
            wu0Var = this.n;
            xi2Var = (xi2) this.s;
            ca2.b(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        wu0Var.n = i;
        Object obj2 = nn1Var.n.b[i];
        this.s = xi2Var;
        this.n = wu0Var;
        this.o = nn1Var;
        this.p = jArr;
        this.q = i3;
        this.r = 1;
        xi2Var.a(obj2, this);
        return b50Var;
    }
}
