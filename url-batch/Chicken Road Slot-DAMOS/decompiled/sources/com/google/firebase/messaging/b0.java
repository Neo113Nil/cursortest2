package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.se;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3109a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.m f3110b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.n f3111c;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3113e;
    public final z g;

    /* renamed from: d, reason: collision with root package name */
    public final s.e f3112d = new s.e(0);

    /* renamed from: f, reason: collision with root package name */
    public boolean f3114f = false;

    public b0(b1.m mVar, z zVar, a1.n nVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f3110b = mVar;
        this.g = zVar;
        this.f3111c = nVar;
        this.f3109a = context;
        this.f3113e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z10) {
        this.f3114f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0 A[Catch: IOException -> 0x008a, TRY_LEAVE, TryCatch #0 {IOException -> 0x008a, blocks: (B:8:0x002d, B:13:0x00d8, B:15:0x00e0, B:61:0x003f, B:63:0x0047, B:65:0x0077, B:66:0x008d, B:68:0x0095, B:70:0x00c5), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        y a9;
        z zVar;
        while (true) {
            synchronized (this) {
                try {
                    a9 = this.g.a();
                    if (a9 == null) {
                        break;
                    }
                } finally {
                }
            }
            a1.n nVar = this.f3111c;
            try {
                String str = a9.f3188b;
                String str2 = a9.f3187a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        x8.c cVar = (x8.c) ((x8.d) nVar.f41i);
                        String str3 = ((x8.a) a1.n.j(cVar.d())).f10541a;
                        ((FirebaseMessaging) nVar.f42r).a();
                        nVar.A(str2, str3, (String) a1.n.j(cVar.c()), "unsubscribe");
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        zVar = this.g;
                        synchronized (zVar) {
                            se seVar = zVar.f3191a;
                            String str4 = a9.f3189c;
                            synchronized (((ArrayDeque) seVar.f2801r)) {
                                if (((ArrayDeque) seVar.f2801r).remove(str4)) {
                                    ((ScheduledThreadPoolExecutor) seVar.f2802s).execute(new androidx.lifecycle.d0(3, seVar));
                                }
                            }
                        }
                        synchronized (this.f3112d) {
                            try {
                                String str5 = a9.f3189c;
                                if (this.f3112d.containsKey(str5)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f3112d.get(str5);
                                    w7.g gVar = (w7.g) arrayDeque.poll();
                                    if (gVar != null) {
                                        gVar.a(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f3112d.remove(str5);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a9 + ".");
                    }
                    zVar = this.g;
                    synchronized (zVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        x8.c cVar2 = (x8.c) ((x8.d) nVar.f41i);
                        String str6 = ((x8.a) a1.n.j(cVar2.d())).f10541a;
                        ((FirebaseMessaging) nVar.f42r).a();
                        nVar.A(str2, str6, (String) a1.n.j(cVar2.c()), "subscribe");
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        zVar = this.g;
                        synchronized (zVar) {
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    zVar = this.g;
                    synchronized (zVar) {
                    }
                }
            } catch (IOException e2) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                    if (e2.getMessage() != null) {
                        throw e2;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e2.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void c(long j) {
        this.f3113e.schedule(new d0(this, this.f3109a, this.f3110b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        a(true);
    }
}
