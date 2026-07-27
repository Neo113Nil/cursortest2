package h1;

import z3.z;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649b extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0650c f6828j;

    /* renamed from: k, reason: collision with root package name */
    public z f6829k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6830l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0650c f6831m;

    /* renamed from: n, reason: collision with root package name */
    public int f6832n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649b(C0650c c0650c, E2.c cVar) {
        super(cVar);
        this.f6831m = c0650c;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f6830l = obj;
        this.f6832n |= Integer.MIN_VALUE;
        return C0650c.a(this.f6831m, this);
    }
}
