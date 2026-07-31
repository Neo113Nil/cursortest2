package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface o4 {

    public static final class a implements o4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f44721a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<wj> f44722b;

        public a(@NotNull ArrayList all, @NotNull List selectedCoupons) {
            Intrinsics.checkNotNullParameter(all, "all");
            Intrinsics.checkNotNullParameter(selectedCoupons, "selectedCoupons");
            this.f44721a = all;
            this.f44722b = selectedCoupons;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44721a, aVar.f44721a) && Intrinsics.areEqual(this.f44722b, aVar.f44722b);
        }

        public final int hashCode() {
            return this.f44722b.hashCode() + (this.f44721a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CancellationAvailable(all=" + this.f44721a + ", selectedCoupons=" + this.f44722b + ')';
        }
    }

    public static final class b implements o4 {
    }

    public static final class c implements o4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f44723a;

        public c(@NotNull ArrayList all) {
            Intrinsics.checkNotNullParameter(all, "all");
            this.f44723a = all;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f44723a, ((c) obj).f44723a);
        }

        public final int hashCode() {
            return this.f44723a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SelectionAvailable(all=" + this.f44723a + ')';
        }
    }

    public static final class d implements o4 {
    }
}
