package L;

import M.c;
import S1.AbstractC0225d;
import a.AbstractC0235a;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0225d {

    /* renamed from: d, reason: collision with root package name */
    public final c f3339d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3340e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3341f;

    public a(c cVar, int i3, int i4) {
        this.f3339d = cVar;
        this.f3340e = i3;
        AbstractC0235a.n(i3, i4, cVar.b());
        this.f3341f = i4 - i3;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f3341f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0235a.l(i3, this.f3341f);
        return this.f3339d.get(this.f3340e + i3);
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0235a.n(i3, i4, this.f3341f);
        int i5 = this.f3340e;
        return new a(this.f3339d, i3 + i5, i5 + i4);
    }
}
