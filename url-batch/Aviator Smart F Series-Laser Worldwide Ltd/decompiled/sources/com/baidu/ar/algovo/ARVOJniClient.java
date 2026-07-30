package com.baidu.ar.algovo;

import com.baidu.ar.algo.ARAlgoJniClient;
import com.baidu.ar.algo.FrameType;
import com.baidu.ar.slam.TrackModel;
import com.baidu.ar.slam.TrackParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ARVOJniClient {
    private static List<String> sModelIds;
    private static int sTrackerId;

    public static int calModelPosition(float[] fArr, float f8, float[] fArr2, float[] fArr3) {
        return ARAlgoJniClient.calModelPosition(fArr, f8, fArr2, fArr3);
    }

    public static synchronized ArrayList<TrackModel> fetchModelPose() {
        ArrayList<TrackModel> arrayList;
        synchronized (ARVOJniClient.class) {
            arrayList = new ArrayList<>();
            List<String> list = sModelIds;
            if (list != null) {
                for (String str : list) {
                    float[] fArr = new float[16];
                    if (ARAlgoJniClient.getAlgoInstance().getModelPose(sTrackerId, str, fArr) == 0) {
                        TrackModel trackModel = new TrackModel();
                        trackModel.setId(str);
                        trackModel.setPose(fArr);
                        arrayList.add(trackModel);
                    }
                }
            }
        }
        return arrayList;
    }

    public static synchronized int insertModel(String str, int i8, int i9, float[] fArr, float f8) {
        int insertModel;
        synchronized (ARVOJniClient.class) {
            try {
                insertModel = ARAlgoJniClient.getAlgoInstance().insertModel(sTrackerId, i8, i9, str, f8, fArr);
                if (insertModel == 0) {
                    if (sModelIds == null) {
                        sModelIds = new ArrayList();
                    }
                    sModelIds.add(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return insertModel;
    }

    public static synchronized int removeAllModel() {
        int removeAllModels;
        List<String> list;
        synchronized (ARVOJniClient.class) {
            removeAllModels = ARAlgoJniClient.getAlgoInstance().removeAllModels(sTrackerId);
            if (removeAllModels == 0 && (list = sModelIds) != null) {
                list.clear();
            }
        }
        return removeAllModels;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        com.baidu.ar.algovo.ARVOJniClient.sModelIds.remove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int removeModel(String str) {
        int removeModel;
        List<String> list;
        synchronized (ARVOJniClient.class) {
            removeModel = ARAlgoJniClient.getAlgoInstance().removeModel(sTrackerId, str);
            if (removeModel == 0 && (list = sModelIds) != null) {
                int size = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (sModelIds.get(i8).equals(str)) {
                        break;
                    }
                    i8++;
                }
            }
        }
        return removeModel;
    }

    public static synchronized void reset() {
        synchronized (ARVOJniClient.class) {
            if (sTrackerId >= 0) {
                ARAlgoJniClient.getAlgoInstance().removeAllModels(sTrackerId);
            }
        }
    }

    public static synchronized boolean start(int i8, int i9, float[] fArr, float[] fArr2) {
        synchronized (ARVOJniClient.class) {
            if (ARAlgoJniClient.getAlgoInstance().createTrackingSystem(i8, i9, fArr, fArr2) != 0) {
                return false;
            }
            int addTrackerVO = ARAlgoJniClient.getAlgoInstance().addTrackerVO("");
            sTrackerId = addTrackerVO;
            return addTrackerVO >= 0;
        }
    }

    public static synchronized void stop() {
        synchronized (ARVOJniClient.class) {
            ARAlgoJniClient.getAlgoInstance().release();
            sModelIds = null;
        }
    }

    public static synchronized TrackParams track(ByteBuffer byteBuffer, float[] fArr) {
        TrackParams trackParams;
        synchronized (ARVOJniClient.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int trackFrame = ARAlgoJniClient.getAlgoInstance().trackFrame(byteBuffer, currentTimeMillis * 1.0f, fArr, FrameType.TYPE_YUV);
            trackParams = new TrackParams();
            trackParams.processTime = System.currentTimeMillis() - currentTimeMillis;
            trackParams.trackQuality = trackFrame;
        }
        return trackParams;
    }
}
