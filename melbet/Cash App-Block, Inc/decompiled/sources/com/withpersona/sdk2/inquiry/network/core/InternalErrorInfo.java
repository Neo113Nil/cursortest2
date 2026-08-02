package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class InternalErrorInfo implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final JsonAdapter fallbackAdapter = new JsonAdapter() { // from class: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$Companion$fallbackAdapter$1
        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            jsonReader.beginObject();
            jsonReader.endObject();
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, Object obj) {
            jsonWriter.beginObject().name("message").value("Error with class '" + (obj != null ? obj.getClass().getCanonicalName() : null) + "' does not have a json adapter registered.").endObject();
        }
    }.nullSafe();

    public /* synthetic */ InternalErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JsonClass(generateAdapter = true)
    public static final class CameraErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<CameraErrorInfo> CREATOR = new Creator();
        private final String message;

        public CameraErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ CameraErrorInfo copy$default(CameraErrorInfo cameraErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cameraErrorInfo.message;
            }
            return cameraErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final CameraErrorInfo copy(String str) {
            return new CameraErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraErrorInfo) && Intrinsics.areEqual(this.message, ((CameraErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CameraErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<CameraErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo createFromParcel(Parcel parcel) {
                return new CameraErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo[] newArray(int i) {
                return new CameraErrorInfo[i];
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JsonAdapter.Factory createAdapter() {
            List list = Collections.EMPTY_LIST;
            if (list.contains("network")) {
                a$$ExternalSyntheticBUOutline0.m$3("Labels must be unique.");
                return null;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.add("network");
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.add(NetworkErrorInfo.class);
            return new PolymorphicJsonAdapterFactory(InternalErrorInfo.class, "type", arrayList, arrayList2, null).withSubtype(IntegrationErrorInfo.class, "integration").withSubtype(PermissionErrorInfo.class, "permission").withSubtype(CameraErrorInfo.class, "camera").withSubtype(ConfigurationErrorInfo.class, BreadcrumbHelper.Category.CONFIGURATION).withSubtype(InvalidOneTimeLinkCode.class, "one_time_link_code").withSubtype(UnknownErrorInfo.class, "unknown").withFallbackJsonAdapter(InternalErrorInfo.fallbackAdapter);
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class ConfigurationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<ConfigurationErrorInfo> CREATOR = new Creator();
        private final String message;

        public ConfigurationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ ConfigurationErrorInfo copy$default(ConfigurationErrorInfo configurationErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configurationErrorInfo.message;
            }
            return configurationErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ConfigurationErrorInfo copy(String str) {
            return new ConfigurationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigurationErrorInfo) && Intrinsics.areEqual(this.message, ((ConfigurationErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfigurationErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<ConfigurationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo createFromParcel(Parcel parcel) {
                return new ConfigurationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo[] newArray(int i) {
                return new ConfigurationErrorInfo[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class IntegrationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<IntegrationErrorInfo> CREATOR = new Creator();
        private final String message;

        public IntegrationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ IntegrationErrorInfo copy$default(IntegrationErrorInfo integrationErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = integrationErrorInfo.message;
            }
            return integrationErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final IntegrationErrorInfo copy(String str) {
            return new IntegrationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntegrationErrorInfo) && Intrinsics.areEqual(this.message, ((IntegrationErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IntegrationErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<IntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new IntegrationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo[] newArray(int i) {
                return new IntegrationErrorInfo[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class InvalidOneTimeLinkCode extends InternalErrorInfo {
        public static final Parcelable.Creator<InvalidOneTimeLinkCode> CREATOR = new Creator();
        private final String oneTimeLinkCode;

        public InvalidOneTimeLinkCode(String str) {
            super(null);
            this.oneTimeLinkCode = str;
        }

        public static /* synthetic */ InvalidOneTimeLinkCode copy$default(InvalidOneTimeLinkCode invalidOneTimeLinkCode, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidOneTimeLinkCode.oneTimeLinkCode;
            }
            return invalidOneTimeLinkCode.copy(str);
        }

        public final String component1() {
            return this.oneTimeLinkCode;
        }

        public final InvalidOneTimeLinkCode copy(String str) {
            return new InvalidOneTimeLinkCode(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidOneTimeLinkCode) && Intrinsics.areEqual(this.oneTimeLinkCode, ((InvalidOneTimeLinkCode) obj).oneTimeLinkCode);
        }

        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        public int hashCode() {
            return this.oneTimeLinkCode.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvalidOneTimeLinkCode(oneTimeLinkCode=", this.oneTimeLinkCode, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.oneTimeLinkCode);
        }

        public static final class Creator implements Parcelable.Creator<InvalidOneTimeLinkCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode createFromParcel(Parcel parcel) {
                return new InvalidOneTimeLinkCode(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode[] newArray(int i) {
                return new InvalidOneTimeLinkCode[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class NetworkErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<NetworkErrorInfo> CREATOR = new Creator();
        private final int code;
        private final boolean isRecoverable;
        private final String message;
        private final ErrorResponse.Error responseError;

        public NetworkErrorInfo(int i, String str, boolean z, ErrorResponse.Error error) {
            super(null);
            this.code = i;
            this.message = str;
            this.isRecoverable = z;
            this.responseError = error;
        }

        public static /* synthetic */ NetworkErrorInfo copy$default(NetworkErrorInfo networkErrorInfo, int i, String str, boolean z, ErrorResponse.Error error, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = networkErrorInfo.code;
            }
            if ((i2 & 2) != 0) {
                str = networkErrorInfo.message;
            }
            if ((i2 & 4) != 0) {
                z = networkErrorInfo.isRecoverable;
            }
            if ((i2 & 8) != 0) {
                error = networkErrorInfo.responseError;
            }
            return networkErrorInfo.copy(i, str, z, error);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final boolean component3() {
            return this.isRecoverable;
        }

        public final ErrorResponse.Error component4() {
            return this.responseError;
        }

        public final NetworkErrorInfo copy(int i, String str, boolean z, ErrorResponse.Error error) {
            return new NetworkErrorInfo(i, str, z, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkErrorInfo)) {
                return false;
            }
            NetworkErrorInfo networkErrorInfo = (NetworkErrorInfo) obj;
            return this.code == networkErrorInfo.code && Intrinsics.areEqual(this.message, networkErrorInfo.message) && this.isRecoverable == networkErrorInfo.isRecoverable && Intrinsics.areEqual(this.responseError, networkErrorInfo.responseError);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final ErrorResponse.Error getResponseError() {
            return this.responseError;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.code) * 31;
            String str = this.message;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isRecoverable);
            ErrorResponse.Error error = this.responseError;
            return m + (error != null ? error.hashCode() : 0);
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public String toString() {
            int i = this.code;
            String str = this.message;
            boolean z = this.isRecoverable;
            ErrorResponse.Error error = this.responseError;
            StringBuilder m = re$$ExternalSyntheticOutline0.m("NetworkErrorInfo(code=", i, ", message=", str, ", isRecoverable=");
            m.append(z);
            m.append(", responseError=");
            m.append(error);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.code);
            parcel.writeString(this.message);
            parcel.writeInt(this.isRecoverable ? 1 : 0);
            parcel.writeParcelable(this.responseError, i);
        }

        public static final class Creator implements Parcelable.Creator<NetworkErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo createFromParcel(Parcel parcel) {
                return new NetworkErrorInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (ErrorResponse.Error) parcel.readParcelable(NetworkErrorInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo[] newArray(int i) {
                return new NetworkErrorInfo[i];
            }
        }

        public /* synthetic */ NetworkErrorInfo(int i, String str, boolean z, ErrorResponse.Error error, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, z, (i2 & 8) != 0 ? null : error);
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class NoDiskSpaceErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<NoDiskSpaceErrorInfo> CREATOR = new Creator();
        private final String message;

        public /* synthetic */ NoDiskSpaceErrorInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "No disk space available." : str);
        }

        public static /* synthetic */ NoDiskSpaceErrorInfo copy$default(NoDiskSpaceErrorInfo noDiskSpaceErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noDiskSpaceErrorInfo.message;
            }
            return noDiskSpaceErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final NoDiskSpaceErrorInfo copy(String str) {
            return new NoDiskSpaceErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoDiskSpaceErrorInfo) && Intrinsics.areEqual(this.message, ((NoDiskSpaceErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoDiskSpaceErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<NoDiskSpaceErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo createFromParcel(Parcel parcel) {
                return new NoDiskSpaceErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo[] newArray(int i) {
                return new NoDiskSpaceErrorInfo[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoDiskSpaceErrorInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public NoDiskSpaceErrorInfo(String str) {
            super(null);
            this.message = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class PermissionErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<PermissionErrorInfo> CREATOR = new Creator();
        private final String message;

        public PermissionErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ PermissionErrorInfo copy$default(PermissionErrorInfo permissionErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = permissionErrorInfo.message;
            }
            return permissionErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final PermissionErrorInfo copy(String str) {
            return new PermissionErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionErrorInfo) && Intrinsics.areEqual(this.message, ((PermissionErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PermissionErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<PermissionErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo createFromParcel(Parcel parcel) {
                return new PermissionErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo[] newArray(int i) {
                return new PermissionErrorInfo[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UnknownErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<UnknownErrorInfo> CREATOR = new Creator();
        private final String message;

        public UnknownErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ UnknownErrorInfo copy$default(UnknownErrorInfo unknownErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownErrorInfo.message;
            }
            return unknownErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UnknownErrorInfo copy(String str) {
            return new UnknownErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownErrorInfo) && Intrinsics.areEqual(this.message, ((UnknownErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnknownErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<UnknownErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo createFromParcel(Parcel parcel) {
                return new UnknownErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo[] newArray(int i) {
                return new UnknownErrorInfo[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class WebRtcIntegrationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<WebRtcIntegrationErrorInfo> CREATOR = new Creator();
        private final String message;

        public WebRtcIntegrationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ WebRtcIntegrationErrorInfo copy$default(WebRtcIntegrationErrorInfo webRtcIntegrationErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webRtcIntegrationErrorInfo.message;
            }
            return webRtcIntegrationErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final WebRtcIntegrationErrorInfo copy(String str) {
            return new WebRtcIntegrationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebRtcIntegrationErrorInfo) && Intrinsics.areEqual(this.message, ((WebRtcIntegrationErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebRtcIntegrationErrorInfo(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<WebRtcIntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new WebRtcIntegrationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo[] newArray(int i) {
                return new WebRtcIntegrationErrorInfo[i];
            }
        }
    }

    private InternalErrorInfo() {
    }
}
