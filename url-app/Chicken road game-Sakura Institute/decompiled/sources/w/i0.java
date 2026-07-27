package w;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i0 extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f11229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(m0 m0Var, int i2) {
        super(0);
        this.f11228d = i2;
        this.f11229e = m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11228d) {
            case 0:
                return Boolean.valueOf(this.f11229e.f11252a.d() > 0.0f);
            default:
                m0 m0Var = this.f11229e;
                return Boolean.valueOf(m0Var.f11252a.d() < m0Var.f11253b.d());
        }
    }
}
