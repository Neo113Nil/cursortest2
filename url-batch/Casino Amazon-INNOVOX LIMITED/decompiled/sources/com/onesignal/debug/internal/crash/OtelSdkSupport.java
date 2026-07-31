package com.onesignal.debug.internal.crash;

import android.os.Build;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;

/* compiled from: OtelSdkSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onesignal/debug/internal/crash/OtelSdkSupport;", "", "()V", "MIN_SDK_VERSION", "", "<set-?>", "", "isSupported", "()Z", "setSupported$com_onesignal_core", "(Z)V", "reset", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelSdkSupport {
    public static final OtelSdkSupport INSTANCE = new OtelSdkSupport();
    public static final int MIN_SDK_VERSION = 26;
    private static boolean isSupported;

    private OtelSdkSupport() {
    }

    static {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    public final boolean isSupported() {
        return isSupported;
    }

    public final void setSupported$com_onesignal_core(boolean z) {
        isSupported = z;
    }

    public final void reset() {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }
}
