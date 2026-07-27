package l;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f7839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(m0 m0Var, int i2) {
        super(1);
        this.f7838d = i2;
        this.f7839e = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7838d) {
            case 0:
                return new q0(this.f7839e, 0);
            default:
                return new q0(this.f7839e, 1);
        }
    }
}
