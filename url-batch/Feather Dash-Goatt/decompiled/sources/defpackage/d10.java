package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d10 extends pc0 implements Function1 {
    public final /* synthetic */ z11 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(int i, z11 z11Var) {
        super(1);
        this.d = z11Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean valueOf = Boolean.valueOf(((o10) obj).G0(this.e));
        this.d.d = valueOf;
        return valueOf;
    }
}
