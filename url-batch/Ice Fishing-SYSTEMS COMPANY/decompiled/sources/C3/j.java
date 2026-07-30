package C3;

import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2518Df;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3226fu;
import com.google.android.gms.internal.ads.C3593ml;
import com.google.android.gms.internal.ads.CallableC2988ba;
import com.google.android.gms.internal.ads.CallableC3538lk;
import com.google.android.gms.internal.ads.FD;
import com.google.android.gms.internal.ads.GD;
import com.google.android.gms.internal.ads.InterfaceC3901sN;
import com.google.android.gms.internal.ads.Ku;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.Ou;
import com.google.android.gms.internal.ads.Q8;
import com.google.android.gms.internal.ads.SB;
import com.google.android.gms.internal.ads.UB;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f421a = new i();

    /* renamed from: b, reason: collision with root package name */
    public Object f422b = new i();

    /* renamed from: c, reason: collision with root package name */
    public Object f423c = new i();

    /* renamed from: d, reason: collision with root package name */
    public Object f424d = new i();

    /* renamed from: e, reason: collision with root package name */
    public Object f425e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public Object f426f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public Object f427g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public Object f428h = new a(0.0f);
    public Object i = new e();

    /* renamed from: j, reason: collision with root package name */
    public Object f429j = new e();

    /* renamed from: k, reason: collision with root package name */
    public Object f430k = new e();

    /* renamed from: l, reason: collision with root package name */
    public Object f431l = new e();

    public static void b(U2.a aVar) {
        if (aVar instanceof i) {
            ((i) aVar).getClass();
        } else if (aVar instanceof d) {
            ((d) aVar).getClass();
        }
    }

    public k a() {
        k kVar = new k();
        kVar.f432a = (U2.a) this.f421a;
        kVar.f433b = (U2.a) this.f422b;
        kVar.f434c = (U2.a) this.f423c;
        kVar.f435d = (U2.a) this.f424d;
        kVar.f436e = (c) this.f425e;
        kVar.f437f = (c) this.f426f;
        kVar.f438g = (c) this.f427g;
        kVar.f439h = (c) this.f428h;
        kVar.i = (e) this.i;
        kVar.f440j = (e) this.f429j;
        kVar.f441k = (e) this.f430k;
        kVar.f442l = (e) this.f431l;
        return kVar;
    }

    public Ku c(Bundle bundle) {
        ((C3593ml) this.f431l).a();
        Lu lu = Lu.SIGNALS;
        Ou ou = (Ou) this.f421a;
        Objects.requireNonNull(ou);
        return new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, ((C2518Df) this.i).i(new Bundle(), bundle)).r();
    }

    public Ku d() {
        int i = 0;
        Bundle bundle = new Bundle();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue()) {
            Bundle bundle2 = ((C3226fu) this.f430k).f30916t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        Ku c4 = c(bundle);
        Lu lu = Lu.REQUEST_PARCEL;
        J3.a[] aVarArr = {c4, (J3.a) ((InterfaceC3901sN) this.f427g).d()};
        Ou ou = (Ou) this.f421a;
        ou.getClass();
        List asList = Arrays.asList(aVarArr);
        CallableC3538lk callableC3538lk = new CallableC3538lk(this, c4, bundle, i);
        SB sb = UB.f27942u;
        asList.getClass();
        UB n9 = UB.n(asList);
        CallableC2988ba callableC2988ba = CallableC2988ba.f29507f;
        C3157eg c3157eg = AbstractC3212fg.f30745h;
        GD gd = new GD(n9, true, false);
        gd.f25114I = new FD(gd, callableC2988ba, c3157eg);
        gd.w();
        GD gd2 = new GD(n9, true, false);
        gd2.f25114I = new FD(gd2, callableC3538lk, ou.f26777a);
        gd2.w();
        return new Q8(ou, lu, null, gd, asList, gd2).r();
    }
}
