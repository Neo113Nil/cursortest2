package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ug {

    public static final class a implements ug {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final f0 f45099a;

        public a(@NotNull f0 purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f45099a = purchase;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f45099a, ((a) obj).f45099a);
        }

        public final int hashCode() {
            return this.f45099a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Application(purchase=" + this.f45099a + ')';
        }
    }

    public static final class b implements ug {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f45100a = new b();
    }

    public static final class c implements ug {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final qb f45101a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final dn f45102b;

        public c(@NotNull qb purchase, @Nullable dn dnVar) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f45101a = purchase;
            this.f45102b = dnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f45101a, cVar.f45101a) && Intrinsics.areEqual(this.f45102b, cVar.f45102b);
        }

        public final int hashCode() {
            int hashCode = this.f45101a.hashCode() * 31;
            dn dnVar = this.f45102b;
            return hashCode + (dnVar == null ? 0 : dnVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Product(purchase=" + this.f45101a + ", user=" + this.f45102b + ')';
        }
    }
}
