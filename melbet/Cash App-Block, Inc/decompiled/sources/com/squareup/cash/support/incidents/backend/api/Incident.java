package com.squareup.cash.support.incidents.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.support.backend.api.activities.Amount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Incident implements Parcelable {
    public static final Parcelable.Creator<Incident> CREATOR = new Amount.Creator(25);
    public final boolean canChangeSubscription;
    public final String details;
    public final String id;
    public final boolean isSubscribed;
    public final Status status;
    public final Instant timestamp;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status IDENTIFIED;
        public static final Status INVESTIGATING;
        public static final Status RESOLVED;
        public static final Status UNKNOWN;

        static {
            Status status = new Status("IDENTIFIED", 0);
            IDENTIFIED = status;
            Status status2 = new Status("INVESTIGATING", 1);
            INVESTIGATING = status2;
            Status status3 = new Status("RESOLVED", 2);
            RESOLVED = status3;
            Status status4 = new Status("UNKNOWN", 3);
            UNKNOWN = status4;
            $VALUES = new Status[]{status, status2, status3, status4};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public Incident(String str, String str2, String str3, Instant instant, boolean z, Status status, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        instant.getClass();
        status.getClass();
        this.id = str;
        this.title = str2;
        this.details = str3;
        this.timestamp = instant;
        this.isSubscribed = z;
        this.status = status;
        this.canChangeSubscription = z2;
    }

    public static Incident copy$default(Incident incident, boolean z) {
        String str = incident.id;
        String str2 = incident.title;
        String str3 = incident.details;
        Instant instant = incident.timestamp;
        Status status = incident.status;
        boolean z2 = incident.canChangeSubscription;
        incident.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        instant.getClass();
        status.getClass();
        return new Incident(str, str2, str3, instant, z, status, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Incident)) {
            return false;
        }
        Incident incident = (Incident) obj;
        return Intrinsics.areEqual(this.id, incident.id) && Intrinsics.areEqual(this.title, incident.title) && Intrinsics.areEqual(this.details, incident.details) && Intrinsics.areEqual(this.timestamp, incident.timestamp) && this.isSubscribed == incident.isSubscribed && this.status == incident.status && this.canChangeSubscription == incident.canChangeSubscription;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canChangeSubscription) + ((this.status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.timestamp.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.details)) * 31, 31, this.isSubscribed)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Incident(id=", this.id, ", title=", this.title, ", details=");
        m.append(this.details);
        m.append(", timestamp=");
        m.append(this.timestamp);
        m.append(", isSubscribed=");
        m.append(this.isSubscribed);
        m.append(", status=");
        m.append(this.status);
        m.append(", canChangeSubscription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.canChangeSubscription, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.details);
        parcel.writeSerializable(this.timestamp);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        parcel.writeString(this.status.name());
        parcel.writeInt(this.canChangeSubscription ? 1 : 0);
    }
}
