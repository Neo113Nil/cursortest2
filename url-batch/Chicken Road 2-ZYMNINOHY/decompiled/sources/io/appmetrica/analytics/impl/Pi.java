package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Pi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10824a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f10825b;

    public Pi(Context context, SafePackageManager safePackageManager) {
        this.f10824a = context;
        this.f10825b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f10825b;
        Context context = this.f10824a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo != null) {
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null) {
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    String str = strArr[i4];
                    if (iArr == null || iArr.length <= i4 || (iArr[i4] & 2) == 0) {
                        arrayList.add(new PermissionState(str, false));
                    } else {
                        arrayList.add(new PermissionState(str, true));
                    }
                }
            }
        }
        return arrayList;
    }
}
