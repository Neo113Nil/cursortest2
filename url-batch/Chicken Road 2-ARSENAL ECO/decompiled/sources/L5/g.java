package L5;

import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class g extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public h f1501f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1502g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f1504i;

    /* renamed from: j, reason: collision with root package name */
    public int f1505j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f1504i = hVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f1503h = obj;
        this.f1505j |= Integer.MIN_VALUE;
        return this.f1504i.a(null, this);
    }
}
