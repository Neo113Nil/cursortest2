package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class DeviceFeatureRequestWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final DeviceFeatureRequestWorker_Factory_Impl deviceFeatureRequestWorkerFactory;

    public abstract class DeviceFeatureRequestState implements Parcelable {

        public final class CheckDeviceFeatureState extends DeviceFeatureRequestState {
            public static final CheckDeviceFeatureState INSTANCE = new CheckDeviceFeatureState();
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new PoseConfig.Creator(1);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckDeviceFeatureState);
            }

            public final int hashCode() {
                return -86189441;
            }

            public final String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Complete extends DeviceFeatureRequestState {
            public static final Complete INSTANCE = new Complete();
            public static final Parcelable.Creator<Complete> CREATOR = new PoseConfig.Creator(2);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Complete);
            }

            public final int hashCode() {
                return 92238675;
            }

            public final String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class RequestDeviceFeature extends DeviceFeatureRequestState {
            public static final RequestDeviceFeature INSTANCE = new RequestDeviceFeature();
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new PoseConfig.Creator(3);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestDeviceFeature);
            }

            public final int hashCode() {
                return 1991921803;
            }

            public final String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {
            public static final ShowDeviceFeaturePrompt INSTANCE = new ShowDeviceFeaturePrompt();
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new PoseConfig.Creator(4);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowDeviceFeaturePrompt);
            }

            public final int hashCode() {
                return 725044653;
            }

            public final String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public final class Output {
        public final DeviceFeatureState deviceFeatureState;

        public Output(DeviceFeatureState deviceFeatureState) {
            this.deviceFeatureState = deviceFeatureState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Output) && this.deviceFeatureState.equals(((Output) obj).deviceFeatureState);
        }

        public final int hashCode() {
            return this.deviceFeatureState.hashCode();
        }

        public final String toString() {
            return "Output(deviceFeatureState=" + this.deviceFeatureState + ")";
        }
    }

    public final class Props {
        public final Feature feature;
        public final String requestFeatureModalNegativeButton;
        public final String requestFeatureModalPositiveButton;
        public final String requestFeatureRationale;
        public final String requestFeatureTitle;
        public final StepStyle styles;

        public Props(Feature feature, String str, String str2, String str3, String str4, StepStyle stepStyle) {
            this.feature = feature;
            this.requestFeatureTitle = str;
            this.requestFeatureRationale = str2;
            this.requestFeatureModalPositiveButton = str3;
            this.requestFeatureModalNegativeButton = str4;
            this.styles = stepStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Props)) {
                return false;
            }
            Props props = (Props) obj;
            return this.feature == props.feature && Intrinsics.areEqual(this.requestFeatureTitle, props.requestFeatureTitle) && Intrinsics.areEqual(this.requestFeatureRationale, props.requestFeatureRationale) && Intrinsics.areEqual(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && Intrinsics.areEqual(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && Intrinsics.areEqual(this.styles, props.styles);
        }

        public final int hashCode() {
            int hashCode = this.feature.hashCode() * 31;
            String str = this.requestFeatureTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestFeatureRationale;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestFeatureModalPositiveButton;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestFeatureModalNegativeButton;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return hashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Props(feature=");
            sb.append(this.feature);
            sb.append(", requestFeatureTitle=");
            sb.append(this.requestFeatureTitle);
            sb.append(", requestFeatureRationale=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.requestFeatureRationale, ", requestFeatureModalPositiveButton=", this.requestFeatureModalPositiveButton, ", requestFeatureModalNegativeButton=");
            sb.append(this.requestFeatureModalNegativeButton);
            sb.append(", styles=");
            sb.append(this.styles);
            sb.append(")");
            return sb.toString();
        }
    }

    public DeviceFeatureRequestWorkflow(Context context, DeviceFeatureRequestWorker_Factory_Impl deviceFeatureRequestWorker_Factory_Impl) {
        context.getClass();
        deviceFeatureRequestWorker_Factory_Impl.getClass();
        this.applicationContext = context;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorker_Factory_Impl;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        ((Props) obj).getClass();
        if (snapshot != null) {
            ByteString bytes = snapshot.bytes();
            Parcelable parcelable = null;
            if (bytes.getSize$okio() <= 0) {
                bytes = null;
            }
            if (bytes != null) {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                byte[] byteArray = bytes.toByteArray();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                parcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                parcelable.getClass();
                obtain.recycle();
            }
            DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) parcelable;
            if (deviceFeatureRequestState != null) {
                return deviceFeatureRequestState;
            }
        }
        return DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object render(Object obj, Object obj2, StatefulWorkflow.RenderContext renderContext) {
        Props props = (Props) obj;
        DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) obj2;
        props.getClass();
        deviceFeatureRequestState.getClass();
        Continuation continuation = null;
        if (deviceFeatureRequestState.equals(DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE)) {
            renderContext.$$delegate_0.runningSideEffect("check_device_feature_state", new Logger$_log$2(this, renderContext, props, continuation, 27));
            return null;
        }
        if (!deviceFeatureRequestState.equals(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE)) {
            if (!deviceFeatureRequestState.equals(DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE)) {
                if (deviceFeatureRequestState.equals(DeviceFeatureRequestState.Complete.INSTANCE)) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            DeviceFeatureRequestWorker_Factory deviceFeatureRequestWorker_Factory = this.deviceFeatureRequestWorkerFactory.delegateFactory;
            Workflows.runningWorker(renderContext, new DeviceFeatureRequestWorker((ActivityResultLauncher) deviceFeatureRequestWorker_Factory.resolvableApiLauncherProvider.get(), (Context) deviceFeatureRequestWorker_Factory.contextProvider.get()), Reflection.typeOf(DeviceFeatureRequestWorker.class), "", new HCaptcha$$ExternalSyntheticLambda1(24, this, props));
            return null;
        }
        String str = props.requestFeatureTitle;
        if (str == null) {
            str = "Couldn't access location feature";
        }
        String str2 = str;
        String str3 = props.requestFeatureRationale;
        if (str3 == null) {
            str3 = "Location is turned off, please allow access to your device's location feature";
        }
        String str4 = str3;
        String str5 = props.requestFeatureModalPositiveButton;
        if (str5 == null) {
            str5 = "Allow";
        }
        String str6 = str5;
        StepStyle stepStyle = props.styles;
        StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2 = new StateFlowsKt$$ExternalSyntheticLambda2(9, renderContext, this);
        String str7 = props.requestFeatureModalNegativeButton;
        if (str7 == null) {
            str7 = "Cancel";
        }
        return new ScreenWithTransition(new OldBottomSheetDialogView(str2, str4, str6, stepStyle, stateFlowsKt$$ExternalSyntheticLambda2, str7, new UiScreenRunner$$ExternalSyntheticLambda29(10, renderContext, this, props)), ScreenTransition.NONE);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) obj;
        deviceFeatureRequestState.getClass();
        return SnapshotParcelsKt.toSnapshot(deviceFeatureRequestState);
    }
}
