package f2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r.C1392b;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: i, reason: collision with root package name */
    public static final long f5546i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f5547j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5548a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5549b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.e f5550c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f5551d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5553f;

    /* renamed from: h, reason: collision with root package name */
    public final y f5555h;

    /* renamed from: e, reason: collision with root package name */
    public final C1392b f5552e = new C1392b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f5554g = false;

    public A(FirebaseMessaging firebaseMessaging, o oVar, y yVar, M0.e eVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f5551d = firebaseMessaging;
        this.f5549b = oVar;
        this.f5555h = yVar;
        this.f5550c = eVar;
        this.f5548a = context;
        this.f5553f = scheduledThreadPoolExecutor;
    }

    public static void a(I1.o oVar) {
        try {
            B0.f.a(oVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e6);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e7) {
            e = e7;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) {
        String a6 = this.f5551d.a();
        M0.e eVar = this.f5550c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(eVar.f(eVar.q(a6, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a6 = this.f5551d.a();
        M0.e eVar = this.f5550c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(eVar.f(eVar.q(a6, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.f5554g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:65:0x0076, B:67:0x0081, B:68:0x0094, B:70:0x009f, B:71:0x0039, B:74:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        x a6;
        char c2;
        y yVar;
        while (true) {
            synchronized (this) {
                try {
                    a6 = this.f5555h.a();
                    if (a6 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a6.f5651b;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c2 = 1;
                        String str2 = a6.f5650a;
                        if (c2 != 0) {
                            b(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (c2 == 1) {
                            c(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a6 + ".");
                        }
                        yVar = this.f5555h;
                        synchronized (yVar) {
                            B.d dVar = yVar.f5654a;
                            String str3 = a6.f5652c;
                            synchronized (((ArrayDeque) dVar.f109e)) {
                                if (((ArrayDeque) dVar.f109e).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) dVar.f110f).execute(new B2.b(11, dVar));
                                }
                            }
                        }
                        synchronized (this.f5552e) {
                            try {
                                String str4 = a6.f5652c;
                                if (this.f5552e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f5552e.getOrDefault(str4, null);
                                    I1.h hVar = (I1.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.b(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f5552e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c2 = 65535;
                    String str22 = a6.f5650a;
                    if (c2 != 0) {
                    }
                    yVar = this.f5555h;
                    synchronized (yVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        c2 = 0;
                        String str222 = a6.f5650a;
                        if (c2 != 0) {
                        }
                        yVar = this.f5555h;
                        synchronized (yVar) {
                        }
                    }
                    c2 = 65535;
                    String str2222 = a6.f5650a;
                    if (c2 != 0) {
                    }
                    yVar = this.f5555h;
                    synchronized (yVar) {
                    }
                }
            } catch (IOException e3) {
                if ("SERVICE_NOT_AVAILABLE".equals(e3.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e3.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e3.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e3.getMessage() != null) {
                        throw e3;
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

    public final void f(long j2) {
        long min = Math.min(Math.max(30L, 2 * j2), f5546i);
        this.f5553f.schedule(new C(this, this.f5548a, this.f5549b, min), j2, TimeUnit.SECONDS);
        d(true);
    }
}
