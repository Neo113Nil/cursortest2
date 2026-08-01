package J0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static f f391b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f392a;

    public f() {
        this.f392a = new Object();
        new Handler(Looper.getMainLooper(), new e(this));
    }

    public f(Object obj) {
        this.f392a = obj;
    }
}
