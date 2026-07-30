package com.baidu.ar;

import android.content.Context;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class c8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f1892a;

    /* renamed from: b, reason: collision with root package name */
    public int f1893b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1894c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1895d;

    /* renamed from: e, reason: collision with root package name */
    public d8[] f1896e;

    public c8(Context context, Object obj, d8[] d8VarArr) {
        d8VarArr.getClass();
        this.f1892a = new WeakReference<>(context);
        this.f1893b = 0;
        this.f1894c = false;
        this.f1895d = obj;
        this.f1896e = d8VarArr;
    }

    public void b() {
        this.f1894c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x000b A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i8;
        int i9;
        if (this.f1896e.length == 0) {
            return;
        }
        Process.setThreadPriority(19);
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            d8[] d8VarArr = this.f1896e;
            int length = d8VarArr.length;
            d8 d8Var = null;
            List<List<t3>> list = null;
            int i10 = 0;
            boolean z7 = false;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                d8 d8Var2 = d8VarArr[i10];
                List<List<t3>> a8 = d8Var2.a();
                if (d8Var2.b()) {
                    z7 = true;
                }
                if (a8 != null && a8.size() > 0) {
                    d8Var = d8Var2;
                    list = a8;
                    break;
                } else {
                    i10++;
                    list = a8;
                }
            }
            if (list == null || list.size() <= 0 || d8Var == null) {
                if (this.f1894c) {
                    break;
                }
                if (z7) {
                    Thread.currentThread();
                    Thread.sleep(10L);
                } else {
                    synchronized (this.f1895d) {
                        try {
                            this.f1895d.wait();
                        } catch (InterruptedException e8) {
                            e8.printStackTrace();
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            } else {
                Context context = this.f1892a.get();
                if (context == null) {
                    break;
                }
                try {
                    i9 = 0;
                    for (List<t3> list2 : list) {
                        try {
                            d8Var.a(context, list2);
                            i9 += list2.size();
                        } catch (Exception e9) {
                            e = e9;
                            this.f1893b++;
                            e.printStackTrace(System.out);
                            if (i9 > 0) {
                            }
                            if (this.f1893b > 0) {
                            }
                        }
                    }
                    this.f1893b = 0;
                } catch (Exception e10) {
                    e = e10;
                    i9 = 0;
                }
                if (i9 > 0) {
                    d8Var.a(i9);
                }
                if (this.f1893b > 0) {
                    continue;
                } else {
                    if (this.f1894c) {
                        break;
                    }
                    try {
                        int i11 = this.f1893b;
                        int i12 = i11 * 2000;
                        if (i11 >= 7) {
                            i12 = 60000;
                        }
                        Thread.currentThread();
                        Thread.sleep(i12);
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        for (d8 d8Var3 : this.f1896e) {
            d8Var3.c();
        }
    }
}
