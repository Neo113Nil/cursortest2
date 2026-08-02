package com.stripe.android.model.parsers;

import android.net.Uri;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.internal.mlkit_common.zzs;
import com.google.android.libraries.places.api.model.zzco;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.CvcCheck;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.MicrodepositType;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class SetupIntentJsonParser implements ModelJsonParser {
    public static final SetupIntentJsonParser INSTANCE = new SetupIntentJsonParser(1);
    public static final SetupIntentJsonParser INSTANCE$1 = new SetupIntentJsonParser(2);
    public static final SetupIntentJsonParser INSTANCE$2 = new SetupIntentJsonParser(3);
    public static final SetupIntentJsonParser INSTANCE$3 = new SetupIntentJsonParser(4);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SetupIntentJsonParser(int i) {
        this.$r8$classId = i;
    }

    public static ConsumerPaymentDetails.BillingAddress parseBillingAddress(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("billing_address");
        if (optJSONObject == null) {
            return null;
        }
        String optString = StripeJsonUtils.optString("name", optJSONObject);
        String optString2 = StripeJsonUtils.optString("line_1", optJSONObject);
        String optString3 = StripeJsonUtils.optString("line_2", optJSONObject);
        String optString4 = StripeJsonUtils.optString("locality", optJSONObject);
        String optString5 = StripeJsonUtils.optString("postal_code", optJSONObject);
        String optString6 = StripeJsonUtils.optString("administrative_area", optJSONObject);
        String optString7 = StripeJsonUtils.optString("country_code", optJSONObject);
        return new ConsumerPaymentDetails.BillingAddress(optString, optString2, optString3, optString6, optString4, optString5, optString7 != null ? new CountryCode(optString7) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    public static zzco parsePaymentDetails(JSONObject jSONObject) {
        ?? r12;
        Object obj;
        String optString = StripeJsonUtils.optString("type", jSONObject);
        ConsumerPaymentDetails.Card.Funding funding = null;
        if (optString != null) {
            String string2 = jSONObject.getString("id");
            boolean optBoolean = jSONObject.optBoolean("is_default");
            String optString2 = StripeJsonUtils.optString("nickname", jSONObject);
            String str = (optString2 == null || StringsKt.isBlank(optString2)) ? null : optString2;
            Locale locale = Locale.ROOT;
            String lowerCase = optString.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("card")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("card_details");
                JSONObject optJSONObject = jSONObject2.optJSONObject("checks");
                JSONArray optJSONArray = jSONObject2.optJSONArray("networks");
                if (optJSONArray != null) {
                    IntRange until = RangesKt___RangesKt.until(0, optJSONArray.length());
                    r12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                    IntProgressionIterator it = until.iterator();
                    while (it.hasNext) {
                        r12.add(optJSONArray.getString(it.nextInt()));
                    }
                } else {
                    r12 = EmptyList.INSTANCE;
                }
                List list = r12;
                string2.getClass();
                int i = jSONObject2.getInt("exp_year");
                int i2 = jSONObject2.getInt("exp_month");
                y0 y0Var = CardBrand.Companion;
                String string3 = jSONObject2.getString("brand");
                string3.getClass();
                String lowerCase2 = string3.toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase2.equals("american_express")) {
                    lowerCase2 = "amex";
                } else if (lowerCase2.equals("diners_club")) {
                    lowerCase2 = "diners";
                }
                y0Var.getClass();
                CardBrand fromCode = y0.fromCode(lowerCase2);
                String string4 = jSONObject2.getString("last4");
                string4.getClass();
                y0 y0Var2 = CvcCheck.Companion;
                String string5 = optJSONObject != null ? optJSONObject.getString("cvc_check") : null;
                y0Var2.getClass();
                Iterator it2 = CvcCheck.$ENTRIES.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((CvcCheck) obj).code.equalsIgnoreCase(string5)) {
                        break;
                    }
                }
                CvcCheck cvcCheck = (CvcCheck) obj;
                if (cvcCheck == null) {
                    cvcCheck = CvcCheck.Unknown;
                }
                CvcCheck cvcCheck2 = cvcCheck;
                POPMatchingFactory pOPMatchingFactory = ConsumerPaymentDetails.Card.Funding.Companion;
                String string6 = jSONObject2.getString("funding");
                pOPMatchingFactory.getClass();
                Iterator it3 = ConsumerPaymentDetails.Card.Funding.$ENTRIES.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ?? next = it3.next();
                    if (((ConsumerPaymentDetails.Card.Funding) next).code.equals(string6)) {
                        funding = next;
                        break;
                    }
                }
                ConsumerPaymentDetails.Card.Funding funding2 = funding;
                if (funding2 == null) {
                    funding2 = ConsumerPaymentDetails.Card.Funding.Unknown;
                }
                return new ConsumerPaymentDetails.Card(string2, string4, optBoolean, str, parseBillingAddress(jSONObject), StripeJsonUtils.optString("billing_email_address", jSONObject), i, i2, fromCode, list, cvcCheck2, funding2);
            }
            if (lowerCase.equals("bank_account")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("bank_account_details");
                string2.getClass();
                String string7 = jSONObject3.getString("last4");
                string7.getClass();
                return new ConsumerPaymentDetails.BankAccount(string2, string7, optBoolean, str, StripeJsonUtils.optString("bank_account_name", jSONObject3), StripeJsonUtils.optString("bank_icon_code", jSONObject3), parseBillingAddress(jSONObject), StripeJsonUtils.optString("billing_email_address", jSONObject));
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x060d, code lost:
    
        if (r7 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0743, code lost:
    
        if (r6 != false) goto L253;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x048b A[LOOP:11: B:142:0x0485->B:144:0x048b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e7 A[LOOP:13: B:154:0x04e1->B:156:0x04e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x089e A[LOOP:19: B:349:0x0898->B:351:0x089e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08fe A[LOOP:21: B:361:0x08f8->B:363:0x08fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0969 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0885  */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v29, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v68, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /* renamed from: parse */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StripeModel mo4026parse(JSONObject jSONObject) {
        String str;
        JSONArray optJSONArray;
        ?? r7;
        Iterator it;
        JSONArray optJSONArray2;
        PaymentMethod paymentMethod;
        ?? r8;
        Iterator it2;
        Iterator it3;
        Object obj;
        JSONArray optJSONArray3;
        ?? r4;
        JSONObject optJSONObject;
        SetupIntent.Error error;
        Object obj2;
        ?? listOf;
        zzco parsePaymentDetails;
        ?? failure;
        boolean z;
        String str2;
        List list;
        ?? r5;
        Object obj3;
        Object obj4;
        Object obj5;
        String str3;
        JSONObject optJSONObject2;
        PaymentIntent.Error error2;
        JSONObject optJSONObject3;
        PaymentIntent.Shipping shipping;
        JSONArray optJSONArray4;
        ?? r52;
        Iterator it4;
        JSONArray optJSONArray5;
        ?? r6;
        Iterator it5;
        Object obj6;
        long j;
        Stripe3ds2AuthResult.Ares ares;
        ArrayList arrayList;
        long j2;
        Iterator it6;
        Map map;
        int i = 0;
        MicrodepositType microdepositType = null;
        switch (this.$r8$classId) {
            case 0:
                if (!"setup_intent".equals(StripeJsonUtils.optString("object", jSONObject))) {
                    return null;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("payment_method");
                PaymentMethod parse = optJSONObject4 != null ? parse(optJSONObject4) : null;
                String optString = StripeJsonUtils.optString("payment_method", jSONObject);
                if (parse != null) {
                    optString = null;
                }
                if (optString == null) {
                    if (parse == null) {
                        str = null;
                        optJSONArray = jSONObject.optJSONArray("unactivated_payment_method_types");
                        if (optJSONArray == null) {
                            IntRange until = RangesKt___RangesKt.until(0, optJSONArray.length());
                            r7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                            IntProgressionIterator it7 = until.iterator();
                            while (it7.hasNext) {
                                r7.add(optJSONArray.getString(it7.nextInt()));
                            }
                        } else {
                            r7 = EmptyList.INSTANCE;
                        }
                        Iterable iterable = (Iterable) r7;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            arrayList2.add(lowerCase);
                        }
                        optJSONArray2 = jSONObject.optJSONArray("link_funding_sources");
                        if (optJSONArray2 == null) {
                            IntRange until2 = RangesKt___RangesKt.until(0, optJSONArray2.length());
                            paymentMethod = parse;
                            r8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until2, 10));
                            IntProgressionIterator it8 = until2.iterator();
                            while (it8.hasNext) {
                                r8.add(optJSONArray2.getString(it8.nextInt()));
                            }
                        } else {
                            paymentMethod = parse;
                            r8 = EmptyList.INSTANCE;
                        }
                        Iterable iterable2 = (Iterable) r8;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                        it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            arrayList3.add(lowerCase2);
                        }
                        JSONObject optJSONObject5 = jSONObject.optJSONObject("payment_method_options");
                        String jSONObject2 = optJSONObject5 == null ? optJSONObject5.toString() : null;
                        JSONObject optJSONObject6 = jSONObject.optJSONObject("automatic_payment_methods");
                        boolean z2 = optJSONObject6 == null && optJSONObject6.optBoolean("enabled");
                        String optString2 = StripeJsonUtils.optString("id", jSONObject);
                        long optLong = jSONObject.optLong("created");
                        String optString3 = StripeJsonUtils.optString("client_secret", jSONObject);
                        KClasses$$Lambda$1 kClasses$$Lambda$1 = SetupIntent.CancellationReason.Companion;
                        String optString4 = StripeJsonUtils.optString("cancellation_reason", jSONObject);
                        kClasses$$Lambda$1.getClass();
                        it3 = SetupIntent.CancellationReason.$ENTRIES.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = null;
                            } else {
                                obj = it3.next();
                                if (((SetupIntent.CancellationReason) obj).code.equals(optString4)) {
                                }
                            }
                        }
                        SetupIntent.CancellationReason cancellationReason = (SetupIntent.CancellationReason) obj;
                        String optString5 = StripeJsonUtils.optString("country_code", jSONObject);
                        String optString6 = StripeJsonUtils.optString("description", jSONObject);
                        boolean optBoolean = jSONObject.optBoolean("livemode");
                        optJSONArray3 = jSONObject.optJSONArray("payment_method_types");
                        if (optJSONArray3 == null) {
                            IntRange until3 = RangesKt___RangesKt.until(0, optJSONArray3.length());
                            r4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until3, 10));
                            IntProgressionIterator it9 = until3.iterator();
                            while (it9.hasNext) {
                                r4.add(optJSONArray3.getString(it9.nextInt()));
                            }
                        } else {
                            r4 = EmptyList.INSTANCE;
                        }
                        List list2 = r4;
                        LinkResolverDef linkResolverDef = StripeIntent.Status.Companion;
                        String optString7 = StripeJsonUtils.optString("status", jSONObject);
                        linkResolverDef.getClass();
                        StripeIntent.Status fromCode$payments_core_release = LinkResolverDef.fromCode$payments_core_release(optString7);
                        y0 y0Var = StripeIntent.Usage.Companion;
                        String optString8 = StripeJsonUtils.optString("usage", jSONObject);
                        y0Var.getClass();
                        StripeIntent.Usage fromCode$payments_core_release2 = y0.fromCode$payments_core_release(optString8);
                        optJSONObject = jSONObject.optJSONObject("last_setup_error");
                        if (optJSONObject == null) {
                            String optString9 = StripeJsonUtils.optString("code", optJSONObject);
                            String optString10 = StripeJsonUtils.optString("decline_code", optJSONObject);
                            String optString11 = StripeJsonUtils.optString("doc_url", optJSONObject);
                            String optString12 = StripeJsonUtils.optString("message", optJSONObject);
                            String optString13 = StripeJsonUtils.optString("param", optJSONObject);
                            JSONObject optJSONObject7 = optJSONObject.optJSONObject("payment_method");
                            PaymentMethod parse2 = optJSONObject7 != null ? parse(optJSONObject7) : null;
                            POPMatchingFactory pOPMatchingFactory = SetupIntent.Error.Type.Companion;
                            String optString14 = StripeJsonUtils.optString("type", optJSONObject);
                            pOPMatchingFactory.getClass();
                            Iterator it10 = SetupIntent.Error.Type.$ENTRIES.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    obj2 = it10.next();
                                    if (((SetupIntent.Error.Type) obj2).code.equals(optString14)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            error = new SetupIntent.Error(optString9, optString10, optString11, optString12, optString13, parse2, (SetupIntent.Error.Type) obj2);
                        } else {
                            error = null;
                        }
                        JSONObject optJSONObject8 = jSONObject.optJSONObject("next_action");
                        return new SetupIntent(optString2, cancellationReason, optLong, optString5, optString3, optString6, optBoolean, paymentMethod, str, list2, fromCode$payments_core_release, fromCode$payments_core_release2, error, arrayList2, arrayList3, optJSONObject8 != null ? zzs.parse(optJSONObject8) : null, jSONObject2, z2);
                    }
                    optString = parse.id;
                }
                str = optString;
                optJSONArray = jSONObject.optJSONArray("unactivated_payment_method_types");
                if (optJSONArray == null) {
                }
                Iterable iterable3 = (Iterable) r7;
                ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable3, 10));
                it = iterable3.iterator();
                while (it.hasNext()) {
                }
                optJSONArray2 = jSONObject.optJSONArray("link_funding_sources");
                if (optJSONArray2 == null) {
                }
                Iterable iterable22 = (Iterable) r8;
                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable22, 10));
                it2 = iterable22.iterator();
                while (it2.hasNext()) {
                }
                JSONObject optJSONObject52 = jSONObject.optJSONObject("payment_method_options");
                if (optJSONObject52 == null) {
                }
                JSONObject optJSONObject62 = jSONObject.optJSONObject("automatic_payment_methods");
                if (optJSONObject62 == null) {
                }
                String optString22 = StripeJsonUtils.optString("id", jSONObject);
                long optLong2 = jSONObject.optLong("created");
                String optString32 = StripeJsonUtils.optString("client_secret", jSONObject);
                KClasses$$Lambda$1 kClasses$$Lambda$12 = SetupIntent.CancellationReason.Companion;
                String optString42 = StripeJsonUtils.optString("cancellation_reason", jSONObject);
                kClasses$$Lambda$12.getClass();
                it3 = SetupIntent.CancellationReason.$ENTRIES.iterator();
                while (true) {
                    if (it3.hasNext()) {
                    }
                }
                SetupIntent.CancellationReason cancellationReason2 = (SetupIntent.CancellationReason) obj;
                String optString52 = StripeJsonUtils.optString("country_code", jSONObject);
                String optString62 = StripeJsonUtils.optString("description", jSONObject);
                boolean optBoolean2 = jSONObject.optBoolean("livemode");
                optJSONArray3 = jSONObject.optJSONArray("payment_method_types");
                if (optJSONArray3 == null) {
                }
                List list22 = r4;
                LinkResolverDef linkResolverDef2 = StripeIntent.Status.Companion;
                String optString72 = StripeJsonUtils.optString("status", jSONObject);
                linkResolverDef2.getClass();
                StripeIntent.Status fromCode$payments_core_release3 = LinkResolverDef.fromCode$payments_core_release(optString72);
                y0 y0Var2 = StripeIntent.Usage.Companion;
                String optString82 = StripeJsonUtils.optString("usage", jSONObject);
                y0Var2.getClass();
                StripeIntent.Usage fromCode$payments_core_release22 = y0.fromCode$payments_core_release(optString82);
                optJSONObject = jSONObject.optJSONObject("last_setup_error");
                if (optJSONObject == null) {
                }
                JSONObject optJSONObject82 = jSONObject.optJSONObject("next_action");
                return new SetupIntent(optString22, cancellationReason2, optLong2, optString52, optString32, optString62, optBoolean2, paymentMethod, str, list22, fromCode$payments_core_release3, fromCode$payments_core_release22, error, arrayList22, arrayList32, optJSONObject82 != null ? zzs.parse(optJSONObject82) : null, jSONObject2, z2);
            case 1:
                String string2 = jSONObject.getString("id");
                string2.getClass();
                String string3 = jSONObject.getString("client_secret");
                string3.getClass();
                return new AttachConsumerToLinkAccountSession(string2, string3);
            case 2:
                JSONArray optJSONArray6 = jSONObject.optJSONArray("redacted_payment_details");
                if (optJSONArray6 != null) {
                    IntRange until4 = RangesKt___RangesKt.until(0, optJSONArray6.length());
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until4, 10));
                    IntProgressionIterator it11 = until4.iterator();
                    while (it11.hasNext) {
                        arrayList4.add(optJSONArray6.getJSONObject(it11.nextInt()));
                    }
                    listOf = new ArrayList();
                    Iterator it12 = arrayList4.iterator();
                    while (it12.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it12.next();
                        jSONObject3.getClass();
                        zzco parsePaymentDetails2 = parsePaymentDetails(jSONObject3);
                        if (parsePaymentDetails2 != null) {
                            listOf.add(parsePaymentDetails2);
                        }
                    }
                } else {
                    JSONObject optJSONObject9 = jSONObject.optJSONObject("redacted_payment_details");
                    listOf = (optJSONObject9 == null || (parsePaymentDetails = parsePaymentDetails(optJSONObject9)) == null) ? EmptyList.INSTANCE : CollectionsKt__CollectionsJVMKt.listOf(parsePaymentDetails);
                }
                return new ConsumerPaymentDetails(listOf);
            case 3:
                ConsumerSession parse3 = ConsumerSessionJsonParser.parse(jSONObject);
                String optString15 = StripeJsonUtils.optString("publishable_key", jSONObject);
                if (parse3 != null) {
                    return new ConsumerSessionSignup(parse3, optString15);
                }
                return null;
            case 4:
                JSONObject optJSONObject10 = jSONObject.optJSONObject("payment_method");
                if (optJSONObject10 == null) {
                    return null;
                }
                String string4 = optJSONObject10.getString("id");
                string4.getClass();
                String jSONObject4 = optJSONObject10.toString();
                jSONObject4.getClass();
                return new SharePaymentDetails(string4, jSONObject4);
            case 5:
                return new FinancialConnectionsSession(StripeJsonUtils.optString("client_secret", jSONObject), StripeJsonUtils.optString("id", jSONObject));
            case 6:
                String string5 = jSONObject.getString("native_data");
                string5.getClass();
                String string6 = jSONObject.getString("url");
                string6.getClass();
                String optString16 = StripeJsonUtils.optString("return_url", jSONObject);
                try {
                    Result.Companion companion = Result.Companion;
                    failure = Uri.parse("alipay://url?".concat(string5)).getQueryParameter("return_url");
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure != 0) {
                    Uri parse4 = Uri.parse(failure);
                    if (Intrinsics.areEqual(parse4.getScheme(), "https")) {
                        String host = parse4.getHost();
                        if (!Intrinsics.areEqual(host, "stripe.com")) {
                            if (host == null) {
                                z = false;
                                break;
                            } else {
                                z = StringsKt__StringsJVMKt.endsWith(host, ".stripe.com", false);
                                break;
                            }
                        }
                        String str4 = failure instanceof Result.Failure ? null : failure;
                        Uri parse5 = Uri.parse(string6);
                        parse5.getClass();
                        return new StripeIntent.NextActionData.AlipayRedirect(parse5, string5, str4, optString16);
                    }
                }
                failure = 0;
                if (failure instanceof Result.Failure) {
                }
                Uri parse52 = Uri.parse(string6);
                parse52.getClass();
                return new StripeIntent.NextActionData.AlipayRedirect(parse52, string5, str4, optString16);
            case 7:
                return StripeIntent.NextActionData.BlikAuthorize.INSTANCE;
            case 8:
                String optString17 = jSONObject.optString("mobile_auth_url");
                optString17.getClass();
                return new StripeIntent.NextActionData.CashAppRedirect(optString17);
            case 9:
                return new StripeIntent.NextActionData.DisplayBoletoDetails(StripeJsonUtils.optString("hosted_voucher_url", jSONObject));
            case 10:
                return new StripeIntent.NextActionData.DisplayKonbiniDetails(StripeJsonUtils.optString("hosted_voucher_url", jSONObject));
            case 11:
                return new StripeIntent.NextActionData.DisplayMultibancoDetails(StripeJsonUtils.optString("hosted_voucher_url", jSONObject));
            case 12:
                return new StripeIntent.NextActionData.DisplayOxxoDetails(jSONObject.optInt("expires_after"), StripeJsonUtils.optString(InquiryField.FloatField.TYPE2, jSONObject), StripeJsonUtils.optString("hosted_voucher_url", jSONObject));
            case 13:
                return new StripeIntent.NextActionData.DisplayPayNowDetails(StripeJsonUtils.optString("hosted_instructions_url", jSONObject));
            case 14:
                return new StripeIntent.NextActionData.DisplayPromptPayDetails(StripeJsonUtils.optString("hosted_instructions_url", jSONObject));
            case 15:
                if (!jSONObject.has("url")) {
                    return null;
                }
                Uri parse6 = Uri.parse(jSONObject.getString("url"));
                parse6.getClass();
                return new StripeIntent.NextActionData.RedirectToUrl(parse6, jSONObject.optString("return_url"));
            case 16:
                String optString18 = StripeJsonUtils.optString("type", jSONObject);
                if (!Intrinsics.areEqual(optString18, "stripe_3ds2_fingerprint")) {
                    if (!Intrinsics.areEqual(optString18, "intent_confirmation_challenge")) {
                        return null;
                    }
                    JSONObject optJSONObject11 = jSONObject.optJSONObject("stripe_js");
                    if (optJSONObject11 == null || (str2 = StripeJsonUtils.optString("captcha_vendor_name", optJSONObject11)) == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    return new StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge(new StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.StripeJs(str2));
                }
                String optString19 = jSONObject.optString("three_d_secure_2_source");
                optString19.getClass();
                String optString20 = jSONObject.optString("directory_server_name");
                optString20.getClass();
                String optString21 = jSONObject.optString("server_transaction_id");
                optString21.getClass();
                JSONObject optJSONObject12 = jSONObject.optJSONObject("directory_server_encryption");
                if (optJSONObject12 == null) {
                    optJSONObject12 = new JSONObject();
                }
                ArrayList jsonArrayToList = StripeJsonUtils.jsonArrayToList(optJSONObject12.optJSONArray("root_certificate_authorities"));
                if (jsonArrayToList != null) {
                    list = EmptyList.INSTANCE;
                    Iterator it13 = jsonArrayToList.iterator();
                    while (it13.hasNext()) {
                        Object next = it13.next();
                        if (next instanceof String) {
                            list = CollectionsKt.plus((Collection) list, next);
                        }
                    }
                    break;
                }
                list = EmptyList.INSTANCE;
                String optString23 = optJSONObject12.optString("directory_server_id");
                optString23.getClass();
                String optString24 = optJSONObject12.optString("certificate");
                optString24.getClass();
                return new StripeIntent.NextActionData.SdkData.Use3DS2(optString19, optString20, optString21, new StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption(optString23, optString24, optJSONObject12.optString("key_id"), list), StripeJsonUtils.optString("three_d_secure_2_intent", jSONObject), StripeJsonUtils.optString("publishable_key", jSONObject));
            case 17:
                String optString25 = jSONObject.optString("mobile_auth_url");
                optString25.getClass();
                return new StripeIntent.NextActionData.SwishRedirect(optString25);
            case 18:
                long optLong3 = jSONObject.optLong("arrival_date");
                String optString26 = jSONObject.optString("hosted_verification_url");
                optString26.getClass();
                Iterator it14 = MicrodepositType.$ENTRIES.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        ?? next2 = it14.next();
                        if (((MicrodepositType) next2).value.equals(jSONObject.optString("microdeposit_type"))) {
                            microdepositType = next2;
                        }
                    }
                }
                MicrodepositType microdepositType2 = microdepositType;
                if (microdepositType2 == null) {
                    microdepositType2 = MicrodepositType.UNKNOWN;
                }
                return new StripeIntent.NextActionData.VerifyWithMicrodeposits(optLong3, optString26, microdepositType2);
            case 19:
                return new StripeIntent.NextActionData.WeChatPayRedirect(new WeChat(null, jSONObject.optString("app_id"), jSONObject.optString("nonce_str"), jSONObject.optString("package"), jSONObject.optString("partner_id"), jSONObject.optString("prepay_id"), jSONObject.optString("sign"), jSONObject.optString("timestamp"), null));
            case 20:
                if (!"payment_intent".equals(StripeJsonUtils.optString("object", jSONObject))) {
                    return null;
                }
                String optString27 = StripeJsonUtils.optString("id", jSONObject);
                JSONArray optJSONArray7 = jSONObject.optJSONArray("payment_method_types");
                if (optJSONArray7 != null) {
                    IntRange until5 = RangesKt___RangesKt.until(0, optJSONArray7.length());
                    r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until5, 10));
                    IntProgressionIterator it15 = until5.iterator();
                    while (it15.hasNext) {
                        r5.add(optJSONArray7.getString(it15.nextInt()));
                    }
                } else {
                    r5 = EmptyList.INSTANCE;
                }
                List list3 = r5;
                Long valueOf = !jSONObject.has("amount") ? null : Long.valueOf(jSONObject.optLong("amount"));
                long optLong4 = jSONObject.optLong("canceled_at");
                KClasses$$Lambda$1 kClasses$$Lambda$13 = PaymentIntent.CancellationReason.Companion;
                String optString28 = StripeJsonUtils.optString("cancellation_reason", jSONObject);
                kClasses$$Lambda$13.getClass();
                Iterator it16 = PaymentIntent.CancellationReason.$ENTRIES.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        obj3 = it16.next();
                        if (((PaymentIntent.CancellationReason) obj3).code.equals(optString28)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                PaymentIntent.CancellationReason cancellationReason3 = (PaymentIntent.CancellationReason) obj3;
                POPMatchingFactory pOPMatchingFactory2 = PaymentIntent.CaptureMethod.Companion;
                String optString29 = StripeJsonUtils.optString("capture_method", jSONObject);
                pOPMatchingFactory2.getClass();
                Iterator it17 = PaymentIntent.CaptureMethod.$ENTRIES.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        obj4 = it17.next();
                        if (((PaymentIntent.CaptureMethod) obj4).code.equals(optString29)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                PaymentIntent.CaptureMethod captureMethod = (PaymentIntent.CaptureMethod) obj4;
                if (captureMethod == null) {
                    captureMethod = PaymentIntent.CaptureMethod.Automatic;
                }
                PaymentIntent.CaptureMethod captureMethod2 = captureMethod;
                String optString30 = StripeJsonUtils.optString("client_secret", jSONObject);
                Plane plane = PaymentIntent.ConfirmationMethod.Companion;
                String optString31 = StripeJsonUtils.optString("confirmation_method", jSONObject);
                plane.getClass();
                Iterator it18 = PaymentIntent.ConfirmationMethod.$ENTRIES.iterator();
                while (true) {
                    if (it18.hasNext()) {
                        obj5 = it18.next();
                        if (((PaymentIntent.ConfirmationMethod) obj5).code.equals(optString31)) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                PaymentIntent.ConfirmationMethod confirmationMethod = (PaymentIntent.ConfirmationMethod) obj5;
                if (confirmationMethod == null) {
                    confirmationMethod = PaymentIntent.ConfirmationMethod.Automatic;
                }
                PaymentIntent.ConfirmationMethod confirmationMethod2 = confirmationMethod;
                long optLong5 = jSONObject.optLong("created");
                String optCurrency = StripeJsonUtils.optCurrency(jSONObject);
                String optString33 = StripeJsonUtils.optString("description", jSONObject);
                boolean z3 = jSONObject.has("livemode") && jSONObject.optBoolean("livemode", false);
                JSONObject optJSONObject13 = jSONObject.optJSONObject("payment_method");
                PaymentMethod parse7 = optJSONObject13 != null ? parse(optJSONObject13) : null;
                String optString34 = StripeJsonUtils.optString("payment_method", jSONObject);
                if (parse7 != null) {
                    optString34 = null;
                }
                if (optString34 == null) {
                    if (parse7 == null) {
                        str3 = null;
                        String optString35 = StripeJsonUtils.optString("receipt_email", jSONObject);
                        LinkResolverDef linkResolverDef3 = StripeIntent.Status.Companion;
                        String optString36 = StripeJsonUtils.optString("status", jSONObject);
                        linkResolverDef3.getClass();
                        StripeIntent.Status fromCode$payments_core_release4 = LinkResolverDef.fromCode$payments_core_release(optString36);
                        JSONObject optJSONObject14 = jSONObject.optJSONObject("payment_method_options");
                        String jSONObject5 = optJSONObject14 == null ? optJSONObject14.toString() : null;
                        y0 y0Var3 = StripeIntent.Usage.Companion;
                        String optString37 = StripeJsonUtils.optString("setup_future_usage", jSONObject);
                        y0Var3.getClass();
                        StripeIntent.Usage fromCode$payments_core_release5 = y0.fromCode$payments_core_release(optString37);
                        optJSONObject2 = jSONObject.optJSONObject("last_payment_error");
                        if (optJSONObject2 == null) {
                            String optString38 = StripeJsonUtils.optString("charge", optJSONObject2);
                            String optString39 = StripeJsonUtils.optString("code", optJSONObject2);
                            String optString40 = StripeJsonUtils.optString("decline_code", optJSONObject2);
                            String optString41 = StripeJsonUtils.optString("doc_url", optJSONObject2);
                            String optString43 = StripeJsonUtils.optString("message", optJSONObject2);
                            String optString44 = StripeJsonUtils.optString("param", optJSONObject2);
                            JSONObject optJSONObject15 = optJSONObject2.optJSONObject("payment_method");
                            PaymentMethod parse8 = optJSONObject15 != null ? parse(optJSONObject15) : null;
                            LinkResolverDef linkResolverDef4 = PaymentIntent.Error.Type.Companion;
                            String optString45 = StripeJsonUtils.optString("type", optJSONObject2);
                            linkResolverDef4.getClass();
                            Iterator it19 = PaymentIntent.Error.Type.$ENTRIES.iterator();
                            while (true) {
                                if (it19.hasNext()) {
                                    obj6 = it19.next();
                                    if (((PaymentIntent.Error.Type) obj6).code.equals(optString45)) {
                                    }
                                } else {
                                    obj6 = null;
                                }
                            }
                            error2 = new PaymentIntent.Error(optString38, optString39, optString40, optString41, optString43, optString44, parse8, (PaymentIntent.Error.Type) obj6);
                        } else {
                            error2 = null;
                        }
                        optJSONObject3 = jSONObject.optJSONObject("shipping");
                        if (optJSONObject3 == null) {
                            JSONObject optJSONObject16 = optJSONObject3.optJSONObject("address");
                            shipping = new PaymentIntent.Shipping(optJSONObject16 != null ? new Address(StripeJsonUtils.optString("city", optJSONObject16), StripeJsonUtils.optString(AdRevenueScheme.COUNTRY, optJSONObject16), StripeJsonUtils.optString("line1", optJSONObject16), StripeJsonUtils.optString("line2", optJSONObject16), StripeJsonUtils.optString("postal_code", optJSONObject16), StripeJsonUtils.optString("state", optJSONObject16)) : new Address(null, null, null, null, null, null), StripeJsonUtils.optString("carrier", optJSONObject3), StripeJsonUtils.optString("name", optJSONObject3), StripeJsonUtils.optString("phone", optJSONObject3), StripeJsonUtils.optString("tracking_number", optJSONObject3));
                        } else {
                            shipping = null;
                        }
                        JSONObject optJSONObject17 = jSONObject.optJSONObject("next_action");
                        StripeIntent.NextActionData parse9 = optJSONObject17 != null ? zzs.parse(optJSONObject17) : null;
                        optJSONArray4 = jSONObject.optJSONArray("unactivated_payment_method_types");
                        if (optJSONArray4 == null) {
                            IntRange until6 = RangesKt___RangesKt.until(0, optJSONArray4.length());
                            r52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until6, 10));
                            IntProgressionIterator it20 = until6.iterator();
                            while (it20.hasNext) {
                                r52.add(optJSONArray4.getString(it20.nextInt()));
                            }
                        } else {
                            r52 = EmptyList.INSTANCE;
                        }
                        Iterable iterable4 = (Iterable) r52;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable4, 10));
                        it4 = iterable4.iterator();
                        while (it4.hasNext()) {
                            String lowerCase3 = ((String) it4.next()).toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                            arrayList5.add(lowerCase3);
                        }
                        optJSONArray5 = jSONObject.optJSONArray("link_funding_sources");
                        if (optJSONArray5 == null) {
                            IntRange until7 = RangesKt___RangesKt.until(0, optJSONArray5.length());
                            r6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until7, 10));
                            IntProgressionIterator it21 = until7.iterator();
                            while (it21.hasNext) {
                                r6.add(optJSONArray5.getString(it21.nextInt()));
                            }
                        } else {
                            r6 = EmptyList.INSTANCE;
                        }
                        Iterable iterable5 = (Iterable) r6;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable5, 10));
                        it5 = iterable5.iterator();
                        while (it5.hasNext()) {
                            String lowerCase4 = ((String) it5.next()).toLowerCase(Locale.ROOT);
                            lowerCase4.getClass();
                            arrayList6.add(lowerCase4);
                        }
                        String optString46 = StripeJsonUtils.optString("country_code", jSONObject);
                        JSONObject optJSONObject18 = jSONObject.optJSONObject("automatic_payment_methods");
                        boolean z4 = optJSONObject18 == null && optJSONObject18.optBoolean("enabled");
                        if (optString30 == null) {
                            optString30 = "redacted_client_secret";
                        }
                        return new PaymentIntent(optString27, list3, valueOf, optLong4, cancellationReason3, captureMethod2, optString30, confirmationMethod2, optString46, optLong5, optCurrency, optString33, z3, parse7, str3, optString35, fromCode$payments_core_release4, fromCode$payments_core_release5, error2, shipping, arrayList5, arrayList6, parse9, jSONObject5, z4);
                    }
                    optString34 = parse7.id;
                }
                str3 = optString34;
                String optString352 = StripeJsonUtils.optString("receipt_email", jSONObject);
                LinkResolverDef linkResolverDef32 = StripeIntent.Status.Companion;
                String optString362 = StripeJsonUtils.optString("status", jSONObject);
                linkResolverDef32.getClass();
                StripeIntent.Status fromCode$payments_core_release42 = LinkResolverDef.fromCode$payments_core_release(optString362);
                JSONObject optJSONObject142 = jSONObject.optJSONObject("payment_method_options");
                if (optJSONObject142 == null) {
                }
                y0 y0Var32 = StripeIntent.Usage.Companion;
                String optString372 = StripeJsonUtils.optString("setup_future_usage", jSONObject);
                y0Var32.getClass();
                StripeIntent.Usage fromCode$payments_core_release52 = y0.fromCode$payments_core_release(optString372);
                optJSONObject2 = jSONObject.optJSONObject("last_payment_error");
                if (optJSONObject2 == null) {
                }
                optJSONObject3 = jSONObject.optJSONObject("shipping");
                if (optJSONObject3 == null) {
                }
                JSONObject optJSONObject172 = jSONObject.optJSONObject("next_action");
                StripeIntent.NextActionData parse92 = optJSONObject172 != null ? zzs.parse(optJSONObject172) : null;
                optJSONArray4 = jSONObject.optJSONArray("unactivated_payment_method_types");
                if (optJSONArray4 == null) {
                }
                Iterable iterable42 = (Iterable) r52;
                ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable42, 10));
                it4 = iterable42.iterator();
                while (it4.hasNext()) {
                }
                optJSONArray5 = jSONObject.optJSONArray("link_funding_sources");
                if (optJSONArray5 == null) {
                }
                Iterable iterable52 = (Iterable) r6;
                ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable52, 10));
                it5 = iterable52.iterator();
                while (it5.hasNext()) {
                }
                String optString462 = StripeJsonUtils.optString("country_code", jSONObject);
                JSONObject optJSONObject182 = jSONObject.optJSONObject("automatic_payment_methods");
                if (optJSONObject182 == null) {
                }
                if (optString30 == null) {
                }
                return new PaymentIntent(optString27, list3, valueOf, optLong4, cancellationReason3, captureMethod2, optString30, confirmationMethod2, optString462, optLong5, optCurrency, optString33, z3, parse7, str3, optString352, fromCode$payments_core_release42, fromCode$payments_core_release52, error2, shipping, arrayList52, arrayList62, parse92, jSONObject5, z4);
            case 21:
                return parse(jSONObject);
            default:
                String string7 = jSONObject.getString("id");
                long j3 = jSONObject.getLong("created");
                boolean z5 = jSONObject.getBoolean("livemode");
                String string8 = jSONObject.getString("source");
                String optString47 = jSONObject.optString("state");
                JSONObject optJSONObject19 = jSONObject.optJSONObject("ares");
                if (optJSONObject19 != null) {
                    String optString48 = StripeJsonUtils.optString("threeDSServerTransID", optJSONObject19);
                    String optString49 = StripeJsonUtils.optString("acsChallengeMandated", optJSONObject19);
                    String optString50 = StripeJsonUtils.optString("acsSignedContent", optJSONObject19);
                    String string9 = optJSONObject19.getString("acsTransID");
                    String optString51 = StripeJsonUtils.optString("acsURL", optJSONObject19);
                    String optString53 = StripeJsonUtils.optString("authenticationType", optJSONObject19);
                    String optString54 = StripeJsonUtils.optString("cardholderInfo", optJSONObject19);
                    String string10 = optJSONObject19.getString("messageType");
                    String string11 = optJSONObject19.getString("messageVersion");
                    String optString55 = StripeJsonUtils.optString("sdkTransID", optJSONObject19);
                    String optString56 = StripeJsonUtils.optString("transStatus", optJSONObject19);
                    JSONArray optJSONArray8 = optJSONObject19.optJSONArray("messageExtension");
                    if (optJSONArray8 != null) {
                        IntRange until8 = RangesKt___RangesKt.until(0, optJSONArray8.length());
                        ArrayList arrayList7 = new ArrayList();
                        IntProgressionIterator it22 = until8.iterator();
                        while (it22.hasNext) {
                            JSONObject optJSONObject20 = optJSONArray8.optJSONObject(it22.nextInt());
                            if (optJSONObject20 != null) {
                                arrayList7.add(optJSONObject20);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it23 = arrayList7.iterator();
                        while (it23.hasNext()) {
                            JSONObject jSONObject6 = (JSONObject) it23.next();
                            jSONObject6.getClass();
                            JSONObject optJSONObject21 = jSONObject6.optJSONObject("data");
                            if (optJSONObject21 != null) {
                                JSONArray names = optJSONObject21.names();
                                if (names == null) {
                                    names = new JSONArray();
                                }
                                j2 = j3;
                                IntRange until9 = RangesKt___RangesKt.until(i, names.length());
                                it6 = it23;
                                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until9, 10));
                                IntProgressionIterator it24 = until9.iterator();
                                while (it24.hasNext) {
                                    arrayList9.add(names.getString(it24.nextInt()));
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it25 = arrayList9.iterator();
                                while (it25.hasNext()) {
                                    String str5 = (String) it25.next();
                                    arrayList10.add(MapsKt__MapsJVMKt.mapOf(new Pair(str5, optJSONObject21.getString(str5))));
                                }
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                                Iterator it26 = arrayList10.iterator();
                                while (it26.hasNext()) {
                                    map = MapsKt__MapsKt.plus(map, (Map) it26.next());
                                }
                            } else {
                                j2 = j3;
                                it6 = it23;
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            }
                            arrayList8.add(new Stripe3ds2AuthResult.MessageExtension(StripeJsonUtils.optString("name", jSONObject6), jSONObject6.optBoolean("criticalityIndicator"), StripeJsonUtils.optString("id", jSONObject6), MapsKt__MapsKt.toMap(map)));
                            it23 = it6;
                            j3 = j2;
                            i = 0;
                        }
                        arrayList = arrayList8;
                    } else {
                        arrayList = null;
                    }
                    j = j3;
                    ares = new Stripe3ds2AuthResult.Ares(optString48, optString49, optString50, string9, optString51, optString53, optString54, arrayList, string10, string11, optString55, optString56);
                } else {
                    j = j3;
                    ares = null;
                }
                JSONObject optJSONObject22 = jSONObject.optJSONObject(BreadcrumbHelper.Category.ERROR);
                return new Stripe3ds2AuthResult(string7, ares, Long.valueOf(j), string8, optString47, z5, optJSONObject22 != null ? new Stripe3ds2AuthResult.ThreeDS2Error(optJSONObject22.getString("threeDSServerTransID"), StripeJsonUtils.optString("acsTransID", optJSONObject22), StripeJsonUtils.optString("dsTransID", optJSONObject22), optJSONObject22.getString("errorCode"), optJSONObject22.getString("errorComponent"), optJSONObject22.getString("errorDescription"), optJSONObject22.getString("errorDetail"), StripeJsonUtils.optString("errorMessageType", optJSONObject22), optJSONObject22.getString("messageType"), optJSONObject22.getString("messageVersion"), StripeJsonUtils.optString("sdkTransID", optJSONObject22)) : null, StripeJsonUtils.optString("fallback_redirect_url", jSONObject), StripeJsonUtils.optString("creq", jSONObject));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static com.stripe.android.model.PaymentMethod parse(org.json.JSONObject r50) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.parsers.SetupIntentJsonParser.parse(org.json.JSONObject):com.stripe.android.model.PaymentMethod");
    }
}
