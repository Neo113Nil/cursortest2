package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2618f7 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f38955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2645g7 f38956b;

    public C2618f7(C2645g7 c2645g7, C2953s5 c2953s5) {
        this.f38956b = c2645g7;
        this.f38955a = c2953s5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                this.f38956b.getClass();
                Integer asInteger = ((ContentValues) obj).getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            ArrayList arrayList3 = this.f38956b.f39051j;
            int size2 = arrayList3.size();
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ((InterfaceC2776l9) obj2).a(arrayList2);
            }
            ((F5) this.f38955a.f39780p).e();
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
                        if (C2645g7.a(this.f38956b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f38956b.f39046e) {
                arrayList = new ArrayList(this.f38956b.f39047f);
                this.f38956b.f39047f.clear();
            }
            C2645g7 c2645g7 = this.f38956b;
            c2645g7.getClass();
            if (!arrayList.isEmpty()) {
                c2645g7.f39043b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = c2645g7.f39044c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                ContentValues contentValues = (ContentValues) obj;
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                c2645g7.f39050i.incrementAndGet();
                                c2645g7.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            c2645g7.f39050i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            c2645g7.f39043b.unlock();
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
                c2645g7.f39043b.unlock();
            }
            a(arrayList);
        }
    }
}
