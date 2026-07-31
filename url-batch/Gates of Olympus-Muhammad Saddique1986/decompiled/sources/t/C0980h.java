package t;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8479b;

    /* renamed from: c, reason: collision with root package name */
    public final G1.m f8480c;

    public C0980h(int i3, int i4, G1.m mVar) {
        this.f8478a = i3;
        this.f8479b = i4;
        this.f8480c = mVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("startIndex should be >= 0, but was ", i3).toString());
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException(A.k.h("size should be >0, but was ", i4).toString());
        }
    }
}
