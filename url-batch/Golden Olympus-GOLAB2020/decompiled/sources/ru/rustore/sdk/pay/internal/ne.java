package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public interface ne {

    public static final class a implements ne {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final PurchaseId f44690a;

        public a(@Nullable PurchaseId purchaseId) {
            this.f44690a = purchaseId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f44690a, ((a) obj).f44690a) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            PurchaseId purchaseId = this.f44690a;
            return (purchaseId == null ? 0 : purchaseId.hashCode()) * 31;
        }

        @NotNull
        public final String toString() {
            return "Cancelled(purchaseId=" + this.f44690a + ", invoiceId=null)";
        }
    }

    public static final class b implements ne {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PurchaseId f44691a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final InvoiceId f44692b;

        public b(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f44691a = purchaseId;
            this.f44692b = invoiceId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44691a, bVar.f44691a) && Intrinsics.areEqual(this.f44692b, bVar.f44692b);
        }

        public final int hashCode() {
            return this.f44692b.hashCode() + (this.f44691a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Completed(purchaseId=" + this.f44691a + ", invoiceId=" + this.f44692b + ')';
        }
    }

    public static final class c implements ne {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PurchaseId f44693a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final InvoiceId f44694b;

        public c(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f44693a = purchaseId;
            this.f44694b = invoiceId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f44693a, cVar.f44693a) && Intrinsics.areEqual(this.f44694b, cVar.f44694b);
        }

        public final int hashCode() {
            return this.f44694b.hashCode() + (this.f44693a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Created(purchaseId=" + this.f44693a + ", invoiceId=" + this.f44694b + ')';
        }
    }

    public static final class d implements ne {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final PurchaseId f44695a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final InvoiceId f44696b;

        public d(@Nullable PurchaseId purchaseId, @Nullable InvoiceId invoiceId) {
            this.f44695a = purchaseId;
            this.f44696b = invoiceId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f44695a, dVar.f44695a) && Intrinsics.areEqual(this.f44696b, dVar.f44696b);
        }

        public final int hashCode() {
            PurchaseId purchaseId = this.f44695a;
            int hashCode = (purchaseId == null ? 0 : purchaseId.hashCode()) * 31;
            InvoiceId invoiceId = this.f44696b;
            return hashCode + (invoiceId != null ? invoiceId.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Failed(purchaseId=" + this.f44695a + ", invoiceId=" + this.f44696b + ')';
        }
    }

    public static final class e implements ne {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PurchaseId f44697a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final InvoiceId f44698b;

        public e(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f44697a = purchaseId;
            this.f44698b = invoiceId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f44697a, eVar.f44697a) && Intrinsics.areEqual(this.f44698b, eVar.f44698b);
        }

        public final int hashCode() {
            return this.f44698b.hashCode() + (this.f44697a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "PaymentStarted(purchaseId=" + this.f44697a + ", invoiceId=" + this.f44698b + ')';
        }
    }
}
