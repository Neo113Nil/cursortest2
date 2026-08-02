package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djl {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;
    private static boolean d = false;

    private djl() {
    }

    public static Context a(Context context) {
        boolean isDeviceProtectedStorage;
        Context createDeviceProtectedStorageContext;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        if (isDeviceProtectedStorage) {
            return context;
        }
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext;
    }

    public static hvi b(final Context context, htq htqVar, Executor executor) {
        if (i(context)) {
            return hnu.aN(htqVar, executor);
        }
        final hvw hvwVar = new hvw();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final djk djkVar = new djk(atomicBoolean, context, hvwVar, htqVar, executor);
        context.registerReceiver(djkVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!i(context) || !atomicBoolean.compareAndSet(false, true)) {
            hvwVar.c(new Runnable() { // from class: djj
                @Override // java.lang.Runnable
                public final void run() {
                    int i = djl.a;
                    if (hvw.this.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                        djl.f(context, djkVar);
                    }
                }
            }, huf.a);
            return hvwVar;
        }
        f(context, djkVar);
        hvwVar.q(hnu.aN(htqVar, executor));
        return hvwVar;
    }

    public static hvi c(Context context, Callable callable, Executor executor) {
        return b(context, new cbc(callable, 3), executor);
    }

    public static hvi d(Context context, Runnable runnable) {
        return c(context, Executors.callable(runnable, null), huf.a);
    }

    public static hvi e(Context context, Runnable runnable, Executor executor) {
        return c(context, Executors.callable(runnable, null), executor);
    }

    public static void f(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static synchronized void g() {
        synchronized (djl.class) {
            d = true;
        }
    }

    public static boolean h(Context context) {
        return !j(context);
    }

    public static boolean i(Context context) {
        return j(context);
    }

    private static boolean j(Context context) {
        boolean k;
        boolean z;
        if (c) {
            return true;
        }
        synchronized (djl.class) {
            if (c) {
                return true;
            }
            if (d) {
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, DirectBootHelperService.class.getName()), 268435968);
                k = false;
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            k = true;
                            break;
                        }
                        z = it.next().serviceInfo.directBootAware;
                        if (z) {
                            Log.w("DirectBootUtils", "Falling back to user manager.");
                            d = false;
                            k = k(context);
                            break;
                        }
                    }
                }
            } else {
                k = k(context);
            }
            if (k) {
                c = true;
            }
            return k;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r2.isUserRunning(android.os.Process.myUserHandle()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean k(Context context) {
        boolean isUserUnlocked;
        boolean z = true;
        int i = 1;
        while (true) {
            if (i > 2) {
                break;
            }
            UserManager userManager = b;
            if (userManager == null) {
                userManager = (UserManager) context.getSystemService(UserManager.class);
                b = userManager;
            }
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                b = null;
                i++;
            }
        }
        if (z) {
            b = null;
        }
        return z;
    }
}
