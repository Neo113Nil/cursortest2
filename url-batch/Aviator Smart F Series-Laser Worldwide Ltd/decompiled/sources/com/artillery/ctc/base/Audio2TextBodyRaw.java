package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.artillery.ctc.uitls.DeviceUtils;
import java.io.File;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Audio2TextBodyRaw implements Parcelable {
    public static final Parcelable.Creator<Audio2TextBodyRaw> CREATOR = new a();
    public String cuid;
    public Integer dev_pid;
    public String language;
    public File rawFile;
    public String tid;
    public String token;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Audio2TextBodyRaw createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Audio2TextBodyRaw((File) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Audio2TextBodyRaw[] newArray(int i8) {
            return new Audio2TextBodyRaw[i8];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBodyRaw(File rawFile) {
        this(rawFile, null, null, null, null, null, 62, null);
        s.checkNotNullParameter(rawFile, "rawFile");
    }

    public static /* synthetic */ Audio2TextBodyRaw copy$default(Audio2TextBodyRaw audio2TextBodyRaw, File file, String str, Integer num, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            file = audio2TextBodyRaw.rawFile;
        }
        if ((i8 & 2) != 0) {
            str = audio2TextBodyRaw.cuid;
        }
        String str5 = str;
        if ((i8 & 4) != 0) {
            num = audio2TextBodyRaw.dev_pid;
        }
        Integer num2 = num;
        if ((i8 & 8) != 0) {
            str2 = audio2TextBodyRaw.token;
        }
        String str6 = str2;
        if ((i8 & 16) != 0) {
            str3 = audio2TextBodyRaw.tid;
        }
        String str7 = str3;
        if ((i8 & 32) != 0) {
            str4 = audio2TextBodyRaw.language;
        }
        return audio2TextBodyRaw.copy(file, str5, num2, str6, str7, str4);
    }

    public final File component1() {
        return this.rawFile;
    }

    public final String component2() {
        return this.cuid;
    }

    public final Integer component3() {
        return this.dev_pid;
    }

    public final String component4() {
        return this.token;
    }

    public final String component5() {
        return this.tid;
    }

    public final String component6() {
        return this.language;
    }

    public final Audio2TextBodyRaw copy(File rawFile, String str, Integer num, String str2, String tid, String language) {
        s.checkNotNullParameter(rawFile, "rawFile");
        s.checkNotNullParameter(tid, "tid");
        s.checkNotNullParameter(language, "language");
        return new Audio2TextBodyRaw(rawFile, str, num, str2, tid, language);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio2TextBodyRaw)) {
            return false;
        }
        Audio2TextBodyRaw audio2TextBodyRaw = (Audio2TextBodyRaw) obj;
        return s.areEqual(this.rawFile, audio2TextBodyRaw.rawFile) && s.areEqual(this.cuid, audio2TextBodyRaw.cuid) && s.areEqual(this.dev_pid, audio2TextBodyRaw.dev_pid) && s.areEqual(this.token, audio2TextBodyRaw.token) && s.areEqual(this.tid, audio2TextBodyRaw.tid) && s.areEqual(this.language, audio2TextBodyRaw.language);
    }

    public int hashCode() {
        int hashCode = this.rawFile.hashCode() * 31;
        String str = this.cuid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.dev_pid;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.token;
        return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tid.hashCode()) * 31) + this.language.hashCode();
    }

    public String toString() {
        return "Audio2TextBodyRaw(rawFile=" + this.rawFile + ", cuid=" + this.cuid + ", dev_pid=" + this.dev_pid + ", token=" + this.token + ", tid=" + this.tid + ", language=" + this.language + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        s.checkNotNullParameter(out, "out");
        out.writeSerializable(this.rawFile);
        out.writeString(this.cuid);
        Integer num = this.dev_pid;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.token);
        out.writeString(this.tid);
        out.writeString(this.language);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBodyRaw(File rawFile, String str) {
        this(rawFile, str, null, null, null, null, 60, null);
        s.checkNotNullParameter(rawFile, "rawFile");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBodyRaw(File rawFile, String str, Integer num) {
        this(rawFile, str, num, null, null, null, 56, null);
        s.checkNotNullParameter(rawFile, "rawFile");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBodyRaw(File rawFile, String str, Integer num, String str2) {
        this(rawFile, str, num, str2, null, null, 48, null);
        s.checkNotNullParameter(rawFile, "rawFile");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Audio2TextBodyRaw(File rawFile, String str, Integer num, String str2, String tid) {
        this(rawFile, str, num, str2, tid, null, 32, null);
        s.checkNotNullParameter(rawFile, "rawFile");
        s.checkNotNullParameter(tid, "tid");
    }

    public Audio2TextBodyRaw(File rawFile, String str, Integer num, String str2, String tid, String language) {
        s.checkNotNullParameter(rawFile, "rawFile");
        s.checkNotNullParameter(tid, "tid");
        s.checkNotNullParameter(language, "language");
        this.rawFile = rawFile;
        this.cuid = str;
        this.dev_pid = num;
        this.token = str2;
        this.tid = tid;
        this.language = language;
    }

    public /* synthetic */ Audio2TextBodyRaw(File file, String str, Integer num, String str2, String str3, String str4, int i8, o oVar) {
        this(file, (i8 & 2) != 0 ? DeviceUtils.getUniqueDeviceId() : str, (i8 & 4) != 0 ? 1537 : num, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? "" : str3, (i8 & 32) != 0 ? "" : str4);
    }
}
