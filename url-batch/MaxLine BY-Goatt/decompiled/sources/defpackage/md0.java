package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class md0 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 0;
    public c82 n;
    public c82 o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ tf2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(c82 c82Var, tf2 tf2Var, o30 o30Var) {
        super(2, o30Var);
        this.o = c82Var;
        this.r = tf2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        tf2 tf2Var = this.r;
        switch (i) {
            case 0:
                md0 md0Var = new md0(this.o, tf2Var, o30Var);
                md0Var.q = obj;
                return md0Var;
            default:
                md0 md0Var2 = new md0(tf2Var, o30Var);
                md0Var2.q = obj;
                return md0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((md0) create((Function1) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((md0) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r11 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (defpackage.tf2.J0(r3, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (defpackage.tf2.J0(r3, r10) != r0) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00d9, B:31:0x00c7], limit reached: 91 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003a, blocks: (B:23:0x009c, B:42:0x00bc, B:58:0x0034), top: B:57:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0146 -> B:64:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x014a -> B:65:0x014c). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object obj2;
        a50 a50Var;
        c82 c82Var;
        c82 c82Var2;
        c82 c82Var3;
        a50 a50Var2;
        a50 a50Var3;
        Object e;
        ad0 ad0Var;
        Object obj3;
        int i = this.m;
        tf2 tf2Var = this.r;
        switch (i) {
            case 0:
                c82 c82Var4 = this.o;
                b50 b50Var = b50.m;
                int i2 = this.p;
                if (i2 == 0) {
                    ca2.b(obj);
                    function1 = (Function1) this.q;
                    obj2 = c82Var4.m;
                    if (obj2 instanceof zc0) {
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    c82 c82Var5 = this.n;
                    function1 = (Function1) this.q;
                    ca2.b(obj);
                    ad0 ad0Var2 = (ad0) obj;
                    c82Var5.m = ad0Var2;
                    obj2 = c82Var4.m;
                    if (!(obj2 instanceof zc0) || (obj2 instanceof wc0)) {
                        break;
                    } else {
                        xc0 xc0Var = obj2 instanceof xc0 ? (xc0) obj2 : null;
                        if (xc0Var != null) {
                            function1.invoke(xc0Var);
                        }
                        lq lqVar = tf2Var.G;
                        if (lqVar != null) {
                            this.q = function1;
                            this.n = c82Var4;
                            this.p = 1;
                            obj = lq.F(lqVar, this);
                            if (obj == b50Var) {
                                break;
                            } else {
                                c82Var5 = c82Var4;
                                ad0 ad0Var22 = (ad0) obj;
                                c82Var5.m = ad0Var22;
                                obj2 = c82Var4.m;
                                if (obj2 instanceof zc0) {
                                }
                            }
                        } else {
                            c82Var5 = c82Var4;
                            ad0Var22 = null;
                            c82Var5.m = ad0Var22;
                            obj2 = c82Var4.m;
                            if (obj2 instanceof zc0) {
                            }
                        }
                    }
                }
            default:
                b50 b50Var2 = b50.m;
                switch (this.p) {
                    case 0:
                        ca2.b(obj);
                        a50Var = (a50) this.q;
                        if (j8.J(a50Var)) {
                            c82Var = new c82();
                            lq lqVar2 = tf2Var.G;
                            if (lqVar2 != null) {
                                this.q = a50Var;
                                this.n = c82Var;
                                this.o = c82Var;
                                this.p = 1;
                                obj = lq.F(lqVar2, this);
                                if (obj != b50Var2) {
                                    c82Var2 = c82Var;
                                    ad0Var = (ad0) obj;
                                    c82Var.m = ad0Var;
                                    obj3 = c82Var2.m;
                                    if (obj3 instanceof yc0) {
                                        this.q = a50Var;
                                        this.n = c82Var2;
                                        this.o = null;
                                        this.p = 2;
                                        if (tf2.K0(tf2Var, (yc0) obj3, this) != b50Var2) {
                                            c82Var3 = c82Var2;
                                            a50Var2 = a50Var;
                                            md0 md0Var = new md0(c82Var3, tf2Var, null);
                                            this.q = a50Var2;
                                            this.n = c82Var3;
                                            this.p = 3;
                                            cg2 cg2Var = tf2Var.P;
                                            e = cg2Var.e(ho1.n, new ed(md0Var, cg2Var, (o30) null, 16), this);
                                            if (e == b50.m) {
                                                e = Unit.a;
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (j8.J(a50Var)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                c82Var2 = c82Var;
                                ad0Var = null;
                                c82Var.m = ad0Var;
                                obj3 = c82Var2.m;
                                if (obj3 instanceof yc0) {
                                }
                                if (j8.J(a50Var)) {
                                }
                            }
                        }
                    case 1:
                        c82Var = this.o;
                        c82Var2 = this.n;
                        a50Var = (a50) this.q;
                        ca2.b(obj);
                        ad0Var = (ad0) obj;
                        c82Var.m = ad0Var;
                        obj3 = c82Var2.m;
                        if (obj3 instanceof yc0) {
                        }
                        if (j8.J(a50Var)) {
                        }
                        break;
                    case 2:
                        c82Var3 = this.n;
                        a50Var2 = (a50) this.q;
                        ca2.b(obj);
                        md0 md0Var2 = new md0(c82Var3, tf2Var, null);
                        this.q = a50Var2;
                        this.n = c82Var3;
                        this.p = 3;
                        cg2 cg2Var2 = tf2Var.P;
                        e = cg2Var2.e(ho1.n, new ed(md0Var2, cg2Var2, (o30) null, 16), this);
                        if (e == b50.m) {
                        }
                        break;
                    case 3:
                        c82Var3 = this.n;
                        a50Var2 = (a50) this.q;
                        try {
                            ca2.b(obj);
                        } catch (CancellationException unused) {
                            a50Var3 = a50Var2;
                            this.q = a50Var3;
                            this.n = null;
                            this.p = 6;
                            break;
                        }
                        a50Var = a50Var2;
                        try {
                        } catch (CancellationException unused2) {
                            a50Var3 = a50Var;
                            this.q = a50Var3;
                            this.n = null;
                            this.p = 6;
                        }
                        Object obj4 = c82Var3.m;
                        if (obj4 instanceof zc0) {
                            this.q = a50Var;
                            this.n = null;
                            this.p = 4;
                            if (tf2.L0(tf2Var, (zc0) obj4, this) == b50Var2) {
                                break;
                            }
                            if (j8.J(a50Var)) {
                            }
                        } else {
                            if (obj4 instanceof wc0) {
                                this.q = a50Var;
                                this.n = null;
                                this.p = 5;
                                break;
                            }
                            if (j8.J(a50Var)) {
                            }
                        }
                        break;
                    case 4:
                        a50Var3 = (a50) this.q;
                        try {
                            ca2.b(obj);
                        } catch (CancellationException unused3) {
                            this.q = a50Var3;
                            this.n = null;
                            this.p = 6;
                            break;
                        }
                        a50Var = a50Var3;
                        if (j8.J(a50Var)) {
                        }
                        break;
                    case 5:
                        a50Var3 = (a50) this.q;
                        ca2.b(obj);
                        a50Var = a50Var3;
                        if (j8.J(a50Var)) {
                        }
                        break;
                    case 6:
                        a50Var3 = (a50) this.q;
                        ca2.b(obj);
                        a50Var = a50Var3;
                        if (j8.J(a50Var)) {
                        }
                        break;
                    default:
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(tf2 tf2Var, o30 o30Var) {
        super(2, o30Var);
        this.r = tf2Var;
    }
}
