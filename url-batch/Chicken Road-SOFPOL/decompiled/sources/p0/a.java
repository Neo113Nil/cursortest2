package p0;

import d6.e;
import java.util.List;
import q0.c;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: d, reason: collision with root package name */
    public final c f5711d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5712e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5713f;

    public a(c cVar, int i, int i8) {
        this.f5711d = cVar;
        this.f5712e = i;
        r.n(i, i8, cVar.a());
        this.f5713f = i8 - i;
    }

    @Override // d6.a
    public final int a() {
        return this.f5713f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        r.l(i, this.f5713f);
        return this.f5711d.get(this.f5712e + i);
    }

    @Override // d6.e, java.util.List
    public final List subList(int i, int i8) {
        r.n(i, i8, this.f5713f);
        int i9 = this.f5712e;
        return new a(this.f5711d, i + i9, i9 + i8);
    }
}
