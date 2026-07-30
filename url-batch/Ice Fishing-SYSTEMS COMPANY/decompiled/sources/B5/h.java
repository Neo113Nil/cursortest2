package B5;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public j f338n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f339u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f340v;

    /* renamed from: w, reason: collision with root package name */
    public int f341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f340v = jVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f339u = obj;
        this.f341w |= Integer.MIN_VALUE;
        return j.b(this.f340v, this);
    }
}
