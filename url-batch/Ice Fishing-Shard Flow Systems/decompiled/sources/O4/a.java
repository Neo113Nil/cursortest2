package O4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1921b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1922c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1923a;

    public /* synthetic */ a(int i2) {
        this.f1923a = i2;
    }

    public final String toString() {
        switch (this.f1923a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + f1922c + "}";
            default:
                return "NoopTextMapPropagator";
        }
    }
}
