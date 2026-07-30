package com.baidu.ar.statistic;

import android.content.Context;
import android.os.HandlerThread;
import com.baidu.ar.ab;
import com.baidu.ar.ca;
import com.baidu.ar.h;
import com.baidu.ar.q6;
import com.baidu.ar.x6;
import java.lang.reflect.Constructor;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class StatisticApi {

    /* renamed from: a, reason: collision with root package name */
    public static x6 f3228a;

    /* renamed from: b, reason: collision with root package name */
    public static q6 f3229b;

    public static q6 getPerformanceApi() {
        if (f3229b == null) {
            f3229b = new ca();
        }
        return f3229b;
    }

    public static void init(Context context) {
        if (f3228a == null) {
            try {
                Constructor<?> a8 = ab.a("com.baidu.ar.statistic.StatisticApiImpl", (Class<?>[]) new Class[]{Context.class, HandlerThread.class});
                if (a8 != null) {
                    f3228a = (x6) ab.a(a8, context, null);
                }
            } catch (Throwable th) {
                f3228a = null;
                h.b("Statistic init fail");
                th.printStackTrace();
            }
        }
        if (f3229b == null) {
            f3229b = new ca();
        }
    }

    public static boolean isAllowPerformanceEvent(String str) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            return x6Var.isAllowPerformanceEvent(str);
        }
        return true;
    }

    public static void onEvent(String str) {
        onEvent(str, "");
    }

    public static void onEventDebounce(String str, long j8, String str2) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEventDebounce(str, j8, str2);
        }
    }

    public static void onEventEnd(String str) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEventEnd(str);
        }
    }

    public static void onEventStart(String str) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEventStart(str);
        }
    }

    public static void onEventStatus(String str, String str2, boolean z7) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEventStatus(str, str2, z7);
        }
    }

    public static void onPerformance(String str, Map<String, String> map) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onPerformance(str, map);
        }
    }

    public static void pause() {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.pause();
        }
    }

    public static void release() {
        f3229b = null;
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.release();
            f3228a = null;
        }
    }

    public static void resume() {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.resume();
        }
    }

    public static void setPubParam(String str, String str2) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.setPubParam(str, str2);
        }
    }

    public static void setPubParams(Map<String, String> map) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.setPubParams(map);
        }
    }

    public static void onEvent(String str, String str2) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEvent(str, str2);
        }
    }

    public static void onEventDebounce(String str, long j8, Map<String, String> map) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEventDebounce(str, j8, map);
        }
    }

    public static void onPerformance(String str, JSONObject jSONObject) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onPerformance(str, jSONObject);
        }
    }

    public static void onEvent(String str, Map<String, String> map) {
        x6 x6Var = f3228a;
        if (x6Var != null) {
            x6Var.onEvent(str, map);
        }
    }
}
