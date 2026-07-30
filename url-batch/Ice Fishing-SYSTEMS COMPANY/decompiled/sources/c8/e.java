package c8;

/* loaded from: classes2.dex */
public final class e extends M.h {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5769v;

    public e(G1.a aVar, boolean z8) {
        super(aVar);
        this.f5769v = z8;
    }

    @Override // M.h
    public final void n(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        if (this.f5769v) {
            super.n(value);
        } else {
            k(value);
        }
    }
}
