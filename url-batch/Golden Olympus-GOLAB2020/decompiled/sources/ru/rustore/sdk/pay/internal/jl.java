package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.Price;

/* loaded from: classes3.dex */
public interface jl {

    public static final class a implements jl {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Price f44391a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final gl f44392b;

        public a(@NotNull Price price, @NotNull gl interval) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.f44391a = price;
            this.f44392b = interval;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44391a, aVar.f44391a) && Intrinsics.areEqual(this.f44392b, aVar.f44392b);
        }

        public final int hashCode() {
            return this.f44392b.hashCode() + (this.f44391a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Promo(price=" + this.f44391a + ", interval=" + this.f44392b + ')';
        }
    }

    public static final class b implements jl {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Price f44393a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final gl f44394b;

        public b(@NotNull Price price, @NotNull gl interval) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.f44393a = price;
            this.f44394b = interval;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44393a, bVar.f44393a) && Intrinsics.areEqual(this.f44394b, bVar.f44394b);
        }

        public final int hashCode() {
            return this.f44394b.hashCode() + (this.f44393a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Standard(price=" + this.f44393a + ", interval=" + this.f44394b + ')';
        }
    }

    public static final class c implements jl {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Price f44395a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final gl f44396b;

        public c(@NotNull Price price, @NotNull gl interval) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.f44395a = price;
            this.f44396b = interval;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f44395a, cVar.f44395a) && Intrinsics.areEqual(this.f44396b, cVar.f44396b);
        }

        public final int hashCode() {
            return this.f44396b.hashCode() + (this.f44395a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Start(price=" + this.f44395a + ", interval=" + this.f44396b + ')';
        }
    }

    public static final class d implements jl {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f44397a = new d();
    }
}
