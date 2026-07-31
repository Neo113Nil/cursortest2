package ru.rustore.sdk.pay.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;

/* loaded from: classes3.dex */
public final class f0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44047a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44048b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final ApplicationPurchaseStatus f44049c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44050d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final e0 f44051e;

    public f0(@NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull ApplicationPurchaseStatus status, @NotNull PurchaseType purchaseType, @NotNull e0 applicationInfo) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f44047a = purchaseId;
        this.f44048b = invoiceId;
        this.f44049c = status;
        this.f44050d = purchaseType;
        this.f44051e = applicationInfo;
    }

    public static f0 a(f0 f0Var, PurchaseType purchaseType, e0 e0Var, int i4) {
        PurchaseId purchaseId = f0Var.f44047a;
        InvoiceId invoiceId = f0Var.f44048b;
        ApplicationPurchaseStatus status = f0Var.f44049c;
        if ((i4 & 8) != 0) {
            purchaseType = f0Var.f44050d;
        }
        PurchaseType purchaseType2 = purchaseType;
        if ((i4 & 16) != 0) {
            e0Var = f0Var.f44051e;
        }
        e0 applicationInfo = e0Var;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(purchaseType2, "purchaseType");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        return new f0(purchaseId, invoiceId, status, purchaseType2, applicationInfo);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.f44047a, f0Var.f44047a) && Intrinsics.areEqual(this.f44048b, f0Var.f44048b) && this.f44049c == f0Var.f44049c && this.f44050d == f0Var.f44050d && Intrinsics.areEqual(this.f44051e, f0Var.f44051e);
    }

    public final int hashCode() {
        return this.f44051e.hashCode() + ((this.f44050d.hashCode() + ((this.f44049c.hashCode() + ((this.f44048b.hashCode() + (this.f44047a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ApplicationPurchase(purchaseId=" + this.f44047a + ", invoiceId=" + this.f44048b + ", status=" + this.f44049c + ", purchaseType=" + this.f44050d + ", applicationInfo=" + this.f44051e + ')';
    }
}
