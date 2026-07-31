package com.yandex.mobile.ads.impl;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* loaded from: classes3.dex */
final class z30 {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
