package q5;

import t5.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f7513a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7515c;

    public a(m mVar, boolean z8, boolean z9) {
        this.f7513a = mVar;
        this.f7514b = z8;
        this.f7515c = z9;
    }

    public final boolean a(t5.c cVar) {
        return (this.f7514b && !this.f7515c) || this.f7513a.f8910f.s(cVar);
    }

    public final boolean b(l5.f fVar) {
        return fVar.isEmpty() ? this.f7514b && !this.f7515c : a(fVar.z());
    }
}
