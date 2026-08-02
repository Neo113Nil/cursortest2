package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0007&'()*+,B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Landroid/os/Parcelable;", "side", "", "manualCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "autoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "overlay", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)V", "getSide", "()Ljava/lang/String;", "getManualCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "getAutoCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ManualCaptureConfig", "AutoCaptureConfig", "RuleSet", "Rule", "OverlayConfig", "RuleType", "OverlayLocalIcon", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CapturePageConfig implements Parcelable {
    public static final Parcelable.Creator<CapturePageConfig> CREATOR = new Creator();
    private final AutoCaptureConfig autoCaptureConfig;
    private final ManualCaptureConfig manualCaptureConfig;
    private final OverlayConfig overlay;
    private final String side;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "", "<init>", "(Ljava/lang/String;I)V", "BARCODE", "PASSPORT", "ID_FRONT", "ID_BACK", "CORNERS_ONLY", "EMPTY", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OverlayLocalIcon {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OverlayLocalIcon[] $VALUES;

        @Json(name = "barcode")
        public static final OverlayLocalIcon BARCODE = new OverlayLocalIcon("BARCODE", 0);

        @Json(name = "passport")
        public static final OverlayLocalIcon PASSPORT = new OverlayLocalIcon("PASSPORT", 1);

        @Json(name = "id_front")
        public static final OverlayLocalIcon ID_FRONT = new OverlayLocalIcon("ID_FRONT", 2);

        @Json(name = "id_back")
        public static final OverlayLocalIcon ID_BACK = new OverlayLocalIcon("ID_BACK", 3);

        @Json(name = "corners_only")
        public static final OverlayLocalIcon CORNERS_ONLY = new OverlayLocalIcon("CORNERS_ONLY", 4);

        @Json(name = "empty")
        public static final OverlayLocalIcon EMPTY = new OverlayLocalIcon("EMPTY", 5);

        private static final /* synthetic */ OverlayLocalIcon[] $values() {
            return new OverlayLocalIcon[]{BARCODE, PASSPORT, ID_FRONT, ID_BACK, CORNERS_ONLY, EMPTY};
        }

        static {
            OverlayLocalIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private OverlayLocalIcon(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static OverlayLocalIcon valueOf(String str) {
            return (OverlayLocalIcon) Enum.valueOf(OverlayLocalIcon.class, str);
        }

        public static OverlayLocalIcon[] values() {
            return (OverlayLocalIcon[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "", "<init>", "(Ljava/lang/String;I)V", "ID_FRONT", "ID_FRONT_OR_BACK", "BARCODE_PDF417", "PASSPORT_MRZ", "TEXT_EXTRACTION", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RuleType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RuleType[] $VALUES;

        @Json(name = "id_front")
        public static final RuleType ID_FRONT = new RuleType("ID_FRONT", 0);

        @Json(name = "id_front_or_back")
        public static final RuleType ID_FRONT_OR_BACK = new RuleType("ID_FRONT_OR_BACK", 1);

        @Json(name = "barcode_pdf417")
        public static final RuleType BARCODE_PDF417 = new RuleType("BARCODE_PDF417", 2);

        @Json(name = "passport_mrz")
        public static final RuleType PASSPORT_MRZ = new RuleType("PASSPORT_MRZ", 3);

        @Json(name = "text_extraction")
        public static final RuleType TEXT_EXTRACTION = new RuleType("TEXT_EXTRACTION", 4);

        private static final /* synthetic */ RuleType[] $values() {
            return new RuleType[]{ID_FRONT, ID_FRONT_OR_BACK, BARCODE_PDF417, PASSPORT_MRZ, TEXT_EXTRACTION};
        }

        static {
            RuleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private RuleType(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static RuleType valueOf(String str) {
            return (RuleType) Enum.valueOf(RuleType.class, str);
        }

        public static RuleType[] values() {
            return (RuleType[]) $VALUES.clone();
        }
    }

    public CapturePageConfig(String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig) {
        this.side = str;
        this.manualCaptureConfig = manualCaptureConfig;
        this.autoCaptureConfig = autoCaptureConfig;
        this.overlay = overlayConfig;
    }

    public static /* synthetic */ CapturePageConfig copy$default(CapturePageConfig capturePageConfig, String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capturePageConfig.side;
        }
        if ((i & 2) != 0) {
            manualCaptureConfig = capturePageConfig.manualCaptureConfig;
        }
        if ((i & 4) != 0) {
            autoCaptureConfig = capturePageConfig.autoCaptureConfig;
        }
        if ((i & 8) != 0) {
            overlayConfig = capturePageConfig.overlay;
        }
        return capturePageConfig.copy(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    public final CapturePageConfig copy(String side, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlay) {
        return new CapturePageConfig(side, manualCaptureConfig, autoCaptureConfig, overlay);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapturePageConfig)) {
            return false;
        }
        CapturePageConfig capturePageConfig = (CapturePageConfig) other;
        return Intrinsics.areEqual(this.side, capturePageConfig.side) && Intrinsics.areEqual(this.manualCaptureConfig, capturePageConfig.manualCaptureConfig) && Intrinsics.areEqual(this.autoCaptureConfig, capturePageConfig.autoCaptureConfig) && Intrinsics.areEqual(this.overlay, capturePageConfig.overlay);
    }

    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    public final String getSide() {
        return this.side;
    }

    public int hashCode() {
        String str = this.side;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        int hashCode2 = (hashCode + (manualCaptureConfig == null ? 0 : manualCaptureConfig.hashCode())) * 31;
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        int hashCode3 = (hashCode2 + (autoCaptureConfig == null ? 0 : autoCaptureConfig.hashCode())) * 31;
        OverlayConfig overlayConfig = this.overlay;
        return hashCode3 + (overlayConfig != null ? overlayConfig.hashCode() : 0);
    }

    public String toString() {
        return "CapturePageConfig(side=" + this.side + ", manualCaptureConfig=" + this.manualCaptureConfig + ", autoCaptureConfig=" + this.autoCaptureConfig + ", overlay=" + this.overlay + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.side);
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        if (manualCaptureConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manualCaptureConfig.writeToParcel(dest, flags);
        }
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        if (autoCaptureConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autoCaptureConfig.writeToParcel(dest, flags);
        }
        OverlayConfig overlayConfig = this.overlay;
        if (overlayConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            overlayConfig.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Landroid/os/Parcelable;", "ruleSets", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "<init>", "(Ljava/util/List;)V", "getRuleSets", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new Creator();
        private final List<RuleSet> ruleSets;

        public AutoCaptureConfig(List<RuleSet> list) {
            this.ruleSets = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoCaptureConfig copy$default(AutoCaptureConfig autoCaptureConfig, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = autoCaptureConfig.ruleSets;
            }
            return autoCaptureConfig.copy(list);
        }

        public final List<RuleSet> component1() {
            return this.ruleSets;
        }

        public final AutoCaptureConfig copy(List<RuleSet> ruleSets) {
            return new AutoCaptureConfig(ruleSets);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && Intrinsics.areEqual(this.ruleSets, ((AutoCaptureConfig) other).ruleSets);
        }

        public final List<RuleSet> getRuleSets() {
            return this.ruleSets;
        }

        public int hashCode() {
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("AutoCaptureConfig(ruleSets=", ")", this.ruleSets);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list);
            while (m.hasNext()) {
                ((RuleSet) m.next()).writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoCaptureConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(RuleSet.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AutoCaptureConfig(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig[] newArray(int i) {
                return new AutoCaptureConfig[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "Landroid/os/Parcelable;", "isEnabled", "", "delayMs", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ManualCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new Creator();
        private final Long delayMs;
        private final Boolean isEnabled;

        public ManualCaptureConfig(Boolean bool, Long l) {
            this.isEnabled = bool;
            this.delayMs = l;
        }

        public static /* synthetic */ ManualCaptureConfig copy$default(ManualCaptureConfig manualCaptureConfig, Boolean bool, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = manualCaptureConfig.isEnabled;
            }
            if ((i & 2) != 0) {
                l = manualCaptureConfig.delayMs;
            }
            return manualCaptureConfig.copy(bool, l);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getDelayMs() {
            return this.delayMs;
        }

        public final ManualCaptureConfig copy(Boolean isEnabled, Long delayMs) {
            return new ManualCaptureConfig(isEnabled, delayMs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) other;
            return Intrinsics.areEqual(this.isEnabled, manualCaptureConfig.isEnabled) && Intrinsics.areEqual(this.delayMs, manualCaptureConfig.delayMs);
        }

        public final Long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l = this.delayMs;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Boolean bool = this.isEnabled;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
            }
            Long l = this.delayMs;
            if (l == null) {
                dest.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(dest, 1, l);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ManualCaptureConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig createFromParcel(Parcel parcel) {
                Boolean valueOf;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ManualCaptureConfig(valueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig[] newArray(int i) {
                return new ManualCaptureConfig[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Landroid/os/Parcelable;", "overlay", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "overlayFallback", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getOverlayFallback", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OverlayConfig implements Parcelable {
        public static final Parcelable.Creator<OverlayConfig> CREATOR = new Creator();
        private final RemoteImage overlay;
        private final OverlayLocalIcon overlayFallback;

        public OverlayConfig(RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon) {
            this.overlay = remoteImage;
            this.overlayFallback = overlayLocalIcon;
        }

        public static /* synthetic */ OverlayConfig copy$default(OverlayConfig overlayConfig, RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                remoteImage = overlayConfig.overlay;
            }
            if ((i & 2) != 0) {
                overlayLocalIcon = overlayConfig.overlayFallback;
            }
            return overlayConfig.copy(remoteImage, overlayLocalIcon);
        }

        /* renamed from: component1, reason: from getter */
        public final RemoteImage getOverlay() {
            return this.overlay;
        }

        /* renamed from: component2, reason: from getter */
        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        public final OverlayConfig copy(RemoteImage overlay, OverlayLocalIcon overlayFallback) {
            return new OverlayConfig(overlay, overlayFallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverlayConfig)) {
                return false;
            }
            OverlayConfig overlayConfig = (OverlayConfig) other;
            return Intrinsics.areEqual(this.overlay, overlayConfig.overlay) && this.overlayFallback == overlayConfig.overlayFallback;
        }

        public final RemoteImage getOverlay() {
            return this.overlay;
        }

        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        public int hashCode() {
            RemoteImage remoteImage = this.overlay;
            int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            return hashCode + (overlayLocalIcon != null ? overlayLocalIcon.hashCode() : 0);
        }

        public String toString() {
            return "OverlayConfig(overlay=" + this.overlay + ", overlayFallback=" + this.overlayFallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            RemoteImage remoteImage = this.overlay;
            if (remoteImage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImage.writeToParcel(dest, flags);
            }
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            if (overlayLocalIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(overlayLocalIcon.name());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OverlayConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OverlayConfig createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OverlayConfig(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayLocalIcon.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OverlayConfig[] newArray(int i) {
                return new OverlayConfig[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Landroid/os/Parcelable;", "type", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "isRequired", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;Ljava/lang/Boolean;)V", "getType", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rule implements Parcelable {
        public static final Parcelable.Creator<Rule> CREATOR = new Creator();
        private final Boolean isRequired;
        private final RuleType type;

        public Rule(RuleType ruleType, Boolean bool) {
            this.type = ruleType;
            this.isRequired = bool;
        }

        public static /* synthetic */ Rule copy$default(Rule rule, RuleType ruleType, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                ruleType = rule.type;
            }
            if ((i & 2) != 0) {
                bool = rule.isRequired;
            }
            return rule.copy(ruleType, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final RuleType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        public final Rule copy(RuleType type2, Boolean isRequired) {
            return new Rule(type2, isRequired);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) other;
            return this.type == rule.type && Intrinsics.areEqual(this.isRequired, rule.isRequired);
        }

        public final RuleType getType() {
            return this.type;
        }

        public int hashCode() {
            RuleType ruleType = this.type;
            int hashCode = (ruleType == null ? 0 : ruleType.hashCode()) * 31;
            Boolean bool = this.isRequired;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isRequired() {
            return this.isRequired;
        }

        public String toString() {
            return "Rule(type=" + this.type + ", isRequired=" + this.isRequired + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            RuleType ruleType = this.type;
            if (ruleType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(ruleType.name());
            }
            Boolean bool = this.isRequired;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Rule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rule createFromParcel(Parcel parcel) {
                parcel.getClass();
                Boolean bool = null;
                RuleType valueOf = parcel.readInt() == 0 ? null : RuleType.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Rule(valueOf, bool);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rule[] newArray(int i) {
                return new Rule[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Landroid/os/Parcelable;", "rules", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "<init>", "(Ljava/util/List;)V", "getRules", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RuleSet implements Parcelable {
        public static final Parcelable.Creator<RuleSet> CREATOR = new Creator();
        private final List<Rule> rules;

        public RuleSet(List<Rule> list) {
            this.rules = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RuleSet copy$default(RuleSet ruleSet, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ruleSet.rules;
            }
            return ruleSet.copy(list);
        }

        public final List<Rule> component1() {
            return this.rules;
        }

        public final RuleSet copy(List<Rule> rules) {
            return new RuleSet(rules);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RuleSet) && Intrinsics.areEqual(this.rules, ((RuleSet) other).rules);
        }

        public final List<Rule> getRules() {
            return this.rules;
        }

        public int hashCode() {
            List<Rule> list = this.rules;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("RuleSet(rules=", ")", this.rules);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            List<Rule> list = this.rules;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list);
            while (m.hasNext()) {
                ((Rule) m.next()).writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RuleSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(Rule.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new RuleSet(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet[] newArray(int i) {
                return new RuleSet[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CapturePageConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CapturePageConfig createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CapturePageConfig(parcel.readString(), parcel.readInt() == 0 ? null : ManualCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CapturePageConfig[] newArray(int i) {
            return new CapturePageConfig[i];
        }
    }
}
