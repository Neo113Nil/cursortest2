package com.baidu.ar.dumixhuman.callback;

import java.util.HashMap;

/* loaded from: classes.dex */
public interface IMessageLuaCallback {
    void onMessage(int i8, HashMap<String, Object> hashMap);

    void onUnloadCase(int i8, HashMap<String, Object> hashMap);
}
