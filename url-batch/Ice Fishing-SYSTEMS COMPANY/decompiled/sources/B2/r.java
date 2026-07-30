package B2;

import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2484Bf;
import com.google.android.gms.internal.ads.C2609Il;
import com.google.android.gms.internal.ads.C2726Pj;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C4009uN;
import com.google.android.gms.internal.ads.InterfaceC4063vN;
import com.google.android.gms.internal.ads.Ku;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.Ou;
import com.google.android.gms.internal.ads.Q8;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final C4009uN f294a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.e f295b;

    /* renamed from: c, reason: collision with root package name */
    public final C2726Pj f296c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f297d;

    public r(C4009uN c4009uN, A2.e eVar, C2726Pj c2726Pj, C4009uN c4009uN2) {
        this.f294a = c4009uN;
        this.f295b = eVar;
        this.f296c = c2726Pj;
        this.f297d = c4009uN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        Ou ou = (Ou) this.f294a.d();
        A2.e eVar = this.f295b;
        eVar.getClass();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        t tVar = new t(c3157eg, ((C2484Bf) eVar.f34b).a());
        C3.j a9 = this.f296c.a();
        C2609Il c2609Il = (C2609Il) this.f297d.d();
        Q8 h9 = ou.a(a9.d(), Lu.GENERATE_SIGNALS).h(tVar);
        long intValue = ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31398A6)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Ku r9 = h9.q(intValue).r();
        r9.c(new MD(0, r9, new h4.c(2, c2609Il)), c3157eg);
        return r9;
    }
}
