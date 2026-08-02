package b0;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f5318c;

    /* renamed from: a, reason: collision with root package name */
    public final String f5319a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.h f5320b;

    static {
        new i("");
        f5318c = new i("preload");
    }

    public i(String str) {
        t1.h hVar;
        LogSessionId logSessionId;
        this.f5319a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new t1.h(25, false);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            hVar.f15398b = logSessionId;
        } else {
            hVar = null;
        }
        this.f5320b = hVar;
    }

    public final synchronized LogSessionId a() {
        t1.h hVar;
        hVar = this.f5320b;
        hVar.getClass();
        return (LogSessionId) hVar.f15398b;
    }
}
