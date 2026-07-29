package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UMDBManager.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: b, reason: collision with root package name */
    private static SQLiteOpenHelper f8901b;

    /* renamed from: d, reason: collision with root package name */
    private static Context f8902d;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f8903a;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f8904c;

    private e() {
        this.f8903a = new AtomicInteger();
    }

    /* compiled from: UMDBManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f8905a = new e();

        private a() {
        }
    }

    public static e a(Context context) {
        if (f8902d == null && context != null) {
            f8902d = context.getApplicationContext();
            f8901b = d.a(f8902d);
        }
        return a.f8905a;
    }

    public synchronized SQLiteDatabase a() {
        if (this.f8903a.incrementAndGet() == 1) {
            this.f8904c = f8901b.getWritableDatabase();
        }
        return this.f8904c;
    }

    public synchronized void b() {
        try {
            if (this.f8903a.decrementAndGet() == 0) {
                this.f8904c.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
