package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class L extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.p f686d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f687e;
    public final /* synthetic */ N f;

    /* renamed from: g, reason: collision with root package name */
    public int f688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f687e = obj;
        this.f688g |= Integer.MIN_VALUE;
        return this.f.j(null, false, this);
    }
}
