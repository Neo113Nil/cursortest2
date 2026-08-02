package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.text.Text;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NoticeSheetContentRepository extends Text.TextBase {

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new ServerLink.Creator(26);
        public final NoticeSheetState.NoticeSheetContent content;

        public State(NoticeSheetState.NoticeSheetContent noticeSheetContent) {
            this.content = noticeSheetContent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.areEqual(this.content, ((State) obj).content);
        }

        public final int hashCode() {
            NoticeSheetState.NoticeSheetContent noticeSheetContent = this.content;
            if (noticeSheetContent == null) {
                return 0;
            }
            return noticeSheetContent.hashCode();
        }

        public final String toString() {
            return "State(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.content, i);
        }
    }
}
