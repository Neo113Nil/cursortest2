package com.baidu.ar.algo;

import android.util.Log;
import com.baidu.ar.libloader.a;

/* loaded from: classes.dex */
public class ARVPASJniClient {
    private int sTrackerId = -2;
    private int mCreateTrackingSystemResult = -1;

    static {
        a.a("dumixar");
    }

    public boolean addTrackingVPS(String str) {
        try {
            if (this.sTrackerId < 0) {
                this.sTrackerId = ARAlgoJniClient.getAlgoInstance().addTrackerVPS(str);
            }
            return this.sTrackerId > 0;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public int getTrackerPose(float[] fArr) {
        return ARAlgoJniClient.getAlgoInstance().getTrackerPose(this.sTrackerId, fArr);
    }

    public int reciveProtobufBuffer(byte[] bArr) {
        Log.e("debug_pb", "call vps receiver");
        return ARAlgoJniClient.getAlgoInstance().vpsServerReceiver(this.sTrackerId, bArr);
    }

    public void releaseVPS() {
        ARAlgoJniClient.getAlgoInstance().release();
    }

    public void resetVPSAlgo() {
        ARAlgoJniClient.getAlgoInstance().resetTracker(this.sTrackerId);
    }

    public boolean start(int i8, int i9, float[] fArr, float[] fArr2) {
        if (this.mCreateTrackingSystemResult != 0) {
            this.mCreateTrackingSystemResult = ARAlgoJniClient.getAlgoInstance().createTrackingSystem(i8, i9, fArr, fArr2);
        }
        return this.mCreateTrackingSystemResult == 0;
    }

    public int trackFrame(byte[] bArr, float[] fArr, double d8, FrameType frameType) {
        if (bArr == null || fArr == null) {
            return -1;
        }
        return ARAlgoJniClient.getAlgoInstance().trackFrame(bArr, d8, fArr, frameType);
    }
}
