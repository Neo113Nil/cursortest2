package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class R6 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f7359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f7360b;

    public R6(S6 s6, C0608e5 c0608e5) {
        this.f7360b = s6;
        this.f7359a = c0608e5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f7360b.getClass();
                Integer asInteger = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f7360b.f7429j.iterator();
            while (it2.hasNext()) {
                ((X8) it2.next()).a(arrayList2);
            }
            ((C0944r5) this.f7359a.f8100p).e();
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
                        if (S6.a(this.f7360b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f7360b.f7424e) {
                arrayList = new ArrayList(this.f7360b.f7425f);
                this.f7360b.f7425f.clear();
            }
            S6 s6 = this.f7360b;
            s6.getClass();
            if (!arrayList.isEmpty()) {
                s6.f7421b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = s6.f7422c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                s6.f7428i.incrementAndGet();
                                s6.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            s6.f7428i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            s6.f7421b.unlock();
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
                s6.f7421b.unlock();
            }
            a(arrayList);
        }
    }
}
