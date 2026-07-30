package j0;

import android.content.Context;
import android.content.SharedPreferences;
import com.crrepa.g1.d;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static a f17026c;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f17027a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f17028b;

    private a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("crp", 0);
        this.f17027a = sharedPreferences;
        this.f17028b = sharedPreferences.edit();
    }

    public static a b() {
        if (f17026c == null) {
            a(d.a());
        }
        return f17026c;
    }

    public int a(String str, int i8) {
        return this.f17027a.getInt(str, i8);
    }

    public String a(String str, String str2) {
        return this.f17027a.getString(str, str2);
    }

    public void b(String str, int i8) {
        this.f17028b.putInt(str, i8);
        this.f17028b.commit();
    }

    public void a() {
        this.f17028b.clear();
        this.f17028b.commit();
    }

    public void b(String str, String str2) {
        this.f17028b.putString(str, str2);
        this.f17028b.commit();
    }

    private static void a(Context context) {
        if (f17026c == null) {
            synchronized (a.class) {
                try {
                    if (f17026c == null) {
                        f17026c = new a(context);
                    }
                } finally {
                }
            }
        }
    }

    public void b(String str, boolean z7) {
        this.f17028b.putBoolean(str, z7);
        this.f17028b.commit();
    }

    public boolean a(String str, boolean z7) {
        return this.f17027a.getBoolean(str, z7);
    }
}
