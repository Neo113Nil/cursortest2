package z1;

import A1.C0065k0;
import D.H0;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s1.C1183B;

/* loaded from: classes.dex */
public final class y implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11926e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1183B f11927i;

    public y(boolean z4, String str, C1183B c1183b) {
        this.f11925d = z4;
        this.f11926e = str;
        this.f11927i = c1183b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else if (this.f11925d) {
            H0.a(null, AbstractC1365I.f11801b, AbstractC1365I.f11807h, 0.0f, null, O.f.b(1396195140, new C0065k0(this.f11926e, 5, this.f11927i), c0216p), c0216p, 196608);
        }
        return Unit.f7487a;
    }
}
