package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface re {

    @Metadata
    public static final class a implements re {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final te f18909a;

        public a(@NotNull te strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.f18909a = strategy;
        }

        @Override // com.ironsource.re
        @NotNull
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.re
        @NotNull
        public te b() {
            return this.f18909a;
        }

        @NotNull
        public final te c() {
            return this.f18909a;
        }
    }

    @NotNull
    String a();

    @NotNull
    te b();
}
