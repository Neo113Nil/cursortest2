package com.baidu.mshield.x6.f.m;

import com.baidu.mshield.x6.EngineImpl;
import com.baidu.mshield.x6.f.f;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static c f8578a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f8579b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public static long f8580c = 120;

    /* renamed from: d, reason: collision with root package name */
    public ThreadPoolExecutor f8581d;

    public class a implements FileFilter {
        public a(c cVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public c() {
        int a8 = (a() / 2) + 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(a8 > 5 ? 5 : a8, f8579b, f8580c, TimeUnit.SECONDS, new PriorityBlockingQueue());
        this.f8581d = threadPoolExecutor;
        threadPoolExecutor.setThreadFactory(new b());
    }

    public static c b() {
        synchronized (c.class) {
            try {
                if (f8578a == null) {
                    f8578a = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8578a;
    }

    public void a(d dVar) {
        try {
            if (EngineImpl.isUnload) {
                return;
            }
            this.f8581d.execute(dVar);
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public void c() {
        try {
            this.f8581d.shutdownNow();
            f8578a = null;
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new a(this)).length;
        } catch (Throwable th) {
            f.b(th);
            return 2;
        }
    }
}
