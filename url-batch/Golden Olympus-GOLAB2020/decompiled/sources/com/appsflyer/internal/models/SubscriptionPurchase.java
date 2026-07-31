package com.appsflyer.internal.models;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1f;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.metadata.a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SubscriptionPurchase {
    public static final Companion Companion = new Companion(null);
    private final String acknowledgementState;
    private final CanceledStateContext canceledStateContext;
    private final ExternalAccountIdentifiers externalAccountIdentifiers;
    private final String kind;
    private final String latestOrderId;
    private final List<SubscriptionPurchaseLineItem> lineItems;
    private final String linkedPurchaseToken;
    private final PausedStateContext pausedStateContext;
    private final String regionCode;
    private final String startTime;
    private final SubscribeWithGoogleInfo subscribeWithGoogleInfo;
    private final String subscriptionState;
    private final TestPurchase testPurchase;

    @Metadata
    public static final class Companion implements Deserialize<SubscriptionPurchase> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 46273;
        private static int PurchaseClient = 1;
        private static long getOneTimePurchaseOfferDetails = 566631410124197933L;
        private static char getPackageName = 6970;
        private static char getQuantity = 34449;
        private static int hashCode = 0;
        private static char toJsonMap = 22370;

        private Companion() {
        }

        private static void a(String str, int i4, Object[] objArr) {
            char[] cArr = str;
            if (str != null) {
                char[] charArray = str.toCharArray();
                $11 = ($10 + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr = charArray;
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            aFPurchaseConnectorA1g.getPackageName = i4;
            int length = cArr2.length;
            long[] jArr = new long[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i5 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i5 >= cArr2.length) {
                    break;
                }
                $11 = ($10 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                jArr[i5] = (cArr2[i5] ^ (i5 * aFPurchaseConnectorA1g.getPackageName)) ^ (getOneTimePurchaseOfferDetails ^ 5319290379872349608L);
                aFPurchaseConnectorA1g.InAppPurchaseEvent = i5 + 1;
            }
            char[] cArr3 = new char[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i6 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i6 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                } else {
                    cArr3[i6] = (char) jArr[i6];
                    aFPurchaseConnectorA1g.InAppPurchaseEvent = i6 + 1;
                }
            }
        }

        private static void b(String str, int i4, Object[] objArr) {
            int i5 = $10 + 21;
            $11 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            AFPurchaseConnectorA1f aFPurchaseConnectorA1f = new AFPurchaseConnectorA1f();
            char[] cArr = new char[charArray.length];
            aFPurchaseConnectorA1f.getQuantity = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i6 = aFPurchaseConnectorA1f.getQuantity;
                if (i6 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i4);
                    return;
                }
                cArr2[0] = charArray[i6];
                cArr2[1] = charArray[i6 + 1];
                int i7 = 58224;
                for (int i8 = 0; i8 < 16; i8++) {
                    $10 = ($11 + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    char c4 = cArr2[1];
                    char c5 = cArr2[0];
                    char c6 = (char) (c4 - (((c5 + i7) ^ ((c5 << 4) + ((char) (toJsonMap ^ (-177179452616573881L))))) ^ ((c5 >>> 5) + ((char) (getPackageName ^ (-177179452616573881L))))));
                    cArr2[1] = c6;
                    cArr2[0] = (char) (c5 - (((c6 >>> 5) + ((char) (InAppPurchaseEvent ^ (-177179452616573881L)))) ^ ((c6 + i7) ^ ((c6 << 4) + ((char) (getQuantity ^ (-177179452616573881L)))))));
                    i7 -= 40503;
                }
                int i9 = aFPurchaseConnectorA1f.getQuantity;
                cArr[i9] = cArr2[0];
                cArr[i9 + 1] = cArr2[1];
                aFPurchaseConnectorA1f.getQuantity = i9 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionPurchase fromJson(JSONObject jSONObject) {
            hashCode = (PurchaseClient + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
            SubscriptionPurchase fromJson = fromJson(jSONObject);
            hashCode = (PurchaseClient + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final SubscriptionPurchase fromJson(JSONObject jSONObject) {
            List list;
            Object object;
            Object object2;
            Object nullable;
            Object object3;
            Object object4;
            Object object5;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("뷩\ude9d笉鞳〈䳄\ue946\u05ff꙾", View.getDefaultSize(0, 0) + 25457, objArr);
            JSONArray jSONArray = jSONObject.getJSONArray(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            list = SubscriptionPurchaseKt.toList(jSONArray);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                PurchaseClient = (hashCode + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
                arrayList.add(SubscriptionPurchaseLineItem.Companion.fromJson((JSONObject) it.next()));
            }
            Object[] objArr2 = new Object[1];
            b("㩃ऋ틌ﷶꓦ\uf49b蛖ᚍಧᆧ১䚠㰟壀斑哱唩詎\ued0e\uf5d6", 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            String optString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr3 = new Object[1];
            a("뷦恿\u06dd┷쮌\ue9ee豂닜儎瞂ᗪ㡘\udea4ﴙꎐ䇾摁ફ⤛콰", Color.blue(0) + 56731, objArr3);
            object = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr3[0]).intern(), CanceledStateContext.Companion);
            CanceledStateContext canceledStateContext = (CanceledStateContext) object;
            Object[] objArr4 = new Object[1];
            a("뷠\uf7fe⧷揩闻쿤Ƕ민\ueddc⟽姸鏋엔翌뇛\uebe1᷑埓觝쏈痐꿜\ue1aeᮥ䶿螽", 18947 - KeyEvent.getDeadChar(0, 0), objArr4);
            object2 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr4[0]).intern(), ExternalAccountIdentifiers.Companion);
            ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) object2;
            Object[] objArr5 = new Object[1];
            b("㽐﨑翌\uf0d8", (ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr5);
            String optString2 = jSONObject.optString(((String) objArr5[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr6 = new Object[1];
            b("癌\ue851\ued0e\uf5d6沙箧憅ᆯ备\ue05dڕ㧾猽杆", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, objArr6);
            String optString3 = jSONObject.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            Object[] objArr7 = new Object[1];
            b("ⶎ緟큄䷡춵蔐Û目ʯ\ufc7a3䋟矑䈥蚗柭뎊\uf029䰸剁", (ViewConfiguration.getScrollBarSize() >> 8) + 19, objArr7);
            nullable = SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr7[0]).intern());
            String str = (String) nullable;
            Object[] objArr8 = new Object[1];
            b("\uf41f鈶\uaa38텋춵蔐\u208f梠閮\ud8de攇狼ݑ謢\ued0e\uf5d6ဿ睥", View.resolveSizeAndState(0, 0, 0) + 18, objArr8);
            object3 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr8[0]).intern(), PausedStateContext.Companion);
            PausedStateContext pausedStateContext = (PausedStateContext) object3;
            Object[] objArr9 = new Object[1];
            a("뷷睛⢔\udddd霆䡌綤㛷\ue839鵳", 51898 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            String optString4 = jSONObject.optString(((String) objArr9[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            Object[] objArr10 = new Object[1];
            a("뷶⡜难糰\ueb45冰㿢꩓ႈ", 38316 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
            String optString5 = jSONObject.optString(((String) objArr10[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString5, "");
            Object[] objArr11 = new Object[1];
            a("뷶僷柩竣৺᳔㏆웖험\ue8edﾪ銼ꆹ뒙䮈広涒\u009eឞ⩉㥧챰\ue370", 60679 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
            object4 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr11[0]).intern(), SubscribeWithGoogleInfo.Companion);
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) object4;
            Object[] objArr12 = new Object[1];
            b("\uebc9ｭ茇⿕雿⚫뷪昏\uddb4뗰ݑ謢\u208f梠閮\ud8de쮦\udcce", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, objArr12);
            String optString6 = jSONObject.optString(((String) objArr12[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString6, "");
            Object[] objArr13 = new Object[1];
            a("뷱圅格絞ᙁ⮉㲩톥\ueac5￩鄄\uaa37", ExpandableListView.getPackedPositionChild(0L) + 60134, objArr13);
            object5 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr13[0]).intern(), TestPurchase.Companion);
            SubscriptionPurchase subscriptionPurchase = new SubscriptionPurchase(optString, canceledStateContext, externalAccountIdentifiers, optString2, optString3, arrayList, str, pausedStateContext, optString4, optString5, subscribeWithGoogleInfo, optString6, (TestPurchase) object5);
            int i4 = PurchaseClient + 61;
            hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return subscriptionPurchase;
            }
            throw null;
        }
    }

    public SubscriptionPurchase(String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List<SubscriptionPurchaseLineItem> list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.acknowledgementState = str;
        this.canceledStateContext = canceledStateContext;
        this.externalAccountIdentifiers = externalAccountIdentifiers;
        this.kind = str2;
        this.latestOrderId = str3;
        this.lineItems = list;
        this.linkedPurchaseToken = str4;
        this.pausedStateContext = pausedStateContext;
        this.regionCode = str5;
        this.startTime = str6;
        this.subscribeWithGoogleInfo = subscribeWithGoogleInfo;
        this.subscriptionState = str7;
        this.testPurchase = testPurchase;
    }

    public static /* synthetic */ SubscriptionPurchase copy$default(SubscriptionPurchase subscriptionPurchase, String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = subscriptionPurchase.acknowledgementState;
        }
        return subscriptionPurchase.copy(str, (i4 & 2) != 0 ? subscriptionPurchase.canceledStateContext : canceledStateContext, (i4 & 4) != 0 ? subscriptionPurchase.externalAccountIdentifiers : externalAccountIdentifiers, (i4 & 8) != 0 ? subscriptionPurchase.kind : str2, (i4 & 16) != 0 ? subscriptionPurchase.latestOrderId : str3, (i4 & 32) != 0 ? subscriptionPurchase.lineItems : list, (i4 & 64) != 0 ? subscriptionPurchase.linkedPurchaseToken : str4, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? subscriptionPurchase.pausedStateContext : pausedStateContext, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? subscriptionPurchase.regionCode : str5, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? subscriptionPurchase.startTime : str6, (i4 & 1024) != 0 ? subscriptionPurchase.subscribeWithGoogleInfo : subscribeWithGoogleInfo, (i4 & a.f17688n) != 0 ? subscriptionPurchase.subscriptionState : str7, (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? subscriptionPurchase.testPurchase : testPurchase);
    }

    public final String component1() {
        return this.acknowledgementState;
    }

    public final String component10() {
        return this.startTime;
    }

    public final SubscribeWithGoogleInfo component11() {
        return this.subscribeWithGoogleInfo;
    }

    public final String component12() {
        return this.subscriptionState;
    }

    public final TestPurchase component13() {
        return this.testPurchase;
    }

    public final CanceledStateContext component2() {
        return this.canceledStateContext;
    }

    public final ExternalAccountIdentifiers component3() {
        return this.externalAccountIdentifiers;
    }

    public final String component4() {
        return this.kind;
    }

    public final String component5() {
        return this.latestOrderId;
    }

    public final List<SubscriptionPurchaseLineItem> component6() {
        return this.lineItems;
    }

    public final String component7() {
        return this.linkedPurchaseToken;
    }

    public final PausedStateContext component8() {
        return this.pausedStateContext;
    }

    public final String component9() {
        return this.regionCode;
    }

    public final SubscriptionPurchase copy(String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List<SubscriptionPurchaseLineItem> list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SubscriptionPurchase(str, canceledStateContext, externalAccountIdentifiers, str2, str3, list, str4, pausedStateContext, str5, str6, subscribeWithGoogleInfo, str7, testPurchase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPurchase)) {
            return false;
        }
        SubscriptionPurchase subscriptionPurchase = (SubscriptionPurchase) obj;
        return Intrinsics.areEqual(this.acknowledgementState, subscriptionPurchase.acknowledgementState) && Intrinsics.areEqual(this.canceledStateContext, subscriptionPurchase.canceledStateContext) && Intrinsics.areEqual(this.externalAccountIdentifiers, subscriptionPurchase.externalAccountIdentifiers) && Intrinsics.areEqual(this.kind, subscriptionPurchase.kind) && Intrinsics.areEqual(this.latestOrderId, subscriptionPurchase.latestOrderId) && Intrinsics.areEqual(this.lineItems, subscriptionPurchase.lineItems) && Intrinsics.areEqual(this.linkedPurchaseToken, subscriptionPurchase.linkedPurchaseToken) && Intrinsics.areEqual(this.pausedStateContext, subscriptionPurchase.pausedStateContext) && Intrinsics.areEqual(this.regionCode, subscriptionPurchase.regionCode) && Intrinsics.areEqual(this.startTime, subscriptionPurchase.startTime) && Intrinsics.areEqual(this.subscribeWithGoogleInfo, subscriptionPurchase.subscribeWithGoogleInfo) && Intrinsics.areEqual(this.subscriptionState, subscriptionPurchase.subscriptionState) && Intrinsics.areEqual(this.testPurchase, subscriptionPurchase.testPurchase);
    }

    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    public final List<SubscriptionPurchaseLineItem> getLineItems() {
        return this.lineItems;
    }

    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    public final int hashCode() {
        int hashCode = this.acknowledgementState.hashCode() * 31;
        CanceledStateContext canceledStateContext = this.canceledStateContext;
        int hashCode2 = (hashCode + (canceledStateContext == null ? 0 : canceledStateContext.hashCode())) * 31;
        ExternalAccountIdentifiers externalAccountIdentifiers = this.externalAccountIdentifiers;
        int hashCode3 = (((((((hashCode2 + (externalAccountIdentifiers == null ? 0 : externalAccountIdentifiers.hashCode())) * 31) + this.kind.hashCode()) * 31) + this.latestOrderId.hashCode()) * 31) + this.lineItems.hashCode()) * 31;
        String str = this.linkedPurchaseToken;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PausedStateContext pausedStateContext = this.pausedStateContext;
        int hashCode5 = (((((hashCode4 + (pausedStateContext == null ? 0 : pausedStateContext.hashCode())) * 31) + this.regionCode.hashCode()) * 31) + this.startTime.hashCode()) * 31;
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = this.subscribeWithGoogleInfo;
        int hashCode6 = (((hashCode5 + (subscribeWithGoogleInfo == null ? 0 : subscribeWithGoogleInfo.hashCode())) * 31) + this.subscriptionState.hashCode()) * 31;
        TestPurchase testPurchase = this.testPurchase;
        return hashCode6 + (testPurchase != null ? testPurchase.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionPurchase(acknowledgementState=" + this.acknowledgementState + ", canceledStateContext=" + this.canceledStateContext + ", externalAccountIdentifiers=" + this.externalAccountIdentifiers + ", kind=" + this.kind + ", latestOrderId=" + this.latestOrderId + ", lineItems=" + this.lineItems + ", linkedPurchaseToken=" + this.linkedPurchaseToken + ", pausedStateContext=" + this.pausedStateContext + ", regionCode=" + this.regionCode + ", startTime=" + this.startTime + ", subscribeWithGoogleInfo=" + this.subscribeWithGoogleInfo + ", subscriptionState=" + this.subscriptionState + ", testPurchase=" + this.testPurchase + ")";
    }
}
