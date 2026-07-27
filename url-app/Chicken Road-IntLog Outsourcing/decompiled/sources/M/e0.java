package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public f2.t f1673a;

    /* renamed from: b, reason: collision with root package name */
    public L4.a f1674b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.t f1676d;

    /* renamed from: e, reason: collision with root package name */
    public int f1677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f2.t tVar, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1676d = tVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1675c = obj;
        this.f1677e |= Integer.MIN_VALUE;
        return this.f1676d.f(this);
    }
}
