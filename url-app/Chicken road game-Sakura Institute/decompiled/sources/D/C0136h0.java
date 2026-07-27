package D;

import p.InterfaceC0933i;

/* renamed from: D.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136h0 extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0142j0 f1808j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0933i f1809k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0142j0 f1811m;

    /* renamed from: n, reason: collision with root package name */
    public int f1812n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136h0(C0142j0 c0142j0, E2.c cVar) {
        super(cVar);
        this.f1811m = c0142j0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f1810l = obj;
        this.f1812n |= Integer.MIN_VALUE;
        return this.f1811m.a(null, this);
    }
}
