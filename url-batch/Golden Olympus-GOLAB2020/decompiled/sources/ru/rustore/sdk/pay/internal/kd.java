package ru.rustore.sdk.pay.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface kd {

    public static final class a implements kd {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<tm> f44446a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final h4 f44447b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final cb f44448c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44449d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final f0 f44450e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public final s9 f44451f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44452g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f44453h;

        public a(@NotNull List<tm> methods, @NotNull h4 couponState, @NotNull cb priceInfoUi, boolean z4, @NotNull f0 applicationPurchase, @Nullable s9 s9Var, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(methods, "methods");
            Intrinsics.checkNotNullParameter(couponState, "couponState");
            Intrinsics.checkNotNullParameter(priceInfoUi, "priceInfoUi");
            Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
            this.f44446a = methods;
            this.f44447b = couponState;
            this.f44448c = priceInfoUi;
            this.f44449d = z4;
            this.f44450e = applicationPurchase;
            this.f44451f = s9Var;
            this.f44452g = z5;
            this.f44453h = z6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, ArrayList arrayList, h4 h4Var, cb cbVar, s9 s9Var, boolean z4, int i4) {
            List list = arrayList;
            if ((i4 & 1) != 0) {
                list = aVar.f44446a;
            }
            List methods = list;
            if ((i4 & 2) != 0) {
                h4Var = aVar.f44447b;
            }
            h4 couponState = h4Var;
            if ((i4 & 4) != 0) {
                cbVar = aVar.f44448c;
            }
            cb priceInfoUi = cbVar;
            boolean z5 = aVar.f44449d;
            f0 applicationPurchase = aVar.f44450e;
            if ((i4 & 32) != 0) {
                s9Var = aVar.f44451f;
            }
            s9 s9Var2 = s9Var;
            boolean z6 = aVar.f44452g;
            if ((i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z4 = aVar.f44453h;
            }
            Intrinsics.checkNotNullParameter(methods, "methods");
            Intrinsics.checkNotNullParameter(couponState, "couponState");
            Intrinsics.checkNotNullParameter(priceInfoUi, "priceInfoUi");
            Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
            return new a(methods, couponState, priceInfoUi, z5, applicationPurchase, s9Var2, z6, z4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44446a, aVar.f44446a) && Intrinsics.areEqual(this.f44447b, aVar.f44447b) && Intrinsics.areEqual(this.f44448c, aVar.f44448c) && this.f44449d == aVar.f44449d && Intrinsics.areEqual(this.f44450e, aVar.f44450e) && Intrinsics.areEqual(this.f44451f, aVar.f44451f) && this.f44452g == aVar.f44452g && this.f44453h == aVar.f44453h;
        }

        public final int hashCode() {
            int hashCode = (this.f44450e.hashCode() + ((Boolean.hashCode(this.f44449d) + ((this.f44448c.hashCode() + ((this.f44447b.hashCode() + (this.f44446a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            s9 s9Var = this.f44451f;
            return Boolean.hashCode(this.f44453h) + ((Boolean.hashCode(this.f44452g) + ((hashCode + (s9Var == null ? 0 : s9Var.hashCode())) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ApplicationPurchaseContent(methods=" + this.f44446a + ", couponState=" + this.f44447b + ", priceInfoUi=" + this.f44448c + ", purchaseInProgress=" + this.f44449d + ", applicationPurchase=" + this.f44450e + ", activePayMethod=" + this.f44451f + ", sandboxEnabled=" + this.f44452g + ", offerConsentVisible=" + this.f44453h + ')';
        }
    }

    public static final class b implements kd {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<tm> f44454a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final h4 f44455b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final cb f44456c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44457d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final qb f44458e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public final s9 f44459f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44460g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f44461h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f44462i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f44463j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        public final dn f44464k;

        public b(@NotNull List<tm> methods, @NotNull h4 couponState, @NotNull cb priceInfoUi, boolean z4, @NotNull qb productPurchase, @Nullable s9 s9Var, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable dn dnVar) {
            Intrinsics.checkNotNullParameter(methods, "methods");
            Intrinsics.checkNotNullParameter(couponState, "couponState");
            Intrinsics.checkNotNullParameter(priceInfoUi, "priceInfoUi");
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            this.f44454a = methods;
            this.f44455b = couponState;
            this.f44456c = priceInfoUi;
            this.f44457d = z4;
            this.f44458e = productPurchase;
            this.f44459f = s9Var;
            this.f44460g = z5;
            this.f44461h = z6;
            this.f44462i = z7;
            this.f44463j = z8;
            this.f44464k = dnVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, ArrayList arrayList, h4 h4Var, cb cbVar, s9 s9Var, boolean z4, boolean z5, int i4) {
            List methods = (i4 & 1) != 0 ? bVar.f44454a : arrayList;
            h4 couponState = (i4 & 2) != 0 ? bVar.f44455b : h4Var;
            cb priceInfoUi = (i4 & 4) != 0 ? bVar.f44456c : cbVar;
            boolean z6 = bVar.f44457d;
            qb productPurchase = bVar.f44458e;
            s9 s9Var2 = (i4 & 32) != 0 ? bVar.f44459f : s9Var;
            boolean z7 = bVar.f44460g;
            boolean z8 = (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? bVar.f44461h : z4;
            boolean z9 = bVar.f44462i;
            boolean z10 = (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? bVar.f44463j : z5;
            dn dnVar = bVar.f44464k;
            Intrinsics.checkNotNullParameter(methods, "methods");
            Intrinsics.checkNotNullParameter(couponState, "couponState");
            Intrinsics.checkNotNullParameter(priceInfoUi, "priceInfoUi");
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            return new b(methods, couponState, priceInfoUi, z6, productPurchase, s9Var2, z7, z8, z9, z10, dnVar);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44454a, bVar.f44454a) && Intrinsics.areEqual(this.f44455b, bVar.f44455b) && Intrinsics.areEqual(this.f44456c, bVar.f44456c) && this.f44457d == bVar.f44457d && Intrinsics.areEqual(this.f44458e, bVar.f44458e) && Intrinsics.areEqual(this.f44459f, bVar.f44459f) && this.f44460g == bVar.f44460g && this.f44461h == bVar.f44461h && this.f44462i == bVar.f44462i && this.f44463j == bVar.f44463j && Intrinsics.areEqual(this.f44464k, bVar.f44464k);
        }

        public final int hashCode() {
            int hashCode = (this.f44458e.hashCode() + ((Boolean.hashCode(this.f44457d) + ((this.f44456c.hashCode() + ((this.f44455b.hashCode() + (this.f44454a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            s9 s9Var = this.f44459f;
            int hashCode2 = (Boolean.hashCode(this.f44463j) + ((Boolean.hashCode(this.f44462i) + ((Boolean.hashCode(this.f44461h) + ((Boolean.hashCode(this.f44460g) + ((hashCode + (s9Var == null ? 0 : s9Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
            dn dnVar = this.f44464k;
            return hashCode2 + (dnVar != null ? dnVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ProductPurchaseContent(methods=" + this.f44454a + ", couponState=" + this.f44455b + ", priceInfoUi=" + this.f44456c + ", purchaseInProgress=" + this.f44457d + ", productPurchase=" + this.f44458e + ", activePayMethod=" + this.f44459f + ", sandboxEnabled=" + this.f44460g + ", offerConsentVisible=" + this.f44461h + ", userUnauthorized=" + this.f44462i + ", mobilePhoneConditionsRequired=" + this.f44463j + ", user=" + this.f44464k + ')';
        }
    }

    public static final class c implements kd {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f44465a = new c();
    }

    public static final class d implements kd {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<tm> f44466a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final qb f44467b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public final s9 f44468c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44469d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f44470e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f44471f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44472g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        public final ArrayList f44473h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f44474i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public final dn f44475j;

        public d(@NotNull List methods, @NotNull qb productPurchase, @Nullable s9 s9Var, boolean z4, boolean z5, boolean z6, boolean z7, @NotNull ArrayList subscriptionTariffs, boolean z8, @Nullable dn dnVar) {
            Intrinsics.checkNotNullParameter(methods, "methods");
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            Intrinsics.checkNotNullParameter(subscriptionTariffs, "subscriptionTariffs");
            this.f44466a = methods;
            this.f44467b = productPurchase;
            this.f44468c = s9Var;
            this.f44469d = z4;
            this.f44470e = z5;
            this.f44471f = z6;
            this.f44472g = z7;
            this.f44473h = subscriptionTariffs;
            this.f44474i = z8;
            this.f44475j = dnVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static d a(d dVar, ArrayList arrayList, s9 s9Var, boolean z4, boolean z5, boolean z6, int i4) {
            List list = arrayList;
            if ((i4 & 1) != 0) {
                list = dVar.f44466a;
            }
            List methods = list;
            qb productPurchase = dVar.f44467b;
            s9 s9Var2 = (i4 & 4) != 0 ? dVar.f44468c : s9Var;
            boolean z7 = dVar.f44469d;
            boolean z8 = (i4 & 16) != 0 ? dVar.f44470e : z4;
            boolean z9 = dVar.f44471f;
            boolean z10 = (i4 & 64) != 0 ? dVar.f44472g : z5;
            ArrayList subscriptionTariffs = dVar.f44473h;
            boolean z11 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? dVar.f44474i : z6;
            dn dnVar = dVar.f44475j;
            Intrinsics.checkNotNullParameter(methods, "methods");
            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
            Intrinsics.checkNotNullParameter(subscriptionTariffs, "subscriptionTariffs");
            return new d(methods, productPurchase, s9Var2, z7, z8, z9, z10, subscriptionTariffs, z11, dnVar);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f44466a, dVar.f44466a) && Intrinsics.areEqual(this.f44467b, dVar.f44467b) && Intrinsics.areEqual(this.f44468c, dVar.f44468c) && this.f44469d == dVar.f44469d && this.f44470e == dVar.f44470e && this.f44471f == dVar.f44471f && this.f44472g == dVar.f44472g && Intrinsics.areEqual(this.f44473h, dVar.f44473h) && this.f44474i == dVar.f44474i && Intrinsics.areEqual(this.f44475j, dVar.f44475j);
        }

        public final int hashCode() {
            int hashCode = (this.f44467b.hashCode() + (this.f44466a.hashCode() * 31)) * 31;
            s9 s9Var = this.f44468c;
            int hashCode2 = (Boolean.hashCode(this.f44474i) + ((this.f44473h.hashCode() + ((Boolean.hashCode(this.f44472g) + ((Boolean.hashCode(this.f44471f) + ((Boolean.hashCode(this.f44470e) + ((Boolean.hashCode(this.f44469d) + ((hashCode + (s9Var == null ? 0 : s9Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            dn dnVar = this.f44475j;
            return hashCode2 + (dnVar != null ? dnVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "SubscriptionPurchaseContent(methods=" + this.f44466a + ", productPurchase=" + this.f44467b + ", activePayMethod=" + this.f44468c + ", sandboxEnabled=" + this.f44469d + ", offerConsentVisible=" + this.f44470e + ", userUnauthorized=" + this.f44471f + ", mobilePhoneConditionsRequired=" + this.f44472g + ", subscriptionTariffs=" + this.f44473h + ", tariffDetailsVisible=" + this.f44474i + ", user=" + this.f44475j + ')';
        }
    }
}
