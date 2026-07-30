package com.blankj.utilcode.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.UtilsTransActivity;
import com.blankj.utilcode.util.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class PermissionUtils {
    private static PermissionUtils sInstance;
    private static e sSimpleCallback4DrawOverlays;
    private static e sSimpleCallback4WriteSettings;
    private b mFullCallback;
    private c mOnExplainListener;
    private d mOnRationaleListener;
    private Set<String> mPermissions;
    private List<String> mPermissionsDenied;
    private List<String> mPermissionsDeniedForever;
    private List<String> mPermissionsGranted;
    private String[] mPermissionsParam;
    private List<String> mPermissionsRequest;
    private e mSimpleCallback;
    private f mSingleCallback;
    private g mThemeCallback;

    @RequiresApi(api = 23)
    static final class PermissionActivityImpl extends UtilsTransActivity.TransActivityDelegate {
        private static PermissionActivityImpl INSTANCE = new PermissionActivityImpl();
        private static final String TYPE = "TYPE";
        private static final int TYPE_DRAW_OVERLAYS = 3;
        private static final int TYPE_RUNTIME = 1;
        private static final int TYPE_WRITE_SETTINGS = 2;
        private static int currentRequestCode = -1;

        static class a implements z0.b {
            final /* synthetic */ int val$type;

            a(int i8) {
                this.val$type = i8;
            }

            @Override // com.blankj.utilcode.util.z0.b
            public void accept(Intent intent) {
                intent.putExtra(PermissionActivityImpl.TYPE, this.val$type);
            }
        }

        class b implements Runnable {
            final /* synthetic */ UtilsTransActivity val$activity;

            b(UtilsTransActivity utilsTransActivity) {
                this.val$activity = utilsTransActivity;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.val$activity.requestPermissions((String[]) PermissionUtils.sInstance.mPermissionsRequest.toArray(new String[0]), 1);
            }
        }

        PermissionActivityImpl() {
        }

        private void checkRequestCallback(int i8) {
            if (i8 == 2) {
                PermissionUtils.access$1200();
            } else if (i8 == 3) {
                PermissionUtils.access$1300();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestPermissions(UtilsTransActivity utilsTransActivity) {
            if (PermissionUtils.sInstance.shouldRationale(utilsTransActivity, new b(utilsTransActivity))) {
                return;
            }
            utilsTransActivity.requestPermissions((String[]) PermissionUtils.sInstance.mPermissionsRequest.toArray(new String[0]), 1);
        }

        public static void start(int i8) {
            UtilsTransActivity.start(new a(i8), INSTANCE);
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public boolean dispatchTouchEvent(@NonNull UtilsTransActivity utilsTransActivity, MotionEvent motionEvent) {
            utilsTransActivity.finish();
            return true;
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void onActivityResult(@NonNull UtilsTransActivity utilsTransActivity, int i8, int i9, Intent intent) {
            utilsTransActivity.finish();
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void onCreated(@NonNull UtilsTransActivity utilsTransActivity, @Nullable Bundle bundle) {
            utilsTransActivity.getWindow().addFlags(262160);
            int intExtra = utilsTransActivity.getIntent().getIntExtra(TYPE, -1);
            if (intExtra != 1) {
                if (intExtra == 2) {
                    currentRequestCode = 2;
                    PermissionUtils.startWriteSettingsActivity(utilsTransActivity, 2);
                    return;
                } else if (intExtra == 3) {
                    currentRequestCode = 3;
                    PermissionUtils.startOverlayPermissionActivity(utilsTransActivity, 3);
                    return;
                } else {
                    utilsTransActivity.finish();
                    Log.e("PermissionUtils", "type is wrong.");
                    return;
                }
            }
            if (PermissionUtils.sInstance == null) {
                Log.e("PermissionUtils", "sInstance is null.");
                utilsTransActivity.finish();
                return;
            }
            if (PermissionUtils.sInstance.mPermissionsRequest == null) {
                Log.e("PermissionUtils", "mPermissionsRequest is null.");
                utilsTransActivity.finish();
            } else if (PermissionUtils.sInstance.mPermissionsRequest.size() <= 0) {
                Log.e("PermissionUtils", "mPermissionsRequest's size is no more than 0.");
                utilsTransActivity.finish();
            } else {
                PermissionUtils.access$500(PermissionUtils.sInstance);
                PermissionUtils.access$600(PermissionUtils.sInstance);
                requestPermissions(utilsTransActivity);
            }
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void onDestroy(@NonNull UtilsTransActivity utilsTransActivity) {
            int i8 = currentRequestCode;
            if (i8 != -1) {
                checkRequestCallback(i8);
                currentRequestCode = -1;
            }
            super.onDestroy(utilsTransActivity);
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void onRequestPermissionsResult(@NonNull UtilsTransActivity utilsTransActivity, int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
            utilsTransActivity.finish();
            if (PermissionUtils.sInstance == null || PermissionUtils.sInstance.mPermissionsRequest == null) {
                return;
            }
            PermissionUtils.sInstance.onRequestPermissionsResult(utilsTransActivity);
        }
    }

    class a implements d.a {
        final /* synthetic */ UtilsTransActivity val$activity;
        final /* synthetic */ Runnable val$againRunnable;

        a(Runnable runnable, UtilsTransActivity utilsTransActivity) {
            this.val$againRunnable = runnable;
            this.val$activity = utilsTransActivity;
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.d.a
        public void again(boolean z7) {
            if (!z7) {
                this.val$activity.finish();
                PermissionUtils.this.requestCallback();
                return;
            }
            PermissionUtils.this.mPermissionsDenied = new ArrayList();
            PermissionUtils.this.mPermissionsDeniedForever = new ArrayList();
            this.val$againRunnable.run();
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {

        public interface a {
            void again(boolean z7);
        }
    }

    public interface e {
        void a();
    }

    public interface f {
    }

    public interface g {
    }

    private PermissionUtils(String... strArr) {
        this.mPermissionsParam = strArr;
        sInstance = this;
    }

    static /* synthetic */ e access$1200() {
        return null;
    }

    static /* synthetic */ e access$1202(e eVar) {
        return eVar;
    }

    static /* synthetic */ e access$1300() {
        return null;
    }

    static /* synthetic */ e access$1302(e eVar) {
        return eVar;
    }

    static /* synthetic */ g access$500(PermissionUtils permissionUtils) {
        permissionUtils.getClass();
        return null;
    }

    static /* synthetic */ c access$600(PermissionUtils permissionUtils) {
        permissionUtils.getClass();
        return null;
    }

    static /* synthetic */ c access$602(PermissionUtils permissionUtils, c cVar) {
        permissionUtils.getClass();
        return cVar;
    }

    public static List<String> getPermissions() {
        return getPermissions(z0.getApp().getPackageName());
    }

    private void getPermissionsStatus(Activity activity) {
        boolean shouldShowRequestPermissionRationale;
        for (String str : this.mPermissionsRequest) {
            if (isGranted(str)) {
                this.mPermissionsGranted.add(str);
            } else {
                this.mPermissionsDenied.add(str);
                shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                if (!shouldShowRequestPermissionRationale) {
                    this.mPermissionsDeniedForever.add(str);
                }
            }
        }
    }

    private static Pair<List<String>, List<String>> getRequestAndDeniedPermissions(String... strArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> permissions2 = getPermissions();
        for (String str : strArr) {
            boolean z7 = false;
            for (String str2 : g0.a.getPermissions(str)) {
                if (permissions2.contains(str2)) {
                    arrayList.add(str2);
                    z7 = true;
                }
            }
            if (!z7) {
                arrayList2.add(str);
                Log.e("PermissionUtils", "U should add the permission of " + str + " in manifest.");
            }
        }
        return Pair.create(arrayList, arrayList2);
    }

    public static boolean isGranted(String... strArr) {
        Pair<List<String>, List<String>> requestAndDeniedPermissions = getRequestAndDeniedPermissions(strArr);
        if (!((List) requestAndDeniedPermissions.second).isEmpty()) {
            return false;
        }
        Iterator it = ((List) requestAndDeniedPermissions.first).iterator();
        while (it.hasNext()) {
            if (!isGranted((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    @RequiresApi(api = 23)
    public static boolean isGrantedDrawOverlays() {
        boolean canDrawOverlays;
        canDrawOverlays = Settings.canDrawOverlays(z0.getApp());
        return canDrawOverlays;
    }

    @RequiresApi(api = 23)
    public static boolean isGrantedWriteSettings() {
        boolean canWrite;
        canWrite = Settings.System.canWrite(z0.getApp());
        return canWrite;
    }

    public static void launchAppDetailsSettings() {
        Intent launchAppDetailsSettingsIntent = c1.getLaunchAppDetailsSettingsIntent(z0.getApp().getPackageName(), true);
        if (c1.isIntentAvailable(launchAppDetailsSettingsIntent)) {
            z0.getApp().startActivity(launchAppDetailsSettingsIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequestPermissionsResult(Activity activity) {
        getPermissionsStatus(activity);
        requestCallback();
    }

    public static PermissionUtils permission(String... strArr) {
        return new PermissionUtils(strArr);
    }

    public static PermissionUtils permissionGroup(String... strArr) {
        return permission(strArr);
    }

    private void rationalInner(UtilsTransActivity utilsTransActivity, Runnable runnable) {
        getPermissionsStatus(utilsTransActivity);
        new a(runnable, utilsTransActivity);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestCallback() {
    }

    @RequiresApi(api = 23)
    public static void requestDrawOverlays(e eVar) {
        if (!isGrantedDrawOverlays()) {
            PermissionActivityImpl.start(3);
        } else if (eVar != null) {
            eVar.a();
        }
    }

    @RequiresApi(api = 23)
    public static void requestWriteSettings(e eVar) {
        if (!isGrantedWriteSettings()) {
            PermissionActivityImpl.start(2);
        } else if (eVar != null) {
            eVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    public boolean shouldRationale(UtilsTransActivity utilsTransActivity, Runnable runnable) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public static void startOverlayPermissionActivity(Activity activity, int i8) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + z0.getApp().getPackageName()));
        if (c1.isIntentAvailable(intent)) {
            activity.startActivityForResult(intent, i8);
        } else {
            launchAppDetailsSettings();
        }
    }

    @RequiresApi(api = 23)
    private void startPermissionActivity() {
        PermissionActivityImpl.start(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public static void startWriteSettingsActivity(Activity activity, int i8) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + z0.getApp().getPackageName()));
        if (c1.isIntentAvailable(intent)) {
            activity.startActivityForResult(intent, i8);
        } else {
            launchAppDetailsSettings();
        }
    }

    public PermissionUtils callback(b bVar) {
        return this;
    }

    public PermissionUtils explain(c cVar) {
        return this;
    }

    public PermissionUtils rationale(d dVar) {
        return this;
    }

    public void request() {
        String[] strArr = this.mPermissionsParam;
        if (strArr == null || strArr.length <= 0) {
            Log.w("PermissionUtils", "No permissions to request.");
            return;
        }
        this.mPermissions = new LinkedHashSet();
        this.mPermissionsRequest = new ArrayList();
        this.mPermissionsGranted = new ArrayList();
        this.mPermissionsDenied = new ArrayList();
        this.mPermissionsDeniedForever = new ArrayList();
        Pair<List<String>, List<String>> requestAndDeniedPermissions = getRequestAndDeniedPermissions(this.mPermissionsParam);
        this.mPermissions.addAll((Collection) requestAndDeniedPermissions.first);
        this.mPermissionsDenied.addAll((Collection) requestAndDeniedPermissions.second);
        if (Build.VERSION.SDK_INT < 23) {
            this.mPermissionsGranted.addAll(this.mPermissions);
            requestCallback();
            return;
        }
        for (String str : this.mPermissions) {
            if (isGranted(str)) {
                this.mPermissionsGranted.add(str);
            } else {
                this.mPermissionsRequest.add(str);
            }
        }
        if (this.mPermissionsRequest.isEmpty()) {
            requestCallback();
        } else {
            startPermissionActivity();
        }
    }

    public PermissionUtils theme(g gVar) {
        return this;
    }

    public static List<String> getPermissions(String str) {
        try {
            String[] strArr = z0.getApp().getPackageManager().getPackageInfo(str, 4096).requestedPermissions;
            return strArr == null ? Collections.emptyList() : Arrays.asList(strArr);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return Collections.emptyList();
        }
    }

    public PermissionUtils callback(e eVar) {
        return this;
    }

    public PermissionUtils callback(f fVar) {
        return this;
    }

    private static boolean isGranted(String str) {
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(z0.getApp(), str) == 0;
    }
}
