package com.tencent.bugly.crashreport.crash.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Process;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f8641c;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f8642d;
    private final w e;
    private final com.tencent.bugly.crashreport.common.strategy.a f;
    private final String g;
    private final com.tencent.bugly.crashreport.crash.b h;
    private FileObserver i;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f8639a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private long f8640b = -1;
    private boolean j = true;

    public b(Context context, com.tencent.bugly.crashreport.common.strategy.a aVar, com.tencent.bugly.crashreport.common.info.a aVar2, w wVar, com.tencent.bugly.crashreport.crash.b bVar) {
        this.f8641c = z.a(context);
        this.g = context.getDir("bugly", 0).getAbsolutePath();
        this.f8642d = aVar2;
        this.e = wVar;
        this.f = aVar;
        this.h = bVar;
    }

    private CrashDetailBean a(a aVar) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.B = com.tencent.bugly.crashreport.common.info.b.g();
            crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.e();
            crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.i();
            crashDetailBean.E = this.f8642d.p();
            crashDetailBean.F = this.f8642d.o();
            crashDetailBean.G = this.f8642d.q();
            crashDetailBean.w = z.a(this.f8641c, c.e, (String) null);
            crashDetailBean.f8620b = 3;
            crashDetailBean.e = this.f8642d.h();
            crashDetailBean.f = this.f8642d.j;
            crashDetailBean.g = this.f8642d.w();
            crashDetailBean.m = this.f8642d.g();
            crashDetailBean.n = "ANR_EXCEPTION";
            crashDetailBean.o = aVar.f;
            crashDetailBean.q = aVar.g;
            crashDetailBean.N = new HashMap();
            crashDetailBean.N.put("BUGLY_CR_01", aVar.e);
            int indexOf = crashDetailBean.q != null ? crashDetailBean.q.indexOf("\n") : -1;
            crashDetailBean.p = indexOf > 0 ? crashDetailBean.q.substring(0, indexOf) : "GET_FAIL";
            crashDetailBean.r = aVar.f8637c;
            if (crashDetailBean.q != null) {
                crashDetailBean.u = z.b(crashDetailBean.q.getBytes());
            }
            crashDetailBean.y = aVar.f8636b;
            crashDetailBean.z = this.f8642d.f8601d;
            crashDetailBean.A = "main(1)";
            crashDetailBean.H = this.f8642d.y();
            crashDetailBean.h = this.f8642d.v();
            crashDetailBean.i = this.f8642d.I();
            crashDetailBean.v = aVar.f8638d;
            crashDetailBean.K = this.f8642d.n;
            crashDetailBean.L = this.f8642d.f8598a;
            crashDetailBean.M = this.f8642d.a();
            crashDetailBean.O = this.f8642d.F();
            crashDetailBean.P = this.f8642d.G();
            crashDetailBean.Q = this.f8642d.z();
            crashDetailBean.R = this.f8642d.E();
            this.h.c(crashDetailBean);
            crashDetailBean.x = y.a();
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
        }
        return crashDetailBean;
    }

    private static boolean a(String str, String str2, String str3) {
        BufferedWriter bufferedWriter;
        TraceFileHelper.a readTargetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (readTargetDumpInfo == null || readTargetDumpInfo.f8634d == null || readTargetDumpInfo.f8634d.size() <= 0) {
            x.e("not found trace dump for %s", str3);
            return false;
        }
        File file = new File(str2);
        try {
            if (!file.exists()) {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
            if (!file.exists() || !file.canWrite()) {
                x.e("backup file create fail %s", str2);
                return false;
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
            }
            try {
                String[] strArr = readTargetDumpInfo.f8634d.get("main");
                if (strArr != null && strArr.length >= 3) {
                    String str4 = strArr[0];
                    String str5 = strArr[1];
                    bufferedWriter.write("\"main\" tid=" + strArr[2] + " :\n" + str4 + "\n" + str5 + "\n\n");
                    bufferedWriter.flush();
                }
                for (Map.Entry<String, String[]> entry : readTargetDumpInfo.f8634d.entrySet()) {
                    if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                        String str6 = entry.getValue()[0];
                        String str7 = entry.getValue()[1];
                        bufferedWriter.write("\"" + entry.getKey() + "\" tid=" + entry.getValue()[2] + " :\n" + str6 + "\n" + str7 + "\n\n");
                        bufferedWriter.flush();
                    }
                }
                try {
                    bufferedWriter.close();
                } catch (IOException e2) {
                    if (!x.a(e2)) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                if (!x.a(e)) {
                    e.printStackTrace();
                }
                x.e("dump trace fail %s", e.getClass().getName() + ":" + e.getMessage());
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e4) {
                        if (!x.a(e4)) {
                            e4.printStackTrace();
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e5) {
                        if (!x.a(e5)) {
                            e5.printStackTrace();
                        }
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            if (!x.a(e6)) {
                e6.printStackTrace();
            }
            x.e("backup file create error! %s  %s", e6.getClass().getName() + ":" + e6.getMessage(), str2);
            return false;
        }
    }

    public final boolean a() {
        return this.f8639a.get() != 0;
    }

    public final void a(String str) {
        long j;
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        synchronized (this) {
            if (this.f8639a.get() != 0) {
                x.c("trace started return ", new Object[0]);
                return;
            }
            this.f8639a.set(1);
            try {
                try {
                    x.c("read trace first dump for create time!", new Object[0]);
                    TraceFileHelper.a readFirstDumpInfo = TraceFileHelper.readFirstDumpInfo(str, false);
                    j = readFirstDumpInfo != null ? readFirstDumpInfo.f8633c : -1L;
                    if (j == -1) {
                        x.d("trace dump fail could not get time!", new Object[0]);
                        j = System.currentTimeMillis();
                    }
                } finally {
                    this.f8639a.set(0);
                }
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                x.e("handle anr error %s", th.getClass().toString());
            }
            if (Math.abs(j - this.f8640b) < TapjoyConstants.TIMER_INCREMENT) {
                x.d("should not process ANR too Fre in %d", 10000);
            } else {
                this.f8640b = j;
                this.f8639a.set(1);
                try {
                    Map<String, String> a2 = z.a(c.f, false);
                    if (a2 != null && a2.size() > 0) {
                        Context context = this.f8641c;
                        x.c("to find!", new Object[0]);
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        int i = 0;
                        loop0: while (true) {
                            x.c("waiting!", new Object[0]);
                            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (it.hasNext()) {
                                    processErrorStateInfo = it.next();
                                    if (processErrorStateInfo.condition == 2) {
                                        x.c("found!", new Object[0]);
                                        break loop0;
                                    }
                                }
                            }
                            z.b(500L);
                            int i2 = i + 1;
                            if (i >= 20) {
                                x.c("end!", new Object[0]);
                                processErrorStateInfo = null;
                                break;
                            }
                            i = i2;
                        }
                        if (processErrorStateInfo == null) {
                            x.c("proc state is unvisiable!", new Object[0]);
                        } else if (processErrorStateInfo.pid != Process.myPid()) {
                            x.c("not mind proc!", processErrorStateInfo.processName);
                        } else {
                            x.a("found visiable anr , start to process!", new Object[0]);
                            Context context2 = this.f8641c;
                            this.f.c();
                            if (!this.f.b()) {
                                x.e("waiting for remote sync", new Object[0]);
                                int i3 = 0;
                                while (!this.f.b()) {
                                    z.b(500L);
                                    i3 += TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
                                    if (i3 >= 3000) {
                                        break;
                                    }
                                }
                            }
                            File file = new File(context2.getFilesDir(), "bugly/bugly_trace_" + j + ".txt");
                            a aVar = new a();
                            aVar.f8637c = j;
                            aVar.f8638d = file.getAbsolutePath();
                            aVar.f8635a = processErrorStateInfo.processName;
                            aVar.f = processErrorStateInfo.shortMsg;
                            aVar.e = processErrorStateInfo.longMsg;
                            aVar.f8636b = a2;
                            if (a2 != null) {
                                for (String str2 : a2.keySet()) {
                                    if (str2.startsWith("main(")) {
                                        aVar.g = a2.get(str2);
                                    }
                                }
                            }
                            Object[] objArr = new Object[6];
                            objArr[0] = Long.valueOf(aVar.f8637c);
                            objArr[1] = aVar.f8638d;
                            objArr[2] = aVar.f8635a;
                            objArr[3] = aVar.f;
                            objArr[4] = aVar.e;
                            objArr[5] = Integer.valueOf(aVar.f8636b == null ? 0 : aVar.f8636b.size());
                            x.c("anr tm:%d\ntr:%s\nproc:%s\nsMsg:%s\n lMsg:%s\n threads:%d", objArr);
                            if (!this.f.b()) {
                                x.e("crash report sync remote fail, will not upload to Bugly , print local for helpful!", new Object[0]);
                                com.tencent.bugly.crashreport.crash.b.a("ANR", z.a(), aVar.f8635a, null, aVar.e, null);
                            } else if (this.f.c().j) {
                                x.a("found visiable anr , start to upload!", new Object[0]);
                                CrashDetailBean a3 = a(aVar);
                                if (a3 == null) {
                                    x.e("pack anr fail!", new Object[0]);
                                } else {
                                    c.a().a(a3);
                                    if (a3.f8619a >= 0) {
                                        x.a("backup anr record success!", new Object[0]);
                                    } else {
                                        x.d("backup anr record fail!", new Object[0]);
                                    }
                                    if (str != null && new File(str).exists()) {
                                        this.f8639a.set(3);
                                        if (a(str, aVar.f8638d, aVar.f8635a)) {
                                            x.a("backup trace success", new Object[0]);
                                        }
                                    }
                                    com.tencent.bugly.crashreport.crash.b.a("ANR", z.a(), aVar.f8635a, null, aVar.e, a3);
                                    if (!this.h.a(a3)) {
                                        this.h.a(a3, 3000L, true);
                                    }
                                    this.h.b(a3);
                                }
                            } else {
                                x.d("ANR Report is closed!", new Object[0]);
                            }
                            return;
                        }
                    }
                    x.d("can't get all thread skip this anr", new Object[0]);
                } catch (Throwable th2) {
                    x.a(th2);
                    x.e("get all thread stack fail!", new Object[0]);
                }
            }
        }
    }

    private synchronized void c() {
        if (e()) {
            x.d("start when started!", new Object[0]);
            return;
        }
        this.i = new FileObserver("/data/anr/", 8) { // from class: com.tencent.bugly.crashreport.crash.anr.b.1
            @Override // android.os.FileObserver
            public final void onEvent(int i, String str) {
                if (str == null) {
                    return;
                }
                String str2 = "/data/anr/" + str;
                if (!str2.contains("trace")) {
                    x.d("not anr file %s", str2);
                } else {
                    b.this.a(str2);
                }
            }
        };
        try {
            this.i.startWatching();
            x.a("start anr monitor!", new Object[0]);
            this.e.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.anr.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b();
                }
            });
        } catch (Throwable th) {
            this.i = null;
            x.d("start anr monitor failed!", new Object[0]);
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private synchronized void d() {
        if (!e()) {
            x.d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.i.stopWatching();
            this.i = null;
            x.d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            x.d("stop anr monitor failed!", new Object[0]);
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private synchronized boolean e() {
        return this.i != null;
    }

    private synchronized void b(boolean z) {
        if (z) {
            c();
        } else {
            d();
        }
    }

    private synchronized boolean f() {
        return this.j;
    }

    private synchronized void c(boolean z) {
        if (this.j != z) {
            x.a("user change anr %b", Boolean.valueOf(z));
            this.j = z;
        }
    }

    public final void a(boolean z) {
        c(z);
        boolean f = f();
        com.tencent.bugly.crashreport.common.strategy.a a2 = com.tencent.bugly.crashreport.common.strategy.a.a();
        if (a2 != null) {
            f = f && a2.c().g;
        }
        if (f != e()) {
            x.a("anr changed to %b", Boolean.valueOf(f));
            b(f);
        }
    }

    protected final void b() {
        File[] listFiles;
        long b2 = z.b() - c.g;
        File file = new File(this.g);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        int length = "bugly_trace_".length();
        int i = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (name.startsWith("bugly_trace_")) {
                try {
                    int indexOf = name.indexOf(".txt");
                    if (indexOf > 0 && Long.parseLong(name.substring(length, indexOf)) >= b2) {
                    }
                } catch (Throwable unused) {
                    x.e("tomb format error delete %s", name);
                }
                if (file2.delete()) {
                    i++;
                }
            }
        }
        x.c("clean tombs %d", Integer.valueOf(i));
    }

    public final synchronized void a(StrategyBean strategyBean) {
        if (strategyBean == null) {
            return;
        }
        if (strategyBean.j != e()) {
            x.d("server anr changed to %b", Boolean.valueOf(strategyBean.j));
        }
        boolean z = strategyBean.j && f();
        if (z != e()) {
            x.a("anr changed to %b", Boolean.valueOf(z));
            b(z);
        }
    }
}
