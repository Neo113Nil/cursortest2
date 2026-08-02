package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.Constants;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes9.dex */
public final class IdConfig implements Parcelable {
    public static final Parcelable.Creator<IdConfig> CREATOR = new Frame.Creator(28);
    public final IdIcon icon;
    public final String idClassKey;
    public final ArrayList parts;
    public final ArrayList sideConfigs;

    /* renamed from: type, reason: collision with root package name */
    public final IdClass f1453type;

    public final class IdSideConfig implements Parcelable {
        public static final Parcelable.Creator<IdSideConfig> CREATOR = new Frame.Creator(29);
        public final AutoCaptureConfig autoCaptureConfig;
        public final ManualCaptureConfig manualCaptureConfig;
        public final Screen.Overlay overlay;
        public final Side side;
        public final String sideKey;

        public IdSideConfig(String str, Side side, Screen.Overlay overlay, AutoCaptureConfig autoCaptureConfig, ManualCaptureConfig manualCaptureConfig) {
            str.getClass();
            side.getClass();
            overlay.getClass();
            autoCaptureConfig.getClass();
            manualCaptureConfig.getClass();
            this.sideKey = str;
            this.side = side;
            this.overlay = overlay;
            this.autoCaptureConfig = autoCaptureConfig;
            this.manualCaptureConfig = manualCaptureConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdSideConfig)) {
                return false;
            }
            IdSideConfig idSideConfig = (IdSideConfig) obj;
            return Intrinsics.areEqual(this.sideKey, idSideConfig.sideKey) && this.side == idSideConfig.side && Intrinsics.areEqual(this.overlay, idSideConfig.overlay) && Intrinsics.areEqual(this.autoCaptureConfig, idSideConfig.autoCaptureConfig) && Intrinsics.areEqual(this.manualCaptureConfig, idSideConfig.manualCaptureConfig);
        }

        public final int hashCode() {
            return this.manualCaptureConfig.hashCode() + ((this.autoCaptureConfig.hashCode() + ((this.overlay.hashCode() + ((this.side.hashCode() + (this.sideKey.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "IdSideConfig(sideKey=" + this.sideKey + ", side=" + this.side + ", overlay=" + this.overlay + ", autoCaptureConfig=" + this.autoCaptureConfig + ", manualCaptureConfig=" + this.manualCaptureConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sideKey);
            parcel.writeString(this.side.name());
            parcel.writeParcelable(this.overlay, i);
            AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
            autoCaptureConfig.getClass();
            parcel.writeParcelable(autoCaptureConfig.ruleSet, i);
            this.manualCaptureConfig.writeToParcel(parcel, i);
        }
    }

    public final class ManualCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new RawExtraction.Creator(1);
        public final long delayMs;
        public final boolean isEnabled;

        public ManualCaptureConfig(boolean z, long j) {
            this.isEnabled = z;
            this.delayMs = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) obj;
            return this.isEnabled == manualCaptureConfig.isEnabled && this.delayMs == manualCaptureConfig.delayMs;
        }

        public final int hashCode() {
            return Long.hashCode(this.delayMs) + (Boolean.hashCode(this.isEnabled) * 31);
        }

        public final String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isEnabled ? 1 : 0);
            parcel.writeLong(this.delayMs);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Side {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side Back;
        public static final Side BarcodePdf417;
        public static final y0 Companion;
        public static final Side Front;
        public static final Side FrontOrBack;
        public static final Side PassportSignature;
        public static final Lazy sideKeyToSide$delegate;
        public final String key;

        static {
            Side side = new Side("Front", 0, "front");
            Front = side;
            Side side2 = new Side(Constants.META_BACK_BUTTON, 1, "back");
            Back = side2;
            Side side3 = new Side("FrontOrBack", 2, "front_or_back");
            FrontOrBack = side3;
            Side side4 = new Side("BarcodePdf417", 3, "barcode_pdf417");
            BarcodePdf417 = side4;
            Side side5 = new Side("PassportSignature", 4, "passport_signature");
            PassportSignature = side5;
            Side[] sideArr = {side, side2, side3, side4, side5};
            $VALUES = sideArr;
            $ENTRIES = new EnumEntriesList(sideArr);
            Companion = new y0();
            sideKeyToSide$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(15));
        }

        public Side(String str, int i, String str2) {
            this.key = str2;
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    public IdConfig(String str, IdIcon idIcon, ArrayList arrayList, ArrayList arrayList2, IdClass idClass) {
        str.getClass();
        idIcon.getClass();
        idClass.getClass();
        this.idClassKey = str;
        this.icon = idIcon;
        this.sideConfigs = arrayList;
        this.parts = arrayList2;
        this.f1453type = idClass;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdConfig)) {
            return false;
        }
        IdConfig idConfig = (IdConfig) obj;
        return Intrinsics.areEqual(this.idClassKey, idConfig.idClassKey) && this.icon == idConfig.icon && this.sideConfigs.equals(idConfig.sideConfigs) && this.parts.equals(idConfig.parts) && this.f1453type == idConfig.f1453type;
    }

    public final IdSideConfig getSideConfig(Side side) {
        side.getClass();
        for (IdSideConfig idSideConfig : this.sideConfigs) {
            if (idSideConfig.side == side) {
                return idSideConfig;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }

    public final int hashCode() {
        return this.f1453type.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, CameraState$Type$EnumUnboxingLocalUtility.m(this.sideConfigs, (this.icon.hashCode() + (this.idClassKey.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "IdConfig(idClassKey=" + this.idClassKey + ", icon=" + this.icon + ", sideConfigs=" + this.sideConfigs + ", parts=" + this.parts + ", type=" + this.f1453type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.idClassKey);
        parcel.writeString(this.icon.name());
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.sideConfigs, parcel);
        while (m.hasNext()) {
            ((IdSideConfig) m.next()).writeToParcel(parcel, i);
        }
        Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.parts, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        parcel.writeString(this.f1453type.name());
    }

    public final class AutoCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new Frame.Creator(27);
        public final AutoCaptureRuleSet ruleSet;

        public AutoCaptureConfig() {
            this(new AutoCaptureRuleSet(EmptyList.INSTANCE));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AutoCaptureConfig) && Intrinsics.areEqual(this.ruleSet, ((AutoCaptureConfig) obj).ruleSet);
        }

        public final int hashCode() {
            return this.ruleSet.rules.hashCode();
        }

        public final String toString() {
            return "AutoCaptureConfig(ruleSet=" + this.ruleSet + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.ruleSet, i);
        }

        public AutoCaptureConfig(AutoCaptureRuleSet autoCaptureRuleSet) {
            autoCaptureRuleSet.getClass();
            this.ruleSet = autoCaptureRuleSet;
        }
    }
}
