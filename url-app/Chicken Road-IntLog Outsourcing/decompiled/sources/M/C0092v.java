package M;

import m4.AbstractC1295c;

/* renamed from: M.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092v extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public P f1756a;

    /* renamed from: b, reason: collision with root package name */
    public L4.d f1757b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1759d;

    /* renamed from: e, reason: collision with root package name */
    public int f1760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092v(P p5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1759d = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1758c = obj;
        this.f1760e |= Integer.MIN_VALUE;
        return P.a(this.f1759d, this);
    }
}
