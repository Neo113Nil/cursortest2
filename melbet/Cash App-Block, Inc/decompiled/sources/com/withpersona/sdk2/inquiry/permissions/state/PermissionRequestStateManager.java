package com.withpersona.sdk2.inquiry.permissions.state;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.SavedStateHandle;
import com.squareup.cash.R;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import io.noties.markwon.MarkwonImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import org.commonmark.node.Node;

/* loaded from: classes9.dex */
public final class PermissionRequestStateManager extends Node {
    public final Context applicationContext;
    public final DeviceFeatureRequestWorker_Factory_Impl deviceFeatureRequestWorkerFactory;
    public final MarkwonImpl permissionRequestDialogWorkerFactory;
    public final TrackingEventsLogger trackingEventsLogger;

    public abstract class DeviceFeatureRequestState extends PermissionRequestState {

        public final class CheckDeviceFeatureState extends DeviceFeatureRequestState {
            public static final CheckDeviceFeatureState INSTANCE = new CheckDeviceFeatureState();
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new PoseConfig.Creator(19);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckDeviceFeatureState);
            }

            public final int hashCode() {
                return -200408212;
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

        public final class RequestDeviceFeature extends DeviceFeatureRequestState {
            public static final RequestDeviceFeature INSTANCE = new RequestDeviceFeature();
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new PoseConfig.Creator(20);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestDeviceFeature);
            }

