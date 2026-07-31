package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.hc1;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class fa2<AdT, AdapterT, ListenerT extends hc1> implements a52<AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final c52<AdapterT, ListenerT> f5062a;

    /* renamed from: b, reason: collision with root package name */
    private final j52<AdT, AdapterT, ListenerT> f5063b;

    /* renamed from: c, reason: collision with root package name */
    private final nw2 f5064c;

    /* renamed from: d, reason: collision with root package name */
    private final dc3 f5065d;

    public fa2(nw2 nw2Var, dc3 dc3Var, c52<AdapterT, ListenerT> c52Var, j52<AdT, AdapterT, ListenerT> j52Var) {
        this.f5064c = nw2Var;
        this.f5065d = dc3Var;
        this.f5063b = j52Var;
        this.f5062a = c52Var;
    }

    static final String e(String str, int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i7);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<AdT> a(final ds2 ds2Var, final rr2 rr2Var) {
        final d52<AdapterT, ListenerT> d52Var;
        Iterator<String> it = rr2Var.f11398u.iterator();
        while (true) {
            if (!it.hasNext()) {
                d52Var = null;
                break;
            }
            try {
                d52Var = this.f5062a.a(it.next(), rr2Var.f11400w);
                break;
            } catch (ps2 unused) {
            }
        }
        if (d52Var == null) {
            return rb3.h(new f82("Unable to instantiate mediation adapter class."));
        }
        bp0 bp0Var = new bp0();
        d52Var.f4073c.C5(new ea2(this, d52Var, bp0Var));
        if (rr2Var.J) {
            Bundle bundle = ds2Var.f4312a.f2953a.f7618d.f7655r;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        nw2 nw2Var = this.f5064c;
        return wv2.d(new qv2() { // from class: com.google.android.gms.internal.ads.da2
            @Override // com.google.android.gms.internal.ads.qv2
            public final void zza() {
                fa2.this.d(ds2Var, rr2Var, d52Var);
            }
        }, this.f5065d, gw2.ADAPTER_LOAD_AD_SYN, nw2Var).b(gw2.ADAPTER_LOAD_AD_ACK).d(bp0Var).b(gw2.ADAPTER_WRAP_ADAPTER).e(new pv2() { // from class: com.google.android.gms.internal.ads.ca2
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                return fa2.this.c(ds2Var, rr2Var, d52Var, (Void) obj);
            }
        }).a();
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        return !rr2Var.f11398u.isEmpty();
    }

    final /* synthetic */ Object c(ds2 ds2Var, rr2 rr2Var, d52 d52Var, Void r42) {
        return this.f5063b.a(ds2Var, rr2Var, d52Var);
    }

    final /* synthetic */ void d(ds2 ds2Var, rr2 rr2Var, d52 d52Var) {
        this.f5063b.b(ds2Var, rr2Var, d52Var);
    }
}
