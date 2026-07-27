package x0;

import M2.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302d extends p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1302d f11418e = new C1302d(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1302d f11419i = new C1302d(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1302d f11420j = new C1302d(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1302d(int i2, int i4) {
        super(i2);
        this.f11421d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11421d) {
            case 0:
                ((Number) obj).longValue();
                return Unit.f7487a;
            case 1:
                return Integer.valueOf(((l) obj).f11441b);
            default:
                M0.i iVar = ((l) obj).f11442c;
                return Integer.valueOf(iVar.f3553d - iVar.f3551b);
        }
    }
}
