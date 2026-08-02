package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.Text;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsErrorRepository extends Text.TextBase {

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new ServerLink.Creator(25);
        public final Throwable error;

        public State(Throwable th) {
            th.getClass();
            this.error = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.areEqual(this.error, ((State) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("State(error=", ")", this.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.error);
        }
    }
}
