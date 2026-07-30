package b3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f5531v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f5532w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f5533x;

    public d(e eVar, int i, int i4) {
        Objects.requireNonNull(eVar);
        this.f5533x = eVar;
        this.f5531v = i;
        this.f5532w = i4;
    }

    @Override // b3.AbstractC0526a
    public final Object[] a() {
        return this.f5533x.a();
    }

    @Override // b3.AbstractC0526a
    public final int c() {
        return this.f5533x.c() + this.f5531v;
    }

    @Override // b3.AbstractC0526a
    public final int d() {
        return this.f5533x.c() + this.f5531v + this.f5532w;
    }

    @Override // b3.e, java.util.List
    /* renamed from: g */
    public final e subList(int i, int i4) {
        com.bumptech.glide.g.W(i, i4, this.f5532w);
        int i9 = this.f5531v;
        return this.f5533x.subList(i + i9, i4 + i9);
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.bumptech.glide.g.V(i, this.f5532w);
        return this.f5533x.get(i + this.f5531v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5532w;
    }
}
