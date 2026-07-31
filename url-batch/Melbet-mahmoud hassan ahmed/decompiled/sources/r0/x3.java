package r0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
final class x3 {

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager f21095a;

    /* renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f21096b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21097c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21098d;

    public x3(Context context) {
        this.f21095a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f21096b;
        if (wakeLock == null) {
            return;
        }
        if (this.f21097c && this.f21098d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z6) {
        if (z6 && this.f21096b == null) {
            PowerManager powerManager = this.f21095a;
            if (powerManager == null) {
                o2.r.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f21096b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f21097c = z6;
        c();
    }

    public void b(boolean z6) {
        this.f21098d = z6;
        c();
    }
}
