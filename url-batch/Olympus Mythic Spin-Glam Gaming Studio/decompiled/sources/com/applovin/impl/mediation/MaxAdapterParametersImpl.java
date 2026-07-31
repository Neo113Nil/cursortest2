package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes6.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {
    private String a;
    private Map b;
    private Bundle c;
    private Bundle d;
    private Boolean e;
    private Boolean f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private long k;
    private MaxAdFormat l;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl a = a((k3) y2Var);
        a.i = y2Var.R();
        a.j = y2Var.D();
        a.k = y2Var.C();
        return a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.h;
    }

    static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = a(d5Var);
        a.a = str;
        a.l = maxAdFormat;
        return a;
    }

    static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.e = k3Var.n();
        maxAdapterParametersImpl.f = k3Var.o();
        maxAdapterParametersImpl.g = k3Var.d();
        maxAdapterParametersImpl.b = k3Var.i();
        maxAdapterParametersImpl.c = k3Var.l();
        maxAdapterParametersImpl.d = k3Var.f();
        maxAdapterParametersImpl.h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
