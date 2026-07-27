package L0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f3517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i2) {
        super(0);
        this.f3516d = i2;
        this.f3517e = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3516d) {
            case 0:
                return Float.valueOf(this.f3517e.a());
            default:
                return this.f3517e;
        }
    }
}
