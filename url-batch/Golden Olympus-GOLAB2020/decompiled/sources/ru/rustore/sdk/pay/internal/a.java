package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: ru.rustore.sdk.pay.internal.a$a, reason: collision with other inner class name */
    public static final class C0255a implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PackageName f43787a;

        public C0255a(@NotNull PackageName packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.f43787a = packageName;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0255a) && Intrinsics.areEqual(this.f43787a, ((C0255a) obj).f43787a);
        }

        public final int hashCode() {
            return this.f43787a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Application(packageName=" + this.f43787a + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final ProductPurchaseParams f43788a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final g f43789b;

        public b(@NotNull ProductPurchaseParams params, @NotNull g purchaseType) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            this.f43788a = params;
            this.f43789b = purchaseType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f43788a, bVar.f43788a) && Intrinsics.areEqual(this.f43789b, bVar.f43789b);
        }

        public final int hashCode() {
            return this.f43789b.hashCode() + (this.f43788a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Product(params=" + this.f43788a + ", purchaseType=" + this.f43789b + ')';
        }
    }
}
