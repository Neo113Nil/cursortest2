package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class tk1 {

    public static final class a extends tk1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1866d3 f32474a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C1866d3 adRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f32474a = adRequestError;
        }

        @NotNull
        public final C1866d3 a() {
            return this.f32474a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f32474a, ((a) obj).f32474a);
        }

        public final int hashCode() {
            return this.f32474a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(adRequestError=" + this.f32474a + ")";
        }
    }

    public static final class b extends tk1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d90 f32475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull d90 feedItem) {
            super(0);
            Intrinsics.checkNotNullParameter(feedItem, "feedItem");
            this.f32475a = feedItem;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f32475a, ((b) obj).f32475a);
        }

        public final int hashCode() {
            return this.f32475a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(feedItem=" + this.f32475a + ")";
        }
    }

    private tk1() {
    }

    public /* synthetic */ tk1(int i4) {
        this();
    }
}
