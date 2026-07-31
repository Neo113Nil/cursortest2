package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mf implements lf, q7 {
    public final gf a;
    public final /* synthetic */ q7 b;

    public mf(gf repository, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = repository;
        this.b = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.b.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.b.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.b.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.b.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.b.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.b.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.b.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.b.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.mo3222track(event);
    }

    @Override // com.chartboost.sdk.impl.lf
    public void a(DataUseConsent dataUseConsent) {
        String privacyStandardName;
        if (dataUseConsent != null && (privacyStandardName = dataUseConsent.getPrivacyStandardName()) != null && privacyStandardName.length() != 0) {
            if (!(dataUseConsent instanceof GDPR) && !(dataUseConsent instanceof CCPA) && !(dataUseConsent instanceof COPPA) && !(dataUseConsent instanceof LGPD) && !(dataUseConsent instanceof Custom)) {
                try {
                    si.d dVar = si.d.c;
                    String name = dataUseConsent.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    track((pi) new l7(dVar, name, "", "", null, 16, null));
                } catch (Exception unused) {
                }
                xb.e("Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.", null, 2, null);
                return;
            }
            this.a.b(dataUseConsent);
            return;
        }
        try {
            track((pi) new s5(si.d.g, "", "", "", null, null, 48, null));
        } catch (Exception unused2) {
        }
        xb.b("addDataUseConsent failed", (Throwable) null, 2, (Object) null);
    }
}
