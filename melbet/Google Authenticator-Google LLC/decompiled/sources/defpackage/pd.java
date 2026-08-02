package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pd {
    public CharSequence a = null;
    public CharSequence b = null;
    public CharSequence c = null;
    private boolean d = true;
    private int e = 0;

    public final pe a() {
        if (TextUtils.isEmpty(this.a)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        int i = this.e;
        if (pj.e(i)) {
            return new pe(this.a, this.b, this.c, this.d, i);
        }
        StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(": ");
        int i2 = this.e;
        int i3 = (-65537) & i2;
        sb.append(i3 != 15 ? i3 != 255 ? i3 != 32768 ? i3 != 32783 ? i3 != 33023 ? String.valueOf(i2) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b() {
        this.e = 33023;
    }

    public final void c() {
        this.d = false;
    }
}
