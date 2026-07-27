package m;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class T extends M2.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final T f8046e = new T(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final T f8047i = new T(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(int i2, int i4) {
        super(i2);
        this.f8048d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8048d) {
            case 0:
                return C0827C.f8000a;
            default:
                return new g0();
        }
    }
}
