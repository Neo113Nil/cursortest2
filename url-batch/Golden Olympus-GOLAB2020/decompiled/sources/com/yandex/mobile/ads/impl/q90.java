package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class q90 {

    public static final class a extends q90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1866d3 f30712a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C1866d3 adRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f30712a = adRequestError;
        }

        @NotNull
        public final C1866d3 a() {
            return this.f30712a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f30712a, ((a) obj).f30712a);
        }

        public final int hashCode() {
            return this.f30712a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(adRequestError=" + this.f30712a + ")";
        }
    }

    public static final class b extends q90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final or0 f30713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull or0 feedItem) {
            super(0);
            Intrinsics.checkNotNullParameter(feedItem, "feedItem");
            this.f30713a = feedItem;
        }

        @NotNull
        public final or0 a() {
            return this.f30713a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f30713a, ((b) obj).f30713a);
        }

        public final int hashCode() {
            return this.f30713a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(feedItem=" + this.f30713a + ")";
        }
    }

    private q90() {
    }

    public /* synthetic */ q90(int i4) {
        this();
    }
}
