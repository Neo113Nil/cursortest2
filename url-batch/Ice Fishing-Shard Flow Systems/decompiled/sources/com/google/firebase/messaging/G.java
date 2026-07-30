package com.google.firebase.messaging;

import I.C0108d;
import android.content.Context;
import android.util.Log;
import f2.C0394a;
import f2.C0396c;
import f2.InterfaceC0397d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u.C0934e;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: h, reason: collision with root package name */
    public static final long f4448h = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f4449i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4450a;

    /* renamed from: b, reason: collision with root package name */
    public final C0108d f4451b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.j f4452c;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4454e;

    /* renamed from: g, reason: collision with root package name */
    public final E f4456g;

    /* renamed from: d, reason: collision with root package name */
    public final C0934e f4453d = new C0934e(0);

    /* renamed from: f, reason: collision with root package name */
    public boolean f4455f = false;

    public G(C0108d c0108d, E e7, D0.j jVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f4451b = c0108d;
        this.f4456g = e7;
        this.f4452c = jVar;
        this.f4450a = context;
        this.f4454e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z7) {
        this.f4455f = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc A[Catch: IOException -> 0x0049, TryCatch #0 {IOException -> 0x0049, blocks: (B:8:0x002e, B:16:0x005b, B:18:0x0063, B:64:0x0079, B:66:0x00a9, B:67:0x00bc, B:69:0x00ec, B:70:0x003f, B:73:0x004c), top: B:7:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        D a7;
        char c7;
        E e7;
        while (true) {
            synchronized (this) {
                try {
                    a7 = this.f4456g.a();
                    if (a7 == null) {
                        break;
                    }
                } finally {
                }
            }
            D0.j jVar = this.f4452c;
            try {
                String str = a7.f4424b;
                String str2 = a7.f4423a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c7 = 1;
                        if (c7 != 0) {
                            C0396c c0396c = (C0396c) ((InterfaceC0397d) jVar.f330e);
                            String str3 = ((C0394a) D0.j.y(c0396c.d())).f4773a;
                            ((FirebaseMessaging) jVar.f332l).a();
                            jVar.U(str2, str3, (String) D0.j.y(c0396c.c()), "subscribe");
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (c7 == 1) {
                            C0396c c0396c2 = (C0396c) ((InterfaceC0397d) jVar.f330e);
                            String str4 = ((C0394a) D0.j.y(c0396c2.d())).f4773a;
                            ((FirebaseMessaging) jVar.f332l).a();
                            jVar.U(str2, str4, (String) D0.j.y(c0396c2.c()), "unsubscribe");
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a7 + ".");
                        }
                        e7 = this.f4456g;
                        synchronized (e7) {
                            D6.y yVar = e7.f4427a;
                            String str5 = a7.f4425c;
                            synchronized (((ArrayDeque) yVar.f636l)) {
                                if (((ArrayDeque) yVar.f636l).remove(str5)) {
                                    ((ScheduledThreadPoolExecutor) yVar.f637m).execute(new A.k(7, yVar));
                                }
                            }
                        }
                        synchronized (this.f4453d) {
                            try {
                                String str6 = a7.f4425c;
                                if (this.f4453d.containsKey(str6)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f4453d.get(str6);
                                    K1.h hVar = (K1.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.b(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f4453d.remove(str6);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c7 = 65535;
                    if (c7 != 0) {
                    }
                    e7 = this.f4456g;
                    synchronized (e7) {
                    }
                } else {
                    if (str.equals("S")) {
                        c7 = 0;
                        if (c7 != 0) {
                        }
                        e7 = this.f4456g;
                        synchronized (e7) {
                        }
                    }
                    c7 = 65535;
                    if (c7 != 0) {
                    }
                    e7 = this.f4456g;
                    synchronized (e7) {
                    }
                }
            } catch (IOException e8) {
                if ("SERVICE_NOT_AVAILABLE".equals(e8.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e8.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e8.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e8.getMessage() != null) {
                        throw e8;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void c(long j) {
        this.f4454e.schedule(new I(this, this.f4450a, this.f4451b, Math.min(Math.max(30L, 2 * j), f4448h)), j, TimeUnit.SECONDS);
        a(true);
    }
}
