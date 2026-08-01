package com.trembin.nirefon.betfury.data;

import android.content.Context;
import defpackage.di;
import defpackage.fa0;
import defpackage.ma0;
import defpackage.mf0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class NoteDatabase extends ma0 {
    public static final Companion Companion = new Companion(null);
    private static volatile NoteDatabase INSTANCE;

    public abstract NoteDao noteDao();

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static final class Companion {
        public /* synthetic */ Companion(di diVar) {
            this();
        }

        public final NoteDatabase getDatabase(Context context) {
            NoteDatabase noteDatabase;
            context.getClass();
            NoteDatabase noteDatabase2 = NoteDatabase.INSTANCE;
            if (noteDatabase2 != null) {
                return noteDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                if (mf0.y("win_notes.db")) {
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
                ma0 a = new fa0(applicationContext).a();
                NoteDatabase.INSTANCE = (NoteDatabase) a;
                noteDatabase = (NoteDatabase) a;
            }
            return noteDatabase;
        }

        private Companion() {
        }
    }
}
