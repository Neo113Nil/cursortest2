package g1;

import N2.q;
import N2.x;

/* renamed from: g1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403j extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public q f4833d;

    /* renamed from: e, reason: collision with root package name */
    public q f4834e;

    /* renamed from: f, reason: collision with root package name */
    public x f4835f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0404k f4837h;

    /* renamed from: i, reason: collision with root package name */
    public int f4838i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0403j(C0404k c0404k, R1.c cVar) {
        super(cVar);
        this.f4837h = c0404k;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4836g = obj;
        this.f4838i |= Integer.MIN_VALUE;
        return this.f4837h.b(null, this);
    }
}
