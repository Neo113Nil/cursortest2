package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class HealthQABody implements Parcelable, BaseCat {
    public static final Parcelable.Creator<HealthQABody> CREATOR = new a();
    public String deviceId;
    public Map<String, String> info;
    public String query;
    public String tid;
    public int type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final HealthQABody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new HealthQABody(readString, readString2, linkedHashMap, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HealthQABody[] newArray(int i8) {
            return new HealthQABody[i8];
        }
    }

    public HealthQABody(String deviceId, String query, Map<String, String> info, int i8, String tid) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(query, "query");
        s.checkNotNullParameter(info, "info");
        s.checkNotNullParameter(tid, "tid");
        this.deviceId = deviceId;
        this.query = query;
        this.info = info;
        this.type = i8;
        this.tid = tid;
    }

    public static /* synthetic */ HealthQABody copy$default(HealthQABody healthQABody, String str, String str2, Map map, int i8, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = healthQABody.deviceId;
        }
        if ((i9 & 2) != 0) {
            str2 = healthQABody.query;
        }
        String str4 = str2;
        if ((i9 & 4) != 0) {
            map = healthQABody.info;
        }
        Map map2 = map;
        if ((i9 & 8) != 0) {
            i8 = healthQABody.type;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            str3 = healthQABody.tid;
        }
        return healthQABody.copy(str, str4, map2, i10, str3);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.query;
    }

    public final Map<String, String> component3() {
        return this.info;
    }

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.tid;
    }

    public final HealthQABody copy(String deviceId, String query, Map<String, String> info, int i8, String tid) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(query, "query");
        s.checkNotNullParameter(info, "info");
        s.checkNotNullParameter(tid, "tid");
        return new HealthQABody(deviceId, query, info, i8, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthQABody)) {
            return false;
        }
        HealthQABody healthQABody = (HealthQABody) obj;
        return s.areEqual(this.deviceId, healthQABody.deviceId) && s.areEqual(this.query, healthQABody.query) && s.areEqual(this.info, healthQABody.info) && this.type == healthQABody.type && s.areEqual(this.tid, healthQABody.tid);
    }

    @Override // com.artillery.ctc.base.BaseCat
    public int getCatType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.deviceId.hashCode() * 31) + this.query.hashCode()) * 31) + this.info.hashCode()) * 31) + this.type) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "HealthQABody(deviceId=" + this.deviceId + ", query=" + this.query + ", info=" + this.info + ", type=" + this.type + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.deviceId);
        out.writeString(this.query);
        Map<String, String> map = this.info;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeInt(this.type);
        out.writeString(this.tid);
    }

    public /* synthetic */ HealthQABody(String str, String str2, Map map, int i8, String str3, int i9, o oVar) {
        this(str, str2, map, (i9 & 8) != 0 ? 4 : i8, (i9 & 16) != 0 ? "" : str3);
    }
}
