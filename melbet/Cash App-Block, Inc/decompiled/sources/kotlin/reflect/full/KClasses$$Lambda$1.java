package kotlin.reflect.full;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.protobuf.Internal;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.protos.policychecker.v1.EvaluationVerdict;
import com.squareup.protos.teamapp.ui.Duration;
import com.squareup.protos.timecards.scheduling.ColorScheme;
import com.squareup.protos.wire.roster.mds.AddressTypeScope$AddressType;
import com.squareup.protos.wire.roster.mds.ScriptScope$Script;
import com.stripe.android.challenge.confirmation.BridgeSuccessParams;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.security.KeyStore;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.u0;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KClasses$$Lambda$1 implements ModelJsonParser, DFS.Neighbors, Internal.ListAdapter.Converter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ KClasses$$Lambda$1(int i) {
        this.$r8$classId = i;
    }

    public static final Map access$createExpandParam(List list) {
        if (list.isEmpty()) {
            list = null;
        }
        Map mapOf = list != null ? MapsKt__MapsJVMKt.mapOf(new Pair("expand", list)) : null;
        if (mapOf != null) {
            return mapOf;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public static final boolean access$hasLooseContent(ASTNodeImpl aSTNodeImpl) {
        Iterator it = aSTNodeImpl.getChildren().iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            MarkdownElementType markdownElementType = ((ASTNodeImpl) it.next()).f1630type;
            if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.EOL)) {
                i++;
            } else {
                if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.LIST_BULLET) ? true : Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.LIST_NUMBER) ? true : Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.WHITE_SPACE)) {
                    continue;
                } else {
                    if (z && i > 1) {
                        return true;
                    }
                    i = 0;
                    z = true;
                }
            }
        }
        return false;
    }

    public static final void access$validateChain(ArrayList arrayList, List list) {
        LinkedList parse = X509CertChainUtils.parse(list);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            keyStore.setCertificateEntry(String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), (Certificate) arrayList.get(i));
            i = i2;
        }
        X509CertSelector x509CertSelector = new X509CertSelector();
        x509CertSelector.setCertificate((X509Certificate) parse.get(0));
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStore, x509CertSelector);
        pKIXBuilderParameters.setRevocationEnabled(false);
        pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(parse)));
        CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
    }

    public static UiType fromCode$3ds2sdk_release(String str) {
        Object obj;
        EnumEntriesList enumEntriesList = UiType.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (Intrinsics.areEqual(str, ((UiType) obj).code)) {
                break;
            }
        }
        return (UiType) obj;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static ScriptScope$Script m4139fromValue(int i) {
        switch (i) {
            case 125:
                return ScriptScope$Script.Hebr;
            case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                return ScriptScope$Script.Arab;
            case 200:
                return ScriptScope$Script.Grek;
            case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                return ScriptScope$Script.Latn;
            case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                return ScriptScope$Script.Cyrl;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE:
                return ScriptScope$Script.Hang;
            case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                return ScriptScope$Script.Kore;
            case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                return ScriptScope$Script.Deva;
            case SDK_ASSET_ICON_REPORT_VALUE:
                return ScriptScope$Script.Beng;
            case 346:
                return ScriptScope$Script.Taml;
            case 352:
                return ScriptScope$Script.Thai;
            case 410:
                return ScriptScope$Script.Hira;
            case 411:
                return ScriptScope$Script.Kana;
            case 412:
                return ScriptScope$Script.Hrkt;
            case HttpStatusCode.PAYLOAD_TOO_LARGE_413 /* 413 */:
                return ScriptScope$Script.Jpan;
            case 500:
                return ScriptScope$Script.Hani;
            case 998:
                return ScriptScope$Script.Zyyy;
            default:
                return null;
        }
    }

    public static String getApiUrl(String str, Object... objArr) {
        Locale locale = Locale.ENGLISH;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return "https://api.stripe.com/v1/".concat(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
    }

    public static StripeError parse(JSONObject jSONObject) {
        Object failure;
        Map map;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject2 = jSONObject.getJSONObject(BreadcrumbHelper.Category.ERROR);
            String optString = StripeJsonUtils.optString("charge", jSONObject2);
            String optString2 = StripeJsonUtils.optString("code", jSONObject2);
            String optString3 = StripeJsonUtils.optString("decline_code", jSONObject2);
            String optString4 = StripeJsonUtils.optString("message", jSONObject2);
            String optString5 = StripeJsonUtils.optString("param", jSONObject2);
            String optString6 = StripeJsonUtils.optString("type", jSONObject2);
            String optString7 = StripeJsonUtils.optString("doc_url", jSONObject2);
            JSONObject optJSONObject = jSONObject2.optJSONObject("extra_fields");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                keys.getClass();
                TransformingSequence map2 = SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.asSequence(keys), new AlertBannerKt$$ExternalSyntheticLambda3(optJSONObject, 28));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = map2.sequence.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) map2.transformer.invoke(it.next());
                    linkedHashMap.put(pair.first, pair.second);
                }
                map = MapsKt__MapsKt.optimizeReadOnlyMap(linkedHashMap);
            } else {
                map = null;
            }
            failure = new StripeError(optString6, optString4, optString2, optString5, optString3, optString, optString7, map);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object stripeError = new StripeError(null, "An improperly formatted error response was found.", null, null, null, null, null, null);
        Result.Companion companion3 = Result.Companion;
        if (failure instanceof Result.Failure) {
            failure = stripeError;
        }
        return (StripeError) failure;
    }

    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public Object convert(Object obj) {
        u0 u0Var;
        switch (((Integer) obj).intValue()) {
            case 0:
                u0Var = u0.brand_starts_with_generic;
                break;
            case 1:
                u0Var = u0.fingerprint_starts_with_generic;
                break;
            case 2:
                u0Var = u0.fingerprint_starts_with_unknown;
                break;
            case 3:
                u0Var = u0.hardware_contains_goldfish;
                break;
            case 4:
                u0Var = u0.hardware_contains_ranchu;
                break;
            case 5:
                u0Var = u0.hardware_contains_google_sdk;
                break;
            case 6:
                u0Var = u0.model_contains_emulator;
                break;
            case 7:
                u0Var = u0.model_contains_android_sdk;
                break;
            case 8:
                u0Var = u0.manufacturer_contains_genymotion;
                break;
            case 9:
                u0Var = u0.product_contains_sdk_google;
                break;
            case 10:
                u0Var = u0.product_contains_google_sdk;
                break;
            case 11:
                u0Var = u0.product_contains_sdk;
                break;
            case 12:
                u0Var = u0.product_contains_sdk_x86;
                break;
            case 13:
                u0Var = u0.product_contains_sdk_gphone64_arm64;
                break;
            case 14:
                u0Var = u0.product_contains_vbox_86p;
                break;
            case 15:
                u0Var = u0.product_contains_emulator;
                break;
            case 16:
                u0Var = u0.product_contains_simulator;
                break;
            default:
                u0Var = null;
                break;
        }
        return u0Var == null ? u0.UNRECOGNIZED : u0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return (Iterable) KClasses$isSubclassOf$1.INSTANCE.get((KClass) obj);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 21:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static ColorScheme m4137fromValue(int i) {
        switch (i) {
            case 0:
                return ColorScheme.DO_NOT_USE;
            case 1:
                return ColorScheme.LIGHT_LIME;
            case 2:
                return ColorScheme.DARK_LIME;
            case 3:
                return ColorScheme.LIGHT_TEAL;
            case 4:
                return ColorScheme.DARK_TEAL;
            case 5:
                return ColorScheme.LIGHT_BLUE;
            case 6:
                return ColorScheme.DARK_BLUE;
            case 7:
                return ColorScheme.LIGHT_PURPLE;
            case 8:
                return ColorScheme.DARK_PURPLE;
            case 9:
                return ColorScheme.LIGHT_PLUM;
            case 10:
                return ColorScheme.DARK_PLUM;
            case 11:
                return ColorScheme.LIGHT_ROSE;
            case 12:
                return ColorScheme.DARK_ROSE;
            case 13:
                return ColorScheme.LIGHT_ORANGE;
            case 14:
                return ColorScheme.DARK_ORANGE;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static AddressTypeScope$AddressType m4138fromValue(int i) {
        switch (i) {
            case 0:
                return AddressTypeScope$AddressType.DO_NOT_USE;
            case 1:
                return AddressTypeScope$AddressType.SHIPPING;
            case 2:
                return AddressTypeScope$AddressType.RECEIPT;
            case 3:
                return AddressTypeScope$AddressType.LEGAL;
            case 4:
                return AddressTypeScope$AddressType.PHYSICAL;
            case 5:
                return AddressTypeScope$AddressType.PAYMENTS;
            case 6:
                return AddressTypeScope$AddressType.MARKETING;
            case 7:
                return AddressTypeScope$AddressType.PAYMENTS_AUTHORIZATION;
            case 8:
                return AddressTypeScope$AddressType.PAYMENTS_ACTIVATION;
            default:
                return null;
        }
    }

    public static EvaluationVerdict fromValue(int i) {
        if (i == 1) {
            return EvaluationVerdict.PASSED;
        }
        if (i == 2) {
            return EvaluationVerdict.FAILED;
        }
        if (i == 3) {
            return EvaluationVerdict.NOT_EVALUATED;
        }
        if (i == 4) {
            return EvaluationVerdict.BYPASSED;
        }
        if (i != 5) {
            return null;
        }
        return EvaluationVerdict.RULE_MISSING_SIGNAL;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static Duration.Unit m4136fromValue(int i) {
        if (i == 0) {
            return Duration.Unit.SECOND;
        }
        if (i == 1) {
            return Duration.Unit.MINUTE;
        }
        if (i == 2) {
            return Duration.Unit.HOUR;
        }
        if (i == 3) {
            return Duration.Unit.DAY;
        }
        if (i == 4) {
            return Duration.Unit.MONTH;
        }
        if (i != 5) {
            return null;
        }
        return Duration.Unit.YEAR;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /* renamed from: parse */
    public StripeModel mo4026parse(JSONObject jSONObject) {
        switch (this.$r8$classId) {
            case 9:
                String optString = jSONObject.optString("client_secret");
                optString.getClass();
                if (StringsKt.isBlank(optString)) {
                    optString = null;
                }
                if (optString == null) {
                    return null;
                }
                return new BridgeSuccessParams(optString);
            default:
                return parse(jSONObject);
        }
    }
}
