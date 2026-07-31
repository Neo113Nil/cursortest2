package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public interface p3 {

    public static final class a implements p3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44768a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final PurchaseId f44769b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<m4> f44770c;

        public a(String couponId, PurchaseId purchaseId, List coupons) {
            Intrinsics.checkNotNullParameter(couponId, "couponId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(coupons, "coupons");
            this.f44768a = couponId;
            this.f44769b = purchaseId;
            this.f44770c = coupons;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44768a, aVar.f44768a) && Intrinsics.areEqual(this.f44769b, aVar.f44769b) && Intrinsics.areEqual(this.f44770c, aVar.f44770c);
        }

        public final int hashCode() {
            return this.f44770c.hashCode() + ((this.f44769b.hashCode() + (this.f44768a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ConnectionError(couponId=");
            sb.append((Object) ("CouponId(value=" + this.f44768a + ')'));
            sb.append(", purchaseId=");
            sb.append(this.f44769b);
            sb.append(", coupons=");
            sb.append(this.f44770c);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class b implements p3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<m4> f44771a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final PurchaseId f44772b;

        public b(@NotNull List<m4> coupons, @NotNull PurchaseId purchaseId) {
            Intrinsics.checkNotNullParameter(coupons, "coupons");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f44771a = coupons;
            this.f44772b = purchaseId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44771a, bVar.f44771a) && Intrinsics.areEqual(this.f44772b, bVar.f44772b);
        }

        public final int hashCode() {
            return this.f44772b.hashCode() + (this.f44771a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Content(coupons=" + this.f44771a + ", purchaseId=" + this.f44772b + ')';
        }
    }

    public static final class c implements p3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f44773a = new c();
    }

    public static final class d implements p3 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f44774a = new d();
    }
}
