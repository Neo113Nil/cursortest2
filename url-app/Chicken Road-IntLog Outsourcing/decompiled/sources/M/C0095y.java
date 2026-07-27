package M;

import m4.AbstractC1295c;

/* renamed from: M.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095y extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public P f1769a;

    /* renamed from: b, reason: collision with root package name */
    public L4.d f1770b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1772d;

    /* renamed from: e, reason: collision with root package name */
    public int f1773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095y(P p5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1772d = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1771c = obj;
        this.f1773e |= Integer.MIN_VALUE;
        return P.d(this.f1772d, this);
    }
}
