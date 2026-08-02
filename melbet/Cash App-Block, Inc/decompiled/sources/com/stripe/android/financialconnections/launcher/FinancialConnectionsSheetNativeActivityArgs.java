package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeActivityArgs implements Parcelable {
    public static final Parcelable.Creator<FinancialConnectionsSheetNativeActivityArgs> CREATOR = new Country.Creator(24);
    public final FinancialConnectionsSheetConfiguration configuration;
    public final ElementsSessionContext elementsSessionContext;
    public final FinancialConnectionsSheetFlowType flowType;
    public final SynchronizeSessionResponse initialSyncResponse;

    public FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SynchronizeSessionResponse synchronizeSessionResponse, ElementsSessionContext elementsSessionContext) {
        financialConnectionsSheetFlowType.getClass();
        financialConnectionsSheetConfiguration.getClass();
        synchronizeSessionResponse.getClass();
        this.flowType = financialConnectionsSheetFlowType;
        this.configuration = financialConnectionsSheetConfiguration;
        this.initialSyncResponse = synchronizeSessionResponse;
        this.elementsSessionContext = elementsSessionContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSheetNativeActivityArgs)) {
            return false;
        }
        FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) obj;
        return this.flowType == financialConnectionsSheetNativeActivityArgs.flowType && Intrinsics.areEqual(this.configuration, financialConnectionsSheetNativeActivityArgs.configuration) && Intrinsics.areEqual(this.initialSyncResponse, financialConnectionsSheetNativeActivityArgs.initialSyncResponse) && Intrinsics.areEqual(this.elementsSessionContext, financialConnectionsSheetNativeActivityArgs.elementsSessionContext);
    }

    public final int hashCode() {
        int hashCode = (this.initialSyncResponse.hashCode() + ((this.configuration.hashCode() + (this.flowType.hashCode() * 31)) * 31)) * 31;
        ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return hashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
    }

    public final String toString() {
        return "FinancialConnectionsSheetNativeActivityArgs(flowType=" + this.flowType + ", configuration=" + this.configuration + ", initialSyncResponse=" + this.initialSyncResponse + ", elementsSessionContext=" + this.elementsSessionContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.flowType.name());
        parcel.writeParcelable(this.configuration, i);
        this.initialSyncResponse.writeToParcel(parcel, i);
        parcel.writeParcelable(this.elementsSessionContext, i);
    }
}
