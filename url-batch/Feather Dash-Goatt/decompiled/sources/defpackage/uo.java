package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uo {
    public final /* synthetic */ oo0 a;
    public final /* synthetic */ v11 b;
    public final /* synthetic */ z11 c;
    public final /* synthetic */ mp d;

    public uo(oo0 oo0Var, v11 v11Var, z11 z11Var, mp mpVar) {
        this.a = oo0Var;
        this.b = v11Var;
        this.c = z11Var;
        this.d = mpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r10.e(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00a8, B:30:0x00b0), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(po poVar, fn fnVar) {
        to toVar;
        int i;
        oo0 oo0Var;
        v11 v11Var;
        z11 z11Var;
        mp mpVar;
        Function2 function2;
        oo0 oo0Var2;
        oo0 oo0Var3;
        z11 z11Var2;
        Object obj;
        try {
            if (fnVar instanceof to) {
                toVar = (to) fnVar;
                int i2 = toVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    toVar.o = i2 - Integer.MIN_VALUE;
                    Object obj2 = toVar.m;
                    tn tnVar = tn.d;
                    i = toVar.o;
                    if (i != 0) {
                        ca0.v(obj2);
                        toVar.h = poVar;
                        oo0Var = this.a;
                        toVar.i = oo0Var;
                        v11Var = this.b;
                        toVar.j = v11Var;
                        z11Var = this.c;
                        toVar.k = z11Var;
                        mpVar = this.d;
                        toVar.l = mpVar;
                        toVar.o = 1;
                        function2 = poVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = toVar.j;
                                z11Var2 = (z11) toVar.i;
                                oo0Var2 = (oo0) toVar.h;
                                try {
                                    ca0.v(obj2);
                                    z11Var2.d = obj;
                                    Object obj3 = z11Var2.d;
                                    oo0Var2.h(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    oo0Var2.h(null);
                                    throw th;
                                }
                            }
                            mpVar = (mp) toVar.j;
                            z11Var2 = (z11) toVar.i;
                            oo0Var3 = (oo0) toVar.h;
                            try {
                                ca0.v(obj2);
                                if (!Intrinsics.a(obj2, z11Var2.d)) {
                                    oo0Var2 = oo0Var3;
                                    Object obj32 = z11Var2.d;
                                    oo0Var2.h(null);
                                    return obj32;
                                }
                                toVar.h = oo0Var3;
                                toVar.i = z11Var2;
                                toVar.j = obj2;
                                toVar.o = 3;
                                if (mpVar.j(obj2, false, toVar) != tnVar) {
                                    obj = obj2;
                                    oo0Var2 = oo0Var3;
                                    z11Var2.d = obj;
                                    Object obj322 = z11Var2.d;
                                    oo0Var2.h(null);
                                    return obj322;
                                }
                                return tnVar;
                            } catch (Throwable th2) {
                                th = th2;
                                oo0Var2 = oo0Var3;
                                oo0Var2.h(null);
                                throw th;
                            }
                        }
                        mpVar = toVar.l;
                        z11 z11Var3 = toVar.k;
                        v11Var = (v11) toVar.j;
                        oo0 oo0Var4 = (oo0) toVar.i;
                        Function2 function22 = (Function2) toVar.h;
                        ca0.v(obj2);
                        z11Var = z11Var3;
                        function2 = function22;
                        oo0Var = oo0Var4;
                    }
                    if (!v11Var.d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = z11Var.d;
                    toVar.h = oo0Var;
                    toVar.i = z11Var;
                    toVar.j = mpVar;
                    toVar.k = null;
                    toVar.l = null;
                    toVar.o = 2;
                    Object b = function2.b(obj4, toVar);
                    if (b != tnVar) {
                        oo0Var3 = oo0Var;
                        obj2 = b;
                        z11Var2 = z11Var;
                        if (!Intrinsics.a(obj2, z11Var2.d)) {
                        }
                    }
                    return tnVar;
                }
            }
            if (!v11Var.d) {
            }
        } catch (Throwable th3) {
            th = th3;
            oo0Var2 = oo0Var;
            oo0Var2.h(null);
            throw th;
        }
        toVar = new to(this, fnVar);
        Object obj22 = toVar.m;
        tn tnVar2 = tn.d;
        i = toVar.o;
        if (i != 0) {
        }
    }
}
