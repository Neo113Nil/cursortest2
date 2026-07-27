package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.R;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RequestPermissionService implements IRequestPermissionService {
    private final IApplicationService _application;
    private final HashMap<String, IRequestPermissionService.PermissionCallback> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    public RequestPermissionService(IApplicationService _application) {
        i.e(_application, "_application");
        this._application = _application;
        this.callbackMap = new HashMap<>();
    }

    public final IRequestPermissionService.PermissionCallback getCallback(String permissionType) {
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

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService
    public void registerAsCallback(String permissionType, IRequestPermissionService.PermissionCallback callback) {
        i.e(permissionType, "permissionType");
        i.e(callback, "callback");
        this.callbackMap.put(permissionType, callback);
    }

    public final void setFallbackToSettings(boolean z) {
        this.fallbackToSettings = z;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z;
    }

    public final void setWaiting(boolean z) {
        this.waiting = z;
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService
    public void startPrompt(boolean z, final String str, final String str2, final Class<?> callbackClass) {
        i.e(callbackClass, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z;
        this._application.addActivityLifecycleHandler(new IActivityLifecycleHandler() { // from class: com.onesignal.core.internal.permissions.impl.RequestPermissionService$startPrompt$1
            @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityAvailable(Activity activity) {
                IApplicationService iApplicationService;
                i.e(activity, "activity");
                if (activity.getClass().equals(PermissionsActivity.class)) {
                    iApplicationService = RequestPermissionService.this._application;
                    iApplicationService.removeActivityLifecycleHandler(this);
                    return;
                }
                Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
                intent.setFlags(131072);
                intent.putExtra(PermissionsViewModel.INTENT_EXTRA_PERMISSION_TYPE, str).putExtra(PermissionsViewModel.INTENT_EXTRA_ANDROID_PERMISSION_STRING, str2).putExtra(PermissionsViewModel.INTENT_EXTRA_CALLBACK_CLASS, callbackClass.getName());
                activity.startActivity(intent);
                activity.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
            }

            @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityStopped(Activity activity) {
                i.e(activity, "activity");
            }
        });
    }
}
