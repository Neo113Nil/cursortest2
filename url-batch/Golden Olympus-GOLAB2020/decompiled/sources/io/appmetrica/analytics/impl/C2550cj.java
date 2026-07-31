package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2550cj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38785a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f38786b;

    public C2550cj(Context context, SafePackageManager safePackageManager) {
        this.f38785a = context;
        this.f38786b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f38786b;
        Context context = this.f38785a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), Base64Utils.IO_BUFFER_SIZE);
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
