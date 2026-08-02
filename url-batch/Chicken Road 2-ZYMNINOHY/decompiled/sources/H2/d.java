package H2;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static volatile d f1097d;

    /* renamed from: a, reason: collision with root package name */
    public volatile Boolean f1098a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f1099b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1100c;

    public d(Context context) {
        this.f1100c = context;
        b();
    }

    public static d a(Context context) {
        if (f1097d == null) {
            synchronized (d.class) {
                try {
                    if (f1097d == null) {
                        f1097d = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1097d;
    }

    public final boolean b() {
        boolean z;
        if (this.f1098a != null) {
            return this.f1098a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f1098a != null) {
                    z = this.f1098a.booleanValue();
                } else {
                    z = this.f1100c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30;
                    this.f1098a = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
