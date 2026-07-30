package y1;

import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class c {
    public static final String HISILICON_WATCH_FACE_TIME_STYLE = "hisilicon_watch_face_time_style";

    public static void delete() {
        g.getInstance().remove(HISILICON_WATCH_FACE_TIME_STYLE + ((int) CRPWatchFaceType.PHOTO_WATCH_FACE.getValue()));
        g.getInstance().remove(HISILICON_WATCH_FACE_TIME_STYLE + ((int) CRPWatchFaceType.VIDEO_WATCH_FACE.getValue()));
        g.getInstance().remove(HISILICON_WATCH_FACE_TIME_STYLE + ((int) CRPWatchFaceType.AI_WATCH_FACE.getValue()));
    }

    public static CRPWatchFaceTimeStyle getTimeStyle(CRPWatchFaceType cRPWatchFaceType) {
        return (CRPWatchFaceTimeStyle) new Gson().fromJson(g.getInstance().getString(HISILICON_WATCH_FACE_TIME_STYLE + ((int) cRPWatchFaceType.getValue()), ""), CRPWatchFaceTimeStyle.class);
    }

    public static void save(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        String json = new Gson().toJson(cRPWatchFaceTimeStyle);
        g.getInstance().putString(HISILICON_WATCH_FACE_TIME_STYLE + ((int) cRPWatchFaceType.getValue()), json);
    }
}
