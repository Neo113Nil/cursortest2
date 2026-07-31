package W;

import s2.C0969c;

/* loaded from: classes.dex */
public final class b extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public c f4562g;

    /* renamed from: h, reason: collision with root package name */
    public C0969c f4563h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4564i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f4565j;

    /* renamed from: k, reason: collision with root package name */
    public int f4566k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, X1.c cVar2) {
        super(cVar2);
        this.f4565j = cVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f4564i = obj;
        this.f4566k |= Integer.MIN_VALUE;
        return this.f4565j.c(this);
    }
}
