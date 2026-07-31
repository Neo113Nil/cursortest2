package j1;

import T2.q;
import T2.x;

/* loaded from: classes.dex */
public final class j extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public q f6402g;

    /* renamed from: h, reason: collision with root package name */
    public q f6403h;

    /* renamed from: i, reason: collision with root package name */
    public x f6404i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6405j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f6406k;

    /* renamed from: l, reason: collision with root package name */
    public int f6407l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, X1.c cVar) {
        super(cVar);
        this.f6406k = kVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6405j = obj;
        this.f6407l |= Integer.MIN_VALUE;
        return this.f6406k.b(null, this);
    }
}
