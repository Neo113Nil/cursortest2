package D0;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: c, reason: collision with root package name */
    private static c f365c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f366d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f367a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f368b = new byte[0];

    private d(Context context) {
        this.f367a = context.getSharedPreferences("pps_install_referrer", 4);
    }

    public static c a(Context context) {
        return b(context);
    }

    private static c b(Context context) {
        c cVar;
        synchronized (f366d) {
            try {
                if (f365c == null) {
                    f365c = new d(context);
                }
                cVar = f365c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // D0.c
    public void a(boolean z4) {
        synchronized (this.f368b) {
            try {
                SharedPreferences sharedPreferences = this.f367a;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putBoolean("deeplink_isrequest", z4).apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D0.c
    public boolean a() {
        synchronized (this.f368b) {
            try {
                SharedPreferences sharedPreferences = this.f367a;
                if (sharedPreferences == null) {
                    return false;
                }
                return sharedPreferences.getBoolean("deeplink_isrequest", false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
