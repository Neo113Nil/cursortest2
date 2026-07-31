package j;

/* renamed from: j.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482H extends M1.A {

    /* renamed from: d, reason: collision with root package name */
    public int f5145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0481G f5146e;

    public C0482H(C0481G c0481g) {
        this.f5146e = c0481g;
    }

    @Override // M1.A
    public final int a() {
        int i3 = this.f5145d;
        this.f5145d = i3 + 1;
        return this.f5146e.c(i3);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5145d < this.f5146e.e();
    }
}
