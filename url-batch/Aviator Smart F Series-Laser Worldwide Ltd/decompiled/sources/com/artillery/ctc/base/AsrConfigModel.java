package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.artillery.ctc.uitls.PathUtils;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AsrConfigModel implements Parcelable {
    public static final Parcelable.Creator<AsrConfigModel> CREATOR = new a();
    public String accent;
    public String asrPtt;
    public String audioFormat;
    public String audioPath;
    public String cloudGrammar;
    public String engineType;
    public String language;
    public String resultType;
    public String subject;
    public String vadBos;
    public String vadEos;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final AsrConfigModel createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new AsrConfigModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AsrConfigModel[] newArray(int i8) {
            return new AsrConfigModel[i8];
        }
    }

    public AsrConfigModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.cloudGrammar;
    }

    public final String component10() {
        return this.audioFormat;
    }

    public final String component11() {
        return this.audioPath;
    }

    public final String component2() {
        return this.subject;
    }

    public final String component3() {
        return this.resultType;
    }

    public final String component4() {
        return this.engineType;
    }

    public final String component5() {
        return this.language;
    }

    public final String component6() {
        return this.accent;
    }

    public final String component7() {
        return this.vadBos;
    }

    public final String component8() {
        return this.vadEos;
    }

    public final String component9() {
        return this.asrPtt;
    }

    public final AsrConfigModel copy(String str, String str2, String resultType, String engineType, String language, String accent, String vadBos, String vadEos, String asrPtt, String audioFormat, String audioPath) {
        s.checkNotNullParameter(resultType, "resultType");
        s.checkNotNullParameter(engineType, "engineType");
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(accent, "accent");
        s.checkNotNullParameter(vadBos, "vadBos");
        s.checkNotNullParameter(vadEos, "vadEos");
        s.checkNotNullParameter(asrPtt, "asrPtt");
        s.checkNotNullParameter(audioFormat, "audioFormat");
        s.checkNotNullParameter(audioPath, "audioPath");
        return new AsrConfigModel(str, str2, resultType, engineType, language, accent, vadBos, vadEos, asrPtt, audioFormat, audioPath);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrConfigModel)) {
            return false;
        }
        AsrConfigModel asrConfigModel = (AsrConfigModel) obj;
        return s.areEqual(this.cloudGrammar, asrConfigModel.cloudGrammar) && s.areEqual(this.subject, asrConfigModel.subject) && s.areEqual(this.resultType, asrConfigModel.resultType) && s.areEqual(this.engineType, asrConfigModel.engineType) && s.areEqual(this.language, asrConfigModel.language) && s.areEqual(this.accent, asrConfigModel.accent) && s.areEqual(this.vadBos, asrConfigModel.vadBos) && s.areEqual(this.vadEos, asrConfigModel.vadEos) && s.areEqual(this.asrPtt, asrConfigModel.asrPtt) && s.areEqual(this.audioFormat, asrConfigModel.audioFormat) && s.areEqual(this.audioPath, asrConfigModel.audioPath);
    }

    public int hashCode() {
        String str = this.cloudGrammar;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subject;
        return ((((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.resultType.hashCode()) * 31) + this.engineType.hashCode()) * 31) + this.language.hashCode()) * 31) + this.accent.hashCode()) * 31) + this.vadBos.hashCode()) * 31) + this.vadEos.hashCode()) * 31) + this.asrPtt.hashCode()) * 31) + this.audioFormat.hashCode()) * 31) + this.audioPath.hashCode();
    }

    public String toString() {
        return "AsrConfigModel(cloudGrammar=" + this.cloudGrammar + ", subject=" + this.subject + ", resultType=" + this.resultType + ", engineType=" + this.engineType + ", language=" + this.language + ", accent=" + this.accent + ", vadBos=" + this.vadBos + ", vadEos=" + this.vadEos + ", asrPtt=" + this.asrPtt + ", audioFormat=" + this.audioFormat + ", audioPath=" + this.audioPath + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.cloudGrammar);
        out.writeString(this.subject);
        out.writeString(this.resultType);
        out.writeString(this.engineType);
        out.writeString(this.language);
        out.writeString(this.accent);
        out.writeString(this.vadBos);
        out.writeString(this.vadEos);
        out.writeString(this.asrPtt);
        out.writeString(this.audioFormat);
        out.writeString(this.audioPath);
    }

    public AsrConfigModel(String str, String str2, String resultType, String engineType, String language, String accent, String vadBos, String vadEos, String asrPtt, String audioFormat, String audioPath) {
        s.checkNotNullParameter(resultType, "resultType");
        s.checkNotNullParameter(engineType, "engineType");
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(accent, "accent");
        s.checkNotNullParameter(vadBos, "vadBos");
        s.checkNotNullParameter(vadEos, "vadEos");
        s.checkNotNullParameter(asrPtt, "asrPtt");
        s.checkNotNullParameter(audioFormat, "audioFormat");
        s.checkNotNullParameter(audioPath, "audioPath");
        this.cloudGrammar = str;
        this.subject = str2;
        this.resultType = resultType;
        this.engineType = engineType;
        this.language = language;
        this.accent = accent;
        this.vadBos = vadBos;
        this.vadEos = vadEos;
        this.asrPtt = asrPtt;
        this.audioFormat = audioFormat;
        this.audioPath = audioPath;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AsrConfigModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i8, o oVar) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r0);
        String str12;
        String str13 = (i8 & 1) != 0 ? null : str;
        String str14 = (i8 & 2) == 0 ? str2 : null;
        String str15 = (i8 & 4) != 0 ? BodyData.TYPE_JSON : str3;
        String str16 = (i8 & 8) != 0 ? "cloud" : str4;
        String str17 = (i8 & 16) != 0 ? "zh_cn" : str5;
        String str18 = (i8 & 32) != 0 ? "mandarin" : str6;
        String str19 = (i8 & 64) != 0 ? "4000" : str7;
        String str20 = (i8 & 128) != 0 ? "1000" : str8;
        String str21 = (i8 & 256) != 0 ? "1" : str9;
        String str22 = (i8 & 512) != 0 ? "wav" : str10;
        if ((i8 & 1024) != 0) {
            str12 = PathUtils.join(PathUtils.join(PathUtils.getInternalAppFilesPath(), "msc"), "iat.wav");
            s.checkNotNullExpressionValue(str12, "join(\n        PathUtils.…       ), \"iat.wav\"\n    )");
        } else {
            str12 = str11;
        }
    }
}
