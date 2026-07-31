package p;

/* renamed from: p.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781p implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0783q f7744a;

    public C0781p(C0783q c0783q) {
        this.f7744a = c0783q;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e2.c, f2.k] */
    @Override // p.U
    public final float a(float f3) {
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        C0783q c0783q = this.f7744a;
        float floatValue = ((Number) c0783q.f7749a.n(Float.valueOf(f3))).floatValue();
        c0783q.f7753e.setValue(Boolean.valueOf(floatValue > 0.0f));
        c0783q.f7754f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
