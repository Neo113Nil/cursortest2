package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f70 extends pr2 implements Function1 {
    public final /* synthetic */ int m = 0;
    public int n;
    public final /* synthetic */ i70 o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(c82 c82Var, i70 i70Var, a82 a82Var, o30 o30Var) {
        super(1, o30Var);
        this.q = c82Var;
        this.o = i70Var;
        this.r = a82Var;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        int i = this.m;
        Object obj = this.r;
        Object obj2 = this.q;
        i70 i70Var = this.o;
        switch (i) {
            case 0:
                return new f70((c82) obj2, i70Var, (a82) obj, o30Var);
            default:
                return new f70(i70Var, (CoroutineContext) obj2, (Function2) obj, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o30 o30Var = (o30) obj;
        switch (this.m) {
        }
        return ((f70) create(o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r7.k(r12, true, r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ec, code lost:
    
        if (r12 != r0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c82 c82Var;
        a82 a82Var;
        h60 h60Var;
        Object obj2;
        int i = this.m;
        Object obj3 = this.r;
        Object obj4 = this.q;
        i70 i70Var = this.o;
        o30 o30Var = null;
        switch (i) {
            case 0:
                a82 a82Var2 = (a82) obj3;
                c82 c82Var2 = (c82) obj4;
                b50 b50Var = b50.m;
                int i2 = this.n;
                try {
                } catch (f50 unused) {
                    Object obj5 = c82Var2.m;
                    this.p = a82Var2;
                    this.n = 3;
                    obj = i70Var.k(obj5, true, this);
                    break;
                }
                if (i2 == 0) {
                    ca2.b(obj);
                    this.p = c82Var2;
                    this.n = 1;
                    obj = i70Var.j(this);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                    c82Var = c82Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            a82Var = (a82) ((Serializable) this.p);
                            ca2.b(obj);
                            a82Var.m = ((Number) obj).intValue();
                            return Unit.a;
                        }
                        if (i2 != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a82Var2 = (a82) ((Serializable) this.p);
                        ca2.b(obj);
                        a82Var2.m = ((Number) obj).intValue();
                        return Unit.a;
                    }
                    c82Var = (c82) ((Serializable) this.p);
                    ca2.b(obj);
                }
                c82Var.m = obj;
                ll2 h = i70Var.h();
                this.p = a82Var2;
                this.n = 2;
                obj = h.a();
                if (obj == b50Var) {
                    return b50Var;
                }
                a82Var = a82Var2;
                a82Var.m = ((Number) obj).intValue();
                return Unit.a;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    obj = i70.g(i70Var, true, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.p;
                            ca2.b(obj);
                            return obj6;
                        }
                        h60Var = (h60) this.p;
                        ca2.b(obj);
                        obj2 = h60Var.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == h60Var.c) {
                            lh.g("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!Intrinsics.b(h60Var.b, obj)) {
                            this.p = obj;
                            this.n = 3;
                            break;
                        }
                        return obj;
                    }
                    ca2.b(obj);
                }
                h60 h60Var2 = (h60) obj;
                v vVar = new v((Function2) obj3, h60Var2, o30Var, 21);
                this.p = h60Var2;
                this.n = 2;
                Object V = z71.V((CoroutineContext) obj4, vVar, this);
                if (V != b50Var2) {
                    h60Var = h60Var2;
                    obj = V;
                    obj2 = h60Var.b;
                    if ((obj2 == null ? obj2.hashCode() : 0) == h60Var.c) {
                    }
                }
                return b50Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(i70 i70Var, CoroutineContext coroutineContext, Function2 function2, o30 o30Var) {
        super(1, o30Var);
        this.o = i70Var;
        this.q = coroutineContext;
        this.r = function2;
    }
}
