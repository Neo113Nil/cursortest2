package P0;

import java.util.UUID;

/* loaded from: classes.dex */
public final class g extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final g f3038f = new g(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final g f3039g = new g(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i4) {
        super(i3);
        this.f3040e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f3040e) {
            case 0:
                return UUID.randomUUID();
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
