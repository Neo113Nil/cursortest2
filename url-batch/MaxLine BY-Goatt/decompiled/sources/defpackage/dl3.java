package defpackage;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dl3 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {SDKConstants.PARAM_KEY, "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public volatile Map g;
    public r83 d = null;
    public volatile boolean e = true;
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();

    public dl3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
    }

    public static dl3 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        dl3 dl3Var = (dl3) i.computeIfAbsent(uri, new Function() { // from class: cl3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new dl3(contentResolver, uri, runnable);
            }
        });
        try {
            if (!dl3Var.e) {
                return dl3Var;
            }
            synchronized (dl3Var) {
                try {
                    if (dl3Var.e) {
                        r83 r83Var = new r83(dl3Var);
                        dl3Var.a.registerContentObserver(dl3Var.b, false, r83Var);
                        dl3Var.d = r83Var;
                        dl3Var.e = false;
                    }
                } finally {
                }
            }
            return dl3Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            dl3 dl3Var = (dl3) it.next();
            synchronized (dl3Var) {
                try {
                    if (dl3Var.e) {
                        dl3Var.e = false;
                    } else {
                        r83 r83Var = dl3Var.d;
                        if (r83Var != null) {
                            dl3Var.a.unregisterContentObserver(r83Var);
                            dl3Var.d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b() {
        Map map;
        Map map2;
        Object j2;
        Map map3 = this.g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f) {
                ?? r0 = this.g;
                map2 = r0;
                if (r0 == 0) {
                    try {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                ot2 ot2Var = new ot2(20, this);
                                try {
                                    j2 = ot2Var.j();
                                } catch (SecurityException unused) {
                                    long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        j2 = ot2Var.j();
                                    } finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                                map = (Map) j2;
                            } catch (SecurityException e) {
                                e = e;
                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                this.g = map;
                                map2 = map;
                                map4 = map2;
                                if (map4 == null) {
                                }
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.g = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        } catch (IllegalStateException e3) {
                            e = e3;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.g = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        this.g = map;
                        map2 = map;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(r0);
                        throw th;
                    }
                }
            }
            map4 = map2;
        }
        return map4 == null ? map4 : Collections.EMPTY_MAP;
    }
}
