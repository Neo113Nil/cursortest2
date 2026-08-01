package u1;

import c1.AbstractC0106c;
import n.C0288n;

/* loaded from: classes.dex */
public final class a extends AbstractC0106c {

    /* renamed from: a, reason: collision with root package name */
    public v1.g f4379a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0288n f4381c;

    /* renamed from: d, reason: collision with root package name */
    public int f4382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0288n c0288n, a1.d dVar) {
        super(dVar);
        this.f4381c = c0288n;
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        this.f4380b = obj;
        this.f4382d |= Integer.MIN_VALUE;
        return this.f4381c.collect(null, this);
    }
}
