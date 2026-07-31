package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f252b;

    public /* synthetic */ e(int i, Object obj) {
        this.f251a = i;
        this.f252b = obj;
    }

    public final String toString() {
        switch (this.f251a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((p6.c) this.f252b).getClass().getSimpleName() + '@' + x.g(this) + ']';
            default:
                return "DisposeOnCancel[" + ((e0) this.f252b) + ']';
        }
    }
}
