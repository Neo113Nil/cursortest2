package com.clutchquizarena.app.db;

import android.content.Context;
import androidx.room.r;
import androidx.room.t;
import g1.d;
import g1.f;

/* loaded from: classes.dex */
public abstract class AppDatabase extends t {
    public static final Companion Companion = new Companion(null);
    private static volatile AppDatabase instance;

    public static final class Companion {
        public /* synthetic */ Companion(d dVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x004c, LOOP:0: B:8:0x001f->B:17:0x004e, LOOP_END, TryCatch #0 {all -> 0x004c, blocks: (B:5:0x000c, B:7:0x0012, B:10:0x0023, B:12:0x002d, B:19:0x0039, B:17:0x004e, B:22:0x0051, B:23:0x0058), top: B:4:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AppDatabase getInstance(Context context) {
            boolean z2;
            f.e(context, "context");
            AppDatabase appDatabase = AppDatabase.instance;
            if (appDatabase == null) {
                synchronized (this) {
                    try {
                        appDatabase = AppDatabase.instance;
                        if (appDatabase == null) {
                            Context applicationContext = context.getApplicationContext();
                            f.d(applicationContext, "getApplicationContext(...)");
                            for (int i = 0; i < 14; i++) {
                                char charAt = "clutch_quiz.db".charAt(i);
                                if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                    z2 = false;
                                    if (z2) {
                                        t a2 = new r(applicationContext).a();
                                        AppDatabase.instance = (AppDatabase) a2;
                                        appDatabase = (AppDatabase) a2;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                }
                            }
                            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
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

    public abstract GameSessionDao gameSessionDao();
}
