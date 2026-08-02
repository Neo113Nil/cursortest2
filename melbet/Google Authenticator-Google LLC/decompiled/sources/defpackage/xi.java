package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.view.GestureDetector;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class xi {
    public final Object a;

    public xi(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    public final boolean a() {
        FingerprintManager d = oy.d((Context) this.a);
        return d != null && d.hasEnrolledFingerprints();
    }

    public final boolean b() {
        FingerprintManager d = oy.d((Context) this.a);
        return d != null && d.isHardwareDetected();
    }

    public xi(Context context) {
        this.a = context;
    }
}
