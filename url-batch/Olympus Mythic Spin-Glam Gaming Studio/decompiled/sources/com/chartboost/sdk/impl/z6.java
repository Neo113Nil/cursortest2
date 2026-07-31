package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class z6 {
    public static final File a(y6 y6Var, File file) {
        Intrinsics.checkNotNullParameter(y6Var, "<this>");
        return new File(file, y6Var.b());
    }

    public static final y6 a(Download download) {
        Intrinsics.checkNotNullParameter(download, "<this>");
        return new y6(download);
    }

    public static final String a(int i) {
        if (i == 0) {
            return "STATE_QUEUED";
        }
        if (i == 1) {
            return "STATE_STOPPED";
        }
        if (i == 2) {
            return "STATE_DOWNLOADING";
        }
        if (i == 3) {
            return "STATE_COMPLETED";
        }
        if (i == 4) {
            return "STATE_FAILED";
        }
        if (i == 5) {
            return "STATE_REMOVING";
        }
        if (i != 7) {
            return "UNKNOWN STATE " + i;
        }
        return "STATE_RESTARTING";
    }
}
