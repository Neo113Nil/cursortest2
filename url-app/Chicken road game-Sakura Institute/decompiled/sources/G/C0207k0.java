package G;

import kotlin.jvm.functions.Function1;

/* renamed from: G.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207k0 extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0209l0 f2821j;

    /* renamed from: k, reason: collision with root package name */
    public Function1 f2822k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2823l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0209l0 f2824m;

    /* renamed from: n, reason: collision with root package name */
    public int f2825n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207k0(C0209l0 c0209l0, C2.a aVar) {
        super(aVar);
        this.f2824m = c0209l0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f2823l = obj;
        this.f2825n |= Integer.MIN_VALUE;
        return this.f2824m.f(null, this);
    }
}
