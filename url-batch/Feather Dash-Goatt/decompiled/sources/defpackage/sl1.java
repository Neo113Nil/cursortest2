package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sl1 {
    public static final r7 f = new r7(0.0f);
    public final qm1 a;
    public long b = Long.MIN_VALUE;
    public r7 c = f;
    public boolean d;
    public float e;

    public sl1(p7 p7Var) {
        this.a = p7Var.a(p4.o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if (defpackage.t90.r(r0).j(r9, r4) == r3) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a6 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tm tmVar, kc kcVar, fn fnVar) {
        rl1 rl1Var;
        int i;
        r7 r7Var;
        final float f2;
        rl1 rl1Var2;
        final tm tmVar2;
        Function0 function0;
        try {
            if (fnVar instanceof rl1) {
                rl1Var = (rl1) fnVar;
                int i2 = rl1Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rl1Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = rl1Var.k;
                    tn tnVar = tn.d;
                    i = rl1Var.m;
                    r7Var = f;
                    if (i != 0) {
                        ca0.v(obj);
                        if (this.d) {
                            r80.c("animateToZero called while previous animation is running");
                        }
                        CoroutineContext coroutineContext = rl1Var.e;
                        coroutineContext.getClass();
                        im0 im0Var = (im0) coroutineContext.d(a60.l);
                        float u = im0Var != null ? im0Var.u() : 1.0f;
                        this.d = true;
                        f2 = u;
                        rl1Var2 = rl1Var;
                        tmVar2 = tmVar;
                        function0 = kcVar;
                        if (Math.abs(this.e) >= 0.01f) {
                            Function1 function1 = new Function1() { // from class: ql1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    long round;
                                    long longValue = ((Long) obj2).longValue();
                                    sl1 sl1Var = sl1.this;
                                    if (sl1Var.b == Long.MIN_VALUE) {
                                        sl1Var.b = longValue;
                                    }
                                    float f3 = sl1Var.e;
                                    r7 r7Var2 = new r7(f3);
                                    float f4 = f2;
                                    r7 r7Var3 = sl1.f;
                                    if (f4 == 0.0f) {
                                        round = sl1Var.a.b(new r7(f3), r7Var3, sl1Var.c);
                                    } else {
                                        double d = (longValue - sl1Var.b) / f4;
                                        if (Double.isNaN(d)) {
                                            dd0.e("Cannot round NaN value.");
                                            return null;
                                        }
                                        round = Math.round(d);
                                    }
                                    long j = round;
                                    float f5 = ((r7) sl1Var.a.m(j, r7Var2, r7Var3, sl1Var.c)).a;
                                    sl1Var.c = (r7) sl1Var.a.h(j, r7Var2, r7Var3, sl1Var.c);
                                    sl1Var.b = longValue;
                                    float f6 = sl1Var.e - f5;
                                    sl1Var.e = f5;
                                    tmVar2.invoke(Float.valueOf(f6));
                                    return Unit.a;
                                }
                            };
                            rl1Var2.h = tmVar2;
                            rl1Var2.i = function0;
                            rl1Var2.j = f2;
                            rl1Var2.m = 1;
                            CoroutineContext coroutineContext2 = rl1Var2.e;
                            coroutineContext2.getClass();
                            if (t90.r(coroutineContext2).j(function1, rl1Var2) == tnVar) {
                                return tnVar;
                            }
                            function0.invoke();
                        } else {
                            if (Math.abs(this.e) == 0.0f) {
                                this.b = Long.MIN_VALUE;
                                this.c = r7Var;
                                this.d = false;
                                return Unit.a;
                            }
                            c cVar = new c(this, 19, tmVar2);
                            rl1Var2.h = function0;
                            rl1Var2.i = null;
                            rl1Var2.m = 2;
                            CoroutineContext coroutineContext3 = rl1Var2.e;
                            coroutineContext3.getClass();
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            function0 = (Function0) rl1Var.h;
                            ca0.v(obj);
                            function0.invoke();
                            this.b = Long.MIN_VALUE;
                            this.c = r7Var;
                            this.d = false;
                            return Unit.a;
                        }
                        float f3 = rl1Var.j;
                        Function0 function02 = rl1Var.i;
                        ?? r14 = (Function1) rl1Var.h;
                        ca0.v(obj);
                        rl1Var2 = rl1Var;
                        function0 = function02;
                        f2 = f3;
                        tmVar2 = r14;
                        function0.invoke();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = r7Var;
            this.d = false;
            throw th;
        }
        rl1Var = new rl1(this, fnVar);
        Object obj2 = rl1Var.k;
        tn tnVar2 = tn.d;
        i = rl1Var.m;
        r7Var = f;
    }
}
