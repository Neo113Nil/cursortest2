package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.artillery.ctc.uitls.DeviceUtils;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Audio2TextBody implements Parcelable {
    public static final Parcelable.Creator<Audio2TextBody> CREATOR = new a();
    public int channel;
    public String cuid;
    public Integer dev_pid;
    public String format;
    public String lan;
    public long len;
    public Integer lm_id;
    public int rate;
    public String speech;
    public final String tid;
    public String token;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Audio2TextBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Audio2TextBody(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Audio2TextBody[] newArray(int i8) {
            return new Audio2TextBody[i8];
        }
    }

    public Audio2TextBody() {
        this(null, 0L, null, 0, 0, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.speech;
    }

    public final String component10() {
        return this.token;
    }

    public final String component11() {
        return this.tid;
    }

    public final long component2() {
        return this.len;
    }

    public final String component3() {
        return this.format;
    }

    public final int component4() {
        return this.rate;
    }

    public final int component5() {
        return this.channel;
    }

    public final String component6() {
        return this.cuid;
    }

    public final Integer component7() {
        return this.dev_pid;
    }

    public final Integer component8() {
        return this.lm_id;
    }

    public final String component9() {
        return this.lan;
    }

    public final Audio2TextBody copy(String speech, long j8, String format, int i8, int i9, String cuid, Integer num, Integer num2, String str, String token, String tid) {
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(tid, "tid");
        return new Audio2TextBody(speech, j8, format, i8, i9, cuid, num, num2, str, token, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio2TextBody)) {
            return false;
        }
        Audio2TextBody audio2TextBody = (Audio2TextBody) obj;
        return s.areEqual(this.speech, audio2TextBody.speech) && this.len == audio2TextBody.len && s.areEqual(this.format, audio2TextBody.format) && this.rate == audio2TextBody.rate && this.channel == audio2TextBody.channel && s.areEqual(this.cuid, audio2TextBody.cuid) && s.areEqual(this.dev_pid, audio2TextBody.dev_pid) && s.areEqual(this.lm_id, audio2TextBody.lm_id) && s.areEqual(this.lan, audio2TextBody.lan) && s.areEqual(this.token, audio2TextBody.token) && s.areEqual(this.tid, audio2TextBody.tid);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.speech.hashCode() * 31) + androidx.collection.a.a(this.len)) * 31) + this.format.hashCode()) * 31) + this.rate) * 31) + this.channel) * 31) + this.cuid.hashCode()) * 31;
        Integer num = this.dev_pid;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lm_id;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.lan;
        return ((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.token.hashCode()) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "Audio2TextBody(speech=" + this.speech + ", len=" + this.len + ", format=" + this.format + ", rate=" + this.rate + ", channel=" + this.channel + ", cuid=" + this.cuid + ", dev_pid=" + this.dev_pid + ", lm_id=" + this.lm_id + ", lan=" + this.lan + ", token=" + this.token + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.speech);
        out.writeLong(this.len);
        out.writeString(this.format);
        out.writeInt(this.rate);
        out.writeInt(this.channel);
        out.writeString(this.cuid);
        Integer num = this.dev_pid;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.lm_id;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.lan);
        out.writeString(this.token);
        out.writeString(this.tid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech) {
        this(speech, 0L, null, 0, 0, null, null, null, null, null, null, 2046, null);
        s.checkNotNullParameter(speech, "speech");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8) {
        this(speech, j8, null, 0, 0, null, null, null, null, null, null, 2044, null);
        s.checkNotNullParameter(speech, "speech");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format) {
        this(speech, j8, format, 0, 0, null, null, null, null, null, null, 2040, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8) {
        this(speech, j8, format, i8, 0, null, null, null, null, null, null, 2032, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8, int i9) {
        this(speech, j8, format, i8, i9, null, null, null, null, null, null, 2016, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8, int i9, String cuid) {
        this(speech, j8, format, i8, i9, cuid, null, null, null, null, null, 1984, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8, int i9, String cuid, Integer num) {
        this(speech, j8, format, i8, i9, cuid, num, null, null, null, null, 1920, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8, int i9, String cuid, Integer num, Integer num2) {
        this(speech, j8, format, i8, i9, cuid, num, num2, null, null, null, 1792, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8, int i9, String cuid, Integer num, Integer num2, String str) {
        this(speech, j8, format, i8, i9, cuid, num, num2, str, null, null, 1536, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBody(String speech, long j8, String format, int i8, int i9, String cuid, Integer num, Integer num2, String str, String token) {
        this(speech, j8, format, i8, i9, cuid, num, num2, str, token, null, 1024, null);
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(token, "token");
    }

    public Audio2TextBody(String speech, long j8, String format, int i8, int i9, String cuid, Integer num, Integer num2, String str, String token, String tid) {
        s.checkNotNullParameter(speech, "speech");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(tid, "tid");
        this.speech = speech;
        this.len = j8;
        this.format = format;
        this.rate = i8;
        this.channel = i9;
        this.cuid = cuid;
        this.dev_pid = num;
        this.lm_id = num2;
        this.lan = str;
        this.token = token;
        this.tid = tid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Audio2TextBody(String str, long j8, String str2, int i8, int i9, String str3, Integer num, Integer num2, String str4, String str5, String str6, int i10, o oVar) {
        this(r1, r3, r5, r6, r7, r8, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : num2, (i10 & 256) == 0 ? str4 : null, (i10 & 512) != 0 ? "" : str5, (i10 & 1024) == 0 ? str6 : "");
        String str7;
        String str8 = (i10 & 1) != 0 ? "" : str;
        long j9 = (i10 & 2) != 0 ? 0L : j8;
        String str9 = (i10 & 4) != 0 ? "pcm" : str2;
        int i11 = (i10 & 8) != 0 ? 16000 : i8;
        int i12 = (i10 & 16) != 0 ? 1 : i9;
        if ((i10 & 32) != 0) {
            str7 = DeviceUtils.getUniqueDeviceId();
            s.checkNotNullExpressionValue(str7, "getUniqueDeviceId()");
        } else {
            str7 = str3;
        }
    }
}
