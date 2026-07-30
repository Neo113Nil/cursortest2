package com.baidu.ar;

import com.baidu.ar.bean.ARResource;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface ARCallback {
    void onCaseChange(boolean z7);

    void onCaseCreated(ARResource aRResource);

    void onLuaMessage(HashMap<String, Object> hashMap);

    void onPause(boolean z7);

    void onRelease(boolean z7);

    void onReset(boolean z7);

    void onResume(boolean z7);

    void onSetup(boolean z7);

    void onStateChange(int i8, Object obj);

    void onStateError(int i8, String str);
}
