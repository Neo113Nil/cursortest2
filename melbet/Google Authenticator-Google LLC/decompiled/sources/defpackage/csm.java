package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class csm implements hac {
    private final /* synthetic */ int a;

    public /* synthetic */ csm(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0096, code lost:
    
        if (r3.importance >= 400) goto L47;
     */
    @Override // defpackage.hac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bB() {
        switch (this.a) {
            case 0:
                int i = csn.a;
                return Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
            case 1:
                return Double.valueOf(jsu.a.bB().a());
            case 2:
                int i2 = dgj.a;
                return hkh.l("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable");
            case 3:
                int i3 = dhm.e;
                return hkh.l("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 8:
                return new csm(7);
            case 9:
            case 10:
            case 11:
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new een();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new eem();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return null;
            case 15:
                return dih.ah();
            case 16:
                return epx.a();
            case 17:
                hac hacVar = ClearcutMetricSnapshotTransmitter.a;
                return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
            case 18:
                return new lgd();
            case 19:
                AtomicReference atomicReference = etd.a;
                return hnu.aC(Executors.newSingleThreadScheduledExecutor(new dfq(3)));
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i4 = runningAppProcessInfo.importance;
                    break;
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                    break;
                }
        }
        r0 = false;
        return Boolean.valueOf(r0);
    }
}
