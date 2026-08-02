package com.stripe.android.financialconnections.features.institutionpicker;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InstitutionPickerState {
    public final Async createSessionForInstitution;
    public final Async payload;
    public final FinancialConnectionsSessionManifest.Pane referrer;
    public final Async searchInstitutions;
    public final String selectedInstitutionId;

    public final class Payload {
        public final InstitutionResponse featuredInstitutions;
        public final long featuredInstitutionsDuration;
        public final boolean searchDisabled;

        public Payload(InstitutionResponse institutionResponse, boolean z, long j) {
            institutionResponse.getClass();
            this.featuredInstitutions = institutionResponse;
            this.searchDisabled = z;
            this.featuredInstitutionsDuration = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.featuredInstitutions, payload.featuredInstitutions) && this.searchDisabled == payload.searchDisabled && this.featuredInstitutionsDuration == payload.featuredInstitutionsDuration;
        }

        public final int hashCode() {
            return Long.hashCode(this.featuredInstitutionsDuration) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.featuredInstitutions.hashCode() * 31, 31, this.searchDisabled);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(featuredInstitutions=");
            sb.append(this.featuredInstitutions);
            sb.append(", searchDisabled=");
            sb.append(this.searchDisabled);
            sb.append(", featuredInstitutionsDuration=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.featuredInstitutionsDuration, ")", sb);
        }
    }

    public InstitutionPickerState(String str, Async async, Async async2, Async async3, FinancialConnectionsSessionManifest.Pane pane) {
        async.getClass();
        async2.getClass();
        async3.getClass();
        this.selectedInstitutionId = str;
        this.payload = async;
        this.searchInstitutions = async2;
        this.createSessionForInstitution = async3;
        this.referrer = pane;
    }

    public static InstitutionPickerState copy$default(InstitutionPickerState institutionPickerState, String str, Async async, Async async2, Async async3, int i) {
        institutionPickerState.getClass();
        if ((i & 2) != 0) {
            str = institutionPickerState.selectedInstitutionId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            async = institutionPickerState.payload;
        }
        Async async4 = async;
        if ((i & 8) != 0) {
            async2 = institutionPickerState.searchInstitutions;
        }
        Async async5 = async2;
        if ((i & 16) != 0) {
            async3 = institutionPickerState.createSessionForInstitution;
        }
        Async async6 = async3;
        FinancialConnectionsSessionManifest.Pane pane = institutionPickerState.referrer;
        institutionPickerState.getClass();
        async4.getClass();
        async5.getClass();
        async6.getClass();
        return new InstitutionPickerState(str2, async4, async5, async6, pane);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstitutionPickerState)) {
            return false;
        }
        InstitutionPickerState institutionPickerState = (InstitutionPickerState) obj;
        return Intrinsics.areEqual(this.selectedInstitutionId, institutionPickerState.selectedInstitutionId) && Intrinsics.areEqual(this.payload, institutionPickerState.payload) && Intrinsics.areEqual(this.searchInstitutions, institutionPickerState.searchInstitutions) && Intrinsics.areEqual(this.createSessionForInstitution, institutionPickerState.createSessionForInstitution) && this.referrer == institutionPickerState.referrer;
    }

    public final int hashCode() {
        String str = this.selectedInstitutionId;
        int hashCode = (this.createSessionForInstitution.hashCode() + ((this.searchInstitutions.hashCode() + ((this.payload.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        return hashCode + (pane != null ? pane.hashCode() : 0);
    }

    public final String toString() {
        return "InstitutionPickerState(previewText=null, selectedInstitutionId=" + this.selectedInstitutionId + ", payload=" + this.payload + ", searchInstitutions=" + this.searchInstitutions + ", createSessionForInstitution=" + this.createSessionForInstitution + ", referrer=" + this.referrer + ")";
    }
}
