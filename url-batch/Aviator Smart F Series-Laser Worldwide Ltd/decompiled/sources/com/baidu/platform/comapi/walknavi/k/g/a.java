package com.baidu.platform.comapi.walknavi.k.g;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static Toast f10282a;

    public static void a(Context context, String str) {
        List<ActivityManager.RunningTaskInfo> list;
        ComponentName componentName;
        if (context == null) {
            return;
        }
        try {
            list = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        } catch (SecurityException unused) {
            Log.e("TipTool", "catch SecurityException");
            list = null;
        }
        if (list == null || list.get(0) == null) {
            return;
        }
        String packageName = context.getPackageName();
        componentName = list.get(0).baseActivity;
        if (packageName.equals(componentName.getPackageName())) {
            Toast toast = f10282a;
            if (toast != null) {
                toast.cancel();
            }
            Toast makeText = Toast.makeText(context, str, str.length() <= 15 ? 0 : 1);
            f10282a = makeText;
            makeText.show();
        }
    }
}
