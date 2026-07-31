package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final r8 f213a;
    public final v7 b;
    public final ThreadPoolExecutor c;
    public final t3 d;
    public final pa e;
    public final h9 f;
    public final u3 g;
    public final HashMap h = new HashMap();
    public final AtomicLong i = new AtomicLong();
    public final u8 j = new u8(this);
    public final v8 k = new v8(this);
    public final w8 l = new w8(this);
    public final x8 m = new x8(this);
    public final c9 n = new c9(this);

    public d9(r8 r8Var, v7 v7Var, ThreadPoolExecutor threadPoolExecutor, t3 t3Var, pa paVar, h9 h9Var, u3 u3Var) {
        this.f213a = r8Var;
        this.b = v7Var;
        this.c = threadPoolExecutor;
        this.d = t3Var;
        this.e = paVar;
        this.f = h9Var;
        this.g = u3Var;
    }

    public final void a() {
        if (this.i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            r8 r8Var = this.f213a;
            w8 w8Var = this.l;
            synchronized (r8Var) {
                r8Var.c.add(w8Var);
            }
            ((w5) this.e.a()).a(this.j);
            ((w5) this.e.a()).a();
            v7 v7Var = this.b;
            v7Var.f464a.post(new b9(this));
        }
    }

    public final void b(n8 n8Var) {
        q8 a2 = a(n8Var.f348a);
        long uptimeMillis = (this.i.get() + a2.f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            a(uptimeMillis);
            return;
        }
        r8 r8Var = this.f213a;
        long currentTimeMillis = System.currentTimeMillis();
        r8Var.getClass();
        long j = n8Var.b;
        r8.a(j, currentTimeMillis);
        SQLiteDatabase a3 = r8Var.a();
        a3.beginTransaction();
        try {
            int a4 = r8.a(a3, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a4 + 1));
            a3.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            a3.setTransactionSuccessful();
            a3.endTransaction();
            x8 x8Var = this.m;
            Runnable runnable = (Runnable) this.f.a(n8Var, a2, x8Var);
            if (runnable != null) {
                this.c.execute(runnable);
            } else if (x8Var != null) {
                x8Var.a(n8Var, 0);
            }
        } catch (Throwable th) {
            a3.endTransaction();
            throw th;
        }
    }

    public final q8 a(o8 o8Var) {
        q8 q8Var;
        Map b;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.h) {
            Pair pair = (Pair) this.h.get(o8Var.f361a);
            q8Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (q8) pair.first;
        }
        if (q8Var != null) {
            return q8Var;
        }
        this.g.getClass();
        AnalyticsConfig g = MetaData.A().g();
        if (g != null && (b = g.b()) != null && (analyticsCategoryConfig = (AnalyticsCategoryConfig) b.get(o8Var.f361a)) != null) {
            q8Var = new q8(o8Var.b, analyticsCategoryConfig);
        }
        if (q8Var == null) {
            q8Var = o8Var.b;
        }
        synchronized (this.h) {
            this.h.put(o8Var.f361a, new Pair(q8Var, Long.valueOf(SystemClock.uptimeMillis() + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
        }
        return q8Var;
    }

    public final void a(n8 n8Var) {
        this.g.getClass();
        AnalyticsConfig g = MetaData.A().g();
        if (g == null || g.l()) {
            return;
        }
        q8 a2 = a(n8Var.f348a);
        if (((Random) zh.d.a()).nextDouble() >= a2.f388a) {
            return;
        }
        if (a2.d) {
            v7 v7Var = this.b;
            v7Var.f464a.post(new z8(this, n8Var, a2));
        } else if (((w5) this.e.a()).b()) {
            long uptimeMillis = (this.i.get() + a2.f) - SystemClock.uptimeMillis();
            if (uptimeMillis > 0) {
                v7 v7Var2 = this.b;
                v7Var2.f464a.postDelayed(new a9(this, n8Var, a2), uptimeMillis);
            } else {
                Runnable runnable = (Runnable) this.f.a(n8Var, a2, null);
                if (runnable != null) {
                    this.c.execute(runnable);
                }
            }
        }
    }

    public final void b() {
        this.b.f464a.removeCallbacks(this.k);
        if (!((w5) this.e.a()).b()) {
            this.g.getClass();
            AnalyticsConfig g = MetaData.A().g();
            long j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
            if (g != null) {
                j = Math.max(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, zh.e(g.g()));
            }
            a(j);
            return;
        }
        int max = Math.max(1, ((Integer) this.d.call()).intValue());
        this.g.getClass();
        AnalyticsConfig g2 = MetaData.A().g();
        try {
            this.f213a.a(this.n, g2 != null ? Math.max(1, g2.h()) : 1, max);
        } catch (Throwable unused) {
        }
    }

    public final void a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.b.f464a.postDelayed(this.k, j);
    }

    public final void a(n8 n8Var, int i, long j) {
        if (i == 1) {
            r8 r8Var = this.f213a;
            r8Var.getClass();
            long j2 = n8Var.b;
            r8.a(j2, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j));
            r8Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            a(0L);
            return;
        }
        this.g.getClass();
        AnalyticsConfig g = MetaData.A().g();
        int max = g != null ? Math.max(1, g.h()) : 1;
        r8 r8Var2 = this.f213a;
        r8Var2.getClass();
        long j3 = n8Var.b;
        r8.a(j3, j);
        SQLiteDatabase a2 = r8Var2.a();
        a2.beginTransaction();
        try {
            if (r8.a(a2, j3) >= max) {
                a2.delete("events", "rowid = ?", new String[]{String.valueOf(j3)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j));
                a2.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
            }
            a2.setTransactionSuccessful();
            a2.endTransaction();
            this.g.getClass();
            AnalyticsConfig g2 = MetaData.A().g();
            a(g2 != null ? Math.max(1000L, g2.i()) : 1000L);
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
    }
}
