package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class OverseasRealTimeResult implements Parcelable {
    public static final Parcelable.Creator<OverseasRealTimeResult> CREATOR = new a();
    private final Long end_time;
    private final String err_msg;
    private final int err_no;
    private final Long log_id;
    private final String result;
    private final String sn;
    private final String type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final OverseasRealTimeResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new OverseasRealTimeResult(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final OverseasRealTimeResult[] newArray(int i8) {
            return new OverseasRealTimeResult[i8];
        }
    }

    public OverseasRealTimeResult(int i8, String err_msg, String type, String result, String sn, Long l8, Long l9) {
        s.checkNotNullParameter(err_msg, "err_msg");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(result, "result");
        s.checkNotNullParameter(sn, "sn");
        this.err_no = i8;
        this.err_msg = err_msg;
        this.type = type;
        this.result = result;
        this.sn = sn;
        this.end_time = l8;
        this.log_id = l9;
    }

    public static /* synthetic */ OverseasRealTimeResult copy$default(OverseasRealTimeResult overseasRealTimeResult, int i8, String str, String str2, String str3, String str4, Long l8, Long l9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = overseasRealTimeResult.err_no;
        }
        if ((i9 & 2) != 0) {
            str = overseasRealTimeResult.err_msg;
        }
        String str5 = str;
        if ((i9 & 4) != 0) {
            str2 = overseasRealTimeResult.type;
        }
        String str6 = str2;
        if ((i9 & 8) != 0) {
            str3 = overseasRealTimeResult.result;
        }
        String str7 = str3;
        if ((i9 & 16) != 0) {
            str4 = overseasRealTimeResult.sn;
        }
        String str8 = str4;
        if ((i9 & 32) != 0) {
            l8 = overseasRealTimeResult.end_time;
        }
        Long l10 = l8;
        if ((i9 & 64) != 0) {
            l9 = overseasRealTimeResult.log_id;
        }
        return overseasRealTimeResult.copy(i8, str5, str6, str7, str8, l10, l9);
    }

    public final int component1() {
        return this.err_no;
    }

    public final String component2() {
        return this.err_msg;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.result;
    }

    public final String component5() {
        return this.sn;
    }

    public final Long component6() {
        return this.end_time;
    }

    public final Long component7() {
        return this.log_id;
    }

    public final OverseasRealTimeResult copy(int i8, String err_msg, String type, String result, String sn, Long l8, Long l9) {
        s.checkNotNullParameter(err_msg, "err_msg");
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(result, "result");
        s.checkNotNullParameter(sn, "sn");
        return new OverseasRealTimeResult(i8, err_msg, type, result, sn, l8, l9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverseasRealTimeResult)) {
            return false;
        }
        OverseasRealTimeResult overseasRealTimeResult = (OverseasRealTimeResult) obj;
        return this.err_no == overseasRealTimeResult.err_no && s.areEqual(this.err_msg, overseasRealTimeResult.err_msg) && s.areEqual(this.type, overseasRealTimeResult.type) && s.areEqual(this.result, overseasRealTimeResult.result) && s.areEqual(this.sn, overseasRealTimeResult.sn) && s.areEqual(this.end_time, overseasRealTimeResult.end_time) && s.areEqual(this.log_id, overseasRealTimeResult.log_id);
    }

    public final Long getEnd_time() {
        return this.end_time;
    }

    public final String getErr_msg() {
        return this.err_msg;
    }

    public final int getErr_no() {
        return this.err_no;
    }

    public final Long getLog_id() {
        return this.log_id;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((this.err_no * 31) + this.err_msg.hashCode()) * 31) + this.type.hashCode()) * 31) + this.result.hashCode()) * 31) + this.sn.hashCode()) * 31;
        Long l8 = this.end_time;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.log_id;
        return hashCode2 + (l9 != null ? l9.hashCode() : 0);
    }

    public final boolean isFinish() {
        return s.areEqual(this.type, "FINISH_TEXT");
    }

    public String toString() {
        return "OverseasRealTimeResult(err_no=" + this.err_no + ", err_msg=" + this.err_msg + ", type=" + this.type + ", result=" + this.result + ", sn=" + this.sn + ", end_time=" + this.end_time + ", log_id=" + this.log_id + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeInt(this.err_no);
        out.writeString(this.err_msg);
        out.writeString(this.type);
        out.writeString(this.result);
        out.writeString(this.sn);
        Long l8 = this.end_time;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        Long l9 = this.log_id;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
    }

    public /* synthetic */ OverseasRealTimeResult(int i8, String str, String str2, String str3, String str4, Long l8, Long l9, int i9, o oVar) {
        this(i8, str, str2, str3, str4, (i9 & 32) != 0 ? null : l8, (i9 & 64) != 0 ? null : l9);
    }
}
