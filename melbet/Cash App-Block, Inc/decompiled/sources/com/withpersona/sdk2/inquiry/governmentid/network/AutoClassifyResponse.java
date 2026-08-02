package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* loaded from: classes9.dex */
public interface AutoClassifyResponse extends Parcelable {

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ClassificationFailedResponse implements AutoClassifyResponse {
        public static final Parcelable.Creator<ClassificationFailedResponse> CREATOR = new RawExtraction.Creator(16);
        public final List idClassesByCountries;

        public ClassificationFailedResponse(List list) {
            this.idClassesByCountries = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.idClassesByCountries, parcel);
            while (m.hasNext()) {
                ((IdClassesForCountry) m.next()).writeToParcel(parcel, i);
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class IdAcceptedResponse implements AutoClassifyResponse {
        public static final Parcelable.Creator<IdAcceptedResponse> CREATOR = new RawExtraction.Creator(17);
        public final String countryCode;
        public final String idClass;
        public final Id idConfig;

        public IdAcceptedResponse(String str, String str2, Id id) {
            str.getClass();
            str2.getClass();
            id.getClass();
            this.countryCode = str;
            this.idClass = str2;
            this.idConfig = id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.countryCode);
            parcel.writeString(this.idClass);
            parcel.writeParcelable(this.idConfig, i);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry", "Landroid/os/Parcelable;", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class IdClassesForCountry implements Parcelable {
        public static final Parcelable.Creator<IdClassesForCountry> CREATOR = new RawExtraction.Creator(18);
        public final String countryCode;
        public final String countryName;
        public final List idConfigs;

        public IdClassesForCountry(String str, String str2, List list) {
            str.getClass();
            str2.getClass();
            this.countryName = str;
            this.countryCode = str2;
            this.idConfigs = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.countryName);
            parcel.writeString(this.countryCode);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.idConfigs, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class IdRejectedResponse implements AutoClassifyResponse {
        public static final Parcelable.Creator<IdRejectedResponse> CREATOR = new RawExtraction.Creator(19);
        public final List idClassesByCountries;

        public IdRejectedResponse(List list) {
            this.idClassesByCountries = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.idClassesByCountries, parcel);
            while (m.hasNext()) {
                ((IdClassesForCountry) m.next()).writeToParcel(parcel, i);
            }
        }
    }

    public final class Unknown implements AutoClassifyResponse {
        public static final Unknown INSTANCE = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new RawExtraction.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return -402570646;
        }

        public final String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
