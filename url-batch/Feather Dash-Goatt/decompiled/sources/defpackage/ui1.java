package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ui1 {
    public final Context a;
    public final pl0 b;
    public final jb c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final si1 h;
    public final s9 e = new s9(0);
    public boolean g = false;

    public ui1(FirebaseMessaging firebaseMessaging, pl0 pl0Var, si1 si1Var, jb jbVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = pl0Var;
        this.h = si1Var;
        this.c = jbVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            t80.d(task, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        jb jbVar = this.c;
        a(jbVar.h(jbVar.j(a, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        jb jbVar = this.c;
        a(jbVar.h(jbVar.j(a, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:8:0x002b, B:13:0x008b, B:15:0x0093, B:61:0x003c, B:63:0x0044, B:65:0x004f, B:66:0x0065, B:68:0x006d, B:70:0x0078), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ri1 a;
        si1 si1Var;
        while (true) {
            synchronized (this) {
                try {
                    a = this.h.a();
                    if (a == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        si1Var = this.h;
                        synchronized (si1Var) {
                            mc mcVar = si1Var.a;
                            String str3 = a.c;
                            synchronized (((ArrayDeque) mcVar.h)) {
                                if (((ArrayDeque) mcVar.h).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) mcVar.i).execute(new e4(9, mcVar));
                                }
                            }
                        }
                        synchronized (this.e) {
                            try {
                                String str4 = a.c;
                                if (this.e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                                    ng1 ng1Var = (ng1) arrayDeque.poll();
                                    if (ng1Var != null) {
                                        ng1Var.a(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a + ".");
                    }
                    si1Var = this.h;
                    synchronized (si1Var) {
                    }
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        si1Var = this.h;
                        synchronized (si1Var) {
                        }
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    si1Var = this.h;
                    synchronized (si1Var) {
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j) {
        this.f.schedule(new wi1(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
