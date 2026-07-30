package com.baidu.platform.comapi;

import android.content.Context;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapsdkplatform.comapi.commonutils.b;
import com.baidu.platform.comjni.engine.MessageProxy;
import com.baidu.platform.comjni.engine.NAEngine;

/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    static boolean f8737a = false;

    /* renamed from: b, reason: collision with root package name */
    private NAEngine f8738b;

    public boolean a(Context context) {
        f8737a = false;
        this.f8738b = new NAEngine();
        boolean a8 = NAEngine.a(context, null);
        if (OpenLogUtil.isMapLogEnable()) {
            b.a().a("initEngine isEngineSuccess = " + a8);
        }
        if (a8) {
            return a8;
        }
        com.baidu.platform.comapi.f.a.a().a("engine_init_failed");
        return false;
    }

    public boolean b() {
        f8737a = false;
        return true;
    }

    public boolean b(Context context) {
        boolean initLongLinkClient = NAEngine.initLongLinkClient();
        if (initLongLinkClient) {
            return initLongLinkClient;
        }
        return false;
    }

    public void a() {
        if (f8737a) {
            b();
        }
        MessageProxy.destroy();
        NAEngine.c();
        if (this.f8738b != null) {
            this.f8738b = null;
        }
    }
}
