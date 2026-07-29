package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.g;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ViewPageTracker.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private static final int f8954b = 5;

    /* renamed from: c, reason: collision with root package name */
    private static JSONArray f8955c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private static Object f8956d = new Object();
    private final Map<String, Long> e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    Stack<String> f8957a = new Stack<>();

    public static void a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f8956d) {
                    jSONArray = f8955c.toString();
                    f8955c = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("__a", new JSONArray(jSONArray));
                    if (jSONObject.length() > 0) {
                        g.a(context).a(o.a().d(), jSONObject, g.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f8957a.size() != 0) {
            UMConfigure.umDebugLog.aq("A_10105", 0, "\\|", new String[]{"@"}, new String[]{this.f8957a.peek()}, null, null);
        }
        synchronized (this.e) {
            this.e.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f8957a.push(str);
            }
        }
    }

    public void b(String str) {
        Long l;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.e.containsKey(str)) {
            synchronized (this.e) {
                l = this.e.get(str);
            }
            if (l == null) {
                return;
            }
            if (UMConfigure.isDebugLog() && this.f8957a.size() > 0 && this.f8957a.peek() == str) {
                this.f8957a.pop();
            }
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            synchronized (f8956d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(b.u, str);
                    jSONObject.put("duration", currentTimeMillis);
                    f8955c.put(jSONObject);
                    if (f8955c.length() >= 5 && (appContext = UMModuleRegister.getAppContext()) != null) {
                        UMWorkDispatch.sendEvent(appContext, 4099, CoreProtocol.getInstance(appContext), null);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!UMConfigure.isDebugLog() || this.f8957a.size() == 0) {
                return;
            }
            UMConfigure.umDebugLog.aq("A_10104", 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
            return;
        }
        if (UMConfigure.isDebugLog() && this.f8957a.size() == 0) {
            UMConfigure.umDebugLog.aq("A_10106", 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    public void a() {
        String str;
        synchronized (this.e) {
            str = null;
            long j = 0;
            for (Map.Entry<String, Long> entry : this.e.entrySet()) {
                if (entry.getValue().longValue() > j) {
                    long longValue = entry.getValue().longValue();
                    str = entry.getKey();
                    j = longValue;
                }
            }
        }
        if (str != null) {
            b(str);
        }
    }
}
