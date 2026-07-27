package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g extends M2.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final g f4321e = new g(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final g f4322i = new g(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, int i4) {
        super(i2);
        this.f4323d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f4323d) {
            case 0:
                return Boolean.FALSE;
            default:
                return Unit.f7487a;
        }
    }
}
