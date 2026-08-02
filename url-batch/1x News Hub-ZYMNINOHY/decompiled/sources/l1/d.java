package l1;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static volatile d f9940d;

    /* renamed from: a, reason: collision with root package name */
    public volatile Boolean f9941a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f9942b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9943c;

    public d(Context context) {
        this.f9943c = context;
        b();
    }

    public static d a(Context context) {
        if (f9940d == null) {
            synchronized (d.class) {
                try {
                    if (f9940d == null) {
                        f9940d = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9940d;
    }

    public final boolean b() {
        boolean z;
        if (this.f9941a != null) {
            return this.f9941a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f9941a != null) {
                    z = this.f9941a.booleanValue();
                } else {
                    z = this.f9943c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30;
                    this.f9941a = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
