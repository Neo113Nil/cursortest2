package com.baidu.mshield.rp.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import com.artillery.ctc.uitls.TimeConstants;
import com.baidu.mshield.ac.F;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f8346a;

    /* renamed from: b, reason: collision with root package name */
    public C0085a f8347b;

    /* renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f8348c;

    /* renamed from: d, reason: collision with root package name */
    public Context f8349d;

    /* renamed from: com.baidu.mshield.rp.c.a$a, reason: collision with other inner class name */
    public class C0085a extends SQLiteOpenHelper {
        public C0085a(a aVar, Context context) {
            super(context, "msre.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table if not exists r(a integer primary key autoincrement, b text, c integer, e integer,f integer,h text, g integer, i integer, j text, d long);");
            sQLiteDatabase.execSQL("create table if not exists c(a integer primary key autoincrement, b text); ");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        }
    }

    public a(Context context) {
        this.f8349d = context;
        this.f8347b = new C0085a(this, context);
        com.baidu.mshield.sharedpreferences.a.a(context);
        d();
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f8346a == null) {
                    f8346a = new a(context);
                }
                aVar = f8346a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public boolean b(String str) {
        boolean z7 = true;
        Cursor cursor = null;
        try {
            try {
                cursor = this.f8348c.query("c", null, "b=?", new String[]{str}, null, null, null);
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        z7 = false;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
            }
        } catch (Throwable th2) {
            try {
                com.baidu.mshield.utility.a.a(th2);
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th4) {
                        com.baidu.mshield.utility.a.a(th4);
                    }
                }
                throw th3;
            }
        }
        return z7;
    }

    public List<com.baidu.mshield.rp.d.a> c() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f8348c.query("r", null, "i=5", null, null, null, "d desc", "100");
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        com.baidu.mshield.rp.d.a aVar = new com.baidu.mshield.rp.d.a();
                        aVar.f8350a = cursor.getInt(cursor.getColumnIndex("a"));
                        aVar.f8351b = cursor.getString(cursor.getColumnIndex("b"));
                        aVar.f8352c = cursor.getInt(cursor.getColumnIndex("c"));
                        aVar.f8354e = cursor.getLong(cursor.getColumnIndex("d"));
                        aVar.f8355f = cursor.getInt(cursor.getColumnIndex("g"));
                        aVar.f8356g = cursor.getInt(cursor.getColumnIndex("e"));
                        aVar.f8357h = cursor.getInt(cursor.getColumnIndex("f"));
                        aVar.f8358i = cursor.getInt(cursor.getColumnIndex(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT));
                        aVar.f8359j = cursor.getString(cursor.getColumnIndex("j"));
                        String string = cursor.getString(cursor.getColumnIndex(CmcdHeadersFactory.STREAMING_FORMAT_HLS));
                        try {
                            string = new String(F.getInstance().ad(Base64.decode(string, 0), "xVOTuxgN3lkRN2v4".getBytes("utf-8")));
                        } catch (Exception e8) {
                            com.baidu.mshield.utility.a.a(e8);
                        }
                        aVar.f8353d = string;
                        arrayList.add(aVar);
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                try {
                    com.baidu.mshield.utility.a.a(th);
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th2) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th3) {
                            com.baidu.mshield.utility.a.a(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            com.baidu.mshield.utility.a.a(th4);
        }
        return arrayList;
    }

    public final void d() {
        try {
            this.f8348c = this.f8347b.getWritableDatabase();
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public long a(com.baidu.mshield.rp.d.a aVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("b", aVar.f8351b);
            contentValues.put("c", Integer.valueOf(aVar.f8352c));
            contentValues.put("d", Long.valueOf(aVar.f8354e));
            contentValues.put("e", Integer.valueOf(aVar.f8356g));
            contentValues.put("g", Integer.valueOf(aVar.f8355f));
            contentValues.put("f", Integer.valueOf(aVar.f8357h));
            contentValues.put(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, Integer.valueOf(aVar.f8358i));
            contentValues.put("j", aVar.f8359j);
            String str = aVar.f8353d;
            try {
                str = Base64.encodeToString(F.getInstance().ae(str.getBytes(), "xVOTuxgN3lkRN2v4".getBytes("utf-8")), 0);
            } catch (Exception e8) {
                com.baidu.mshield.utility.a.a(e8);
            }
            contentValues.put(CmcdHeadersFactory.STREAMING_FORMAT_HLS, str);
            try {
                return this.f8348c.insert("r", null, contentValues);
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
                return -1L;
            }
        } catch (Throwable th2) {
            com.baidu.mshield.utility.a.a(th2);
        }
    }

    public List<com.baidu.mshield.rp.d.a> b(int i8) {
        String str;
        Cursor cursor;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(this.f8349d);
            int F = a8.F() * TimeConstants.HOUR;
            if (i8 == 2) {
                str = "(d <= (" + currentTimeMillis + "-e*" + TimeConstants.HOUR + ") or e=0 )";
            } else {
                str = "(d <= (" + currentTimeMillis + "-e*" + TimeConstants.HOUR + ") or e=0 ) and (g!=2 or d<=" + (currentTimeMillis - F) + ")";
            }
            String str2 = str;
            try {
                try {
                    if (i8 == 2) {
                        query = this.f8348c.query("r", null, str2, null, null, null, "d desc", Integer.toString(100));
                    } else {
                        query = this.f8348c.query("r", null, str2, null, null, null, "d desc", Integer.toString(a8.h()));
                    }
                    cursor = query;
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                com.baidu.mshield.rp.d.a aVar = new com.baidu.mshield.rp.d.a();
                                aVar.f8350a = cursor.getInt(cursor.getColumnIndex("a"));
                                aVar.f8351b = cursor.getString(cursor.getColumnIndex("b"));
                                aVar.f8352c = cursor.getInt(cursor.getColumnIndex("c"));
                                aVar.f8354e = cursor.getLong(cursor.getColumnIndex("d"));
                                aVar.f8355f = cursor.getInt(cursor.getColumnIndex("g"));
                                aVar.f8356g = cursor.getInt(cursor.getColumnIndex("e"));
                                aVar.f8357h = cursor.getInt(cursor.getColumnIndex("f"));
                                aVar.f8358i = cursor.getInt(cursor.getColumnIndex(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT));
                                aVar.f8359j = cursor.getString(cursor.getColumnIndex("j"));
                                String string = cursor.getString(cursor.getColumnIndex(CmcdHeadersFactory.STREAMING_FORMAT_HLS));
                                try {
                                    string = new String(F.getInstance().ad(Base64.decode(string, 0), "xVOTuxgN3lkRN2v4".getBytes("utf-8")));
                                } catch (Exception e8) {
                                    com.baidu.mshield.utility.a.a(e8);
                                }
                                aVar.f8353d = string;
                                arrayList.add(aVar);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    com.baidu.mshield.utility.a.a(th);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return arrayList;
                                } finally {
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                com.baidu.mshield.utility.a.a(th3);
            }
        } catch (Throwable th4) {
            com.baidu.mshield.utility.a.a(th4);
        }
        return arrayList;
    }

    public long a(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("b", str);
        try {
            return this.f8348c.insert("c", null, contentValues);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return -1L;
        }
    }

    public int a(int i8) {
        try {
            return this.f8348c.delete("r", "a=?", new String[]{i8 + ""});
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return -1;
        }
    }

    public int a(List<Integer> list) {
        int i8 = -1;
        try {
            this.f8348c.beginTransaction();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                i8 = a(it.next().intValue());
                if (i8 <= 0) {
                    com.baidu.mshield.rp.f.a.f8364a = System.currentTimeMillis();
                }
            }
            this.f8348c.setTransactionSuccessful();
            try {
                this.f8348c.endTransaction();
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
                com.baidu.mshield.rp.f.a.f8364a = System.currentTimeMillis();
            }
        } catch (Throwable th2) {
            try {
                com.baidu.mshield.utility.a.a(th2);
                com.baidu.mshield.rp.f.a.f8364a = System.currentTimeMillis();
            } finally {
                try {
                    this.f8348c.endTransaction();
                } catch (Throwable th3) {
                    com.baidu.mshield.utility.a.a(th3);
                    com.baidu.mshield.rp.f.a.f8364a = System.currentTimeMillis();
                }
            }
        }
        return i8;
    }

    public List<com.baidu.mshield.rp.d.a> a(boolean z7, int i8) {
        String str;
        Cursor cursor;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (z7) {
                str = "(d < (" + currentTimeMillis + "-f*" + TimeConstants.HOUR + ") and f!= 0)";
            } else {
                str = "d<=" + (currentTimeMillis - 259200000);
            }
            String str2 = str;
            try {
                try {
                    if (i8 == 2) {
                        query = this.f8348c.query("r", null, str2, null, null, null, "d desc", "100");
                    } else {
                        int h8 = com.baidu.mshield.sharedpreferences.a.a(this.f8349d).h();
                        com.baidu.mshield.b.c.a.b("sj-trigger report 3g limit" + Integer.toString(h8));
                        query = this.f8348c.query("r", null, str2, null, null, null, "d desc", Integer.toString(h8));
                    }
                    cursor = query;
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                com.baidu.mshield.rp.d.a aVar = new com.baidu.mshield.rp.d.a();
                                aVar.f8350a = cursor.getInt(cursor.getColumnIndex("a"));
                                aVar.f8351b = cursor.getString(cursor.getColumnIndex("b"));
                                aVar.f8352c = cursor.getInt(cursor.getColumnIndex("c"));
                                aVar.f8354e = cursor.getLong(cursor.getColumnIndex("d"));
                                aVar.f8355f = cursor.getInt(cursor.getColumnIndex("g"));
                                aVar.f8356g = cursor.getInt(cursor.getColumnIndex("e"));
                                aVar.f8357h = cursor.getInt(cursor.getColumnIndex("f"));
                                aVar.f8358i = cursor.getInt(cursor.getColumnIndex(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT));
                                aVar.f8359j = cursor.getString(cursor.getColumnIndex("j"));
                                String string = cursor.getString(cursor.getColumnIndex(CmcdHeadersFactory.STREAMING_FORMAT_HLS));
                                try {
                                    string = new String(F.getInstance().ad(Base64.decode(string, 0), "xVOTuxgN3lkRN2v4".getBytes("utf-8")));
                                } catch (Exception e8) {
                                    com.baidu.mshield.utility.a.a(e8);
                                }
                                aVar.f8353d = string;
                                arrayList.add(aVar);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    com.baidu.mshield.utility.a.a(th);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return arrayList;
                                } finally {
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                com.baidu.mshield.utility.a.a(th3);
            }
        } catch (Throwable th4) {
            com.baidu.mshield.utility.a.a(th4);
        }
        return arrayList;
    }

    public int b() {
        Cursor cursor = null;
        int i8 = 0;
        try {
            try {
                cursor = this.f8348c.query("r", null, null, null, null, null, null, null);
                if (cursor != null) {
                    i8 = cursor.getCount();
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
            }
        } catch (Throwable th2) {
            try {
                com.baidu.mshield.utility.a.a(th2);
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th4) {
                        com.baidu.mshield.utility.a.a(th4);
                    }
                }
                throw th3;
            }
        }
        return i8;
    }

    public int a() {
        com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(this.f8349d);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return this.f8348c.delete("r", "(d <= ? or (d < (" + currentTimeMillis + "-f*" + TimeConstants.HOUR + ") and f!= 0)) and b != '1001001'and " + CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT + " != 5 ", new String[]{String.valueOf(currentTimeMillis - (a8.I() * TimeConstants.DAY))});
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return -1;
        }
    }
}
