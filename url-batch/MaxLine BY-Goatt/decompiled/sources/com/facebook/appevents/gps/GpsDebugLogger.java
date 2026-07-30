package com.facebook.appevents.gps;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import defpackage.c62;
import defpackage.up2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GpsDebugLogger {
    public static final Companion Companion = new Companion(null);
    private static final String GPS_PREFIX = "gps";
    private static final double LOGGING_SAMPLING_RATE = 1.0E-4d;
    private static final boolean shouldLog;
    private final InternalAppEventsLogger internalAppEventsLogger;

    static {
        c62.m.getClass();
        shouldLog = c62.n.b() <= LOGGING_SAMPLING_RATE;
    }

    public GpsDebugLogger(Context context) {
        context.getClass();
        this.internalAppEventsLogger = new InternalAppEventsLogger(context);
    }

    private final boolean isGPSDebugEvent(String str) {
        if (str != null) {
            return up2.q(str, GPS_PREFIX);
        }
        return false;
    }

    public final void log(String str, Bundle bundle) {
        if (shouldLog && isGPSDebugEvent(str)) {
            this.internalAppEventsLogger.logEventImplicitly(str, bundle);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
