package c;

import I.C0113p;
import L1.z;
import M1.B;
import Z1.j;

/* loaded from: classes.dex */
public final class h extends j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.e f4337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z3, Y1.e eVar, int i3) {
        super(2);
        this.f4336e = z3;
        this.f4337f = eVar;
        this.f4338g = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i3 = this.f4338g | 1;
        B.f(this.f4336e, this.f4337f, (C0113p) obj, i3);
        return z.f2729a;
    }
}
