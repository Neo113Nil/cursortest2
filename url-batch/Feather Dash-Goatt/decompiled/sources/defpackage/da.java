package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class da implements yd1 {
    public final List d;
    public final ak1 e;
    public final Function1 g;
    public final av0 h;
    public boolean i = true;

    public da(List list, Object obj, ak1 ak1Var, i8 i8Var, Function1 function1, o5 o5Var) {
        this.d = list;
        this.e = ak1Var;
        this.g = function1;
        this.h = gb0.F(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:16:0x0097, B:23:0x0047, B:25:0x004c, B:28:0x0075, B:33:0x008d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0097 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fn fnVar) {
        ca caVar;
        int i;
        Function1 function1;
        av0 av0Var;
        int size;
        List list;
        int i2;
        try {
            if (fnVar instanceof ca) {
                caVar = (ca) fnVar;
                int i3 = caVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    caVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = caVar.l;
                    tn tnVar = tn.d;
                    i = caVar.n;
                    function1 = this.g;
                    av0Var = this.h;
                    if (i == 0) {
                        if (i == 1) {
                            int i4 = caVar.k;
                            int i5 = caVar.j;
                            c31 c31Var = caVar.i;
                            List list2 = caVar.h;
                            ca0.v(obj);
                            if (obj != null) {
                                ak1 ak1Var = this.e;
                                av0Var.setValue(op.N(ak1Var.d, obj, c31Var, ak1Var.b, ak1Var.c));
                                return Unit.a;
                            }
                            caVar.h = list2;
                            caVar.i = null;
                            caVar.j = i5;
                            caVar.k = i4;
                            caVar.n = 2;
                            if (ka0.L(caVar) == tnVar) {
                                return tnVar;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                        } else {
                            if (i != 2) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            size = caVar.k;
                            i2 = caVar.j;
                            list = caVar.h;
                            ca0.v(obj);
                        }
                        i2++;
                        if (i2 < size) {
                            ((c31) list.get(i2)).getClass();
                            i2++;
                            if (i2 < size) {
                                CoroutineContext coroutineContext = caVar.e;
                                coroutineContext.getClass();
                                boolean B = t80.B(coroutineContext);
                                this.i = false;
                                function1.invoke(new ck1(av0Var.getValue(), B));
                                return Unit.a;
                            }
                        }
                    } else {
                        ca0.v(obj);
                        List list3 = this.d;
                        size = list3.size();
                        list = list3;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } finally {
            CoroutineContext coroutineContext2 = caVar.e;
            coroutineContext2.getClass();
            boolean B2 = t80.B(coroutineContext2);
            this.i = false;
            function1.invoke(new ck1(av0Var.getValue(), B2));
        }
        caVar = new ca(this, fnVar);
        Object obj2 = caVar.l;
        tn tnVar2 = tn.d;
        i = caVar.n;
        function1 = this.g;
        av0Var = this.h;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return this.h.getValue();
    }
}
