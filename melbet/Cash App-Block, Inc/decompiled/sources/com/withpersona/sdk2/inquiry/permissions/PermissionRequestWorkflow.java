package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.R;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonImpl;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class PermissionRequestWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow;
    public final MarkwonImpl permissionRequestDialogWorkerFactory;
    public final TrackingEventsLogger trackingEventsLogger;

    public final class Output implements Parcelable {
        public static final Parcelable.Creator<Output> CREATOR = new PoseConfig.Creator(6);
        public final PermissionState permissionState;

        public Output(PermissionState permissionState) {
            permissionState.getClass();
            this.permissionState = permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Output) && Intrinsics.areEqual(this.permissionState, ((Output) obj).permissionState);
        }

        public final int hashCode() {
            return this.permissionState.hashCode();
        }

        public final String toString() {
            return "Output(permissionState=" + this.permissionState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.permissionState.writeToParcel(parcel, i);
        }
    }

    public interface PermissionRequestState extends Parcelable {

        public final class CheckPermissionPermanentlyDenied implements PermissionRequestState {
            public static final CheckPermissionPermanentlyDenied INSTANCE = new CheckPermissionPermanentlyDenied();
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new PoseConfig.Creator(7);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckPermissionPermanentlyDenied);
            }

            public final int hashCode() {
                return -367421189;
            }

            public final String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class CheckPermissionRationaleState implements PermissionRequestState {
            public static final CheckPermissionRationaleState INSTANCE = new CheckPermissionRationaleState();
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new PoseConfig.Creator(8);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckPermissionRationaleState);
            }

            public final int hashCode() {
                return -1860465355;
            }

            public final String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class CheckPermissionState implements PermissionRequestState {
            public static final CheckPermissionState INSTANCE = new CheckPermissionState();
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new PoseConfig.Creator(9);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckPermissionState);
            }

            public final int hashCode() {
                return -885686570;
            }

            public final String toString() {
                return "CheckPermissionState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Complete implements PermissionRequestState {
            public static final Complete INSTANCE = new Complete();
            public static final Parcelable.Creator<Complete> CREATOR = new PoseConfig.Creator(10);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Complete);
            }

            public final int hashCode() {
                return 1563807797;
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

        public final class RequestDeviceFeature implements PermissionRequestState {
            public static final RequestDeviceFeature INSTANCE = new RequestDeviceFeature();
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new PoseConfig.Creator(11);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestDeviceFeature);
            }

            public final int hashCode() {
                return -1821218195;
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

        public final class RequestPermission implements PermissionRequestState {
            public static final RequestPermission INSTANCE = new RequestPermission();
            public static final Parcelable.Creator<RequestPermission> CREATOR = new PoseConfig.Creator(12);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestPermission);
            }

            public final int hashCode() {
                return -2052298174;
            }

            public final String toString() {
                return "RequestPermission";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class ShowPermissionPermanentlyDeniedMessage implements PermissionRequestState {
            public static final ShowPermissionPermanentlyDeniedMessage INSTANCE = new ShowPermissionPermanentlyDeniedMessage();
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new PoseConfig.Creator(13);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public final int hashCode() {
                return -1723010119;
            }

            public final String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class ShowRequestPermissionRationale implements PermissionRequestState {
            public static final ShowRequestPermissionRationale INSTANCE = new ShowRequestPermissionRationale();
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new PoseConfig.Creator(14);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowRequestPermissionRationale);
            }

            public final int hashCode() {
                return 120525746;
            }

            public final String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public final class Props implements Parcelable {
        public static final Parcelable.Creator<Props> CREATOR = new PoseConfig.Creator(15);
        public final String gpsFeatureModalNegativeButton;
        public final String gpsFeatureRationale;
        public final String gpsFeatureTitle;
        public final String negativeButtonText;
        public final boolean optional;
        public final Permission permission;
        public final String positiveButtonText;
        public final String rationale;
        public final String rationaleWhenPermanentlyDenied;
        public final StepStyle styles;
        public final String title;

        public Props(Permission permission, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyle stepStyle) {
            permission.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.permission = permission;
            this.optional = z;
            this.title = str;
            this.rationale = str2;
            this.rationaleWhenPermanentlyDenied = str3;
            this.positiveButtonText = str4;
            this.negativeButtonText = str5;
            this.gpsFeatureTitle = str6;
            this.gpsFeatureRationale = str7;
            this.gpsFeatureModalNegativeButton = str8;
            this.styles = stepStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Props)) {
                return false;
            }
            Props props = (Props) obj;
            return this.permission == props.permission && this.optional == props.optional && Intrinsics.areEqual(this.title, props.title) && Intrinsics.areEqual(this.rationale, props.rationale) && Intrinsics.areEqual(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && Intrinsics.areEqual(this.positiveButtonText, props.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, props.negativeButtonText) && Intrinsics.areEqual(this.gpsFeatureTitle, props.gpsFeatureTitle) && Intrinsics.areEqual(this.gpsFeatureRationale, props.gpsFeatureRationale) && Intrinsics.areEqual(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && Intrinsics.areEqual(this.styles, props.styles);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.permission.hashCode() * 31, 31, this.optional), 31, this.title), 31, this.rationale), 31, this.rationaleWhenPermanentlyDenied);
            String str = this.positiveButtonText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsFeatureTitle;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsFeatureRationale;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureModalNegativeButton;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return hashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Props(permission=");
            sb.append(this.permission);
            sb.append(", optional=");
            sb.append(this.optional);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", rationale=", this.rationale, ", rationaleWhenPermanentlyDenied=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.rationaleWhenPermanentlyDenied, ", positiveButtonText=", this.positiveButtonText, ", negativeButtonText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.negativeButtonText, ", gpsFeatureTitle=", this.gpsFeatureTitle, ", gpsFeatureRationale=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.gpsFeatureRationale, ", gpsFeatureModalNegativeButton=", this.gpsFeatureModalNegativeButton, ", styles=");
            sb.append(this.styles);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.permission.name());
            parcel.writeInt(this.optional ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.rationale);
            parcel.writeString(this.rationaleWhenPermanentlyDenied);
            parcel.writeString(this.positiveButtonText);
            parcel.writeString(this.negativeButtonText);
            parcel.writeString(this.gpsFeatureTitle);
            parcel.writeString(this.gpsFeatureRationale);
            parcel.writeString(this.gpsFeatureModalNegativeButton);
            parcel.writeParcelable(this.styles, i);
        }
    }

    public PermissionRequestWorkflow(Context context, MarkwonImpl markwonImpl, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        markwonImpl.getClass();
        deviceFeatureRequestWorkflow.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.permissionRequestDialogWorkerFactory = markwonImpl;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public final void complete(WorkflowAction.Updater updater, PermissionState permissionState) {
        TrackingEventsLogger.DefaultImpls.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(PermissionsStateKt.toPermissionString(permissionState.permission), PermissionsStateKt.toPermissionResultString(permissionState.result), null, 4, null), false, 2, null);
        updater.setOutput(new Output(permissionState));
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
            PermissionRequestState permissionRequestState = (PermissionRequestState) parcelable;
            if (permissionRequestState != null) {
                return permissionRequestState;
            }
        }
        return PermissionRequestState.CheckPermissionState.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object render(Object obj, Object obj2, StatefulWorkflow.RenderContext renderContext) {
        Feature feature;
        BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
        Props props = (Props) obj;
        PermissionRequestState permissionRequestState = (PermissionRequestState) obj2;
        props.getClass();
        String str = props.negativeButtonText;
        String str2 = props.positiveButtonText;
        Permission permission = props.permission;
        permissionRequestState.getClass();
        if (permissionRequestState.equals(PermissionRequestState.CheckPermissionState.INSTANCE)) {
            baseRenderContext.runningSideEffect("check_permission_state", new PermissionRequestWorkflow$render$1(this, props, renderContext, (Continuation) null));
            return null;
        }
        int i = 0;
        if (permissionRequestState.equals(PermissionRequestState.CheckPermissionRationaleState.INSTANCE)) {
            return new ScreenWithTransition(new OldCheckRequestPermissionRationaleStateView(permission, false, new PermissionRequestWorkflow$$ExternalSyntheticLambda6(renderContext, this, i)), ScreenTransition.NONE);
        }
        boolean equals = permissionRequestState.equals(PermissionRequestState.ShowRequestPermissionRationale.INSTANCE);
        int i2 = 2;
        Context context = this.applicationContext;
        if (equals) {
            TrackingEventsLogger.DefaultImpls.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(PermissionsStateKt.toPermissionString(permission), "permission_sheet_presented", null, 4, null), false, 2, null);
            String str3 = props.title;
            String str4 = props.rationale;
            if (str2 == null) {
                str2 = context.getString(R.string.pi2_permissions_continue);
                str2.getClass();
            }
            String str5 = str2;
            StepStyle stepStyle = props.styles;
            StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2 = new StateFlowsKt$$ExternalSyntheticLambda2(11, renderContext, this);
            if (str == null) {
                str = context.getString(R.string.pi2_permissions_cancel);
                str.getClass();
            }
            return new ScreenWithTransition(new OldBottomSheetDialogView(str3, str4, str5, stepStyle, stateFlowsKt$$ExternalSyntheticLambda2, str, new PermissionRequestWorkflow$$ExternalSyntheticLambda8(renderContext, this, props, i)), ScreenTransition.NONE);
        }
        if (permissionRequestState.equals(PermissionRequestState.RequestPermission.INSTANCE)) {
            MarkwonImpl markwonImpl = this.permissionRequestDialogWorkerFactory;
            markwonImpl.getClass();
            permission.getClass();
            Workflows.runningWorker(renderContext, new PermissionRequestDialogWorker((ActivityResultLauncher) markwonImpl.visitorFactory, (Context) markwonImpl.parser, permission, (TrackingEventsLogger) markwonImpl.plugins), Reflection.typeOf(PermissionRequestDialogWorker.class), "", new PermissionRequestWorkflow$$ExternalSyntheticLambda9(this, renderContext, props, i));
            return null;
        }
        int i3 = 1;
        if (!permissionRequestState.equals(PermissionRequestState.RequestDeviceFeature.INSTANCE)) {
            if (permissionRequestState.equals(PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE)) {
                return new ScreenWithTransition(new OldCheckRequestPermissionRationaleStateView(permission, true, new PermissionRequestWorkflow$$ExternalSyntheticLambda9(renderContext, this, props, i2)), ScreenTransition.NONE);
            }
            if (!permissionRequestState.equals(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE)) {
                if (permissionRequestState.equals(PermissionRequestState.Complete.INSTANCE)) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String str6 = props.title;
            String str7 = props.rationaleWhenPermanentlyDenied;
            if (str2 == null) {
                str2 = context.getString(R.string.pi2_permissions_settings);
                str2.getClass();
            }
            String str8 = str2;
            StepStyle stepStyle2 = props.styles;
            PermissionRequestWorkflow$$ExternalSyntheticLambda8 permissionRequestWorkflow$$ExternalSyntheticLambda8 = new PermissionRequestWorkflow$$ExternalSyntheticLambda8(this, renderContext, props);
            if (str == null) {
                str = context.getString(R.string.pi2_permissions_cancel);
                str.getClass();
            }
            return new ScreenWithTransition(new OldBottomSheetDialogView(str6, str7, str8, stepStyle2, permissionRequestWorkflow$$ExternalSyntheticLambda8, str, new PermissionRequestWorkflow$$ExternalSyntheticLambda8(renderContext, this, props, i2)), ScreenTransition.NONE);
        }
        if (permission != Permission.RoughLocation && permission != Permission.PreciseLocation) {
            baseRenderContext.runningSideEffect("request_device_feature", new PermissionRequestWorkflow$render$1(renderContext, this, props, (Continuation) null));
            return null;
        }
        permission.getClass();
        int ordinal = permission.ordinal();
        if (ordinal == 0) {
            feature = Feature.Camera;
        } else if (ordinal == 1) {
            feature = Feature.RecordAudio;
        } else if (ordinal == 2) {
            feature = Feature.RoughLocation;
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            feature = Feature.PreciseLocation;
        }
        return renderContext.renderChild(this.deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow.Props(feature, props.gpsFeatureTitle, props.gpsFeatureRationale, props.positiveButtonText, props.gpsFeatureModalNegativeButton, props.styles), "", new PermissionRequestWorkflow$$ExternalSyntheticLambda9(this, renderContext, props, i3));
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        PermissionRequestState permissionRequestState = (PermissionRequestState) obj;
        permissionRequestState.getClass();
        return SnapshotParcelsKt.toSnapshot(permissionRequestState);
    }
}
