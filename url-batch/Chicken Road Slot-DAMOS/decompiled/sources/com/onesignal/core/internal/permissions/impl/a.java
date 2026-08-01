package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import ea.d;
import java.util.HashMap;
import pa.e;
import pa.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements f {
    private final ea.f _application;
    private final HashMap<String, e> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.permissions.impl.a$a, reason: collision with other inner class name */
    public static final class C0020a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0020a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // ea.d
        public void onActivityAvailable(Activity activity) {
            activity.getClass();
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(ca.a.onesignal_fade_in, ca.a.onesignal_fade_out);
        }

        @Override // ea.d
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public a(ea.f fVar) {
        fVar.getClass();
        this._application = fVar;
        this.callbackMap = new HashMap<>();
    }

    public final e getCallback(String str) {
        str.getClass();
        return this.callbackMap.get(str);
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

    @Override // pa.f
    public void registerAsCallback(String str, e eVar) {
        str.getClass();
        eVar.getClass();
        this.callbackMap.put(str, eVar);
    }

    public final void setFallbackToSettings(boolean z10) {
        this.fallbackToSettings = z10;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z10) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z10;
    }

    public final void setWaiting(boolean z10) {
        this.waiting = z10;
    }

    @Override // pa.f
    public void startPrompt(boolean z10, String str, String str2, Class<?> cls) {
        cls.getClass();
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z10;
        this._application.addActivityLifecycleHandler(new C0020a(str, str2, cls));
    }
}
