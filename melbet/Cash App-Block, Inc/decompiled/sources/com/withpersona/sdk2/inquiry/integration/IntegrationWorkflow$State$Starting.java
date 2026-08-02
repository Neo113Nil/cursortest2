package com.withpersona.sdk2.inquiry.integration;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class IntegrationWorkflow$State$Starting extends SimpleWorkflowState {
    public static final Parcelable.Creator<IntegrationWorkflow$State$Starting> CREATOR = new RawExtraction.Creator(29);
    public final IntegrationWorkflow$PendingAction$OpenBrowser pendingAction;

    public IntegrationWorkflow$State$Starting(IntegrationWorkflow$PendingAction$OpenBrowser integrationWorkflow$PendingAction$OpenBrowser) {
        this.pendingAction = integrationWorkflow$PendingAction$OpenBrowser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntegrationWorkflow$State$Starting) && Intrinsics.areEqual(this.pendingAction, ((IntegrationWorkflow$State$Starting) obj).pendingAction);
    }

    public final int hashCode() {
        IntegrationWorkflow$PendingAction$OpenBrowser integrationWorkflow$PendingAction$OpenBrowser = this.pendingAction;
        if (integrationWorkflow$PendingAction$OpenBrowser == null) {
            return 0;
        }
        integrationWorkflow$PendingAction$OpenBrowser.getClass();
        return 2035883520;
    }

    public final String toString() {
        return "Starting(pendingAction=" + this.pendingAction + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.pendingAction, i);
    }
}
