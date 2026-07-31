package ru.rustore.sdk.pay.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public interface ua extends Serializable {

    public static final class a implements ua {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45089a = new a();
    }

    public static final class b implements ua {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f45090a = new b();
    }

    public static final class c implements ua {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PurchaseId f45091a;

        public c(@NotNull PurchaseId purchaseId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f45091a = purchaseId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f45091a, ((c) obj).f45091a);
        }

        public final int hashCode() {
            return this.f45091a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SavedCard(purchaseId=" + this.f45091a + ')';
        }
    }

    public static final class d implements ua {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PurchaseId f45092a;

        public d(@NotNull PurchaseId purchaseId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f45092a = purchaseId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f45092a, ((d) obj).f45092a);
        }

        public final int hashCode() {
            return this.f45092a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SberPay(purchaseId=" + this.f45092a + ')';
        }
    }

    public static final class e implements ua {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final PurchaseId f45093a;

        public e(@NotNull PurchaseId purchaseId) {
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f45093a = purchaseId;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f45093a, ((e) obj).f45093a);
        }

        public final int hashCode() {
            return this.f45093a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Sbp(purchaseId=" + this.f45093a + ')';
        }
    }
}
