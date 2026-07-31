package ru.rustore.sdk.pay.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseType;

/* loaded from: classes3.dex */
public final class qb implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final OrderId f44816a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final ProductId f44817b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final PurchaseId f44818c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final InvoiceId f44819d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final PurchaseType f44820e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final ProductType f44821f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final ze f44822g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f44823h;

    public qb(@Nullable OrderId orderId, @NotNull ProductId productId, @NotNull PurchaseId purchaseId, @NotNull InvoiceId invoiceId, @NotNull PurchaseType purchaseType, @NotNull ProductType productType, @NotNull ze purchaseInfo, boolean z4) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseInfo, "purchaseInfo");
        this.f44816a = orderId;
        this.f44817b = productId;
        this.f44818c = purchaseId;
        this.f44819d = invoiceId;
        this.f44820e = purchaseType;
        this.f44821f = productType;
        this.f44822g = purchaseInfo;
        this.f44823h = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [ru.rustore.sdk.pay.internal.ze] */
    public static qb a(qb qbVar, PurchaseType purchaseType, ze.a aVar, int i4) {
        OrderId orderId = qbVar.f44816a;
        ProductId productId = qbVar.f44817b;
        PurchaseId purchaseId = qbVar.f44818c;
        InvoiceId invoiceId = qbVar.f44819d;
        if ((i4 & 16) != 0) {
            purchaseType = qbVar.f44820e;
        }
        PurchaseType purchaseType2 = purchaseType;
        ProductType productType = qbVar.f44821f;
        ze.a aVar2 = aVar;
        if ((i4 & 64) != 0) {
            aVar2 = qbVar.f44822g;
        }
        ze.a purchaseInfo = aVar2;
        boolean z4 = qbVar.f44823h;
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseType2, "purchaseType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseInfo, "purchaseInfo");
        return new qb(orderId, productId, purchaseId, invoiceId, purchaseType2, productType, purchaseInfo, z4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return Intrinsics.areEqual(this.f44816a, qbVar.f44816a) && Intrinsics.areEqual(this.f44817b, qbVar.f44817b) && Intrinsics.areEqual(this.f44818c, qbVar.f44818c) && Intrinsics.areEqual(this.f44819d, qbVar.f44819d) && this.f44820e == qbVar.f44820e && this.f44821f == qbVar.f44821f && Intrinsics.areEqual(this.f44822g, qbVar.f44822g) && this.f44823h == qbVar.f44823h;
    }

    public final int hashCode() {
        OrderId orderId = this.f44816a;
        return Boolean.hashCode(this.f44823h) + ((this.f44822g.hashCode() + ((this.f44821f.hashCode() + ((this.f44820e.hashCode() + ((this.f44819d.hashCode() + ((this.f44818c.hashCode() + ((this.f44817b.hashCode() + ((orderId == null ? 0 : orderId.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ProductPurchase(orderId=" + this.f44816a + ", productId=" + this.f44817b + ", purchaseId=" + this.f44818c + ", invoiceId=" + this.f44819d + ", purchaseType=" + this.f44820e + ", productType=" + this.f44821f + ", purchaseInfo=" + this.f44822g + ", sandbox=" + this.f44823h + ')';
    }
}
