package c2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public d1.k f1705a;

    /* renamed from: b, reason: collision with root package name */
    public int f1706b;

    /* renamed from: c, reason: collision with root package name */
    public o0.e f1707c;

    /* renamed from: d, reason: collision with root package name */
    public o0.e f1708d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f1710f;

    public z0(b1 b1Var, d1.k kVar, int i3, o0.e eVar, o0.e eVar2, boolean z10) {
        this.f1710f = b1Var;
        this.f1705a = kVar;
        this.f1706b = i3;
        this.f1707c = eVar;
        this.f1708d = eVar2;
        this.f1709e = z10;
    }

    public final boolean a(int i3, int i10) {
        o0.e eVar = this.f1707c;
        int i11 = this.f1706b;
        d1.j jVar = (d1.j) eVar.f7317d[i3 + i11];
        d1.j jVar2 = (d1.j) this.f1708d.f7317d[i11 + i10];
        return Intrinsics.a(jVar, jVar2) || jVar.getClass() == jVar2.getClass();
    }
}
