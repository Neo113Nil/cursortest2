package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import defpackage.gj2;
import defpackage.in1;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Tournament implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);

    @gj2("tournament_end_time")
    public String endTime;

    @gj2("id")
    public final String identifier;

    @gj2(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD)
    public final String payload;

    @gj2(SDKConstants.PARAM_TOURNAMENTS_TITLE)
    public final String title;

    public Tournament(String str, String str2, String str3, String str4) {
        str.getClass();
        this.identifier = str;
        this.endTime = str2;
        this.title = str3;
        this.payload = str4;
        setExpiration(str2 != null ? DateFormatter.INSTANCE.format$facebook_gamingservices_release(str2) : null);
    }

    private final void setExpiration(ZonedDateTime zonedDateTime) {
        if (Build.VERSION.SDK_INT < 26 || zonedDateTime == null) {
            return;
        }
        this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        setExpiration(zonedDateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ZonedDateTime getExpiration() {
        String str = this.endTime;
        if (str != null) {
            return DateFormatter.INSTANCE.format$facebook_gamingservices_release(str);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.identifier);
        parcel.writeString(this.endTime);
        parcel.writeString(this.title);
        parcel.writeString(this.payload);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CREATOR implements Parcelable.Creator<Tournament> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournament createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Tournament(parcel);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournament[] newArray(int i) {
            return new Tournament[i];
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<Tournament, Builder> {
        private String endTime;
        private ZonedDateTime expiration;
        private String identifier;
        private String payload;
        private String title;

        public /* synthetic */ Builder(String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : zonedDateTime, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.identifier;
            }
            if ((i & 2) != 0) {
                zonedDateTime = builder.expiration;
            }
            if ((i & 4) != 0) {
                str2 = builder.title;
            }
            if ((i & 8) != 0) {
                str3 = builder.payload;
            }
            return builder.copy(str, zonedDateTime, str2, str3);
        }

        @Override // com.facebook.share.ShareBuilder
        public Tournament build() {
            return new Tournament(this.identifier, this.endTime, this.title, this.payload);
        }

        public final String component1() {
            return this.identifier;
        }

        public final ZonedDateTime component2() {
            return this.expiration;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.payload;
        }

        public final Builder copy(String str, ZonedDateTime zonedDateTime, String str2, String str3) {
            str.getClass();
            return new Builder(str, zonedDateTime, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return Intrinsics.b(this.identifier, builder.identifier) && Intrinsics.b(this.expiration, builder.expiration) && Intrinsics.b(this.title, builder.title) && Intrinsics.b(this.payload, builder.payload);
        }

        public final Builder expiration(ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
            if (Build.VERSION.SDK_INT >= 26 && zonedDateTime != null) {
                this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
            }
            return this;
        }

        public final String getEndTime() {
            return this.endTime;
        }

        public final ZonedDateTime getExpiration() {
            return this.expiration;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.identifier.hashCode() * 31;
            ZonedDateTime zonedDateTime = this.expiration;
            int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.payload;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final Builder identifier(String str) {
            str.getClass();
            this.identifier = str;
            return this;
        }

        public final Builder payload(String str) {
            this.payload = str;
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(Tournament tournament) {
            Builder payload;
            return (tournament == null || (payload = identifier(tournament.identifier).expiration(tournament.getExpiration()).title(tournament.title).payload(tournament.payload)) == null) ? this : payload;
        }

        public final void setEndTime(String str) {
            this.endTime = str;
        }

        public final void setExpiration(ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
        }

        public final void setIdentifier(String str) {
            str.getClass();
            this.identifier = str;
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder(identifier=");
            sb.append(this.identifier);
            sb.append(", expiration=");
            sb.append(this.expiration);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", payload=");
            return in1.m(sb, this.payload, ')');
        }

        public Builder(String str, ZonedDateTime zonedDateTime, String str2, String str3) {
            str.getClass();
            this.identifier = str;
            this.expiration = zonedDateTime;
            this.title = str2;
            this.payload = str3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tournament(Parcel parcel) {
        this(parcel.toString(), parcel.toString(), parcel.toString(), parcel.toString());
        parcel.getClass();
    }
}
