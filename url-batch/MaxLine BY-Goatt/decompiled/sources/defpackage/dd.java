package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dd implements ym0 {
    public final /* synthetic */ int m;
    public final Object n;
    public final Object o;
    public final Object p;

    public dd(ym0 ym0Var, CoroutineContext coroutineContext) {
        this.m = 3;
        this.n = coroutineContext;
        this.o = zw2.b(coroutineContext);
        this.p = new z62(10, null, ym0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r14.d(r13, r0) != r15) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r13.d(r14, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        if (((defpackage.ym0) r8).d(r14, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        if (r15 == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    @Override // defpackage.ym0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, o30 o30Var) {
        gn0 gn0Var;
        int i;
        do0 do0Var;
        int i2;
        ym0 ym0Var;
        int i3 = this.m;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i3) {
            case 0:
                fz2 fz2Var = (fz2) obj3;
                ((d52) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((Function2) ((zn1) obj2).getValue()).invoke(fz2Var.a.j(), fz2Var.d.getValue())).booleanValue() : false));
                break;
            case 1:
                if (o30Var instanceof gn0) {
                    gn0Var = (gn0) o30Var;
                    int i4 = gn0Var.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        gn0Var.q = i4 - Integer.MIN_VALUE;
                        Object obj5 = gn0Var.o;
                        b50 b50Var = b50.m;
                        i = gn0Var.q;
                        if (i != 0) {
                            ca2.b(obj5);
                            if (!((y72) obj4).m) {
                                gn0Var.m = this;
                                gn0Var.n = obj;
                                gn0Var.q = 2;
                                obj5 = ((Function2) obj2).invoke(obj, gn0Var);
                                break;
                            } else {
                                gn0Var.q = 1;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = gn0Var.n;
                                    this = gn0Var.m;
                                    ca2.b(obj5);
                                    if (!((Boolean) obj5).booleanValue()) {
                                        ((y72) this.n).m = true;
                                        ym0 ym0Var2 = (ym0) this.o;
                                        gn0Var.m = null;
                                        gn0Var.n = null;
                                        gn0Var.q = 3;
                                        break;
                                    }
                                    break;
                                } else if (i != 3) {
                                    lh.g("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            }
                            ca2.b(obj5);
                        }
                        break;
                    }
                }
                gn0Var = new gn0(this, o30Var);
                Object obj52 = gn0Var.o;
                b50 b50Var2 = b50.m;
                i = gn0Var.q;
                if (i != 0) {
                }
            case 2:
                if (o30Var instanceof do0) {
                    do0Var = (do0) o30Var;
                    int i5 = do0Var.n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        do0Var.n = i5 - Integer.MIN_VALUE;
                        Object obj6 = do0Var.m;
                        b50 b50Var3 = b50.m;
                        i2 = do0Var.n;
                        if (i2 != 0) {
                            ca2.b(obj6);
                            ym0 ym0Var3 = (ym0) obj4;
                            do0Var.o = ym0Var3;
                            do0Var.n = 1;
                            Object U = l41.U(do0Var, (lb2) obj3, (Function1) obj2, true, false);
                            if (U != b50Var3) {
                                ym0Var = ym0Var3;
                                obj6 = U;
                            }
                            break;
                        } else if (i2 == 1) {
                            ym0Var = do0Var.o;
                            ca2.b(obj6);
                        } else if (i2 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            ca2.b(obj6);
                            break;
                        }
                        do0Var.o = null;
                        do0Var.n = 2;
                        break;
                    }
                }
                do0Var = new do0(this, o30Var);
                Object obj62 = do0Var.m;
                b50 b50Var32 = b50.m;
                i2 = do0Var.n;
                if (i2 != 0) {
                }
                do0Var.o = null;
                do0Var.n = 2;
            default:
                Object U2 = s03.U((CoroutineContext) obj4, obj, obj3, (z62) obj2, o30Var);
                if (U2 != b50.m) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dd(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
