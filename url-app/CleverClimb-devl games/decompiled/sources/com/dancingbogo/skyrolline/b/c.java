package com.dancingbogo.skyrolline.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.ipc.IpcProvider;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ServicePreferencesHelper.java */
/* loaded from: classes.dex */
public class c implements com.dancingbogo.skyrolline.b.a {
    private static String e = "pref_name";
    private static String f = "action";
    private static String g = "type";
    private static String h = "key";
    private static String i = "value";

    /* renamed from: a, reason: collision with root package name */
    private Context f4541a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f4542b;

    /* renamed from: c, reason: collision with root package name */
    private String f4543c;

    /* renamed from: d, reason: collision with root package name */
    private b f4544d;

    public c(Context context, String str) {
        this.f4544d = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f4541a = context.getApplicationContext();
        this.f4543c = str;
        this.f4544d = new b(this.f4543c);
        if (com.dancingbogo.skyrolline.c.a.a()) {
            this.f4542b = this.f4541a.getSharedPreferences(this.f4543c, 0);
        }
    }

    private SharedPreferences f() {
        com.dancingbogo.skyrolline.c.a.d();
        if (this.f4542b == null) {
            this.f4542b = this.f4541a.getSharedPreferences(this.f4543c, 0);
        }
        return this.f4542b;
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public long a(String str, long j) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            return f2 != null ? f2.getLong(str, j) : j;
        }
        return this.f4544d.a(str, j);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public boolean a(String str, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            return f2 != null ? f2.getBoolean(str, z) : z;
        }
        return this.f4544d.a(str, z);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public int a(String str, int i2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            return f2 != null ? f2.getInt(str, i2) : i2;
        }
        return this.f4544d.a(str, i2);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public String a(String str, String str2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            return f2 != null ? f2.getString(str, str2) : str2;
        }
        return this.f4544d.a(str, str2);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public void b(String str, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            if (f2 == null) {
                return;
            }
            SharedPreferences.Editor edit = f2.edit();
            edit.putBoolean(str, z);
            a(edit);
            return;
        }
        this.f4544d.b(str, z);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public void b(String str, long j) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            if (f2 == null) {
                return;
            }
            SharedPreferences.Editor edit = f2.edit();
            edit.putLong(str, j);
            a(edit);
            return;
        }
        this.f4544d.b(str, j);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public void b(String str, int i2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            if (f2 == null) {
                return;
            }
            SharedPreferences.Editor edit = f2.edit();
            edit.putInt(str, i2);
            a(edit);
            return;
        }
        this.f4544d.b(str, i2);
    }

    @Override // com.dancingbogo.skyrolline.b.a
    public void b(String str, String str2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            SharedPreferences f2 = f();
            if (f2 == null) {
                return;
            }
            SharedPreferences.Editor edit = f2.edit();
            edit.putString(str, str2);
            a(edit);
            return;
        }
        this.f4544d.b(str, str2);
    }

    private void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    /* compiled from: ServicePreferencesHelper.java */
    /* loaded from: classes2.dex */
    public static class a extends com.dancingbogo.skyrolline.ipc.a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, com.dancingbogo.skyrolline.b.a> f4545a = new HashMap();

        private com.dancingbogo.skyrolline.b.a a(Context context, String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            com.dancingbogo.skyrolline.b.a aVar = this.f4545a.get(str);
            if (aVar != null) {
                return aVar;
            }
            c cVar = new c(context, str);
            this.f4545a.put(str, cVar);
            return cVar;
        }

        @Override // com.dancingbogo.skyrolline.ipc.b
        public String a(ContentValues contentValues) {
            com.dancingbogo.skyrolline.c.a.d();
            com.dancingbogo.skyrolline.b.a a2 = a(a(), contentValues.getAsString(c.e));
            if (a2 == null) {
                return null;
            }
            int intValue = contentValues.getAsInteger(c.f).intValue();
            int intValue2 = contentValues.getAsInteger(c.g).intValue();
            if (intValue == 1) {
                if (intValue2 == 1) {
                    return "" + a2.a(contentValues.getAsString(c.h), contentValues.getAsBoolean(c.i).booleanValue());
                }
                if (intValue2 == 2) {
                    return "" + a2.a(contentValues.getAsString(c.h), contentValues.getAsInteger(c.i).intValue());
                }
                if (intValue2 == 3) {
                    return "" + a2.a(contentValues.getAsString(c.h), contentValues.getAsLong(c.i).longValue());
                }
                if (intValue2 == 4) {
                    return "" + a2.a(contentValues.getAsString(c.h), contentValues.getAsString(c.i));
                }
            } else if (intValue == 2) {
                if (intValue2 == 1) {
                    a2.b(contentValues.getAsString(c.h), contentValues.getAsBoolean(c.i).booleanValue());
                } else if (intValue2 == 2) {
                    a2.b(contentValues.getAsString(c.h), contentValues.getAsInteger(c.i).intValue());
                } else if (intValue2 == 3) {
                    a2.b(contentValues.getAsString(c.h), contentValues.getAsLong(c.i).longValue());
                } else if (intValue2 == 4) {
                    a2.b(contentValues.getAsString(c.h), contentValues.getAsString(c.i));
                }
            }
            return null;
        }
    }

    /* compiled from: ServicePreferencesHelper.java */
    /* loaded from: classes2.dex */
    private static class b implements com.dancingbogo.skyrolline.b.a, com.dancingbogo.skyrolline.ipc.c {

        /* renamed from: a, reason: collision with root package name */
        private String f4546a;

        @Override // com.dancingbogo.skyrolline.ipc.c
        public int a() {
            return 2;
        }

        public b(String str) {
            this.f4546a = null;
            if (str == null) {
                throw new IllegalArgumentException();
            }
            this.f4546a = str;
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public long a(String str, long j) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 1);
            contentValues.put(c.g, (Integer) 3);
            contentValues.put(c.h, str);
            contentValues.put(c.i, Long.valueOf(j));
            try {
                return Long.valueOf(IpcProvider.a(contentValues, this)).longValue();
            } catch (Exception unused) {
                return j;
            }
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public boolean a(String str, boolean z) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 1);
            contentValues.put(c.g, (Integer) 1);
            contentValues.put(c.h, str);
            contentValues.put(c.i, Boolean.valueOf(z));
            try {
                return Boolean.valueOf(IpcProvider.a(contentValues, this)).booleanValue();
            } catch (Exception unused) {
                return z;
            }
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public int a(String str, int i) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 1);
            contentValues.put(c.g, (Integer) 2);
            contentValues.put(c.h, str);
            contentValues.put(c.i, Integer.valueOf(i));
            try {
                return Integer.valueOf(IpcProvider.a(contentValues, this)).intValue();
            } catch (Exception unused) {
                return i;
            }
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public String a(String str, String str2) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 1);
            contentValues.put(c.g, (Integer) 4);
            contentValues.put(c.h, str);
            contentValues.put(c.i, str2);
            try {
                return IpcProvider.a(contentValues, this);
            } catch (Exception unused) {
                return str2;
            }
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public void b(String str, boolean z) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 2);
            contentValues.put(c.g, (Integer) 1);
            contentValues.put(c.h, str);
            contentValues.put(c.i, Boolean.valueOf(z));
            IpcProvider.a(contentValues, this);
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public void b(String str, long j) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 2);
            contentValues.put(c.g, (Integer) 3);
            contentValues.put(c.h, str);
            contentValues.put(c.i, Long.valueOf(j));
            IpcProvider.a(contentValues, this);
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public void b(String str, int i) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 2);
            contentValues.put(c.g, (Integer) 2);
            contentValues.put(c.h, str);
            contentValues.put(c.i, Integer.valueOf(i));
            IpcProvider.a(contentValues, this);
        }

        @Override // com.dancingbogo.skyrolline.b.a
        public void b(String str, String str2) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(c.e, this.f4546a);
            contentValues.put(c.f, (Integer) 2);
            contentValues.put(c.g, (Integer) 4);
            contentValues.put(c.h, str);
            contentValues.put(c.i, str2);
            IpcProvider.a(contentValues, this);
        }
    }
}
