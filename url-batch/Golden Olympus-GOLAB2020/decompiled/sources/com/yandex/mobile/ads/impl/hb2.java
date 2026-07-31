package com.yandex.mobile.ads.impl;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hb2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26699a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hb2(int i4, @NotNull String errorDescription) {
        this(errorDescription);
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
    }

    @NotNull
    public final String a() {
        return this.f26699a;
    }

    public static final class a {
        @NotNull
        public static hb2 a(@Nullable String str) {
            if (str == null) {
                str = "Ad request failed with network error";
            }
            return new hb2(2, str);
        }

        @NotNull
        public static hb2 b(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new hb2(1, description);
        }

        @NotNull
        public static hb2 a(@NotNull v40 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            return new hb2(3, message);
        }

        @NotNull
        public static hb2 b() {
            Intrinsics.checkNotNullParameter("Server temporarily unavailable. Please, try again later.", CrashHianalyticsData.MESSAGE);
            return new hb2(4, "Server temporarily unavailable. Please, try again later.");
        }

        @NotNull
        public static hb2 a() {
            return new hb2(1, "Internal error. Failed to parse response");
        }
    }

    private hb2(String str) {
        this.f26699a = str;
    }
}
