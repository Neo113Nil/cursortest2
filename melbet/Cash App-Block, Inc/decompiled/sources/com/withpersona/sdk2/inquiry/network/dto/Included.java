package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "", "Companion", "Unknown", "Font", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Included {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Companion;", "", "<init>", "()V", "createAdapter", "Lcom/squareup/moshi/JsonAdapter$Factory;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final JsonAdapter.Factory createAdapter() {
            List list = Collections.EMPTY_LIST;
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactory = new PolymorphicJsonAdapterFactory(Included.class, "type", list, list, null);
            return polymorphicJsonAdapterFactory.withFallbackJsonAdapter(new JsonAdapter.AnonymousClass4(polymorphicJsonAdapterFactory, Unknown.INSTANCE, false, 1)).withSubtype(Font.class, "theme-variable/font").withSubtype(InquirySessionData.class, "inquiry-session").withSubtype(InquiryTemplateVersion.class, "inquiry-template-version");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown implements Included {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 1167921231;
        }

        public String toString() {
            return "Unknown";
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "Landroid/os/Parcelable;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;)V", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FontAttributes", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Font implements Included, Parcelable {
        public static final Parcelable.Creator<Font> CREATOR = new Creator();
        private final FontAttributes attributes;

        public Font(FontAttributes fontAttributes) {
            fontAttributes.getClass();
            this.attributes = fontAttributes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final FontAttributes getAttributes() {
            return this.attributes;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            this.attributes.writeToParcel(dest, flags);
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "Landroid/os/Parcelable;", "fontFamilyName", "", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "url", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Ljava/lang/String;)V", "getFontFamilyName", "()Ljava/lang/String;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getUrl", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FontAttributes implements Parcelable {
            public static final Parcelable.Creator<FontAttributes> CREATOR = new Creator();
            private final String fontFamilyName;
            private final StyleElements.FontWeight fontWeight;
            private final String url;

            public FontAttributes(String str, StyleElements.FontWeight fontWeight, String str2) {
                this.fontFamilyName = str;
                this.fontWeight = fontWeight;
                this.url = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String getFontFamilyName() {
                return this.fontFamilyName;
            }

            public final StyleElements.FontWeight getFontWeight() {
                return this.fontWeight;
            }

            public final String getUrl() {
                return this.url;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.fontFamilyName);
                StyleElements.FontWeight fontWeight = this.fontWeight;
                if (fontWeight == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(fontWeight.name());
                }
                dest.writeString(this.url);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FontAttributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FontAttributes createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new FontAttributes(parcel.readString(), parcel.readInt() == 0 ? null : StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FontAttributes[] newArray(int i) {
                    return new FontAttributes[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Font> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Font createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Font(FontAttributes.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Font[] newArray(int i) {
                return new Font[i];
            }
        }
    }
}
