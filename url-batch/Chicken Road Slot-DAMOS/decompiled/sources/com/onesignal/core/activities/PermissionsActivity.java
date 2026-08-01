package com.onesignal.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import c4.m;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.e;
import qa.b;
import te.a1;
import v9.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class PermissionsActivity extends Activity {
    public static final a Companion = new a(null);
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private String permissionRequestType;
    private b preferenceService;
    private com.onesignal.core.internal.permissions.impl.a requestPermissionService;

    private final void finishActivity() {
        finish();
        overridePendingTransition(ca.a.onesignal_fade_in, ca.a.onesignal_fade_out);
    }

    private final void handleBundleParams(Bundle bundle) {
        reregisterCallbackHandlers(bundle);
        bundle.getClass();
        this.permissionRequestType = bundle.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = bundle.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        string.getClass();
        requestPermission(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestPermissionsResult$lambda$0(PermissionsActivity permissionsActivity, String[] strArr, int[] iArr) {
        permissionsActivity.getClass();
        strArr.getClass();
        iArr.getClass();
        com.onesignal.core.internal.permissions.impl.a aVar = permissionsActivity.requestPermissionService;
        aVar.getClass();
        String str = permissionsActivity.permissionRequestType;
        str.getClass();
        e callback = aVar.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.permissionRequestType);
        }
        if (strArr.length == 0) {
            callback.onReject(false);
            return;
        }
        String str2 = strArr[0];
        if (iArr.length <= 0 || iArr[0] != 0) {
            callback.onReject(permissionsActivity.shouldShowSettings(str2));
            return;
        }
        callback.onAccept();
        b bVar = permissionsActivity.preferenceService;
        bVar.getClass();
        bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str2, Boolean.TRUE);
    }

    private final void requestPermission(String str) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        aVar.getClass();
        if (aVar.getWaiting()) {
            return;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        aVar2.getClass();
        aVar2.setWaiting(true);
        com.onesignal.core.internal.permissions.impl.a aVar3 = this.requestPermissionService;
        aVar3.getClass();
        aVar3.setShouldShowRequestPermissionRationaleBeforeRequest(k7.e.S(this, str));
        String[] strArr = {str};
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(strArr[0])) {
            a1.e(v4.a.o(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            return;
        }
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[0], "android.permission.POST_NOTIFICATIONS")) {
            hashSet.add(0);
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[1 - size] : strArr;
        if (size > 0) {
            if (size == 1) {
                return;
            }
            if (!hashSet.contains(0)) {
                strArr2[0] = strArr[0];
            }
        }
        requestPermissions(strArr, 2);
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(v4.a.k("Could not find callback class for PermissionActivity: ", string));
        }
    }

    private final boolean shouldShowSettings(String str) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        aVar.getClass();
        if (!aVar.getFallbackToSettings()) {
            return false;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        aVar2.getClass();
        if (aVar2.getShouldShowRequestPermissionRationaleBeforeRequest() && !k7.e.S(this, str)) {
            b bVar = this.preferenceService;
            bVar.getClass();
            bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str, Boolean.TRUE);
            return false;
        }
        b bVar2 = this.preferenceService;
        bVar2.getClass();
        Boolean bool = bVar2.getBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str, Boolean.FALSE);
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!c.b(this)) {
            finishActivity();
        } else {
            if (getIntent().getExtras() == null) {
                finishActivity();
                return;
            }
            this.requestPermissionService = (com.onesignal.core.internal.permissions.impl.a) c.a().getService(com.onesignal.core.internal.permissions.impl.a.class);
            this.preferenceService = (b) c.a().getService(b.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        aVar.getClass();
        aVar.setWaiting(false);
        if (i3 == 2) {
            new Handler().postDelayed(new m(this, strArr, iArr, 6), 500L);
        }
        finishActivity();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
