package com.withpersona.sdk2.inquiry.shared.inquiryTheme;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;

/* loaded from: classes9.dex */
public final class InquiryTheme implements Parcelable {
    public static final Parcelable.Creator<InquiryTheme> CREATOR = new PoseConfigs.Creator(25);
    public static final InquiryTheme Default = new InquiryTheme(IconStyle.Default);
    public final IconStyle iconStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IconStyle {
        public static final /* synthetic */ IconStyle[] $VALUES;
        public static final IconStyle Default;
        public static final IconStyle None;

        static {
            IconStyle iconStyle = new IconStyle("Default", 0);
            Default = iconStyle;
            IconStyle iconStyle2 = new IconStyle("None", 1);
            None = iconStyle2;
            $VALUES = new IconStyle[]{iconStyle, iconStyle2};
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }
    }

    public InquiryTheme(IconStyle iconStyle) {
        iconStyle.getClass();
        this.iconStyle = iconStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InquiryTheme) && this.iconStyle == ((InquiryTheme) obj).iconStyle;
    }

    public final int hashCode() {
        return this.iconStyle.hashCode();
    }

    public final String toString() {
        return "InquiryTheme(iconStyle=" + this.iconStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.iconStyle.name());
    }
}
