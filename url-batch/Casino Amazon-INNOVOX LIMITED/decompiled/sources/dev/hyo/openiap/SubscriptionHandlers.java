package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012&\b\u0002\u0010\u0002\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012&\b\u0002\u0010\u0007\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\t\u0012&\b\u0002\u0010\n\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\f\u0012&\b\u0002\u0010\r\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f\u0012&\b\u0002\u0010\u0010\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001c\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J,\u0010\u001d\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\tHÆ\u0003¢\u0006\u0002\u0010\u0016J,\u0010\u001e\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\fHÆ\u0003¢\u0006\u0002\u0010\u0016J,\u0010\u001f\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J,\u0010 \u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0012HÆ\u0003¢\u0006\u0002\u0010\u0016JÖ\u0001\u0010!\u001a\u00020\u00002&\b\u0002\u0010\u0002\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u00062&\b\u0002\u0010\u0007\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\t2&\b\u0002\u0010\n\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\f2&\b\u0002\u0010\r\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f2&\b\u0002\u0010\u0010\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0012HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R1\u0010\u0002\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R1\u0010\u0007\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R1\u0010\n\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\f¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R1\u0010\r\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R1\u0010\u0010\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0012¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016¨\u0006)"}, d2 = {"Ldev/hyo/openiap/SubscriptionHandlers;", "", "developerProvidedBillingAndroid", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ldev/hyo/openiap/DeveloperProvidedBillingDetailsAndroid;", "Ldev/hyo/openiap/SubscriptionDeveloperProvidedBillingAndroidHandler;", "promotedProductIOS", "", "Ldev/hyo/openiap/SubscriptionPromotedProductIOSHandler;", "purchaseError", "Ldev/hyo/openiap/PurchaseError;", "Ldev/hyo/openiap/SubscriptionPurchaseErrorHandler;", "purchaseUpdated", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/SubscriptionPurchaseUpdatedHandler;", "userChoiceBillingAndroid", "Ldev/hyo/openiap/UserChoiceBillingDetails;", "Ldev/hyo/openiap/SubscriptionUserChoiceBillingAndroidHandler;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getDeveloperProvidedBillingAndroid", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getPromotedProductIOS", "getPurchaseError", "getPurchaseUpdated", "getUserChoiceBillingAndroid", "component1", "component2", "component3", "component4", "component5", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ldev/hyo/openiap/SubscriptionHandlers;", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionHandlers {
    public static final int $stable = 8;
    private final Function1<Continuation<? super DeveloperProvidedBillingDetailsAndroid>, Object> developerProvidedBillingAndroid;
    private final Function1<Continuation<? super String>, Object> promotedProductIOS;
    private final Function1<Continuation<? super PurchaseError>, Object> purchaseError;
    private final Function1<Continuation<? super Purchase>, Object> purchaseUpdated;
    private final Function1<Continuation<? super UserChoiceBillingDetails>, Object> userChoiceBillingAndroid;

    public SubscriptionHandlers() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SubscriptionHandlers copy$default(SubscriptionHandlers subscriptionHandlers, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = subscriptionHandlers.developerProvidedBillingAndroid;
        }
        if ((i & 2) != 0) {
            function12 = subscriptionHandlers.promotedProductIOS;
        }
        if ((i & 4) != 0) {
            function13 = subscriptionHandlers.purchaseError;
        }
        if ((i & 8) != 0) {
            function14 = subscriptionHandlers.purchaseUpdated;
        }
        if ((i & 16) != 0) {
            function15 = subscriptionHandlers.userChoiceBillingAndroid;
        }
        Function1 function16 = function15;
        Function1 function17 = function13;
        return subscriptionHandlers.copy(function1, function12, function17, function14, function16);
    }

    public final Function1<Continuation<? super DeveloperProvidedBillingDetailsAndroid>, Object> component1() {
        return this.developerProvidedBillingAndroid;
    }

    public final Function1<Continuation<? super String>, Object> component2() {
        return this.promotedProductIOS;
    }

    public final Function1<Continuation<? super PurchaseError>, Object> component3() {
        return this.purchaseError;
    }

    public final Function1<Continuation<? super Purchase>, Object> component4() {
        return this.purchaseUpdated;
    }

    public final Function1<Continuation<? super UserChoiceBillingDetails>, Object> component5() {
        return this.userChoiceBillingAndroid;
    }

    public final SubscriptionHandlers copy(Function1<? super Continuation<? super DeveloperProvidedBillingDetailsAndroid>, ? extends Object> developerProvidedBillingAndroid, Function1<? super Continuation<? super String>, ? extends Object> promotedProductIOS, Function1<? super Continuation<? super PurchaseError>, ? extends Object> purchaseError, Function1<? super Continuation<? super Purchase>, ? extends Object> purchaseUpdated, Function1<? super Continuation<? super UserChoiceBillingDetails>, ? extends Object> userChoiceBillingAndroid) {
        return new SubscriptionHandlers(developerProvidedBillingAndroid, promotedProductIOS, purchaseError, purchaseUpdated, userChoiceBillingAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionHandlers)) {
            return false;
        }
        SubscriptionHandlers subscriptionHandlers = (SubscriptionHandlers) other;
        return Intrinsics.areEqual(this.developerProvidedBillingAndroid, subscriptionHandlers.developerProvidedBillingAndroid) && Intrinsics.areEqual(this.promotedProductIOS, subscriptionHandlers.promotedProductIOS) && Intrinsics.areEqual(this.purchaseError, subscriptionHandlers.purchaseError) && Intrinsics.areEqual(this.purchaseUpdated, subscriptionHandlers.purchaseUpdated) && Intrinsics.areEqual(this.userChoiceBillingAndroid, subscriptionHandlers.userChoiceBillingAndroid);
    }

    public int hashCode() {
        Function1<Continuation<? super DeveloperProvidedBillingDetailsAndroid>, Object> function1 = this.developerProvidedBillingAndroid;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<Continuation<? super String>, Object> function12 = this.promotedProductIOS;
        int hashCode2 = (hashCode + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<Continuation<? super PurchaseError>, Object> function13 = this.purchaseError;
        int hashCode3 = (hashCode2 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<Continuation<? super Purchase>, Object> function14 = this.purchaseUpdated;
        int hashCode4 = (hashCode3 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1<Continuation<? super UserChoiceBillingDetails>, Object> function15 = this.userChoiceBillingAndroid;
        return hashCode4 + (function15 != null ? function15.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionHandlers(developerProvidedBillingAndroid=" + this.developerProvidedBillingAndroid + ", promotedProductIOS=" + this.promotedProductIOS + ", purchaseError=" + this.purchaseError + ", purchaseUpdated=" + this.purchaseUpdated + ", userChoiceBillingAndroid=" + this.userChoiceBillingAndroid + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionHandlers(Function1<? super Continuation<? super DeveloperProvidedBillingDetailsAndroid>, ? extends Object> function1, Function1<? super Continuation<? super String>, ? extends Object> function12, Function1<? super Continuation<? super PurchaseError>, ? extends Object> function13, Function1<? super Continuation<? super Purchase>, ? extends Object> function14, Function1<? super Continuation<? super UserChoiceBillingDetails>, ? extends Object> function15) {
        this.developerProvidedBillingAndroid = function1;
        this.promotedProductIOS = function12;
        this.purchaseError = function13;
        this.purchaseUpdated = function14;
        this.userChoiceBillingAndroid = function15;
    }

    public /* synthetic */ SubscriptionHandlers(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15);
    }

    public final Function1<Continuation<? super DeveloperProvidedBillingDetailsAndroid>, Object> getDeveloperProvidedBillingAndroid() {
        return this.developerProvidedBillingAndroid;
    }

    public final Function1<Continuation<? super String>, Object> getPromotedProductIOS() {
        return this.promotedProductIOS;
    }

    public final Function1<Continuation<? super PurchaseError>, Object> getPurchaseError() {
        return this.purchaseError;
    }

    public final Function1<Continuation<? super Purchase>, Object> getPurchaseUpdated() {
        return this.purchaseUpdated;
    }

    public final Function1<Continuation<? super UserChoiceBillingDetails>, Object> getUserChoiceBillingAndroid() {
        return this.userChoiceBillingAndroid;
    }
}
