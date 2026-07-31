package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface h4 {

    public static final class a implements h4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f44213a = new a();
    }

    public static final class b implements h4 {

        /* renamed from: a, reason: collision with root package name */
        public final int f44214a;

        public b(int i4) {
            this.f44214a = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f44214a == ((b) obj).f44214a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f44214a);
        }

        @NotNull
        public final String toString() {
            return "NotSelected(couponsCount=" + this.f44214a + ')';
        }
    }

    public static final class c implements h4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final b3 f44215a;

        public c(@NotNull b3 coupon) {
            Intrinsics.checkNotNullParameter(coupon, "coupon");
            this.f44215a = coupon;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f44215a, ((c) obj).f44215a);
        }

        public final int hashCode() {
            return this.f44215a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Progress(coupon=" + this.f44215a + ')';
        }
    }

    public static final class d implements h4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final b3 f44216a;

        public d(@NotNull b3 coupon) {
            Intrinsics.checkNotNullParameter(coupon, "coupon");
            this.f44216a = coupon;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f44216a, ((d) obj).f44216a);
        }

        public final int hashCode() {
            return this.f44216a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Selected(coupon=" + this.f44216a + ')';
        }
    }
}
