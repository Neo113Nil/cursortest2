package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0081\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u009d\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006A"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchase;", "", "acknowledgementState", "", "canceledStateContext", "Lcom/appsflyer/internal/models/CanceledStateContext;", "externalAccountIdentifiers", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "kind", "latestOrderId", "lineItems", "", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "linkedPurchaseToken", "pausedStateContext", "Lcom/appsflyer/internal/models/PausedStateContext;", "regionCode", "startTime", "subscribeWithGoogleInfo", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "subscriptionState", "testPurchase", "Lcom/appsflyer/internal/models/TestPurchase;", "(Ljava/lang/String;Lcom/appsflyer/internal/models/CanceledStateContext;Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/internal/models/PausedStateContext;Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;Ljava/lang/String;Lcom/appsflyer/internal/models/TestPurchase;)V", "getAcknowledgementState", "()Ljava/lang/String;", "getCanceledStateContext", "()Lcom/appsflyer/internal/models/CanceledStateContext;", "getExternalAccountIdentifiers", "()Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "getKind", "getLatestOrderId", "getLineItems", "()Ljava/util/List;", "getLinkedPurchaseToken", "getPausedStateContext", "()Lcom/appsflyer/internal/models/PausedStateContext;", "getRegionCode", "getStartTime", "getSubscribeWithGoogleInfo", "()Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "getSubscriptionState", "getTestPurchase", "()Lcom/appsflyer/internal/models/TestPurchase;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionPurchase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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

    public static /* synthetic */ SubscriptionPurchase copy$default(SubscriptionPurchase subscriptionPurchase, String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionPurchase.acknowledgementState;
        }
        return subscriptionPurchase.copy(str, (i & 2) != 0 ? subscriptionPurchase.canceledStateContext : canceledStateContext, (i & 4) != 0 ? subscriptionPurchase.externalAccountIdentifiers : externalAccountIdentifiers, (i & 8) != 0 ? subscriptionPurchase.kind : str2, (i & 16) != 0 ? subscriptionPurchase.latestOrderId : str3, (i & 32) != 0 ? subscriptionPurchase.lineItems : list, (i & 64) != 0 ? subscriptionPurchase.linkedPurchaseToken : str4, (i & 128) != 0 ? subscriptionPurchase.pausedStateContext : pausedStateContext, (i & 256) != 0 ? subscriptionPurchase.regionCode : str5, (i & 512) != 0 ? subscriptionPurchase.startTime : str6, (i & 1024) != 0 ? subscriptionPurchase.subscribeWithGoogleInfo : subscribeWithGoogleInfo, (i & 2048) != 0 ? subscriptionPurchase.subscriptionState : str7, (i & 4096) != 0 ? subscriptionPurchase.testPurchase : testPurchase);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component11, reason: from getter */
    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    /* renamed from: component13, reason: from getter */
    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    /* renamed from: component2, reason: from getter */
    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    /* renamed from: component3, reason: from getter */
    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    /* renamed from: component4, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    public final List<SubscriptionPurchaseLineItem> component6() {
        return this.lineItems;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    /* renamed from: component8, reason: from getter */
    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    public final SubscriptionPurchase copy(String acknowledgementState, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String kind, String latestOrderId, List<SubscriptionPurchaseLineItem> lineItems, String linkedPurchaseToken, PausedStateContext pausedStateContext, String regionCode, String startTime, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String subscriptionState, TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(acknowledgementState, "acknowledgementState");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(latestOrderId, "latestOrderId");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        return new SubscriptionPurchase(acknowledgementState, canceledStateContext, externalAccountIdentifiers, kind, latestOrderId, lineItems, linkedPurchaseToken, pausedStateContext, regionCode, startTime, subscribeWithGoogleInfo, subscriptionState, testPurchase);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPurchase)) {
            return false;
        }
        SubscriptionPurchase subscriptionPurchase = (SubscriptionPurchase) other;
        return Intrinsics.areEqual(this.acknowledgementState, subscriptionPurchase.acknowledgementState) && Intrinsics.areEqual(this.canceledStateContext, subscriptionPurchase.canceledStateContext) && Intrinsics.areEqual(this.externalAccountIdentifiers, subscriptionPurchase.externalAccountIdentifiers) && Intrinsics.areEqual(this.kind, subscriptionPurchase.kind) && Intrinsics.areEqual(this.latestOrderId, subscriptionPurchase.latestOrderId) && Intrinsics.areEqual(this.lineItems, subscriptionPurchase.lineItems) && Intrinsics.areEqual(this.linkedPurchaseToken, subscriptionPurchase.linkedPurchaseToken) && Intrinsics.areEqual(this.pausedStateContext, subscriptionPurchase.pausedStateContext) && Intrinsics.areEqual(this.regionCode, subscriptionPurchase.regionCode) && Intrinsics.areEqual(this.startTime, subscriptionPurchase.startTime) && Intrinsics.areEqual(this.subscribeWithGoogleInfo, subscriptionPurchase.subscribeWithGoogleInfo) && Intrinsics.areEqual(this.subscriptionState, subscriptionPurchase.subscriptionState) && Intrinsics.areEqual(this.testPurchase, subscriptionPurchase.testPurchase);
    }

    public int hashCode() {
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

    public String toString() {
        return "SubscriptionPurchase(acknowledgementState=" + this.acknowledgementState + ", canceledStateContext=" + this.canceledStateContext + ", externalAccountIdentifiers=" + this.externalAccountIdentifiers + ", kind=" + this.kind + ", latestOrderId=" + this.latestOrderId + ", lineItems=" + this.lineItems + ", linkedPurchaseToken=" + this.linkedPurchaseToken + ", pausedStateContext=" + this.pausedStateContext + ", regionCode=" + this.regionCode + ", startTime=" + this.startTime + ", subscribeWithGoogleInfo=" + this.subscribeWithGoogleInfo + ", subscriptionState=" + this.subscriptionState + ", testPurchase=" + this.testPurchase + ")";
    }

    public SubscriptionPurchase(String acknowledgementState, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String kind, String latestOrderId, List<SubscriptionPurchaseLineItem> lineItems, String str, PausedStateContext pausedStateContext, String regionCode, String startTime, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String subscriptionState, TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(acknowledgementState, "acknowledgementState");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(latestOrderId, "latestOrderId");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        this.acknowledgementState = acknowledgementState;
        this.canceledStateContext = canceledStateContext;
        this.externalAccountIdentifiers = externalAccountIdentifiers;
        this.kind = kind;
        this.latestOrderId = latestOrderId;
        this.lineItems = lineItems;
        this.linkedPurchaseToken = str;
        this.pausedStateContext = pausedStateContext;
        this.regionCode = regionCode;
        this.startTime = startTime;
        this.subscribeWithGoogleInfo = subscribeWithGoogleInfo;
        this.subscriptionState = subscriptionState;
        this.testPurchase = testPurchase;
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

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchase$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<SubscriptionPurchase> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public SubscriptionPurchase fromJson(JSONObject json) {
            List list;
            Object object;
            Object object2;
            Object nullable;
            Object object3;
            Object object4;
            Object object5;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONArray jSONArray = json.getJSONArray("lineItems");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(\"lineItems\")");
            list = SubscriptionPurchaseKt.toList(jSONArray);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(SubscriptionPurchaseLineItem.INSTANCE.fromJson((JSONObject) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            String optString = json.optString("acknowledgementState");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"acknowledgementState\")");
            object = SubscriptionPurchaseKt.toObject(json, "canceledStateContext", CanceledStateContext.INSTANCE);
            CanceledStateContext canceledStateContext = (CanceledStateContext) object;
            object2 = SubscriptionPurchaseKt.toObject(json, "externalAccountIdentifiers", ExternalAccountIdentifiers.INSTANCE);
            ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) object2;
            String optString2 = json.optString("kind");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(\"kind\")");
            String optString3 = json.optString("latestOrderId");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(\"latestOrderId\")");
            nullable = SubscriptionPurchaseKt.getNullable(json, "linkedPurchaseToken");
            String str = (String) nullable;
            object3 = SubscriptionPurchaseKt.toObject(json, "pausedStateContext", PausedStateContext.INSTANCE);
            PausedStateContext pausedStateContext = (PausedStateContext) object3;
            String optString4 = json.optString("regionCode");
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(\"regionCode\")");
            String optString5 = json.optString("startTime");
            Intrinsics.checkNotNullExpressionValue(optString5, "optString(\"startTime\")");
            object4 = SubscriptionPurchaseKt.toObject(json, "subscribeWithGoogleInfo", SubscribeWithGoogleInfo.INSTANCE);
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) object4;
            String optString6 = json.optString("subscriptionState");
            Intrinsics.checkNotNullExpressionValue(optString6, "optString(\"subscriptionState\")");
            object5 = SubscriptionPurchaseKt.toObject(json, "testPurchase", TestPurchase.INSTANCE);
            return new SubscriptionPurchase(optString, canceledStateContext, externalAccountIdentifiers, optString2, optString3, arrayList2, str, pausedStateContext, optString4, optString5, subscribeWithGoogleInfo, optString6, (TestPurchase) object5);
        }
    }
}
