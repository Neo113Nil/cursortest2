package com.startapp.sdk.internal;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class eg implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((PackageInfo) obj).firstInstallTime;
        long j2 = ((PackageInfo) obj2).firstInstallTime;
        if (j > j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
