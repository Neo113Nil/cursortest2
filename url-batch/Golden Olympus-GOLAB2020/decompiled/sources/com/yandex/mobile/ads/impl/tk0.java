package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface tk0 {

    public static final class a implements tk0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32471a;

        public a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f32471a = message;
        }

        @NotNull
        public final String a() {
            return this.f32471a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f32471a, ((a) obj).f32471a);
        }

        public final int hashCode() {
            return this.f32471a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(message=" + this.f32471a + ")";
        }
    }

    public static final class b implements tk0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f32472a = new b();

        private b() {
        }
    }

    public static final class c implements tk0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f32473a;

        public c(@NotNull Uri reportUri) {
            Intrinsics.checkNotNullParameter(reportUri, "reportUri");
            this.f32473a = reportUri;
        }

        @NotNull
        public final Uri a() {
            return this.f32473a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f32473a, ((c) obj).f32473a);
        }

        public final int hashCode() {
            return this.f32473a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(reportUri=" + this.f32473a + ")";
        }
    }
}
