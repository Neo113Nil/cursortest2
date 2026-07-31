package u2;

import java.util.UUID;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends q6.j implements p6.a {

    /* renamed from: f, reason: collision with root package name */
    public static final e f7314f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f7315g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7316e;

    static {
        int i = 0;
        f7314f = new e(i, 0);
        f7315g = new e(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i8) {
        super(i);
        this.f7316e = i8;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f7316e) {
            case 0:
                return UUID.randomUUID();
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
