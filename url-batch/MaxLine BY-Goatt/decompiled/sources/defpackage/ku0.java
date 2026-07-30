package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ku0 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;

    public /* synthetic */ ku0(String str, int i, int i2, String str2) {
        this.m = i2;
        this.n = str;
        this.o = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        a00 a00Var = (a00) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bd3.h(this.n, this.o, a00Var, s03.R(1));
                break;
            default:
                o70.k(this.n, this.o, a00Var, s03.R(1));
                break;
        }
        return Unit.a;
    }
}
