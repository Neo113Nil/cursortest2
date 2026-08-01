package com.winpower.neonfit.data;

import android.content.Context;
import androidx.room.u;
import androidx.room.w;
import j1.e;
import j1.h;

/* loaded from: classes.dex */
public abstract class AppDatabase extends w {
    public static final Companion Companion = new Companion(null);
    private static volatile AppDatabase instance;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final AppDatabase getInstance(Context context) {
            h.e(context, "context");
            AppDatabase appDatabase = AppDatabase.instance;
            if (appDatabase == null) {
                synchronized (this) {
                    try {
                        appDatabase = AppDatabase.instance;
                        if (appDatabase == null) {
                            Context applicationContext = context.getApplicationContext();
                            h.d(applicationContext, "getApplicationContext(...)");
                            if (q1.e.B0("neonfit.db")) {
                                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            }
                            w a2 = new u(applicationContext).a();
                            AppDatabase.instance = (AppDatabase) a2;
                            appDatabase = (AppDatabase) a2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return appDatabase;
        }

        private Companion() {
        }
    }

    public abstract FoodDao foodDao();
}
