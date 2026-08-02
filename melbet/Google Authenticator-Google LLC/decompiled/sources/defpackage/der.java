package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class der implements den {
    static final Long b;
    static final String c;
    public final ReentrantReadWriteLock.ReadLock d;
    public volatile byte e;
    public final ConcurrentMap f;
    public final ConcurrentMap g;
    public final ConcurrentMap h;
    public Object i;
    private final ReentrantReadWriteLock k;
    private final ReentrantReadWriteLock.WriteLock l;
    private final ConcurrentMap m;
    private final ConcurrentMap n;
    private boolean o;
    private final String[] p;
    private static final String[] j = new String[0];
    public static final Boolean a = new Boolean(false);

    static {
        new Float(Float.NaN);
        new Integer(-1);
        b = new Long(-1L);
        c = new String("");
    }

    public der() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.k = reentrantReadWriteLock;
        this.d = reentrantReadWriteLock.readLock();
        this.l = reentrantReadWriteLock.writeLock();
        this.e = (byte) 0;
        this.m = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap(5);
        this.g = new ConcurrentHashMap(5);
        this.h = new ConcurrentHashMap(5);
        this.n = new ConcurrentHashMap(5);
        this.i = null;
        this.o = false;
        this.p = j;
    }

    private final void f() {
        ReentrantReadWriteLock.WriteLock writeLock = this.l;
        writeLock.lock();
        try {
            if (this.e == 2) {
                writeLock.unlock();
                return;
            }
            this.m.clear();
            this.f.clear();
            this.g.clear();
            this.h.clear();
            this.n.clear();
            this.i = new Object();
            this.o = false;
            this.e = (byte) 2;
        } finally {
            this.l.unlock();
        }
    }

    private static String g(String str) {
        if (str == c) {
            return null;
        }
        return str;
    }

    @Override // defpackage.den
    public final String a(ContentResolver contentResolver, String str) {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str2;
        e(contentResolver);
        c(contentResolver);
        ReentrantReadWriteLock.ReadLock readLock = this.d;
        readLock.lock();
        try {
            Object obj = this.i;
            String str3 = (String) this.m.get(str);
            if (str3 != null) {
                String g = g(str3);
                readLock.unlock();
                return g;
            }
            this.d.unlock();
            try {
                uri = dem.a;
                acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (deq unused) {
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new deq("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (query == null) {
                        throw new deq("ContentProvider query returned null cursor");
                    }
                    if (query.moveToFirst()) {
                        str2 = query.getString(1);
                        query.close();
                        acquireUnstableContentProviderClient.release();
                    } else {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        str2 = null;
                    }
                    if (str2 != null && str2.equals(null)) {
                        str2 = null;
                    }
                    this.d.lock();
                    try {
                        if (obj == this.i) {
                            this.m.put(str, str2 == null ? c : str2);
                        }
                        if (str2 != null) {
                            return str2;
                        }
                        return null;
                    } finally {
                    }
                } finally {
                }
            } catch (RemoteException e) {
                throw new deq(e);
            }
        } finally {
        }
    }

    public final Object b(Map map, String str, Object obj, Object obj2) {
        Object obj3 = map.get(str);
        return obj3 == obj2 ? obj : obj3;
    }

    public final void c(ContentResolver contentResolver) {
        byte b2 = this.e;
        if (b2 != 0) {
            if (b2 != 1) {
                return;
            }
            f();
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.l;
        writeLock.lock();
        try {
            byte b3 = this.e;
            if (b3 == 1) {
                f();
                writeLock.unlock();
            } else {
                if (b3 == 2) {
                    writeLock.unlock();
                    return;
                }
                this.i = new Object();
                this.e = (byte) 2;
                contentResolver.registerContentObserver(dem.a, true, new dep(this));
            }
        } finally {
            this.l.unlock();
        }
    }

    public final void d(Object obj, Map map, String str, Object obj2, Object obj3) {
        this.l.lock();
        try {
            if (obj == this.i) {
                if (obj2 == null) {
                    obj2 = obj3;
                }
                map.put(str, obj2);
                this.m.remove(str);
            }
        } finally {
            this.l.unlock();
        }
    }

    public final void e(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }
}
