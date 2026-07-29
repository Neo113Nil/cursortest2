package com.applovin.impl.sdk.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.j;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f3011b;

    /* renamed from: a, reason: collision with root package name */
    private final j f3012a;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f3013c;

    public e(j jVar) {
        this.f3012a = jVar;
        this.f3013c = jVar.w().getSharedPreferences("com.applovin.sdk.preferences." + jVar.s(), 0);
    }

    private static SharedPreferences a(Context context) {
        if (f3011b == null) {
            f3011b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3011b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences, j jVar) {
        Object string;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return t;
            }
            if (Boolean.class.equals(cls)) {
                string = Boolean.valueOf(t != 0 ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
            } else if (Float.class.equals(cls)) {
                string = Float.valueOf(t != 0 ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
            } else if (Integer.class.equals(cls)) {
                string = Integer.valueOf(t != 0 ? sharedPreferences.getInt(str, ((Integer) t).intValue()) : sharedPreferences.getInt(str, 0));
            } else if (Long.class.equals(cls)) {
                string = Long.valueOf(t != 0 ? sharedPreferences.getLong(str, ((Long) t).longValue()) : sharedPreferences.getLong(str, 0L));
            } else {
                string = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
            }
            return string != null ? (T) cls.cast(string) : t;
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.u().b("SharedPreferencesManager", "Error getting value for key: " + str, th);
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void a(SharedPreferences.Editor editor, j jVar) {
        if (jVar == null || !((Boolean) jVar.a(b.W)).booleanValue()) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static <T> void a(d<T> dVar, Context context) {
        a(a(context).edit().remove(dVar.a()), (j) null);
    }

    public static <T> void a(d<T> dVar, T t, Context context) {
        a(dVar.a(), t, a(context), (SharedPreferences.Editor) null, (j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor, j jVar) {
        boolean z = false;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        } else if (t instanceof String) {
            editor.putString(str, (String) t);
        } else {
            if (!(t instanceof Set)) {
                if (jVar != null) {
                    jVar.u().d("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                }
                if (z || z2) {
                }
                a(editor, jVar);
                return;
            }
            editor.putStringSet(str, (Set) t);
        }
        z = true;
        if (z) {
        }
    }

    public static <T> T b(d<T> dVar, T t, Context context) {
        return (T) a(dVar.a(), t, dVar.b(), a(context), (j) null);
    }

    public <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        return (T) a(str, t, cls, sharedPreferences, this.f3012a);
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear(), this.f3012a);
    }

    public <T> void a(d<T> dVar) {
        a(this.f3013c.edit().remove(dVar.a()), this.f3012a);
    }

    public <T> void a(d<T> dVar, T t) {
        a((d<d<T>>) dVar, (d<T>) t, this.f3013c);
    }

    public <T> void a(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        a(dVar.a(), (String) t, sharedPreferences);
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        a(str, t, (SharedPreferences) null, editor, this.f3012a);
    }

    public <T> void a(String str, T t, SharedPreferences sharedPreferences) {
        a(str, t, sharedPreferences, (SharedPreferences.Editor) null, this.f3012a);
    }

    public <T> T b(d<T> dVar, T t) {
        return (T) b((d<d<T>>) dVar, (d<T>) t, this.f3013c);
    }

    public <T> T b(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t, dVar.b(), sharedPreferences);
    }
}
