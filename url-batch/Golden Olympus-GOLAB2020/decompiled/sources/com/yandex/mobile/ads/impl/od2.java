package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class od2 {

    public static final class a extends od2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final hb2 f29998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull hb2 error) {
            super(0);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f29998a = error;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f29998a, ((a) obj).f29998a);
        }

        public final int hashCode() {
            return this.f29998a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(error=" + this.f29998a + ")";
        }
    }

    public static final class b extends od2 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<bb2> f29999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull List<bb2> result) {
            super(0);
            Intrinsics.checkNotNullParameter(result, "result");
            this.f29999a = result;
        }

        @NotNull
        public final List<bb2> a() {
            return this.f29999a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f29999a, ((b) obj).f29999a);
        }

        public final int hashCode() {
            return this.f29999a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(result=" + this.f29999a + ")";
        }
    }

    private od2() {
    }

    public /* synthetic */ od2(int i4) {
        this();
    }
}
