package G4;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class b extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public F4.q f1048a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f1050c;

    /* renamed from: d, reason: collision with root package name */
    public int f1051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1050c = cVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1049b = obj;
        this.f1051d |= Integer.MIN_VALUE;
        return this.f1050c.b(null, this);
    }
}
