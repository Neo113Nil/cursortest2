package u0;

import j.C0499q;
import m2.C0628c;

/* renamed from: u0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955B extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0959F f8110d;

    /* renamed from: e, reason: collision with root package name */
    public C0499q f8111e;

    /* renamed from: f, reason: collision with root package name */
    public C0628c f8112f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8113g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0959F f8114h;

    /* renamed from: i, reason: collision with root package name */
    public int f8115i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0955B(C0959F c0959f, R1.c cVar) {
        super(cVar);
        this.f8114h = c0959f;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f8113g = obj;
        this.f8115i |= Integer.MIN_VALUE;
        return this.f8114h.d(this);
    }
}
