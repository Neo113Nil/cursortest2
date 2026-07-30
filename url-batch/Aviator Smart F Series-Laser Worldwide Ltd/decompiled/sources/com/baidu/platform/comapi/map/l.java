package com.baidu.platform.comapi.map;

import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static boolean f9781a = false;

    static void a(String str, String str2) {
        if (f9781a) {
            Log.d("MapTrace-" + str, "thread:" + Thread.currentThread().getName() + ":" + Thread.currentThread().getId() + SystemInfoUtil.COMMA + str2);
        }
    }
}
