package com.bykv.vk.openvk.preload.geckox.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AbandonChannelSQLiteHelper.java */
/* loaded from: classes.dex */
public class b extends SQLiteOpenHelper {
    private static volatile b a;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static b a(Context context) {
        String c;
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    Context applicationContext = context.getApplicationContext();
                    StringBuilder sb = new StringBuilder("geckox_clean_statistic");
                    if (!TextUtils.isEmpty(com.bykv.vk.openvk.preload.geckox.utils.a.a)) {
                        c = com.bykv.vk.openvk.preload.geckox.utils.a.a;
                    } else {
                        String a2 = com.bykv.vk.openvk.preload.geckox.utils.a.a();
                        com.bykv.vk.openvk.preload.geckox.utils.a.a = a2;
                        if (!TextUtils.isEmpty(a2)) {
                            c = com.bykv.vk.openvk.preload.geckox.utils.a.a;
                        } else {
                            String b = com.bykv.vk.openvk.preload.geckox.utils.a.b();
                            com.bykv.vk.openvk.preload.geckox.utils.a.a = b;
                            if (!TextUtils.isEmpty(b)) {
                                c = com.bykv.vk.openvk.preload.geckox.utils.a.a;
                            } else {
                                c = com.bykv.vk.openvk.preload.geckox.utils.a.c(context);
                                com.bykv.vk.openvk.preload.geckox.utils.a.a = c;
                            }
                        }
                    }
                    a = new b(applicationContext, sb.append(c).append(".db").toString());
                }
            }
        }
        return a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    final void a(String str, String str2, int i, int i2, long j, int i3, String str3, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i));
        contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(i2));
        contentValues.put("pkg_id", Long.valueOf(j));
        contentValues.put("err_code", Integer.valueOf(i3));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j2));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e) {
            GeckoLogger.w("clean-channel", "insert failed", e);
        }
    }

    public final List<StatisticModel.PackageStatisticModel> a() {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
        } catch (Exception e) {
            e = e;
        }
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndex("access_key"));
                String string2 = cursor.getString(cursor.getColumnIndex("channel"));
                int i = cursor.getInt(cursor.getColumnIndex("clean_type"));
                int i2 = cursor.getInt(cursor.getColumnIndex(NotificationCompat.CATEGORY_STATUS));
                long j = cursor.getInt(cursor.getColumnIndex("pkg_id"));
                int i3 = cursor.getInt(cursor.getColumnIndex("err_code"));
                String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                int i4 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                long j2 = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                packageStatisticModel.accessKey = string;
                packageStatisticModel.channel = string2;
                packageStatisticModel.statsType = Integer.valueOf(i2);
                packageStatisticModel.id = Long.valueOf(j);
                packageStatisticModel.errCode = i3 == 0 ? null : String.valueOf(i3);
                packageStatisticModel.errMsg = string3;
                packageStatisticModel.cleanType = Integer.valueOf(i);
                packageStatisticModel.cleanDuration = Long.valueOf(j2);
                packageStatisticModel.cleanStrategy = Integer.valueOf(i4);
                arrayList.add(packageStatisticModel);
            } catch (Exception e2) {
                e = e2;
                cursor2 = cursor;
                GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                cursor = cursor2;
                CloseableUtils.close(cursor);
                return arrayList;
            }
        }
        getWritableDatabase().delete("geckox_clean_statistic", null, null);
        CloseableUtils.close(cursor);
        return arrayList;
    }
}
