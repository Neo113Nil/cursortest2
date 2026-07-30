package com.baidu.platform.comapi.h.t;

import com.baidu.mapapi.map.BaiduMap;

/* loaded from: classes2.dex */
public class e {
    public static void a(String str, String str2, boolean z7) {
        BaiduMap map;
        com.baidu.platform.comapi.wnplatform.walkmap.c t7 = com.baidu.platform.comapi.walknavi.b.n().t();
        if (t7 != null && t7.e() != null && (map = t7.e().getMap()) != null) {
            map.switchBaseIndoorMapFloor(str, str2);
        }
        if (z7) {
            com.baidu.platform.comapi.walknavi.b.n().s().a(str2, str);
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE);
            com.baidu.platform.comapi.walknavi.b.n().l().run("强诱导转到分段");
            com.baidu.platform.comapi.walknavi.b.n().s().u();
        }
    }

    public static void a(boolean z7) {
        BaiduMap map;
        com.baidu.platform.comapi.wnplatform.walkmap.c t7 = com.baidu.platform.comapi.walknavi.b.n().t();
        if (t7 == null || t7.e() == null || (map = t7.e().getMap()) == null) {
            return;
        }
        map.setIndoorEnable(z7);
    }
}
