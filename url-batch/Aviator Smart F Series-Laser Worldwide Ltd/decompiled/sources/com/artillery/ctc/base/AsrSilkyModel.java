package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import kotlin.text.t;

@Keep
/* loaded from: classes.dex */
public final class AsrSilkyModel implements Parcelable {
    public static final Parcelable.Creator<AsrSilkyModel> CREATOR = new a();
    public String accent;
    public String domain;
    public String dwa;
    public String encoding;
    public String format;
    public String language;
    public int ptt;
    public int vad_eos;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final AsrSilkyModel createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new AsrSilkyModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AsrSilkyModel[] newArray(int i8) {
            return new AsrSilkyModel[i8];
        }
    }

    public AsrSilkyModel() {
        this(null, null, null, 0, null, null, null, 0, 255, null);
    }

    public final String component1() {
        return this.language;
    }

    public final String component2() {
        return this.domain;
    }

    public final String component3() {
        return this.accent;
    }

    public final int component4() {
        return this.vad_eos;
    }

    public final String component5() {
        return this.dwa;
    }

    public final String component6() {
        return this.format;
    }

    public final String component7() {
        return this.encoding;
    }

    public final int component8() {
        return this.ptt;
    }

    public final AsrSilkyModel copy(String language, String domain, String accent, int i8, String str, String format, String encoding, int i9) {
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(encoding, "encoding");
        return new AsrSilkyModel(language, domain, accent, i8, str, format, encoding, i9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrSilkyModel)) {
            return false;
        }
        AsrSilkyModel asrSilkyModel = (AsrSilkyModel) obj;
        return s.areEqual(this.language, asrSilkyModel.language) && s.areEqual(this.domain, asrSilkyModel.domain) && s.areEqual(this.accent, asrSilkyModel.accent) && this.vad_eos == asrSilkyModel.vad_eos && s.areEqual(this.dwa, asrSilkyModel.dwa) && s.areEqual(this.format, asrSilkyModel.format) && s.areEqual(this.encoding, asrSilkyModel.encoding) && this.ptt == asrSilkyModel.ptt;
    }

    public final String getHostUrl() {
        return isMinorLanguages() ? "https://iat-niche-api.xfyun.cn/v2/iat" : "https://iat-api.xfyun.cn/v2/iat";
    }

    public final Charset getTtsEncodingByLanguage() {
        String lowerCase = this.language.toLowerCase(Locale.ROOT);
        s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (s.areEqual(lowerCase, "zh_cn") || s.areEqual(lowerCase, "en_us")) ? d.UTF_8 : d.UTF_16LE;
    }

    public int hashCode() {
        int hashCode = ((((((this.language.hashCode() * 31) + this.domain.hashCode()) * 31) + this.accent.hashCode()) * 31) + this.vad_eos) * 31;
        String str = this.dwa;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.format.hashCode()) * 31) + this.encoding.hashCode()) * 31) + this.ptt;
    }

    public final boolean isMinorLanguages() {
        return (t.equals(this.language, "zh_cn", true) || t.equals(this.language, "en_us", true)) ? false : true;
    }

    public String toString() {
        return "AsrSilkyModel(language=" + this.language + ", domain=" + this.domain + ", accent=" + this.accent + ", vad_eos=" + this.vad_eos + ", dwa=" + this.dwa + ", format=" + this.format + ", encoding=" + this.encoding + ", ptt=" + this.ptt + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.language);
        out.writeString(this.domain);
        out.writeString(this.accent);
        out.writeInt(this.vad_eos);
        out.writeString(this.dwa);
        out.writeString(this.format);
        out.writeString(this.encoding);
        out.writeInt(this.ptt);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language) {
        this(language, null, null, 0, null, null, null, 0, GattError.GATT_PRC_IN_PROGRESS, null);
        s.checkNotNullParameter(language, "language");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language, String domain) {
        this(language, domain, null, 0, null, null, null, 0, 252, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language, String domain, String accent) {
        this(language, domain, accent, 0, null, null, null, 0, 248, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language, String domain, String accent, int i8) {
        this(language, domain, accent, i8, null, null, null, 0, 240, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language, String domain, String accent, int i8, String str) {
        this(language, domain, accent, i8, str, null, null, 0, 224, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language, String domain, String accent, int i8, String str, String format) {
        this(language, domain, accent, i8, str, format, null, 0, PsExtractor.AUDIO_STREAM, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
        s.checkNotNullParameter(format, "format");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrSilkyModel(String language, String domain, String accent, int i8, String str, String format, String encoding) {
        this(language, domain, accent, i8, str, format, encoding, 0, 128, null);
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(encoding, "encoding");
    }

    public AsrSilkyModel(String language, String domain, String accent, int i8, String str, String format, String encoding, int i9) {
        s.checkNotNullParameter(language, "language");
        s.checkNotNullParameter(domain, "domain");
        s.checkNotNullParameter(accent, "accent");
        s.checkNotNullParameter(format, "format");
        s.checkNotNullParameter(encoding, "encoding");
        this.language = language;
        this.domain = domain;
        this.accent = accent;
        this.vad_eos = i8;
        this.dwa = str;
        this.format = format;
        this.encoding = encoding;
        this.ptt = i9;
    }

    public /* synthetic */ AsrSilkyModel(String str, String str2, String str3, int i8, String str4, String str5, String str6, int i9, int i10, o oVar) {
        this((i10 & 1) != 0 ? "zh_cn" : str, (i10 & 2) != 0 ? "iat" : str2, (i10 & 4) != 0 ? "mandarin" : str3, (i10 & 8) != 0 ? 2000 : i8, (i10 & 16) != 0 ? "wpgs" : str4, (i10 & 32) != 0 ? "audio/L16;rate=16000" : str5, (i10 & 64) != 0 ? "raw" : str6, (i10 & 128) != 0 ? 0 : i9);
    }
}
