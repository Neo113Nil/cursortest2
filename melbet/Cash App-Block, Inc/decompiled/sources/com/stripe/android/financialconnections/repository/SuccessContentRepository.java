package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.text.Text;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SuccessContentRepository extends Text.TextBase {

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new ServerLink.Creator(27);
        public final TextResource heading;
        public final TextResource message;

        public State(TextResource textResource, TextResource textResource2) {
            this.message = textResource;
            this.heading = textResource2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.message, state.message) && Intrinsics.areEqual(this.heading, state.heading);
        }

        public final int hashCode() {
            TextResource textResource = this.message;
            int hashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
            TextResource textResource2 = this.heading;
            return hashCode + (textResource2 != null ? textResource2.hashCode() : 0);
        }

        public final String toString() {
            return "State(message=" + this.message + ", heading=" + this.heading + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.message, i);
            parcel.writeParcelable(this.heading, i);
        }
    }
}
