package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AzureConfigResult implements Parcelable {
    public static final Parcelable.Creator<AzureConfigResult> CREATOR = new a();
    private final String message;
    private final AzureConfigData rows;
    private final String status;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final AzureConfigResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new AzureConfigResult(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AzureConfigData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AzureConfigResult[] newArray(int i8) {
            return new AzureConfigResult[i8];
        }
    }

    public AzureConfigResult(String status, String str, AzureConfigData azureConfigData) {
        s.checkNotNullParameter(status, "status");
        this.status = status;
        this.message = str;
        this.rows = azureConfigData;
    }

    public static /* synthetic */ AzureConfigResult copy$default(AzureConfigResult azureConfigResult, String str, String str2, AzureConfigData azureConfigData, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = azureConfigResult.status;
        }
        if ((i8 & 2) != 0) {
            str2 = azureConfigResult.message;
        }
        if ((i8 & 4) != 0) {
            azureConfigData = azureConfigResult.rows;
        }
        return azureConfigResult.copy(str, str2, azureConfigData);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final AzureConfigData component3() {
        return this.rows;
    }

    public final AzureConfigResult copy(String status, String str, AzureConfigData azureConfigData) {
        s.checkNotNullParameter(status, "status");
        return new AzureConfigResult(status, str, azureConfigData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AzureConfigResult)) {
            return false;
        }
        AzureConfigResult azureConfigResult = (AzureConfigResult) obj;
        return s.areEqual(this.status, azureConfigResult.status) && s.areEqual(this.message, azureConfigResult.message) && s.areEqual(this.rows, azureConfigResult.rows);
    }

    public final String getMessage() {
        return this.message;
    }

    public final AzureConfigData getRows() {
        return this.rows;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AzureConfigData azureConfigData = this.rows;
        return hashCode2 + (azureConfigData != null ? azureConfigData.hashCode() : 0);
    }

    public String toString() {
        return "AzureConfigResult(status=" + this.status + ", message=" + this.message + ", rows=" + this.rows + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.status);
        out.writeString(this.message);
        AzureConfigData azureConfigData = this.rows;
        if (azureConfigData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            azureConfigData.writeToParcel(out, i8);
        }
    }
}
