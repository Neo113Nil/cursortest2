package C5;

import g1.C4524d;
import q7.C4938g;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public C4524d f481n;

    /* renamed from: u, reason: collision with root package name */
    public C4938g[] f482u;

    /* renamed from: v, reason: collision with root package name */
    public C4938g[] f483v;

    /* renamed from: w, reason: collision with root package name */
    public String f484w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f485x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C4524d f486y;

    /* renamed from: z, reason: collision with root package name */
    public int f487z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C4524d c4524d, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f486y = c4524d;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f485x = obj;
        this.f487z |= Integer.MIN_VALUE;
        return this.f486y.F(this);
    }
}
