package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u10 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f32762a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a30 f32763b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v10 f32764c;

    public /* synthetic */ u10(mp1 mp1Var) {
        this(mp1Var, new a30(), new v10());
    }

    @Nullable
    public final C1165z4 a(@NotNull JSONObject card, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(card, "card");
        try {
            a30 a30Var = this.f32763b;
            ParsingErrorLogger logger = ParsingErrorLogger.LOG;
            Intrinsics.checkNotNullExpressionValue(logger, "LOG");
            a30Var.getClass();
            Intrinsics.checkNotNullParameter(logger, "logger");
            DivParsingEnvironment environment = new DivParsingEnvironment(logger, null, 2, null);
            if (jSONObject != null) {
                environment.parseTemplates(jSONObject);
            }
            this.f32764c.getClass();
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(card, "card");
            return C1165z4.f8706j.a(environment, card);
        } catch (Throwable th) {
            this.f32762a.reportError("Failed to create DivData", th);
            return null;
        }
    }

    public u10(@NotNull mp1 reporter, @NotNull a30 divParsingEnvironmentFactory, @NotNull v10 divDataFactory) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divParsingEnvironmentFactory, "divParsingEnvironmentFactory");
        Intrinsics.checkNotNullParameter(divDataFactory, "divDataFactory");
        this.f32762a = reporter;
        this.f32763b = divParsingEnvironmentFactory;
        this.f32764c = divDataFactory;
    }
}
