package p2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r6.u f7173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f7174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m2.i f7175i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7176j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7177k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r6.u uVar, v vVar, m2.i iVar, long j8, long j9) {
        super(0);
        this.f7173g = uVar;
        this.f7174h = vVar;
        this.f7175i = iVar;
        this.f7176j = j8;
        this.f7177k = j9;
    }

    @Override // q6.a
    public final Object a() {
        v vVar = this.f7174h;
        this.f7173g.f7967f = vVar.getPositionProvider().a(this.f7175i, this.f7176j, vVar.getParentLayoutDirection(), this.f7177k);
        return d6.z.f2639a;
    }
}
