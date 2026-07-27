package j2;

/* renamed from: j2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716f implements InterfaceC0711a {

    /* renamed from: d, reason: collision with root package name */
    public long f7161d;

    public long a() {
        return Math.max(0L, this.f7161d - System.nanoTime());
    }

    @Override // j2.InterfaceC0711a
    public long d() {
        return System.currentTimeMillis() + this.f7161d;
    }
}
