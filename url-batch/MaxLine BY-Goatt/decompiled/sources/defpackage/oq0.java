package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oq0 extends z92 implements Function2 {
    public final /* synthetic */ int n = 1;
    public int o;
    public /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(CoroutineContext coroutineContext, Function2 function2, o30 o30Var) {
        super(o30Var);
        this.q = coroutineContext;
        this.r = function2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.n;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                oq0 oq0Var = new oq0((CoroutineContext) this.q, (Function2) obj2, o30Var);
                oq0Var.p = obj;
                return oq0Var;
            default:
                oq0 oq0Var2 = new oq0((bu2) obj2, o30Var);
                oq0Var2.p = obj;
                return oq0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ur2 ur2Var = (ur2) obj;
        o30 o30Var = (o30) obj2;
        switch (this.n) {
        }
        return ((oq0) create(ur2Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r14 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r14 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        if (defpackage.yj1.i(r1, r13) != r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        if (defpackage.yj1.i(r1, r13) == r6) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:8:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d9 -> B:33:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00ee -> B:33:0x00a9). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ur2 ur2Var;
        ur2 ur2Var2;
        ur2 ur2Var3;
        t22 t22Var;
        int i = this.n;
        ur2 ur2Var4 = null;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                CoroutineContext coroutineContext = (CoroutineContext) this.q;
                b50 b50Var = b50.m;
                int i2 = this.o;
                try {
                } catch (CancellationException e) {
                    e = e;
                    if (l41.L(coroutineContext)) {
                        throw e;
                    }
                    this.p = ur2Var4;
                    this.o = 3;
                    break;
                }
                if (i2 == 0) {
                    ca2.b(obj);
                    ur2Var = (ur2) this.p;
                    if (l41.L(coroutineContext)) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ur2Var4 = (ur2) this.p;
                            ca2.b(obj);
                        } else {
                            if (i2 != 3) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ur2Var4 = (ur2) this.p;
                            ca2.b(obj);
                        }
                        ur2Var = ur2Var4;
                        if (l41.L(coroutineContext)) {
                            return Unit.a;
                        }
                        try {
                        } catch (CancellationException e2) {
                            ur2Var4 = ur2Var;
                            e = e2;
                            if (l41.L(coroutineContext)) {
                            }
                        }
                        this.p = ur2Var;
                        this.o = 1;
                        if (((Function2) obj2).invoke(ur2Var, this) != b50Var) {
                            ur2Var4 = ur2Var;
                            this.p = ur2Var4;
                            this.o = 2;
                            break;
                        }
                        return b50Var;
                    }
                    ur2Var4 = (ur2) this.p;
                    ca2.b(obj);
                    this.p = ur2Var4;
                    this.o = 2;
                }
            default:
                bu2 bu2Var = (bu2) obj2;
                b50 b50Var2 = b50.m;
                int i3 = this.o;
                if (i3 == 0) {
                    ca2.b(obj);
                    ur2Var2 = (ur2) this.p;
                    this.p = ur2Var2;
                    this.o = 1;
                    obj = zs2.b(ur2Var2, (r3 & 1) != 0, n22.n, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t22Var = (t22) this.q;
                        ur2Var3 = (ur2) this.p;
                        ca2.b(obj);
                        List list = ((m22) obj).a;
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            t22 t22Var2 = (t22) list.get(i4);
                            if (s22.a(t22Var2.a, t22Var.a) && t22Var2.d) {
                                this.p = ur2Var3;
                                this.q = t22Var;
                                this.o = 2;
                                obj = ur2Var3.a(n22.n, this);
                                break;
                            }
                        }
                        bu2Var.b();
                        return Unit.a;
                    }
                    ur2Var2 = (ur2) this.p;
                    ca2.b(obj);
                }
                t22 t22Var3 = (t22) obj;
                long j = t22Var3.c;
                bu2Var.d();
                ur2Var3 = ur2Var2;
                t22Var = t22Var3;
                this.p = ur2Var3;
                this.q = t22Var;
                this.o = 2;
                obj = ur2Var3.a(n22.n, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(bu2 bu2Var, o30 o30Var) {
        super(o30Var);
        this.r = bu2Var;
    }
}
