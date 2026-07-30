package com.crrepa.band.my.model.band.provider.watchface;

import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class JieliWatchFaceProvider {
    private JieliWatchFaceProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.JIELI_WATCH_FACE_API);
        g.getInstance().remove(BaseParamNames.JIELI_WATCH_FACE_FEATURE);
    }

    public static int getWatchFaceApi() {
        return g.getInstance().getInt(BaseParamNames.JIELI_WATCH_FACE_API, 0);
    }

    public static String getWatchFaceConfig() {
        return g.getInstance().getString(BaseParamNames.BLUETRUM_WATCH_FACE_CONFIG, "");
    }

    public static int getWatchFaceFeature() {
        return g.getInstance().getInt(BaseParamNames.JIELI_WATCH_FACE_FEATURE, 0);
    }

    public static boolean hasWatchFaceConfig() {
        g gVar = g.getInstance();
        return gVar.contains(BaseParamNames.JIELI_WATCH_FACE_API) && gVar.contains(BaseParamNames.JIELI_WATCH_FACE_FEATURE) && gVar.contains(BaseParamNames.BLUETRUM_WATCH_FACE_CONFIG);
    }

    public static boolean hasWatchFaceInfo() {
        g gVar = g.getInstance();
        return gVar.contains(BaseParamNames.JIELI_WATCH_FACE_API) && gVar.contains(BaseParamNames.JIELI_WATCH_FACE_FEATURE);
    }

    public static void saveWatchFaceApi(int i8) {
        g.getInstance().putInt(BaseParamNames.JIELI_WATCH_FACE_API, i8);
    }

    public static void saveWatchFaceConfig(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sb.append("\"");
            sb.append(i8);
            sb.append("\"");
            sb.append(":");
            sb.append((int) bArr[i8]);
            if (i8 != bArr.length - 1) {
                sb.append(SystemInfoUtil.COMMA);
            }
        }
        sb.append("}");
        g.getInstance().putString(BaseParamNames.BLUETRUM_WATCH_FACE_CONFIG, sb.toString());
    }

    public static void saveWatchFaceFeature(int i8) {
        g.getInstance().putInt(BaseParamNames.JIELI_WATCH_FACE_FEATURE, i8);
    }
}
