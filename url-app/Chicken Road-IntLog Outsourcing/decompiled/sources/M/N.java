package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class N extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.r f1602a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f1604c;

    /* renamed from: d, reason: collision with root package name */
    public int f1605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1604c = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1603b = obj;
        this.f1605d |= Integer.MIN_VALUE;
        return this.f1604c.j(null, false, this);
    }
}
