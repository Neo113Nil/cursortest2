package c0;

/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5565a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5566b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5567c;

    /* renamed from: d, reason: collision with root package name */
    public int f5568d = 0;

    public final C0278k a() {
        if (this.f5565a || !(this.f5566b || this.f5567c)) {
            return new C0278k(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
