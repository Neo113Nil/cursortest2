package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wn0 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ eo1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn0(int i, eo1 eo1Var) {
        super(1);
        this.m = i;
        this.n = eo1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        eo1 eo1Var = this.n;
        switch (i) {
            case 0:
                int i2 = eo1Var.o;
                if (i2 > 0) {
                    Object[] objArr = eo1Var.m;
                    int i3 = 0;
                    do {
                        ((pj1) objArr[i3]).b();
                        i3++;
                    } while (i3 < i2);
                }
                return Unit.a;
            default:
                eo1Var.b((tl1) obj);
                return Boolean.TRUE;
        }
    }
}
