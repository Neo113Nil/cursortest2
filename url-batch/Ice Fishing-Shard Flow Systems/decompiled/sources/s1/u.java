package s1;

/* loaded from: classes.dex */
public final class u implements InterfaceC0871b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0873d f7734a;

    public u(C0873d c0873d) {
        this.f7734a = c0873d;
    }

    @Override // s1.InterfaceC0871b
    public final void a(boolean z7) {
        Boolean valueOf = Boolean.valueOf(z7);
        C0873d c0873d = this.f7734a;
        c0873d.f7658m.sendMessage(c0873d.f7658m.obtainMessage(1, valueOf));
    }
}
