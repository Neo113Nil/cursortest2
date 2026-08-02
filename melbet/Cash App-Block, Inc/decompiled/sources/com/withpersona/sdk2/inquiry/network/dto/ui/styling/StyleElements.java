package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\u0018\u0000 \u00042\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements;", "", "<init>", "()V", "Companion", "Size", "Measurement", "MeasurementSet", "Position", "DPSize", "SizeSet", "SimpleElementColor", "SimpleElementColorValue", "ComplexElementColor", "PositionType", "FontName", "FontWeightContainer", "FontWeight", "ChildSizes", "AxisContainer", "Axis", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StyleElements {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Axis {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Axis[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Axis HORIZONTAL = new Axis("HORIZONTAL", 0);
        public static final Axis VERTICAL = new Axis("VERTICAL", 1);

        private static final /* synthetic */ Axis[] $values() {
            return new Axis[]{HORIZONTAL, VERTICAL};
        }

        static {
            Axis[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private Axis(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Axis valueOf(String str) {
            return (Axis) Enum.valueOf(Axis.class, str);
        }

        public static Axis[] values() {
            return (Axis[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public Axis fromJson(JsonReader reader) {
                reader.getClass();
                Object readJsonValue = reader.readJsonValue();
                if (!Intrinsics.areEqual(readJsonValue, "horizontal") && Intrinsics.areEqual(readJsonValue, "vertical")) {
                    return Axis.VERTICAL;
                }
                return Axis.HORIZONTAL;
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, Axis value) {
                writer.getClass();
            }
        }
    }

    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "dp", "", "<init>", "(D)V", "getDp", "()Ljava/lang/Double;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DPSize implements Parcelable, Size {
        private final double dp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<DPSize> CREATOR = new Creator();

        public DPSize(double d) {
            this.dp = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.Size
        public Double getDp() {
            return Double.valueOf(this.dp);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeDouble(this.dp);
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "<init>", "()V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public DPSize fromJson(JsonReader reader) {
                Double d;
                String str;
                double pxToDp;
                reader.getClass();
                if (reader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                    reader.beginObject();
                    d = null;
                    str = null;
                    while (reader.hasNext()) {
                        String nextName = reader.nextName();
                        if (Intrinsics.areEqual(nextName, "unit")) {
                            str = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else if (Intrinsics.areEqual(nextName, "value")) {
                            d = StyleElements.INSTANCE.getDoubleFromJsonReader(reader);
                        } else {
                            reader.skipValue();
                        }
                    }
                    reader.endObject();
                } else {
                    reader.skipValue();
                    d = null;
                    str = null;
                }
                if (Intrinsics.areEqual(str, "%") && d != null) {
                    pxToDp = StyleElementsKt.getPxToDp(Resources.getSystem().getDisplayMetrics().widthPixels);
                    d = Double.valueOf((d.doubleValue() / 100.0d) * pxToDp);
                }
                if (d == null) {
                    return null;
                }
                return new DPSize(d.doubleValue());
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, DPSize value) {
                writer.getClass();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DPSize> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSize createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DPSize(parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSize[] newArray(int i) {
                return new DPSize[i];
            }
        }
    }

    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "Landroid/os/Parcelable;", "fontName", "", "<init>", "(Ljava/lang/String;)V", "getFontName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FontName implements Parcelable {
        private final String fontName;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<FontName> CREATOR = new Creator();

        public /* synthetic */ FontName(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getFontName() {
            return this.fontName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.fontName);
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "<init>", "()V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public FontName fromJson(JsonReader reader) {
                reader.getClass();
                String str = null;
                if (reader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                    reader.beginObject();
                    while (reader.hasNext()) {
                        if (Intrinsics.areEqual(reader.nextName(), "base")) {
                            str = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else {
                            reader.skipValue();
                        }
                    }
                    reader.endObject();
                } else {
                    reader.skipValue();
                }
                return new FontName(str);
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, FontName value) {
                writer.getClass();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FontName> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FontName(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i) {
                return new FontName[i];
            }
        }

        public FontName(String str) {
            this.fontName = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FontName() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "NORMAL", "MEDIUM", "BOLD", "HEAVY", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FontWeight {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FontWeight[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FontWeight LIGHT = new FontWeight("LIGHT", 0);
        public static final FontWeight NORMAL = new FontWeight("NORMAL", 1);
        public static final FontWeight MEDIUM = new FontWeight("MEDIUM", 2);
        public static final FontWeight BOLD = new FontWeight("BOLD", 3);
        public static final FontWeight HEAVY = new FontWeight("HEAVY", 4);

        private static final /* synthetic */ FontWeight[] $values() {
            return new FontWeight[]{LIGHT, NORMAL, MEDIUM, BOLD, HEAVY};
        }

        static {
            FontWeight[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private FontWeight(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FontWeight valueOf(String str) {
            return (FontWeight) Enum.valueOf(FontWeight.class, str);
        }

        public static FontWeight[] values() {
            return (FontWeight[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public FontWeight fromJson(JsonReader reader) {
                reader.getClass();
                Object readJsonValue = reader.readJsonValue();
                return Intrinsics.areEqual(readJsonValue, "light") ? FontWeight.LIGHT : Intrinsics.areEqual(readJsonValue, "normal") ? FontWeight.NORMAL : Intrinsics.areEqual(readJsonValue, "medium") ? FontWeight.MEDIUM : Intrinsics.areEqual(readJsonValue, "bold") ? FontWeight.BOLD : Intrinsics.areEqual(readJsonValue, "heavy") ? FontWeight.HEAVY : FontWeight.NORMAL;
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, FontWeight value) {
                writer.getClass();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PositionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PositionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PositionType START = new PositionType("START", 0);
        public static final PositionType CENTER = new PositionType("CENTER", 1);
        public static final PositionType END = new PositionType("END", 2);

        private static final /* synthetic */ PositionType[] $values() {
            return new PositionType[]{START, CENTER, END};
        }

        static {
            PositionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private PositionType(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PositionType valueOf(String str) {
            return (PositionType) Enum.valueOf(PositionType.class, str);
        }

        public static PositionType[] values() {
            return (PositionType[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public PositionType fromJson(JsonReader reader) {
                reader.getClass();
                Object readJsonValue = reader.readJsonValue();
                if (Intrinsics.areEqual(readJsonValue, "start")) {
                    return PositionType.START;
                }
                if (Intrinsics.areEqual(readJsonValue, "center")) {
                    return PositionType.CENTER;
                }
                if (Intrinsics.areEqual(readJsonValue, "end")) {
                    return PositionType.END;
                }
                return null;
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, PositionType value) {
                writer.getClass();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "Landroid/os/Parcelable;", "dp", "", "getDp", "()Ljava/lang/Double;", "PercentSize", "Companion", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$PercentSize;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Size extends Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        Double getDp();

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$PercentSize;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "percent", "", "<init>", "(D)V", "getPercent", "()D", "dp", "getDp", "()Ljava/lang/Double;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PercentSize implements Size {
            public static final Parcelable.Creator<PercentSize> CREATOR = new Creator();
            private final double percent;

            public PercentSize(double d) {
                this.percent = d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.Size
            public Double getDp() {
                return null;
            }

            public final double getPercent() {
                return this.percent;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.getClass();
                dest.writeDouble(this.percent);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PercentSize> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PercentSize createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new PercentSize(parcel.readDouble());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PercentSize[] newArray(int i) {
                    return new PercentSize[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "<init>", "()V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public Size fromJson(JsonReader reader) {
                Double d;
                String str;
                reader.getClass();
                if (reader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                    reader.beginObject();
                    d = null;
                    str = null;
                    while (reader.hasNext()) {
                        String nextName = reader.nextName();
                        if (Intrinsics.areEqual(nextName, "unit")) {
                            str = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else if (Intrinsics.areEqual(nextName, "value")) {
                            d = StyleElements.INSTANCE.getDoubleFromJsonReader(reader);
                        } else {
                            reader.skipValue();
                        }
                    }
                    reader.endObject();
                } else {
                    reader.skipValue();
                    d = null;
                    str = null;
                }
                if (Intrinsics.areEqual(str, "%") && d != null) {
                    return new PercentSize(d.doubleValue() / 100.0d);
                }
                if (d != null) {
                    return new DPSize(d.doubleValue());
                }
                return null;
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, Size value) {
                writer.getClass();
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AxisContainer implements Parcelable {
        public static final Parcelable.Creator<AxisContainer> CREATOR = new Creator();
        private final Axis base;

        public AxisContainer(Axis axis) {
            this.base = axis;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Axis getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Axis axis = this.base;
            if (axis == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(axis.name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AxisContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AxisContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new AxisContainer(parcel.readInt() == 0 ? null : Axis.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AxisContainer[] newArray(int i) {
                return new AxisContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;", "Landroid/os/Parcelable;", "base", "", "<init>", "([I)V", "getBase", "()[I", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChildSizes implements Parcelable {
        public static final Parcelable.Creator<ChildSizes> CREATOR = new Creator();
        private final int[] base;

        public ChildSizes(int[] iArr) {
            this.base = iArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int[] getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeIntArray(this.base);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChildSizes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChildSizes createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ChildSizes(parcel.createIntArray());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChildSizes[] newArray(int i) {
                return new ChildSizes[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Companion;", "", "<init>", "()V", "getStringFromJsonReader", "", "reader", "Lcom/squareup/moshi/JsonReader;", "getDoubleFromJsonReader", "", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Double;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Double getDoubleFromJsonReader(JsonReader reader) {
            if (reader.peek() != JsonReader.Token.NULL) {
                return Double.valueOf(reader.nextDouble());
            }
            reader.skipValue();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getStringFromJsonReader(JsonReader reader) {
            if (reader.peek() != JsonReader.Token.NULL) {
                return reader.nextString();
            }
            reader.skipValue();
            return null;
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "Landroid/os/Parcelable;", "_base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "_focused", "_active", "_disabled", "_errored", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;)V", "get_base", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "get_focused", "get_active", "get_disabled", "get_errored", "base", "", "getBase", "()Ljava/lang/Integer;", "focused", "getFocused", "active", "getActive", "disabled", "getDisabled", "errored", "getErrored", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexElementColor implements Parcelable {
        public static final Parcelable.Creator<ComplexElementColor> CREATOR = new Creator();
        private final SimpleElementColorValue _active;
        private final SimpleElementColorValue _base;
        private final SimpleElementColorValue _disabled;
        private final SimpleElementColorValue _errored;
        private final SimpleElementColorValue _focused;

        public ComplexElementColor(@Json(name = "base") SimpleElementColorValue simpleElementColorValue, @Json(name = "focused") SimpleElementColorValue simpleElementColorValue2, @Json(name = "active") SimpleElementColorValue simpleElementColorValue3, @Json(name = "disabled") SimpleElementColorValue simpleElementColorValue4, @Json(name = "errored") SimpleElementColorValue simpleElementColorValue5) {
            this._base = simpleElementColorValue;
            this._focused = simpleElementColorValue2;
            this._active = simpleElementColorValue3;
            this._disabled = simpleElementColorValue4;
            this._errored = simpleElementColorValue5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer getActive() {
            SimpleElementColorValue simpleElementColorValue = this._active;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getBase() {
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getDisabled() {
            SimpleElementColorValue simpleElementColorValue = this._disabled;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getErrored() {
            SimpleElementColorValue simpleElementColorValue = this._errored;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getFocused() {
            SimpleElementColorValue simpleElementColorValue = this._focused;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final SimpleElementColorValue get_active() {
            return this._active;
        }

        public final SimpleElementColorValue get_base() {
            return this._base;
        }

        public final SimpleElementColorValue get_disabled() {
            return this._disabled;
        }

        public final SimpleElementColorValue get_errored() {
            return this._errored;
        }

        public final SimpleElementColorValue get_focused() {
            return this._focused;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue2 = this._focused;
            if (simpleElementColorValue2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue2.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue3 = this._active;
            if (simpleElementColorValue3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue3.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue4 = this._disabled;
            if (simpleElementColorValue4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue4.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue5 = this._errored;
            if (simpleElementColorValue5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexElementColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexElementColor createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SimpleElementColorValue.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexElementColor[] newArray(int i) {
                return new ComplexElementColor[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FontWeightContainer implements Parcelable {
        public static final Parcelable.Creator<FontWeightContainer> CREATOR = new Creator();
        private final FontWeight base;

        public FontWeightContainer(FontWeight fontWeight) {
            this.base = fontWeight;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final FontWeight getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            FontWeight fontWeight = this.base;
            if (fontWeight == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(fontWeight.name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FontWeightContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeightContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FontWeightContainer(parcel.readInt() == 0 ? null : FontWeight.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeightContainer[] newArray(int i) {
                return new FontWeightContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Measurement implements Parcelable {
        public static final Parcelable.Creator<Measurement> CREATOR = new Creator();
        private final Size base;

        public Measurement(Size size) {
            this.base = size;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Size getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.base, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Measurement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Measurement createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Measurement((Size) parcel.readParcelable(Measurement.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Measurement[] newArray(int i) {
                return new Measurement[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MeasurementSet implements Parcelable {
        public static final Parcelable.Creator<MeasurementSet> CREATOR = new Creator();
        private final SizeSet base;

        public MeasurementSet(SizeSet sizeSet) {
            this.base = sizeSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SizeSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            SizeSet sizeSet = this.base;
            if (sizeSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                sizeSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MeasurementSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MeasurementSet createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MeasurementSet(parcel.readInt() == 0 ? null : SizeSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MeasurementSet[] newArray(int i) {
                return new MeasurementSet[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Position implements Parcelable {
        public static final Parcelable.Creator<Position> CREATOR = new Creator();
        private final PositionType base;

        public Position(PositionType positionType) {
            this.base = positionType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final PositionType getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            PositionType positionType = this.base;
            if (positionType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(positionType.name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Position(parcel.readInt() == 0 ? null : PositionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position[] newArray(int i) {
                return new Position[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SimpleElementColor implements Parcelable {
        public static final Parcelable.Creator<SimpleElementColor> CREATOR = new Creator();
        private final SimpleElementColorValue base;

        public SimpleElementColor(SimpleElementColorValue simpleElementColorValue) {
            this.base = simpleElementColorValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SimpleElementColorValue getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            SimpleElementColorValue simpleElementColorValue = this.base;
            if (simpleElementColorValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SimpleElementColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColor createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SimpleElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColor[] newArray(int i) {
                return new SimpleElementColor[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "Landroid/os/Parcelable;", "value", "", "<init>", "(Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SimpleElementColorValue implements Parcelable {
        public static final Parcelable.Creator<SimpleElementColorValue> CREATOR = new Creator();
        private final Integer value;

        public SimpleElementColorValue(@RgbaHexColor Integer num) {
            this.value = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Integer num = this.value;
            if (num == null) {
                dest.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(dest, 1, num);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SimpleElementColorValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColorValue createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SimpleElementColorValue(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColorValue[] newArray(int i) {
                return new SimpleElementColorValue[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "Landroid/os/Parcelable;", "top", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "bottom", "left", "right", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "getTop", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getBottom", "getLeft", "getRight", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SizeSet implements Parcelable {
        public static final Parcelable.Creator<SizeSet> CREATOR = new Creator();
        private final Size bottom;
        private final Size left;
        private final Size right;
        private final Size top;

        public SizeSet(Size size, Size size2, Size size3, Size size4) {
            this.top = size;
            this.bottom = size2;
            this.left = size3;
            this.right = size4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Size getBottom() {
            return this.bottom;
        }

        public final Size getLeft() {
            return this.left;
        }

        public final Size getRight() {
            return this.right;
        }

        public final Size getTop() {
            return this.top;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.top, flags);
            dest.writeParcelable(this.bottom, flags);
            dest.writeParcelable(this.left, flags);
            dest.writeParcelable(this.right, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SizeSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SizeSet createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SizeSet((Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SizeSet[] newArray(int i) {
                return new SizeSet[i];
            }
        }
    }
}
