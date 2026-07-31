package com.startapp.sdk.internal;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f extends Thread implements Handler.Callback, Printer {

    /* renamed from: a, reason: collision with root package name */
    public d f232a;
    public e b;
    public final c c;
    public r3 d;
    public final Handler e;
    public final AtomicLong f;
    public final long g;
    public final AtomicReference h;
    public final boolean i;

    public f(long j, boolean z) {
        super("startapp-anr");
        this.f232a = new a();
        this.b = new b();
        this.c = new c();
        this.e = new Handler(Looper.getMainLooper(), this);
        this.f = new AtomicLong(0L);
        this.h = new AtomicReference("");
        this.g = j;
        this.i = z;
    }

    public final void a() {
        long j = this.g;
        boolean z = false;
        boolean z2 = true;
        while (!isInterrupted()) {
            if (this.f.getAndAdd(j) == 0) {
                if (z && !a((String) this.h.get())) {
                    this.f232a.remove();
                    z = false;
                }
                this.e.sendEmptyMessage(101);
                z2 = true;
            }
            try {
                synchronized (this) {
                    wait(j);
                }
                long j2 = this.f.get();
                String str = (String) this.h.get();
                if (j2 > 0 && !z && (z2 || a(str))) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        z = true;
                    } else {
                        j = this.b.a(j2);
                        if (j > 0) {
                            z2 = false;
                        } else {
                            z = this.f232a.a(str, j2);
                            j = this.g;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.c.getClass();
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f.set(0L);
        return true;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.h.set("");
            this.f.set(0L);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f232a.a();
        this.f232a.remove();
        if (this.i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z = (this.i && TextUtils.isEmpty(str)) ? false : true;
        r3 r3Var = this.d;
        return z && (r3Var == null || !zh.c(r3Var.f399a.f345a));
    }
}
