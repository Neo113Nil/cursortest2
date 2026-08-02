package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0014\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "id", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$Attributes;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$Attributes;)V", "getId", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$Attributes;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "InquiryTheme", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryTemplateVersion implements Parcelable, Included {
    public static final Parcelable.Creator<InquiryTemplateVersion> CREATOR = new Creator();
    private final Attributes attributes;
    private final String id;

    public InquiryTemplateVersion(String str, Attributes attributes) {
        str.getClass();
        this.id = str;
        this.attributes = attributes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$Attributes;", "Landroid/os/Parcelable;", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;)V", "getTheme", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Attributes implements Parcelable {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final InquiryTheme theme;

        public Attributes(InquiryTheme inquiryTheme) {
            this.theme = inquiryTheme;
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, InquiryTheme inquiryTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                inquiryTheme = attributes.theme;
            }
            return attributes.copy(inquiryTheme);
        }

        /* renamed from: component1, reason: from getter */
        public final InquiryTheme getTheme() {
            return this.theme;
        }

        public final Attributes copy(InquiryTheme theme) {
            return new Attributes(theme);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Attributes) && Intrinsics.areEqual(this.theme, ((Attributes) other).theme);
        }

        public final InquiryTheme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            InquiryTheme inquiryTheme = this.theme;
            if (inquiryTheme == null) {
                return 0;
            }
            return inquiryTheme.hashCode();
        }

        public String toString() {
            return "Attributes(theme=" + this.theme + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            InquiryTheme inquiryTheme = this.theme;
            if (inquiryTheme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inquiryTheme.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Attributes(parcel.readInt() == 0 ? null : InquiryTheme.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;", "Landroid/os/Parcelable;", "iconStyle", "", "<init>", "(Ljava/lang/String;)V", "getIconStyle", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InquiryTheme implements Parcelable {
        public static final Parcelable.Creator<InquiryTheme> CREATOR = new Creator();
        private final String iconStyle;

        public /* synthetic */ InquiryTheme(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ InquiryTheme copy$default(InquiryTheme inquiryTheme, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inquiryTheme.iconStyle;
            }
            return inquiryTheme.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIconStyle() {
            return this.iconStyle;
        }

        public final InquiryTheme copy(String iconStyle) {
            return new InquiryTheme(iconStyle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InquiryTheme) && Intrinsics.areEqual(this.iconStyle, ((InquiryTheme) other).iconStyle);
        }

        public final String getIconStyle() {
            return this.iconStyle;
        }

        public int hashCode() {
            String str = this.iconStyle;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InquiryTheme(iconStyle=", this.iconStyle, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.iconStyle);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InquiryTheme> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquiryTheme createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InquiryTheme(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InquiryTheme[] newArray(int i) {
                return new InquiryTheme[i];
            }
        }

        public InquiryTheme(String str) {
            this.iconStyle = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InquiryTheme() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InquiryTemplateVersion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquiryTemplateVersion createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InquiryTemplateVersion(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquiryTemplateVersion[] newArray(int i) {
            return new InquiryTemplateVersion[i];
        }
    }
}
