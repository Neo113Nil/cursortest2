package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003%&'B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001f\u001a\u00020\u0011J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$FooterComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$FooterComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$FooterComponentStyle;", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/Integer;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "borderWidth", "getBorderWidth", "children", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "getChildren", "()Ljava/util/List;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FooterComponentStyle", "Attributes", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Footer implements UiComponentContainerConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1485type = "footer";
    private final Attributes attributes;
    private final String name;
    private final FooterComponentStyle styles;
    public static final Parcelable.Creator<Footer> CREATOR = new Creator();

    public Footer(String str, Attributes attributes, FooterComponentStyle footerComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = footerComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer getBackgroundColor() {
        AttributeStyles.FooterColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null || (backgroundColor = footerComponentStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final StyleElements.SizeSet getBorderWidth() {
        AttributeStyles.FooterBorderWidthStyle borderWidth;
        StyleElements.MeasurementSet base;
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null || (borderWidth = footerComponentStyle.getBorderWidth()) == null || (base = borderWidth.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig
    public List<UiComponentConfig> getChildren() {
        Attributes attributes = getAttributes();
        if (attributes != null) {
            return attributes.getChildren();
        }
        return null;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final StyleElements.SizeSet getPadding() {
        AttributeStyles.FooterPaddingStyle padding;
        StyleElements.MeasurementSet base;
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null || (padding = footerComponentStyle.getPadding()) == null || (base = padding.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final FooterComponentStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footerComponentStyle.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "children", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "firstBelowTheFoldChildIndex", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getChildren", "()Ljava/util/List;", "getFirstBelowTheFoldChildIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final List<UiComponentConfig> children;
        private final Integer firstBelowTheFoldChildIndex;

        public Attributes(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        public final Integer getFirstBelowTheFoldChildIndex() {
            return this.firstBelowTheFoldChildIndex;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.children, dest);
            while (m.hasNext()) {
                dest.writeParcelable((Parcelable) m.next(), flags);
            }
            Integer num = this.firstBelowTheFoldChildIndex;
            if (num == null) {
                dest.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(dest, 1, num);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(Attributes.class, parcel, arrayList, i, 1);
                }
                return new Attributes(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(List<? extends UiComponentConfig> list, Integer num) {
            list.getClass();
            this.children = list;
            this.firstBelowTheFoldChildIndex = num;
        }

        public Attributes() {
            this(null, null, 3, null);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$FooterComponentStyle;", "Landroid/os/Parcelable;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;)V", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterComponentStyle implements Parcelable {
        public static final Parcelable.Creator<FooterComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.FooterColorStyle backgroundColor;
        private final AttributeStyles.FooterBorderWidthStyle borderWidth;
        private final AttributeStyles.FooterPaddingStyle padding;

        public FooterComponentStyle(AttributeStyles.FooterColorStyle footerColorStyle, AttributeStyles.FooterPaddingStyle footerPaddingStyle, AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle) {
            this.backgroundColor = footerColorStyle;
            this.padding = footerPaddingStyle;
            this.borderWidth = footerBorderWidthStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.FooterColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.FooterBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.FooterPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.FooterColorStyle footerColorStyle = this.backgroundColor;
            if (footerColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footerColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.FooterPaddingStyle footerPaddingStyle = this.padding;
            if (footerPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footerPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = this.borderWidth;
            if (footerBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                footerBorderWidthStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FooterComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterComponentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FooterComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.FooterColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.FooterPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.FooterBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterComponentStyle[] newArray(int i) {
                return new FooterComponentStyle[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Footer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Footer createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FooterComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Footer[] newArray(int i) {
            return new Footer[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public /* synthetic */ Footer(String str, Attributes attributes, FooterComponentStyle footerComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : footerComponentStyle);
    }
}
