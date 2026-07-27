package m;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class q0 extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f8166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i2) {
        super(0);
        this.f8165d = i2;
        this.f8166e = r0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8165d) {
            case 0:
                return Float.valueOf(this.f8166e.f8172t.f8194a.d());
            default:
                return Float.valueOf(this.f8166e.f8172t.f8197d.d());
        }
    }
}
