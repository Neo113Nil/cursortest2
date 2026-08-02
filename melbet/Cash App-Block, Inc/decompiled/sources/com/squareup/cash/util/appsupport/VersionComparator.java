package com.squareup.cash.util.appsupport;

import androidx.webkit.internal.AssetHelper;
import com.squareup.protos.cash.clients.Version;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class VersionComparator implements Comparator {
    public static int compare(Version version, Version version2) {
        version.getClass();
        version2.getClass();
        int compare = Intrinsics.compare(AssetHelper.access$orZero(version.major), AssetHelper.access$orZero(version2.major));
        if (compare < 0) {
            return -3;
        }
        if (compare > 0) {
            return 3;
        }
        int compare2 = Intrinsics.compare(AssetHelper.access$orZero(version.minor), AssetHelper.access$orZero(version2.minor));
        if (compare2 < 0) {
            return -2;
        }
        if (compare2 > 0) {
            return 2;
        }
        int compare3 = Intrinsics.compare(AssetHelper.access$orZero(version.patch), AssetHelper.access$orZero(version2.patch));
        if (compare3 < 0) {
            return -1;
        }
        return compare3 > 0 ? 1 : 0;
    }
}
