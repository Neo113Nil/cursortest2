package com.baidu.platform.comapi.walknavi.g.i.k;

import android.util.Log;
import cn.hutool.core.text.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f10070a = 5;

    public static void a(String str) {
        if (f10070a > 3) {
            return;
        }
        Log.d("ARLOG", a() + l.SPACE + str);
    }

    public static String a() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(stackTraceElement.getFileName());
        stringBuffer.append(" | ");
        stringBuffer.append(stackTraceElement.getLineNumber());
        stringBuffer.append(" | ");
        stringBuffer.append(stackTraceElement.getMethodName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
