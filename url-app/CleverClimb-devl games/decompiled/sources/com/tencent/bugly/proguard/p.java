package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static p f8765a;

    /* renamed from: b, reason: collision with root package name */
    private static q f8766b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f8767c;

    private p(Context context, List<com.tencent.bugly.a> list) {
        f8766b = new q(context, list);
    }

    public static synchronized p a(Context context, List<com.tencent.bugly.a> list) {
        p pVar;
        synchronized (p.class) {
            if (f8765a == null) {
                f8765a = new p(context, list);
            }
            pVar = f8765a;
        }
        return pVar;
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            pVar = f8765a;
        }
        return pVar;
    }

    public final long a(String str, ContentValues contentValues, o oVar, boolean z) {
        return a(str, contentValues, (o) null);
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, o oVar, boolean z) {
        return a(false, str, strArr, str2, null, null, null, null, null, null);
    }

    public final int a(String str, String str2, String[] strArr, o oVar, boolean z) {
        return a(str, str2, (String[]) null, (o) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r9 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        java.lang.Long.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r9 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized long a(String str, ContentValues contentValues, o oVar) {
        long j;
        j = 0;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                    if (writableDatabase != null && contentValues != null) {
                        long replace = writableDatabase.replace(str, "_id", contentValues);
                        if (replace >= 0) {
                            x.c("[Database] insert %s success.", str);
                        } else {
                            x.d("[Database] replace %s error.", str);
                        }
                        j = replace;
                    }
                } catch (Throwable th) {
                    if (oVar != null) {
                        Long.valueOf(0L);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!x.a(th2)) {
                    th2.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Cursor a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, o oVar) {
        Cursor cursor;
        cursor = null;
        try {
            try {
                SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                if (writableDatabase != null) {
                    cursor = writableDatabase.query(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
                }
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            }
        } finally {
        }
        return cursor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
    
        if (r6 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0021, code lost:
    
        if (r6 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized int a(String str, String str2, String[] strArr, o oVar) {
        int i;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                    i = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
                } catch (Throwable th) {
                    if (oVar != null) {
                        Integer.valueOf(0);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!x.a(th2)) {
                    th2.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return i;
    }

    public final boolean a(int i, String str, byte[] bArr, o oVar, boolean z) {
        if (!z) {
            a aVar = new a(4, null);
            aVar.a(i, str, bArr);
            w.a().a(aVar);
            return true;
        }
        return a(i, str, bArr, (o) null);
    }

    public final Map<String, byte[]> a(int i, o oVar, boolean z) {
        return a(i, (o) null);
    }

    public final boolean a(int i, String str, o oVar, boolean z) {
        return a(555, str, (o) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, String str, byte[] bArr, o oVar) {
        try {
            try {
                r rVar = new r();
                rVar.f8776a = i;
                rVar.f = str;
                rVar.e = System.currentTimeMillis();
                rVar.g = bArr;
                boolean b2 = b(rVar);
                if (oVar == null) {
                    return b2;
                }
                Boolean.valueOf(b2);
                return b2;
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                if (oVar != null) {
                    Boolean.valueOf(false);
                }
                return false;
            }
        } catch (Throwable th2) {
            if (oVar != null) {
                Boolean.valueOf(false);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, byte[]> a(int i, o oVar) {
        HashMap hashMap = null;
        try {
            List<r> c2 = c(i);
            if (c2 == null) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            try {
                for (r rVar : c2) {
                    byte[] bArr = rVar.g;
                    if (bArr != null) {
                        hashMap2.put(rVar.f, bArr);
                    }
                }
                return hashMap2;
            } catch (Throwable th) {
                th = th;
                hashMap = hashMap2;
                if (x.a(th)) {
                    return hashMap;
                }
                th.printStackTrace();
                return hashMap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean a(r rVar) {
        ContentValues c2;
        try {
            if (rVar == null) {
                return false;
            }
            try {
                SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                if (writableDatabase == null || (c2 = c(rVar)) == null) {
                    return false;
                }
                long replace = writableDatabase.replace("t_lr", "_id", c2);
                if (replace < 0) {
                    return false;
                }
                x.c("[Database] insert %s success.", "t_lr");
                rVar.f8776a = replace;
                return true;
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean b(r rVar) {
        ContentValues d2;
        try {
            if (rVar == null) {
                return false;
            }
            try {
                SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                if (writableDatabase == null || (d2 = d(rVar)) == null) {
                    return false;
                }
                long replace = writableDatabase.replace("t_pf", "_id", d2);
                if (replace < 0) {
                    return false;
                }
                x.c("[Database] insert %s success.", "t_pf");
                rVar.f8776a = replace;
                return true;
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:19:0x003c, B:20:0x0046, B:22:0x004d, B:32:0x0053, B:25:0x0057, B:29:0x006f, B:35:0x0077, B:37:0x0081, B:44:0x00a7, B:46:0x00ad), top: B:9:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #5 {, blocks: (B:3:0x0001, B:15:0x0037, B:40:0x00a1, B:48:0x00b2, B:55:0x00b9, B:56:0x00bc), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<r> a(int i) {
        String str;
        Throwable th;
        Cursor cursor;
        SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
        if (writableDatabase != null) {
            try {
                if (i >= 0) {
                    try {
                        str = "_tp = " + ((int) i);
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        if (i != 0) {
                            i.close();
                        }
                        throw th;
                    }
                } else {
                    str = null;
                }
                cursor = writableDatabase.query("t_lr", null, str, null, null, null, null);
                if (cursor == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        r a2 = a(cursor);
                        if (a2 != null) {
                            arrayList.add(a2);
                        } else {
                            try {
                                long j = cursor.getLong(cursor.getColumnIndex("_id"));
                                sb.append(" or _id");
                                sb.append(" = ");
                                sb.append(j);
                            } catch (Throwable unused) {
                                x.d("[Database] unknown id.", new Object[0]);
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        x.d("[Database] deleted %s illegal data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", sb2.substring(4), null)));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    public final synchronized void a(List<r> list) {
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                if (writableDatabase != null) {
                    StringBuilder sb = new StringBuilder();
                    for (r rVar : list) {
                        sb.append(" or _id");
                        sb.append(" = ");
                        sb.append(rVar.f8776a);
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        sb2 = sb2.substring(4);
                    }
                    sb.setLength(0);
                    try {
                        x.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", sb2, null)));
                    } catch (Throwable th) {
                        if (x.a(th)) {
                            return;
                        }
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    public final synchronized void b(int i) {
        String str;
        SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
        if (writableDatabase != null) {
            if (i >= 0) {
                try {
                    try {
                        str = "_tp = " + i;
                    } catch (Throwable th) {
                        if (x.a(th)) {
                            return;
                        }
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                str = null;
            }
            x.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", str, null)));
        }
    }

    private static ContentValues c(r rVar) {
        if (rVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (rVar.f8776a > 0) {
                contentValues.put("_id", Long.valueOf(rVar.f8776a));
            }
            contentValues.put("_tp", Integer.valueOf(rVar.f8777b));
            contentValues.put("_pc", rVar.f8778c);
            contentValues.put("_th", rVar.f8779d);
            contentValues.put("_tm", Long.valueOf(rVar.e));
            if (rVar.g != null) {
                contentValues.put("_dt", rVar.g);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static r a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            r rVar = new r();
            rVar.f8776a = cursor.getLong(cursor.getColumnIndex("_id"));
            rVar.f8777b = cursor.getInt(cursor.getColumnIndex("_tp"));
            rVar.f8778c = cursor.getString(cursor.getColumnIndex("_pc"));
            rVar.f8779d = cursor.getString(cursor.getColumnIndex("_th"));
            rVar.e = cursor.getLong(cursor.getColumnIndex("_tm"));
            rVar.g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return rVar;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #5 {all -> 0x00bf, blocks: (B:9:0x0029, B:35:0x009c, B:44:0x00b3, B:47:0x00bb, B:48:0x00c1), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<r> c(int i) {
        Cursor cursor;
        try {
            try {
                SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                if (writableDatabase != null) {
                    String str = "_id = " + i;
                    cursor = writableDatabase.query("t_pf", null, str, null, null, null, null);
                    if (cursor == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        try {
                            StringBuilder sb = new StringBuilder();
                            ArrayList arrayList = new ArrayList();
                            while (cursor.moveToNext()) {
                                r b2 = b(cursor);
                                if (b2 != null) {
                                    arrayList.add(b2);
                                } else {
                                    try {
                                        String string = cursor.getString(cursor.getColumnIndex("_tp"));
                                        sb.append(" or _tp");
                                        sb.append(" = ");
                                        sb.append(string);
                                    } catch (Throwable unused) {
                                        x.d("[Database] unknown id.", new Object[0]);
                                    }
                                }
                            }
                            if (sb.length() > 0) {
                                sb.append(" and _id");
                                sb.append(" = ");
                                sb.append(i);
                                x.d("[Database] deleted %s illegal data %d.", "t_pf", Integer.valueOf(writableDatabase.delete("t_pf", str.substring(4), null)));
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (!x.a(th)) {
                                th.printStackTrace();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r7 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r7 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(int i, String str, o oVar) {
        boolean z;
        String str2;
        z = false;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = f8766b.getWritableDatabase();
                    if (writableDatabase != null) {
                        if (z.a(str)) {
                            str2 = "_id = " + i;
                        } else {
                            str2 = "_id = " + i + " and _tp = \"" + str + "\"";
                        }
                        int delete = writableDatabase.delete("t_pf", str2, null);
                        x.c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(delete));
                        if (delete > 0) {
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    if (oVar != null) {
                        Boolean.valueOf(false);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!x.a(th2)) {
                    th2.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return z;
    }

    private static ContentValues d(r rVar) {
        if (rVar == null || z.a(rVar.f)) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (rVar.f8776a > 0) {
                contentValues.put("_id", Long.valueOf(rVar.f8776a));
            }
            contentValues.put("_tp", rVar.f);
            contentValues.put("_tm", Long.valueOf(rVar.e));
            if (rVar.g != null) {
                contentValues.put("_dt", rVar.g);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static r b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            r rVar = new r();
            rVar.f8776a = cursor.getLong(cursor.getColumnIndex("_id"));
            rVar.e = cursor.getLong(cursor.getColumnIndex("_tm"));
            rVar.f = cursor.getString(cursor.getColumnIndex("_tp"));
            rVar.g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return rVar;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* compiled from: BUGLY */
    class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private int f8768a;

        /* renamed from: b, reason: collision with root package name */
        private o f8769b;

        /* renamed from: c, reason: collision with root package name */
        private String f8770c;

        /* renamed from: d, reason: collision with root package name */
        private ContentValues f8771d;
        private boolean e;
        private String[] f;
        private String g;
        private String[] h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String[] n;
        private int o;
        private String p;
        private byte[] q;

        public a(int i, o oVar) {
            this.f8768a = i;
            this.f8769b = oVar;
        }

        public final void a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
            this.e = z;
            this.f8770c = str;
            this.f = strArr;
            this.g = str2;
            this.h = strArr2;
            this.i = str3;
            this.j = str4;
            this.k = str5;
            this.l = str6;
        }

        public final void a(int i, String str, byte[] bArr) {
            this.o = i;
            this.p = str;
            this.q = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f8768a) {
                case 1:
                    p.this.a(this.f8770c, this.f8771d, this.f8769b);
                    break;
                case 2:
                    p.this.a(this.f8770c, this.m, this.n, this.f8769b);
                    break;
                case 3:
                    p.this.a(this.e, this.f8770c, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.f8769b);
                    break;
                case 4:
                    p.this.a(this.o, this.p, this.q, this.f8769b);
                    break;
                case 5:
                    p.this.a(this.o, this.f8769b);
                    break;
                case 6:
                    p.this.a(this.o, this.p, this.f8769b);
                    break;
            }
        }
    }
}
