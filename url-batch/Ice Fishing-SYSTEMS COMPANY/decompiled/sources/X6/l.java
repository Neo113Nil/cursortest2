package X6;

import b7.C0531a;

/* loaded from: classes2.dex */
public class l implements h6.f {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f3866c;

    /* renamed from: a, reason: collision with root package name */
    public final h f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final U6.a f3868b;

    static {
        ((h6.h) g6.d.c(h6.d.f38236n, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).get();
        f3866c = true;
    }

    public l(h hVar, U6.a aVar, C0531a c0531a) {
        this.f3867a = hVar;
        this.f3868b = aVar;
    }

    @Override // h6.f
    public h6.e a() {
        boolean z8 = f3866c;
        U6.a aVar = this.f3868b;
        h hVar = this.f3867a;
        return z8 ? new d(hVar, aVar) : new k(hVar, aVar);
    }
}
