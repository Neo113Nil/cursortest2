package l4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5973a;

    public i(d dVar) {
        this.f5973a = dVar;
    }

    @Override // l4.b
    public final void a(boolean z8) {
        u4.e eVar = this.f5973a.f5971m;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
