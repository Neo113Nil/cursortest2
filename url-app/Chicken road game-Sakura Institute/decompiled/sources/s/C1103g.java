package s;

import A.AbstractC0017m;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9931b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.g f9932c;

    public C1103g(int i2, int i4, l2.g gVar) {
        this.f9930a = i2;
        this.f9931b = i4;
        this.f9932c = gVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "startIndex should be >= 0, but was ").toString());
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i4, "size should be >0, but was ").toString());
        }
    }
}
