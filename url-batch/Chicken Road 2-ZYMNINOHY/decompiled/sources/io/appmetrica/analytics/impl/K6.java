package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K6 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f10519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L6 f10520b;

    public K6(L6 l6, X4 x4) {
        this.f10520b = l6;
        this.f10519a = x4;
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
                this.f10520b.getClass();
                Integer asInteger = ((ContentValues) obj).getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            ArrayList arrayList3 = this.f10520b.f10575j;
            int size2 = arrayList3.size();
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ((S8) obj2).a(arrayList2);
            }
            ((C0734k5) this.f10519a.f11235p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i4;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (L6.a(this.f10520b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f10520b.f10570e) {
                arrayList = new ArrayList(this.f10520b.f10571f);
                this.f10520b.f10571f.clear();
            }
            L6 l6 = this.f10520b;
            l6.getClass();
            if (!arrayList.isEmpty()) {
                long j4 = ((C0746kh) l6.f10573h.f11232k.a()).v;
                l6.f10567b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = l6.f10568c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            int size = arrayList.size();
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj = arrayList.get(i6);
                                i6++;
                                ContentValues contentValues = (ContentValues) obj;
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                l6.f10574i.incrementAndGet();
                                l6.a(contentValues, "Event saved to db");
                            }
                            if (l6.f10574i.get() > j4) {
                                i4 = l6.a(writableDatabase);
                                l6.f10574i.addAndGet(-i4);
                            } else {
                                i4 = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (i4 != 0) {
                                ArrayList arrayList2 = l6.f10575j;
                                int size2 = arrayList2.size();
                                while (i5 < size2) {
                                    Object obj2 = arrayList2.get(i5);
                                    i5++;
                                    ((S8) obj2).a();
                                }
                            }
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            l6.f10567b.unlock();
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
                l6.f10567b.unlock();
            }
            a(arrayList);
        }
    }
}
