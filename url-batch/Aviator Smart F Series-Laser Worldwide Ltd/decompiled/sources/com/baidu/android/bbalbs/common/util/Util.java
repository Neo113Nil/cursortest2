package com.baidu.android.bbalbs.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.baidu.bbalbscesium.m.c;

/* loaded from: classes.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f1430a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f1431b = "Util";

    private Util() {
    }

    public static boolean hasOtherServiceRuninMyPid(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getApplicationContext().getSystemService("activity")).getRunningServices(100)) {
            if (runningServiceInfo.pid == Process.myPid() && !TextUtils.equals(runningServiceInfo.service.getClassName(), str)) {
                return true;
            }
        }
        return false;
    }

    public static String toHexString(byte[] bArr, String str, boolean z7) {
        return c.a(bArr, str, z7);
    }

    public static String toMd5(byte[] bArr, boolean z7) {
        return c.a(bArr, z7);
    }
}
