package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.majelw.libystne.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z62 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62(Object obj, Object obj2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                return new z62((b72) this.o, (r01) obj2, o30Var, 0);
            case 1:
                z62 z62Var = new z62(1, o30Var, (bb2) obj2);
                z62Var.o = obj;
                return z62Var;
            case 2:
                z62 z62Var2 = new z62(2, o30Var, (c60) obj2);
                z62Var2.o = obj;
                return z62Var2;
            case 3:
                return new z62((ij1) this.o, (Context) obj2, o30Var, 3);
            case 4:
                return new z62(4, o30Var, (js0) obj2);
            case 5:
                return new z62((xm0) this.o, (d52) obj2, o30Var, 5);
            case 6:
                return new z62((du) this.o, (md) obj2, o30Var, 6);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                z62 z62Var3 = new z62(7, o30Var, (zp2) obj2);
                z62Var3.o = obj;
                return z62Var3;
            case 8:
                z62 z62Var4 = new z62(8, o30Var, (bu2) obj2);
                z62Var4.o = obj;
                return z62Var4;
            case 9:
                return new z62((f03) this.o, (Function0) obj2, o30Var, 9);
            case 10:
                z62 z62Var5 = new z62(10, o30Var, (ym0) obj2);
                z62Var5.o = obj;
                return z62Var5;
            case 11:
                return new z62((r72) this.o, (View) obj2, o30Var, 11);
            default:
                return new z62((to2) this.o, (gm1) obj2, o30Var, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((z62) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((z62) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((z62) create(obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                ((z62) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
                return b50.m;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e7, code lost:
    
        if (r13 != r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f2, code lost:
    
        if (r0.invoke(r13, r12) == r12) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01f2 -> B:114:0x01f6). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        sy2 sy2Var;
        v vVar;
        int i = this.m;
        int i2 = 2;
        Object obj2 = this.p;
        int i3 = 1;
        o30 o30Var = null;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object a = b72.a((b72) this.o, (r01) obj2, 1, this);
                    return a == b50Var ? b50Var : a;
                }
                if (i4 == 1) {
                    ca2.b(obj);
                    return obj;
                }
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                bb2 bb2Var = (bb2) obj2;
                b50 b50Var2 = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    a50 a50Var = (a50) this.o;
                    xm0 a2 = bb2Var.A.a();
                    kc0 kc0Var = new kc0(7, bb2Var, a50Var);
                    this.n = 1;
                    if (a2.a(kc0Var, this) == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i5 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 2:
                b50 b50Var3 = b50.m;
                int i6 = this.n;
                if (i6 == 0) {
                    ca2.b(obj);
                    CoroutineContext.Element m = ((a50) this.o).n().m(sy2.o);
                    m.getClass();
                    sy2 sy2Var2 = (sy2) m;
                    sy2Var2.n.incrementAndGet();
                    try {
                        this.o = sy2Var2;
                        this.n = 1;
                        Object invoke = ((c60) obj2).invoke(this);
                        if (invoke == b50Var3) {
                            return b50Var3;
                        }
                        sy2Var = sy2Var2;
                        obj = invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        sy2Var = sy2Var2;
                        if (sy2Var.n.decrementAndGet() >= 0) {
                            throw th;
                        }
                        lh.g("Transaction was never started or was already released.");
                        return null;
                    }
                } else {
                    if (i6 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sy2Var = (sy2) this.o;
                    try {
                        ca2.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (sy2Var.n.decrementAndGet() >= 0) {
                        }
                        lh.g("Transaction was never started or was already released.");
                        return null;
                    }
                }
                if (sy2Var.n.decrementAndGet() >= 0) {
                    return obj;
                }
                lh.g("Transaction was never started or was already released.");
                return null;
            case 3:
                b50 b50Var4 = b50.m;
                int i7 = this.n;
                if (i7 == 0) {
                    ca2.b(obj);
                    ij1 ij1Var = (ij1) this.o;
                    this.n = 1;
                    obj = ij1Var.e(this);
                    if (obj == b50Var4) {
                        return b50Var4;
                    }
                } else {
                    if (i7 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/json");
                intent.putExtra("android.intent.extra.SUBJECT", "MaxLine BY backup");
                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                ((Context) obj2).startActivity(Intent.createChooser(intent, null));
                return Unit.a;
            case 4:
                js0 js0Var = (js0) obj2;
                b50 b50Var5 = b50.m;
                int i8 = this.n;
                if (i8 == 0) {
                    ca2.b(obj);
                    if (((AtomicInteger) ((ar0) js0Var.p).n).get() <= 0) {
                        lh.g("Check failed.");
                        return null;
                    }
                    l41.C(((a50) js0Var.m).n());
                    vVar = (v) js0Var.n;
                    lq lqVar = (lq) js0Var.o;
                    this.o = vVar;
                    this.n = 1;
                    lqVar.getClass();
                    obj = lq.F(lqVar, this);
                } else if (i8 == 1) {
                    vVar = (v) this.o;
                    ca2.b(obj);
                    this.o = null;
                    this.n = 2;
                    break;
                } else {
                    if (i8 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                    if (((AtomicInteger) ((ar0) js0Var.p).n).decrementAndGet() == 0) {
                        return Unit.a;
                    }
                    l41.C(((a50) js0Var.m).n());
                    vVar = (v) js0Var.n;
                    lq lqVar2 = (lq) js0Var.o;
                    this.o = vVar;
                    this.n = 1;
                    lqVar2.getClass();
                    obj = lq.F(lqVar2, this);
                    break;
                }
            case 5:
                b50 b50Var6 = b50.m;
                int i9 = this.n;
                if (i9 == 0) {
                    ca2.b(obj);
                    xm0 xm0Var = (xm0) this.o;
                    cn2 cn2Var = new cn2((d52) obj2, 1);
                    this.n = 1;
                    if (xm0Var.a(cn2Var, this) == b50Var6) {
                        return b50Var6;
                    }
                } else {
                    if (i9 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 6:
                b50 b50Var7 = b50.m;
                int i10 = this.n;
                if (i10 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    if (jc.c((jc) ((du) this.o).c, new Float(0.0f), (md) obj2, null, this, 12) == b50Var7) {
                        return b50Var7;
                    }
                } else {
                    if (i10 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                b50 b50Var8 = b50.m;
                int i11 = this.n;
                if (i11 == 0) {
                    ca2.b(obj);
                    x22 x22Var = (x22) this.o;
                    sb1 sb1Var = new sb1(i2, o30Var, (zp2) obj2);
                    this.n = 1;
                    if (yj1.j(x22Var, sb1Var, this) == b50Var8) {
                        return b50Var8;
                    }
                } else {
                    if (i11 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 8:
                Object obj3 = b50.m;
                int i12 = this.n;
                if (i12 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object t = j8.t(new va0((x22) this.o, (bu2) obj2, o30Var, i3), this);
                    if (t != obj3) {
                        t = Unit.a;
                    }
                    if (t == obj3) {
                        return obj3;
                    }
                } else {
                    if (i12 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 9:
                Function0 function0 = (Function0) obj2;
                b50 b50Var9 = b50.m;
                int i13 = this.n;
                try {
                    if (i13 == 0) {
                        ca2.b(obj);
                        f03 f03Var = (f03) this.o;
                        this.n = 1;
                        obj = f03.b(f03Var, this);
                        if (obj == b50Var9) {
                            return b50Var9;
                        }
                    } else {
                        if (i13 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    function0.invoke();
                    return Unit.a;
                } catch (Throwable th4) {
                    function0.invoke();
                    throw th4;
                }
            case 10:
                b50 b50Var10 = b50.m;
                int i14 = this.n;
                if (i14 == 0) {
                    ca2.b(obj);
                    Object obj4 = this.o;
                    this.n = 1;
                    if (((ym0) obj2).d(obj4, this) == b50Var10) {
                        return b50Var10;
                    }
                } else {
                    if (i14 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 11:
                r72 r72Var = (r72) this.o;
                View view = (View) obj2;
                Object obj5 = b50.m;
                int i15 = this.n;
                try {
                    if (i15 == 0) {
                        ca2.b(obj);
                        this.n = 1;
                        Object A = iv1.A(r72Var.t, new u60(2, null, 1), this);
                        if (A != obj5) {
                            A = Unit.a;
                        }
                        if (A == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i15 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    if (s83.b(view) == r72Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return Unit.a;
                } finally {
                }
            default:
                b50 b50Var11 = b50.m;
                int i16 = this.n;
                if (i16 == 0) {
                    ca2.b(obj);
                    to2 to2Var = (to2) this.o;
                    ba baVar = new ba(3, (gm1) obj2);
                    this.n = 1;
                    if (to2Var.a(baVar, this) == b50Var11) {
                        return b50Var11;
                    }
                } else {
                    if (i16 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                throw new k81();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62(int i, o30 o30Var, Object obj) {
        super(2, o30Var);
        this.m = i;
        this.p = obj;
    }
}
