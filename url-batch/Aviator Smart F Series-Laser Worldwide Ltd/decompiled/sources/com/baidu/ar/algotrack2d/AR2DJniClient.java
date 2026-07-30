package com.baidu.ar.algotrack2d;

import cn.hutool.core.text.l;
import com.baidu.ar.algo.ARAlgoJniClient;
import com.baidu.ar.algo.FrameType;
import com.baidu.ar.h;
import com.baidu.ar.la;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class AR2DJniClient {
    private static int sTrackerId;

    public static boolean arGetMarkerSize(int[] iArr) {
        return ARAlgoJniClient.getAlgoInstance().get2DMarkerSize(sTrackerId, iArr) == 0;
    }

    public static int arInit(int i8, int i9, float[] fArr, String str) {
        la a8 = la.a(i8, i9);
        if (ARAlgoJniClient.getAlgoInstance().createTrackingSystem(i8, i9, a8.a(), a8.b()) != 0) {
            return 0;
        }
        if (new File(str, "targets.mlist").exists()) {
            sTrackerId = ARAlgoJniClient.getAlgoInstance().addTracker2D(str);
        } else {
            sTrackerId = -1;
        }
        return sTrackerId < 0 ? -1 : 1;
    }

    public static int arRelease() {
        int release = ARAlgoJniClient.getAlgoInstance().release();
        sTrackerId = -1;
        return release;
    }

    public static int arTracking(ByteBuffer byteBuffer, float[] fArr) {
        int trackFrame = ARAlgoJniClient.getAlgoInstance().trackFrame(byteBuffer, System.currentTimeMillis() / 1000.0f, new float[16], FrameType.TYPE_YUV);
        int trackerPose = ARAlgoJniClient.getAlgoInstance().getTrackerPose(sTrackerId, fArr);
        h.a("Track2D", sTrackerId + " arTracking " + trackFrame + l.SPACE + trackerPose);
        return trackerPose == 0 ? 1 : 0;
    }

    public static String getVersion() {
        return ARAlgoJniClient.getVersion();
    }
}
