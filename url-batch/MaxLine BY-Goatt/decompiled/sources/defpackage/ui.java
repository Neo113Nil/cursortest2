package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ui implements so2 {
    public final List m;
    public final g13 n;
    public final Function1 o;
    public final lz1 p;
    public boolean q = true;

    public ui(List list, Object obj, g13 g13Var, mh mhVar, Function1 function1, u9 u9Var) {
        this.m = list;
        this.n = g13Var;
        this.o = function1;
        this.p = ij2.j(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:16:0x0096, B:23:0x0047, B:25:0x004c, B:28:0x0074, B:33:0x008c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0096 -> B:14:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r30 r30Var) {
        ti tiVar;
        int i;
        Function1 function1;
        lz1 lz1Var;
        int size;
        List list;
        int i2;
        try {
            if (r30Var instanceof ti) {
                tiVar = (ti) r30Var;
                int i3 = tiVar.s;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tiVar.s = i3 - Integer.MIN_VALUE;
                    Object obj = tiVar.q;
                    b50 b50Var = b50.m;
                    i = tiVar.s;
                    function1 = this.o;
                    lz1Var = this.p;
                    if (i == 0) {
                        if (i == 1) {
                            int i4 = tiVar.p;
                            int i5 = tiVar.o;
                            m92 m92Var = tiVar.n;
                            List list2 = tiVar.m;
                            ca2.b(obj);
                            if (obj != null) {
                                g13 g13Var = this.n;
                                lz1Var.setValue(z71.R(g13Var.d, obj, m92Var, g13Var.b, g13Var.c));
                                return Unit.a;
                            }
                            tiVar.m = list2;
                            tiVar.n = null;
                            tiVar.o = i5;
                            tiVar.p = i4;
                            tiVar.s = 2;
                            if (th2.n(tiVar) == b50Var) {
                                return b50Var;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                        } else {
                            if (i != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            size = tiVar.p;
                            i2 = tiVar.o;
                            list = tiVar.m;
                            ca2.b(obj);
                        }
                        i2++;
                        if (i2 < size) {
                            ((m92) list.get(i2)).getClass();
                            i2++;
                            if (i2 < size) {
                                boolean L = l41.L(tiVar.getContext());
                                this.q = false;
                                function1.invoke(new i13(lz1Var.getValue(), L));
                                return Unit.a;
                            }
                        }
                    } else {
                        ca2.b(obj);
                        List list3 = this.m;
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
            boolean L2 = l41.L(tiVar.getContext());
            this.q = false;
            function1.invoke(new i13(lz1Var.getValue(), L2));
        }
        tiVar = new ti(this, r30Var);
        Object obj2 = tiVar.q;
        b50 b50Var2 = b50.m;
        i = tiVar.s;
        function1 = this.o;
        lz1Var = this.p;
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return this.p.getValue();
    }
}
