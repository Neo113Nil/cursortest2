package com.crrepa.band.my.device.pushmessage.notify;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;

/* loaded from: classes2.dex */
public class f {
    private static final String CLASH_PACKAGE_NAME = "com.github.kr328.clash";
    private static final String CRREPA_APP = "com.crrepa";
    public static final String HUAWEI_MEDIA_CONTROLLER = "com.huawei.mediacontroller";
    private static final String MUSIC = "music";
    private static final String PLAYER = "player";
    private static final String RING_APP = "com.moyoung";
    private static final String[] BLACK_LIST = {HttpConstants.OS_TYPE_VALUE, "com.android.systemui", "com.samsung.android.incallui", "com.huawei.systemmanager", "com.android.chrome", "com.sec.android.app.sbrowser", "com.android.providers.downloads", "com.android.vending", "com.bbk.appstore", "com.mi.health", "com.miui.gallery", "com.xiaomi.bsp.gps.nps", "com.xiaomi.mi_connect_service", "com.miui.smsextra", "com.v2ray.ang", "com.github.shadowsocks", "com.moyoung.ring", "com.kuura.ring", "com.nova.ring"};
    private static final String[] MUSIC_PALYER_LIST = {"com.tencent.qqmusic", "fm.xiami.main", "com.netease.cloudmusic", "cn.kuwo.player", "cmccwm.mobilemusic", "com.douban.radio", "com.sing.client"};

    public static boolean isBlackList(String str) {
        if (str.contains(CRREPA_APP) || str.contains(CLASH_PACKAGE_NAME) || str.contains(RING_APP)) {
            return true;
        }
        for (String str2 : BLACK_LIST) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPlayer(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains(MUSIC) || str.contains(PLAYER)) {
            return true;
        }
        for (String str2 : MUSIC_PALYER_LIST) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
