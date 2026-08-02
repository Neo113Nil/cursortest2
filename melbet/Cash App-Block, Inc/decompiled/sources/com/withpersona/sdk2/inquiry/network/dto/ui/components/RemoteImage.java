package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.Tags;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0004%&'(B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "height", "getHeight", "justification", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustification", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RemoteImageComponentStyle", "Attributes", "ContentType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RemoteImage implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1510type = "image_remote";
    private final Attributes attributes;
    private final String name;
    private final RemoteImageComponentStyle styles;
    public static final Parcelable.Creator<RemoteImage> CREATOR = new Creator();

    public RemoteImage(String str, Attributes attributes, RemoteImageComponentStyle remoteImageComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = remoteImageComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StyleElements.Size getHeight() {
        String height;
        Double doubleOrNull;
        AttributeStyles.RemoteImageHeightStyle height2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle != null && (height2 = remoteImageComponentStyle.getHeight()) != null && (base = height2.getBase()) != null && (base2 = base.getBase()) != null) {
            return base2;
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (height = attributes.getHeight()) == null || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(StringsKt__StringsJVMKt.replace$default(height, "px", ""))) == null) {
            return null;
        }
        return new StyleElements.DPSize(doubleOrNull.doubleValue());
    }

    public final StyleElements.PositionType getJustification() {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null || (justify = remoteImageComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final StyleElements.SizeSet getMargin() {
        AttributeStyles.RemoteImageMarginStyle margin;
        StyleElements.MeasurementSet base;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null || (margin = remoteImageComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final RemoteImageComponentStyle getStyles() {
        return this.styles;
    }

    public final StyleElements.Size getWidth() {
        String width;
        Double doubleOrNull;
        AttributeStyles.RemoteImageWidthStyle width2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle != null && (width2 = remoteImageComponentStyle.getWidth()) != null && (base = width2.getBase()) != null && (base2 = base.getBase()) != null) {
            return base2;
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (width = attributes.getWidth()) == null || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(StringsKt__StringsJVMKt.replace$default(width, "px", ""))) == null) {
            return null;
        }
        return new StyleElements.DPSize(doubleOrNull.doubleValue());
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
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remoteImageComponentStyle.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "JSON", "SVG", "Image", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ContentType JSON = new ContentType("JSON", 0);
        public static final ContentType SVG = new ContentType("SVG", 1);
        public static final ContentType Image = new ContentType("Image", 2);

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{JSON, SVG, Image};
        }

        static {
            ContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private ContentType(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public ContentType fromJson(JsonReader reader) {
                reader.getClass();
                Object readJsonValue = reader.readJsonValue();
                return Intrinsics.areEqual(readJsonValue, "application/json") ? ContentType.JSON : Intrinsics.areEqual(readJsonValue, "image/svg+xml") ? ContentType.SVG : ContentType.Image;
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, ContentType value) {
                writer.getClass();
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "localAssetName", "", "localAssetContentType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "url", "width", "height", CMSAttributeTableGenerator.CONTENT_TYPE, "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getLocalAssetName", "()Ljava/lang/String;", "getLocalAssetContentType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "getUrl", "getWidth", "getHeight", "getContentType", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final ContentType contentType;
        private final String height;
        private final JsonLogicBoolean hidden;
        private final ContentType localAssetContentType;
        private final String localAssetName;
        private final String url;
        private final String width;

        public /* synthetic */ Attributes(String str, ContentType contentType, String str2, String str3, String str4, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : contentType, str2, str3, str4, (i & 32) != 0 ? ContentType.Image : contentType2, (i & 64) != 0 ? null : jsonLogicBoolean);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ContentType getContentType() {
            return this.contentType;
        }

        public final String getHeight() {
            return this.height;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final ContentType getLocalAssetContentType() {
            return this.localAssetContentType;
        }

        public final String getLocalAssetName() {
            return this.localAssetName;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.localAssetName);
            ContentType contentType = this.localAssetContentType;
            if (contentType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(contentType.name());
            }
            dest.writeString(this.url);
            dest.writeString(this.width);
            dest.writeString(this.height);
            dest.writeString(this.contentType.name());
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : ContentType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), ContentType.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, ContentType contentType, String str2, String str3, String str4, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean) {
            str2.getClass();
            contentType2.getClass();
            this.localAssetName = str;
            this.localAssetContentType = contentType;
            this.url = str2;
            this.width = str3;
            this.height = str4;
            this.contentType = contentType2;
            this.hidden = jsonLogicBoolean;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010.\u001a\u00020\u001dJ\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010&\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0013\u0010(\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0013\u0010*\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0013\u0010,\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001f¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "Landroid/os/Parcelable;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;)V", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "newStrokeColorValue", "", "getNewStrokeColorValue", "()Ljava/lang/Integer;", "newFillColorValue", "getNewFillColorValue", "newHighlightColorValue", "getNewHighlightColorValue", "newBackgroundColorValue", "getNewBackgroundColorValue", "originalStrokeColorValue", "getOriginalStrokeColorValue", "originalFillColorValue", "getOriginalFillColorValue", "originalHighlightColorValue", "getOriginalHighlightColorValue", "originalBackgroundColorValue", "getOriginalBackgroundColorValue", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageComponentStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.RemoteImageFillColorStyle fillColor;
        private final AttributeStyles.RemoteImageHeightStyle height;
        private final AttributeStyles.RemoteImageJustifyStyle justify;
        private final AttributeStyles.RemoteImageMarginStyle margin;
        private final AttributeStyles.RemoteImageStrokeColorStyle strokeColor;
        private final AttributeStyles.RemoteImageWidthStyle width;

        public RemoteImageComponentStyle(AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle, AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle, AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle, AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle, AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle) {
            this.height = remoteImageHeightStyle;
            this.width = remoteImageWidthStyle;
            this.justify = remoteImageJustifyStyle;
            this.margin = remoteImageMarginStyle;
            this.strokeColor = remoteImageStrokeColorStyle;
            this.fillColor = remoteImageFillColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.RemoteImageFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final AttributeStyles.RemoteImageHeightStyle getHeight() {
            return this.height;
        }

        public final AttributeStyles.RemoteImageJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.RemoteImageMarginStyle getMargin() {
            return this.margin;
        }

        public final Integer getNewBackgroundColorValue() {
            StyleElements.SimpleElementColor background;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (background = remoteImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewFillColorValue() {
            StyleElements.SimpleElementColor fill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (fill = remoteImageFillColorStyle.getFill()) == null || (base = fill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewHighlightColorValue() {
            StyleElements.SimpleElementColor highlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (highlight = remoteImageFillColorStyle.getHighlight()) == null || (base = highlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewStrokeColorValue() {
            StyleElements.SimpleElementColor stroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (stroke = remoteImageStrokeColorStyle.getStroke()) == null || (base = stroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalBackgroundColorValue() {
            StyleElements.SimpleElementColor originalBackground;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalBackground = remoteImageFillColorStyle.getOriginalBackground()) == null || (base = originalBackground.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalFillColorValue() {
            StyleElements.SimpleElementColor originalFill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalFill = remoteImageFillColorStyle.getOriginalFill()) == null || (base = originalFill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalHighlightColorValue() {
            StyleElements.SimpleElementColor originalHighlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalHighlight = remoteImageFillColorStyle.getOriginalHighlight()) == null || (base = originalHighlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalStrokeColorValue() {
            StyleElements.SimpleElementColor originalStroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (originalStroke = remoteImageStrokeColorStyle.getOriginalStroke()) == null || (base = originalStroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final AttributeStyles.RemoteImageStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.RemoteImageWidthStyle getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
            if (remoteImageHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
            if (remoteImageWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = this.justify;
            if (remoteImageJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
            if (remoteImageMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageStrokeColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageFillColorStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageComponentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.RemoteImageFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageComponentStyle[] newArray(int i) {
                return new RemoteImageComponentStyle[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoteImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteImage createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RemoteImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteImage[] newArray(int i) {
            return new RemoteImage[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }
}
