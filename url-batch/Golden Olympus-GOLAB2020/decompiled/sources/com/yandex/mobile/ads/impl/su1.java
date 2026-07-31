package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface su1 {

    public static final class a implements su1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final hi2 f31955a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final xq f31956b;

        public a(@NotNull hi2 error, @NotNull xq configurationSource) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(configurationSource, "configurationSource");
            this.f31955a = error;
            this.f31956b = configurationSource;
        }

        @NotNull
        public final xq a() {
            return this.f31956b;
        }

        @NotNull
        public final hi2 b() {
            return this.f31955a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f31955a, aVar.f31955a) && this.f31956b == aVar.f31956b;
        }

        public final int hashCode() {
            return this.f31956b.hashCode() + (this.f31955a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Failure(error=" + this.f31955a + ", configurationSource=" + this.f31956b + ")";
        }
    }

    public static final class b implements su1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final du1 f31957a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final xq f31958b;

        public b(@NotNull du1 sdkConfiguration, @NotNull xq configurationSource) {
            Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
            Intrinsics.checkNotNullParameter(configurationSource, "configurationSource");
            this.f31957a = sdkConfiguration;
            this.f31958b = configurationSource;
        }

        @NotNull
        public final xq a() {
            return this.f31958b;
        }

        @NotNull
        public final du1 b() {
            return this.f31957a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f31957a, bVar.f31957a) && this.f31958b == bVar.f31958b;
        }

        public final int hashCode() {
            return this.f31958b.hashCode() + (this.f31957a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Success(sdkConfiguration=" + this.f31957a + ", configurationSource=" + this.f31958b + ")";
        }
    }
}
