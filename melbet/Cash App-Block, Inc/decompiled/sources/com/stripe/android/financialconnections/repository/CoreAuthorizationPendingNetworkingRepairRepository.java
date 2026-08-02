package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.google.mlkit.vision.text.Text;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.model.ServerLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CoreAuthorizationPendingNetworkingRepairRepository extends Text.TextBase {
    public final Logger$Companion$NOOP_LOGGER$1 logger;

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new ServerLink.Creator(24);
        public final String coreAuthorization;

        public State(String str) {
            str.getClass();
            this.coreAuthorization = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.areEqual(this.coreAuthorization, ((State) obj).coreAuthorization);
        }

        public final int hashCode() {
            return this.coreAuthorization.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("State(coreAuthorization=", this.coreAuthorization, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.coreAuthorization);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreAuthorizationPendingNetworkingRepairRepository(SavedStateHandle savedStateHandle, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(savedStateHandle);
        savedStateHandle.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.logger = logger$Companion$NOOP_LOGGER$1;
    }
}
