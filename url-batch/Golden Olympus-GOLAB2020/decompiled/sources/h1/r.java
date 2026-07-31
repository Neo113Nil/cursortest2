package h1;

import android.app.Activity;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.unity3d.player.UnityPlayer;
import java.lang.Thread;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public volatile Thread.UncaughtExceptionHandler f36755a;

    /* renamed from: b, reason: collision with root package name */
    public String f36756b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("FATAL EXCEPTION [" + thread.getName() + "]\n");
            sb.append("Unity version     : 6000.3.14f1\n");
            sb.append("Device model      : " + Build.MANUFACTURER + " " + Build.MODEL + "\n");
            String str2 = Build.FINGERPRINT;
            StringBuilder sb2 = new StringBuilder("Device fingerprint: ");
            sb2.append(str2);
            sb2.append("\n");
            sb.append(sb2.toString());
            sb.append("CPU supported ABI : " + Arrays.toString(Build.SUPPORTED_ABIS) + "\n");
            sb.append("Build Type        : Release\nScripting Backend : IL2CPP\n");
            sb.append("Libs loaded from  : " + this.f36756b + "\n");
            try {
                Activity activity = UnityPlayer.currentActivity;
                str = String.valueOf(activity.getPackageManager().getApplicationInfo(activity.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.getBoolean("unity.strip-engine-code"));
            } catch (Exception unused) {
                str = "Undefined";
            }
            sb.append("Strip Engine Code : " + str + "\n");
            Error error = new Error(sb.toString());
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.f36755a.uncaughtException(thread, error);
        } catch (Throwable unused2) {
            this.f36755a.uncaughtException(thread, th);
        }
    }
}
