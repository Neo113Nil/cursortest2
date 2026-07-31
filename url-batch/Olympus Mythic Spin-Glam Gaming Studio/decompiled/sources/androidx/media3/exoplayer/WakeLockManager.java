package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;

/* loaded from: classes13.dex */
final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private final Context applicationContext;
    private boolean enabled;
    private boolean stayAwake;

    @Nullable
    private PowerManager.WakeLock wakeLock;

    public WakeLockManager(Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    public void setEnabled(boolean z) {
        if (z && this.wakeLock == null) {
            PowerManager powerManager = (PowerManager) this.applicationContext.getSystemService("power");
            if (powerManager == null) {
                Log.w(TAG, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, WAKE_LOCK_TAG);
                this.wakeLock = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.enabled = z;
        updateWakeLock();
    }

    public void setStayAwake(boolean z) {
        this.stayAwake = z;
        updateWakeLock();
    }

    @SuppressLint({"WakelockTimeout"})
    private void updateWakeLock() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
