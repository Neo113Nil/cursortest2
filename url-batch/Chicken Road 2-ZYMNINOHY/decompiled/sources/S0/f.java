package S0;

import c0.C0273f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2411a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2412b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2413c;

    public C0273f a() {
        if (this.f2411a || !(this.f2412b || this.f2413c)) {
            return new C0273f(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
