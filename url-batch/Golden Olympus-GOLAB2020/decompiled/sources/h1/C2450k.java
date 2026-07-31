package h1;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.player.OrientationLockListener;

/* renamed from: h1.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2450k extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final OrientationLockListener f36749a;

    public C2450k(Handler handler, OrientationLockListener orientationLockListener) {
        super(handler);
        this.f36749a = orientationLockListener;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        OrientationLockListener orientationLockListener = this.f36749a;
        if (orientationLockListener != null) {
            orientationLockListener.nativeUpdateOrientationLockState(Settings.System.getInt(orientationLockListener.f22062b.getContentResolver(), "accelerometer_rotation", 0));
        }
    }
}
