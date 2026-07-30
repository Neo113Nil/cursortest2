package y5;

import v5.C0975a;

/* loaded from: classes.dex */
public class l implements I4.f {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8693c;

    /* renamed from: a, reason: collision with root package name */
    public final h f8694a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975a f8695b;

    static {
        ((I4.h) H4.d.c(I4.d.f1279d, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
        f8693c = true;
    }

    public l(h hVar, C0975a c0975a, C5.a aVar) {
        this.f8694a = hVar;
        this.f8695b = c0975a;
    }

    @Override // I4.f
    public I4.e a() {
        boolean z7 = f8693c;
        C0975a c0975a = this.f8695b;
        h hVar = this.f8694a;
        return z7 ? new d(hVar, c0975a) : new k(hVar, c0975a);
    }
}
