package K5;

import J5.q;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class a extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public q f1385f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1387h;

    /* renamed from: i, reason: collision with root package name */
    public int f1388i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f1387h = bVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f1386g = obj;
        this.f1388i |= Integer.MIN_VALUE;
        return this.f1387h.b(null, this);
    }
}
