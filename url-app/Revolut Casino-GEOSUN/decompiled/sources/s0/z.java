package s0;

import D.C0019u;

/* loaded from: classes.dex */
public final class z extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2961h;

    /* renamed from: i, reason: collision with root package name */
    public int f2962i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019u f2963j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0019u c0019u, w0.d dVar) {
        super(dVar);
        this.f2963j = c0019u;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2961h = obj;
        this.f2962i |= Integer.MIN_VALUE;
        return this.f2963j.a(null, this);
    }
}
