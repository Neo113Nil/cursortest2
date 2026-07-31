package com.bytedance.sdk.openadsdk.kgc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.zg.zmn.hhw;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class zmn {
    private static Context fb;
    private fs hhw;
    private com.bytedance.sdk.openadsdk.kgc.zn.zmn nps;
    private Boolean zg;
    public static final long zmn = com.bytedance.sdk.openadsdk.kgc.fb.zmn.zmn();
    private static final String[] fs = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
    private static final long zn = System.currentTimeMillis();
    private final ArrayList<fb> btk = new ArrayList<>();
    private final Runnable bvs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgc.zmn.1
        @Override // java.lang.Runnable
        public void run() {
            if (!zmn.this.fb() || zmn.this.btk.isEmpty()) {
                return;
            }
            zmn zmnVar = zmn.this;
            zmnVar.zmn(zmnVar.btk);
            zmn.this.btk.clear();
        }
    };
    private int iv = 0;
    private final Runnable rc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgc.zmn.4
        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            try {
                SQLiteDatabase fs2 = com.bytedance.sdk.openadsdk.kgc.zmn.zmn.fs();
                if (fs2 != null) {
                    String[] strArr = {String.valueOf(zmn.this.hhw.getOnceLogInterval() < 86400000 ? zmn.zn : zmn.zmn)};
                    int max = Math.max(10, zmn.this.hhw.getOnceLogCount());
                    int i6 = max > 100 ? 10 : max;
                    Cursor query = fs2.query("monitor_table", zmn.fs, "timestamp < ?", strArr, null, null, null, String.valueOf(i6));
                    if (query != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex = query.getColumnIndex("_id");
                        int columnIndex2 = query.getColumnIndex("sdk_version");
                        int columnIndex3 = query.getColumnIndex("scene");
                        int columnIndex4 = query.getColumnIndex("start_count");
                        int columnIndex5 = query.getColumnIndex("success_count");
                        int columnIndex6 = query.getColumnIndex("fail_count");
                        int columnIndex7 = query.getColumnIndex("rit");
                        int columnIndex8 = query.getColumnIndex("tag");
                        int columnIndex9 = query.getColumnIndex("label");
                        int columnIndex10 = query.getColumnIndex("timestamp");
                        int columnIndex11 = query.getColumnIndex("mediation");
                        int i7 = i6;
                        int columnIndex12 = query.getColumnIndex("is_init");
                        try {
                            int columnIndex13 = query.getColumnIndex("extra");
                            while (query.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                if (columnIndex >= 0) {
                                    i = columnIndex10;
                                    i2 = columnIndex11;
                                    long j = query.getLong(columnIndex);
                                    zmnVar.zmn(j);
                                    arrayList2.add(String.valueOf(j));
                                } else {
                                    i = columnIndex10;
                                    i2 = columnIndex11;
                                }
                                if (columnIndex2 >= 0) {
                                    zmnVar.zmn(query.getString(columnIndex2));
                                }
                                if (columnIndex3 >= 0) {
                                    zmnVar.fs(query.getString(columnIndex3));
                                }
                                if (columnIndex4 >= 0) {
                                    zmnVar.zmn(query.getInt(columnIndex4));
                                }
                                if (columnIndex5 >= 0) {
                                    zmnVar.fs(query.getInt(columnIndex5));
                                }
                                if (columnIndex6 >= 0) {
                                    zmnVar.zn(query.getInt(columnIndex6));
                                }
                                if (columnIndex7 >= 0) {
                                    zmnVar.zn(query.getString(columnIndex7));
                                }
                                if (columnIndex8 >= 0) {
                                    zmnVar.fb(query.getString(columnIndex8));
                                }
                                if (columnIndex9 >= 0) {
                                    zmnVar.btk(query.getString(columnIndex9));
                                }
                                if (i >= 0) {
                                    i3 = columnIndex;
                                    columnIndex10 = i;
                                    i4 = columnIndex2;
                                    zmnVar.fs(query.getLong(columnIndex10));
                                } else {
                                    i3 = columnIndex;
                                    columnIndex10 = i;
                                    i4 = columnIndex2;
                                }
                                if (i2 >= 0) {
                                    i5 = i2;
                                    zmnVar.hhw(query.getString(i5));
                                } else {
                                    i5 = i2;
                                }
                                if (columnIndex12 >= 0) {
                                    zmnVar.fb(query.getInt(columnIndex12));
                                }
                                if (columnIndex13 >= 0) {
                                    zmnVar.nps(query.getString(columnIndex13));
                                }
                                arrayList3.add(zmnVar);
                                arrayList = arrayList3;
                                columnIndex2 = i4;
                                int i8 = i3;
                                columnIndex11 = i5;
                                columnIndex = i8;
                            }
                            ArrayList arrayList4 = arrayList;
                            query.close();
                            if (arrayList4.isEmpty()) {
                                return;
                            }
                            zmn.this.hhw.onMonitorUpload(arrayList4);
                            SQLiteDatabase zmn2 = com.bytedance.sdk.openadsdk.kgc.zmn.zmn.zmn();
                            if (zmn2 != null && zmn2.isOpen()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("_id IN (");
                                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                    sb.append("?");
                                    if (i9 < arrayList2.size() - 1) {
                                        sb.append(StringUtils.COMMA);
                                    }
                                }
                                sb.append(")");
                                zmn2.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                if (zmn.this.nps != null) {
                                    zmn.this.nps.zmn(zmn.zn);
                                }
                            }
                            if (arrayList4.size() < i7 || zmn.this.iv > 1000) {
                                return;
                            }
                            zmn.this.zmn(false);
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    static /* synthetic */ int fb(zmn zmnVar) {
        int i = zmnVar.iv;
        zmnVar.iv = i + 1;
        return i;
    }

    private zmn(fs fsVar) {
        try {
            this.hhw = new BusMonitorDependWrapper(fsVar);
            this.nps = new com.bytedance.sdk.openadsdk.kgc.zn.zmn(fsVar.getContext());
            fb = fsVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static zmn zmn(fs fsVar) {
        return new zmn(fsVar);
    }

    public static Context zmn() {
        Context context = fb;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void zmn(final fb fbVar) {
        if (fbVar == null || !fb()) {
            return;
        }
        final hhw handler = this.hhw.getHandler();
        handler.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgc.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                zmn.this.btk.add(fbVar);
                if (zmn.this.btk.size() >= 10) {
                    handler.fs(zmn.this.bvs);
                    zmn zmnVar = zmn.this;
                    zmnVar.zmn(zmnVar.btk);
                    zmn.this.btk.clear();
                }
            }
        });
        handler.fs(this.bvs);
        handler.zmn(this.bvs, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fb() {
        if (this.zg == null) {
            fs fsVar = this.hhw;
            this.zg = Boolean.valueOf((fsVar == null || fsVar.getContext() == null || !this.hhw.isMonitorOpen() || this.hhw.getHandler() == null) ? false : true);
        }
        return this.zg.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(List<fb> list) {
        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn2;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase zmn3 = com.bytedance.sdk.openadsdk.kgc.zmn.zmn.zmn();
            if (zmn3 != null) {
                try {
                    zmn3.beginTransaction();
                    for (int i = 0; i < list.size(); i++) {
                        fb fbVar = list.get(i);
                        if (fbVar != null && (zmn2 = fbVar.zmn()) != null) {
                            Cursor query = zmn3.query("monitor_table", fs, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{zmn2.fs(), zmn2.zn(), zmn2.nps(), zmn2.zg(), zmn2.bvs(), zmn2.rc(), String.valueOf(zmn2.klz()), String.valueOf(zmn2.iv()), zmn2.mw()}, null, null, null);
                            if (query != null) {
                                if (query.moveToNext()) {
                                    int columnIndex = query.getColumnIndex("_id");
                                    if (columnIndex >= 0) {
                                        zmn2.zmn(query.getLong(columnIndex));
                                    }
                                    int columnIndex2 = query.getColumnIndex("start_count");
                                    if (columnIndex2 >= 0) {
                                        zmn2.zmn(query.getInt(columnIndex2) + zmn2.fb());
                                    }
                                    int columnIndex3 = query.getColumnIndex("success_count");
                                    if (columnIndex3 >= 0) {
                                        zmn2.fs(query.getInt(columnIndex3) + zmn2.btk());
                                    }
                                    int columnIndex4 = query.getColumnIndex("fail_count");
                                    if (columnIndex4 >= 0) {
                                        zmn2.zn(query.getInt(columnIndex4) + zmn2.hhw());
                                    }
                                }
                                query.close();
                            }
                            ContentValues contentValues = new ContentValues();
                            if (zmn2.zmn() > 0) {
                                contentValues.put("_id", Long.valueOf(zmn2.zmn()));
                            }
                            contentValues.put("sdk_version", zmn2.fs());
                            contentValues.put("scene", zmn2.zn());
                            contentValues.put("start_count", Integer.valueOf(zmn2.fb()));
                            contentValues.put("success_count", Integer.valueOf(zmn2.btk()));
                            contentValues.put("fail_count", Integer.valueOf(zmn2.hhw()));
                            contentValues.put("rit", zmn2.nps());
                            contentValues.put("tag", zmn2.zg());
                            contentValues.put("label", zmn2.bvs());
                            contentValues.put("timestamp", Long.valueOf(zmn2.iv()));
                            contentValues.put("mediation", zmn2.rc());
                            contentValues.put("is_init", Integer.valueOf(zmn2.klz()));
                            contentValues.put("extra", zmn2.mw());
                            zmn3.insertWithOnConflict("monitor_table", null, contentValues, 5);
                        }
                    }
                    zmn3.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = zmn3;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            if (zmn3 != null) {
                try {
                    zmn3.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void zmn(final boolean z) {
        final hhw handler = this.hhw.getHandler();
        fs fsVar = this.hhw;
        if (fsVar == null || handler == null || fsVar.getContext() == null || this.nps == null || !fb()) {
            return;
        }
        handler.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kgc.zmn.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    zmn.fb(zmn.this);
                    if (z) {
                        long zmn2 = zmn.this.nps.zmn();
                        if (zmn2 == 0) {
                            zmn.this.nps.zmn(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.kgc.fb.zmn.zmn(zmn2) && System.currentTimeMillis() - zmn2 < zmn.this.hhw.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    handler.zmn(zmn.this.rc);
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.hhw.getOnceLogInterval(), 10000));
    }
}
