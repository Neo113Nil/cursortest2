package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ka implements la, q7 {
    public final d0 a;
    public final String b;
    public final c0 c;
    public final r0 d;
    public final pa e;
    public final q1 f;
    public final a7 g;
    public final ge h;
    public final /* synthetic */ q7 i;
    public boolean j;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ra.values().length];
            try {
                iArr[ra.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ra.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ka(d0 adUnit, String location, c0 adType, r0 adUnitRendererImpressionCallback, pa impressionIntermediateCallback, q1 appRequest, a7 downloader, ge openMeasurementImpressionCallback, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = adUnit;
        this.b = location;
        this.c = adType;
        this.d = adUnitRendererImpressionCallback;
        this.e = impressionIntermediateCallback;
        this.f = appRequest;
        this.g = downloader;
        this.h = openMeasurementImpressionCallback;
        this.i = eventTracker;
        this.j = true;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.i.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.i.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.i.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.i.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3222track(event);
    }

    @Override // com.chartboost.sdk.impl.la
    public void c() {
        this.d.a(this.a.m());
    }

    @Override // com.chartboost.sdk.impl.la
    public void f(boolean z) {
        this.j = z;
    }

    public final void a() {
        xb.b("Dismissing impression", (Throwable) null, 2, (Object) null);
        this.e.a(ra.g);
        b();
    }

    @Override // com.chartboost.sdk.impl.la
    public void a(ra state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.j = true;
        this.h.a(PlayerState.NORMAL);
        int i = a.a[state.ordinal()];
        if (i == 1) {
            a();
        } else if (i == 2) {
            b();
            track((pi) new s5(si.i.n, "onClose with state Loaded", this.c.b(), this.b, null, null, 48, null));
        }
        this.d.a(this.f);
    }

    public final void b() {
        xb.b("Removing impression", (Throwable) null, 2, (Object) null);
        this.e.a(ra.h);
        this.e.n();
        this.g.c();
    }
}
