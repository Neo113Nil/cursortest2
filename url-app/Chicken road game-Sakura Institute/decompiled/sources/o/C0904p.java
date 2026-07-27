package o;

/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904p implements S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0906q f8849a;

    public C0904p(C0906q c0906q) {
        this.f8849a = c0906q;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // o.S
    public final float a(float f4) {
        if (Float.isNaN(f4)) {
            return 0.0f;
        }
        C0906q c0906q = this.f8849a;
        float floatValue = ((Number) c0906q.f8854a.invoke(Float.valueOf(f4))).floatValue();
        c0906q.f8858e.setValue(Boolean.valueOf(floatValue > 0.0f));
        c0906q.f8859f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
