package j;

/* renamed from: j.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526H extends S1.A {

    /* renamed from: d, reason: collision with root package name */
    public int f6263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0525G f6264e;

    public C0526H(C0525G c0525g) {
        this.f6264e = c0525g;
    }

    @Override // S1.A
    public final int a() {
        int i3 = this.f6263d;
        this.f6263d = i3 + 1;
        return this.f6264e.c(i3);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6263d < this.f6264e.e();
    }
}
