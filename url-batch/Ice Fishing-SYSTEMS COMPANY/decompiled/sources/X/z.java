package X;

import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class z extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public D f3626n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3627u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3628v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D f3629w;

    /* renamed from: x, reason: collision with root package name */
    public int f3630x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3629w = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3628v = obj;
        this.f3630x |= Integer.MIN_VALUE;
        return this.f3629w.g(this);
    }
}
