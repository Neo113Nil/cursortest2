package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class LanguageResult implements Parcelable {
    public static final Parcelable.Creator<LanguageResult> CREATOR = new a();
    private final String language;
    private final String vcn;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final LanguageResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new LanguageResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LanguageResult[] newArray(int i8) {
            return new LanguageResult[i8];
        }
    }

    public LanguageResult(String language, String str) {
        s.checkNotNullParameter(language, "language");
        this.language = language;
        this.vcn = str;
    }

    public static /* synthetic */ LanguageResult copy$default(LanguageResult languageResult, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = languageResult.language;
        }
        if ((i8 & 2) != 0) {
            str2 = languageResult.vcn;
        }
        return languageResult.copy(str, str2);
    }

    public final String component1() {
        return this.language;
    }

    public final String component2() {
        return this.vcn;
    }

    public final LanguageResult copy(String language, String str) {
        s.checkNotNullParameter(language, "language");
        return new LanguageResult(language, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageResult)) {
            return false;
        }
        LanguageResult languageResult = (LanguageResult) obj;
        return s.areEqual(this.language, languageResult.language) && s.areEqual(this.vcn, languageResult.vcn);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getVcn() {
        return this.vcn;
    }

    public int hashCode() {
        int hashCode = this.language.hashCode() * 31;
        String str = this.vcn;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LanguageResult(language=" + this.language + ", vcn=" + this.vcn + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.language);
        out.writeString(this.vcn);
    }

    public /* synthetic */ LanguageResult(String str, String str2, int i8, o oVar) {
        this(str, (i8 & 2) != 0 ? null : str2);
    }
}
