package X;

import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class w extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public D f3613n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3614u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3615v;

    /* renamed from: w, reason: collision with root package name */
    public int f3616w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3615v = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3614u = obj;
        this.f3616w |= Integer.MIN_VALUE;
        return this.f3615v.d(this);
    }
}
