package b7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1240a;

    public a0(d dVar) {
        this.f1240a = dVar;
    }

    @Override // b7.b
    public final void a(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        d dVar = this.f1240a;
        dVar.f1273m.sendMessage(dVar.f1273m.obtainMessage(1, valueOf));
    }
}