            public final int hashCode() {
                return 1651676862;
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
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new PoseConfig.Creator(21);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowDeviceFeaturePrompt);
            }

            public final int hashCode() {
                return 610825882;
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

    public abstract class PermissionRequestState extends SimpleWorkflowState {

        public final class CheckPermissionPermanentlyDenied extends PermissionRequestState {
            public static final CheckPermissionPermanentlyDenied INSTANCE = new CheckPermissionPermanentlyDenied();
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new PoseConfig.Creator(22);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckPermissionPermanentlyDenied);
            }

            public final int hashCode() {
                return -1216770821;
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

        public final class CheckPermissionRationaleState extends PermissionRequestState {
            public static final CheckPermissionRationaleState INSTANCE = new CheckPermissionRationaleState();
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new PoseConfig.Creator(23);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckPermissionRationaleState);
            }

            public final int hashCode() {
                return 1021319477;
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

        public final class CheckPermissionState extends PermissionRequestState {
            public static final CheckPermissionState INSTANCE = new CheckPermissionState();
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new PoseConfig.Creator(24);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckPermissionState);
            }

            public final int hashCode() {
                return 1373860566;
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

        public final class Complete extends PermissionRequestState {
            public static final Complete INSTANCE = new Complete();
            public static final Parcelable.Creator<Complete> CREATOR = new PoseConfig.Creator(25);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Complete);
            }

            public final int hashCode() {
                return -1573796811;
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

        public final class RequestDeviceFeature extends PermissionRequestState {
            public static final RequestDeviceFeature INSTANCE = new RequestDeviceFeature();
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new PoseConfig.Creator(26);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestDeviceFeature);
            }

            public final int hashCode() {
                return 438328941;
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

        public final class RequestPermission extends PermissionRequestState {
            public static final RequestPermission INSTANCE = new RequestPermission();
            public static final Parcelable.Creator<RequestPermission> CREATOR = new PoseConfig.Creator(27);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestPermission);
            }

            public final int hashCode() {
                return -1427966398;
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

        public final class ShowPermissionPermanentlyDeniedMessage extends PermissionRequestState {
            public static final ShowPermissionPermanentlyDeniedMessage INSTANCE = new ShowPermissionPermanentlyDeniedMessage();
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new PoseConfig.Creator(28);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public final int hashCode() {
                return 333834169;
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

        public final class ShowRequestPermissionRationale extends PermissionRequestState {
            public static final ShowRequestPermissionRationale INSTANCE = new ShowRequestPermissionRationale();
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new PoseConfig.Creator(29);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowRequestPermissionRationale);
            }

            public final int hashCode() {
                return -738457678;
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

    public interface Rendering {

        public final class BottomSheetRendering implements Rendering {
            public final SubtreeManager view;

            public BottomSheetRendering(SubtreeManager subtreeManager) {
                this.view = subtreeManager;
            }
        }

        public final class CheckRequestPermissionRationaleRendering implements Rendering {
            public final CheckRequestPermissionRationaleStateView view;

            public CheckRequestPermissionRationaleRendering(CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView) {
                this.view = checkRequestPermissionRationaleStateView;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestStateManager(PermissionRequestWorkflow.Props props, SavedStateHandle savedStateHandle, Context context, MarkwonImpl markwonImpl, DeviceFeatureRequestWorker_Factory_Impl deviceFeatureRequestWorker_Factory_Impl, TrackingEventsLogger trackingEventsLogger) {
        super(props, savedStateHandle);
        props.getClass();
        savedStateHandle.getClass();
        context.getClass();
        markwonImpl.getClass();
        deviceFeatureRequestWorker_Factory_Impl.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.permissionRequestDialogWorkerFactory = markwonImpl;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorker_Factory_Impl;
        this.trackingEventsLogger = trackingEventsLogger;
        if (((SubtreeManager) this.lastChild).getState() == null) {
            SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
            ((PermissionRequestWorkflow.Props) ((StateFlowImpl) this.firstChild).getValue()).getClass();
            subtreeManager.updateState(PermissionRequestState.CheckPermissionState.INSTANCE);
        }
        SubtreeManager subtreeManager2 = (SubtreeManager) this.lastChild;
        PermissionRequestStateManager$$ExternalSyntheticLambda0 permissionRequestStateManager$$ExternalSyntheticLambda0 = new PermissionRequestStateManager$$ExternalSyntheticLambda0(this, 1);
        subtreeManager2.children = permissionRequestStateManager$$ExternalSyntheticLambda0;
        permissionRequestStateManager$$ExternalSyntheticLambda0.invoke(subtreeManager2.getState());
        JobKt.launch$default((ContextScope) this.parent, Dispatchers.Unconfined, null, new HazeSourceNode$launchPreDraw$1(this, null, 20), 2);
    }

    public static final void access$handleState(final PermissionRequestStateManager permissionRequestStateManager, final PermissionRequestWorkflow.Props props, PermissionRequestState permissionRequestState) {
        Context context = permissionRequestStateManager.applicationContext;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) permissionRequestStateManager.next;
        SubtreeManager subtreeManager = (SubtreeManager) permissionRequestStateManager.lastChild;
        final int i = 0;
        Continuation continuation = null;
        if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.CheckPermissionState.INSTANCE)) {
            subtreeManager.runningSideEffect("check_permission_state", new PermissionRequestStateManager$handleState$1(permissionRequestStateManager, props, continuation, i));
            return;
        }
        if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.CheckPermissionRationaleState.INSTANCE)) {
            Rendering.CheckRequestPermissionRationaleRendering checkRequestPermissionRationaleRendering = new Rendering.CheckRequestPermissionRationaleRendering(new CheckRequestPermissionRationaleStateView(props.permission, false, new PermissionRequestStateManager$$ExternalSyntheticLambda0(permissionRequestStateManager, i)));
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, checkRequestPermissionRationaleRendering);
            return;
        }
        final int i2 = 2;
        if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.ShowRequestPermissionRationale.INSTANCE)) {
            TrackingEventsLogger.DefaultImpls.logPermissionEvent$default(permissionRequestStateManager.trackingEventsLogger, new PermissionTrackingEventData(PermissionsStateKt.toPermissionString(props.permission), "permission_sheet_presented", null, 4, null), false, 2, null);
            String str = props.title;
            String str2 = props.rationale;
            String str3 = props.positiveButtonText;
            if (str3 == null) {
                str3 = context.getString(R.string.pi2_permissions_continue);
                str3.getClass();
            }
            String str4 = str3;
            StepStyle stepStyle = props.styles;
            Function0 function0 = new Function0(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda1
                public final /* synthetic */ PermissionRequestStateManager f$0;

                {
                    this.f$0 = permissionRequestStateManager;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i;
                    PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                    switch (i3) {
                        case 0:
                            ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.PermissionRequestState.RequestPermission.INSTANCE);
                            break;
                        default:
                            ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            String str5 = props.negativeButtonText;
            if (str5 == null) {
                str5 = context.getString(R.string.pi2_permissions_cancel);
                str5.getClass();
            }
            Rendering.BottomSheetRendering bottomSheetRendering = new Rendering.BottomSheetRendering(new SubtreeManager(str, str2, str4, stepStyle, function0, str5, new Function0(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ PermissionRequestStateManager f$0;

                {
                    this.f$0 = permissionRequestStateManager;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i;
                    PermissionRequestWorkflow.Props props2 = props;
                    PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                    switch (i3) {
                        case 0:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                        case 1:
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.addFlags(268435456);
                            Context context2 = permissionRequestStateManager2.applicationContext;
                            intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                            context2.startActivity(intent);
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                            break;
                        case 2:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                        default:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bottomSheetRendering);
            return;
        }
        if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.RequestPermission.INSTANCE)) {
            MarkwonImpl markwonImpl = permissionRequestStateManager.permissionRequestDialogWorkerFactory;
            Permission permission = props.permission;
            markwonImpl.getClass();
            permission.getClass();
            subtreeManager.runningWorker(new PermissionRequestDialogWorker((ActivityResultLauncher) markwonImpl.visitorFactory, (Context) markwonImpl.parser, permission, (TrackingEventsLogger) markwonImpl.plugins), new Function1(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda3
                public final /* synthetic */ PermissionRequestStateManager f$0;

                {
                    this.f$0 = permissionRequestStateManager;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i;
                    PermissionRequestWorkflow.Props props2 = props;
                    PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                    switch (i3) {
                        case 0:
                            SubtreeManager subtreeManager2 = (SubtreeManager) permissionRequestStateManager2.lastChild;
                            PermissionRequestDialogWorker.Output output = (PermissionRequestDialogWorker.Output) obj;
                            output.getClass();
                            if (output.equals(PermissionRequestDialogWorker.Output.Success.INSTANCE)) {
                                subtreeManager2.updateState(PermissionRequestStateManager.PermissionRequestState.RequestDeviceFeature.INSTANCE);
                            } else {
                                if (!output.equals(PermissionRequestDialogWorker.Output.Denied.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (props2.optional) {
                                    permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                                } else {
                                    subtreeManager2.updateState(PermissionRequestStateManager.PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            if (((Boolean) obj).booleanValue()) {
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            } else {
                                ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE);
                            }
                            return Unit.INSTANCE;
                        default:
                            DeviceFeatureRequestWorker.Output output2 = (DeviceFeatureRequestWorker.Output) obj;
                            output2.getClass();
                            if (output2 instanceof DeviceFeatureRequestWorker.Output.Success) {
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionGranted));
                            } else if (output2 instanceof DeviceFeatureRequestWorker.Output.Denied) {
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            } else {
                                if (!(output2 instanceof DeviceFeatureRequestWorker.Output.NotSupported)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                                intent.setFlags(268435456);
                                permissionRequestStateManager2.applicationContext.startActivity(intent);
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
            return;
        }
        boolean areEqual = Intrinsics.areEqual(permissionRequestState, PermissionRequestState.RequestDeviceFeature.INSTANCE);
        DeviceFeatureRequestState.CheckDeviceFeatureState checkDeviceFeatureState = DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE;
        if (areEqual) {
            Permission permission2 = props.permission;
            if (permission2 == Permission.RoughLocation || permission2 == Permission.PreciseLocation) {
                subtreeManager.updateState(checkDeviceFeatureState);
                return;
            } else {
                subtreeManager.runningSideEffect("request_device_feature", new PermissionRequestStateManager$handleState$1(permissionRequestStateManager, props, continuation, i2));
                return;
            }
        }
        final int i3 = 1;
        if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE)) {
            Rendering.CheckRequestPermissionRationaleRendering checkRequestPermissionRationaleRendering2 = new Rendering.CheckRequestPermissionRationaleRendering(new CheckRequestPermissionRationaleStateView(props.permission, true, new Function1(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda3
                public final /* synthetic */ PermissionRequestStateManager f$0;

                {
                    this.f$0 = permissionRequestStateManager;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    PermissionRequestWorkflow.Props props2 = props;
                    PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                    switch (i32) {
                        case 0:
                            SubtreeManager subtreeManager2 = (SubtreeManager) permissionRequestStateManager2.lastChild;
                            PermissionRequestDialogWorker.Output output = (PermissionRequestDialogWorker.Output) obj;
                            output.getClass();
                            if (output.equals(PermissionRequestDialogWorker.Output.Success.INSTANCE)) {
                                subtreeManager2.updateState(PermissionRequestStateManager.PermissionRequestState.RequestDeviceFeature.INSTANCE);
                            } else {
                                if (!output.equals(PermissionRequestDialogWorker.Output.Denied.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (props2.optional) {
                                    permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                                } else {
                                    subtreeManager2.updateState(PermissionRequestStateManager.PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE);
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            if (((Boolean) obj).booleanValue()) {
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            } else {
                                ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE);
                            }
                            return Unit.INSTANCE;
                        default:
                            DeviceFeatureRequestWorker.Output output2 = (DeviceFeatureRequestWorker.Output) obj;
                            output2.getClass();
                            if (output2 instanceof DeviceFeatureRequestWorker.Output.Success) {
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionGranted));
                            } else if (output2 instanceof DeviceFeatureRequestWorker.Output.Denied) {
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            } else {
                                if (!(output2 instanceof DeviceFeatureRequestWorker.Output.NotSupported)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                                intent.setFlags(268435456);
                                permissionRequestStateManager2.applicationContext.startActivity(intent);
                                permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, checkRequestPermissionRationaleRendering2);
            return;
        }
        if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE)) {
            String str6 = props.title;
            String str7 = props.rationaleWhenPermanentlyDenied;
            String str8 = props.positiveButtonText;
            if (str8 == null) {
                str8 = context.getString(R.string.pi2_permissions_settings);
                str8.getClass();
            }
            String str9 = str8;
            StepStyle stepStyle2 = props.styles;
            Function0 function02 = new Function0(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ PermissionRequestStateManager f$0;

                {
                    this.f$0 = permissionRequestStateManager;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i3;
                    PermissionRequestWorkflow.Props props2 = props;
                    PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                    switch (i32) {
                        case 0:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                        case 1:
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.addFlags(268435456);
                            Context context2 = permissionRequestStateManager2.applicationContext;
                            intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                            context2.startActivity(intent);
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                            break;
                        case 2:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                        default:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            String str10 = props.negativeButtonText;
            if (str10 == null) {
                str10 = context.getString(R.string.pi2_permissions_cancel);
                str10.getClass();
            }
            Rendering.BottomSheetRendering bottomSheetRendering2 = new Rendering.BottomSheetRendering(new SubtreeManager(str6, str7, str9, stepStyle2, function02, str10, new Function0(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ PermissionRequestStateManager f$0;

                {
                    this.f$0 = permissionRequestStateManager;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i2;
                    PermissionRequestWorkflow.Props props2 = props;
                    PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                    switch (i32) {
                        case 0:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                        case 1:
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.addFlags(268435456);
                            Context context2 = permissionRequestStateManager2.applicationContext;
                            intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                            context2.startActivity(intent);
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                            break;
                        case 2:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                        default:
                            permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bottomSheetRendering2);
            return;
        }
        if (Intrinsics.areEqual(permissionRequestState, checkDeviceFeatureState)) {
            subtreeManager.runningSideEffect("check_device_feature_state", new PermissionRequestStateManager$handleState$1(permissionRequestStateManager, props, continuation, i3));
            return;
        }
        if (!Intrinsics.areEqual(permissionRequestState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE)) {
            if (Intrinsics.areEqual(permissionRequestState, DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE)) {
                DeviceFeatureRequestWorker_Factory deviceFeatureRequestWorker_Factory = permissionRequestStateManager.deviceFeatureRequestWorkerFactory.delegateFactory;
                subtreeManager.runningWorker(new DeviceFeatureRequestWorker((ActivityResultLauncher) deviceFeatureRequestWorker_Factory.resolvableApiLauncherProvider.get(), (Context) deviceFeatureRequestWorker_Factory.contextProvider.get()), new Function1(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda3
                    public final /* synthetic */ PermissionRequestStateManager f$0;

                    {
                        this.f$0 = permissionRequestStateManager;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i32 = i2;
                        PermissionRequestWorkflow.Props props2 = props;
                        PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                        switch (i32) {
                            case 0:
                                SubtreeManager subtreeManager2 = (SubtreeManager) permissionRequestStateManager2.lastChild;
                                PermissionRequestDialogWorker.Output output = (PermissionRequestDialogWorker.Output) obj;
                                output.getClass();
                                if (output.equals(PermissionRequestDialogWorker.Output.Success.INSTANCE)) {
                                    subtreeManager2.updateState(PermissionRequestStateManager.PermissionRequestState.RequestDeviceFeature.INSTANCE);
                                } else {
                                    if (!output.equals(PermissionRequestDialogWorker.Output.Denied.INSTANCE)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    if (props2.optional) {
                                        permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                                    } else {
                                        subtreeManager2.updateState(PermissionRequestStateManager.PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (((Boolean) obj).booleanValue()) {
                                    permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                                } else {
                                    ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE);
                                }
                                return Unit.INSTANCE;
                            default:
                                DeviceFeatureRequestWorker.Output output2 = (DeviceFeatureRequestWorker.Output) obj;
                                output2.getClass();
                                if (output2 instanceof DeviceFeatureRequestWorker.Output.Success) {
                                    permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionGranted));
                                } else if (output2 instanceof DeviceFeatureRequestWorker.Output.Denied) {
                                    permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                                } else {
                                    if (!(output2 instanceof DeviceFeatureRequestWorker.Output.NotSupported)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                                    intent.setFlags(268435456);
                                    permissionRequestStateManager2.applicationContext.startActivity(intent);
                                    permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                                }
                                return Unit.INSTANCE;
                        }
                    }
                });
                return;
            } else {
                if (Intrinsics.areEqual(permissionRequestState, PermissionRequestState.Complete.INSTANCE)) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        String str11 = props.gpsFeatureTitle;
        if (str11 == null) {
            str11 = "Couldn't access location feature";
        }
        String str12 = str11;
        String str13 = props.gpsFeatureRationale;
        if (str13 == null) {
            str13 = "Location is turned off, please allow access to your device's location feature";
        }
        String str14 = str13;
        String str15 = props.positiveButtonText;
        if (str15 == null) {
            str15 = "Allow";
        }
        String str16 = str15;
        StepStyle stepStyle3 = props.styles;
        Function0 function03 = new Function0(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda1
            public final /* synthetic */ PermissionRequestStateManager f$0;

            {
                this.f$0 = permissionRequestStateManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                switch (i32) {
                    case 0:
                        ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.PermissionRequestState.RequestPermission.INSTANCE);
                        break;
                    default:
                        ((SubtreeManager) permissionRequestStateManager2.lastChild).updateState(PermissionRequestStateManager.DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        String str17 = props.gpsFeatureModalNegativeButton;
        if (str17 == null) {
            str17 = "Cancel";
        }
        final int i4 = 3;
        Rendering.BottomSheetRendering bottomSheetRendering3 = new Rendering.BottomSheetRendering(new SubtreeManager(str12, str14, str16, stepStyle3, function03, str17, new Function0(permissionRequestStateManager) { // from class: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$$ExternalSyntheticLambda2
            public final /* synthetic */ PermissionRequestStateManager f$0;

            {
                this.f$0 = permissionRequestStateManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                PermissionRequestWorkflow.Props props2 = props;
                PermissionRequestStateManager permissionRequestStateManager2 = this.f$0;
                switch (i32) {
                    case 0:
                        permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                        break;
                    case 1:
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addFlags(268435456);
                        Context context2 = permissionRequestStateManager2.applicationContext;
                        intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                        context2.startActivity(intent);
                        permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.SettingsLaunched));
                        break;
                    case 2:
                        permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                        break;
                    default:
                        permissionRequestStateManager2.complete(new PermissionState(props2.permission, PermissionResult.PermissionRejected));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, bottomSheetRendering3);
    }

    public final void complete(PermissionState permissionState) {
        TrackingEventsLogger.DefaultImpls.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(PermissionsStateKt.toPermissionString(permissionState.permission), PermissionsStateKt.toPermissionResultString(permissionState.result), null, 4, null), false, 2, null);
        setOutput(new PermissionRequestWorkflow.Output(permissionState));
    }
}
