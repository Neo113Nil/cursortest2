package e1;

/* renamed from: e1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8447a;

    /* renamed from: b, reason: collision with root package name */
    public final C0399c f8448b;

    public C0403g(int i4, C0399c c0399c) {
        this.f8447a = i4;
        this.f8448b = c0399c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8447a, ((C0403g) obj).f8447a);
    }
}
