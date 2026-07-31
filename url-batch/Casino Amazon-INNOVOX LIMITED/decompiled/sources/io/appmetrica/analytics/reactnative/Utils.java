package io.appmetrica.analytics.reactnative;

import android.location.Location;
import android.util.Log;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import io.appmetrica.analytics.profile.UserProfile;
import io.opentelemetry.exporter.otlp.internal.OtlpConfigUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class Utils {
    Utils() {
    }

    static AppMetricaConfig toAppMetricaConfig(ReadableMap readableMap) {
        ReadableMap map;
        ReadableMap map2;
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(readableMap.getString("apiKey"));
        if (readableMap.hasKey("appVersion")) {
            newConfigBuilder.withAppVersion(readableMap.getString("appVersion"));
        }
        if (readableMap.hasKey("crashReporting")) {
            newConfigBuilder.withCrashReporting(readableMap.getBoolean("crashReporting"));
        }
        if (readableMap.hasKey("firstActivationAsUpdate")) {
            newConfigBuilder.handleFirstActivationAsUpdate(readableMap.getBoolean("firstActivationAsUpdate"));
        }
        if (readableMap.hasKey(InAppMessagePromptTypes.LOCATION_PROMPT_KEY)) {
            newConfigBuilder.withLocation(toLocation(readableMap.getMap(InAppMessagePromptTypes.LOCATION_PROMPT_KEY)));
        }
        if (readableMap.hasKey("locationTracking")) {
            newConfigBuilder.withLocationTracking(readableMap.getBoolean("locationTracking"));
        }
        if (readableMap.hasKey(OtlpConfigUtil.DATA_TYPE_LOGS) && readableMap.getBoolean(OtlpConfigUtil.DATA_TYPE_LOGS)) {
            newConfigBuilder.withLogs();
        }
        if (readableMap.hasKey("maxReportsInDatabaseCount")) {
            newConfigBuilder.withMaxReportsInDatabaseCount(readableMap.getInt("maxReportsInDatabaseCount"));
        }
        if (readableMap.hasKey("nativeCrashReporting")) {
            newConfigBuilder.withNativeCrashReporting(readableMap.getBoolean("nativeCrashReporting"));
        }
        if (readableMap.hasKey("preloadInfo")) {
            newConfigBuilder.withPreloadInfo(toPreloadInfo(readableMap.getMap("preloadInfo")));
        }
        if (readableMap.hasKey("sessionTimeout")) {
            newConfigBuilder.withSessionTimeout(readableMap.getInt("sessionTimeout"));
        }
        if (readableMap.hasKey("statisticsSending")) {
            newConfigBuilder.withDataSendingEnabled(readableMap.getBoolean("statisticsSending"));
        }
        if (readableMap.hasKey("sessionsAutoTracking")) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(readableMap.getBoolean("sessionsAutoTracking"));
        }
        if (readableMap.hasKey("userProfileID")) {
            newConfigBuilder.withUserProfileID(readableMap.getString("userProfileID"));
        }
        if (readableMap.hasKey("errorEnvironment") && (map2 = readableMap.getMap("errorEnvironment")) != null) {
            for (Map.Entry<String, Object> entry : map2.toHashMap().entrySet()) {
                Object value = entry.getValue();
                newConfigBuilder.withErrorEnvironmentValue(entry.getKey(), value == null ? null : value.toString());
            }
        }
        if (readableMap.hasKey("appEnvironment") && (map = readableMap.getMap("appEnvironment")) != null) {
            for (Map.Entry<String, Object> entry2 : map.toHashMap().entrySet()) {
                Object value2 = entry2.getValue();
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), value2 == null ? null : value2.toString());
            }
        }
        if (readableMap.hasKey("maxReportsCount")) {
            newConfigBuilder.withMaxReportsCount(readableMap.getInt("maxReportsCount"));
        }
        if (readableMap.hasKey("dispatchPeriodSeconds")) {
            newConfigBuilder.withDispatchPeriodSeconds(readableMap.getInt("dispatchPeriodSeconds"));
        }
        return newConfigBuilder.build();
    }

    static Location toLocation(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Location location = new Location("Custom");
        if (readableMap.hasKey("latitude")) {
            location.setLatitude(readableMap.getDouble("latitude"));
        }
        if (readableMap.hasKey("longitude")) {
            location.setLongitude(readableMap.getDouble("longitude"));
        }
        if (readableMap.hasKey("altitude")) {
            location.setAltitude(readableMap.getDouble("altitude"));
        }
        if (readableMap.hasKey("accuracy")) {
            location.setAccuracy((float) readableMap.getDouble("accuracy"));
        }
        if (readableMap.hasKey("course")) {
            location.setBearing((float) readableMap.getDouble("course"));
        }
        if (readableMap.hasKey("speed")) {
            location.setSpeed((float) readableMap.getDouble("speed"));
        }
        if (readableMap.hasKey("timestamp")) {
            location.setTime((long) readableMap.getDouble("timestamp"));
        }
        return location;
    }

    private static PreloadInfo toPreloadInfo(ReadableMap readableMap) {
        ReadableMap map;
        if (readableMap == null) {
            return null;
        }
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(readableMap.getString("trackingId"));
        if (readableMap.hasKey("additionalInfo") && (map = readableMap.getMap("additionalInfo")) != null) {
            for (Map.Entry<String, Object> entry : map.toHashMap().entrySet()) {
                Object value = entry.getValue();
                newBuilder.setAdditionalParams(entry.getKey(), value == null ? null : value.toString());
            }
        }
        return newBuilder.build();
    }

    static ECommerceScreen toECommerceScreen(ReadableMap readableMap) {
        ECommerceScreen eCommerceScreen = new ECommerceScreen();
        if (readableMap.hasKey("name")) {
            eCommerceScreen.setName(readableMap.getString("name"));
        }
        if (readableMap.hasKey("searchQuery")) {
            eCommerceScreen.setSearchQuery(readableMap.getString("searchQuery"));
        }
        if (readableMap.hasKey("payload")) {
            eCommerceScreen.setPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        if (readableMap.hasKey("categoriesPath")) {
            eCommerceScreen.setCategoriesPath(toListOfStrings(readableMap.getArray("categoriesPath")));
        }
        return eCommerceScreen;
    }

    static ECommerceAmount toEcommerceAmount(ReadableMap readableMap) {
        ReadableType type = readableMap.getType("amount");
        String string = readableMap.getString("unit");
        if (string != null) {
            if (type == ReadableType.Number) {
                return new ECommerceAmount(readableMap.getDouble("amount"), string);
            }
            return new ECommerceAmount(new BigDecimal(readableMap.getString("amount")), string);
        }
        Log.w(AppMetricaModule.TAG, "ECommerceAmount unit is null");
        return null;
    }

    static ECommercePrice toECommercePrice(ReadableMap readableMap) {
        ECommerceAmount ecommerceAmount;
        ReadableArray array;
        if (readableMap == null || (ecommerceAmount = toEcommerceAmount((ReadableMap) Objects.requireNonNull(readableMap.getMap("amount")))) == null) {
            return null;
        }
        ECommercePrice eCommercePrice = new ECommercePrice(ecommerceAmount);
        if (readableMap.hasKey("internalComponents") && (array = readableMap.getArray("internalComponents")) != null) {
            ArrayList arrayList = new ArrayList(array.size());
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(toEcommerceAmount(array.getMap(i)));
            }
            eCommercePrice.setInternalComponents(arrayList);
        }
        return eCommercePrice;
    }

    static ECommerceProduct toECommerceProduct(ReadableMap readableMap) {
        ECommerceProduct eCommerceProduct = new ECommerceProduct((String) Objects.requireNonNull(readableMap.getString("sku")));
        if (readableMap.hasKey("name")) {
            eCommerceProduct.setName(readableMap.getString("name"));
        }
        if (readableMap.hasKey("actualPrice")) {
            eCommerceProduct.setActualPrice(toECommercePrice(readableMap.getMap("actualPrice")));
        }
        if (readableMap.hasKey("originalPrice")) {
            eCommerceProduct.setOriginalPrice(toECommercePrice(readableMap.getMap("originalPrice")));
        }
        if (readableMap.hasKey("promocodes")) {
            eCommerceProduct.setPromocodes(toListOfStrings(readableMap.getArray("promocodes")));
        }
        if (readableMap.hasKey("categoriesPath")) {
            eCommerceProduct.setCategoriesPath(toListOfStrings(readableMap.getArray("categoriesPath")));
        }
        if (readableMap.hasKey("payload")) {
            eCommerceProduct.setPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        return eCommerceProduct;
    }

    static ECommerceReferrer toECommerceReferrer(ReadableMap readableMap) {
        ReadableMap map;
        if (readableMap == null) {
            return null;
        }
        ECommerceReferrer eCommerceReferrer = new ECommerceReferrer();
        if (readableMap.hasKey(WebViewManager.EVENT_TYPE_KEY)) {
            eCommerceReferrer.setType(readableMap.getString(WebViewManager.EVENT_TYPE_KEY));
        }
        if (readableMap.hasKey("identifier")) {
            eCommerceReferrer.setIdentifier(readableMap.getString("identifier"));
        }
        if (readableMap.hasKey("screen") && (map = readableMap.getMap("screen")) != null) {
            eCommerceReferrer.setScreen(toECommerceScreen(map));
        }
        return eCommerceReferrer;
    }

    static ECommerceCartItem toECommerceCartItem(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ECommerceProduct eCommerceProduct = toECommerceProduct((ReadableMap) Objects.requireNonNull(readableMap.getMap("product")));
        ECommercePrice eCommercePrice = toECommercePrice((ReadableMap) Objects.requireNonNull(readableMap.getMap("price")));
        if (eCommercePrice == null) {
            return null;
        }
        if (readableMap.getType("quantity") == ReadableType.Number) {
            ECommerceCartItem eCommerceCartItem = new ECommerceCartItem(eCommerceProduct, eCommercePrice, readableMap.getDouble("quantity"));
            if (readableMap.hasKey("referrer")) {
                eCommerceCartItem.setReferrer(toECommerceReferrer(readableMap.getMap("referrer")));
            }
            return eCommerceCartItem;
        }
        ECommerceCartItem eCommerceCartItem2 = new ECommerceCartItem(eCommerceProduct, eCommercePrice, new BigDecimal(readableMap.getString("quantity")));
        if (readableMap.hasKey("referrer")) {
            eCommerceCartItem2.setReferrer(toECommerceReferrer(readableMap.getMap("referrer")));
        }
        return eCommerceCartItem2;
    }

    static ECommerceOrder toECommerceOrder(ReadableMap readableMap) {
        String string = readableMap.getString("orderId");
        ReadableArray array = readableMap.getArray("products");
        ArrayList arrayList = new ArrayList(((ReadableArray) Objects.requireNonNull(array)).size());
        for (int i = 0; i < array.size(); i++) {
            arrayList.add(toECommerceCartItem(array.getMap(i)));
        }
        ECommerceOrder eCommerceOrder = new ECommerceOrder((String) Objects.requireNonNull(string), arrayList);
        if (readableMap.hasKey("payload")) {
            eCommerceOrder.setPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        return eCommerceOrder;
    }

    static ECommerceEvent toECommerceEvent(ReadableMap readableMap) {
        ReadableMap map;
        ReadableMap map2;
        ECommerceCartItem eCommerceCartItem;
        ECommerceCartItem eCommerceCartItem2;
        ReadableMap map3;
        String string = readableMap.getString("ecommerceEvent");
        if (string == null) {
            return null;
        }
        if (string.equals("showSceenEvent") && (map3 = readableMap.getMap("ecommerceScreen")) != null) {
            return ECommerceEvent.showScreenEvent(toECommerceScreen(map3));
        }
        if (string.equals("showProductCardEvent")) {
            ReadableMap map4 = readableMap.getMap("product");
            ReadableMap map5 = readableMap.getMap("ecommerceScreen");
            if (map4 != null && map5 != null) {
                return ECommerceEvent.showProductCardEvent(toECommerceProduct(map4), toECommerceScreen(map5));
            }
        }
        if (string.equals("showProductDetailsEvent")) {
            ReadableMap map6 = readableMap.getMap("product");
            ReadableMap map7 = readableMap.getMap("referrer");
            if (map6 != null) {
                return ECommerceEvent.showProductDetailsEvent(toECommerceProduct(map6), toECommerceReferrer(map7));
            }
        }
        if (string.equals("addCartItemEvent") && (eCommerceCartItem2 = toECommerceCartItem(readableMap.getMap("cartItem"))) != null) {
            return ECommerceEvent.addCartItemEvent(eCommerceCartItem2);
        }
        if (string.equals("removeCartItemEvent") && (eCommerceCartItem = toECommerceCartItem(readableMap.getMap("cartItem"))) != null) {
            return ECommerceEvent.removeCartItemEvent(eCommerceCartItem);
        }
        if (string.equals("beginCheckoutEvent") && (map2 = readableMap.getMap("order")) != null) {
            return ECommerceEvent.beginCheckoutEvent(toECommerceOrder(map2));
        }
        if (!string.equals("purchaseEvent") || (map = readableMap.getMap("order")) == null) {
            return null;
        }
        return ECommerceEvent.purchaseEvent(toECommerceOrder(map));
    }

    static List<String> toStartupKeyList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                arrayList.add(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
            }
            if (string.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                arrayList.add(StartupParamsCallback.APPMETRICA_DEVICE_ID);
            }
            if (string.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                arrayList.add(StartupParamsCallback.APPMETRICA_UUID);
            }
        }
        return arrayList;
    }

    static Revenue toRevenue(ReadableMap readableMap) {
        Revenue.Builder newBuilder = Revenue.newBuilder((long) (readableMap.getDouble("price") * 1000000.0d), Currency.getInstance(readableMap.getString("currency")));
        if (readableMap.hasKey("productID")) {
            newBuilder.withProductID(readableMap.getString("productID"));
        }
        if (readableMap.hasKey("payload")) {
            newBuilder.withPayload(readableMap.getString("payload"));
        }
        if (readableMap.hasKey("quantity")) {
            newBuilder.withQuantity(Integer.valueOf(readableMap.getInt("quantity")));
        }
        newBuilder.withReceipt(toReceipt(readableMap.getMap("receipt")));
        return newBuilder.build();
    }

    static Revenue.Receipt toReceipt(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Revenue.Receipt.Builder newBuilder = Revenue.Receipt.newBuilder();
        if (readableMap.hasKey("receiptData")) {
            newBuilder.withData(readableMap.getString("receiptData"));
        }
        if (readableMap.hasKey("signature")) {
            newBuilder.withSignature(readableMap.getString("signature"));
        }
        return newBuilder.build();
    }

    private static AdRevenue.Builder parseAdRevenuePrice(ReadableMap readableMap) {
        ReadableType type = readableMap.getType("price");
        String string = readableMap.getString("currency");
        if (type == ReadableType.Number) {
            return AdRevenue.newBuilder(readableMap.getDouble("price"), Currency.getInstance(string));
        }
        return AdRevenue.newBuilder(new BigDecimal(readableMap.getString("price")), Currency.getInstance(string));
    }

    static AdRevenue toAdRevenue(ReadableMap readableMap) {
        String string;
        AdRevenue.Builder parseAdRevenuePrice = parseAdRevenuePrice(readableMap);
        if (readableMap.hasKey("payload")) {
            parseAdRevenuePrice.withPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        if (readableMap.hasKey("adType") && (string = readableMap.getString("adType")) != null) {
            parseAdRevenuePrice.withAdType(toAdType(string));
        }
        if (readableMap.hasKey("adNetwork")) {
            parseAdRevenuePrice.withAdNetwork(readableMap.getString("adNetwork"));
        }
        if (readableMap.hasKey("adPlacementID")) {
            parseAdRevenuePrice.withAdPlacementId(readableMap.getString("adPlacementID"));
        }
        if (readableMap.hasKey("adPlacementName")) {
            parseAdRevenuePrice.withAdPlacementName(readableMap.getString("adPlacementName"));
        }
        if (readableMap.hasKey("adUnitID")) {
            parseAdRevenuePrice.withAdUnitId(readableMap.getString("adUnitID"));
        }
        if (readableMap.hasKey("adUnitName")) {
            parseAdRevenuePrice.withAdUnitName(readableMap.getString("adUnitName"));
        }
        if (readableMap.hasKey("precision")) {
            parseAdRevenuePrice.withPrecision(readableMap.getString("precision"));
        }
        return parseAdRevenuePrice.build();
    }

    static AdType toAdType(String str) {
        str.hashCode();
        switch (str) {
            case "banner":
                return AdType.BANNER;
            case "native":
                return AdType.NATIVE;
            case "rewarded":
                return AdType.REWARDED;
            case "mrec":
                return AdType.MREC;
            case "interstitial":
                return AdType.INTERSTITIAL;
            case "app_open":
                return AdType.APP_OPEN;
            default:
                return AdType.OTHER;
        }
    }

    static UserProfile toUserProfile(ReadableMap readableMap) {
        return UserProfileSerializer.fromReadableMap(readableMap);
    }

    static Map<String, String> toMapOfStrings(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : readableMap.toHashMap().entrySet()) {
            if (entry.getValue() instanceof String) {
                hashMap.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return hashMap;
    }

    private static List<String> toListOfStrings(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Objects.toString(it.next()));
        }
        return arrayList2;
    }

    static ReporterConfig toReporterConfig(ReadableMap readableMap) {
        ReadableMap map;
        ReporterConfig.Builder newConfigBuilder = ReporterConfig.newConfigBuilder((String) Objects.requireNonNull(readableMap.getString("apiKey")));
        if (readableMap.hasKey(OtlpConfigUtil.DATA_TYPE_LOGS) && Boolean.TRUE.equals(Boolean.valueOf(readableMap.getBoolean(OtlpConfigUtil.DATA_TYPE_LOGS)))) {
            newConfigBuilder.withLogs();
        }
        if (readableMap.hasKey("maxReportsInDatabaseCount")) {
            newConfigBuilder.withMaxReportsInDatabaseCount(readableMap.getInt("maxReportsInDatabaseCount"));
        }
        if (readableMap.hasKey("sessionTimeout")) {
            newConfigBuilder.withSessionTimeout(readableMap.getInt("sessionTimeout"));
        }
        if (readableMap.hasKey("dataSendingEnabled")) {
            newConfigBuilder.withDataSendingEnabled(readableMap.getBoolean("dataSendingEnabled"));
        }
        if (readableMap.hasKey("appEnvironment") && (map = readableMap.getMap("appEnvironment")) != null) {
            for (Map.Entry<String, Object> entry : map.toHashMap().entrySet()) {
                if (entry.getValue() instanceof String) {
                    newConfigBuilder.withAppEnvironmentValue(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        if (readableMap.hasKey("dispatchPeriodSeconds")) {
            newConfigBuilder.withDispatchPeriodSeconds(readableMap.getInt("dispatchPeriodSeconds"));
        }
        if (readableMap.hasKey("userProfileID")) {
            newConfigBuilder.withUserProfileID(readableMap.getString("userProfileID"));
        }
        if (readableMap.hasKey("maxReportsCount")) {
            newConfigBuilder.withMaxReportsCount(readableMap.getInt("maxReportsCount"));
        }
        return newConfigBuilder.build();
    }
}
