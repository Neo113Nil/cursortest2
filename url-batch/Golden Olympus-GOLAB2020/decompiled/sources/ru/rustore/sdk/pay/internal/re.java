package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseStatus;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;

/* loaded from: classes3.dex */
public final class re extends kotlin.jvm.internal.s implements Function0<ki.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductType f44916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseStatus f44917b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44918a;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE_PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.NON_CONSUMABLE_PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44918a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(ProductType productType, PurchaseStatus purchaseStatus) {
        super(0);
        this.f44916a = productType;
        this.f44917b = purchaseStatus;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList = new ArrayList();
        ProductType productType = this.f44916a;
        int i4 = productType == null ? -1 : a.f44918a[productType.ordinal()];
        if (i4 == 1) {
            arrayList.add("productType=CONSUMABLE");
        } else if (i4 == 2) {
            arrayList.add("productType=NON_CONSUMABLE");
        } else if (i4 == 3) {
            arrayList.add("productType=SUBSCRIPTION");
        }
        PurchaseStatus purchaseStatus = this.f44917b;
        if (purchaseStatus instanceof ProductPurchaseStatus) {
            arrayList.add("purchaseStatus=" + ((ProductPurchaseStatus) this.f44917b).name());
        } else if (purchaseStatus instanceof SubscriptionPurchaseStatus) {
            arrayList.add("purchaseStatus=" + ((SubscriptionPurchaseStatus) this.f44917b).name());
        }
        StringBuilder sb = new StringBuilder("api/v1/purchases");
        if (!arrayList.isEmpty()) {
            sb.append("?");
            sb.append(CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return new ki.a(sb2, MapsKt.emptyMap());
    }
}
