package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class Ls implements Rs {

    /* renamed from: j, reason: collision with root package name */
    public static final C4301zs f26236j = new C4301zs(new JSONArray().toString(), new Bundle(), "");

    /* renamed from: a, reason: collision with root package name */
    public final C3157eg f26237a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f26238b;

    /* renamed from: c, reason: collision with root package name */
    public final C4084vr f26239c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f26240d;

    /* renamed from: e, reason: collision with root package name */
    public final C3226fu f26241e;

    /* renamed from: f, reason: collision with root package name */
    public final C3922sr f26242f;

    /* renamed from: g, reason: collision with root package name */
    public final C2781Sn f26243g;

    /* renamed from: h, reason: collision with root package name */
    public final C2544Eo f26244h;
    public final String i;

    public Ls(C3157eg c3157eg, ScheduledExecutorService scheduledExecutorService, String str, C4084vr c4084vr, Context context, C3226fu c3226fu, C3922sr c3922sr, C2781Sn c2781Sn, C2544Eo c2544Eo) {
        this.f26237a = c3157eg;
        this.f26238b = scheduledExecutorService;
        this.i = str;
        this.f26239c = c4084vr;
        this.f26240d = context;
        this.f26241e = c3226fu;
        this.f26242f = c3922sr;
        this.f26243g = c2781Sn;
        this.f26244h = c2544Eo;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        C3226fu c3226fu = this.f26241e;
        if (c3226fu.f30915s) {
            if (!Arrays.asList(((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31727m2)).split(",")).contains(K3.b.I(K3.b.J(c3226fu.f30901d)))) {
                return C3686oN.c(f26236j);
            }
        }
        return C3686oN.s(new C2478Aq(3, this), this.f26237a);
    }

    public final void b(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C4246yr c4246yr = (C4246yr) ((Map.Entry) it.next()).getValue();
            String str = c4246yr.f35415a;
            Bundle bundle = this.f26241e.f30901d.f40013F;
            arrayList.add(c(str, Collections.singletonList(c4246yr.f35419e), bundle != null ? bundle.getBundle(str) : null, c4246yr.f35416b, c4246yr.f35417c));
        }
    }

    public final JD c(String str, List list, Bundle bundle, boolean z8, boolean z9) {
        Js js = new Js(this, str, list, bundle, z8, z9);
        C3157eg c3157eg = this.f26237a;
        JD s3 = JD.s(C3686oN.s(js, c3157eg));
        C3151ea c3151ea = AbstractC3368ia.f31671g2;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            s3 = (JD) C3686oN.w(s3, ((Long) rVar.f40119c.a(AbstractC3368ia.f31606Z1)).longValue(), TimeUnit.MILLISECONDS, this.f26238b);
        }
        return C3686oN.u(s3, Throwable.class, new C2854Xb(str, 3), c3157eg);
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 32;
    }
}
