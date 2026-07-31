package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.bn0;
import com.google.android.gms.internal.ads.bw0;
import com.google.android.gms.internal.ads.dd0;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.fy;
import com.google.android.gms.internal.ads.hx1;
import com.google.android.gms.internal.ads.jm2;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.km2;
import com.google.android.gms.internal.ads.kn1;
import com.google.android.gms.internal.ads.kr2;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.mn1;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.ng0;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.pb2;
import com.google.android.gms.internal.ads.pj0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.up2;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.yn2;
import com.google.android.gms.internal.ads.zg0;
import java.util.HashMap;
import x3.a;
import x3.b;
import y2.s;
import z2.b0;
import z2.c;
import z2.d;
import z2.u;
import z2.v;
import z2.x;

/* loaded from: classes.dex */
public class ClientApi extends wx {
    @Override // com.google.android.gms.internal.ads.xx
    public final pj0 A4(a aVar, dd0 dd0Var, int i7) {
        Context context = (Context) b.O0(aVar);
        kr2 B = bw0.h(context, dd0Var, i7).B();
        B.a(context);
        return B.c().a();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final u40 E1(a aVar, a aVar2, a aVar3) {
        return new kn1((View) b.O0(aVar), (HashMap) b.O0(aVar2), (HashMap) b.O0(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx E5(a aVar, pv pvVar, String str, dd0 dd0Var, int i7) {
        Context context = (Context) b.O0(aVar);
        jm2 y6 = bw0.h(context, dd0Var, i7).y();
        y6.b(str);
        y6.a(context);
        km2 c7 = y6.c();
        return i7 >= ((Integer) sw.c().b(m10.J3)).intValue() ? c7.a() : c7.zza();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final fy G0(a aVar, int i7) {
        return bw0.g((Context) b.O0(aVar), i7).i();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx G3(a aVar, pv pvVar, String str, dd0 dd0Var, int i7) {
        Context context = (Context) b.O0(aVar);
        yn2 z6 = bw0.h(context, dd0Var, i7).z();
        z6.a(context);
        z6.b(pvVar);
        z6.s(str);
        return z6.g().zza();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final q40 H0(a aVar, a aVar2) {
        return new mn1((FrameLayout) b.O0(aVar), (FrameLayout) b.O0(aVar2), 214106000);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final jx P1(a aVar, String str, dd0 dd0Var, int i7) {
        Context context = (Context) b.O0(aVar);
        return new pb2(bw0.h(context, dd0Var, i7), context, str);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final ng0 T1(a aVar, dd0 dd0Var, int i7) {
        return bw0.h((Context) b.O0(aVar), dd0Var, i7).t();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final zg0 U(a aVar) {
        Activity activity = (Activity) b.O0(aVar);
        AdOverlayInfoParcel c7 = AdOverlayInfoParcel.c(activity.getIntent());
        if (c7 == null) {
            return new v(activity);
        }
        int i7 = c7.f2419p;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new v(activity) : new b0(activity) : new x(activity, c7) : new d(activity) : new c(activity) : new u(activity);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final fk0 Y4(a aVar, String str, dd0 dd0Var, int i7) {
        Context context = (Context) b.O0(aVar);
        kr2 B = bw0.h(context, dd0Var, i7).B();
        B.a(context);
        B.b(str);
        return B.c().zza();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx c3(a aVar, pv pvVar, String str, int i7) {
        return new s((Context) b.O0(aVar), pvVar, str, new po0(214106000, i7, true, false));
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx g2(a aVar, pv pvVar, String str, dd0 dd0Var, int i7) {
        Context context = (Context) b.O0(aVar);
        up2 A = bw0.h(context, dd0Var, i7).A();
        A.a(context);
        A.b(pvVar);
        A.s(str);
        return A.g().zza();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final p80 g5(a aVar, dd0 dd0Var, int i7, n80 n80Var) {
        Context context = (Context) b.O0(aVar);
        hx1 r7 = bw0.h(context, dd0Var, i7).r();
        r7.a(context);
        r7.b(n80Var);
        return r7.c().g();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final bn0 x1(a aVar, dd0 dd0Var, int i7) {
        return bw0.h((Context) b.O0(aVar), dd0Var, i7).w();
    }
}
