package G1;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3124a;

    public i(d dVar) {
        this.f3124a = dVar;
    }

    @Override // G1.b
    public final void a(boolean z4) {
        P1.e eVar = this.f3124a.f3122m;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z4)));
    }
}
