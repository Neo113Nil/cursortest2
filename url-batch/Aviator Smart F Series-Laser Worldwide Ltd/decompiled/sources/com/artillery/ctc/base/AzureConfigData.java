package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AzureConfigData implements Parcelable {
    public static final Parcelable.Creator<AzureConfigData> CREATOR = new a();
    private final String area;
    private final String azureApiKey;
    private final String endpoint;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final AzureConfigData createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new AzureConfigData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AzureConfigData[] newArray(int i8) {
            return new AzureConfigData[i8];
        }
    }

    public AzureConfigData(String azureApiKey, String area, String endpoint) {
        s.checkNotNullParameter(azureApiKey, "azureApiKey");
        s.checkNotNullParameter(area, "area");
        s.checkNotNullParameter(endpoint, "endpoint");
        this.azureApiKey = azureApiKey;
        this.area = area;
        this.endpoint = endpoint;
    }

    public static /* synthetic */ AzureConfigData copy$default(AzureConfigData azureConfigData, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = azureConfigData.azureApiKey;
        }
        if ((i8 & 2) != 0) {
            str2 = azureConfigData.area;
        }
        if ((i8 & 4) != 0) {
            str3 = azureConfigData.endpoint;
        }
        return azureConfigData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.azureApiKey;
    }

    public final String component2() {
        return this.area;
    }

    public final String component3() {
        return this.endpoint;
    }

    public final AzureConfigData copy(String azureApiKey, String area, String endpoint) {
        s.checkNotNullParameter(azureApiKey, "azureApiKey");
        s.checkNotNullParameter(area, "area");
        s.checkNotNullParameter(endpoint, "endpoint");
        return new AzureConfigData(azureApiKey, area, endpoint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AzureConfigData)) {
            return false;
        }
        AzureConfigData azureConfigData = (AzureConfigData) obj;
        return s.areEqual(this.azureApiKey, azureConfigData.azureApiKey) && s.areEqual(this.area, azureConfigData.area) && s.areEqual(this.endpoint, azureConfigData.endpoint);
    }

    public final String getArea() {
        return this.area;
    }

    public final String getAzureApiKey() {
        return this.azureApiKey;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public int hashCode() {
        return (((this.azureApiKey.hashCode() * 31) + this.area.hashCode()) * 31) + this.endpoint.hashCode();
    }

    public String toString() {
        return "AzureConfigData(azureApiKey=" + this.azureApiKey + ", area=" + this.area + ", endpoint=" + this.endpoint + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.azureApiKey);
        out.writeString(this.area);
        out.writeString(this.endpoint);
    }
}
