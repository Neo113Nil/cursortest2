package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Function0 p;

    public /* synthetic */ w4(String str, boolean z, Function0 function0, int i, int i2) {
        this.m = i2;
        this.n = str;
        this.o = z;
        this.p = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        a00 a00Var = (a00) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                iv1.b(this.n, this.o, this.p, a00Var, s03.R(1));
                break;
            case 1:
                s93.o(this.n, this.o, this.p, a00Var, s03.R(1));
                break;
            case 2:
                l41.n(this.n, this.o, this.p, a00Var, s03.R(385));
                break;
            default:
                s93.j(this.n, this.o, this.p, a00Var, s03.R(1));
                break;
        }
        return Unit.a;
    }
}
