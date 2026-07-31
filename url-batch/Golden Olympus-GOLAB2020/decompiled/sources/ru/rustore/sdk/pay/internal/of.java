package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.hf;

/* loaded from: classes3.dex */
public abstract class of {

    public static final class a extends of {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f44733a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f44734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, @NotNull String bankName) {
            super(z4);
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            this.f44733a = z4;
            this.f44734b = bankName;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44733a == aVar.f44733a && Intrinsics.areEqual(this.f44734b, aVar.f44734b);
        }

        public final int hashCode() {
            return this.f44734b.hashCode() + (Boolean.hashCode(this.f44733a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ApplicationBankAppError(sandboxEnabled=");
            sb.append(this.f44733a);
            sb.append(", bankName=");
            return i1.a(sb, this.f44734b, ')');
        }
    }

    public static final class b extends of {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final hf.a.b f44735a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull hf.a.b failureResult, boolean z4) {
            super(z4);
            Intrinsics.checkNotNullParameter(failureResult, "failureResult");
            this.f44735a = failureResult;
            this.f44736b = z4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44735a, bVar.f44735a) && this.f44736b == bVar.f44736b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44736b) + (this.f44735a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ApplicationPurchaseFailure(failureResult=" + this.f44735a + ", sandboxEnabled=" + this.f44736b + ')';
        }
    }

    public static final class c extends of {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final f0 f44737a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull f0 applicationPurchase, boolean z4) {
            super(z4);
            Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
            this.f44737a = applicationPurchase;
            this.f44738b = z4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f44737a, cVar.f44737a) && this.f44738b == cVar.f44738b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44738b) + (this.f44737a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ApplicationPurchaseSuccess(applicationPurchase=" + this.f44737a + ", sandboxEnabled=" + this.f44738b + ')';
        }
    }

    public static final class d extends of {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f44739a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final hf.b.C0259b f44740b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f44741c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public final dn f44742d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, @NotNull hf.b.C0259b failureResult, @NotNull String bankName, @Nullable dn dnVar) {
            super(z4);
            Intrinsics.checkNotNullParameter(failureResult, "failureResult");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            this.f44739a = z4;
            this.f44740b = failureResult;
            this.f44741c = bankName;
            this.f44742d = dnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f44739a == dVar.f44739a && Intrinsics.areEqual(this.f44740b, dVar.f44740b) && Intrinsics.areEqual(this.f44741c, dVar.f44741c) && Intrinsics.areEqual(this.f44742d, dVar.f44742d);
        }

        public final int hashCode() {
            int a4 = j1.a(this.f44741c, (this.f44740b.hashCode() + (Boolean.hashCode(this.f44739a) * 31)) * 31, 31);
            dn dnVar = this.f44742d;
            return a4 + (dnVar == null ? 0 : dnVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "ProductBankAppError(sandboxEnabled=" + this.f44739a + ", failureResult=" + this.f44740b + ", bankName=" + this.f44741c + ", user=" + this.f44742d + ')';
        }
    }

    public static final class e extends of {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final hf.b.C0259b f44743a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44744b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44745c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public final dn f44746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull hf.b.C0259b failureResult, boolean z4, boolean z5, @Nullable dn dnVar) {
            super(z5);
            Intrinsics.checkNotNullParameter(failureResult, "failureResult");
            this.f44743a = failureResult;
            this.f44744b = z4;
            this.f44745c = z5;
            this.f44746d = dnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f44743a, eVar.f44743a) && this.f44744b == eVar.f44744b && this.f44745c == eVar.f44745c && Intrinsics.areEqual(this.f44746d, eVar.f44746d);
        }

        public final int hashCode() {
            int hashCode = (Boolean.hashCode(this.f44745c) + ((Boolean.hashCode(this.f44744b) + (this.f44743a.hashCode() * 31)) * 31)) * 31;
            dn dnVar = this.f44746d;
            return hashCode + (dnVar == null ? 0 : dnVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "ProductPurchaseFailure(failureResult=" + this.f44743a + ", restartPurchaseAvailable=" + this.f44744b + ", sandboxEnabled=" + this.f44745c + ", user=" + this.f44746d + ')';
        }
    }

    public static final class f extends of {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final qb f44747a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44748b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44749c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public final dn f44750d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull qb productPurchase, boolean z4, boolean z5, @Nullable dn dnVar) {
            super(z5);
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            this.f44747a = productPurchase;
            this.f44748b = z4;
            this.f44749c = z5;
            this.f44750d = dnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f44747a, fVar.f44747a) && this.f44748b == fVar.f44748b && this.f44749c == fVar.f44749c && Intrinsics.areEqual(this.f44750d, fVar.f44750d);
        }

        public final int hashCode() {
            int hashCode = (Boolean.hashCode(this.f44749c) + ((Boolean.hashCode(this.f44748b) + (this.f44747a.hashCode() * 31)) * 31)) * 31;
            dn dnVar = this.f44750d;
            return hashCode + (dnVar == null ? 0 : dnVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "ProductPurchaseSuccess(productPurchase=" + this.f44747a + ", userUnauthorized=" + this.f44748b + ", sandboxEnabled=" + this.f44749c + ", user=" + this.f44750d + ')';
        }
    }

    public of(boolean z4) {
    }
}
