package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureState;
import com.withpersona.sdk2.inquiry.permissions.Feature;
import com.withpersona.sdk2.inquiry.permissions.FeatureRequestResult;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class PoseConfig implements Parcelable {
    public static final Parcelable.Creator<PoseConfig> CREATOR = new Creator(0);
    public static final PoseConfig Default = new PoseConfig(false, true, 8000, true);
    public final boolean allowReview;
    public final boolean autoCaptureEnabled;
    public final long manualCaptureDelayMs;
    public final boolean manualCaptureEnabled;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            long j;
            boolean z4 = false;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    if (parcel.readInt() != 0) {
                        z = false;
                        z4 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = z;
                        z = true;
                    } else {
                        z2 = z;
                    }
                    long readLong = parcel.readLong();
                    if (parcel.readInt() != 0) {
                        j = readLong;
                        z3 = true;
                    } else {
                        z3 = z2;
                        j = readLong;
                    }
                    return new PoseConfig(z4, z, j, z3);
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.Complete.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE;
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE;
                case 5:
                    parcel.getClass();
                    return new DeviceFeatureState(Feature.valueOf(parcel.readString()), FeatureRequestResult.valueOf(parcel.readString()));
                case 6:
                    parcel.getClass();
                    return new PermissionRequestWorkflow.Output(PermissionState.CREATOR.createFromParcel(parcel));
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE;
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.CheckPermissionRationaleState.INSTANCE;
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.CheckPermissionState.INSTANCE;
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.Complete.INSTANCE;
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.RequestDeviceFeature.INSTANCE;
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.RequestPermission.INSTANCE;
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE;
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestWorkflow.PermissionRequestState.ShowRequestPermissionRationale.INSTANCE;
                case 15:
                    parcel.getClass();
                    return new PermissionRequestWorkflow.Props(Permission.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(PermissionRequestWorkflow.Props.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new PermissionState(Permission.valueOf(parcel.readString()), PermissionResult.valueOf(parcel.readString()));
                case 17:
                    parcel.getClass();
                    return new PermissionRequestFragment.PermissionRequestFragmentArgs(parcel.readString(), PermissionRequestWorkflow.Props.CREATOR.createFromParcel(parcel));
                case 18:
                    parcel.getClass();
                    return new PermissionRequestFragment.PermissionRequestFragmentResult(parcel.readString(), PermissionState.CREATOR.createFromParcel(parcel));
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE;
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE;
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE;
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.CheckPermissionRationaleState.INSTANCE;
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.CheckPermissionState.INSTANCE;
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.Complete.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.RequestDeviceFeature.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.RequestPermission.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return PermissionRequestStateManager.PermissionRequestState.ShowRequestPermissionRationale.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PoseConfig[i];
                case 1:
                    return new DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.CheckDeviceFeatureState[i];
                case 2:
                    return new DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.Complete[i];
                case 3:
                    return new DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.RequestDeviceFeature[i];
                case 4:
                    return new DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.ShowDeviceFeaturePrompt[i];
                case 5:
                    return new DeviceFeatureState[i];
                case 6:
                    return new PermissionRequestWorkflow.Output[i];
                case 7:
                    return new PermissionRequestWorkflow.PermissionRequestState.CheckPermissionPermanentlyDenied[i];
                case 8:
                    return new PermissionRequestWorkflow.PermissionRequestState.CheckPermissionRationaleState[i];
                case 9:
                    return new PermissionRequestWorkflow.PermissionRequestState.CheckPermissionState[i];
                case 10:
                    return new PermissionRequestWorkflow.PermissionRequestState.Complete[i];
                case 11:
                    return new PermissionRequestWorkflow.PermissionRequestState.RequestDeviceFeature[i];
                case 12:
                    return new PermissionRequestWorkflow.PermissionRequestState.RequestPermission[i];
                case 13:
                    return new PermissionRequestWorkflow.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage[i];
                case 14:
                    return new PermissionRequestWorkflow.PermissionRequestState.ShowRequestPermissionRationale[i];
                case 15:
                    return new PermissionRequestWorkflow.Props[i];
                case 16:
                    return new PermissionState[i];
                case 17:
                    return new PermissionRequestFragment.PermissionRequestFragmentArgs[i];
                case 18:
                    return new PermissionRequestFragment.PermissionRequestFragmentResult[i];
                case 19:
                    return new PermissionRequestStateManager.DeviceFeatureRequestState.CheckDeviceFeatureState[i];
                case 20:
                    return new PermissionRequestStateManager.DeviceFeatureRequestState.RequestDeviceFeature[i];
                case 21:
                    return new PermissionRequestStateManager.DeviceFeatureRequestState.ShowDeviceFeaturePrompt[i];
                case 22:
                    return new PermissionRequestStateManager.PermissionRequestState.CheckPermissionPermanentlyDenied[i];
                case 23:
                    return new PermissionRequestStateManager.PermissionRequestState.CheckPermissionRationaleState[i];
                case 24:
                    return new PermissionRequestStateManager.PermissionRequestState.CheckPermissionState[i];
                case 25:
                    return new PermissionRequestStateManager.PermissionRequestState.Complete[i];
                case 26:
                    return new PermissionRequestStateManager.PermissionRequestState.RequestDeviceFeature[i];
                case 27:
                    return new PermissionRequestStateManager.PermissionRequestState.RequestPermission[i];
                case 28:
                    return new PermissionRequestStateManager.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage[i];
                default:
                    return new PermissionRequestStateManager.PermissionRequestState.ShowRequestPermissionRationale[i];
            }
        }
    }

    public PoseConfig(boolean z, boolean z2, long j, boolean z3) {
        this.allowReview = z;
        this.manualCaptureEnabled = z2;
        this.manualCaptureDelayMs = j;
        this.autoCaptureEnabled = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) obj;
        return this.allowReview == poseConfig.allowReview && this.manualCaptureEnabled == poseConfig.manualCaptureEnabled && this.manualCaptureDelayMs == poseConfig.manualCaptureDelayMs && this.autoCaptureEnabled == poseConfig.autoCaptureEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.autoCaptureEnabled) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.allowReview) * 31, 31, this.manualCaptureEnabled), 31, this.manualCaptureDelayMs);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PoseConfig(allowReview=", ", manualCaptureEnabled=", ", manualCaptureDelayMs=", this.allowReview, this.manualCaptureEnabled);
        m.append(this.manualCaptureDelayMs);
        m.append(", autoCaptureEnabled=");
        m.append(this.autoCaptureEnabled);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.allowReview ? 1 : 0);
        parcel.writeInt(this.manualCaptureEnabled ? 1 : 0);
        parcel.writeLong(this.manualCaptureDelayMs);
        parcel.writeInt(this.autoCaptureEnabled ? 1 : 0);
    }
}
