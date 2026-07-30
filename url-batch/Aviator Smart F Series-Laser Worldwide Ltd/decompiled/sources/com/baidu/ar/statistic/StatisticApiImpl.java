package com.baidu.ar.statistic;

import android.content.Context;
import android.os.AsyncTask;
import android.os.HandlerThread;
import com.baidu.ar.aa;
import com.baidu.ar.ba;
import com.baidu.ar.bc;
import com.baidu.ar.c8;
import com.baidu.ar.cc;
import com.baidu.ar.d8;
import com.baidu.ar.e8;
import com.baidu.ar.statistic.a;
import com.baidu.ar.t3;
import com.baidu.ar.u3;
import com.baidu.ar.v3;
import com.baidu.ar.x3;
import com.baidu.ar.x6;
import com.baidu.ar.z9;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class StatisticApiImpl implements x6, a.InterfaceC0039a {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f3230a;

    /* renamed from: b, reason: collision with root package name */
    public v3 f3231b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f3232c;

    /* renamed from: d, reason: collision with root package name */
    public c8 f3233d;

    /* renamed from: e, reason: collision with root package name */
    public x3 f3234e;

    /* renamed from: f, reason: collision with root package name */
    public volatile z9 f3235f;

    public StatisticApiImpl(Context context, HandlerThread handlerThread) {
        this.f3234e = new x3(context, "ar_stats_local.json", 100, 40);
        x3 x3Var = new x3(context, "ar_stats_pfm_local.json", 200, 0);
        this.f3235f = new z9(x3Var, 20, 200);
        a(handlerThread, new u3(context, this.f3234e, bc.f1843a, cc.a(), this.f3235f));
        a(context, x3Var);
        this.f3231b.a(1, (Object) null);
        a(context);
    }

    public final void a(Context context) {
        new a(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "");
    }

    public void doRelease() {
        synchronized (this) {
            try {
                HandlerThread handlerThread = this.f3230a;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                c8 c8Var = this.f3233d;
                if (c8Var != null) {
                    c8Var.b();
                }
                if (this.f3232c != null) {
                    synchronized (this.f3234e) {
                        try {
                            if (this.f3234e.isEmpty()) {
                                this.f3232c.interrupt();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t3.g();
    }

    @Override // com.baidu.ar.x6
    public boolean isAllowPerformanceEvent(String str) {
        return this.f3235f.b(str);
    }

    @Override // com.baidu.ar.x6
    public void onEvent(String str, String str2) {
        t3 f8 = t3.f(str);
        f8.a("event_param", str2);
        this.f3231b.a(2, f8);
    }

    @Override // com.baidu.ar.x6
    public void onEventDebounce(String str, long j8, String str2) {
        t3 f8 = t3.f(str);
        f8.a("_db_period", Long.valueOf(j8));
        f8.a("event_param", str2);
        this.f3231b.a(6, f8);
    }

    @Override // com.baidu.ar.x6
    public void onEventEnd(String str) {
        this.f3231b.a(5, t3.f(str));
    }

    @Override // com.baidu.ar.x6
    public void onEventStart(String str) {
        this.f3231b.a(4, t3.f(str));
    }

    @Override // com.baidu.ar.x6
    public void onEventStatus(String str, String str2, boolean z7) {
        t3 f8 = t3.f(str);
        f8.a("__stt", z7 ? "1" : "0");
        f8.a("__falseev", str2);
        this.f3231b.a(3, f8);
    }

    @Override // com.baidu.ar.x6
    public void onPerformance(String str, Map<String, String> map) {
        synchronized (this.f3235f) {
            try {
                if (this.f3235f.b(str)) {
                    t3 f8 = t3.f(str);
                    f8.a(map);
                    this.f3231b.a(20, f8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.baidu.ar.statistic.a.InterfaceC0039a
    public void onPerformanceRequestFinished(List<String> list) {
        this.f3231b.a(21, list);
    }

    @Override // com.baidu.ar.x6
    public void pause() {
        this.f3231b.a(97, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.baidu.ar.x6
    public void release() {
        this.f3231b.a(99, this);
    }

    @Override // com.baidu.ar.x6
    public void resume() {
        this.f3231b.a(98, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.baidu.ar.x6
    public void setPubParam(String str, String str2) {
        this.f3231b.a(str, str2);
    }

    @Override // com.baidu.ar.x6
    public void setPubParams(Map<String, String> map) {
        this.f3231b.a(map);
    }

    public final void a(Context context, x3 x3Var) {
        x3 x3Var2 = this.f3234e;
        this.f3233d = new c8(context, x3Var2, new d8[]{new d8(x3Var2, 1, new e8(), true), new aa(x3Var, 20, new ba(), false)});
        Thread thread = new Thread(this.f3233d, "StatsLogSendThd");
        this.f3232c = thread;
        thread.start();
    }

    @Override // com.baidu.ar.x6
    public void onEvent(String str, Map<String, String> map) {
        t3 f8 = t3.f(str);
        f8.a(map);
        this.f3231b.a(2, f8);
    }

    @Override // com.baidu.ar.x6
    public void onEventDebounce(String str, long j8, Map<String, String> map) {
        t3 f8 = t3.f(str);
        f8.a(map);
        f8.a("_db_period", Long.valueOf(j8));
        this.f3231b.a(6, f8);
    }

    @Override // com.baidu.ar.x6
    public void onPerformance(String str, JSONObject jSONObject) {
        synchronized (this.f3235f) {
            try {
                if (this.f3235f.b(str)) {
                    t3 f8 = t3.f(str);
                    f8.a("data", jSONObject);
                    this.f3231b.a(20, f8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(HandlerThread handlerThread, u3 u3Var) {
        HandlerThread handlerThread2;
        if (handlerThread != null) {
            this.f3230a = handlerThread;
            if (handlerThread.getState() == Thread.State.NEW) {
                handlerThread2 = this.f3230a;
            }
            this.f3231b = new v3(this.f3230a.getLooper(), u3Var);
        }
        handlerThread2 = new HandlerThread("StatsEventThd", 10);
        this.f3230a = handlerThread2;
        handlerThread2.start();
        this.f3231b = new v3(this.f3230a.getLooper(), u3Var);
    }
}
