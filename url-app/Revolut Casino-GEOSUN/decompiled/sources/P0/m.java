package P0;

import L.Q;
import s0.C0235n;

/* loaded from: classes.dex */
public final class m extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f803h;

    /* renamed from: i, reason: collision with root package name */
    public int f804i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f805j;

    /* renamed from: k, reason: collision with root package name */
    public C0235n f806k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Q q2, w0.d dVar) {
        super(dVar);
        this.f805j = q2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f803h = obj;
        this.f804i |= Integer.MIN_VALUE;
        return this.f805j.d(null, this);
    }
}
