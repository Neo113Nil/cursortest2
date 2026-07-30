package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.permissions.g;
import com.onesignal.core.internal.permissions.h;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import u2.C0944a;
import v2.d;
import v2.f;

/* loaded from: classes.dex */
public final class a implements g {
    private final f _application;
    private final HashMap<String, com.onesignal.core.internal.permissions.f> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* renamed from: com.onesignal.core.internal.permissions.impl.a$a, reason: collision with other inner class name */
    public static final class C0023a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0023a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // v2.d
        public void onActivityAvailable(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(h.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(h.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(h.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(C0944a.onesignal_fade_in, C0944a.onesignal_fade_out);
        }

        @Override // v2.d
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public a(f _application) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        this._application = _application;
        this.callbackMap = new HashMap<>();
    }

    public final com.onesignal.core.internal.permissions.f getCallback(String permissionType) {
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        return this.callbackMap.get(permissionType);
    }

    public final boolean getFallbackToSettings() {
        return this.fallbackToSettings;
    }

    public final boolean getShouldShowRequestPermissionRationaleBeforeRequest() {
        return this.shouldShowRequestPermissionRationaleBeforeRequest;
    }

    public final boolean getWaiting() {
        return this.waiting;
    }

    @Override // com.onesignal.core.internal.permissions.g
    public void registerAsCallback(String permissionType, com.onesignal.core.internal.permissions.f callback) {
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbackMap.put(permissionType, callback);
    }

    public final void setFallbackToSettings(boolean z7) {
        this.fallbackToSettings = z7;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z7) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z7;
    }

    public final void setWaiting(boolean z7) {
        this.waiting = z7;
    }

    @Override // com.onesignal.core.internal.permissions.g
    public void startPrompt(boolean z7, String str, String str2, Class<?> callbackClass) {
        Intrinsics.checkNotNullParameter(callbackClass, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z7;
        this._application.addActivityLifecycleHandler(new C0023a(str, str2, callbackClass));
    }
}
