package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    private final int f16622a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16623b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16624c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16625d;

    public hm(@NotNull JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f16622a = applicationLogger.optInt(im.f16720a, 3);
        this.f16623b = applicationLogger.optInt(im.f16721b, 3);
        this.f16624c = applicationLogger.optInt("console", 3);
        this.f16625d = applicationLogger.optBoolean(im.f16723d, false);
    }

    public final int a() {
        return this.f16624c;
    }

    public final int b() {
        return this.f16623b;
    }

    public final int c() {
        return this.f16622a;
    }

    public final boolean d() {
        return this.f16625d;
    }
}
