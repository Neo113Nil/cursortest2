package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a42 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i7) {
        int i8;
        Cursor d7 = d(sQLiteDatabase, i7);
        if (d7.getCount() > 0) {
            d7.moveToNext();
            i8 = d7.getInt(d7.getColumnIndexOrThrow("value"));
        } else {
            i8 = 0;
        }
        d7.close();
        return i8;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, int i7) {
        long j7;
        Cursor d7 = d(sQLiteDatabase, 2);
        if (d7.getCount() > 0) {
            d7.moveToNext();
            j7 = d7.getLong(d7.getColumnIndexOrThrow("value"));
        } else {
            j7 = 0;
        }
        d7.close();
        return j7;
    }

    public static ArrayList<kt> c(SQLiteDatabase sQLiteDatabase) {
        ArrayList<kt> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(kt.O(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (mq3 e7) {
                io0.d("Unable to deserialize proto from offline signals database:");
                io0.d(e7.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    private static Cursor d(SQLiteDatabase sQLiteDatabase, int i7) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i7 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i7 != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
