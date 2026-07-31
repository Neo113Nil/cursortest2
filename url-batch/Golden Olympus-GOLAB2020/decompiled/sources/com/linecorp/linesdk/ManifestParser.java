package com.linecorp.linesdk;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.linecorp.linesdk.api.LineEnvConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ManifestParser {
    private final LineEnvConfig parseEnvConfig(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(className)");
            try {
                Object newInstance = cls.newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance, "clazz.newInstance()");
                if (newInstance instanceof LineEnvConfig) {
                    return (LineEnvConfig) newInstance;
                }
                throw new RuntimeException("Expected instanceof LineEnvConfig, but found: " + newInstance);
            } catch (ReflectiveOperationException e4) {
                throw new RuntimeException("Unable to instantiate LineEnvConfig implementation for " + cls, e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find LineEnvConfig implementation", e5);
        }
    }

    @Nullable
    public final LineEnvConfig parse(@NotNull Context context) {
        Object m243constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.Companion;
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
            m243constructorimpl = Result.m243constructorimpl((bundle == null || (string = bundle.getString("LineEnvConfig")) == null) ? null : parseEnvConfig(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (LineEnvConfig) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }
}
