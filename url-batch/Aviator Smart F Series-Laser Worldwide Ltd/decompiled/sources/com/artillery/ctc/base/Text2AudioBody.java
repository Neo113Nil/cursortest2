package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.artillery.ctc.uitls.DeviceUtils;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text2AudioBody implements Parcelable {
    public static final Parcelable.Creator<Text2AudioBody> CREATOR = new a();
    public int aue;
    public String ctp;
    public String cuid;
    public String lan;
    public int per;
    public int pit;
    public int spd;
    public String tex;
    public final String tid;
    public String tok;
    public int vol;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Text2AudioBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Text2AudioBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Text2AudioBody[] newArray(int i8) {
            return new Text2AudioBody[i8];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex) {
        this(tex, null, null, null, 0, 0, 0, 0, 0, null, null, 2046, null);
        s.checkNotNullParameter(tex, "tex");
    }

    public final String component1() {
        return this.tex;
    }

    public final String component10() {
        return this.tok;
    }

    public final String component11() {
        return this.tid;
    }

    public final String component2() {
        return this.lan;
    }

    public final String component3() {
        return this.cuid;
    }

    public final String component4() {
        return this.ctp;
    }

    public final int component5() {
        return this.spd;
    }

    public final int component6() {
        return this.pit;
    }

    public final int component7() {
        return this.vol;
    }

    public final int component8() {
        return this.per;
    }

    public final int component9() {
        return this.aue;
    }

    public final Text2AudioBody copy(String tex, String lan, String cuid, String ctp, int i8, int i9, int i10, int i11, int i12, String tok, String tid) {
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
        s.checkNotNullParameter(tok, "tok");
        s.checkNotNullParameter(tid, "tid");
        return new Text2AudioBody(tex, lan, cuid, ctp, i8, i9, i10, i11, i12, tok, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2AudioBody)) {
            return false;
        }
        Text2AudioBody text2AudioBody = (Text2AudioBody) obj;
        return s.areEqual(this.tex, text2AudioBody.tex) && s.areEqual(this.lan, text2AudioBody.lan) && s.areEqual(this.cuid, text2AudioBody.cuid) && s.areEqual(this.ctp, text2AudioBody.ctp) && this.spd == text2AudioBody.spd && this.pit == text2AudioBody.pit && this.vol == text2AudioBody.vol && this.per == text2AudioBody.per && this.aue == text2AudioBody.aue && s.areEqual(this.tok, text2AudioBody.tok) && s.areEqual(this.tid, text2AudioBody.tid);
    }

    public int hashCode() {
        return (((((((((((((((((((this.tex.hashCode() * 31) + this.lan.hashCode()) * 31) + this.cuid.hashCode()) * 31) + this.ctp.hashCode()) * 31) + this.spd) * 31) + this.pit) * 31) + this.vol) * 31) + this.per) * 31) + this.aue) * 31) + this.tok.hashCode()) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "Text2AudioBody(tex=" + this.tex + ", lan=" + this.lan + ", cuid=" + this.cuid + ", ctp=" + this.ctp + ", spd=" + this.spd + ", pit=" + this.pit + ", vol=" + this.vol + ", per=" + this.per + ", aue=" + this.aue + ", tok=" + this.tok + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.tex);
        out.writeString(this.lan);
        out.writeString(this.cuid);
        out.writeString(this.ctp);
        out.writeInt(this.spd);
        out.writeInt(this.pit);
        out.writeInt(this.vol);
        out.writeInt(this.per);
        out.writeInt(this.aue);
        out.writeString(this.tok);
        out.writeString(this.tid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan) {
        this(tex, lan, null, null, 0, 0, 0, 0, 0, null, null, 2044, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid) {
        this(tex, lan, cuid, null, 0, 0, 0, 0, 0, null, null, 2040, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp) {
        this(tex, lan, cuid, ctp, 0, 0, 0, 0, 0, null, null, 2032, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8) {
        this(tex, lan, cuid, ctp, i8, 0, 0, 0, 0, null, null, 2016, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8, int i9) {
        this(tex, lan, cuid, ctp, i8, i9, 0, 0, 0, null, null, 1984, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8, int i9, int i10) {
        this(tex, lan, cuid, ctp, i8, i9, i10, 0, 0, null, null, 1920, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8, int i9, int i10, int i11) {
        this(tex, lan, cuid, ctp, i8, i9, i10, i11, 0, null, null, 1792, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8, int i9, int i10, int i11, int i12) {
        this(tex, lan, cuid, ctp, i8, i9, i10, i11, i12, null, null, 1536, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8, int i9, int i10, int i11, int i12, String tok) {
        this(tex, lan, cuid, ctp, i8, i9, i10, i11, i12, tok, null, 1024, null);
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
        s.checkNotNullParameter(tok, "tok");
    }

    public Text2AudioBody(String tex, String lan, String cuid, String ctp, int i8, int i9, int i10, int i11, int i12, String tok, String tid) {
        s.checkNotNullParameter(tex, "tex");
        s.checkNotNullParameter(lan, "lan");
        s.checkNotNullParameter(cuid, "cuid");
        s.checkNotNullParameter(ctp, "ctp");
        s.checkNotNullParameter(tok, "tok");
        s.checkNotNullParameter(tid, "tid");
        this.tex = tex;
        this.lan = lan;
        this.cuid = cuid;
        this.ctp = ctp;
        this.spd = i8;
        this.pit = i9;
        this.vol = i10;
        this.per = i11;
        this.aue = i12;
        this.tok = tok;
        this.tid = tid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Text2AudioBody(String str, String str2, String str3, String str4, int i8, int i9, int i10, int i11, int i12, String str5, String str6, int i13, o oVar) {
        this(str, r1, r2, (i13 & 8) != 0 ? "1" : str4, (i13 & 16) != 0 ? 5 : i8, (i13 & 32) != 0 ? 5 : i9, (i13 & 64) == 0 ? i10 : 5, (i13 & 128) != 0 ? 3 : i11, (i13 & 256) == 0 ? i12 : 3, (i13 & 512) != 0 ? "" : str5, (i13 & 1024) == 0 ? str6 : "");
        String str7;
        String str8 = (i13 & 2) != 0 ? "zh" : str2;
        if ((i13 & 4) != 0) {
            str7 = DeviceUtils.getUniqueDeviceId();
            s.checkNotNullExpressionValue(str7, "getUniqueDeviceId()");
        } else {
            str7 = str3;
        }
    }
}
