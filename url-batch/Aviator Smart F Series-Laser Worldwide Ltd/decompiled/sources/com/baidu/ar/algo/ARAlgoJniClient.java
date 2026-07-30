package com.baidu.ar.algo;

import com.baidu.ar.libloader.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ARAlgoJniClient {
    public static volatile ARAlgoJniClient arAlgoJniClient;
    private long trackSystemHandler = 0;

    static {
        a.a("dumixarMapAlgo");
    }

    public static native int calModelPosition(float[] fArr, float f8, float[] fArr2, float[] fArr3);

    public static ARAlgoJniClient getAlgoInstance() {
        if (arAlgoJniClient == null) {
            synchronized (ARAlgoJniClient.class) {
                try {
                    if (arAlgoJniClient == null) {
                        arAlgoJniClient = new ARAlgoJniClient();
                    }
                } finally {
                }
            }
        }
        return arAlgoJniClient;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    private native int nativeAddTracker2D(long j8, String str);

    private native int nativeAddTracker3D(long j8, String str, int i8);

    private native int nativeAddTrackerVO(long j8, String str);

    private native int nativeAddTrackerVPS(long j8, String str);

    private native int nativeCreateTrackingSystem(long j8, int i8, int i9, float[] fArr, float[] fArr2);

    private native int nativeGet2dMarkerSize(long j8, int i8, int[] iArr);

    private native int nativeGetModelPose(long j8, int i8, String str, float[] fArr);

    private native int nativeGetTrackerPose(long j8, int i8, float[] fArr);

    private static native String nativeGetVersion();

    private native long nativeInitTrackerSystem();

    private native int nativeInsertModel(long j8, int i8, int i9, int i10, String str, float f8, float[] fArr);

    private native int nativeRelease(long j8);

    private native int nativeRemoveAllModels(long j8, int i8);

    private native int nativeRemoveAllTrackers(long j8);

    private native int nativeRemoveModel(long j8, int i8, String str);

    private native int nativeRemoveTracker(long j8, int i8);

    private native int nativeResetAllTrackers(long j8);

    private native int nativeResetTracker(long j8, int i8);

    private native int nativeTrackFrame(long j8, byte[] bArr, double d8, float[] fArr, FrameType frameType);

    private native int nativeTrackFrameByteBuffer(long j8, ByteBuffer byteBuffer, double d8, float[] fArr, FrameType frameType);

    private native int nativeVpsServerReceiver(long j8, int i8, byte[] bArr);

    public int addTracker2D(String str) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeAddTracker2D(j8, str);
    }

    public int addTracker3D(String str, int i8) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeAddTracker3D(j8, str, i8);
    }

    public int addTrackerVO(String str) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeAddTrackerVO(j8, str);
    }

    public int addTrackerVPS(String str) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeAddTrackerVPS(j8, str);
    }

    public int createTrackingSystem(int i8, int i9, float[] fArr, float[] fArr2) {
        long nativeInitTrackerSystem = nativeInitTrackerSystem();
        this.trackSystemHandler = nativeInitTrackerSystem;
        return nativeCreateTrackingSystem(nativeInitTrackerSystem, i8, i9, fArr, fArr2);
    }

    public int get2DMarkerSize(int i8, int[] iArr) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeGet2dMarkerSize(j8, i8, iArr);
    }

    public int getModelPose(int i8, String str, float[] fArr) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeGetModelPose(j8, i8, str, fArr);
    }

    public int getTrackerPose(int i8, float[] fArr) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeGetTrackerPose(j8, i8, fArr);
    }

    public int insertModel(int i8, int i9, int i10, String str, float f8, float[] fArr) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeInsertModel(j8, i8, i9, i10, str, f8, fArr);
    }

    public int release() {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return 0;
        }
        int nativeRelease = nativeRelease(j8);
        this.trackSystemHandler = 0L;
        return nativeRelease;
    }

    public int removeAllModels(int i8) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeRemoveAllModels(j8, i8);
    }

    public int removeAllTrackers() {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeRemoveAllTrackers(j8);
    }

    public int removeModel(int i8, String str) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeRemoveModel(j8, i8, str);
    }

    public int removeTracker(int i8) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeRemoveTracker(j8, i8);
    }

    public int resetAllTrackers() {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeResetAllTrackers(j8);
    }

    public int resetTracker(int i8) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeResetTracker(j8, i8);
    }

    public int trackFrame(ByteBuffer byteBuffer, double d8, float[] fArr, FrameType frameType) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeTrackFrameByteBuffer(j8, byteBuffer, d8, fArr, frameType);
    }

    public int vpsServerReceiver(int i8, byte[] bArr) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeVpsServerReceiver(j8, i8, bArr);
    }

    public int trackFrame(byte[] bArr, double d8, float[] fArr, FrameType frameType) {
        long j8 = this.trackSystemHandler;
        if (j8 == 0) {
            return -2;
        }
        return nativeTrackFrame(j8, bArr, d8, fArr, frameType);
    }
}
