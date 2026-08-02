package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.model.MobileFallbackWebviewParams;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.Plane;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ConsumerSessionJsonParser implements ModelJsonParser {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    public static ConsumerSession parse(JSONObject jSONObject) {
        ?? r2;
        MobileFallbackWebviewParams mobileFallbackWebviewParams;
        ConsumerSession.AuthenticationLevel authenticationLevel;
        ConsumerSession.AuthenticationLevel authenticationLevel2;
        Object obj;
        Object obj2;
        Object obj3;
        JSONObject optJSONObject = jSONObject.optJSONObject("consumer_session");
        LinkBrand linkBrand = null;
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("verification_sessions");
        if (optJSONArray != null) {
            IntRange until = RangesKt___RangesKt.until(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
            IntProgressionIterator it = until.iterator();
            while (it.hasNext) {
                arrayList.add(optJSONArray.getJSONObject(it.nextInt()));
            }
            r2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it2.next();
                jSONObject2.getClass();
                LinkResolverDef linkResolverDef = ConsumerSession.VerificationSession.SessionType.Companion;
                String string2 = jSONObject2.getString("type");
                string2.getClass();
                String lowerCase = string2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                linkResolverDef.getClass();
                Iterator it3 = ConsumerSession.VerificationSession.SessionType.$ENTRIES.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (((ConsumerSession.VerificationSession.SessionType) obj2).value.equalsIgnoreCase(lowerCase)) {
                        break;
                    }
                }
                ConsumerSession.VerificationSession.SessionType sessionType = (ConsumerSession.VerificationSession.SessionType) obj2;
                if (sessionType == null) {
                    sessionType = ConsumerSession.VerificationSession.SessionType.Unknown;
                }
                Plane plane = ConsumerSession.VerificationSession.SessionState.Companion;
                String string3 = jSONObject2.getString("state");
                string3.getClass();
                String lowerCase2 = string3.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                plane.getClass();
                Iterator it4 = ConsumerSession.VerificationSession.SessionState.$ENTRIES.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it4.next();
                    if (((ConsumerSession.VerificationSession.SessionState) obj3).value.equalsIgnoreCase(lowerCase2)) {
                        break;
                    }
                }
                ConsumerSession.VerificationSession.SessionState sessionState = (ConsumerSession.VerificationSession.SessionState) obj3;
                if (sessionState == null) {
                    sessionState = ConsumerSession.VerificationSession.SessionState.Unknown;
                }
                r2.add(new ConsumerSession.VerificationSession(sessionType, sessionState));
            }
        } else {
            r2 = EmptyList.INSTANCE;
        }
        List list = r2;
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("mobile_fallback_webview_params");
        if (optJSONObject2 != null) {
            MobileFallbackWebviewParams.WebviewRequirementType.Companion companion = MobileFallbackWebviewParams.WebviewRequirementType.INSTANCE;
            String string4 = optJSONObject2.getString("webview_requirement_type");
            string4.getClass();
            companion.getClass();
            Iterator it5 = MobileFallbackWebviewParams.WebviewRequirementType.getEntries().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it5.next();
                if (StringsKt__StringsJVMKt.equals(((MobileFallbackWebviewParams.WebviewRequirementType) obj).getValue(), string4, true)) {
                    break;
                }
            }
            MobileFallbackWebviewParams.WebviewRequirementType webviewRequirementType = (MobileFallbackWebviewParams.WebviewRequirementType) obj;
            if (webviewRequirementType == null) {
                webviewRequirementType = MobileFallbackWebviewParams.WebviewRequirementType.Unknown;
            }
            mobileFallbackWebviewParams = new MobileFallbackWebviewParams(webviewRequirementType, StripeJsonUtils.optString("webview_open_url", optJSONObject2));
        } else {
            mobileFallbackWebviewParams = null;
        }
        String optString = StripeJsonUtils.optString("current_authentication_level", optJSONObject);
        if (optString != null) {
            ConsumerSession.AuthenticationLevel.INSTANCE.getClass();
            authenticationLevel = ConsumerSession.AuthenticationLevel.Companion.fromValue(optString);
        } else {
            authenticationLevel = null;
        }
        String optString2 = StripeJsonUtils.optString("minimum_authentication_level", optJSONObject);
        if (optString2 != null) {
            ConsumerSession.AuthenticationLevel.INSTANCE.getClass();
            authenticationLevel2 = ConsumerSession.AuthenticationLevel.Companion.fromValue(optString2);
        } else {
            authenticationLevel2 = null;
        }
        String optString3 = StripeJsonUtils.optString("link_brand", jSONObject);
        if (optString3 != null) {
            Iterator it6 = LinkBrand.getEntries().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                ?? next = it6.next();
                if (Intrinsics.areEqual(((LinkBrand) next).getValue(), optString3)) {
                    linkBrand = next;
                    break;
                }
            }
            linkBrand = linkBrand;
        }
        String string5 = optJSONObject.getString("client_secret");
        string5.getClass();
        String string6 = optJSONObject.getString("email_address");
        string6.getClass();
        String string7 = optJSONObject.getString("redacted_formatted_phone_number");
        string7.getClass();
        String string8 = optJSONObject.getString("redacted_phone_number");
        string8.getClass();
        return new ConsumerSession(string5, string6, string7, string8, StripeJsonUtils.optString("unredacted_phone_number", optJSONObject), StripeJsonUtils.optString("phone_number_country", optJSONObject), list, mobileFallbackWebviewParams, authenticationLevel, authenticationLevel2, linkBrand);
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /* renamed from: parse, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ StripeModel mo4026parse(JSONObject jSONObject) {
        return parse(jSONObject);
    }
}
