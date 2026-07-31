package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qx1 {
    public static SharedPreferences a(qx1 qx1Var, Context context, String prefName) {
        Object m243constructorimpl;
        qx1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefName, "prefName");
        try {
            Result.Companion companion = Result.Companion;
            Object systemService = context.getSystemService("user");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.UserManager");
            m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = bool;
        }
        if (((Boolean) m243constructorimpl).booleanValue()) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(prefName, 0);
            Intrinsics.checkNotNull(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.createDeviceProtectedStorageContext().getSharedPreferences(prefName, 0);
        Intrinsics.checkNotNull(sharedPreferences2);
        return sharedPreferences2;
    }
}
