package com.baidu.mapapi;

import android.content.Context;

/* loaded from: classes2.dex */
public class BMapManager {
    public static void destroy() {
        com.baidu.mapsdkplatform.comapi.a.e().c();
    }

    public static Context getContext() {
        try {
            return com.baidu.mapsdkplatform.comapi.a.e().d();
        } catch (IllegalStateException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static void init() {
        try {
            com.baidu.mapsdkplatform.comapi.a.e().f();
        } catch (IllegalStateException e8) {
            e8.printStackTrace();
        }
    }
}
