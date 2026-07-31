package com.margelo.nitro.iap;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.core.Promise;
import com.margelo.nitro.iap.Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_;
import com.margelo.nitro.iap.Variant_NullType_Boolean;
import com.margelo.nitro.iap.Variant_NullType_Double;
import com.margelo.nitro.iap.Variant_NullType_NitroDiscountAmountAndroid;
import com.margelo.nitro.iap.Variant_NullType_NitroDiscountDisplayInfoAndroid;
import com.margelo.nitro.iap.Variant_NullType_NitroLimitedQuantityInfoAndroid;
import com.margelo.nitro.iap.Variant_NullType_NitroPreorderDetailsAndroid;
import com.margelo.nitro.iap.Variant_NullType_NitroRentalDetailsAndroid;
import com.margelo.nitro.iap.Variant_NullType_NitroValidTimeWindowAndroid;
import com.margelo.nitro.iap.Variant_NullType_String;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import dev.hyo.openiap.DiscountAmountAndroid;
import dev.hyo.openiap.DiscountDisplayInfoAndroid;
import dev.hyo.openiap.DiscountOffer;
import dev.hyo.openiap.FetchProductsResult;
import dev.hyo.openiap.FetchProductsResultAll;
import dev.hyo.openiap.FetchProductsResultProducts;
import dev.hyo.openiap.FetchProductsResultSubscriptions;
import dev.hyo.openiap.LimitedQuantityInfoAndroid;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.PaymentMode;
import dev.hyo.openiap.PreorderDetailsAndroid;
import dev.hyo.openiap.PricingPhaseAndroid;
import dev.hyo.openiap.PricingPhasesAndroid;
import dev.hyo.openiap.Product;
import dev.hyo.openiap.ProductAndroid;
import dev.hyo.openiap.ProductAndroidOneTimePurchaseOfferDetail;
import dev.hyo.openiap.ProductCommon;
import dev.hyo.openiap.ProductOrSubscription;
import dev.hyo.openiap.ProductQueryType;
import dev.hyo.openiap.ProductStatusAndroid;
import dev.hyo.openiap.ProductSubscription;
import dev.hyo.openiap.ProductSubscriptionAndroid;
import dev.hyo.openiap.ProductSubscriptionAndroidOfferDetails;
import dev.hyo.openiap.ProductType;
import dev.hyo.openiap.RentalDetailsAndroid;
import dev.hyo.openiap.RequestPurchaseResultPurchase;
import dev.hyo.openiap.RequestPurchaseResultPurchases;
import dev.hyo.openiap.SubscriptionOffer;
import dev.hyo.openiap.SubscriptionPeriod;
import dev.hyo.openiap.ValidTimeWindowAndroid;
import dev.hyo.openiap.store.OpenIapStore;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000Þ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010\u0011H\u0002J\u0015\u0010&\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010*J\u0015\u0010&\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010'H\u0002J\u0015\u0010.\u001a\u0004\u0018\u00010)*\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010/J\u0015\u00100\u001a\u0004\u0018\u00010 *\u0004\u0018\u00010+H\u0002¢\u0006\u0002\u00101J\u000e\u00102\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u00103J\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020 052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J/\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0:052\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110:2\u0006\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020?052\u0006\u0010@\u001a\u00020AH\u0016J\u001e\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150:052\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J)\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0:052\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:H\u0016¢\u0006\u0002\u0010HJ#\u0010I\u001a\b\u0012\u0004\u0012\u00020 052\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:H\u0016¢\u0006\u0002\u0010HJ\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020K052\u0006\u0010L\u001a\u00020MH\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001105H\u0016J+\u0010S\u001a\u00020\u00162!\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J+\u0010X\u001a\u00020\u00162!\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J+\u0010Z\u001a\u00020\u00162!\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J+\u0010[\u001a\u00020\u00162!\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J+\u0010\\\u001a\u00020\u00162!\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J+\u0010^\u001a\u00020\u00162!\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\u0010\u0010_\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u0015H\u0002J\u0010\u0010`\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u0018H\u0002JA\u0010a\u001a\u00020\u00182\u0006\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u00112\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010e\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010hJ\u0010\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u0011H\u0002J\u0010\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0002J\u0012\u0010p\u001a\b\u0012\u0004\u0012\u00020r0q*\u00020sH\u0002J\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020u0q*\u0004\u0018\u00010vH\u0002J\u0016\u0010w\u001a\u00020\u00112\f\u0010x\u001a\b\u0012\u0004\u0012\u00020y0qH\u0002J\u0016\u0010z\u001a\u00020\u00112\f\u0010x\u001a\b\u0012\u0004\u0012\u00020{0qH\u0002J\u0016\u0010|\u001a\u00020\u00112\f\u0010x\u001a\b\u0012\u0004\u0012\u00020}0qH\u0002J\u0010\u0010~\u001a\u00020\u001a2\u0006\u0010]\u001a\u00020rH\u0002J\u0010\u0010\u007f\u001a\u00020\u00152\u0006\u0010W\u001a\u00020uH\u0002J\u0014\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u0014\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002J\u000f\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u001105H\u0016J\u000f\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020'05H\u0016J\u0018\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u0016052\u0007\u0010C\u001a\u00030\u008b\u0001H\u0016J\u0010\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u000105H\u0016J\u0010\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u000105H\u0016J\u000f\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u001605H\u0016J\u000f\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u000f\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u001605H\u0016J\u0017\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020'052\u0006\u0010d\u001a\u00020\u0011H\u0016J\u0015\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150:05H\u0016J\u000f\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u0019\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u0001052\u0007\u0010L\u001a\u00030\u0097\u0001H\u0016J\u0019\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u0001052\u0007\u0010L\u001a\u00030\u009a\u0001H\u0016J\u0018\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u0001052\u0006\u0010d\u001a\u00020\u0011H\u0016J\u0018\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u0001052\u0006\u0010d\u001a\u00020\u0011H\u0016J\u0018\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u0001052\u0006\u0010d\u001a\u00020\u0011H\u0016J\u0015\u0010 \u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150:05H\u0016J\u000f\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u0018\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020 052\u0007\u0010£\u0001\u001a\u00020\u0011H\u0016J\u000f\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u001105H\u0016J\u000f\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u001105H\u0016J\u000f\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\u001105H\u0016J\u0017\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020 052\u0006\u0010d\u001a\u00020\u0011H\u0016J\u0017\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020'052\u0006\u0010d\u001a\u00020\u0011H\u0016J\u000f\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u000f\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u0019\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020'052\b\u0010d\u001a\u0004\u0018\u00010'H\u0016J\u001d\u0010¬\u0001\u001a\u00020\u00162\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\u001d\u0010\u00ad\u0001\u001a\u00020\u00162\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\u0012\u0010®\u0001\u001a\u00020\u00162\u0007\u0010¯\u0001\u001a\u00020\u001cH\u0002J\u001d\u0010°\u0001\u001a\u00020\u00162\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\u001d\u0010±\u0001\u001a\u00020\u00162\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\u0012\u0010²\u0001\u001a\u00020\u00162\u0007\u0010¯\u0001\u001a\u00020\u001eH\u0002J\u0013\u0010¸\u0001\u001a\u00020\u00162\b\u0010¹\u0001\u001a\u00030º\u0001H\u0016J\u001a\u0010»\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u0001052\b\u0010¹\u0001\u001a\u00030º\u0001H\u0016J\u001a\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u0001052\b\u0010¹\u0001\u001a\u00030º\u0001H\u0016J\u0018\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020 052\u0007\u0010L\u001a\u00030À\u0001H\u0016J\u0014\u0010Á\u0001\u001a\u00030Â\u00012\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u0013\u0010Ã\u0001\u001a\u00030Ä\u00012\u0007\u0010n\u001a\u00030Å\u0001H\u0002J\u0013\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010<\u001a\u00030È\u0001H\u0002J\u000f\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u0010\u0010Ê\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u000105H\u0016J\u0019\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Í\u0001052\u0007\u0010Î\u0001\u001a\u00020\u0011H\u0016J\u000f\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020 05H\u0016J\u001a\u0010Ð\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u0001052\b\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0016J\u001a\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030Õ\u0001052\b\u0010Ö\u0001\u001a\u00030×\u0001H\u0016J\u0014\u0010Ø\u0001\u001a\u00030Ù\u00012\b\u0010Ú\u0001\u001a\u00030Û\u0001H\u0002J8\u0010Ü\u0001\u001a\u00020\u00112\u0007\u0010Y\u001a\u00030Ù\u00012\u000b\b\u0002\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00112\u000b\b\u0002\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0011H\u0002J\u0013\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\u0011H\u0002J\u0013\u0010â\u0001\u001a\u00030\u0085\u00012\u0007\u0010ã\u0001\u001a\u00020\u0011H\u0002J\u0013\u0010ä\u0001\u001a\u00030å\u00012\u0007\u0010æ\u0001\u001a\u00020\u0011H\u0002J\u000b\u0010ç\u0001\u001a\u0004\u0018\u00010\u0011H\u0002J8\u0010è\u0001\u001a\u00020\u00182\u0007\u0010Y\u001a\u00030Ù\u00012\u000b\b\u0002\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00112\u000b\b\u0002\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00160\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR \u0010³\u0001\u001a\u00030´\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b·\u0001\u0010\t\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006é\u0001"}, d2 = {"Lcom/margelo/nitro/iap/HybridRnIap;", "Lcom/margelo/nitro/iap/HybridRnIapSpec;", "<init>", "()V", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "context$delegate", "Lkotlin/Lazy;", "openIap", "Ldev/hyo/openiap/OpenIapModule;", "getOpenIap", "()Ldev/hyo/openiap/OpenIapModule;", "openIap$delegate", "productTypeBySku", "", "", "purchaseUpdatedListeners", "", "Lkotlin/Function1;", "Lcom/margelo/nitro/iap/NitroPurchase;", "", "purchaseErrorListeners", "Lcom/margelo/nitro/iap/NitroPurchaseResult;", "promotedProductListenersIOS", "Lcom/margelo/nitro/iap/NitroProduct;", "userChoiceBillingListenersAndroid", "Lcom/margelo/nitro/iap/UserChoiceBillingDetails;", "developerProvidedBillingListenersAndroid", "Lcom/margelo/nitro/iap/DeveloperProvidedBillingDetailsAndroid;", "listenersAttached", "", "isInitialized", "initDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "initLock", "", "wrapVariant", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "", "(Ljava/lang/Double;)Lcom/margelo/nitro/iap/Variant_NullType_Double;", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "(Ljava/lang/Boolean;)Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "unwrapString", "unwrapDouble", "(Lcom/margelo/nitro/iap/Variant_NullType_Double;)Ljava/lang/Double;", "unwrapBool", "(Lcom/margelo/nitro/iap/Variant_NullType_Boolean;)Ljava/lang/Boolean;", "ensureConnection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initConnection", "Lcom/margelo/nitro/core/Promise;", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lcom/margelo/nitro/iap/Variant_NullType_InitConnectionConfig;", "endConnection", "fetchProducts", "", "skus", WebViewManager.EVENT_TYPE_KEY, "([Ljava/lang/String;Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "requestPurchase", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "request", "Lcom/margelo/nitro/iap/NitroPurchaseRequest;", "getAvailablePurchases", "options", "Lcom/margelo/nitro/iap/NitroAvailablePurchasesOptions;", "getActiveSubscriptions", "Lcom/margelo/nitro/iap/NitroActiveSubscription;", "subscriptionIds", "([Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "hasActiveSubscriptions", "finishTransaction", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Lcom/margelo/nitro/iap/NitroFinishTransactionParams;", "getStorefront", "memorySize", "", "getMemorySize", "()J", "addPurchaseUpdatedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/ParameterName;", "name", "purchase", "addPurchaseErrorListener", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "removePurchaseUpdatedListener", "removePurchaseErrorListener", "addPromotedProductListenerIOS", "product", "removePromotedProductListenerIOS", "sendPurchaseUpdate", "sendPurchaseError", "createPurchaseErrorResult", "errorCode", "message", "sku", "responseCode", "", "debugMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/margelo/nitro/iap/NitroPurchaseResult;", "parseProductQueryType", "Ldev/hyo/openiap/ProductQueryType;", "rawType", "parseSubscriptionReplacementMode", "Ldev/hyo/openiap/SubscriptionReplacementModeAndroid;", "mode", "Lcom/margelo/nitro/iap/SubscriptionReplacementModeAndroid;", "productsOrEmpty", "", "Ldev/hyo/openiap/ProductCommon;", "Ldev/hyo/openiap/FetchProductsResult;", "purchasesOrEmpty", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/RequestPurchaseResult;", "serializeSubscriptionOffers", "offers", "Ldev/hyo/openiap/ProductSubscriptionAndroidOfferDetails;", "serializeStandardizedSubscriptionOffers", "Ldev/hyo/openiap/SubscriptionOffer;", "serializeStandardizedDiscountOffers", "Ldev/hyo/openiap/DiscountOffer;", "convertToNitroProduct", "convertToNitroPurchase", "mapPurchaseState", "Lcom/margelo/nitro/iap/PurchaseState;", "state", "Ldev/hyo/openiap/PurchaseState;", "mapIapStore", "Lcom/margelo/nitro/iap/IapStore;", "store", "Ldev/hyo/openiap/IapStore;", "getStorefrontIOS", "getAppTransactionIOS", "deepLinkToSubscriptionsAndroid", "Lcom/margelo/nitro/iap/NitroDeepLinkOptionsAndroid;", "getPromotedProductIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroProduct;", "requestPromotedProductIOS", "buyPromotedProductIOS", "presentCodeRedemptionSheetIOS", "clearTransactionIOS", "beginRefundRequestIOS", "showManageSubscriptionsIOS", "deepLinkToSubscriptionsIOS", "validateReceipt", "Lcom/margelo/nitro/iap/Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid;", "Lcom/margelo/nitro/iap/NitroReceiptValidationParams;", "verifyPurchaseWithProvider", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderResult;", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderProps;", "subscriptionStatusIOS", "Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroSubscriptionStatus_;", "currentEntitlementIOS", "Lcom/margelo/nitro/iap/Variant_NullType_NitroPurchase;", "latestTransactionIOS", "getPendingTransactionsIOS", "syncIOS", "isEligibleForIntroOfferIOS", "groupID", "getReceiptDataIOS", "getReceiptIOS", "requestReceiptRefreshIOS", "isTransactionVerifiedIOS", "getTransactionJwsIOS", "checkAlternativeBillingAvailabilityAndroid", "showAlternativeBillingDialogAndroid", "createAlternativeBillingTokenAndroid", "addUserChoiceBillingListenerAndroid", "removeUserChoiceBillingListenerAndroid", "sendUserChoiceBilling", "details", "addDeveloperProvidedBillingListenerAndroid", "removeDeveloperProvidedBillingListenerAndroid", "sendDeveloperProvidedBilling", "openIapStore", "Ldev/hyo/openiap/store/OpenIapStore;", "getOpenIapStore", "()Ldev/hyo/openiap/store/OpenIapStore;", "openIapStore$delegate", "enableBillingProgramAndroid", "program", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "isBillingProgramAvailableAndroid", "Lcom/margelo/nitro/iap/NitroBillingProgramAvailabilityResultAndroid;", "createBillingProgramReportingDetailsAndroid", "Lcom/margelo/nitro/iap/NitroBillingProgramReportingDetailsAndroid;", "launchExternalLinkAndroid", "Lcom/margelo/nitro/iap/NitroLaunchExternalLinkParamsAndroid;", "mapBillingProgram", "Ldev/hyo/openiap/BillingProgramAndroid;", "mapExternalLinkLaunchMode", "Ldev/hyo/openiap/ExternalLinkLaunchModeAndroid;", "Lcom/margelo/nitro/iap/ExternalLinkLaunchModeAndroid;", "mapExternalLinkType", "Ldev/hyo/openiap/ExternalLinkTypeAndroid;", "Lcom/margelo/nitro/iap/ExternalLinkTypeAndroid;", "canPresentExternalPurchaseNoticeIOS", "presentExternalPurchaseNoticeSheetIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseNoticeResultIOS;", "presentExternalPurchaseLinkIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseLinkResultIOS;", ImagesContract.URL, "isEligibleForExternalPurchaseCustomLinkIOS", "getExternalPurchaseCustomLinkTokenIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenResultIOS;", "tokenType", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenTypeIOS;", "showExternalPurchaseCustomLinkNoticeIOS", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeResultIOS;", "noticeType", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeTypeIOS;", "parseOpenIapError", "Ldev/hyo/openiap/OpenIapError;", NotificationCompat.CATEGORY_ERROR, "", "toErrorJson", "productId", "messageOverride", "mapIapkitPurchaseState", "Lcom/margelo/nitro/iap/IapkitPurchaseState;", "stateName", "mapIapkitStore", "storeName", "mapPurchaseVerificationProvider", "Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "providerName", "getIapkitApiKeyFromManifest", "toErrorResult", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HybridRnIap extends HybridRnIapSpec {
    private CompletableDeferred<Boolean> initDeferred;
    private boolean isInitialized;
    private boolean listenersAttached;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final Lazy context = LazyKt.lazy(new Function0() { // from class: com.margelo.nitro.iap.HybridRnIap$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReactApplicationContext context_delegate$lambda$0;
            context_delegate$lambda$0 = HybridRnIap.context_delegate$lambda$0();
            return context_delegate$lambda$0;
        }
    });

    /* renamed from: openIap$delegate, reason: from kotlin metadata */
    private final Lazy openIap = LazyKt.lazy(new Function0() { // from class: com.margelo.nitro.iap.HybridRnIap$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OpenIapModule openIap_delegate$lambda$1;
            openIap_delegate$lambda$1 = HybridRnIap.openIap_delegate$lambda$1(HybridRnIap.this);
            return openIap_delegate$lambda$1;
        }
    });
    private final Map<String, String> productTypeBySku = new LinkedHashMap();
    private final List<Function1<NitroPurchase, Unit>> purchaseUpdatedListeners = new ArrayList();
    private final List<Function1<NitroPurchaseResult, Unit>> purchaseErrorListeners = new ArrayList();
    private final List<Function1<NitroProduct, Unit>> promotedProductListenersIOS = new ArrayList();
    private final List<Function1<UserChoiceBillingDetails, Unit>> userChoiceBillingListenersAndroid = new ArrayList();
    private final List<Function1<DeveloperProvidedBillingDetailsAndroid, Unit>> developerProvidedBillingListenersAndroid = new ArrayList();
    private final Object initLock = new Object();

    /* renamed from: openIapStore$delegate, reason: from kotlin metadata */
    private final Lazy openIapStore = LazyKt.lazy(new Function0() { // from class: com.margelo.nitro.iap.HybridRnIap$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OpenIapStore openIapStore_delegate$lambda$63;
            openIapStore_delegate$lambda$63 = HybridRnIap.openIapStore_delegate$lambda$63(HybridRnIap.this);
            return openIapStore_delegate$lambda$63;
        }
    });

    /* compiled from: HybridRnIap.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[SubscriptionReplacementModeAndroid.values().length];
            try {
                iArr[SubscriptionReplacementModeAndroid.WITH_TIME_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.CHARGE_PRORATED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.DEFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.KEEP_EXISTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SubscriptionReplacementModeAndroid.UNKNOWN_REPLACEMENT_MODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[dev.hyo.openiap.PurchaseState.values().length];
            try {
                iArr2[dev.hyo.openiap.PurchaseState.Purchased.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[dev.hyo.openiap.PurchaseState.Pending.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[dev.hyo.openiap.PurchaseState.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[dev.hyo.openiap.IapStore.values().length];
            try {
                iArr3[dev.hyo.openiap.IapStore.Apple.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[dev.hyo.openiap.IapStore.Google.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[dev.hyo.openiap.IapStore.Horizon.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[dev.hyo.openiap.IapStore.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BillingProgramAndroid.values().length];
            try {
                iArr4[BillingProgramAndroid.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[BillingProgramAndroid.EXTERNAL_CONTENT_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[BillingProgramAndroid.EXTERNAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[BillingProgramAndroid.EXTERNAL_PAYMENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[BillingProgramAndroid.USER_CHOICE_BILLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ExternalLinkLaunchModeAndroid.values().length];
            try {
                iArr5[ExternalLinkLaunchModeAndroid.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[ExternalLinkLaunchModeAndroid.LAUNCH_IN_EXTERNAL_BROWSER_OR_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[ExternalLinkLaunchModeAndroid.CALLER_WILL_LAUNCH_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ExternalLinkTypeAndroid.values().length];
            try {
                iArr6[ExternalLinkTypeAndroid.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[ExternalLinkTypeAndroid.LINK_TO_DIGITAL_CONTENT_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[ExternalLinkTypeAndroid.LINK_TO_APP_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    @Override // com.margelo.nitro.core.HybridObject
    public long getMemorySize() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactApplicationContext getContext() {
        return (ReactApplicationContext) this.context.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactApplicationContext context_delegate$lambda$0() {
        ReactApplicationContext applicationContext = NitroModules.INSTANCE.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.facebook.react.bridge.ReactApplicationContext");
        return applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenIapModule getOpenIap() {
        return (OpenIapModule) this.openIap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenIapModule openIap_delegate$lambda$1(HybridRnIap hybridRnIap) {
        return new OpenIapModule(hybridRnIap.getContext(), null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Variant_NullType_String wrapVariant(String str) {
        return str != null ? new Variant_NullType_String.Second(str) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Variant_NullType_Double wrapVariant(Double d) {
        return d != null ? new Variant_NullType_Double.Second(d.doubleValue()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Variant_NullType_Boolean wrapVariant(Boolean bool) {
        return bool != null ? new Variant_NullType_Boolean.Second(bool.booleanValue()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String unwrapString(Variant_NullType_String variant_NullType_String) {
        Variant_NullType_String.Second second = variant_NullType_String instanceof Variant_NullType_String.Second ? (Variant_NullType_String.Second) variant_NullType_String : null;
        if (second != null) {
            return second.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Double unwrapDouble(Variant_NullType_Double variant_NullType_Double) {
        Variant_NullType_Double.Second second = variant_NullType_Double instanceof Variant_NullType_Double.Second ? (Variant_NullType_Double.Second) variant_NullType_Double : null;
        if (second != null) {
            return Double.valueOf(second.getValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean unwrapBool(Variant_NullType_Boolean variant_NullType_Boolean) {
        Variant_NullType_Boolean.Second second = variant_NullType_Boolean instanceof Variant_NullType_Boolean.Second ? (Variant_NullType_Boolean.Second) variant_NullType_Boolean : null;
        if (second != null) {
            return Boolean.valueOf(second.getValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object ensureConnection(Continuation<? super Unit> continuation) {
        Object await = initConnection(null).await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> initConnection(Variant_NullType_InitConnectionConfig config) {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$initConnection$1(config, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> endConnection() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$endConnection$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroProduct[]> fetchProducts(String[] skus, String type) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(type, "type");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$fetchProducts$1(skus, type, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<RequestPurchaseResult> requestPurchase(NitroPurchaseRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$requestPurchase$1(request, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroPurchase[]> getAvailablePurchases(NitroAvailablePurchasesOptions options) {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getAvailablePurchases$1(options, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroActiveSubscription[]> getActiveSubscriptions(String[] subscriptionIds) {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getActiveSubscriptions$1(this, subscriptionIds, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> hasActiveSubscriptions(String[] subscriptionIds) {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$hasActiveSubscriptions$1(this, subscriptionIds, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_Boolean_NitroPurchaseResult> finishTransaction(NitroFinishTransactionParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$finishTransaction$1(params, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<String> getStorefront() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getStorefront$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void addPurchaseUpdatedListener(Function1<? super NitroPurchase, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.purchaseUpdatedListeners) {
            this.purchaseUpdatedListeners.add(listener);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void addPurchaseErrorListener(Function1<? super NitroPurchaseResult, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.purchaseErrorListeners) {
            this.purchaseErrorListeners.add(listener);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void removePurchaseUpdatedListener(Function1<? super NitroPurchase, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.purchaseUpdatedListeners) {
            this.purchaseUpdatedListeners.remove(listener);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void removePurchaseErrorListener(Function1<? super NitroPurchaseResult, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.purchaseErrorListeners) {
            this.purchaseErrorListeners.remove(listener);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void addPromotedProductListenerIOS(Function1<? super NitroProduct, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.promotedProductListenersIOS.add(listener);
        RnIapLog.INSTANCE.warn("addPromotedProductListenerIOS called on Android - promoted products are iOS-only");
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void removePromotedProductListenerIOS(Function1<? super NitroProduct, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.promotedProductListenersIOS.remove(listener)) {
            RnIapLog.INSTANCE.warn("removePromotedProductListenerIOS: listener not found");
        }
        RnIapLog.INSTANCE.warn("removePromotedProductListenerIOS called on Android - promoted products are iOS-only");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPurchaseUpdate(NitroPurchase purchase) {
        ArrayList arrayList;
        RnIapLog.INSTANCE.result("sendPurchaseUpdate", MapsKt.mapOf(TuplesKt.to("productId", purchase.getProductId()), TuplesKt.to("platform", purchase.getPlatform())));
        synchronized (this.purchaseUpdatedListeners) {
            arrayList = new ArrayList(this.purchaseUpdatedListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(purchase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPurchaseError(NitroPurchaseResult error) {
        ArrayList arrayList;
        RnIapLog.INSTANCE.result("sendPurchaseError", MapsKt.mapOf(TuplesKt.to("code", error.getCode()), TuplesKt.to("message", error.getMessage())));
        synchronized (this.purchaseErrorListeners) {
            arrayList = new ArrayList(this.purchaseErrorListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(error);
        }
    }

    static /* synthetic */ NitroPurchaseResult createPurchaseErrorResult$default(HybridRnIap hybridRnIap, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return hybridRnIap.createPurchaseErrorResult(str, str2, str3, num, str4);
    }

    private final NitroPurchaseResult createPurchaseErrorResult(String errorCode, String message, String sku, Integer responseCode, String debugMessage) {
        return new NitroPurchaseResult(responseCode != null ? responseCode.intValue() : -1.0d, debugMessage, errorCode, message, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r15.equals("subs") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        if (r15.equals(com.android.billingclient.api.BillingClient.FeatureType.SUBSCRIPTIONS) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        return dev.hyo.openiap.ProductQueryType.Subs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r15.equals("subscription") != false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProductQueryType parseProductQueryType(String rawType) {
        String obj = StringsKt.trim((CharSequence) rawType).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(lowerCase, "_", "", false, 4, (Object) null), TokenBuilder.TOKEN_DELIMITER, "", false, 4, (Object) null);
        switch (replace$default.hashCode()) {
            case 96673:
                if (replace$default.equals("all")) {
                    return ProductQueryType.All;
                }
                break;
            case 3541555:
                break;
            case 341203229:
                break;
            case 1987365622:
                break;
        }
        return ProductQueryType.InApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dev.hyo.openiap.SubscriptionReplacementModeAndroid parseSubscriptionReplacementMode(SubscriptionReplacementModeAndroid mode) {
        switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case 1:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.WithTimeProration;
            case 2:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.ChargeProratedPrice;
            case 3:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.ChargeFullPrice;
            case 4:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.WithoutProration;
            case 5:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.Deferred;
            case 6:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.KeepExisting;
            case 7:
                return dev.hyo.openiap.SubscriptionReplacementModeAndroid.UnknownReplacementMode;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductCommon> productsOrEmpty(FetchProductsResult fetchProductsResult) {
        if (!(fetchProductsResult instanceof FetchProductsResultProducts)) {
            if (!(fetchProductsResult instanceof FetchProductsResultSubscriptions)) {
                if (!(fetchProductsResult instanceof FetchProductsResultAll)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<ProductOrSubscription> value = ((FetchProductsResultAll) fetchProductsResult).getValue();
                if (value == null) {
                    value = CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : value) {
                    if (obj instanceof ProductCommon) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            List<ProductSubscription> value2 = ((FetchProductsResultSubscriptions) fetchProductsResult).getValue();
            if (value2 == null) {
                value2 = CollectionsKt.emptyList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : value2) {
                if (obj2 instanceof ProductCommon) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        List<Product> value3 = ((FetchProductsResultProducts) fetchProductsResult).getValue();
        if (value3 == null) {
            value3 = CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : value3) {
            if (obj3 instanceof ProductCommon) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<dev.hyo.openiap.Purchase> purchasesOrEmpty(dev.hyo.openiap.RequestPurchaseResult requestPurchaseResult) {
        if (!(requestPurchaseResult instanceof RequestPurchaseResultPurchases)) {
            if (!(requestPurchaseResult instanceof RequestPurchaseResultPurchase)) {
                return CollectionsKt.emptyList();
            }
            dev.hyo.openiap.Purchase value = ((RequestPurchaseResultPurchase) requestPurchaseResult).getValue();
            List<dev.hyo.openiap.Purchase> listOf = value != null ? CollectionsKt.listOf(value) : null;
            return listOf == null ? CollectionsKt.emptyList() : listOf;
        }
        List<dev.hyo.openiap.Purchase> value2 = ((RequestPurchaseResultPurchases) requestPurchaseResult).getValue();
        if (value2 == null) {
            value2 = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (dev.hyo.openiap.Purchase purchase : value2) {
            if (purchase != null) {
                arrayList.add(purchase);
            }
        }
        return arrayList;
    }

    private final String serializeSubscriptionOffers(List<ProductSubscriptionAndroidOfferDetails> offers) {
        JSONArray jSONArray = new JSONArray();
        for (ProductSubscriptionAndroidOfferDetails productSubscriptionAndroidOfferDetails : offers) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("basePlanId", productSubscriptionAndroidOfferDetails.getBasePlanId());
            jSONObject.put("offerId", productSubscriptionAndroidOfferDetails.getOfferId());
            jSONObject.put("offerTags", new JSONArray((Collection) productSubscriptionAndroidOfferDetails.getOfferTags()));
            jSONObject.put("offerToken", productSubscriptionAndroidOfferDetails.getOfferToken());
            JSONArray jSONArray2 = new JSONArray();
            for (PricingPhaseAndroid pricingPhaseAndroid : productSubscriptionAndroidOfferDetails.getPricingPhases().getPricingPhaseList()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("billingCycleCount", pricingPhaseAndroid.getBillingCycleCount());
                jSONObject2.put("billingPeriod", pricingPhaseAndroid.getBillingPeriod());
                jSONObject2.put("formattedPrice", pricingPhaseAndroid.getFormattedPrice());
                jSONObject2.put("priceAmountMicros", pricingPhaseAndroid.getPriceAmountMicros());
                jSONObject2.put("priceCurrencyCode", pricingPhaseAndroid.getPriceCurrencyCode());
                jSONObject2.put("recurrenceMode", pricingPhaseAndroid.getRecurrenceMode());
                jSONArray2.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("pricingPhaseList", jSONArray2);
            jSONObject.put("pricingPhases", jSONObject3);
            jSONArray.put(jSONObject);
        }
        String jSONArray3 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray3, "toString(...)");
        return jSONArray3;
    }

    private final String serializeStandardizedSubscriptionOffers(List<SubscriptionOffer> offers) {
        JSONArray jSONArray = new JSONArray();
        for (SubscriptionOffer subscriptionOffer : offers) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", subscriptionOffer.getId());
            jSONObject.put("displayPrice", subscriptionOffer.getDisplayPrice());
            jSONObject.put("price", subscriptionOffer.getPrice());
            jSONObject.put(WebViewManager.EVENT_TYPE_KEY, subscriptionOffer.getType().getRawValue());
            Object currency = subscriptionOffer.getCurrency();
            if (currency != null) {
                jSONObject.put("currency", currency);
            }
            Object basePlanIdAndroid = subscriptionOffer.getBasePlanIdAndroid();
            if (basePlanIdAndroid != null) {
                jSONObject.put("basePlanIdAndroid", basePlanIdAndroid);
            }
            Object offerTokenAndroid = subscriptionOffer.getOfferTokenAndroid();
            if (offerTokenAndroid != null) {
                jSONObject.put("offerTokenAndroid", offerTokenAndroid);
            }
            List<String> offerTagsAndroid = subscriptionOffer.getOfferTagsAndroid();
            if (offerTagsAndroid != null) {
                jSONObject.put("offerTagsAndroid", new JSONArray((Collection) offerTagsAndroid));
            }
            PaymentMode paymentMode = subscriptionOffer.getPaymentMode();
            if (paymentMode != null) {
                jSONObject.put("paymentMode", paymentMode.getRawValue());
            }
            Integer periodCount = subscriptionOffer.getPeriodCount();
            if (periodCount != null) {
                jSONObject.put("periodCount", periodCount.intValue());
            }
            Integer numberOfPeriodsIOS = subscriptionOffer.getNumberOfPeriodsIOS();
            if (numberOfPeriodsIOS != null) {
                jSONObject.put("numberOfPeriodsIOS", numberOfPeriodsIOS.intValue());
            }
            SubscriptionPeriod period = subscriptionOffer.getPeriod();
            if (period != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unit", period.getUnit().getRawValue());
                jSONObject2.put("value", period.getValue());
                jSONObject.put(TypedValues.Cycle.S_WAVE_PERIOD, jSONObject2);
            }
            PricingPhasesAndroid pricingPhasesAndroid = subscriptionOffer.getPricingPhasesAndroid();
            if (pricingPhasesAndroid != null) {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (PricingPhaseAndroid pricingPhaseAndroid : pricingPhasesAndroid.getPricingPhaseList()) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("billingCycleCount", pricingPhaseAndroid.getBillingCycleCount());
                    jSONObject4.put("billingPeriod", pricingPhaseAndroid.getBillingPeriod());
                    jSONObject4.put("formattedPrice", pricingPhaseAndroid.getFormattedPrice());
                    jSONObject4.put("priceAmountMicros", pricingPhaseAndroid.getPriceAmountMicros());
                    jSONObject4.put("priceCurrencyCode", pricingPhaseAndroid.getPriceCurrencyCode());
                    jSONObject4.put("recurrenceMode", pricingPhaseAndroid.getRecurrenceMode());
                    jSONArray2.put(jSONObject4);
                }
                jSONObject3.put("pricingPhaseList", jSONArray2);
                jSONObject.put("pricingPhasesAndroid", jSONObject3);
            }
            jSONArray.put(jSONObject);
        }
        String jSONArray3 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray3, "toString(...)");
        return jSONArray3;
    }

    private final String serializeStandardizedDiscountOffers(List<DiscountOffer> offers) {
        JSONArray jSONArray = new JSONArray();
        for (DiscountOffer discountOffer : offers) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currency", discountOffer.getCurrency());
            jSONObject.put("displayPrice", discountOffer.getDisplayPrice());
            jSONObject.put("price", discountOffer.getPrice());
            String id = discountOffer.getId();
            if (id != null) {
                jSONObject.put("id", id);
            }
            List<String> offerTagsAndroid = discountOffer.getOfferTagsAndroid();
            if (offerTagsAndroid != null) {
                jSONObject.put("offerTagsAndroid", new JSONArray((Collection) offerTagsAndroid));
            }
            String offerTokenAndroid = discountOffer.getOfferTokenAndroid();
            if (offerTokenAndroid != null) {
                jSONObject.put("offerTokenAndroid", offerTokenAndroid);
            }
            String discountAmountMicrosAndroid = discountOffer.getDiscountAmountMicrosAndroid();
            if (discountAmountMicrosAndroid != null) {
                jSONObject.put("discountAmountMicrosAndroid", discountAmountMicrosAndroid);
            }
            String formattedDiscountAmountAndroid = discountOffer.getFormattedDiscountAmountAndroid();
            if (formattedDiscountAmountAndroid != null) {
                jSONObject.put("formattedDiscountAmountAndroid", formattedDiscountAmountAndroid);
            }
            String fullPriceMicrosAndroid = discountOffer.getFullPriceMicrosAndroid();
            if (fullPriceMicrosAndroid != null) {
                jSONObject.put("fullPriceMicrosAndroid", fullPriceMicrosAndroid);
            }
            LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = discountOffer.getLimitedQuantityInfoAndroid();
            if (limitedQuantityInfoAndroid != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("maximumQuantity", limitedQuantityInfoAndroid.getMaximumQuantity());
                jSONObject2.put("remainingQuantity", limitedQuantityInfoAndroid.getRemainingQuantity());
                jSONObject.put("limitedQuantityInfoAndroid", jSONObject2);
            }
            ValidTimeWindowAndroid validTimeWindowAndroid = discountOffer.getValidTimeWindowAndroid();
            if (validTimeWindowAndroid != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("startTimeMillis", validTimeWindowAndroid.getStartTimeMillis());
                jSONObject3.put("endTimeMillis", validTimeWindowAndroid.getEndTimeMillis());
                jSONObject.put("validTimeWindowAndroid", jSONObject3);
            }
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NitroProduct convertToNitroProduct(ProductCommon product) {
        List<ProductSubscriptionAndroidOfferDetails> emptyList;
        List<ProductAndroidOneTimePurchaseOfferDetail> oneTimePurchaseOfferDetailsAndroid;
        boolean z;
        List<ProductSubscriptionAndroidOfferDetails> list;
        List<ProductAndroidOneTimePurchaseOfferDetail> list2;
        NitroOneTimePurchaseOfferDetail[] nitroOneTimePurchaseOfferDetailArr;
        Double d;
        String str;
        String str2;
        String str3;
        Double d2;
        String str4;
        Double d3;
        Object obj;
        Object obj2;
        Object obj3;
        PricingPhasesAndroid pricingPhases;
        String nameAndroid;
        ProductStatusAndroid productStatusAndroid;
        String rawValue;
        List<SubscriptionOffer> subscriptionOffers;
        String str5;
        List<DiscountOffer> discountOffers;
        String str6;
        ProductAndroidOneTimePurchaseOfferDetail productAndroidOneTimePurchaseOfferDetail;
        Variant_NullType_NitroDiscountDisplayInfoAndroid.Second second;
        boolean z2;
        List<ProductSubscriptionAndroidOfferDetails> list3;
        List<ProductAndroidOneTimePurchaseOfferDetail> list4;
        Variant_NullType_NitroLimitedQuantityInfoAndroid.Second second2;
        Variant_NullType_NitroRentalDetailsAndroid.Second second3;
        boolean z3 = product instanceof ProductSubscriptionAndroid;
        if (z3) {
            emptyList = ((ProductSubscriptionAndroid) product).getSubscriptionOfferDetailsAndroid();
            if (emptyList == null) {
                emptyList = CollectionsKt.emptyList();
            }
        } else if (product instanceof ProductAndroid) {
            emptyList = ((ProductAndroid) product).getSubscriptionOfferDetailsAndroid();
            if (emptyList == null) {
                emptyList = CollectionsKt.emptyList();
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (z3) {
            oneTimePurchaseOfferDetailsAndroid = ((ProductSubscriptionAndroid) product).getOneTimePurchaseOfferDetailsAndroid();
        } else {
            oneTimePurchaseOfferDetailsAndroid = product instanceof ProductAndroid ? ((ProductAndroid) product).getOneTimePurchaseOfferDetailsAndroid() : null;
        }
        List<ProductSubscriptionAndroidOfferDetails> list5 = !emptyList.isEmpty() ? emptyList : null;
        String serializeSubscriptionOffers = list5 != null ? serializeSubscriptionOffers(list5) : null;
        if (oneTimePurchaseOfferDetailsAndroid != null) {
            List<ProductAndroidOneTimePurchaseOfferDetail> list6 = oneTimePurchaseOfferDetailsAndroid;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            for (ProductAndroidOneTimePurchaseOfferDetail productAndroidOneTimePurchaseOfferDetail2 : list6) {
                String formattedPrice = productAndroidOneTimePurchaseOfferDetail2.getFormattedPrice();
                String priceAmountMicros = productAndroidOneTimePurchaseOfferDetail2.getPriceAmountMicros();
                String priceCurrencyCode = productAndroidOneTimePurchaseOfferDetail2.getPriceCurrencyCode();
                Variant_NullType_String wrapVariant = wrapVariant(productAndroidOneTimePurchaseOfferDetail2.getOfferId());
                String offerToken = productAndroidOneTimePurchaseOfferDetail2.getOfferToken();
                String[] strArr = (String[]) productAndroidOneTimePurchaseOfferDetail2.getOfferTags().toArray(new String[0]);
                Variant_NullType_String wrapVariant2 = wrapVariant(productAndroidOneTimePurchaseOfferDetail2.getFullPriceMicros());
                DiscountDisplayInfoAndroid discountDisplayInfo = productAndroidOneTimePurchaseOfferDetail2.getDiscountDisplayInfo();
                if (discountDisplayInfo != null) {
                    Variant_NullType_Double wrapVariant3 = wrapVariant(discountDisplayInfo.getPercentageDiscount() != null ? Double.valueOf(r11.intValue()) : null);
                    DiscountAmountAndroid discountAmount = discountDisplayInfo.getDiscountAmount();
                    second = new Variant_NullType_NitroDiscountDisplayInfoAndroid.Second(new NitroDiscountDisplayInfoAndroid(discountAmount != null ? new Variant_NullType_NitroDiscountAmountAndroid.Second(new NitroDiscountAmountAndroid(discountAmount.getDiscountAmountMicros(), discountAmount.getFormattedDiscountAmount())) : null, wrapVariant3));
                } else {
                    second = null;
                }
                ValidTimeWindowAndroid validTimeWindow = productAndroidOneTimePurchaseOfferDetail2.getValidTimeWindow();
                Variant_NullType_NitroValidTimeWindowAndroid.Second second4 = validTimeWindow != null ? new Variant_NullType_NitroValidTimeWindowAndroid.Second(new NitroValidTimeWindowAndroid(validTimeWindow.getEndTimeMillis(), validTimeWindow.getStartTimeMillis())) : null;
                if (productAndroidOneTimePurchaseOfferDetail2.getLimitedQuantityInfo() != null) {
                    z2 = z3;
                    list3 = emptyList;
                    list4 = oneTimePurchaseOfferDetailsAndroid;
                    second2 = new Variant_NullType_NitroLimitedQuantityInfoAndroid.Second(new NitroLimitedQuantityInfoAndroid(r4.getMaximumQuantity(), r4.getRemainingQuantity()));
                } else {
                    z2 = z3;
                    list3 = emptyList;
                    list4 = oneTimePurchaseOfferDetailsAndroid;
                    second2 = null;
                }
                PreorderDetailsAndroid preorderDetailsAndroid = productAndroidOneTimePurchaseOfferDetail2.getPreorderDetailsAndroid();
                Variant_NullType_NitroPreorderDetailsAndroid.Second second5 = preorderDetailsAndroid != null ? new Variant_NullType_NitroPreorderDetailsAndroid.Second(new NitroPreorderDetailsAndroid(preorderDetailsAndroid.getPreorderPresaleEndTimeMillis(), preorderDetailsAndroid.getPreorderReleaseTimeMillis())) : null;
                RentalDetailsAndroid rentalDetailsAndroid = productAndroidOneTimePurchaseOfferDetail2.getRentalDetailsAndroid();
                if (rentalDetailsAndroid != null) {
                    String rentalExpirationPeriod = rentalDetailsAndroid.getRentalExpirationPeriod();
                    second3 = new Variant_NullType_NitroRentalDetailsAndroid.Second(new NitroRentalDetailsAndroid(rentalExpirationPeriod != null ? new Variant_NullType_String.Second(rentalExpirationPeriod) : null, rentalDetailsAndroid.getRentalPeriod()));
                } else {
                    second3 = null;
                }
                arrayList.add(new NitroOneTimePurchaseOfferDetail(second, formattedPrice, wrapVariant2, second2, wrapVariant, strArr, offerToken, second5, priceAmountMicros, priceCurrencyCode, second3, second4));
                z3 = z2;
                emptyList = list3;
                oneTimePurchaseOfferDetailsAndroid = list4;
            }
            z = z3;
            list = emptyList;
            list2 = oneTimePurchaseOfferDetailsAndroid;
            nitroOneTimePurchaseOfferDetailArr = (NitroOneTimePurchaseOfferDetail[]) arrayList.toArray(new NitroOneTimePurchaseOfferDetail[0]);
        } else {
            z = z3;
            list = emptyList;
            list2 = oneTimePurchaseOfferDetailsAndroid;
            nitroOneTimePurchaseOfferDetailArr = null;
        }
        if (product.getType() == ProductType.InApp) {
            if (list2 == null || (productAndroidOneTimePurchaseOfferDetail = (ProductAndroidOneTimePurchaseOfferDetail) CollectionsKt.firstOrNull((List) list2)) == null) {
                d = null;
                str = null;
            } else {
                str = productAndroidOneTimePurchaseOfferDetail.getFormattedPrice();
                d = StringsKt.toDoubleOrNull(productAndroidOneTimePurchaseOfferDetail.getPriceAmountMicros());
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            str2 = null;
            str3 = null;
            d2 = null;
            str4 = null;
            d3 = null;
        } else {
            ProductSubscriptionAndroidOfferDetails productSubscriptionAndroidOfferDetails = (ProductSubscriptionAndroidOfferDetails) CollectionsKt.firstOrNull((List) list);
            List<PricingPhaseAndroid> pricingPhaseList = (productSubscriptionAndroidOfferDetails == null || (pricingPhases = productSubscriptionAndroidOfferDetails.getPricingPhases()) == null) ? null : pricingPhases.getPricingPhaseList();
            if (pricingPhaseList == null) {
                pricingPhaseList = CollectionsKt.emptyList();
            }
            if (pricingPhaseList.isEmpty()) {
                d = null;
                str = null;
                str2 = null;
                str3 = null;
                d2 = null;
                str4 = null;
                d3 = null;
            } else {
                List<PricingPhaseAndroid> list7 = pricingPhaseList;
                Iterator<T> it = list7.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((PricingPhaseAndroid) obj).getRecurrenceMode() == 2) {
                        break;
                    }
                }
                PricingPhaseAndroid pricingPhaseAndroid = (PricingPhaseAndroid) obj;
                if (pricingPhaseAndroid == null) {
                    pricingPhaseAndroid = (PricingPhaseAndroid) CollectionsKt.last((List) pricingPhaseList);
                }
                String formattedPrice2 = pricingPhaseAndroid.getFormattedPrice();
                Double doubleOrNull = StringsKt.toDoubleOrNull(pricingPhaseAndroid.getPriceAmountMicros());
                str3 = pricingPhaseAndroid.getBillingPeriod();
                Iterator<T> it2 = list7.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    PricingPhaseAndroid pricingPhaseAndroid2 = (PricingPhaseAndroid) obj2;
                    if (pricingPhaseAndroid2.getBillingCycleCount() > 0) {
                        Long longOrNull = StringsKt.toLongOrNull(pricingPhaseAndroid2.getPriceAmountMicros());
                        if ((longOrNull != null ? longOrNull.longValue() : 0L) > 0) {
                            break;
                        }
                    }
                }
                PricingPhaseAndroid pricingPhaseAndroid3 = (PricingPhaseAndroid) obj2;
                if (pricingPhaseAndroid3 != null) {
                    Double doubleOrNull2 = StringsKt.toDoubleOrNull(pricingPhaseAndroid3.getPriceAmountMicros());
                    d2 = doubleOrNull2 != null ? Double.valueOf(doubleOrNull2.doubleValue() / 1000000.0d) : null;
                    d3 = Double.valueOf(pricingPhaseAndroid3.getBillingCycleCount());
                    str4 = pricingPhaseAndroid3.getBillingPeriod();
                } else {
                    d2 = null;
                    str4 = null;
                    d3 = null;
                }
                Iterator<T> it3 = list7.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    Long longOrNull2 = StringsKt.toLongOrNull(((PricingPhaseAndroid) obj3).getPriceAmountMicros());
                    if ((longOrNull2 != null ? longOrNull2.longValue() : 0L) == 0) {
                        break;
                    }
                }
                PricingPhaseAndroid pricingPhaseAndroid4 = (PricingPhaseAndroid) obj3;
                if (pricingPhaseAndroid4 != null) {
                    str = formattedPrice2;
                    d = doubleOrNull;
                    str2 = pricingPhaseAndroid4.getBillingPeriod();
                } else {
                    str = formattedPrice2;
                    d = doubleOrNull;
                    str2 = null;
                }
            }
            Unit unit3 = Unit.INSTANCE;
        }
        boolean z4 = product instanceof ProductAndroid;
        if (z4) {
            nameAndroid = ((ProductAndroid) product).getNameAndroid();
        } else {
            nameAndroid = z ? ((ProductSubscriptionAndroid) product).getNameAndroid() : null;
        }
        if (z4) {
            ProductStatusAndroid productStatusAndroid2 = ((ProductAndroid) product).getProductStatusAndroid();
            if (productStatusAndroid2 != null) {
                rawValue = productStatusAndroid2.getRawValue();
            }
            rawValue = null;
        } else {
            if (z && (productStatusAndroid = ((ProductSubscriptionAndroid) product).getProductStatusAndroid()) != null) {
                rawValue = productStatusAndroid.getRawValue();
            }
            rawValue = null;
        }
        if (z) {
            subscriptionOffers = ((ProductSubscriptionAndroid) product).getSubscriptionOffers();
        } else {
            subscriptionOffers = z4 ? ((ProductAndroid) product).getSubscriptionOffers() : null;
        }
        if (subscriptionOffers != null) {
            if (subscriptionOffers.isEmpty()) {
                subscriptionOffers = null;
            }
            if (subscriptionOffers != null) {
                str5 = serializeStandardizedSubscriptionOffers(subscriptionOffers);
                if (!z) {
                    discountOffers = ((ProductSubscriptionAndroid) product).getDiscountOffers();
                } else {
                    discountOffers = z4 ? ((ProductAndroid) product).getDiscountOffers() : null;
                }
                if (discountOffers != null) {
                    if (discountOffers.isEmpty()) {
                        discountOffers = null;
                    }
                    if (discountOffers != null) {
                        str6 = serializeStandardizedDiscountOffers(discountOffers);
                        return new NitroProduct(product.getId(), product.getTitle(), product.getDescription(), product.getType().getRawValue(), wrapVariant(product.getDisplayName()), product.getDisplayPrice(), product.getCurrency(), wrapVariant(product.getPrice()), IapPlatform.ANDROID, null, null, null, null, null, null, null, PaymentModeIOS.EMPTY, null, null, null, wrapVariant(str5), wrapVariant(str6), wrapVariant(nameAndroid), wrapVariant(str), wrapVariant(d), wrapVariant(d3), wrapVariant(str4), wrapVariant(d2), wrapVariant(str3), wrapVariant(str2), wrapVariant(serializeSubscriptionOffers), nitroOneTimePurchaseOfferDetailArr != null ? new Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_.Second(nitroOneTimePurchaseOfferDetailArr) : null, wrapVariant(rawValue));
                    }
                }
                str6 = null;
                return new NitroProduct(product.getId(), product.getTitle(), product.getDescription(), product.getType().getRawValue(), wrapVariant(product.getDisplayName()), product.getDisplayPrice(), product.getCurrency(), wrapVariant(product.getPrice()), IapPlatform.ANDROID, null, null, null, null, null, null, null, PaymentModeIOS.EMPTY, null, null, null, wrapVariant(str5), wrapVariant(str6), wrapVariant(nameAndroid), wrapVariant(str), wrapVariant(d), wrapVariant(d3), wrapVariant(str4), wrapVariant(d2), wrapVariant(str3), wrapVariant(str2), wrapVariant(serializeSubscriptionOffers), nitroOneTimePurchaseOfferDetailArr != null ? new Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_.Second(nitroOneTimePurchaseOfferDetailArr) : null, wrapVariant(rawValue));
            }
        }
        str5 = null;
        if (!z) {
        }
        if (discountOffers != null) {
        }
        str6 = null;
        return new NitroProduct(product.getId(), product.getTitle(), product.getDescription(), product.getType().getRawValue(), wrapVariant(product.getDisplayName()), product.getDisplayPrice(), product.getCurrency(), wrapVariant(product.getPrice()), IapPlatform.ANDROID, null, null, null, null, null, null, null, PaymentModeIOS.EMPTY, null, null, null, wrapVariant(str5), wrapVariant(str6), wrapVariant(nameAndroid), wrapVariant(str), wrapVariant(d), wrapVariant(d3), wrapVariant(str4), wrapVariant(d2), wrapVariant(str3), wrapVariant(str2), wrapVariant(serializeSubscriptionOffers), nitroOneTimePurchaseOfferDetailArr != null ? new Variant_NullType_Array_NitroOneTimePurchaseOfferDetail_.Second(nitroOneTimePurchaseOfferDetailArr) : null, wrapVariant(rawValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NitroPurchase convertToNitroPurchase(dev.hyo.openiap.Purchase purchase) {
        dev.hyo.openiap.PurchaseAndroid purchaseAndroid = purchase instanceof dev.hyo.openiap.PurchaseAndroid ? (dev.hyo.openiap.PurchaseAndroid) purchase : null;
        int i = WhenMappings.$EnumSwitchMapping$1[purchase.getPurchaseState().ordinal()];
        return new NitroPurchase(purchase.getId(), purchase.getProductId(), purchase.getTransactionDate(), wrapVariant(purchase.getPurchaseToken()), IapPlatform.ANDROID, mapIapStore(purchase.getStore()), purchase.getQuantity(), mapPurchaseState(purchase.getPurchaseState()), purchase.isAutoRenewing(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, wrapVariant(purchaseAndroid != null ? purchaseAndroid.getPurchaseToken() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getDataAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getSignatureAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getAutoRenewingAndroid() : null), wrapVariant(Double.valueOf(i != 1 ? i != 2 ? 0.0d : 2.0d : 1.0d)), wrapVariant(purchaseAndroid != null ? purchaseAndroid.isAcknowledgedAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getPackageNameAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getObfuscatedAccountIdAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getObfuscatedProfileIdAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.getDeveloperPayloadAndroid() : null), wrapVariant(purchaseAndroid != null ? purchaseAndroid.isSuspendedAndroid() : null));
    }

    private final PurchaseState mapPurchaseState(dev.hyo.openiap.PurchaseState state) {
        int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            return PurchaseState.PURCHASED;
        }
        if (i == 2) {
            return PurchaseState.PENDING;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PurchaseState.UNKNOWN;
    }

    private final IapStore mapIapStore(dev.hyo.openiap.IapStore store) {
        int i = WhenMappings.$EnumSwitchMapping$2[store.ordinal()];
        if (i == 1) {
            return IapStore.APPLE;
        }
        if (i == 2) {
            return IapStore.GOOGLE;
        }
        if (i == 3) {
            return IapStore.HORIZON;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return IapStore.UNKNOWN;
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<String> getStorefrontIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getStorefrontIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_String> getAppTransactionIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getAppTransactionIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Unit> deepLinkToSubscriptionsAndroid(NitroDeepLinkOptionsAndroid options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$deepLinkToSubscriptionsAndroid$1(this, options, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_NitroProduct> getPromotedProductIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getPromotedProductIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_NitroProduct> requestPromotedProductIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$requestPromotedProductIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Unit> buyPromotedProductIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$buyPromotedProductIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> presentCodeRedemptionSheetIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$presentCodeRedemptionSheetIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Unit> clearTransactionIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$clearTransactionIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_String> beginRefundRequestIOS(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$beginRefundRequestIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroPurchase[]> showManageSubscriptionsIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$showManageSubscriptionsIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> deepLinkToSubscriptionsIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$deepLinkToSubscriptionsIOS$1(null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid> validateReceipt(NitroReceiptValidationParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$validateReceipt$1(params, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroVerifyPurchaseWithProviderResult> verifyPurchaseWithProvider(NitroVerifyPurchaseWithProviderProps params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$verifyPurchaseWithProvider$1(params, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_Array_NitroSubscriptionStatus_> subscriptionStatusIOS(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$subscriptionStatusIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_NitroPurchase> currentEntitlementIOS(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$currentEntitlementIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_NitroPurchase> latestTransactionIOS(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$latestTransactionIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroPurchase[]> getPendingTransactionsIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getPendingTransactionsIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> syncIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$syncIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> isEligibleForIntroOfferIOS(String groupID) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$isEligibleForIntroOfferIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<String> getReceiptDataIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getReceiptDataIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<String> getReceiptIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getReceiptIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<String> requestReceiptRefreshIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$requestReceiptRefreshIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> isTransactionVerifiedIOS(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$isTransactionVerifiedIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_String> getTransactionJwsIOS(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getTransactionJwsIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> checkAlternativeBillingAvailabilityAndroid() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$checkAlternativeBillingAvailabilityAndroid$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> showAlternativeBillingDialogAndroid() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$showAlternativeBillingDialogAndroid$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Variant_NullType_String> createAlternativeBillingTokenAndroid(Variant_NullType_String sku) {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$createAlternativeBillingTokenAndroid$1(this, sku, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void addUserChoiceBillingListenerAndroid(Function1<? super UserChoiceBillingDetails, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.userChoiceBillingListenersAndroid) {
            this.userChoiceBillingListenersAndroid.add(listener);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void removeUserChoiceBillingListenerAndroid(Function1<? super UserChoiceBillingDetails, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.userChoiceBillingListenersAndroid) {
            this.userChoiceBillingListenersAndroid.remove(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendUserChoiceBilling(UserChoiceBillingDetails details) {
        ArrayList arrayList;
        synchronized (this.userChoiceBillingListenersAndroid) {
            arrayList = new ArrayList(this.userChoiceBillingListenersAndroid);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(details);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void addDeveloperProvidedBillingListenerAndroid(Function1<? super DeveloperProvidedBillingDetailsAndroid, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.developerProvidedBillingListenersAndroid) {
            this.developerProvidedBillingListenersAndroid.add(listener);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void removeDeveloperProvidedBillingListenerAndroid(Function1<? super DeveloperProvidedBillingDetailsAndroid, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.developerProvidedBillingListenersAndroid) {
            this.developerProvidedBillingListenersAndroid.remove(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDeveloperProvidedBilling(DeveloperProvidedBillingDetailsAndroid details) {
        ArrayList arrayList;
        synchronized (this.developerProvidedBillingListenersAndroid) {
            arrayList = new ArrayList(this.developerProvidedBillingListenersAndroid);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(details);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenIapStore getOpenIapStore() {
        return (OpenIapStore) this.openIapStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenIapStore openIapStore_delegate$lambda$63(HybridRnIap hybridRnIap) {
        return new OpenIapStore(hybridRnIap.getOpenIap());
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public void enableBillingProgramAndroid(BillingProgramAndroid program) {
        Intrinsics.checkNotNullParameter(program, "program");
        RnIapLog.INSTANCE.payload("enableBillingProgramAndroid", MapsKt.mapOf(TuplesKt.to("program", program.name())));
        try {
            getOpenIapStore().enableBillingProgram(mapBillingProgram(program));
            RnIapLog.INSTANCE.result("enableBillingProgramAndroid", true);
        } catch (Throwable th) {
            RnIapLog.INSTANCE.failure("enableBillingProgramAndroid", th);
        }
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroBillingProgramAvailabilityResultAndroid> isBillingProgramAvailableAndroid(BillingProgramAndroid program) {
        Intrinsics.checkNotNullParameter(program, "program");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$isBillingProgramAvailableAndroid$1(program, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<NitroBillingProgramReportingDetailsAndroid> createBillingProgramReportingDetailsAndroid(BillingProgramAndroid program) {
        Intrinsics.checkNotNullParameter(program, "program");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$createBillingProgramReportingDetailsAndroid$1(program, this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> launchExternalLinkAndroid(NitroLaunchExternalLinkParamsAndroid params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$launchExternalLinkAndroid$1(params, this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dev.hyo.openiap.BillingProgramAndroid mapBillingProgram(BillingProgramAndroid program) {
        int i = WhenMappings.$EnumSwitchMapping$3[program.ordinal()];
        if (i == 1) {
            return dev.hyo.openiap.BillingProgramAndroid.Unspecified;
        }
        if (i == 2) {
            return dev.hyo.openiap.BillingProgramAndroid.ExternalContentLink;
        }
        if (i == 3) {
            return dev.hyo.openiap.BillingProgramAndroid.ExternalOffer;
        }
        if (i == 4) {
            return dev.hyo.openiap.BillingProgramAndroid.ExternalPayments;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return dev.hyo.openiap.BillingProgramAndroid.UserChoiceBilling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dev.hyo.openiap.ExternalLinkLaunchModeAndroid mapExternalLinkLaunchMode(ExternalLinkLaunchModeAndroid mode) {
        int i = WhenMappings.$EnumSwitchMapping$4[mode.ordinal()];
        if (i == 1) {
            return dev.hyo.openiap.ExternalLinkLaunchModeAndroid.Unspecified;
        }
        if (i == 2) {
            return dev.hyo.openiap.ExternalLinkLaunchModeAndroid.LaunchInExternalBrowserOrApp;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return dev.hyo.openiap.ExternalLinkLaunchModeAndroid.CallerWillLaunchLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dev.hyo.openiap.ExternalLinkTypeAndroid mapExternalLinkType(ExternalLinkTypeAndroid type) {
        int i = WhenMappings.$EnumSwitchMapping$5[type.ordinal()];
        if (i == 1) {
            return dev.hyo.openiap.ExternalLinkTypeAndroid.Unspecified;
        }
        if (i == 2) {
            return dev.hyo.openiap.ExternalLinkTypeAndroid.LinkToDigitalContentOffer;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return dev.hyo.openiap.ExternalLinkTypeAndroid.LinkToAppDownload;
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> canPresentExternalPurchaseNoticeIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$canPresentExternalPurchaseNoticeIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<ExternalPurchaseNoticeResultIOS> presentExternalPurchaseNoticeSheetIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$presentExternalPurchaseNoticeSheetIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<ExternalPurchaseLinkResultIOS> presentExternalPurchaseLinkIOS(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$presentExternalPurchaseLinkIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<Boolean> isEligibleForExternalPurchaseCustomLinkIOS() {
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$isEligibleForExternalPurchaseCustomLinkIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<ExternalPurchaseCustomLinkTokenResultIOS> getExternalPurchaseCustomLinkTokenIOS(ExternalPurchaseCustomLinkTokenTypeIOS tokenType) {
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$getExternalPurchaseCustomLinkTokenIOS$1(this, null), 1, null);
    }

    @Override // com.margelo.nitro.iap.HybridRnIapSpec
    public Promise<ExternalPurchaseCustomLinkNoticeResultIOS> showExternalPurchaseCustomLinkNoticeIOS(ExternalPurchaseCustomLinkNoticeTypeIOS noticeType) {
        Intrinsics.checkNotNullParameter(noticeType, "noticeType");
        return Promise.Companion.async$default(Promise.INSTANCE, null, new HybridRnIap$showExternalPurchaseCustomLinkNoticeIOS$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenIapError parseOpenIapError(Throwable err) {
        while (err != null) {
            String message = err.getMessage();
            if (message == null) {
                message = "";
            }
            String str = message;
            if (StringsKt.contains((CharSequence) str, (CharSequence) "not prepared", true) || StringsKt.contains((CharSequence) str, (CharSequence) "not initialized", true)) {
                return OpenIapError.NotPrepared.INSTANCE;
            }
            if (StringsKt.contains((CharSequence) str, (CharSequence) "developer error", true) || StringsKt.contains((CharSequence) str, (CharSequence) "activity not available", true)) {
                return OpenIapError.DeveloperError.INSTANCE;
            }
            if (StringsKt.contains((CharSequence) str, (CharSequence) "network", true)) {
                return OpenIapError.NetworkError.INSTANCE;
            }
            if (StringsKt.contains((CharSequence) str, (CharSequence) "service unavailable", true) || StringsKt.contains((CharSequence) str, (CharSequence) "billing unavailable", true)) {
                return OpenIapError.ServiceUnavailable.INSTANCE;
            }
            err = err.getCause();
        }
        return OpenIapError.ServiceUnavailable.INSTANCE;
    }

    static /* synthetic */ String toErrorJson$default(HybridRnIap hybridRnIap, OpenIapError openIapError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return hybridRnIap.toErrorJson(openIapError, str, str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r14 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toErrorJson(OpenIapError error, String productId, String debugMessage, String messageOverride) {
        String valueOf;
        String code = OpenIapError.INSTANCE.toCode(error);
        String str = null;
        if (messageOverride != null) {
            if (StringsKt.isBlank(messageOverride)) {
                messageOverride = null;
            }
        }
        String message = error.getMessage();
        if (message != null && !StringsKt.isBlank(message)) {
            str = message;
        }
        messageOverride = str == null ? OpenIapError.INSTANCE.defaultMessage(code) : str;
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("code", code), TuplesKt.to("message", messageOverride));
        mutableMapOf.put("responseCode", -1);
        if (debugMessage != null) {
            mutableMapOf.put("debugMessage", debugMessage);
        } else {
            String message2 = error.getMessage();
            if (message2 != null) {
                mutableMapOf.put("debugMessage", message2);
            }
        }
        if (productId != null) {
            mutableMapOf.put("productId", productId);
        }
        try {
            ArrayList arrayList = new ArrayList(mutableMapOf.size());
            for (Map.Entry entry : mutableMapOf.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    valueOf = "\"" + StringsKt.replace$default((String) value, "\"", "\\\"", false, 4, (Object) null) + "\"";
                } else if (value instanceof Number) {
                    valueOf = value.toString();
                } else {
                    valueOf = value instanceof Boolean ? String.valueOf(((Boolean) value).booleanValue()) : "\"" + value + "\"";
                }
                arrayList.add("\"" + str2 + "\":" + valueOf);
            }
            return "{" + CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null) + "}";
        } catch (Exception unused) {
            return code + ": " + messageOverride;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r2.equals("READY_TO_CONSUME") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        return com.margelo.nitro.iap.IapkitPurchaseState.READY_TO_CONSUME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r2.equals("PENDING_ACKNOWLEDGMENT") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r2.equals("READY-TO-CONSUME") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2.equals("PENDING-ACKNOWLEDGMENT") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        return com.margelo.nitro.iap.IapkitPurchaseState.PENDING_ACKNOWLEDGMENT;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IapkitPurchaseState mapIapkitPurchaseState(String stateName) {
        String upperCase = stateName.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1791011564:
                break;
            case -1319484683:
                if (upperCase.equals("ENTITLED")) {
                    return IapkitPurchaseState.ENTITLED;
                }
                return IapkitPurchaseState.UNKNOWN;
            case -591252731:
                if (upperCase.equals("EXPIRED")) {
                    return IapkitPurchaseState.EXPIRED;
                }
                return IapkitPurchaseState.UNKNOWN;
            case -518720776:
                if (upperCase.equals("INAUTHENTIC")) {
                    return IapkitPurchaseState.INAUTHENTIC;
                }
                return IapkitPurchaseState.UNKNOWN;
            case -401624177:
                break;
            case -203095468:
                break;
            case 35394935:
                if (upperCase.equals("PENDING")) {
                    return IapkitPurchaseState.PENDING;
                }
                return IapkitPurchaseState.UNKNOWN;
            case 214856680:
                if (upperCase.equals("CONSUMED")) {
                    return IapkitPurchaseState.CONSUMED;
                }
                return IapkitPurchaseState.UNKNOWN;
            case 659453081:
                if (upperCase.equals("CANCELED")) {
                    return IapkitPurchaseState.CANCELED;
                }
                return IapkitPurchaseState.UNKNOWN;
            case 1530196701:
                break;
            default:
                return IapkitPurchaseState.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IapStore mapIapkitStore(String storeName) {
        String upperCase = storeName.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int hashCode = upperCase.hashCode();
        if (hashCode != 62491450) {
            if (hashCode != 1815451003) {
                if (hashCode == 2108052025 && upperCase.equals("GOOGLE")) {
                    return IapStore.GOOGLE;
                }
            } else if (upperCase.equals("HORIZON")) {
                return IapStore.HORIZON;
            }
        } else if (upperCase.equals("APPLE")) {
            return IapStore.APPLE;
        }
        return IapStore.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseVerificationProvider mapPurchaseVerificationProvider(String providerName) {
        String upperCase = providerName.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return Intrinsics.areEqual(upperCase, "IAPKIT") ? PurchaseVerificationProvider.IAPKIT : PurchaseVerificationProvider.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getIapkitApiKeyFromManifest() {
        try {
            ApplicationInfo applicationInfo = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getString("dev.iapkit.API_KEY");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    static /* synthetic */ NitroPurchaseResult toErrorResult$default(HybridRnIap hybridRnIap, OpenIapError openIapError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return hybridRnIap.toErrorResult(openIapError, str, str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r11 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NitroPurchaseResult toErrorResult(OpenIapError error, String productId, String debugMessage, String messageOverride) {
        String str;
        String code = OpenIapError.INSTANCE.toCode(error);
        String str2 = null;
        if (messageOverride != null) {
            if (StringsKt.isBlank(messageOverride)) {
                messageOverride = null;
            }
        }
        String message = error.getMessage();
        if (message != null && !StringsKt.isBlank(message)) {
            str2 = message;
        }
        if (str2 == null) {
            messageOverride = OpenIapError.INSTANCE.defaultMessage(code);
            str = messageOverride;
            if (debugMessage == null) {
                debugMessage = error.getMessage();
            }
            return new NitroPurchaseResult(-1.0d, debugMessage, code, str, null);
        }
        str = str2;
        if (debugMessage == null) {
        }
        return new NitroPurchaseResult(-1.0d, debugMessage, code, str, null);
    }
}
