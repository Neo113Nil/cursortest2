package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2 f9145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2 f9146e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9147i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f9148r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b3 f9149s;

    public z2(b3 b3Var, y2 y2Var, y2 y2Var2, long j, boolean z10) {
        this.f9145d = y2Var;
        this.f9146e = y2Var2;
        this.f9147i = j;
        this.f9148r = z10;
        this.f9149s = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9149s.y(this.f9145d, this.f9146e, this.f9147i, this.f9148r, null);
    }
}
