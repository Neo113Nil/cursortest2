package com.startapp.sdk.internal;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class vg implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j4 = ((PackageInfo) obj).firstInstallTime;
        long j5 = ((PackageInfo) obj2).firstInstallTime;
        if (j4 > j5) {
            return -1;
        }
        return j4 == j5 ? 0 : 1;
    }
}
