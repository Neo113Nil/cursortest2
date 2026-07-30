package com.onesignal.session.internal.outcomes.impl;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {
    public final void upgradeCacheOutcomeTableRevision1To2(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            db.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM cached_unique_outcome_notification;");
            db.execSQL("UPDATE cached_unique_outcome SET channel_type = '" + J3.c.NOTIFICATION + "';");
            db.execSQL("DROP TABLE cached_unique_outcome_notification;");
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision1To2(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
            db.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
            db.execSQL("DROP TABLE outcome;");
            db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            db.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
            db.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision2To3(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
            db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            db.execSQL("INSERT INTO outcome(_id,name,timestamp,notification_ids,weight,notification_influence_type) SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux;");
            db.execSQL("DROP TABLE outcome_aux;");
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision3To4(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("BEGIN TRANSACTION;");
            db.execSQL("ALTER TABLE outcome ADD COLUMN session_time INTEGER DEFAULT 1;");
        } catch (SQLiteException e7) {
            e7.printStackTrace();
        } finally {
            db.execSQL("COMMIT;");
        }
    }
}
