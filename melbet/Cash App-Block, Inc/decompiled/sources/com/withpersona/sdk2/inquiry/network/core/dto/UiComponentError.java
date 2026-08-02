package com.withpersona.sdk2.inquiry.network.core.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class UiComponentError implements Parcelable {
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ UiComponentError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    public abstract String getType();

    public static final class Companion extends JsonAdapter {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getJsonType(JsonReader jsonReader) {
            JsonReader peekJson = jsonReader.peekJson();
            peekJson.beginObject();
            while (peekJson.hasNext()) {
                if (Intrinsics.areEqual(peekJson.nextName(), "type")) {
                    return peekJson.nextString();
                }
                peekJson.skipValue();
            }
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public UiComponentError fromJson(JsonReader jsonReader) {
            Moshi moshi = new Moshi(new Moshi.Builder());
            String jsonType = getJsonType(jsonReader);
            if (jsonType == null) {
                return null;
            }
            int hashCode = jsonType.hashCode();
            if (hashCode != -816959144) {
                if (hashCode != -212588636) {
                    if (hashCode == 1658531967 && jsonType.equals(InputAddress.f1488type)) {
                        return (UiComponentError) moshi.adapter(UiInputAddressComponentError.class, Util.NO_ANNOTATIONS).fromJson(jsonReader);
                    }
                } else if (jsonType.equals(InputInternationalDb.f1495type)) {
                    return (UiComponentError) moshi.adapter(UiInputInternationalDbComponentError.class, Util.NO_ANNOTATIONS).fromJson(jsonReader);
                }
            } else if (jsonType.equals("gov_id_nfc")) {
                return (UiComponentError) moshi.adapter(UiGovernmentIdNfcScanComponentError.class, Util.NO_ANNOTATIONS).fromJson(jsonReader);
            }
            return (UiComponentError) moshi.adapter(UiInputComponentError.class, Util.NO_ANNOTATIONS).fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter jsonWriter, UiComponentError uiComponentError) {
            Moshi moshi = new Moshi(new Moshi.Builder());
            if (uiComponentError instanceof UiGovernmentIdNfcScanComponentError) {
                moshi.adapter(UiGovernmentIdNfcScanComponentError.class, Util.NO_ANNOTATIONS, null).toJson(jsonWriter, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputAddressComponentError) {
                moshi.adapter(UiInputAddressComponentError.class, Util.NO_ANNOTATIONS, null).toJson(jsonWriter, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputComponentError) {
                moshi.adapter(UiInputComponentError.class, Util.NO_ANNOTATIONS, null).toJson(jsonWriter, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputInternationalDbComponentError) {
                moshi.adapter(UiInputInternationalDbComponentError.class, Util.NO_ANNOTATIONS, null).toJson(jsonWriter, uiComponentError);
            } else if (uiComponentError == null) {
                jsonWriter.nullValue();
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiGovernmentIdNfcScanComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiGovernmentIdNfcScanComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f1459type;

        public UiGovernmentIdNfcScanComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.f1459type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiGovernmentIdNfcScanComponentError copy$default(UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiGovernmentIdNfcScanComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiGovernmentIdNfcScanComponentError.f1459type;
            }
            if ((i & 4) != 0) {
                map = uiGovernmentIdNfcScanComponentError.message;
            }
            return uiGovernmentIdNfcScanComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f1459type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiGovernmentIdNfcScanComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiGovernmentIdNfcScanComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiGovernmentIdNfcScanComponentError)) {
                return false;
            }
            UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiGovernmentIdNfcScanComponentError) obj;
            return Intrinsics.areEqual(this.name, uiGovernmentIdNfcScanComponentError.name) && Intrinsics.areEqual(this.f1459type, uiGovernmentIdNfcScanComponentError.f1459type) && Intrinsics.areEqual(this.message, uiGovernmentIdNfcScanComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f1459type;
        }

        public int hashCode() {
            return this.message.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.f1459type);
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.f1459type;
            return re$$ExternalSyntheticOutline0.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UiGovernmentIdNfcScanComponentError(name=", str, ", type=", str2, ", message="), this.message);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f1459type);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.message, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        public static final class Creator implements Parcelable.Creator<UiGovernmentIdNfcScanComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiGovernmentIdNfcScanComponentError(readString, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError[] newArray(int i) {
                return new UiGovernmentIdNfcScanComponentError[i];
            }
        }

        public /* synthetic */ UiGovernmentIdNfcScanComponentError(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "gov_id_nfc" : str2, map);
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiInputAddressComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputAddressComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f1460type;

        public UiInputAddressComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.f1460type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputAddressComponentError copy$default(UiInputAddressComponentError uiInputAddressComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputAddressComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputAddressComponentError.f1460type;
            }
            if ((i & 4) != 0) {
                map = uiInputAddressComponentError.message;
            }
            return uiInputAddressComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f1460type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputAddressComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiInputAddressComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputAddressComponentError)) {
                return false;
            }
            UiInputAddressComponentError uiInputAddressComponentError = (UiInputAddressComponentError) obj;
            return Intrinsics.areEqual(this.name, uiInputAddressComponentError.name) && Intrinsics.areEqual(this.f1460type, uiInputAddressComponentError.f1460type) && Intrinsics.areEqual(this.message, uiInputAddressComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f1460type;
        }

        public int hashCode() {
            return this.message.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.f1460type);
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.f1460type;
            return re$$ExternalSyntheticOutline0.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UiInputAddressComponentError(name=", str, ", type=", str2, ", message="), this.message);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f1460type);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.message, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        public static final class Creator implements Parcelable.Creator<UiInputAddressComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputAddressComponentError(readString, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError[] newArray(int i) {
                return new UiInputAddressComponentError[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiInputComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputComponentError> CREATOR = new Creator();
        private final String message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f1461type;

        public UiInputComponentError(String str, String str2, String str3) {
            super(null);
            this.name = str;
            this.f1461type = str2;
            this.message = str3;
        }

        public static /* synthetic */ UiInputComponentError copy$default(UiInputComponentError uiInputComponentError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputComponentError.f1461type;
            }
            if ((i & 4) != 0) {
                str3 = uiInputComponentError.message;
            }
            return uiInputComponentError.copy(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f1461type;
        }

        public final String component3() {
            return this.message;
        }

        public final UiInputComponentError copy(String str, String str2, String str3) {
            return new UiInputComponentError(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputComponentError)) {
                return false;
            }
            UiInputComponentError uiInputComponentError = (UiInputComponentError) obj;
            return Intrinsics.areEqual(this.name, uiInputComponentError.name) && Intrinsics.areEqual(this.f1461type, uiInputComponentError.f1461type) && Intrinsics.areEqual(this.message, uiInputComponentError.message);
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f1461type;
        }

        public int hashCode() {
            return this.message.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.f1461type);
        }

        public String toString() {
            String str = this.name;
            String str2 = this.f1461type;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UiInputComponentError(name=", str, ", type=", str2, ", message="), this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f1461type);
            parcel.writeString(this.message);
        }

        public static final class Creator implements Parcelable.Creator<UiInputComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError createFromParcel(Parcel parcel) {
                return new UiInputComponentError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError[] newArray(int i) {
                return new UiInputComponentError[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UiInputInternationalDbComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputInternationalDbComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;

        /* renamed from: type, reason: collision with root package name */
        private final String f1462type;

        public UiInputInternationalDbComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.f1462type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputInternationalDbComponentError copy$default(UiInputInternationalDbComponentError uiInputInternationalDbComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputInternationalDbComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputInternationalDbComponentError.f1462type;
            }
            if ((i & 4) != 0) {
                map = uiInputInternationalDbComponentError.message;
            }
            return uiInputInternationalDbComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.f1462type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputInternationalDbComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiInputInternationalDbComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputInternationalDbComponentError)) {
                return false;
            }
            UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiInputInternationalDbComponentError) obj;
            return Intrinsics.areEqual(this.name, uiInputInternationalDbComponentError.name) && Intrinsics.areEqual(this.f1462type, uiInputInternationalDbComponentError.f1462type) && Intrinsics.areEqual(this.message, uiInputInternationalDbComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.f1462type;
        }

        public int hashCode() {
            return this.message.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.f1462type);
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.f1462type;
            return re$$ExternalSyntheticOutline0.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UiInputInternationalDbComponentError(name=", str, ", type=", str2, ", message="), this.message);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.f1462type);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.message, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        public static final class Creator implements Parcelable.Creator<UiInputInternationalDbComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputInternationalDbComponentError(readString, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError[] newArray(int i) {
                return new UiInputInternationalDbComponentError[i];
            }
        }
    }

    private UiComponentError() {
    }
}
