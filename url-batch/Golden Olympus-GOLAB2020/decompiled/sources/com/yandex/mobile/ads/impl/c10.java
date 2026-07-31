package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c10 {
    public static final void a(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z4 = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z4) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                Object[] args = new Object[0];
                int i4 = ap0.f23396b;
                Intrinsics.checkNotNullParameter(args, "args");
            }
        }
    }
}
