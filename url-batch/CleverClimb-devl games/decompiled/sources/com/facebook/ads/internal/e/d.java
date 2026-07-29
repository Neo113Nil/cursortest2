package com.facebook.ads.internal.e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.e.f;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5087a = "SELECT tokens." + h.f5105a.f5081b + ", tokens." + h.f5106b.f5081b + ", events." + c.f5083a.f5081b + ", events." + c.f5085c.f5081b + ", events." + c.f5086d.f5081b + ", events." + c.e.f5081b + ", events." + c.f.f5081b + ", events." + c.g.f5081b + ", events." + c.h.f5081b + ", events." + c.i.f5081b + " FROM events JOIN tokens ON events." + c.f5084b.f5081b + " = tokens." + h.f5105a.f5081b + " ORDER BY events." + c.e.f5081b + " ASC";

    /* renamed from: b, reason: collision with root package name */
    private static final int f5088b = Runtime.getRuntime().availableProcessors();

    /* renamed from: c, reason: collision with root package name */
    private static final int f5089c = Math.max(2, Math.min(f5088b - 1, 4));

    /* renamed from: d, reason: collision with root package name */
    private static final int f5090d = (f5088b * 2) + 1;
    private static final ThreadFactory e = new ThreadFactory() { // from class: com.facebook.ads.internal.e.d.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f5091a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "DatabaseTask #" + this.f5091a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> f = new LinkedBlockingQueue(128);
    private static final Executor g;
    private static final ReentrantReadWriteLock h;
    private static final Lock i;
    private static final Lock j;
    private final Context k;
    private final h l = new h(this);
    private final c m = new c(this);
    private SQLiteOpenHelper n;

    private static class a<T> extends AsyncTask<Void, Void, T> {

        /* renamed from: a, reason: collision with root package name */
        private final f<T> f5096a;

        /* renamed from: b, reason: collision with root package name */
        private final com.facebook.ads.internal.e.a<T> f5097b;

        /* renamed from: c, reason: collision with root package name */
        private f.a f5098c;

        a(f<T> fVar, com.facebook.ads.internal.e.a<T> aVar) {
            this.f5096a = fVar;
            this.f5097b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T doInBackground(Void... voidArr) {
            T t;
            try {
                t = this.f5096a.b();
            } catch (SQLiteException unused) {
                t = null;
            }
            try {
                this.f5098c = this.f5096a.c();
            } catch (SQLiteException unused2) {
                this.f5098c = f.a.UNKNOWN;
                return t;
            }
            return t;
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(T t) {
            if (this.f5098c == null) {
                this.f5097b.a(t);
            } else {
                this.f5097b.a(this.f5098c.a(), this.f5098c.b());
            }
            this.f5097b.a();
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f5089c, f5090d, 30L, TimeUnit.SECONDS, f, e);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        g = threadPoolExecutor;
        h = new ReentrantReadWriteLock();
        i = h.readLock();
        j = h.writeLock();
    }

    public d(Context context) {
        this.k = context;
    }

    private synchronized SQLiteDatabase i() {
        if (this.n == null) {
            this.n = new e(this.k, this);
        }
        return this.n.getWritableDatabase();
    }

    public Cursor a(int i2) {
        i.lock();
        try {
            return a().rawQuery(f5087a + " LIMIT " + String.valueOf(i2), null);
        } finally {
            i.unlock();
        }
    }

    public SQLiteDatabase a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return i();
        }
        throw new IllegalStateException("Cannot call getDatabase from the UI thread!");
    }

    public <T> AsyncTask a(f<T> fVar, com.facebook.ads.internal.e.a<T> aVar) {
        return com.facebook.ads.internal.q.a.d.a(g, new a(fVar, aVar), new Void[0]);
    }

    public AsyncTask a(final String str, final int i2, final String str2, final double d2, final double d3, final String str3, final Map<String, String> map, com.facebook.ads.internal.e.a<String> aVar) {
        return a(new i<String>() { // from class: com.facebook.ads.internal.e.d.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.locks.Lock] */
            /* JADX WARN: Type inference failed for: r0v4 */
            @Override // com.facebook.ads.internal.e.f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public String b() {
                Throwable th;
                SQLiteDatabase sQLiteDatabase;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                SQLiteDatabase sQLiteDatabase2 = d.j;
                sQLiteDatabase2.lock();
                try {
                    try {
                        sQLiteDatabase = d.this.a();
                        try {
                            sQLiteDatabase.beginTransaction();
                            String a2 = d.this.m.a(d.this.l.a(str), i2, str2, d2, d3, str3, map);
                            sQLiteDatabase.setTransactionSuccessful();
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Exception e2) {
                                    com.facebook.ads.internal.q.d.a.a(e2, d.this.k);
                                }
                            }
                            d.j.unlock();
                            return a2;
                        } catch (Exception e3) {
                            e = e3;
                            a(f.a.DATABASE_INSERT);
                            com.facebook.ads.internal.q.d.a.a(e, d.this.k);
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Exception e4) {
                                    com.facebook.ads.internal.q.d.a.a(e4, d.this.k);
                                }
                            }
                            d.j.unlock();
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteDatabase2 != 0) {
                            try {
                                if (sQLiteDatabase2.inTransaction()) {
                                    sQLiteDatabase2.endTransaction();
                                }
                            } catch (Exception e5) {
                                com.facebook.ads.internal.q.d.a.a(e5, d.this.k);
                            }
                        }
                        d.j.unlock();
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    sQLiteDatabase = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase2 = 0;
                    if (sQLiteDatabase2 != 0) {
                    }
                    d.j.unlock();
                    throw th;
                }
            }
        }, aVar);
    }

    public boolean a(String str) {
        j.lock();
        boolean z = true;
        try {
            a().execSQL("UPDATE events SET " + c.i.f5081b + "=" + c.i.f5081b + "+1 WHERE " + c.f5083a.f5081b + "=?", new String[]{str});
        } catch (SQLiteException unused) {
            z = false;
        }
        j.unlock();
        return z;
    }

    public synchronized void b() {
        for (g gVar : c()) {
            gVar.e();
        }
        if (this.n != null) {
            this.n.close();
            this.n = null;
        }
    }

    public boolean b(String str) {
        j.lock();
        try {
            return this.m.a(str);
        } finally {
            j.unlock();
        }
    }

    public g[] c() {
        return new g[]{this.l, this.m};
    }

    public Cursor d() {
        i.lock();
        try {
            return this.m.c();
        } finally {
            i.unlock();
        }
    }

    public Cursor e() {
        i.lock();
        try {
            return this.m.d();
        } finally {
            i.unlock();
        }
    }

    public Cursor f() {
        i.lock();
        try {
            return this.l.c();
        } finally {
            i.unlock();
        }
    }

    public void g() {
        j.lock();
        try {
            this.l.d();
        } finally {
            j.unlock();
        }
    }
}
