package com.baidu.mapsdkplatform.comapi.map;

import android.os.Handler;
import com.baidu.platform.comjni.engine.MessageProxy;

/* loaded from: classes2.dex */
public class MessageCenter {
    public static void registMessage(int i8, Handler handler) {
        MessageProxy.registerMessageHandler(i8, handler);
    }

    public static void unregistMessage(int i8, Handler handler) {
        MessageProxy.unRegisterMessageHandler(i8, handler);
    }
}
