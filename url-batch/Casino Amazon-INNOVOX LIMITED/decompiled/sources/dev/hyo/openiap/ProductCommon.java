package dev.hyo.openiap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import kotlin.Metadata;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/ProductCommon;", "", "currency", "", "getCurrency", "()Ljava/lang/String;", "debugDescription", "getDebugDescription", "description", "getDescription", "displayName", "getDisplayName", "displayPrice", "getDisplayPrice", "id", "getId", "platform", "Ldev/hyo/openiap/IapPlatform;", "getPlatform", "()Ldev/hyo/openiap/IapPlatform;", "price", "", "getPrice", "()Ljava/lang/Double;", "title", "getTitle", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductType;", "getType", "()Ldev/hyo/openiap/ProductType;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductCommon {
    String getCurrency();

    String getDebugDescription();

    String getDescription();

    String getDisplayName();

    String getDisplayPrice();

    String getId();

    IapPlatform getPlatform();

    Double getPrice();

    String getTitle();

    ProductType getType();
}
