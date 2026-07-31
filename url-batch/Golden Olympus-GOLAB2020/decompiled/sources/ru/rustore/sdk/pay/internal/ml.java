package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ml {

    public static final class a implements ml {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44651a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final gl f44652b;

        public a(@NotNull String price, @NotNull gl interval) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.f44651a = price;
            this.f44652b = interval;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44651a, aVar.f44651a) && Intrinsics.areEqual(this.f44652b, aVar.f44652b);
        }

        public final int hashCode() {
            return this.f44652b.hashCode() + (this.f44651a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Promo(price=" + this.f44651a + ", interval=" + this.f44652b + ')';
        }
    }

    public static final class b implements ml {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44653a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final gl f44654b;

        public b(@NotNull String price, @NotNull gl interval) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.f44653a = price;
            this.f44654b = interval;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44653a, bVar.f44653a) && Intrinsics.areEqual(this.f44654b, bVar.f44654b);
        }

        public final int hashCode() {
            return this.f44654b.hashCode() + (this.f44653a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Standard(price=" + this.f44653a + ", interval=" + this.f44654b + ')';
        }
    }

    public static final class c implements ml {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44655a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final gl f44656b;

        public c(@NotNull String price, @NotNull gl interval) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.f44655a = price;
            this.f44656b = interval;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f44655a, cVar.f44655a) && Intrinsics.areEqual(this.f44656b, cVar.f44656b);
        }

        public final int hashCode() {
            return this.f44656b.hashCode() + (this.f44655a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Start(price=" + this.f44655a + ", interval=" + this.f44656b + ')';
        }
    }
}
