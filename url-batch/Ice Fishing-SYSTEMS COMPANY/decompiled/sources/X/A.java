package X;

import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class A extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public D f3520n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3521u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3522v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3523w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f3524x;

    /* renamed from: y, reason: collision with root package name */
    public int f3525y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3524x = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3523w = obj;
        this.f3525y |= Integer.MIN_VALUE;
        return this.f3524x.h(null, null, this);
    }
}
