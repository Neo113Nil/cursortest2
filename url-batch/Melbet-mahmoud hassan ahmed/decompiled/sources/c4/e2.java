package c4;

import android.util.Log;

/* loaded from: classes.dex */
public final class e2 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final int f1956f;

    public e2(int i7, String str) {
        super(str);
        this.f1956f = i7;
    }

    public e2(int i7, String str, Throwable th) {
        super(str, th);
        this.f1956f = i7;
    }

    public final k4.e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new k4.e(this.f1956f, getMessage());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }
}
