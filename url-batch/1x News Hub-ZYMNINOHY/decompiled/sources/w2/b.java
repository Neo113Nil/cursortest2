package w2;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class b extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public v2.p f10642d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10643e;
    public final /* synthetic */ c f;

    /* renamed from: g, reason: collision with root package name */
    public int f10644g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f = cVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f10643e = obj;
        this.f10644g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
