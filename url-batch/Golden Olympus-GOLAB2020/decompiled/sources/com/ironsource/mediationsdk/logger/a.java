package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes2.dex */
public class a extends IronSourceLogger {

    /* renamed from: c, reason: collision with root package name */
    public static final String f17654c = "console";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17655d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(" ");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Activity: ");
        sb3.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb3.append(" ");
        String sb4 = sb3.toString();
        if (i4 == 0) {
            Log.v(f17655d + ironSourceTag, sb2 + sb4 + str);
            return;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                Log.w(f17655d + ironSourceTag, str);
                return;
            }
            if (i4 == 3) {
                Log.e(f17655d + ironSourceTag, str);
                return;
            }
            if (i4 != 4) {
                return;
            }
        }
        Log.i(f17655d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + b9.i.f15552e, 3);
    }

    public a(int i4) {
        super("console", i4);
    }
}
