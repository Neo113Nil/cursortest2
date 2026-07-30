package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class HealthData implements Parcelable {
    public static final Parcelable.Creator<HealthData> CREATOR = new a();
    public List<Data> runningData;

    @Keep
    public static final class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new a();
        public String avgHeartRate;
        public String distance;
        public String maxHeartRate;
        public String minHeartRate;
        public String speed;
        public String steps;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i8) {
                return new Data[i8];
            }
        }

        public Data(String distance, String speed, String steps, String maxHeartRate, String minHeartRate, String avgHeartRate) {
            s.checkNotNullParameter(distance, "distance");
            s.checkNotNullParameter(speed, "speed");
            s.checkNotNullParameter(steps, "steps");
            s.checkNotNullParameter(maxHeartRate, "maxHeartRate");
            s.checkNotNullParameter(minHeartRate, "minHeartRate");
            s.checkNotNullParameter(avgHeartRate, "avgHeartRate");
            this.distance = distance;
            this.speed = speed;
            this.steps = steps;
            this.maxHeartRate = maxHeartRate;
            this.minHeartRate = minHeartRate;
            this.avgHeartRate = avgHeartRate;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = data.distance;
            }
            if ((i8 & 2) != 0) {
                str2 = data.speed;
            }
            String str7 = str2;
            if ((i8 & 4) != 0) {
                str3 = data.steps;
            }
            String str8 = str3;
            if ((i8 & 8) != 0) {
                str4 = data.maxHeartRate;
            }
            String str9 = str4;
            if ((i8 & 16) != 0) {
                str5 = data.minHeartRate;
            }
            String str10 = str5;
            if ((i8 & 32) != 0) {
                str6 = data.avgHeartRate;
            }
            return data.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.distance;
        }

        public final String component2() {
            return this.speed;
        }

        public final String component3() {
            return this.steps;
        }

        public final String component4() {
            return this.maxHeartRate;
        }

        public final String component5() {
            return this.minHeartRate;
        }

        public final String component6() {
            return this.avgHeartRate;
        }

        public final Data copy(String distance, String speed, String steps, String maxHeartRate, String minHeartRate, String avgHeartRate) {
            s.checkNotNullParameter(distance, "distance");
            s.checkNotNullParameter(speed, "speed");
            s.checkNotNullParameter(steps, "steps");
            s.checkNotNullParameter(maxHeartRate, "maxHeartRate");
            s.checkNotNullParameter(minHeartRate, "minHeartRate");
            s.checkNotNullParameter(avgHeartRate, "avgHeartRate");
            return new Data(distance, speed, steps, maxHeartRate, minHeartRate, avgHeartRate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return s.areEqual(this.distance, data.distance) && s.areEqual(this.speed, data.speed) && s.areEqual(this.steps, data.steps) && s.areEqual(this.maxHeartRate, data.maxHeartRate) && s.areEqual(this.minHeartRate, data.minHeartRate) && s.areEqual(this.avgHeartRate, data.avgHeartRate);
        }

        public int hashCode() {
            return (((((((((this.distance.hashCode() * 31) + this.speed.hashCode()) * 31) + this.steps.hashCode()) * 31) + this.maxHeartRate.hashCode()) * 31) + this.minHeartRate.hashCode()) * 31) + this.avgHeartRate.hashCode();
        }

        public String toString() {
            return "Data(distance=" + this.distance + ", speed=" + this.speed + ", steps=" + this.steps + ", maxHeartRate=" + this.maxHeartRate + ", minHeartRate=" + this.minHeartRate + ", avgHeartRate=" + this.avgHeartRate + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeString(this.distance);
            out.writeString(this.speed);
            out.writeString(this.steps);
            out.writeString(this.maxHeartRate);
            out.writeString(this.minHeartRate);
            out.writeString(this.avgHeartRate);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final HealthData createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(Data.CREATOR.createFromParcel(parcel));
            }
            return new HealthData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final HealthData[] newArray(int i8) {
            return new HealthData[i8];
        }
    }

    public HealthData(List<Data> runningData) {
        s.checkNotNullParameter(runningData, "runningData");
        this.runningData = runningData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthData copy$default(HealthData healthData, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = healthData.runningData;
        }
        return healthData.copy(list);
    }

    public final List<Data> component1() {
        return this.runningData;
    }

    public final HealthData copy(List<Data> runningData) {
        s.checkNotNullParameter(runningData, "runningData");
        return new HealthData(runningData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HealthData) && s.areEqual(this.runningData, ((HealthData) obj).runningData);
    }

    public int hashCode() {
        return this.runningData.hashCode();
    }

    public String toString() {
        return "HealthData(runningData=" + this.runningData + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        List<Data> list = this.runningData;
        out.writeInt(list.size());
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i8);
        }
    }
}
