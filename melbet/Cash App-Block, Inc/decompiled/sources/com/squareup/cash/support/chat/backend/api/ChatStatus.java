package com.squareup.cash.support.chat.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.support.backend.api.activities.Amount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ChatStatus extends Parcelable {

    public final class Enabled implements ChatStatus {
        public static final Parcelable.Creator<Enabled> CREATOR = new Amount.Creator(3);
        public final String availabilitySubtitle;
        public final boolean hasActiveChat;
        public final List ignoredPhrases;
        public final boolean online;

        public Enabled(String str, List list, boolean z, boolean z2) {
            list.getClass();
            this.online = z;
            this.hasActiveChat = z2;
            this.ignoredPhrases = list;
            this.availabilitySubtitle = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj;
            return this.online == enabled.online && this.hasActiveChat == enabled.hasActiveChat && Intrinsics.areEqual(this.ignoredPhrases, enabled.ignoredPhrases) && Intrinsics.areEqual(this.availabilitySubtitle, enabled.availabilitySubtitle);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.online) * 31, 31, this.hasActiveChat), 31, this.ignoredPhrases);
            String str = this.availabilitySubtitle;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Enabled(online=", ", hasActiveChat=", ", ignoredPhrases=", this.online, this.hasActiveChat);
            m.append(this.ignoredPhrases);
            m.append(", availabilitySubtitle=");
            m.append(this.availabilitySubtitle);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.online ? 1 : 0);
            parcel.writeInt(this.hasActiveChat ? 1 : 0);
            parcel.writeStringList(this.ignoredPhrases);
            parcel.writeString(this.availabilitySubtitle);
        }
    }

    public final class FeatureDisabled implements ChatStatus {
        public static final FeatureDisabled INSTANCE = new FeatureDisabled();
        public static final Parcelable.Creator<FeatureDisabled> CREATOR = new Amount.Creator(4);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FeatureDisabled);
        }

        public final int hashCode() {
            return 1116110337;
        }

        public final String toString() {
            return "FeatureDisabled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
