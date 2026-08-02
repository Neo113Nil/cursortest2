package K;

import f2.AbstractC0326c;

/* renamed from: K.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045i extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public B0.p f774d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f775e;
    public final /* synthetic */ B0.p f;

    /* renamed from: g, reason: collision with root package name */
    public int f776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045i(B0.p pVar, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f = pVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f775e = obj;
        this.f776g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
