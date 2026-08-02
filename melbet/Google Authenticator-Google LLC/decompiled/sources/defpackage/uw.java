package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uw {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(int i) {
        e().post(new vz(this, i, 1));
    }

    public final void d(Typeface typeface) {
        e().post(new at(this, typeface, 15));
    }
}
