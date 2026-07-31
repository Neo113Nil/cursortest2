package o2;

/* renamed from: o2.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3322c0 implements InterfaceC3341m {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3320b0 f42047b;

    public C3322c0(InterfaceC3320b0 interfaceC3320b0) {
        this.f42047b = interfaceC3320b0;
    }

    @Override // o2.InterfaceC3341m
    public void a(Throwable th) {
        this.f42047b.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f42047b + ']';
    }
}
