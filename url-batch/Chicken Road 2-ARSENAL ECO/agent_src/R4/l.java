package R4;

/* loaded from: classes.dex */
public class l implements b4.f {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2122c;

    /* renamed from: a, reason: collision with root package name */
    public final h f2123a;

    /* renamed from: b, reason: collision with root package name */
    public final O4.a f2124b;

    static {
        ((b4.h) a4.d.c(b4.d.f3609f, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
        f2122c = true;
    }

    public l(h hVar, O4.a aVar, V4.a aVar2) {
        this.f2123a = hVar;
        this.f2124b = aVar;
    }

    @Override // b4.f
    public b4.e a() {
        boolean z5 = f2122c;
        O4.a aVar = this.f2124b;
        h hVar = this.f2123a;
        return z5 ? new d(hVar, aVar) : new k(hVar, aVar);
    }
}
