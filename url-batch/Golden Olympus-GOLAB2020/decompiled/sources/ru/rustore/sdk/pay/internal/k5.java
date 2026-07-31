package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface k5 {

    public static final class a implements k5 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final f0 f44416a;

        public a(@NotNull f0 purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f44416a = purchase;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f44416a, ((a) obj).f44416a);
        }

        public final int hashCode() {
            return this.f44416a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Application(purchase=" + this.f44416a + ')';
        }
    }

    public static final class b implements k5 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f44417a = new b();
    }

    public static final class c implements k5 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final qb f44418a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final dn f44419b;

        public c(@NotNull qb purchase, @Nullable dn dnVar) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f44418a = purchase;
            this.f44419b = dnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f44418a, cVar.f44418a) && Intrinsics.areEqual(this.f44419b, cVar.f44419b);
        }

        public final int hashCode() {
            int hashCode = this.f44418a.hashCode() * 31;
            dn dnVar = this.f44419b;
            return hashCode + (dnVar == null ? 0 : dnVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Product(purchase=" + this.f44418a + ", user=" + this.f44419b + ')';
        }
    }
}
