package com.bytedance.sdk.openadsdk.core.NB.pvs;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdShowCheckForSec.java */
/* loaded from: classes2.dex */
public class icD {
    private static volatile icD pvs;
    private final ArrayList<String> icD = new ArrayList<>();
    private final AtomicBoolean vG = new AtomicBoolean(false);
    private long Jd = System.currentTimeMillis();
    private long NB = 0;
    private long sUS = 0;
    private String yiw = "";
    private String so = "";
    private String Mxy = "";
    private boolean Wyp = false;
    private boolean qh = false;

    public static icD pvs(Application application) {
        if (pvs == null) {
            synchronized (icD.class) {
                if (pvs == null) {
                    icD icd = new icD();
                    pvs = icd;
                    icd.Wyp = pvs((Context) application);
                    pvs.qh = pvs(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    pvs.pvs();
                }
            }
        }
        return pvs;
    }

    private static int pvs(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean pvs(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void pvs(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.icD.size() == 0) {
            this.yiw = localClassName;
            this.NB = System.currentTimeMillis();
            this.sUS = System.currentTimeMillis() - this.Jd;
            this.vG.set(false);
        }
        if (!this.icD.contains(localClassName)) {
            this.icD.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.Mxy = localClassName;
    }

    public void icD(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.icD.contains(localClassName)) {
            this.icD.remove(localClassName);
        }
        if (this.icD.size() == 0) {
            this.Jd = System.currentTimeMillis();
            this.vG.set(true);
            this.so = localClassName;
        }
    }

    private void pvs() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object valueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.icD.contains(localClassName)) {
                            this.icD.add(localClassName);
                        }
                    }
                }
                this.vG.set(this.icD.size() <= 0);
            }
        } catch (Exception unused) {
        }
    }

    public String pvs(String str, long j, int i) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.NB;
        long j3 = currentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.vG.get() && this.qh) {
            i2 |= 2;
        }
        if (!this.vG.get() && this.sUS >= 5000 && j2 < 1000) {
            i2 = this.so.equals(this.Mxy) ? i2 | 4 : i2 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.sUS).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.vG).put("alert", this.qh).put(NotificationCompat.CATEGORY_SYSTEM, this.Wyp).put("actsize", this.icD.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.icD.vG()).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.yiw = "";
        this.sUS = 0L;
        this.NB = 0L;
        this.Jd = System.currentTimeMillis();
        return str2;
    }
}
