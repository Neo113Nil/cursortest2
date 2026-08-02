package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt$$ExternalSyntheticLambda0;
import com.stripe.android.Stripe;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.stripe.android.payments.SetupIntentFlowResultProcessor$$ExternalSyntheticLambda0;
import io.noties.markwon.LinkResolverDef;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentAnalyticsRequestFactory extends AnalyticsRequestFactory {
    public final Set defaultProductUsageTokens;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType", "", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "toString", "()Ljava/lang/String;", "io/noties/markwon/LinkResolverDef", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ThreeDS2UiType {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ ThreeDS2UiType[] $VALUES;
        public static final LinkResolverDef Companion;
        public static final ThreeDS2UiType None;
        public final String code;
        public final String typeName;

        static {
            ThreeDS2UiType threeDS2UiType = new ThreeDS2UiType("None", 0, null, "none");
            None = threeDS2UiType;
            ThreeDS2UiType[] threeDS2UiTypeArr = {threeDS2UiType, new ThreeDS2UiType("Text", 1, "01", "text"), new ThreeDS2UiType("SingleSelect", 2, "02", "single_select"), new ThreeDS2UiType("MultiSelect", 3, "03", "multi_select"), new ThreeDS2UiType("Oob", 4, "04", "oob"), new ThreeDS2UiType("Html", 5, "05", "html")};
            $VALUES = threeDS2UiTypeArr;
            $ENTRIES = new EnumEntriesList(threeDS2UiTypeArr);
            Companion = new LinkResolverDef(15);
        }

        public ThreeDS2UiType(String str, int i, String str2, String str3) {
            this.code = str2;
            this.typeName = str3;
        }

        public static ThreeDS2UiType valueOf(String str) {
            return (ThreeDS2UiType) Enum.valueOf(ThreeDS2UiType.class, str);
        }

        public static ThreeDS2UiType[] values() {
            return (ThreeDS2UiType[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.typeName;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAnalyticsRequestFactory(Context context, Function0 function0, Set set) {
        super(r2, r3, r0 == null ? "" : r0, new SetupIntentFlowResultProcessor$$ExternalSyntheticLambda0(1, function0), new StripePaymentController$$ExternalSyntheticLambda0(new NetworkTypeDetector(context), 2));
        Object failure;
        context.getClass();
        function0.getClass();
        set.getClass();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        try {
            Result.Companion companion = Result.Companion;
            failure = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        PackageInfo packageInfo = (PackageInfo) (failure instanceof Result.Failure ? null : failure);
        String packageName = context.getApplicationContext().getPackageName();
        this.defaultProductUsageTokens = set;
    }

    public static AnalyticsRequest createRequest$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, ThreeDS2UiType threeDS2UiType, String str2, int i) {
        Set set2 = (i & 2) != 0 ? EmptySet.INSTANCE : set;
        String str3 = (i & 4) != 0 ? null : str;
        ThreeDS2UiType threeDS2UiType2 = (i & 16) != 0 ? null : threeDS2UiType;
        String str4 = (i & 32) != 0 ? null : str2;
        paymentAnalyticsRequestFactory.getClass();
        paymentAnalyticsEvent.getClass();
        set2.getClass();
        LinkedHashSet plus = SetsKt___SetsKt.plus(paymentAnalyticsRequestFactory.defaultProductUsageTokens, (Iterable) set2);
        LinkedHashSet linkedHashSet = !plus.isEmpty() ? plus : null;
        Map m = linkedHashSet != null ? Thread$State$EnumUnboxingLocalUtility.m("product_usage", CollectionsKt.joinToString$default(linkedHashSet, ",", null, null, 0, null, null, 62)) : null;
        if (m == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        }
        Map m2 = str3 != null ? Thread$State$EnumUnboxingLocalUtility.m("source_type", str3) : null;
        if (m2 == null) {
            m2 = EmptyMap.INSTANCE;
            m2.getClass();
        }
        LinkedHashMap plus2 = MapsKt__MapsKt.plus(m, m2);
        String str5 = str3 == null ? "unknown" : null;
        Map m3 = str5 != null ? Thread$State$EnumUnboxingLocalUtility.m("token_type", str5) : null;
        if (m3 == null) {
            m3 = EmptyMap.INSTANCE;
            m3.getClass();
        }
        LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, m3);
        Map m4 = threeDS2UiType2 != null ? Thread$State$EnumUnboxingLocalUtility.m("3ds2_ui_type", threeDS2UiType2.toString()) : null;
        if (m4 == null) {
            m4 = EmptyMap.INSTANCE;
            m4.getClass();
        }
        LinkedHashMap plus4 = MapsKt__MapsKt.plus(plus3, m4);
        Map m5 = str4 != null ? Thread$State$EnumUnboxingLocalUtility.m("error_message", str4) : null;
        if (m5 == null) {
            m5 = EmptyMap.INSTANCE;
            m5.getClass();
        }
        return paymentAnalyticsRequestFactory.createRequest(paymentAnalyticsEvent, MapsKt__MapsKt.plus(plus4, m5));
    }

    public final AnalyticsRequest create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent paymentAnalyticsEvent, String str) {
        Object obj;
        ThreeDS2UiType.Companion.getClass();
        Iterator it = ThreeDS2UiType.$ENTRIES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ThreeDS2UiType) obj).code, str)) {
                break;
            }
        }
        ThreeDS2UiType threeDS2UiType = (ThreeDS2UiType) obj;
        if (threeDS2UiType == null) {
            threeDS2UiType = ThreeDS2UiType.None;
        }
        return createRequest$payments_core_release$default(this, paymentAnalyticsEvent, null, null, threeDS2UiType, null, 46);
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestFactory
    public final AnalyticsRequest createRequest(AnalyticsEvent analyticsEvent, Map map) {
        analyticsEvent.getClass();
        map.getClass();
        Set set = this.defaultProductUsageTokens;
        if (set.isEmpty()) {
            set = null;
        }
        Map m = set != null ? Thread$State$EnumUnboxingLocalUtility.m("product_usage", CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62)) : null;
        if (m == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        }
        LinkedHashMap plus = MapsKt__MapsKt.plus(m, map);
        boolean z = Stripe.advancedFraudSignalsEnabled;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return super.createRequest(analyticsEvent, MapsKt__MapsKt.plus(plus, emptyMap));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, String str, Set set) {
        this(context, new PromotionsTitleBarKt$$ExternalSyntheticLambda0(str, 1), set);
        context.getClass();
        str.getClass();
        set.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2, Set set) {
        super(packageManager, packageInfo, str, provider, provider2);
        set.getClass();
        this.defaultProductUsageTokens = set;
    }
}
