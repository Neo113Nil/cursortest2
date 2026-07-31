package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class xp {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20334b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f20335c = "enabled";

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f20336a;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xp(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f20336a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f20336a;
    }
}
