package r3;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f21284a = 4225;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f21285b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static h f21286c;

    public static int a() {
        return f21284a;
    }

    @RecentlyNonNull
    public static h b(@RecentlyNonNull Context context) {
        synchronized (f21285b) {
            if (f21286c == null) {
                f21286c = new d1(context.getApplicationContext());
            }
        }
        return f21286c;
    }

    public final void c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i7, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z6) {
        e(new z0(str, str2, i7, z6), serviceConnection, str3);
    }

    protected abstract boolean d(z0 z0Var, ServiceConnection serviceConnection, String str);

    protected abstract void e(z0 z0Var, ServiceConnection serviceConnection, String str);
}
