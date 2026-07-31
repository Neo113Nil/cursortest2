package o3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import r3.f1;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19857a = j.f19861a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f19858b = new f();

    f() {
    }

    @RecentlyNonNull
    public static f f() {
        return f19858b;
    }

    public int a(@RecentlyNonNull Context context) {
        return j.a(context);
    }

    @RecentlyNullable
    public Intent b(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            return f1.a("com.google.android.gms");
        }
        if (context != null && v3.h.g(context)) {
            return f1.c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f19857a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(w3.c.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return f1.b("com.google.android.gms", sb.toString());
    }

    @RecentlyNullable
    public PendingIntent c(@RecentlyNonNull Context context, int i7, int i8) {
        return d(context, i7, i8, null);
    }

    @RecentlyNullable
    public PendingIntent d(@RecentlyNonNull Context context, int i7, int i8, String str) {
        Intent b7 = b(context, i7, str);
        if (b7 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i8, b7, 134217728);
    }

    public String e(int i7) {
        return j.b(i7);
    }

    public int g(@RecentlyNonNull Context context) {
        return h(context, f19857a);
    }

    public int h(@RecentlyNonNull Context context, int i7) {
        int e7 = j.e(context, i7);
        if (j.f(context, e7)) {
            return 18;
        }
        return e7;
    }

    public boolean i(int i7) {
        return j.h(i7);
    }
}
