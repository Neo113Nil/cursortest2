package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface gv1 {

    public static final class a implements gv1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1866d3 f26302a;

        public a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f26302a = error;
        }

        @NotNull
        public final C1866d3 a() {
            return this.f26302a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f26302a, ((a) obj).f26302a);
        }

        public final int hashCode() {
            return this.f26302a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(error=" + this.f26302a + ")";
        }
    }

    public static final class b implements gv1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1803ac f26303a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final d50 f26304b;

        public b(@NotNull C1803ac advertisingConfiguration, @NotNull d50 environmentConfiguration) {
            Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
            Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
            this.f26303a = advertisingConfiguration;
            this.f26304b = environmentConfiguration;
        }

        @NotNull
        public final C1803ac a() {
            return this.f26303a;
        }

        @NotNull
        public final d50 b() {
            return this.f26304b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f26303a, bVar.f26303a) && Intrinsics.areEqual(this.f26304b, bVar.f26304b);
        }

        public final int hashCode() {
            return this.f26304b.hashCode() + (this.f26303a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Success(advertisingConfiguration=" + this.f26303a + ", environmentConfiguration=" + this.f26304b + ")";
        }
    }
}
