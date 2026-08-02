package K;

import f2.AbstractC0326c;
import t2.C1202l;

/* renamed from: K.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058w extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public Object f820d;

    /* renamed from: e, reason: collision with root package name */
    public N f821e;
    public C1202l f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f822g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f823h;

    /* renamed from: i, reason: collision with root package name */
    public int f824i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058w(N n3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f823h = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f822g = obj;
        this.f824i |= Integer.MIN_VALUE;
        return N.c(this.f823h, null, this);
    }
}
