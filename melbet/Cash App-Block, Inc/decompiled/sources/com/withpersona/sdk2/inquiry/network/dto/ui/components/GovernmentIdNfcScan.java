package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0006\u0017\u0018\u0019\u001a\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "GovernmentIdNfcScanStyles", "DataGroupTypes", "Attributes", "ScanHint", "TipsButtonLocation", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GovernmentIdNfcScan implements UiComponentConfig {
    public static final String cardAccessNumberName = "card_access_number";
    public static final String dateOfBirthName = "date_of_birth";
    public static final String documentNumberName = "document_number";
    public static final String expirationDateName = "expiration_date";
    public static final String launchButtonName = "launch_button";

    /* renamed from: type, reason: collision with root package name */
    public static final String f1486type = "government_id_nfc_scan";
    private final Attributes attributes;
    private final String name;
    private final GovernmentIdNfcScanStyles styles;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new Creator();

    public GovernmentIdNfcScan(String str, Attributes attributes, GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = governmentIdNfcScanStyles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final GovernmentIdNfcScanStyles getStyles() {
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
        GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.styles;
        if (governmentIdNfcScanStyles == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            governmentIdNfcScanStyles.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "", "<init>", "(Ljava/lang/String;I)V", "Dg1", "Dg2", "Dg14", "Sod", "Unknown", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataGroupTypes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DataGroupTypes[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DataGroupTypes Dg1 = new DataGroupTypes("Dg1", 0);
        public static final DataGroupTypes Dg2 = new DataGroupTypes("Dg2", 1);
        public static final DataGroupTypes Dg14 = new DataGroupTypes("Dg14", 2);
        public static final DataGroupTypes Sod = new DataGroupTypes("Sod", 3);
        public static final DataGroupTypes Unknown = new DataGroupTypes("Unknown", 4);

        private static final /* synthetic */ DataGroupTypes[] $values() {
            return new DataGroupTypes[]{Dg1, Dg2, Dg14, Sod, Unknown};
        }

        static {
            DataGroupTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private DataGroupTypes(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static DataGroupTypes valueOf(String str) {
            return (DataGroupTypes) Enum.valueOf(DataGroupTypes.class, str);
        }

        public static DataGroupTypes[] values() {
            return (DataGroupTypes[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public DataGroupTypes fromJson(JsonReader reader) {
                reader.getClass();
                Object readJsonValue = reader.readJsonValue();
                return Intrinsics.areEqual(readJsonValue, "dg1") ? DataGroupTypes.Dg1 : Intrinsics.areEqual(readJsonValue, "dg2") ? DataGroupTypes.Dg2 : Intrinsics.areEqual(readJsonValue, "dg14") ? DataGroupTypes.Dg14 : Intrinsics.areEqual(readJsonValue, "sod") ? DataGroupTypes.Sod : DataGroupTypes.Unknown;
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, DataGroupTypes value) {
                writer.getClass();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "", "<init>", "(Ljava/lang/String;I)V", "NavigationBar", "OnScreen", "Unknown", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TipsButtonLocation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TipsButtonLocation[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TipsButtonLocation NavigationBar = new TipsButtonLocation("NavigationBar", 0);
        public static final TipsButtonLocation OnScreen = new TipsButtonLocation("OnScreen", 1);
        public static final TipsButtonLocation Unknown = new TipsButtonLocation("Unknown", 2);

        private static final /* synthetic */ TipsButtonLocation[] $values() {
            return new TipsButtonLocation[]{NavigationBar, OnScreen, Unknown};
        }

        static {
            TipsButtonLocation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        private TipsButtonLocation(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static TipsButtonLocation valueOf(String str) {
            return (TipsButtonLocation) Enum.valueOf(TipsButtonLocation.class, str);
        }

        public static TipsButtonLocation[] values() {
            return (TipsButtonLocation[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion extends JsonAdapter {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public TipsButtonLocation fromJson(JsonReader reader) {
                reader.getClass();
                Object readJsonValue = reader.readJsonValue();
                return Intrinsics.areEqual(readJsonValue, "navigation_bar") ? TipsButtonLocation.NavigationBar : Intrinsics.areEqual(readJsonValue, "on_screen") ? TipsButtonLocation.OnScreen : TipsButtonLocation.Unknown;
            }

            private Companion() {
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, TipsButtonLocation value) {
                writer.getClass();
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bó\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0014\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\b\u00101\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u00010\u0006\u0012\b\u00103\u001a\u0004\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006\u0012\b\u00105\u001a\u0004\u0018\u00010\u0006\u0012\b\u00106\u001a\u0004\u0018\u00010\u0006\u0012\b\u00107\u001a\u0004\u0018\u000108¢\u0006\u0004\b9\u0010:J\u0006\u0010q\u001a\u00020rJ\u0016\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010?R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010?R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010?R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010?R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010?R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010?R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u0010?R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010?R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bO\u0010?R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u0010?R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010?R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010?R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bT\u0010?R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u0010?R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010X\u001a\u0004\bV\u0010WR\u0013\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bY\u0010?R\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010?R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b[\u0010?R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010MR\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b]\u0010?R\u0013\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b^\u0010?R\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010?R\u0013\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u0010?R\u0013\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\ba\u0010?R\u0013\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010?R\u0013\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bc\u0010?R\u0013\u0010,\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bd\u0010?R\u0013\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\be\u0010?R\u0013\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bf\u0010?R\u0013\u0010/\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010?R\u0013\u00100\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010?R\u0013\u00101\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010?R\u0013\u00102\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bj\u0010?R\u0013\u00103\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bk\u0010?R\u0013\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bl\u0010?R\u0013\u00105\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bm\u0010?R\u0013\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bn\u0010?R\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bo\u0010p¨\u0006x"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "documentNumberLabel", "", "prefillCardAccessNumber", "prefillDocumentNumber", "dateOfBirthLabel", "prefillDateOfBirth", "cardAccessNumberLabel", "expirationDateLabel", "prefillExpirationDate", "launchButtonText", "scanDocumentPrompt", "scanDocumentPromptTitle", "scanDocumentSuccess", "scanDocumentSuccessTitle", "enabledDataGroups", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "authenticating", "authenticatingTitle", "reading", "readingTitle", "requiredText", "scanDocumentError", "enableNfcPrompt", "authenticationErrorPrompt", "hidePrefilledInputs", "", "connectionLostPrompt", "unsupportedDocumentType", "retryError", "scanHints", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$ScanHint;", "hintsSheetTitle", "closeHintSheetButtonText", "userUnableToScanHintSheetButtonText", "errorModalChipNotDetectedTitle", "errorModalChipNotDetectedText", "errorModalLostConnectionTitle", "errorModalLostConnectionText", "errorModalIncorrectIdDetailsTitle", "errorModalIncorrectIdDetailsText", "errorModalGenericErrorTitle", "errorModalGenericErrorText", "errorModalTryAgainButtonText", "errorModalTroubleshootingTipsButtonText", "errorModalReenterIdDetailsButtonText", "rescanDocumentPrompt", "successfulScanTransitionComponentName", "unableToScanTransitionComponentName", "incorrectIdDetailsTransitionComponentName", "tipsButtonLocation", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;)V", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getDocumentNumberLabel", "()Ljava/lang/String;", "getPrefillCardAccessNumber", "getPrefillDocumentNumber", "getDateOfBirthLabel", "getPrefillDateOfBirth", "getCardAccessNumberLabel", "getExpirationDateLabel", "getPrefillExpirationDate", "getLaunchButtonText", "getScanDocumentPrompt", "getScanDocumentPromptTitle", "getScanDocumentSuccess", "getScanDocumentSuccessTitle", "getEnabledDataGroups", "()Ljava/util/List;", "getAuthenticating", "getAuthenticatingTitle", "getReading", "getReadingTitle", "getRequiredText", "getScanDocumentError", "getEnableNfcPrompt", "getAuthenticationErrorPrompt", "getHidePrefilledInputs", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getConnectionLostPrompt", "getUnsupportedDocumentType", "getRetryError", "getScanHints", "getHintsSheetTitle", "getCloseHintSheetButtonText", "getUserUnableToScanHintSheetButtonText", "getErrorModalChipNotDetectedTitle", "getErrorModalChipNotDetectedText", "getErrorModalLostConnectionTitle", "getErrorModalLostConnectionText", "getErrorModalIncorrectIdDetailsTitle", "getErrorModalIncorrectIdDetailsText", "getErrorModalGenericErrorTitle", "getErrorModalGenericErrorText", "getErrorModalTryAgainButtonText", "getErrorModalTroubleshootingTipsButtonText", "getErrorModalReenterIdDetailsButtonText", "getRescanDocumentPrompt", "getSuccessfulScanTransitionComponentName", "getUnableToScanTransitionComponentName", "getIncorrectIdDetailsTransitionComponentName", "getTipsButtonLocation", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String authenticating;
        private final String authenticatingTitle;
        private final String authenticationErrorPrompt;
        private final String cardAccessNumberLabel;
        private final String closeHintSheetButtonText;
        private final String connectionLostPrompt;
        private final String dateOfBirthLabel;
        private final JsonLogicBoolean disabled;
        private final String documentNumberLabel;
        private final String enableNfcPrompt;
        private final List<DataGroupTypes> enabledDataGroups;
        private final String errorModalChipNotDetectedText;
        private final String errorModalChipNotDetectedTitle;
        private final String errorModalGenericErrorText;
        private final String errorModalGenericErrorTitle;
        private final String errorModalIncorrectIdDetailsText;
        private final String errorModalIncorrectIdDetailsTitle;
        private final String errorModalLostConnectionText;
        private final String errorModalLostConnectionTitle;
        private final String errorModalReenterIdDetailsButtonText;
        private final String errorModalTroubleshootingTipsButtonText;
        private final String errorModalTryAgainButtonText;
        private final String expirationDateLabel;
        private final JsonLogicBoolean hidden;
        private final Boolean hidePrefilledInputs;
        private final String hintsSheetTitle;
        private final String incorrectIdDetailsTransitionComponentName;
        private final String launchButtonText;
        private final String prefillCardAccessNumber;
        private final String prefillDateOfBirth;
        private final String prefillDocumentNumber;
        private final String prefillExpirationDate;
        private final String reading;
        private final String readingTitle;
        private final String requiredText;
        private final String rescanDocumentPrompt;
        private final String retryError;
        private final String scanDocumentError;
        private final String scanDocumentPrompt;
        private final String scanDocumentPromptTitle;
        private final String scanDocumentSuccess;
        private final String scanDocumentSuccessTitle;
        private final List<ScanHint> scanHints;
        private final String successfulScanTransitionComponentName;
        private final TipsButtonLocation tipsButtonLocation;
        private final String unableToScanTransitionComponentName;
        private final String unsupportedDocumentType;
        private final String userUnableToScanHintSheetButtonText;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<? extends DataGroupTypes> list, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, String str24, List<ScanHint> list2, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, TipsButtonLocation tipsButtonLocation) {
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.documentNumberLabel = str;
            this.prefillCardAccessNumber = str2;
            this.prefillDocumentNumber = str3;
            this.dateOfBirthLabel = str4;
            this.prefillDateOfBirth = str5;
            this.cardAccessNumberLabel = str6;
            this.expirationDateLabel = str7;
            this.prefillExpirationDate = str8;
            this.launchButtonText = str9;
            this.scanDocumentPrompt = str10;
            this.scanDocumentPromptTitle = str11;
            this.scanDocumentSuccess = str12;
            this.scanDocumentSuccessTitle = str13;
            this.enabledDataGroups = list;
            this.authenticating = str14;
            this.authenticatingTitle = str15;
            this.reading = str16;
            this.readingTitle = str17;
            this.requiredText = str18;
            this.scanDocumentError = str19;
            this.enableNfcPrompt = str20;
            this.authenticationErrorPrompt = str21;
            this.hidePrefilledInputs = bool;
            this.connectionLostPrompt = str22;
            this.unsupportedDocumentType = str23;
            this.retryError = str24;
            this.scanHints = list2;
            this.hintsSheetTitle = str25;
            this.closeHintSheetButtonText = str26;
            this.userUnableToScanHintSheetButtonText = str27;
            this.errorModalChipNotDetectedTitle = str28;
            this.errorModalChipNotDetectedText = str29;
            this.errorModalLostConnectionTitle = str30;
            this.errorModalLostConnectionText = str31;
            this.errorModalIncorrectIdDetailsTitle = str32;
            this.errorModalIncorrectIdDetailsText = str33;
            this.errorModalGenericErrorTitle = str34;
            this.errorModalGenericErrorText = str35;
            this.errorModalTryAgainButtonText = str36;
            this.errorModalTroubleshootingTipsButtonText = str37;
            this.errorModalReenterIdDetailsButtonText = str38;
            this.rescanDocumentPrompt = str39;
            this.successfulScanTransitionComponentName = str40;
            this.unableToScanTransitionComponentName = str41;
            this.incorrectIdDetailsTransitionComponentName = str42;
            this.tipsButtonLocation = tipsButtonLocation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getAuthenticating() {
            return this.authenticating;
        }

        public final String getAuthenticatingTitle() {
            return this.authenticatingTitle;
        }

        public final String getAuthenticationErrorPrompt() {
            return this.authenticationErrorPrompt;
        }

        public final String getCardAccessNumberLabel() {
            return this.cardAccessNumberLabel;
        }

        public final String getCloseHintSheetButtonText() {
            return this.closeHintSheetButtonText;
        }

        public final String getConnectionLostPrompt() {
            return this.connectionLostPrompt;
        }

        public final String getDateOfBirthLabel() {
            return this.dateOfBirthLabel;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getDocumentNumberLabel() {
            return this.documentNumberLabel;
        }

        public final String getEnableNfcPrompt() {
            return this.enableNfcPrompt;
        }

        public final List<DataGroupTypes> getEnabledDataGroups() {
            return this.enabledDataGroups;
        }

        public final String getErrorModalChipNotDetectedText() {
            return this.errorModalChipNotDetectedText;
        }

        public final String getErrorModalChipNotDetectedTitle() {
            return this.errorModalChipNotDetectedTitle;
        }

        public final String getErrorModalGenericErrorText() {
            return this.errorModalGenericErrorText;
        }

        public final String getErrorModalGenericErrorTitle() {
            return this.errorModalGenericErrorTitle;
        }

        public final String getErrorModalIncorrectIdDetailsText() {
            return this.errorModalIncorrectIdDetailsText;
        }

        public final String getErrorModalIncorrectIdDetailsTitle() {
            return this.errorModalIncorrectIdDetailsTitle;
        }

        public final String getErrorModalLostConnectionText() {
            return this.errorModalLostConnectionText;
        }

        public final String getErrorModalLostConnectionTitle() {
            return this.errorModalLostConnectionTitle;
        }

        public final String getErrorModalReenterIdDetailsButtonText() {
            return this.errorModalReenterIdDetailsButtonText;
        }

        public final String getErrorModalTroubleshootingTipsButtonText() {
            return this.errorModalTroubleshootingTipsButtonText;
        }

        public final String getErrorModalTryAgainButtonText() {
            return this.errorModalTryAgainButtonText;
        }

        public final String getExpirationDateLabel() {
            return this.expirationDateLabel;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final Boolean getHidePrefilledInputs() {
            return this.hidePrefilledInputs;
        }

        public final String getHintsSheetTitle() {
            return this.hintsSheetTitle;
        }

        public final String getIncorrectIdDetailsTransitionComponentName() {
            return this.incorrectIdDetailsTransitionComponentName;
        }

        public final String getLaunchButtonText() {
            return this.launchButtonText;
        }

        public final String getPrefillCardAccessNumber() {
            return this.prefillCardAccessNumber;
        }

        public final String getPrefillDateOfBirth() {
            return this.prefillDateOfBirth;
        }

        public final String getPrefillDocumentNumber() {
            return this.prefillDocumentNumber;
        }

        public final String getPrefillExpirationDate() {
            return this.prefillExpirationDate;
        }

        public final String getReading() {
            return this.reading;
        }

        public final String getReadingTitle() {
            return this.readingTitle;
        }

        public final String getRequiredText() {
            return this.requiredText;
        }

        public final String getRescanDocumentPrompt() {
            return this.rescanDocumentPrompt;
        }

        public final String getRetryError() {
            return this.retryError;
        }

        public final String getScanDocumentError() {
            return this.scanDocumentError;
        }

        public final String getScanDocumentPrompt() {
            return this.scanDocumentPrompt;
        }

        public final String getScanDocumentPromptTitle() {
            return this.scanDocumentPromptTitle;
        }

        public final String getScanDocumentSuccess() {
            return this.scanDocumentSuccess;
        }

        public final String getScanDocumentSuccessTitle() {
            return this.scanDocumentSuccessTitle;
        }

        public final List<ScanHint> getScanHints() {
            return this.scanHints;
        }

        public final String getSuccessfulScanTransitionComponentName() {
            return this.successfulScanTransitionComponentName;
        }

        public final TipsButtonLocation getTipsButtonLocation() {
            return this.tipsButtonLocation;
        }

        public final String getUnableToScanTransitionComponentName() {
            return this.unableToScanTransitionComponentName;
        }

        public final String getUnsupportedDocumentType() {
            return this.unsupportedDocumentType;
        }

        public final String getUserUnableToScanHintSheetButtonText() {
            return this.userUnableToScanHintSheetButtonText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
            dest.writeString(this.documentNumberLabel);
            dest.writeString(this.prefillCardAccessNumber);
            dest.writeString(this.prefillDocumentNumber);
            dest.writeString(this.dateOfBirthLabel);
            dest.writeString(this.prefillDateOfBirth);
            dest.writeString(this.cardAccessNumberLabel);
            dest.writeString(this.expirationDateLabel);
            dest.writeString(this.prefillExpirationDate);
            dest.writeString(this.launchButtonText);
            dest.writeString(this.scanDocumentPrompt);
            dest.writeString(this.scanDocumentPromptTitle);
            dest.writeString(this.scanDocumentSuccess);
            dest.writeString(this.scanDocumentSuccessTitle);
            List<DataGroupTypes> list = this.enabledDataGroups;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list);
                while (m.hasNext()) {
                    dest.writeString(((DataGroupTypes) m.next()).name());
                }
            }
            dest.writeString(this.authenticating);
            dest.writeString(this.authenticatingTitle);
            dest.writeString(this.reading);
            dest.writeString(this.readingTitle);
            dest.writeString(this.requiredText);
            dest.writeString(this.scanDocumentError);
            dest.writeString(this.enableNfcPrompt);
            dest.writeString(this.authenticationErrorPrompt);
            Boolean bool = this.hidePrefilledInputs;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
            }
            dest.writeString(this.connectionLostPrompt);
            dest.writeString(this.unsupportedDocumentType);
            dest.writeString(this.retryError);
            List<ScanHint> list2 = this.scanHints;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list2);
                while (m2.hasNext()) {
                    ((ScanHint) m2.next()).writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.hintsSheetTitle);
            dest.writeString(this.closeHintSheetButtonText);
            dest.writeString(this.userUnableToScanHintSheetButtonText);
            dest.writeString(this.errorModalChipNotDetectedTitle);
            dest.writeString(this.errorModalChipNotDetectedText);
            dest.writeString(this.errorModalLostConnectionTitle);
            dest.writeString(this.errorModalLostConnectionText);
            dest.writeString(this.errorModalIncorrectIdDetailsTitle);
            dest.writeString(this.errorModalIncorrectIdDetailsText);
            dest.writeString(this.errorModalGenericErrorTitle);
            dest.writeString(this.errorModalGenericErrorText);
            dest.writeString(this.errorModalTryAgainButtonText);
            dest.writeString(this.errorModalTroubleshootingTipsButtonText);
            dest.writeString(this.errorModalReenterIdDetailsButtonText);
            dest.writeString(this.rescanDocumentPrompt);
            dest.writeString(this.successfulScanTransitionComponentName);
            dest.writeString(this.unableToScanTransitionComponentName);
            dest.writeString(this.incorrectIdDetailsTransitionComponentName);
            TipsButtonLocation tipsButtonLocation = this.tipsButtonLocation;
            if (tipsButtonLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(tipsButtonLocation.name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                ArrayList arrayList2;
                ArrayList arrayList3;
                parcel.getClass();
                JsonLogicBoolean createFromParcel = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                JsonLogicBoolean createFromParcel2 = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        arrayList.add(DataGroupTypes.valueOf(parcel.readString()));
                        i++;
                        readInt = readInt;
                    }
                }
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = arrayList;
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    ArrayList arrayList5 = arrayList;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(ScanHint.CREATOR, parcel, arrayList4, i2, 1);
                        readInt2 = readInt2;
                        createFromParcel = createFromParcel;
                    }
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                }
                return new Attributes(createFromParcel, createFromParcel2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, arrayList3, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, valueOf, readString22, readString23, readString24, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TipsButtonLocation.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Companion;", "", "<init>", "()V", "type", "", "launchButtonName", "cardAccessNumberName", "documentNumberName", "dateOfBirthName", "expirationDateName", "generateTextMonths", "", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> generateTextMonths() {
            ArrayList arrayList = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.getDefault());
            calendar.set(5, 1);
            calendar.set(1, 2000);
            for (int i = 0; i < 12; i++) {
                calendar.set(2, i);
                String format2 = simpleDateFormat.format(calendar.getTime());
                format2.getClass();
                arrayList.add(format2);
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010F\u001a\u00020=J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020=R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0016\u0010B\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0016\u0010D\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00105¨\u0006L"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "inputDateStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;)V", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "getInputDateStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;", "documentNumberStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getDocumentNumberStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "cardAccessNumberStyle", "getCardAccessNumberStyle", "dateStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "getDateStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "errorLabelStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorLabelStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "launchButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getLaunchButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "secondaryButtonStyle", "getSecondaryButtonStyle", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "helpTextviewStyle", "getHelpTextviewStyle", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanStyles implements HelpBottomSheetComponentStyle {
        public static final Parcelable.Creator<GovernmentIdNfcScanStyles> CREATOR = new Creator();
        private final AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle backgroundColor;
        private final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles buttonPrimaryStyle;
        private final AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles buttonSecondaryStyle;
        private final AttributeStyles.GovernmentIdNfcScanFillColorStyle fillColor;
        private final AttributeStyles.GovernmentIdNfcScanInputDateStyles inputDateStyle;
        private final AttributeStyles.GovernmentIdNfcScanInputTextStyles inputTextStyle;
        private final AttributeStyles.GovernmentIdNfcScanStrokeColorStyle strokeColor;
        private final AttributeStyles.GovernmentIdNfcScanTextStyles textStyle;
        private final AttributeStyles.GovernmentIdNfcScanTitleStyles titleStyle;

        public GovernmentIdNfcScanStyles(AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles, AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles governmentIdNfcScanSecondaryButtonStyles, AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles, AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles, AttributeStyles.GovernmentIdNfcScanTextStyles governmentIdNfcScanTextStyles, AttributeStyles.GovernmentIdNfcScanTitleStyles governmentIdNfcScanTitleStyles, AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle governmentIdNfcScanBackgroundColorStyle, AttributeStyles.GovernmentIdNfcScanStrokeColorStyle governmentIdNfcScanStrokeColorStyle, AttributeStyles.GovernmentIdNfcScanFillColorStyle governmentIdNfcScanFillColorStyle) {
            this.buttonPrimaryStyle = governmentIdNfcScanPrimaryButtonStyles;
            this.buttonSecondaryStyle = governmentIdNfcScanSecondaryButtonStyles;
            this.inputTextStyle = governmentIdNfcScanInputTextStyles;
            this.inputDateStyle = governmentIdNfcScanInputDateStyles;
            this.textStyle = governmentIdNfcScanTextStyles;
            this.titleStyle = governmentIdNfcScanTitleStyles;
            this.backgroundColor = governmentIdNfcScanBackgroundColorStyle;
            this.strokeColor = governmentIdNfcScanStrokeColorStyle;
            this.fillColor = governmentIdNfcScanFillColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle
        public Integer getBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle governmentIdNfcScanBackgroundColorStyle = this.backgroundColor;
            if (governmentIdNfcScanBackgroundColorStyle == null || (base = governmentIdNfcScanBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        public final AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        public final InputTextBasedComponentStyle getCardAccessNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final InputDate.InputDateComponentStyle getDateStyle() {
            AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null || (base = governmentIdNfcScanInputDateStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final InputTextBasedComponentStyle getDocumentNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final TextBasedComponentStyle getErrorLabelStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            InputTextBasedComponentStyle base2;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getErrorTextStyle();
        }

        public final AttributeStyles.GovernmentIdNfcScanFillColorStyle getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle
        public Integer getFillColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.GovernmentIdNfcScanFillColorStyle governmentIdNfcScanFillColorStyle = this.fillColor;
            if (governmentIdNfcScanFillColorStyle == null || (base = governmentIdNfcScanFillColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle
        public TextBasedComponentStyle getHelpTextviewStyle() {
            AttributeStyles.GovernmentIdNfcScanTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanTextStyles governmentIdNfcScanTextStyles = this.textStyle;
            if (governmentIdNfcScanTextStyles == null || (base = governmentIdNfcScanTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.GovernmentIdNfcScanInputDateStyles getInputDateStyle() {
            return this.inputDateStyle;
        }

        public final AttributeStyles.GovernmentIdNfcScanInputTextStyles getInputTextStyle() {
            return this.inputTextStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle
        public ButtonSubmitComponentStyle getLaunchButtonStyle() {
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null || (base = governmentIdNfcScanPrimaryButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle
        public ButtonSubmitComponentStyle getSecondaryButtonStyle() {
            AttributeStyles.GovernmentIdNfcScanSecondaryButtonStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles governmentIdNfcScanSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (governmentIdNfcScanSecondaryButtonStyles == null || (base = governmentIdNfcScanSecondaryButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.GovernmentIdNfcScanStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle
        public Integer getStrokeColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.GovernmentIdNfcScanStrokeColorStyle governmentIdNfcScanStrokeColorStyle = this.strokeColor;
            if (governmentIdNfcScanStrokeColorStyle == null || (base = governmentIdNfcScanStrokeColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.GovernmentIdNfcScanTextStyles getTextStyle() {
            return this.textStyle;
        }

        public final AttributeStyles.GovernmentIdNfcScanTitleStyles getTitleStyle() {
            return this.titleStyle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanPrimaryButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles governmentIdNfcScanSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (governmentIdNfcScanSecondaryButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanSecondaryButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanInputTextStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanInputDateStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanTextStyles governmentIdNfcScanTextStyles = this.textStyle;
            if (governmentIdNfcScanTextStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanTextStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanTitleStyles governmentIdNfcScanTitleStyles = this.titleStyle;
            if (governmentIdNfcScanTitleStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanTitleStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle governmentIdNfcScanBackgroundColorStyle = this.backgroundColor;
            if (governmentIdNfcScanBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanStrokeColorStyle governmentIdNfcScanStrokeColorStyle = this.strokeColor;
            if (governmentIdNfcScanStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanStrokeColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanFillColorStyle governmentIdNfcScanFillColorStyle = this.fillColor;
            if (governmentIdNfcScanFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanFillColorStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanStyles(parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanInputTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanInputDateStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanTitleStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.GovernmentIdNfcScanFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStyles[] newArray(int i) {
                return new GovernmentIdNfcScanStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$ScanHint;", "Landroid/os/Parcelable;", "hintType", "", "hintText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHintType", "()Ljava/lang/String;", "getHintText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanHint implements Parcelable {
        public static final Parcelable.Creator<ScanHint> CREATOR = new Creator();
        private final String hintText;
        private final String hintType;

        public ScanHint(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.hintType = str;
            this.hintText = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getHintText() {
            return this.hintText;
        }

        public final String getHintType() {
            return this.hintType;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.hintType);
            dest.writeString(this.hintText);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ScanHint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanHint createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ScanHint(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanHint[] newArray(int i) {
                return new ScanHint[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScan> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcScan createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GovernmentIdNfcScan(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdNfcScanStyles.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcScan[] newArray(int i) {
            return new GovernmentIdNfcScan[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }
}
