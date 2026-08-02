package com.squareup.cash.support.presenters;

import com.squareup.cash.support.incidents.backend.api.Incident;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportIncidentDetailsPresenter$State {
    public final Incident incident;
    public final boolean loading;
    public final boolean updatingSubscription;

    public SupportIncidentDetailsPresenter$State(Incident incident, boolean z, boolean z2) {
        this.incident = incident;
        this.loading = z;
        this.updatingSubscription = z2;
    }

    public static SupportIncidentDetailsPresenter$State copy$default(SupportIncidentDetailsPresenter$State supportIncidentDetailsPresenter$State, Incident incident, boolean z, int i) {
        if ((i & 1) != 0) {
            incident = supportIncidentDetailsPresenter$State.incident;
        }
        boolean z2 = (i & 2) != 0 ? supportIncidentDetailsPresenter$State.loading : false;
        if ((i & 4) != 0) {
            z = supportIncidentDetailsPresenter$State.updatingSubscription;
        }
        supportIncidentDetailsPresenter$State.getClass();
        return new SupportIncidentDetailsPresenter$State(incident, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportIncidentDetailsPresenter$State)) {
            return false;
        }
        SupportIncidentDetailsPresenter$State supportIncidentDetailsPresenter$State = (SupportIncidentDetailsPresenter$State) obj;
        return Intrinsics.areEqual(this.incident, supportIncidentDetailsPresenter$State.incident) && this.loading == supportIncidentDetailsPresenter$State.loading && this.updatingSubscription == supportIncidentDetailsPresenter$State.updatingSubscription;
    }

    public final int hashCode() {
        Incident incident = this.incident;
        return Boolean.hashCode(this.updatingSubscription) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((incident == null ? 0 : incident.hashCode()) * 31, 31, this.loading);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(incident=");
        sb.append(this.incident);
        sb.append(", loading=");
        sb.append(this.loading);
        sb.append(", updatingSubscription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.updatingSubscription, ")");
    }
}
