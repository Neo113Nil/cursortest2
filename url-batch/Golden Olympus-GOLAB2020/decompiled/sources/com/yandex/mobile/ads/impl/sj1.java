package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sj1 {
    @SuppressLint({"WrongConstant"})
    @NotNull
    public static Intent a(@NotNull Context context, @NotNull rj1 preferredPackage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredPackage, "preferredPackage");
        String e4 = preferredPackage.e();
        String d4 = preferredPackage.d();
        Map<String, Object> a4 = preferredPackage.a();
        Integer b4 = preferredPackage.b();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(e4));
        if (b4 == null || !(context instanceof Activity)) {
            intent.addFlags((b4 != null ? b4.intValue() : 0) | 1342177280);
        } else {
            intent.addFlags(b4.intValue());
        }
        intent.setPackage(d4);
        if (a4 != null) {
            for (Map.Entry<String, Object> entry : a4.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof v70) {
                    try {
                        Result.Companion companion = Result.Companion;
                        ((v70) value).getClass();
                        Result.m243constructorimpl(intent.putExtra(key, (Parcelable) null));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Result.m243constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        }
        return intent;
    }
}
