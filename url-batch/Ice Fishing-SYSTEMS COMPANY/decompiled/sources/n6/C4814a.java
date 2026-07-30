package n6;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4814a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4814a f39646b = new C4814a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C4814a f39647c = new C4814a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39648a;

    public /* synthetic */ C4814a(int i) {
        this.f39648a = i;
    }

    public final String toString() {
        switch (this.f39648a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + f39647c + "}";
            default:
                return "NoopTextMapPropagator";
        }
    }
}
