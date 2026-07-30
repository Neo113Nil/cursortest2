package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class BandNotificationListProvider {
    public static void delete() {
        g.getInstance().remove(BaseParamNames.BAND_NOTIFICATION_LIST);
    }

    public static List<Integer> getNotificationList() {
        return s.json2List(g.getInstance().getString(BaseParamNames.BAND_NOTIFICATION_LIST, null), Integer[].class);
    }

    public static void saveNotificationList(List<Integer> list) {
        g.getInstance().putString(BaseParamNames.BAND_NOTIFICATION_LIST, s.bean2Json(list));
    }
}
