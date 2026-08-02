package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public final h9 f7603a;

    /* renamed from: b, reason: collision with root package name */
    public final k8 f7604b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f7605c;

    /* renamed from: d, reason: collision with root package name */
    public final b4 f7606d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f7607e;

    /* renamed from: f, reason: collision with root package name */
    public final x9 f7608f;

    /* renamed from: g, reason: collision with root package name */
    public final c4 f7609g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7610h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f7611i = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public final k9 f7612j = new k9(this);

    /* renamed from: k, reason: collision with root package name */
    public final l9 f7613k = new l9(this);

    /* renamed from: l, reason: collision with root package name */
    public final m9 f7614l = new m9(this);

    /* renamed from: m, reason: collision with root package name */
    public final n9 f7615m = new n9(this);
    public final s9 n = new s9(this);

    public t9(h9 h9Var, k8 k8Var, ThreadPoolExecutor threadPoolExecutor, b4 b4Var, ib ibVar, x9 x9Var, c4 c4Var) {
        this.f7603a = h9Var;
        this.f7604b = k8Var;
        this.f7605c = threadPoolExecutor;
        this.f7606d = b4Var;
        this.f7607e = ibVar;
        this.f7608f = x9Var;
        this.f7609g = c4Var;
    }

    public final void a() {
        if (this.f7611i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            h9 h9Var = this.f7603a;
            m9 m9Var = this.f7614l;
            synchronized (h9Var) {
                h9Var.f7056c.add(m9Var);
            }
            ((f6) this.f7607e.a()).a(this.f7612j);
            ((f6) this.f7607e.a()).a();
            k8 k8Var = this.f7604b;
            k8Var.f7181a.post(new r9(this));
        }
    }

    public final void b(d9 d9Var) {
        g9 a3 = a(d9Var.f6789a);
        long uptimeMillis = (this.f7611i.get() + a3.f6983f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            a(uptimeMillis);
            return;
        }
        h9 h9Var = this.f7603a;
        long currentTimeMillis = System.currentTimeMillis();
        h9Var.getClass();
        long j4 = d9Var.f6790b;
        h9.a(j4, currentTimeMillis);
        SQLiteDatabase a4 = h9Var.a();
        a4.beginTransaction();
        try {
            int a5 = h9.a(a4, j4);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a5 + 1));
            a4.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j4)});
            a4.setTransactionSuccessful();
            a4.endTransaction();
            n9 n9Var = this.f7615m;
            Runnable runnable = (Runnable) this.f7608f.a(d9Var, a3, n9Var);
            if (runnable != null) {
                this.f7605c.execute(runnable);
            } else if (n9Var != null) {
                n9Var.a(d9Var, 0);
            }
        } catch (Throwable th) {
            a4.endTransaction();
            throw th;
        }
    }

    public final g9 a(e9 e9Var) {
        g9 g9Var;
        Map b4;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f7610h) {
            try {
                Pair pair = (Pair) this.f7610h.get(e9Var.f6849a);
                g9Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (g9) pair.first;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g9Var != null) {
            return g9Var;
        }
        this.f7609g.getClass();
        AnalyticsConfig h2 = MetaData.E().h();
        if (h2 != null && (b4 = h2.b()) != null && (analyticsCategoryConfig = (AnalyticsCategoryConfig) b4.get(e9Var.f6849a)) != null) {
            g9Var = new g9(e9Var.f6850b, analyticsCategoryConfig);
        }
        if (g9Var == null) {
            g9Var = e9Var.f6850b;
        }
        synchronized (this.f7610h) {
            this.f7610h.put(e9Var.f6849a, new Pair(g9Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return g9Var;
    }

    public final void b() {
        this.f7604b.f7181a.removeCallbacks(this.f7613k);
        if (!((f6) this.f7607e.a()).b()) {
            this.f7609g.getClass();
            AnalyticsConfig h2 = MetaData.E().h();
            a(h2 != null ? Math.max(300000L, si.f(h2.f())) : 300000L);
        } else {
            int max = Math.max(1, ((Integer) this.f7606d.a()).intValue());
            this.f7609g.getClass();
            AnalyticsConfig h4 = MetaData.E().h();
            try {
                this.f7603a.a(this.n, h4 != null ? Math.max(1, h4.g()) : 1, max);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(d9 d9Var) {
        this.f7609g.getClass();
        AnalyticsConfig h2 = MetaData.E().h();
        if (h2 == null || h2.k()) {
            return;
        }
        g9 a3 = a(d9Var.f6789a);
        if (((Random) si.f7578d.a()).nextDouble() >= a3.f6978a) {
            return;
        }
        if (a3.f6981d) {
            k8 k8Var = this.f7604b;
            k8Var.f7181a.post(new p9(this, d9Var, a3));
        } else if (((f6) this.f7607e.a()).b()) {
            long uptimeMillis = (this.f7611i.get() + a3.f6983f) - SystemClock.uptimeMillis();
            if (uptimeMillis > 0) {
                k8 k8Var2 = this.f7604b;
                k8Var2.f7181a.postDelayed(new q9(this, d9Var, a3), uptimeMillis);
            } else {
                Runnable runnable = (Runnable) this.f7608f.a(d9Var, a3, null);
                if (runnable != null) {
                    this.f7605c.execute(runnable);
                }
            }
        }
    }

    public final void a(long j4) {
        if (j4 < 0) {
            j4 = 0;
        }
        this.f7604b.f7181a.postDelayed(this.f7613k, j4);
    }

    public final void a(d9 d9Var, int i4, long j4) {
        if (i4 == 1) {
            h9 h9Var = this.f7603a;
            h9Var.getClass();
            long j5 = d9Var.f6790b;
            h9.a(j5, j4);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j4));
            h9Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j5)});
            a(0L);
            return;
        }
        this.f7609g.getClass();
        AnalyticsConfig h2 = MetaData.E().h();
        int max = h2 != null ? Math.max(1, h2.g()) : 1;
        h9 h9Var2 = this.f7603a;
        h9Var2.getClass();
        long j6 = d9Var.f6790b;
        h9.a(j6, j4);
        SQLiteDatabase a3 = h9Var2.a();
        a3.beginTransaction();
        try {
            if (h9.a(a3, j6) >= max) {
                a3.delete("events", "rowid = ?", new String[]{String.valueOf(j6)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j4));
                a3.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j6)});
            }
            a3.setTransactionSuccessful();
            a3.endTransaction();
            this.f7609g.getClass();
            AnalyticsConfig h4 = MetaData.E().h();
            a(h4 != null ? Math.max(1000L, h4.h()) : 1000L);
        } catch (Throwable th) {
            a3.endTransaction();
            throw th;
        }
    }
}
