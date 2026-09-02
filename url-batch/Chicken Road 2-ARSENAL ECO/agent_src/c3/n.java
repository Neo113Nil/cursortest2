package c3;

import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class n extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public String f3800f;

    /* renamed from: g, reason: collision with root package name */
    public b4.i f3801g;

    /* renamed from: h, reason: collision with root package name */
    public V3.a f3802h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3803i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f3804j;

    /* renamed from: k, reason: collision with root package name */
    public int f3805k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f3804j = oVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f3803i = obj;
        this.f3805k |= Integer.MIN_VALUE;
        return this.f3804j.a(null, null, null, null, null, null, this);
    }
}
