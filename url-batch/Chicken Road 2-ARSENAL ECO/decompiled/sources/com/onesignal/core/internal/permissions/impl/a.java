package com.onesignal.core.internal.permissions.impl;

import T1.d;
import T1.f;
import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.permissions.g;
import com.onesignal.core.internal.permissions.h;
import java.util.HashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements g {
    private final f _application;
    private final HashMap<String, com.onesignal.core.internal.permissions.f> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* renamed from: com.onesignal.core.internal.permissions.impl.a$a, reason: collision with other inner class name */
    public static final class C0024a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0024a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // T1.d
        public void onActivityAvailable(Activity activity) {
            i.e(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(h.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(h.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(h.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(S1.a.onesignal_fade_in, S1.a.onesignal_fade_out);
        }

        @Override // T1.d
        public void onActivityStopped(Activity activity) {
            i.e(activity, "activity");
        }
    }

    public a(f _application) {
        i.e(_application, "_application");
        this._application = _application;
        this.callbackMap = new HashMap<>();
    }

    public final com.onesignal.core.internal.permissions.f getCallback(String permissionType) {
        i.e(permissionType, "permissionType");
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
        i.e(permissionType, "permissionType");
        i.e(callback, "callback");
        this.callbackMap.put(permissionType, callback);
    }

    public final void setFallbackToSettings(boolean z5) {
        this.fallbackToSettings = z5;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z5) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z5;
    }

    public final void setWaiting(boolean z5) {
        this.waiting = z5;
    }

    @Override // com.onesignal.core.internal.permissions.g
    public void startPrompt(boolean z5, String str, String str2, Class<?> callbackClass) {
        i.e(callbackClass, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z5;
        this._application.addActivityLifecycleHandler(new C0024a(str, str2, callbackClass));
    }
}
