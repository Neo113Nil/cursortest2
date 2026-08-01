package B;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final k f32a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f33b;

    public h(k kVar, Runnable runnable) {
        this.f32a = kVar;
        this.f33b = runnable;
    }

    public final Integer a() {
        k kVar = this.f32a;
        if (kVar != null) {
            return Integer.valueOf(((g) kVar.f44c).f21c);
        }
        return null;
    }
}
