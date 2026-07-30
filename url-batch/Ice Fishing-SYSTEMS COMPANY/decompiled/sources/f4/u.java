package f4;

import B2.N;
import D.RunnableC0281a;
import a.AbstractC0415a;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.C2561Fo;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class u {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f37783j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f37784a;

    /* renamed from: b, reason: collision with root package name */
    public final C2561Fo f37785b;

    /* renamed from: c, reason: collision with root package name */
    public final C4903n f37786c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f37787d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f37789f;

    /* renamed from: h, reason: collision with root package name */
    public final s f37791h;

    /* renamed from: e, reason: collision with root package name */
    public final s.b f37788e = new s.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f37790g = false;

    public u(FirebaseMessaging firebaseMessaging, C2561Fo c2561Fo, s sVar, C4903n c4903n, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f37787d = firebaseMessaging;
        this.f37785b = c2561Fo;
        this.f37791h = sVar;
        this.f37786c = c4903n;
        this.f37784a = context;
        this.f37789f = scheduledThreadPoolExecutor;
    }

    public static void a(h3.n nVar) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AbstractC0415a.f(nVar, 30L);
        } catch (InterruptedException | TimeoutException e6) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e6);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e9);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a9 = this.f37787d.a();
        C4903n c4903n = this.f37786c;
        c4903n.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(c4903n.f(c4903n.n(a9, bundle, "/topics/" + str)));
    }

    public final void c(String str) {
        String a9 = this.f37787d.a();
        C4903n c4903n = this.f37786c;
        c4903n.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString(com.anythink.expressad.f.a.b.az, "1");
        a(c4903n.f(c4903n.n(a9, bundle, "/topics/" + str)));
    }

    public final synchronized void d(boolean z8) {
        this.f37790g = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:65:0x0076, B:67:0x0081, B:68:0x0094, B:70:0x009f, B:71:0x0039, B:74:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        r a9;
        char c4;
        s sVar;
        while (true) {
            synchronized (this) {
                try {
                    a9 = this.f37791h.a();
                    if (a9 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a9.f37773b;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c4 = 1;
                        String str2 = a9.f37772a;
                        if (c4 != 0) {
                            b(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (c4 == 1) {
                            c(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a9 + com.anythink.core.common.d.j.f12535z);
                        }
                        sVar = this.f37791h;
                        synchronized (sVar) {
                            N n9 = sVar.f37776a;
                            String str3 = a9.f37774c;
                            synchronized (((ArrayDeque) n9.f199x)) {
                                if (((ArrayDeque) n9.f199x).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) n9.f200y).execute(new RunnableC0281a(24, n9));
                                }
                            }
                        }
                        synchronized (this.f37788e) {
                            try {
                                String str4 = a9.f37774c;
                                if (this.f37788e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f37788e.getOrDefault(str4, null);
                                    h3.h hVar = (h3.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.b(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f37788e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c4 = 65535;
                    String str22 = a9.f37772a;
                    if (c4 != 0) {
                    }
                    sVar = this.f37791h;
                    synchronized (sVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        c4 = 0;
                        String str222 = a9.f37772a;
                        if (c4 != 0) {
                        }
                        sVar = this.f37791h;
                        synchronized (sVar) {
                        }
                    }
                    c4 = 65535;
                    String str2222 = a9.f37772a;
                    if (c4 != 0) {
                    }
                    sVar = this.f37791h;
                    synchronized (sVar) {
                    }
                }
            } catch (IOException e6) {
                if ("SERVICE_NOT_AVAILABLE".equals(e6.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e6.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e6.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e6.getMessage() != null) {
                        throw e6;
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

    public final void f(long j9) {
        long min = Math.min(Math.max(30L, 2 * j9), i);
        this.f37789f.schedule(new w(this, this.f37784a, this.f37785b, min), j9, TimeUnit.SECONDS);
        d(true);
    }
}
