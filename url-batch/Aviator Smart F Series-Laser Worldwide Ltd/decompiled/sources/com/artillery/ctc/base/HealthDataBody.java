package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class HealthDataBody implements Parcelable, BaseCat {
    public static final Parcelable.Creator<HealthDataBody> CREATOR = new a();
    public String analyseType;
    public HealthData data;
    public String deviceId;
    public String tid;
    public int type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final HealthDataBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new HealthDataBody(parcel.readInt(), parcel.readString(), parcel.readString(), HealthData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HealthDataBody[] newArray(int i8) {
            return new HealthDataBody[i8];
        }
    }

    public HealthDataBody(int i8, String deviceId, String analyseType, HealthData data, String tid) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(analyseType, "analyseType");
        s.checkNotNullParameter(data, "data");
        s.checkNotNullParameter(tid, "tid");
        this.type = i8;
        this.deviceId = deviceId;
        this.analyseType = analyseType;
        this.data = data;
        this.tid = tid;
    }

    public static /* synthetic */ HealthDataBody copy$default(HealthDataBody healthDataBody, int i8, String str, String str2, HealthData healthData, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = healthDataBody.type;
        }
        if ((i9 & 2) != 0) {
            str = healthDataBody.deviceId;
        }
        String str4 = str;
        if ((i9 & 4) != 0) {
            str2 = healthDataBody.analyseType;
        }
        String str5 = str2;
        if ((i9 & 8) != 0) {
            healthData = healthDataBody.data;
        }
        HealthData healthData2 = healthData;
        if ((i9 & 16) != 0) {
            str3 = healthDataBody.tid;
        }
        return healthDataBody.copy(i8, str4, str5, healthData2, str3);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.analyseType;
    }

    public final HealthData component4() {
        return this.data;
    }

    public final String component5() {
        return this.tid;
    }

    public final HealthDataBody copy(int i8, String deviceId, String analyseType, HealthData data, String tid) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(analyseType, "analyseType");
        s.checkNotNullParameter(data, "data");
        s.checkNotNullParameter(tid, "tid");
        return new HealthDataBody(i8, deviceId, analyseType, data, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthDataBody)) {
            return false;
        }
        HealthDataBody healthDataBody = (HealthDataBody) obj;
        return this.type == healthDataBody.type && s.areEqual(this.deviceId, healthDataBody.deviceId) && s.areEqual(this.analyseType, healthDataBody.analyseType) && s.areEqual(this.data, healthDataBody.data) && s.areEqual(this.tid, healthDataBody.tid);
    }

    @Override // com.artillery.ctc.base.BaseCat
    public int getCatType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.type * 31) + this.deviceId.hashCode()) * 31) + this.analyseType.hashCode()) * 31) + this.data.hashCode()) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "HealthDataBody(type=" + this.type + ", deviceId=" + this.deviceId + ", analyseType=" + this.analyseType + ", data=" + this.data + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeInt(this.type);
        out.writeString(this.deviceId);
        out.writeString(this.analyseType);
        this.data.writeToParcel(out, i8);
        out.writeString(this.tid);
    }

    public /* synthetic */ HealthDataBody(int i8, String str, String str2, HealthData healthData, String str3, int i9, o oVar) {
        this((i9 & 1) != 0 ? 3 : i8, str, str2, healthData, (i9 & 16) != 0 ? "" : str3);
    }
}
