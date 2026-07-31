package L;

import M.c;
import M1.AbstractC0143d;
import M1.B;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0143d {

    /* renamed from: d, reason: collision with root package name */
    public final c f2668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2669e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2670f;

    public a(c cVar, int i3, int i4) {
        this.f2668d = cVar;
        this.f2669e = i3;
        B.s(i3, i4, cVar.b());
        this.f2670f = i4 - i3;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f2670f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        B.q(i3, this.f2670f);
        return this.f2668d.get(this.f2669e + i3);
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final List subList(int i3, int i4) {
        B.s(i3, i4, this.f2670f);
        int i5 = this.f2669e;
        return new a(this.f2668d, i3 + i5, i5 + i4);
    }
}
