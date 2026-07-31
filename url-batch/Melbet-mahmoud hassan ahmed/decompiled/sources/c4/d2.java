package c4;

import android.app.Activity;
import k4.c;

/* loaded from: classes.dex */
public final class d2 implements k4.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f1949a;

    /* renamed from: b, reason: collision with root package name */
    private final j2 f1950b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f1951c;

    public d2(m mVar, j2 j2Var, a0 a0Var) {
        this.f1949a = mVar;
        this.f1950b = j2Var;
        this.f1951c = a0Var;
    }

    @Override // k4.c
    public final void a() {
        this.f1951c.a(null);
        this.f1949a.h();
    }

    @Override // k4.c
    public final boolean b() {
        return this.f1951c.c();
    }

    @Override // k4.c
    public final void c(Activity activity, k4.d dVar, c.b bVar, c.a aVar) {
        this.f1950b.b(activity, dVar, bVar, aVar);
    }

    @Override // k4.c
    public final int d() {
        return this.f1949a.a();
    }
}
