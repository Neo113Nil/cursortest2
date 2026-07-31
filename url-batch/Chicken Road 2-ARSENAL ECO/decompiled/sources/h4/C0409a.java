package h4;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0409a f4336b = new C0409a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0409a f4337c = new C0409a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4338a;

    public /* synthetic */ C0409a(int i7) {
        this.f4338a = i7;
    }

    public final String toString() {
        switch (this.f4338a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + f4337c + "}";
            default:
                return "NoopTextMapPropagator";
        }
    }
}
