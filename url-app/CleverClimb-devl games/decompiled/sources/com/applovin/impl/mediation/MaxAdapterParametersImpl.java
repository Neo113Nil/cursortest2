package com.applovin.impl.mediation;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a, reason: collision with root package name */
    private final String f2632a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f2633b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2634c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2635d;
    private final boolean e;
    private final String f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2636a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f2637b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2638c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2639d;
        private boolean e;
        private String f;

        public a a(com.applovin.impl.mediation.a.a aVar, Context context) {
            if (aVar != null) {
                this.f2636a = aVar.d();
                this.f = aVar.c();
            }
            return a((com.applovin.impl.mediation.a.e) aVar, context);
        }

        public a a(com.applovin.impl.mediation.a.e eVar, Context context) {
            if (eVar != null) {
                this.e = eVar.v();
                this.f2638c = eVar.b(context);
                this.f2639d = eVar.a(context);
                this.f2637b = eVar.x();
            }
            return this;
        }

        public a a(boolean z) {
            this.f2638c = z;
            return this;
        }

        public MaxAdapterParametersImpl a() {
            return new MaxAdapterParametersImpl(this);
        }

        public a b(boolean z) {
            this.f2639d = z;
            return this;
        }
    }

    private MaxAdapterParametersImpl(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("No builder specified");
        }
        this.f2632a = aVar.f2636a;
        this.f2633b = aVar.f2637b;
        this.f2634c = aVar.f2638c;
        this.f2635d = aVar.f2639d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f2633b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f2632a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean hasUserConsent() {
        return this.f2635d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isAgeRestrictedUser() {
        return this.f2634c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.e;
    }
}
