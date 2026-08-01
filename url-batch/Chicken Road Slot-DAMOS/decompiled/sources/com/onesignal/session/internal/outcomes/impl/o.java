package com.onesignal.session.internal.outcomes.impl;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {
    public final void upgradeCacheOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM cached_unique_outcome_notification;");
            sQLiteDatabase.execSQL("UPDATE cached_unique_outcome SET channel_type = '" + oc.c.NOTIFICATION + "';");
            sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
            sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
            sQLiteDatabase.execSQL("DROP TABLE outcome;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
            sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision2To3(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome(_id,name,timestamp,notification_ids,weight,notification_influence_type) SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux;");
            sQLiteDatabase.execSQL("DROP TABLE outcome_aux;");
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision3To4(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome ADD COLUMN session_time INTEGER DEFAULT 1;");
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }
}
