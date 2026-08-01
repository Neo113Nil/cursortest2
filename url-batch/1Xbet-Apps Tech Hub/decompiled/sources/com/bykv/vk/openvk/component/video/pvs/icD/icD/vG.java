package com.bykv.vk.openvk.component.video.pvs.icD.icD;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.so.Mxy;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoProxyDB.java */
/* loaded from: classes.dex */
public class vG {
    private static volatile vG icD;
    private final Executor Jd;
    private volatile SQLiteStatement NB;
    private final SparseArray<Map<String, pvs>> pvs;
    private final Jd vG;

    private vG(Context context) {
        SparseArray<Map<String, pvs>> sparseArray = new SparseArray<>(2);
        this.pvs = sparseArray;
        this.Jd = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Mxy(5, "video_proxy_db"));
        this.vG = new Jd(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    public static vG pvs(Context context) {
        if (icD == null) {
            synchronized (vG.class) {
                if (icD == null) {
                    icD = new vG(context);
                }
            }
        }
        return icD;
    }

    public pvs pvs(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, pvs> map = this.pvs.get(i);
        pvs pvsVar = map == null ? null : map.get(str);
        if (pvsVar != null) {
            return pvsVar;
        }
        try {
            Cursor query = this.vG.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, null, null, null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    pvsVar = new pvs(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (pvsVar != null && map != null) {
                map.put(str, pvsVar);
            }
            return pvsVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void pvs(final pvs pvsVar) {
        if (pvsVar != null) {
            Map<String, pvs> map = this.pvs.get(pvsVar.Jd);
            if (map != null) {
                map.put(pvsVar.pvs, pvsVar);
            }
            this.Jd.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.icD.vG.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (vG.this.NB != null) {
                            vG.this.NB.clearBindings();
                        } else {
                            vG vGVar = vG.this;
                            vGVar.NB = vGVar.vG.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        }
                        vG.this.NB.bindString(1, pvsVar.pvs);
                        vG.this.NB.bindString(2, pvsVar.icD);
                        vG.this.NB.bindLong(3, pvsVar.vG);
                        vG.this.NB.bindLong(4, pvsVar.Jd);
                        vG.this.NB.bindString(5, pvsVar.NB);
                        vG.this.NB.executeInsert();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void pvs(Collection<String> collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        Map<String, pvs> map = this.pvs.get(i);
        int i2 = -1;
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i2++;
            strArr[i2] = str;
        }
        strArr[i2 + 1] = String.valueOf(i);
        try {
            this.vG.getWritableDatabase().delete("video_http_header_t", "key IN(" + icD(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }

    private String icD(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public void pvs(final int i) {
        Map<String, pvs> map = this.pvs.get(i);
        if (map != null) {
            map.clear();
        }
        this.Jd.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.icD.vG.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    vG.this.vG.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
