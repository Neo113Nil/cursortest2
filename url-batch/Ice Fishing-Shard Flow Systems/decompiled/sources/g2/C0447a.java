package g2;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447a {

    /* renamed from: a, reason: collision with root package name */
    public String f5011a;

    /* renamed from: b, reason: collision with root package name */
    public int f5012b;

    /* renamed from: c, reason: collision with root package name */
    public String f5013c;

    /* renamed from: d, reason: collision with root package name */
    public String f5014d;

    /* renamed from: e, reason: collision with root package name */
    public long f5015e;

    /* renamed from: f, reason: collision with root package name */
    public long f5016f;

    /* renamed from: g, reason: collision with root package name */
    public String f5017g;

    /* renamed from: h, reason: collision with root package name */
    public byte f5018h;

    public final C0448b a() {
        if (this.f5018h == 3 && this.f5012b != 0) {
            return new C0448b(this.f5011a, this.f5012b, this.f5013c, this.f5014d, this.f5015e, this.f5016f, this.f5017g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5012b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f5018h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f5018h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }
}
