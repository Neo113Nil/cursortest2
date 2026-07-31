package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2308w1 f33963a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f33964b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2308w1 f33965a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private Map<String, String> f33966b;

        public a(@NotNull C2308w1 adBreak) {
            Intrinsics.checkNotNullParameter(adBreak, "adBreak");
            this.f33965a = adBreak;
            rd2.a(adBreak);
        }

        @NotNull
        public final C2308w1 a() {
            return this.f33965a;
        }

        @Nullable
        public final Map<String, String> b() {
            return this.f33966b;
        }

        @NotNull
        public final a c() {
            this.f33966b = null;
            return this;
        }
    }

    private w92(a aVar) {
        this.f33963a = aVar.a();
        this.f33964b = aVar.b();
    }

    @NotNull
    public final C2308w1 a() {
        return this.f33963a;
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f33964b;
    }

    public /* synthetic */ w92(a aVar, int i4) {
        this(aVar);
    }
}
