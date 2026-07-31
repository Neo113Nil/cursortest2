package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ja {
    public final ij a;
    public final hb b;
    public final n4 c;
    public final q4 d;
    public final d5 e;
    public final qa f;
    public final ge g;
    public final q1 h;
    public final a7 i;
    public final q3 j;
    public final ia k;
    public final d0 l;
    public final c0 m;
    public final String n;
    public final pa o;
    public final ca p;
    public final r0 q;
    public final q7 r;

    public ja(ij urlResolver, hb intentResolver, n4 clickRequest, q4 clickTracking, d5 completeRequest, qa mediaType, ge openMeasurementImpressionCallback, q1 appRequest, a7 downloader, q3 viewProtocol, ia impressionCounter, d0 adUnit, c0 adTypeTraits, String location, pa impressionCallback, ca impressionClickCallback, r0 adUnitRendererImpressionCallback, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(impressionCounter, "impressionCounter");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraits, "adTypeTraits");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = urlResolver;
        this.b = intentResolver;
        this.c = clickRequest;
        this.d = clickTracking;
        this.e = completeRequest;
        this.f = mediaType;
        this.g = openMeasurementImpressionCallback;
        this.h = appRequest;
        this.i = downloader;
        this.j = viewProtocol;
        this.k = impressionCounter;
        this.l = adUnit;
        this.m = adTypeTraits;
        this.n = location;
        this.o = impressionCallback;
        this.p = impressionClickCallback;
        this.q = adUnitRendererImpressionCallback;
        this.r = eventTracker;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return Intrinsics.areEqual(this.a, jaVar.a) && Intrinsics.areEqual(this.b, jaVar.b) && Intrinsics.areEqual(this.c, jaVar.c) && Intrinsics.areEqual(this.d, jaVar.d) && Intrinsics.areEqual(this.e, jaVar.e) && this.f == jaVar.f && Intrinsics.areEqual(this.g, jaVar.g) && Intrinsics.areEqual(this.h, jaVar.h) && Intrinsics.areEqual(this.i, jaVar.i) && Intrinsics.areEqual(this.j, jaVar.j) && Intrinsics.areEqual(this.k, jaVar.k) && Intrinsics.areEqual(this.l, jaVar.l) && Intrinsics.areEqual(this.m, jaVar.m) && Intrinsics.areEqual(this.n, jaVar.n) && Intrinsics.areEqual(this.o, jaVar.o) && Intrinsics.areEqual(this.p, jaVar.p) && Intrinsics.areEqual(this.q, jaVar.q) && Intrinsics.areEqual(this.r, jaVar.r);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public String toString() {
        return "ImpressionDependency(urlResolver=" + this.a + ", intentResolver=" + this.b + ", clickRequest=" + this.c + ", clickTracking=" + this.d + ", completeRequest=" + this.e + ", mediaType=" + this.f + ", openMeasurementImpressionCallback=" + this.g + ", appRequest=" + this.h + ", downloader=" + this.i + ", viewProtocol=" + this.j + ", impressionCounter=" + this.k + ", adUnit=" + this.l + ", adTypeTraits=" + this.m + ", location=" + this.n + ", impressionCallback=" + this.o + ", impressionClickCallback=" + this.p + ", adUnitRendererImpressionCallback=" + this.q + ", eventTracker=" + this.r + ")";
    }

    public final ij q() {
        return this.a;
    }

    public final hb m() {
        return this.b;
    }

    public final n4 e() {
        return this.c;
    }

    public final q4 f() {
        return this.d;
    }

    public final d5 g() {
        return this.e;
    }

    public final qa o() {
        return this.f;
    }

    public final ge p() {
        return this.g;
    }

    public final q1 d() {
        return this.h;
    }

    public final a7 h() {
        return this.i;
    }

    public final q3 r() {
        return this.j;
    }

    public final ia l() {
        return this.k;
    }

    public final d0 b() {
        return this.l;
    }

    public final c0 a() {
        return this.m;
    }

    public final String n() {
        return this.n;
    }

    public final pa j() {
        return this.o;
    }

    public final ca k() {
        return this.p;
    }

    public final r0 c() {
        return this.q;
    }

    public final q7 i() {
        return this.r;
    }
}
