package dev.hyo.openiap;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0005R\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/PurchaseCommon;", "", "currentPlanId", "", "getCurrentPlanId", "()Ljava/lang/String;", "id", "getId", "ids", "", "getIds", "()Ljava/util/List;", "isAutoRenewing", "", "()Z", "platform", "Ldev/hyo/openiap/IapPlatform;", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "productId", "getProductId", "purchaseState", "Ldev/hyo/openiap/PurchaseState;", "getPurchaseState", "()Ldev/hyo/openiap/PurchaseState;", "purchaseToken", "getPurchaseToken", "quantity", "", "getQuantity", "()I", "store", "Ldev/hyo/openiap/IapStore;", "getStore", "()Ldev/hyo/openiap/IapStore;", "transactionDate", "", "getTransactionDate", "()D", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PurchaseCommon {
    String getCurrentPlanId();

    String getId();

    List<String> getIds();

    IapPlatform getPlatform();

    String getProductId();

    PurchaseState getPurchaseState();

    String getPurchaseToken();

    int getQuantity();

    IapStore getStore();

    double getTransactionDate();

    boolean isAutoRenewing();
}
