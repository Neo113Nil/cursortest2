package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.p30;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ez implements qk2 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f25517e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f25518f;

    /* renamed from: b, reason: collision with root package name */
    private final ov f25520b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25522d;

    /* renamed from: a, reason: collision with root package name */
    private final String f25519a = "ExoPlayerDownloads";

    /* renamed from: c, reason: collision with root package name */
    private final Object f25521c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements m30 {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f25523a;

        public final l30 a() {
            return ez.a(this.f25523a);
        }

        public final int b() {
            return this.f25523a.getPosition();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f25523a.close();
        }

        private a(Cursor cursor) {
            this.f25523a = cursor;
        }

        public final boolean a(int i4) {
            return this.f25523a.moveToPosition(i4);
        }
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 > 0) {
                sb.append(',');
            }
            sb.append(iArr[i4]);
        }
        sb.append(')');
        f25517e = sb.toString();
        f25518f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", b9.h.f15456P, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public ez(z12 z12Var, int i4) {
        this.f25520b = z12Var;
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i4 = u82.f32873a;
            for (String str2 : str.split(StringUtils.COMMA, -1)) {
                String[] split = str2.split("\\.", -1);
                if (split.length != 3) {
                    throw new IllegalStateException();
                }
                arrayList.add(new l22(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    public final l30 b(String str) {
        a();
        try {
            Cursor a4 = a("id = ?", new String[]{str});
            try {
                if (a4.getCount() == 0) {
                    a4.close();
                    return null;
                }
                a4.moveToNext();
                l30 a5 = a(a4);
                a4.close();
                return a5;
            } finally {
            }
        } catch (SQLiteException e4) {
            throw new nv(e4);
        }
    }

    public final void c(String str) {
        a();
        try {
            this.f25520b.getWritableDatabase().delete(this.f25519a, "id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(b9.h.f15456P, (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f25520b.getWritableDatabase().update(this.f25519a, contentValues, null, null);
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    private static l30 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        p30.b bVar = new p30.b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        p30 a4 = bVar.b(str).a(a(cursor.getString(3))).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        o30 o30Var = new o30();
        o30Var.f29891a = cursor.getLong(13);
        o30Var.f29892b = cursor.getFloat(12);
        int i4 = cursor.getInt(6);
        return new l30(a4, i4, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i4 == 4 ? cursor.getInt(11) : 0, o30Var);
    }

    private void a() {
        ArrayList arrayList;
        synchronized (this.f25521c) {
            if (this.f25522d) {
                return;
            }
            try {
                int i4 = 0;
                int a4 = ya2.a(this.f25520b.getReadableDatabase(), 0, "");
                if (a4 != 3) {
                    SQLiteDatabase writableDatabase = this.f25520b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        ya2.a(writableDatabase, 0, "", 3);
                        if (a4 == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f25519a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f25519a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        int size = arrayList.size();
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            a((l30) obj, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f25522d = true;
            } catch (Throwable th2) {
                throw new nv(th2);
            }
        }
    }

    private Cursor a(String str, String[] strArr) {
        try {
            return this.f25520b.getReadableDatabase().query(this.f25519a, f25518f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(b9.h.f15456P, (Integer) 0);
            this.f25520b.getWritableDatabase().update(this.f25519a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l30 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        p30.b a4 = new p30.b(Uri.parse(string2), string).b(cursor.getString(1)).a(a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        p30 a5 = a4.b(blob).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        o30 o30Var = new o30();
        o30Var.f29891a = cursor.getLong(13);
        o30Var.f29892b = cursor.getFloat(12);
        int i4 = cursor.getInt(6);
        return new l30(a5, i4, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i4 == 4 ? cursor.getInt(11) : 0, o30Var);
    }

    public final m30 a(int... iArr) {
        String sb;
        a();
        if (iArr.length == 0) {
            sb = "1";
        } else {
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i4 = 0; i4 < iArr.length; i4++) {
                if (i4 > 0) {
                    sb2.append(',');
                }
                sb2.append(iArr[i4]);
            }
            sb2.append(')');
            sb = sb2.toString();
        }
        return new a(a(sb, (String[]) null));
    }

    private ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!u82.a(sQLiteDatabase, this.f25519a)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.f25519a, new String[]{"id", b9.h.f15436D0, "uri", "stream_keys", "custom_cache_key", "data", b9.h.f15456P, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(b(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void a(l30 l30Var) {
        a();
        try {
            a(l30Var, this.f25520b.getWritableDatabase());
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    private void a(l30 l30Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = l30Var.f28400a.f30311f;
        if (bArr == null) {
            bArr = u82.f32878f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", l30Var.f28400a.f30307b);
        contentValues.put("mime_type", l30Var.f28400a.f30309d);
        contentValues.put("uri", l30Var.f28400a.f30308c.toString());
        List<l22> list = l30Var.f28400a.f30310e;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            l22 l22Var = list.get(i4);
            sb.append(l22Var.f28395b);
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(l22Var.f28396c);
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(l22Var.f28397d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", l30Var.f28400a.f30312g);
        contentValues.put("data", l30Var.f28400a.f30313h);
        contentValues.put(b9.h.f15456P, Integer.valueOf(l30Var.f28401b));
        contentValues.put("start_time_ms", Long.valueOf(l30Var.f28402c));
        contentValues.put("update_time_ms", Long.valueOf(l30Var.f28403d));
        contentValues.put("content_length", Long.valueOf(l30Var.f28404e));
        contentValues.put("stop_reason", Integer.valueOf(l30Var.f28405f));
        contentValues.put("failure_reason", Integer.valueOf(l30Var.f28406g));
        contentValues.put("percent_downloaded", Float.valueOf(l30Var.f28407h.f29892b));
        contentValues.put("bytes_downloaded", Long.valueOf(l30Var.f28407h.f29891a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f25519a, null, contentValues);
    }

    public final void a(int i4) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i4));
            this.f25520b.getWritableDatabase().update(this.f25519a, contentValues, f25517e, null);
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    public final void a(int i4, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i4));
            this.f25520b.getWritableDatabase().update(this.f25519a, contentValues, f25517e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new nv(th);
        }
    }
}
