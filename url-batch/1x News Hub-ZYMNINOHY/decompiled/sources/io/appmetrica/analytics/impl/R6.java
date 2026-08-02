package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class R6 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f6540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f6541b;

    public R6(S6 s6, C0457e5 c0457e5) {
        this.f6541b = s6;
        this.f6540a = c0457e5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f6541b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f6541b.f6606j.iterator();
            while (it2.hasNext()) {
                ((X8) it2.next()).a(arrayList2);
            }
            ((C0793r5) this.f6540a.f7238p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (S6.a(this.f6541b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f6541b.f6602e) {
                arrayList = new ArrayList(this.f6541b.f);
                this.f6541b.f.clear();
            }
            S6 s6 = this.f6541b;
            s6.getClass();
            if (!arrayList.isEmpty()) {
                s6.f6599b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = s6.f6600c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                s6.f6605i.incrementAndGet();
                                s6.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            s6.f6605i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            s6.f6599b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                s6.f6599b.unlock();
            }
            a(arrayList);
        }
    }
}
