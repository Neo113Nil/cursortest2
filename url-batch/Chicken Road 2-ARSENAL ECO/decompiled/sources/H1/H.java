package H1;

import a.AbstractC0219a;
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
import q.C0582b;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: i, reason: collision with root package name */
    public static final long f900i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f901j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f902a;

    /* renamed from: b, reason: collision with root package name */
    public final v f903b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.h f904c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f905d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f907f;

    /* renamed from: h, reason: collision with root package name */
    public final F f909h;

    /* renamed from: e, reason: collision with root package name */
    public final C0582b f906e = new C0582b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f908g = false;

    public H(FirebaseMessaging firebaseMessaging, v vVar, F f7, D0.h hVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f905d = firebaseMessaging;
        this.f903b = vVar;
        this.f909h = f7;
        this.f904c = hVar;
        this.f902a = context;
        this.f907f = scheduledThreadPoolExecutor;
    }

    public static void a(k1.n nVar) {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AbstractC0219a.d(nVar, 30L);
        } catch (InterruptedException | TimeoutException e4) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e4);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a7 = this.f905d.a();
        D0.h hVar = this.f904c;
        hVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(hVar.e(hVar.n(a7, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a7 = this.f905d.a();
        D0.h hVar = this.f904c;
        hVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(hVar.e(hVar.n(a7, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z5) {
        this.f908g = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0094 A[Catch: IOException -> 0x0047, TryCatch #0 {IOException -> 0x0047, blocks: (B:8:0x002c, B:16:0x0059, B:18:0x0061, B:64:0x0076, B:66:0x0081, B:67:0x0094, B:69:0x009f, B:70:0x003d, B:73:0x004a), top: B:7:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        E a7;
        char c7;
        F f7;
        while (true) {
            synchronized (this) {
                try {
                    a7 = this.f909h.a();
                    if (a7 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a7.f891b;
                String str2 = a7.f890a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c7 = 1;
                        if (c7 != 0) {
                            b(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                            }
                        } else if (c7 == 1) {
                            c(str2);
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                            }
                        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + a7 + ".");
                        }
                        f7 = this.f909h;
                        synchronized (f7) {
                            A.e eVar = f7.f894a;
                            String str3 = a7.f892c;
                            synchronized (((ArrayDeque) eVar.f10j)) {
                                if (((ArrayDeque) eVar.f10j).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) eVar.f11k).execute(new RunnableC0139m(1, eVar));
                                }
                            }
                        }
                        synchronized (this.f906e) {
                            try {
                                String str4 = a7.f892c;
                                if (this.f906e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.f906e.getOrDefault(str4, null);
                                    k1.h hVar = (k1.h) arrayDeque.poll();
                                    if (hVar != null) {
                                        hVar.a(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.f906e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c7 = 65535;
                    if (c7 != 0) {
                    }
                    f7 = this.f909h;
                    synchronized (f7) {
                    }
                } else {
                    if (str.equals("S")) {
                        c7 = 0;
                        if (c7 != 0) {
                        }
                        f7 = this.f909h;
                        synchronized (f7) {
                        }
                    }
                    c7 = 65535;
                    if (c7 != 0) {
                    }
                    f7 = this.f909h;
                    synchronized (f7) {
                    }
                }
            } catch (IOException e4) {
                if ("SERVICE_NOT_AVAILABLE".equals(e4.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e4.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e4.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e4.getMessage() != null) {
                        throw e4;
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

    public final void f(long j4) {
        this.f907f.schedule(new J(this, this.f902a, this.f903b, Math.min(Math.max(30L, 2 * j4), f900i)), j4, TimeUnit.SECONDS);
        d(true);
    }
}
