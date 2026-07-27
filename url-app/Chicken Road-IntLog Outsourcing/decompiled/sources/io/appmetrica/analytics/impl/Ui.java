package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7598a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f7599b;

    public Ui(Context context, SafePackageManager safePackageManager) {
        this.f7598a = context;
        this.f7599b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f7599b;
        Context context = this.f7598a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), Base64Utils.IO_BUFFER_SIZE);
        if (packageInfo == null) {
            return arrayList;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr == null || iArr.length <= i2 || (iArr[i2] & 2) == 0) {
                arrayList.add(new PermissionState(str, false));
            } else {
                arrayList.add(new PermissionState(str, true));
            }
        }
        return arrayList;
    }
}
