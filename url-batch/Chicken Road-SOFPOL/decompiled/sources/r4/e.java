package r4;

import c6.m;
import d6.k;
import q6.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f6577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f6578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f6579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f6581h;

    public /* synthetic */ e(o oVar, o oVar2, g gVar, boolean z3, k kVar) {
        this.f6577d = oVar;
        this.f6578e = oVar2;
        this.f6579f = gVar;
        this.f6580g = z3;
        this.f6581h = kVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        o4.d dVar = (o4.d) obj;
        q6.i.e(dVar, "entry");
        this.f6577d.f6201d = true;
        this.f6578e.f6201d = true;
        this.f6579f.n(dVar, this.f6580g, this.f6581h);
        return m.f1757a;
    }
}
