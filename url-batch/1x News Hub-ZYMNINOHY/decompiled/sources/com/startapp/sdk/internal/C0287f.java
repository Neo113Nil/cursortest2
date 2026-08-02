package com.startapp.sdk.internal;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287f extends Thread implements Handler.Callback, Printer {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0285d f3766a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0286e f3767b;

    /* renamed from: c, reason: collision with root package name */
    public final C0284c f3768c;

    /* renamed from: d, reason: collision with root package name */
    public x3 f3769d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3770e;
    public final AtomicLong f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3771g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f3772h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3773i;

    public C0287f(long j3, boolean z) {
        super("startapp-anr");
        this.f3766a = new C0282a();
        this.f3767b = new C0283b();
        this.f3768c = new C0284c();
        this.f3770e = new Handler(Looper.getMainLooper(), this);
        this.f = new AtomicLong(0L);
        this.f3772h = new AtomicReference("");
        this.f3771g = j3;
        this.f3773i = z;
    }

    public final void a() {
        long j3 = this.f3771g;
        boolean z = false;
        boolean z2 = true;
        while (!isInterrupted()) {
            if (this.f.getAndAdd(j3) == 0) {
                if (z && !a((String) this.f3772h.get())) {
                    this.f3766a.remove();
                    z = false;
                }
                this.f3770e.sendEmptyMessage(101);
                z2 = true;
            }
            try {
                synchronized (this) {
                    wait(j3);
                }
                long j4 = this.f.get();
                String str = (String) this.f3772h.get();
                if (j4 > 0 && !z && (z2 || a(str))) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        z = true;
                    } else {
                        j3 = this.f3767b.a(j4);
                        if (j3 > 0) {
                            z2 = false;
                        } else {
                            z = this.f3766a.a(str, j4);
                            j3 = this.f3771g;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f3768c.getClass();
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
            this.f3772h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f3772h.set("");
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
        this.f3766a.a();
        this.f3766a.remove();
        if (this.f3773i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z = (this.f3773i && TextUtils.isEmpty(str)) ? false : true;
        x3 x3Var = this.f3769d;
        return z && (x3Var == null || !si.c(x3Var.f4712a.f4505a));
    }
}
