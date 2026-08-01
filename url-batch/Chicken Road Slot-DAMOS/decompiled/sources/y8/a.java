package y8;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f10667a;

    /* renamed from: b, reason: collision with root package name */
    public int f10668b;

    /* renamed from: c, reason: collision with root package name */
    public String f10669c;

    /* renamed from: d, reason: collision with root package name */
    public String f10670d;

    /* renamed from: e, reason: collision with root package name */
    public long f10671e;

    /* renamed from: f, reason: collision with root package name */
    public long f10672f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public byte f10673h;

    public final b a() {
        if (this.f10673h == 3 && this.f10668b != 0) {
            return new b(this.f10667a, this.f10668b, this.f10669c, this.f10670d, this.f10671e, this.f10672f, this.g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f10668b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.f10673h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f10673h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        r.s(sb2, "Missing required properties:");
        return null;
    }
}
