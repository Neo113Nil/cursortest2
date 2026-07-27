package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class W extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Y f1639a;

    /* renamed from: b, reason: collision with root package name */
    public S f1640b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1641c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f1643e;

    /* renamed from: f, reason: collision with root package name */
    public int f1644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1643e = y5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1642d = obj;
        this.f1644f |= Integer.MIN_VALUE;
        return this.f1643e.a(null, this);
    }
}
