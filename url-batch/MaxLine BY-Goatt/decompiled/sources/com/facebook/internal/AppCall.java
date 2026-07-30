package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppCall {
    public static final Companion Companion = new Companion(null);
    private static AppCall currentPendingCall;
    private final UUID callId;
    private int requestCode;
    private Intent requestIntent;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AppCall(int i, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uuid);
        if ((i2 & 2) != 0) {
            uuid = UUID.randomUUID();
            uuid.getClass();
        }
    }

    public static final /* synthetic */ AppCall access$getCurrentPendingCall$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return null;
        }
        try {
            return currentPendingCall;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCurrentPendingCall$cp(AppCall appCall) {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return;
        }
        try {
            currentPendingCall = appCall;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
        }
    }

    public static final synchronized AppCall finishPendingCall(UUID uuid, int i) {
        synchronized (AppCall.class) {
            if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
                return null;
            }
            try {
                return Companion.finishPendingCall(uuid, i);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, AppCall.class);
                return null;
            }
        }
    }

    public final UUID getCallId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.callId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int getRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.requestCode;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final Intent getRequestIntent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.requestIntent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean setPending() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Companion.setCurrentPendingCall(this);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final void setRequestCode(int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.requestCode = i;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setRequestIntent(Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.requestIntent = intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean setCurrentPendingCall(AppCall appCall) {
            AppCall currentPendingCall;
            currentPendingCall = getCurrentPendingCall();
            AppCall.access$setCurrentPendingCall$cp(appCall);
            return currentPendingCall != null;
        }

        public final synchronized AppCall finishPendingCall(UUID uuid, int i) {
            uuid.getClass();
            AppCall currentPendingCall = getCurrentPendingCall();
            if (currentPendingCall != null && Intrinsics.b(currentPendingCall.getCallId(), uuid) && currentPendingCall.getRequestCode() == i) {
                setCurrentPendingCall(null);
                return currentPendingCall;
            }
            return null;
        }

        public final AppCall getCurrentPendingCall() {
            return AppCall.access$getCurrentPendingCall$cp();
        }

        private Companion() {
        }
    }

    public AppCall(int i, UUID uuid) {
        uuid.getClass();
        this.requestCode = i;
        this.callId = uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppCall(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }
}
