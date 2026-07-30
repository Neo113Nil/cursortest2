package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4841a;

/* renamed from: com.google.android.gms.internal.ads.ta, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3959ta extends AbstractC4841a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f34416a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f34417b = Arrays.asList(((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.ob)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final C4067va f34418c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4841a f34419d;

    /* renamed from: e, reason: collision with root package name */
    public final C3381io f34420e;

    public C3959ta(C4067va c4067va, AbstractC4841a abstractC4841a, C3381io c3381io) {
        this.f34419d = abstractC4841a;
        this.f34418c = c4067va;
        this.f34420e = c3381io;
    }

    @Override // p.AbstractC4841a
    public final void a(String str, Bundle bundle) {
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            abstractC4841a.a(str, bundle);
        }
    }

    @Override // p.AbstractC4841a
    public final Bundle b(String str, Bundle bundle) {
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            return abstractC4841a.b(str, bundle);
        }
        return null;
    }

    @Override // p.AbstractC4841a
    public final void c(int i, int i4, Bundle bundle) {
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            abstractC4841a.c(i, i4, bundle);
        }
    }

    @Override // p.AbstractC4841a
    public final void d(Bundle bundle) {
        this.f34416a.set(false);
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            abstractC4841a.d(bundle);
        }
    }

    @Override // p.AbstractC4841a
    public final void e(int i, Bundle bundle) {
        this.f34416a.set(false);
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            abstractC4841a.e(i, bundle);
        }
        p2.j jVar = p2.j.f39798C;
        jVar.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C4067va c4067va = this.f34418c;
        c4067va.f34809j = currentTimeMillis;
        List list = this.f34417b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        jVar.f39810k.getClass();
        c4067va.i = SystemClock.elapsedRealtime() + ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.lb)).intValue();
        if (c4067va.f34805e == null) {
            c4067va.f34805e = new RunnableC3068d(14, c4067va);
        }
        c4067va.d();
        K3.b.L(this.f34420e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // p.AbstractC4841a
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f34416a.set(true);
                K3.b.L(this.f34420e, "pact_action", new Pair("pe", "pact_con"));
                this.f34418c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e6) {
            t2.C.l("Message is not in JSON format: ", e6);
        }
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            abstractC4841a.f(str, bundle);
        }
    }

    @Override // p.AbstractC4841a
    public final void g(int i, Uri uri, boolean z8, Bundle bundle) {
        AbstractC4841a abstractC4841a = this.f34419d;
        if (abstractC4841a != null) {
            abstractC4841a.g(i, uri, z8, bundle);
        }
    }
}
