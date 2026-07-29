package com.umeng.debug.log;

import android.util.Log;

/* loaded from: classes2.dex */
public class I implements UInterface {
    @Override // com.umeng.debug.log.UInterface
    public void log(String str, String str2) {
        Log.i(str, str2);
    }
}
