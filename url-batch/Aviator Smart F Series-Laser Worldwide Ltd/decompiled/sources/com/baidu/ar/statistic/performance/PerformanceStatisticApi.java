package com.baidu.ar.statistic.performance;

import android.os.SystemClock;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.q6;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.performance.a;
import com.baidu.ar.u2;
import java.util.Random;

/* loaded from: classes.dex */
public class PerformanceStatisticApi implements q6 {

    /* renamed from: d, reason: collision with root package name */
    public a.C0040a f3240d;

    /* renamed from: a, reason: collision with root package name */
    public int f3237a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3238b = false;

    /* renamed from: c, reason: collision with root package name */
    public a f3239c = new a();

    /* renamed from: e, reason: collision with root package name */
    public u2 f3241e = new u2();

    public final void a() {
        if (this.f3240d == null) {
            a.C0040a c0040a = new a.C0040a();
            this.f3240d = c0040a;
            int i8 = this.f3237a + 1;
            this.f3237a = i8;
            c0040a.f3248a = i8;
            this.f3239c.f3247f.add(c0040a);
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameIn() {
        try {
            if (this.f3238b) {
                a();
                this.f3240d.f3249b = SystemClock.elapsedRealtime();
            }
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameOut() {
        try {
            if (this.f3238b) {
                a();
                this.f3240d.f3250c = SystemClock.elapsedRealtime();
                if (this.f3237a >= 3) {
                    a aVar = this.f3239c;
                    u2 u2Var = this.f3241e;
                    aVar.f3244c = u2Var.f3373b;
                    aVar.f3243b = u2Var.f3372a;
                    aVar.f3245d = u2Var.f3374c;
                    aVar.f3246e = u2Var.f3375d;
                    aVar.f3242a = ARConfig.getARKey();
                    StatisticApi.onPerformance("performance_summary", this.f3239c.a());
                    this.f3239c.b();
                    this.f3237a = 0;
                    this.f3238b = false;
                }
                this.f3240d = null;
            }
            if (!this.f3238b && StatisticApi.isAllowPerformanceEvent("performance_summary") && new Random().nextInt(20) == 1) {
                this.f3238b = true;
            }
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    public void recordAlgoTimeCost(String str, String str2, long j8, int i8) {
        try {
            if (this.f3238b) {
                a();
                a.C0040a.C0041a c0041a = new a.C0040a.C0041a();
                c0041a.f3252a = str;
                c0041a.f3253b = str2;
                c0041a.f3254c = j8;
                c0041a.f3255d = i8;
                this.f3240d.f3251d.add(c0041a);
            }
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    public void switchCase(String str) {
        try {
            this.f3239c.f3242a = str;
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }
}
