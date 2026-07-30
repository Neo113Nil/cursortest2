package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z23 {
    public static final od f = new od(0.0f);
    public final c43 a;
    public long b = Long.MIN_VALUE;
    public od c = f;
    public boolean d;
    public float e;

    public z23(md mdVar) {
        this.a = mdVar.a(v33.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r4 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:28:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oc ocVar, bn bnVar, r30 r30Var) {
        y23 y23Var;
        int i;
        float f2;
        y23 y23Var2;
        bn bnVar2;
        z23 z23Var;
        oc ocVar2;
        z23 z23Var2;
        Function0 function0;
        if (r30Var instanceof y23) {
            y23Var = (y23) r30Var;
            int i2 = y23Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y23Var.s = i2 - Integer.MIN_VALUE;
                Object obj = y23Var.q;
                b50 b50Var = b50.m;
                i = y23Var.s;
                od odVar = f;
                if (i != 0) {
                    ca2.b(obj);
                    if (this.d) {
                        lh.g("animateToZero called while previous animation is running");
                        return null;
                    }
                    fm1 fm1Var = (fm1) y23Var.getContext().m(qb2.X);
                    float C = fm1Var != null ? fm1Var.C() : 1.0f;
                    this.d = true;
                    f2 = C;
                    y23Var2 = y23Var;
                    bnVar2 = bnVar;
                    z23Var = this;
                    ocVar2 = ocVar;
                    if (Math.abs(z23Var.e) < 0.01f) {
                        if (Math.abs(z23Var.e) == 0.0f) {
                            z23Var.b = Long.MIN_VALUE;
                            z23Var.c = odVar;
                            z23Var.d = false;
                            return Unit.a;
                        }
                        ih2 ih2Var = new ih2(12, z23Var, ocVar2);
                        y23Var2.m = z23Var;
                        y23Var2.n = bnVar2;
                        y23Var2.o = null;
                        y23Var2.s = 2;
                        if (iv1.F(y23Var2.getContext()).B(ih2Var, y23Var2) != b50Var) {
                            function0 = bnVar2;
                            z23Var2 = z23Var;
                            function0.invoke();
                            z23Var = z23Var2;
                            z23Var.b = Long.MIN_VALUE;
                            z23Var.c = odVar;
                            z23Var.d = false;
                            return Unit.a;
                        }
                        return b50Var;
                    }
                    b9 b9Var = new b9(z23Var, f2, ocVar2);
                    y23Var2.m = z23Var;
                    y23Var2.n = ocVar2;
                    y23Var2.o = bnVar2;
                    y23Var2.p = f2;
                    y23Var2.s = 1;
                    if (iv1.F(y23Var2.getContext()).B(b9Var, y23Var2) == b50Var) {
                        return b50Var;
                    }
                    bnVar2.invoke();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function0 = (Function0) y23Var.n;
                        z23Var2 = y23Var.m;
                        try {
                            ca2.b(obj);
                            function0.invoke();
                            z23Var = z23Var2;
                            z23Var.b = Long.MIN_VALUE;
                            z23Var.c = odVar;
                            z23Var.d = false;
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            z23Var2.b = Long.MIN_VALUE;
                            z23Var2.c = odVar;
                            z23Var2.d = false;
                            throw th;
                        }
                    }
                    float f3 = y23Var.p;
                    ?? r4 = y23Var.o;
                    ?? r13 = (Function1) y23Var.n;
                    z23 z23Var3 = y23Var.m;
                    try {
                        ca2.b(obj);
                        f2 = f3;
                        ocVar2 = r13;
                        y23Var2 = y23Var;
                        bnVar2 = r4;
                        z23Var = z23Var3;
                    } catch (Throwable th2) {
                        th = th2;
                        z23Var2 = z23Var3;
                        z23Var2.b = Long.MIN_VALUE;
                        z23Var2.c = odVar;
                        z23Var2.d = false;
                        throw th;
                    }
                    try {
                        bnVar2.invoke();
                    } catch (Throwable th3) {
                        th = th3;
                        z23Var2 = z23Var;
                        z23Var2.b = Long.MIN_VALUE;
                        z23Var2.c = odVar;
                        z23Var2.d = false;
                        throw th;
                    }
                }
            }
        }
        y23Var = new y23(this, r30Var);
        Object obj2 = y23Var.q;
        b50 b50Var2 = b50.m;
        i = y23Var.s;
        od odVar2 = f;
        if (i != 0) {
        }
    }
}
