package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.text.Text;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AccountUpdateRequiredContentRepository extends Text.TextBase {

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new ServerLink.Creator(21);
        public final NoticeSheetState.NoticeSheetContent.UpdateRequired payload;

        public State(NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired) {
            updateRequired.getClass();
            this.payload = updateRequired;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.areEqual(this.payload, ((State) obj).payload);
        }

        public final int hashCode() {
            return this.payload.hashCode();
        }

        public final String toString() {
            return "State(payload=" + this.payload + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.payload.writeToParcel(parcel, i);
        }
    }
}
