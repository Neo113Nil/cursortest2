package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Landroid/os/Parcelable;", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VideoCaptureConfig implements Parcelable {
    public static final Parcelable.Creator<VideoCaptureConfig> CREATOR = new Creator();
    public final List enabledCaptureFileTypes;
    public final long maxRecordingLengthMs;
    public final boolean recordAudio;
    public final List videoCaptureMethods;
    public final String webRtcJwt;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(VideoCaptureMethod.valueOf(parcel.readString()));
            }
            return new VideoCaptureConfig(readLong, arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoCaptureConfig[i];
        }
    }

    public VideoCaptureConfig(long j, List<? extends NextStep.GovernmentId.CaptureFileType> list, List<? extends VideoCaptureMethod> list2, @Json(name = "webRTCJwt") String str, boolean z) {
        list.getClass();
        list2.getClass();
        this.maxRecordingLengthMs = j;
        this.enabledCaptureFileTypes = list;
        this.videoCaptureMethods = list2;
        this.webRtcJwt = str;
        this.recordAudio = z;
    }

    public final VideoCaptureConfig copy(long maxRecordingLengthMs, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends VideoCaptureMethod> videoCaptureMethods, @Json(name = "webRTCJwt") String webRtcJwt, boolean recordAudio) {
        enabledCaptureFileTypes.getClass();
        videoCaptureMethods.getClass();
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) obj;
        return this.maxRecordingLengthMs == videoCaptureConfig.maxRecordingLengthMs && Intrinsics.areEqual(this.enabledCaptureFileTypes, videoCaptureConfig.enabledCaptureFileTypes) && Intrinsics.areEqual(this.videoCaptureMethods, videoCaptureConfig.videoCaptureMethods) && Intrinsics.areEqual(this.webRtcJwt, videoCaptureConfig.webRtcJwt) && this.recordAudio == videoCaptureConfig.recordAudio;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.maxRecordingLengthMs) * 31, 31, this.enabledCaptureFileTypes), 31, this.videoCaptureMethods);
        String str = this.webRtcJwt;
        return Boolean.hashCode(this.recordAudio) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.maxRecordingLengthMs + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", recordAudio=" + this.recordAudio + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.maxRecordingLengthMs);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledCaptureFileTypes, parcel);
        while (m.hasNext()) {
            parcel.writeString(((NextStep.GovernmentId.CaptureFileType) m.next()).name());
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.videoCaptureMethods, parcel);
        while (m2.hasNext()) {
            parcel.writeString(((VideoCaptureMethod) m2.next()).name());
        }
        parcel.writeString(this.webRtcJwt);
        parcel.writeInt(this.recordAudio ? 1 : 0);
    }
}
