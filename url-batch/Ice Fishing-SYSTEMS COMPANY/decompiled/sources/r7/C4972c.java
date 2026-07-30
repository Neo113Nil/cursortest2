package r7;

import java.util.List;
import java.util.RandomAccess;
import t0.AbstractC5051n;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4972c extends AbstractC4973d implements RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC4973d f40348n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40349u;

    /* renamed from: v, reason: collision with root package name */
    public final int f40350v;

    public C4972c(AbstractC4973d abstractC4973d, int i, int i4) {
        this.f40348n = abstractC4973d;
        this.f40349u = i;
        com.bumptech.glide.g.D(i, i4, abstractC4973d.a());
        this.f40350v = i4 - i;
    }

    @Override // r7.AbstractC4970a
    public final int a() {
        return this.f40350v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i4 = this.f40350v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return this.f40348n.get(this.f40349u + i);
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final List subList(int i, int i4) {
        com.bumptech.glide.g.D(i, i4, this.f40350v);
        int i9 = this.f40349u;
        return new C4972c(this.f40348n, i + i9, i9 + i4);
    }
}
