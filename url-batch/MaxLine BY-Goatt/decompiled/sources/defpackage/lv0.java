package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lv0 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function1 n;

    public /* synthetic */ lv0(Function1 function1, int i) {
        this.m = i;
        this.n = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.m) {
            case 0:
                rm2 rm2Var = (rm2) obj;
                synchronized (tm2.c) {
                    j = tm2.e;
                    tm2.e = 1 + j;
                }
                return new l62(j, rm2Var, this.n);
            default:
                return this.n.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
