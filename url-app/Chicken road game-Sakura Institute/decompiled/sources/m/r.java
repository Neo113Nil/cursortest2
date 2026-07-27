package m;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final r f8167e = new r(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final r f8168i = new r(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final r f8169j = new r(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final r f8170k = new r(1, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i4) {
        super(i2);
        this.f8171d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8171d) {
            case 0:
                ((r0.G) obj).a();
                return Unit.f7487a;
            case 1:
                return Unit.f7487a;
            case 2:
                ((Number) obj).longValue();
                return Unit.f7487a;
            default:
                return new u0(((Number) obj).intValue());
        }
    }
}
