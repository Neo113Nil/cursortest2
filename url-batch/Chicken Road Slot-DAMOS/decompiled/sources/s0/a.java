package s0;

import java.util.List;
import kotlin.collections.f;
import t0.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final b f8405e;

    /* renamed from: i, reason: collision with root package name */
    public final int f8406i;

    /* renamed from: r, reason: collision with root package name */
    public final int f8407r;

    public a(b bVar, int i3, int i10) {
        this.f8405e = bVar;
        this.f8406i = i3;
        i7.a.E(i3, i10, bVar.size());
        this.f8407r = i10 - i3;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f8407r;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        i7.a.w(i3, this.f8407r);
        return this.f8405e.get(this.f8406i + i3);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i3, int i10) {
        i7.a.E(i3, i10, this.f8407r);
        int i11 = this.f8406i;
        return new a(this.f8405e, i3 + i11, i11 + i10);
    }
}
