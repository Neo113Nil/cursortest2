package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okio.z0;

@Keep
/* loaded from: classes.dex */
public final class Text2AudioSilkyConfig implements Parcelable {
    public static final Parcelable.Creator<Text2AudioSilkyConfig> CREATOR = new a();
    public String aue;
    public String auf;
    public Integer bgs;
    public String language;
    public Integer pitch;
    public String rdn;
    public String reg;
    public int sfl;
    public Integer speed;
    public String tte;
    public String vcn;
    public Integer volume;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Text2AudioSilkyConfig createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Text2AudioSilkyConfig(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Text2AudioSilkyConfig[] newArray(int i8) {
            return new Text2AudioSilkyConfig[i8];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language) {
        this(language, null, 0, null, null, null, null, null, null, null, null, null, 4094, null);
        s.checkNotNullParameter(language, "language");
    }

    public final String component1() {
        return this.language;
    }

    public final Integer component10() {
        return this.bgs;
    }

    public final String component11() {
        return this.reg;
    }

    public final String component12() {
        return this.rdn;
    }

    public final String component2() {
        return this.aue;
    }

    public final int component3() {
        return this.sfl;
    }

    public final String component4() {
        return this.vcn;
    }

    public final String component5() {
        return this.tte;
    }

    public final Integer component6() {
        return this.speed;
    }

    public final Integer component7() {
        return this.pitch;
    }

    public final String component8() {
        return this.auf;
    }

    public final Integer component9() {
        return this.volume;
    }

    public final Text2AudioSilkyConfig copy(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, String str3, String str4) {
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
        return new Text2AudioSilkyConfig(language, aue, i8, vcn, str, num, num2, str2, num3, num4, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2AudioSilkyConfig)) {
            return false;
        }
        Text2AudioSilkyConfig text2AudioSilkyConfig = (Text2AudioSilkyConfig) obj;
        return s.areEqual(this.language, text2AudioSilkyConfig.language) && s.areEqual(this.aue, text2AudioSilkyConfig.aue) && this.sfl == text2AudioSilkyConfig.sfl && s.areEqual(this.vcn, text2AudioSilkyConfig.vcn) && s.areEqual(this.tte, text2AudioSilkyConfig.tte) && s.areEqual(this.speed, text2AudioSilkyConfig.speed) && s.areEqual(this.pitch, text2AudioSilkyConfig.pitch) && s.areEqual(this.auf, text2AudioSilkyConfig.auf) && s.areEqual(this.volume, text2AudioSilkyConfig.volume) && s.areEqual(this.bgs, text2AudioSilkyConfig.bgs) && s.areEqual(this.reg, text2AudioSilkyConfig.reg) && s.areEqual(this.rdn, text2AudioSilkyConfig.rdn);
    }

    public int hashCode() {
        int hashCode = ((((((this.language.hashCode() * 31) + this.aue.hashCode()) * 31) + this.sfl) * 31) + this.vcn.hashCode()) * 31;
        String str = this.tte;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.speed;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pitch;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.auf;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.volume;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bgs;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.reg;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rdn;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Text2AudioSilkyConfig(language=" + this.language + ", aue=" + this.aue + ", sfl=" + this.sfl + ", vcn=" + this.vcn + ", tte=" + this.tte + ", speed=" + this.speed + ", pitch=" + this.pitch + ", auf=" + this.auf + ", volume=" + this.volume + ", bgs=" + this.bgs + ", reg=" + this.reg + ", rdn=" + this.rdn + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.language);
        out.writeString(this.aue);
        out.writeInt(this.sfl);
        out.writeString(this.vcn);
        out.writeString(this.tte);
        Integer num = this.speed;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.pitch;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.auf);
        Integer num3 = this.volume;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.bgs;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        out.writeString(this.reg);
        out.writeString(this.rdn);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue) {
        this(language, aue, 0, null, null, null, null, null, null, null, null, null, 4092, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8) {
        this(language, aue, i8, null, null, null, null, null, null, null, null, null, 4088, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn) {
        this(language, aue, i8, vcn, null, null, null, null, null, null, null, null, 4080, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str) {
        this(language, aue, i8, vcn, str, null, null, null, null, null, null, null, 4064, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num) {
        this(language, aue, i8, vcn, str, num, null, null, null, null, null, null, 4032, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2) {
        this(language, aue, i8, vcn, str, num, num2, null, null, null, null, null, z0.MASK_2BYTES, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2, String str2) {
        this(language, aue, i8, vcn, str, num, num2, str2, null, null, null, null, 3840, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2, String str2, Integer num3) {
        this(language, aue, i8, vcn, str, num, num2, str2, num3, null, null, null, 3584, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4) {
        this(language, aue, i8, vcn, str, num, num2, str2, num3, num4, null, null, 3072, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, String str3) {
        this(language, aue, i8, vcn, str, num, num2, str2, num3, num4, str3, null, 2048, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
    }

    public Text2AudioSilkyConfig(String language, String aue, int i8, String vcn, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, String str3, String str4) {
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(aue, "aue");
        s.checkNotNullParameter(vcn, "vcn");
        this.language = language;
        this.aue = aue;
        this.sfl = i8;
        this.vcn = vcn;
        this.tte = str;
        this.speed = num;
        this.pitch = num2;
        this.auf = str2;
        this.volume = num3;
        this.bgs = num4;
        this.reg = str3;
        this.rdn = str4;
    }

    public /* synthetic */ Text2AudioSilkyConfig(String str, String str2, int i8, String str3, String str4, Integer num, Integer num2, String str5, Integer num3, Integer num4, String str6, String str7, int i9, o oVar) {
        this(str, (i9 & 2) != 0 ? "lame" : str2, (i9 & 4) != 0 ? 1 : i8, (i9 & 8) != 0 ? "xiaoyan" : str3, (i9 & 16) != 0 ? "utf8" : str4, (i9 & 32) != 0 ? null : num, (i9 & 64) != 0 ? null : num2, (i9 & 128) != 0 ? null : str5, (i9 & 256) != 0 ? null : num3, (i9 & 512) != 0 ? null : num4, (i9 & 1024) != 0 ? null : str6, (i9 & 2048) == 0 ? str7 : null);
    }
}
