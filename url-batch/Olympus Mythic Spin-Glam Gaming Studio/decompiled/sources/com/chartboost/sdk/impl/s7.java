package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.pi;
import com.chartboost.sdk.impl.si;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s7 implements q7, p7 {
    public Lazy a;
    public Lazy b;
    public Lazy c;
    public Lazy d;
    public Lazy e;
    public Lazy f;
    public final Map g;
    public final Map h;
    public final List i;

    public s7(Lazy config, Lazy throttler, Lazy requestBodyBuilder, Lazy privacyApi, Lazy trackingRequest, Lazy trackingEventCache) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(throttler, "throttler");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(trackingRequest, "trackingRequest");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        this.a = config;
        this.b = throttler;
        this.c = requestBodyBuilder;
        this.d = privacyApi;
        this.e = trackingRequest;
        this.f = trackingEventCache;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new ArrayList();
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.h.remove(a(location, type));
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        mo3218clearFromStorage(piVar);
        return piVar;
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        mo3219persist(piVar);
        return piVar;
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        mo3220refresh(miVar);
        return miVar;
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        mo3221store(ciVar);
        return ciVar;
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        mo3222track(piVar);
        return piVar;
    }

    public final String e(pi piVar) {
        return a(piVar.c(), piVar.a());
    }

    public final void g(pi piVar) {
        piVar.a((ci) this.g.get(e(piVar)));
        piVar.a(a(piVar));
        b(piVar);
        xb.a("Event: " + piVar, (Throwable) null, 2, (Object) null);
        h(piVar);
    }

    public final void h(pi piVar) {
        if (f(piVar)) {
            this.h.put(e(piVar), piVar);
        }
    }

    public final boolean f(pi piVar) {
        si f = piVar.f();
        return f == si.a.d || f == si.i.c;
    }

    public final float a(pi piVar) {
        if (!piVar.h()) {
            return piVar.b();
        }
        if (!piVar.m()) {
            return 0.0f;
        }
        try {
            if (((pi) this.h.remove(e(piVar))) != null) {
                return (piVar.i() - r1.i()) / 1000.0f;
            }
            return -1.0f;
        } catch (Exception e) {
            xb.a("Cannot calculate latency", e);
            return -1.0f;
        }
    }

    public final void b(pi piVar) {
        Unit unit;
        if (piVar != null) {
            try {
                if (((mi) this.a.getValue()).e()) {
                    c(piVar);
                } else {
                    d(piVar);
                }
                unit = Unit.INSTANCE;
            } catch (Exception e) {
                xb.a("Cannot send tracking event", e);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Cannot save empty event", (Throwable) null, 2, (Object) null);
        }
    }

    public final void c(pi piVar) {
        ((ri) this.f.getValue()).a(piVar, a(), ((mi) this.a.getValue()).f());
        if (piVar.g() == pi.a.c) {
            a(((ri) this.f.getValue()).a());
        }
    }

    public final void d(pi piVar) {
        this.i.add(piVar);
        if (piVar.g() == pi.a.c) {
            a(((ri) this.f.getValue()).a(this.i, a()));
        }
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(event, "event");
        mi miVar = (mi) this.a.getValue();
        if (!miVar.h()) {
            xb.a("Tracking is disabled", (Throwable) null, 2, (Object) null);
            return;
        }
        if (miVar.a().contains(event.f())) {
            xb.a("Event name " + event.f() + " is black-listed", (Throwable) null, 2, (Object) null);
            return;
        }
        pi e = ((n7) this.b.getValue()).e(event);
        if (e != null) {
            g(e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Event is throttled " + event, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.g.put(a(ad), ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = LazyKt.lazyOf(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.a((ci) this.g.get(e(event)));
        event.a(a(event));
        xb.a("Persist event: " + event, (Throwable) null, 2, (Object) null);
        ((ri) this.f.getValue()).a(event, a());
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((ri) this.f.getValue()).a(event);
    }

    public final void a(List list) {
        ((vi) this.e.getValue()).a(((mi) this.a.getValue()).b(), list);
    }

    public final j7 a() {
        try {
            ig a = ((gg) this.c.getValue()).a();
            return i7.a.a(a.c(), a.h(), a.g().c(), (bf) this.d.getValue(), a.h);
        } catch (Exception e) {
            xb.a("Cannot create environment data for tracking", e);
            return new j7(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
    }

    public final String a(ci ciVar) {
        return ciVar.e() + ciVar.d();
    }

    public final String a(String str, String str2) {
        return str + str2;
    }
}
