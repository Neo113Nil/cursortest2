package com.bytedance.sdk.openadsdk.core.klz.zmn;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.ironsource.X3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fs {
    private static volatile fs zmn;
    private final ArrayList<String> fs = new ArrayList<>();
    private final AtomicBoolean zn = new AtomicBoolean(false);
    private long fb = System.currentTimeMillis();
    private long btk = 0;
    private long hhw = 0;
    private String nps = "";
    private String zg = "";
    private String bvs = "";
    private boolean iv = false;
    private boolean rc = false;

    public static fs zmn(Application application) {
        if (zmn == null) {
            synchronized (fs.class) {
                try {
                    if (zmn == null) {
                        fs fsVar = new fs();
                        zmn = fsVar;
                        fsVar.iv = zmn((Context) application);
                        zmn.rc = zmn(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        zmn.zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private static int zmn(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean zmn(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void zmn(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.fs.size() == 0) {
            this.nps = localClassName;
            this.btk = System.currentTimeMillis();
            this.hhw = System.currentTimeMillis() - this.fb;
            this.zn.set(false);
        }
        if (!this.fs.contains(localClassName)) {
            this.fs.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.bvs = localClassName;
    }

    public void fs(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.fs.contains(localClassName)) {
            this.fs.remove(localClassName);
        }
        if (this.fs.size() == 0) {
            this.fb = System.currentTimeMillis();
            this.zn.set(true);
            this.zg = localClassName;
        }
    }

    private void zmn() {
        int size;
        boolean z = true;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(X3.i.h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object valueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.fs.contains(localClassName)) {
                            this.fs.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.zn;
                if (this.fs.size() > 0) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
        } catch (Throwable unused) {
        }
    }

    public String zmn(String str, long j, int i) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.btk;
        long j3 = currentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.zn.get() && this.rc) {
            i2 |= 2;
        }
        if (!this.zn.get() && this.hhw >= 5000 && j2 < 1000) {
            i2 = this.zg.equals(this.bvs) ? i2 | 4 : i2 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.hhw).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.zn).put("alert", this.rc).put(NotificationCompat.CATEGORY_SYSTEM, this.iv).put("actsize", this.fs.size()).put("mutiproc", true ^ phc.zmn(kgc.zmn())).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.nps = "";
        this.hhw = 0L;
        this.btk = 0L;
        this.fb = System.currentTimeMillis();
        return str2;
    }
}
