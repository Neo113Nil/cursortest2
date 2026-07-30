package com.crrepa.band.my.device.ai.picture.model;

import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AIPictureModel {
    public static final String AI_PICTURE_HISTORY = "ai_picture_history";
    public static final int MAX_HISTORY_COUNT = 10;
    public static final String SENT_AI_PICTURE_PATH = "sent_ai_picture_path";

    public static void deleteAllPictureHistory() {
        g.getInstance().putString(AI_PICTURE_HISTORY, null);
        g.getInstance().putString(SENT_AI_PICTURE_PATH, null);
    }

    public static void deleteOnePictureHistory(int i8) {
        List<AIPictureHistoryBean> pictureHistoryList = getPictureHistoryList();
        if (pictureHistoryList == null) {
            return;
        }
        pictureHistoryList.remove(i8);
        g.getInstance().putString(AI_PICTURE_HISTORY, s.bean2Json(pictureHistoryList));
    }

    public static AIPictureHistoryBean getLatestPictureHistory() {
        List<AIPictureHistoryBean> pictureHistoryList = getPictureHistoryList();
        if (pictureHistoryList == null || pictureHistoryList.size() == 0) {
            return null;
        }
        return pictureHistoryList.get(0);
    }

    public static List<AIPictureHistoryBean> getPictureHistoryList() {
        return s.json2List(g.getInstance().getString(AI_PICTURE_HISTORY, null), AIPictureHistoryBean[].class);
    }

    public static String getSavedCount() {
        List<AIPictureHistoryBean> pictureHistoryList = getPictureHistoryList();
        if (pictureHistoryList == null || pictureHistoryList.size() == 0) {
            return null;
        }
        return String.valueOf(pictureHistoryList.size());
    }

    public static void save2PictureHistory(AIPictureHistoryBean aIPictureHistoryBean) {
        List pictureHistoryList = getPictureHistoryList();
        if (pictureHistoryList == null) {
            pictureHistoryList = new ArrayList();
        }
        pictureHistoryList.add(0, aIPictureHistoryBean);
        if (pictureHistoryList.size() >= 10) {
            pictureHistoryList = pictureHistoryList.subList(0, 10);
        }
        g.getInstance().putString(AI_PICTURE_HISTORY, s.bean2Json(pictureHistoryList));
    }
}
