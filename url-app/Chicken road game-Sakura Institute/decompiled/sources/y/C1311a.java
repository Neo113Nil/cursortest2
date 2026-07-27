package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1311a extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1311a f11456e = new C1311a(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1311a f11457i = new C1311a(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1311a f11458j = new C1311a(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1311a(int i2, int i4) {
        super(i2);
        this.f11459d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f11459d) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i2 = ((G0.l) obj).f3066a;
                break;
        }
        return Unit.f7487a;
    }
}
