package com.withpersona.sdk2.inquiry.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public abstract class UiState extends SimpleWorkflowState implements Parcelable {

    public interface PendingAction extends Parcelable {

        public final class CreateReusablePersona implements PendingAction {
            public static final Parcelable.Creator<CreateReusablePersona> CREATOR = new Displaying.NfcScan.Creator(2);
            public final CreatePersonaSheetComponent createPersonaSheetComponent;

            public CreateReusablePersona(CreatePersonaSheetComponent createPersonaSheetComponent) {
                createPersonaSheetComponent.getClass();
                this.createPersonaSheetComponent = createPersonaSheetComponent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CreateReusablePersona) && Intrinsics.areEqual(this.createPersonaSheetComponent, ((CreateReusablePersona) obj).createPersonaSheetComponent);
            }

            public final int hashCode() {
                return this.createPersonaSheetComponent.hashCode();
            }

            public final String toString() {
                return "CreateReusablePersona(createPersonaSheetComponent=" + this.createPersonaSheetComponent + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.createPersonaSheetComponent, i);
            }
        }

        public final class VerifyReusablePersona implements PendingAction {
            public static final Parcelable.Creator<VerifyReusablePersona> CREATOR = new Displaying.NfcScan.Creator(3);
            public final Map componentParams;
            public final VerifyPersonaButtonComponent verifyPersonaButtonComponent;

            public VerifyReusablePersona(VerifyPersonaButtonComponent verifyPersonaButtonComponent, Map map) {
                verifyPersonaButtonComponent.getClass();
                map.getClass();
                this.verifyPersonaButtonComponent = verifyPersonaButtonComponent;
                this.componentParams = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyReusablePersona)) {
                    return false;
                }
                VerifyReusablePersona verifyReusablePersona = (VerifyReusablePersona) obj;
                return Intrinsics.areEqual(this.verifyPersonaButtonComponent, verifyReusablePersona.verifyPersonaButtonComponent) && Intrinsics.areEqual(this.componentParams, verifyReusablePersona.componentParams);
            }

            public final int hashCode() {
                return this.componentParams.hashCode() + (this.verifyPersonaButtonComponent.hashCode() * 31);
            }

            public final String toString() {
                return "VerifyReusablePersona(verifyPersonaButtonComponent=" + this.verifyPersonaButtonComponent + ", componentParams=" + this.componentParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.verifyPersonaButtonComponent, i);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.componentParams, parcel);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), i);
                }
            }
        }
    }

    public final class Displaying extends UiState {
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();
        public final AutoSubmit autoSubmit;
        public final List componentErrors;
        public final Map componentParams;
        public final List components;
        public final String error;
        public final String filePickComponentName;
        public final int filePickRequestId;
        public final boolean hasRequestedGpsPermissions;
        public final boolean isRequestingGpsPermissions;
        public final NfcScan nfcScan;
        public final PendingAction pendingAction;
        public final String requestPermissionKey;
        public final boolean showHelpBottomSheet;
        public final String stepName;
        public final StepStyles.UiStepStyle styles;
        public final UiComponent triggeringComponent;

        public final class AutoSubmit implements Parcelable {
            public static final Parcelable.Creator<AutoSubmit> CREATOR = new NfcScan.Creator(1);
            public final AutoSubmitableComponent component;
            public final int countdown;
            public final String countdownText;

            public AutoSubmit(AutoSubmitableComponent autoSubmitableComponent, int i, String str) {
                autoSubmitableComponent.getClass();
                this.component = autoSubmitableComponent;
                this.countdown = i;
                this.countdownText = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoSubmit)) {
                    return false;
                }
                AutoSubmit autoSubmit = (AutoSubmit) obj;
                return Intrinsics.areEqual(this.component, autoSubmit.component) && this.countdown == autoSubmit.countdown && Intrinsics.areEqual(this.countdownText, autoSubmit.countdownText);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.countdown, this.component.hashCode() * 31, 31);
                String str = this.countdownText;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AutoSubmit(component=");
                sb.append(this.component);
                sb.append(", countdown=");
                sb.append(this.countdown);
                sb.append(", countdownText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.countdownText, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.component, i);
                parcel.writeInt(this.countdown);
                parcel.writeString(this.countdownText);
            }
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                NfcScan nfcScan;
                AutoSubmit autoSubmit;
                boolean z2;
                LinkedHashMap linkedHashMap;
                PendingAction pendingAction;
                boolean z3;
                LinkedHashMap linkedHashMap2;
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(Displaying.class, parcel, arrayList, i, 1);
                }
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Displaying.class, parcel, arrayList2, i2, 1);
                }
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(Displaying.class.getClassLoader());
                String readString2 = parcel.readString();
                NfcScan createFromParcel = parcel.readInt() == 0 ? null : NfcScan.CREATOR.createFromParcel(parcel);
                AutoSubmit createFromParcel2 = parcel.readInt() == 0 ? null : AutoSubmit.CREATOR.createFromParcel(parcel);
                PendingAction pendingAction2 = (PendingAction) parcel.readParcelable(Displaying.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                    nfcScan = createFromParcel;
                    autoSubmit = createFromParcel2;
                    z2 = true;
                } else {
                    z = true;
                    nfcScan = createFromParcel;
                    autoSubmit = createFromParcel2;
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    linkedHashMap = null;
                    pendingAction = pendingAction2;
                    z3 = z;
                } else {
                    linkedHashMap = null;
                    pendingAction = pendingAction2;
                    z3 = false;
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = linkedHashMap;
                } else {
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        linkedHashMap3.put(parcel.readString(), parcel.readParcelable(Displaying.class.getClassLoader()));
                        i3++;
                        uiStepStyle = uiStepStyle;
                    }
                    linkedHashMap2 = linkedHashMap3;
                }
                return new Displaying(arrayList, readString, arrayList2, uiStepStyle, readString2, nfcScan, autoSubmit, pendingAction, z2, z3, linkedHashMap2, (UiComponent) parcel.readParcelable(Displaying.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Displaying[i];
            }
        }

        public final class NfcScan implements Parcelable {
            public static final Parcelable.Creator<NfcScan> CREATOR = new Creator(0);
            public final GovernmentIdNfcScanComponent component;

            public final class Creator implements Parcelable.Creator {
                public final /* synthetic */ int $r8$classId;

                public /* synthetic */ Creator(int i) {
                    this.$r8$classId = i;
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    switch (this.$r8$classId) {
                        case 0:
                            parcel.getClass();
                            return new NfcScan((GovernmentIdNfcScanComponent) parcel.readParcelable(NfcScan.class.getClassLoader()));
                        case 1:
                            parcel.getClass();
                            return new AutoSubmit((AutoSubmitableComponent) parcel.readParcelable(AutoSubmit.class.getClassLoader()), parcel.readInt(), parcel.readString());
                        case 2:
                            parcel.getClass();
                            return new PendingAction.CreateReusablePersona((CreatePersonaSheetComponent) parcel.readParcelable(PendingAction.CreateReusablePersona.class.getClassLoader()));
                        default:
                            VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) NavAction$$ExternalSyntheticOutline0.m(parcel, PendingAction.VerifyReusablePersona.class);
                            int readInt = parcel.readInt();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                            for (int i = 0; i != readInt; i++) {
                                linkedHashMap.put(parcel.readString(), parcel.readParcelable(PendingAction.VerifyReusablePersona.class.getClassLoader()));
                            }
                            return new PendingAction.VerifyReusablePersona(verifyPersonaButtonComponent, linkedHashMap);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    switch (this.$r8$classId) {
                        case 0:
                            return new NfcScan[i];
                        case 1:
                            return new AutoSubmit[i];
                        case 2:
                            return new PendingAction.CreateReusablePersona[i];
                        default:
                            return new PendingAction.VerifyReusablePersona[i];
                    }
                }
            }

            public NfcScan(GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
                governmentIdNfcScanComponent.getClass();
                this.component = governmentIdNfcScanComponent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NfcScan) && Intrinsics.areEqual(this.component, ((NfcScan) obj).component);
            }

            public final int hashCode() {
                return this.component.hashCode();
            }

            public final String toString() {
                return "NfcScan(component=" + this.component + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.component, i);
            }
        }

        public Displaying(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, boolean z2, Map map, UiComponent uiComponent, String str3, boolean z3, String str4, int i) {
            list.getClass();
            str.getClass();
            list2.getClass();
            str3.getClass();
            this.components = list;
            this.stepName = str;
            this.componentErrors = list2;
            this.styles = uiStepStyle;
            this.error = str2;
            this.nfcScan = nfcScan;
            this.autoSubmit = autoSubmit;
            this.pendingAction = pendingAction;
            this.hasRequestedGpsPermissions = z;
            this.isRequestingGpsPermissions = z2;
            this.componentParams = map;
            this.triggeringComponent = uiComponent;
            this.requestPermissionKey = str3;
            this.showHelpBottomSheet = z3;
            this.filePickComponentName = str4;
            this.filePickRequestId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
        public static Displaying copy$default(Displaying displaying, ArrayList arrayList, List list, String str, NfcScan nfcScan, AutoSubmit autoSubmit, PendingAction pendingAction, boolean z, Map map, UiComponent uiComponent, String str2, boolean z2, String str3, int i, int i2) {
            ArrayList arrayList2 = (i2 & 1) != 0 ? displaying.components : arrayList;
            String str4 = displaying.stepName;
            List list2 = (i2 & 4) != 0 ? displaying.componentErrors : list;
            StepStyles.UiStepStyle uiStepStyle = displaying.styles;
            String str5 = (i2 & 16) != 0 ? displaying.error : str;
            NfcScan nfcScan2 = (i2 & 32) != 0 ? displaying.nfcScan : nfcScan;
            AutoSubmit autoSubmit2 = (i2 & 64) != 0 ? displaying.autoSubmit : autoSubmit;
            PendingAction pendingAction2 = (i2 & 128) != 0 ? displaying.pendingAction : pendingAction;
            boolean z3 = displaying.hasRequestedGpsPermissions;
            boolean z4 = (i2 & 512) != 0 ? displaying.isRequestingGpsPermissions : z;
            Map map2 = (i2 & 1024) != 0 ? displaying.componentParams : map;
            UiComponent uiComponent2 = (i2 & 2048) != 0 ? displaying.triggeringComponent : uiComponent;
            String str6 = (i2 & 4096) != 0 ? displaying.requestPermissionKey : str2;
            boolean z5 = (i2 & PKIFailureInfo.certRevoked) != 0 ? displaying.showHelpBottomSheet : z2;
            String str7 = (i2 & 16384) != 0 ? displaying.filePickComponentName : str3;
            int i3 = (i2 & 32768) != 0 ? displaying.filePickRequestId : i;
            displaying.getClass();
            arrayList2.getClass();
            str4.getClass();
            list2.getClass();
            str6.getClass();
            return new Displaying(arrayList2, str4, list2, uiStepStyle, str5, nfcScan2, autoSubmit2, pendingAction2, z3, z4, map2, uiComponent2, str6, z5, str7, i3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) obj;
            return Intrinsics.areEqual(this.components, displaying.components) && Intrinsics.areEqual(this.stepName, displaying.stepName) && Intrinsics.areEqual(this.componentErrors, displaying.componentErrors) && Intrinsics.areEqual(this.styles, displaying.styles) && Intrinsics.areEqual(this.error, displaying.error) && Intrinsics.areEqual(this.nfcScan, displaying.nfcScan) && Intrinsics.areEqual(this.autoSubmit, displaying.autoSubmit) && Intrinsics.areEqual(this.pendingAction, displaying.pendingAction) && this.hasRequestedGpsPermissions == displaying.hasRequestedGpsPermissions && this.isRequestingGpsPermissions == displaying.isRequestingGpsPermissions && Intrinsics.areEqual(this.componentParams, displaying.componentParams) && Intrinsics.areEqual(this.triggeringComponent, displaying.triggeringComponent) && Intrinsics.areEqual(this.requestPermissionKey, displaying.requestPermissionKey) && this.showHelpBottomSheet == displaying.showHelpBottomSheet && Intrinsics.areEqual(this.filePickComponentName, displaying.filePickComponentName) && this.filePickRequestId == displaying.filePickRequestId;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.components.hashCode() * 31, 31, this.stepName), 31, this.componentErrors);
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int hashCode = (m + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            String str = this.error;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NfcScan nfcScan = this.nfcScan;
            int hashCode3 = (hashCode2 + (nfcScan == null ? 0 : nfcScan.component.hashCode())) * 31;
            AutoSubmit autoSubmit = this.autoSubmit;
            int hashCode4 = (hashCode3 + (autoSubmit == null ? 0 : autoSubmit.hashCode())) * 31;
            PendingAction pendingAction = this.pendingAction;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (pendingAction == null ? 0 : pendingAction.hashCode())) * 31, 31, this.hasRequestedGpsPermissions), 31, this.isRequestingGpsPermissions);
            Map map = this.componentParams;
            int hashCode5 = (m2 + (map == null ? 0 : map.hashCode())) * 31;
            UiComponent uiComponent = this.triggeringComponent;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (uiComponent == null ? 0 : uiComponent.hashCode())) * 31, 31, this.requestPermissionKey), 31, this.showHelpBottomSheet);
            String str2 = this.filePickComponentName;
            return Integer.hashCode(this.filePickRequestId) + ((m3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("Displaying(components=", ", stepName=", this.stepName, ", componentErrors=", this.components);
            m.append(this.componentErrors);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", error=");
            m.append(this.error);
            m.append(", nfcScan=");
            m.append(this.nfcScan);
            m.append(", autoSubmit=");
            m.append(this.autoSubmit);
            m.append(", pendingAction=");
            m.append(this.pendingAction);
            m.append(", hasRequestedGpsPermissions=");
            re$$ExternalSyntheticOutline0.m(m, this.hasRequestedGpsPermissions, ", isRequestingGpsPermissions=", this.isRequestingGpsPermissions, ", componentParams=");
            m.append(this.componentParams);
            m.append(", triggeringComponent=");
            m.append(this.triggeringComponent);
            m.append(", requestPermissionKey=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.requestPermissionKey, ", showHelpBottomSheet=", this.showHelpBottomSheet, ", filePickComponentName=");
            m.append(this.filePickComponentName);
            m.append(", filePickRequestId=");
            m.append(this.filePickRequestId);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.components, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.stepName);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.componentErrors, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeParcelable(this.styles, i);
            parcel.writeString(this.error);
            NfcScan nfcScan = this.nfcScan;
            if (nfcScan == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeParcelable(nfcScan.component, i);
            }
            AutoSubmit autoSubmit = this.autoSubmit;
            if (autoSubmit == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autoSubmit.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.pendingAction, i);
            parcel.writeInt(this.hasRequestedGpsPermissions ? 1 : 0);
            parcel.writeInt(this.isRequestingGpsPermissions ? 1 : 0);
            Map map = this.componentParams;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator m3 = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
                while (m3.hasNext()) {
                    Map.Entry entry = (Map.Entry) m3.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), i);
                }
            }
            parcel.writeParcelable(this.triggeringComponent, i);
            parcel.writeString(this.requestPermissionKey);
            parcel.writeInt(this.showHelpBottomSheet ? 1 : 0);
            parcel.writeString(this.filePickComponentName);
            parcel.writeInt(this.filePickRequestId);
        }

        public Displaying(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle) {
            this(list, str, list2, uiStepStyle, null, null, null, null, false, false, null, null, "0", false, null, 0);
        }
    }
}
