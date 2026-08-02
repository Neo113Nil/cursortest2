package com.squareup.cash.treehouse.activity;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService implements ActivityPaymentManager2, OutboundService {
    public final OutboundCallHandler callHandler;

    public ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acceptCryptoPayment(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 23, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$acceptCryptoPayment$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Flow activityUpdates() {
        Object call = this.callHandler.call(this, 35, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addReaction(String str, String str2, String str3, String str4, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{str, str2, str3, str4}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$addReaction$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object callNumber(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 7, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$callNumber$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancel(String str, ByteString byteString, String str2, String str3, String str4, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 2, new Object[]{str, byteString, str2, str3, str4}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancel$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelCryptoOrder(String str, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 19, new Object[]{str, str2, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelCryptoOrder$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelInvestmentOrder(String str, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 18, new Object[]{str, str2, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelInvestmentOrder$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 24, new Object[]{str, byteString, byteString2, byteString3, str2, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$cancelRecurringPurchase$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkStatus(String str, ByteString byteString, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 16, new Object[]{str, byteString, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$checkStatus$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final void clearBadges(Set set) {
        Object call = this.callHandler.call(this, 31, set);
        call.getClass();
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 36, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeClientScenario(String str, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 15, new Object[]{str, str2, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeClientScenario$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeScenarioPlan(String str, String str2, String str3, String str4, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 9, new Object[]{str, str2, str3, str4}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$completeScenarioPlan$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirm(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 1, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$confirm$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Flow deviceContacts() {
        Object call = this.callHandler.call(this, 33, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final void finishedInitialRendering() {
        Object call = this.callHandler.call(this, 32, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Flow getDisplayQuickAccessBar() {
        Object call = this.callHandler.call(this, 37, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object linkCard(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 4, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$linkCard$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeLoanPayment(String str, ByteString byteString, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 21, new Object[]{str, byteString, str2, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$makeLoanPayment$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openShareSheet(String str, ShareSheet shareSheet, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 30, new Object[]{str, shareSheet}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openShareSheet$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openUrl(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 5, new Object[]{str, str2, clientRouteUrl}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$openUrl$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object passcode(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 3, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$passcode$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refund(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 10, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$refund$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.label = 1;
                    obj = this.callHandler.callSuspending(this, 13, new Object[]{str, str2, str3, str4, str5}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 6, new Object[]{str, str2, str3, clientRouteUrl}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportProblem$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final void requestClientSync() {
        Object call = this.callHandler.call(this, 34, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 17, new Object[]{str, clientRouteUrl, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reverseDeposit$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showBnpl(String str, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 26, new Object[]{str}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showBnpl$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showContact(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 29, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showContact$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showPaymentDetailView(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 25, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showPaymentDetailView$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showProfile(String str, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 27, new Object[]{str, str2, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showProfile$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showThread(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 28, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$showThread$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object skipLoanPayment(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 22, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$skipLoanPayment$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 20, new Object[]{str, str2, clientRouteUrl, str3}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$startSupportFlow$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unreportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.label = 1;
                    obj = this.callHandler.callSuspending(this, 14, new Object[]{str, str2, str3, str4, str5}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$2.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifyIdentity(String str, String str2, String str3, String str4, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 8, new Object[]{str, str2, str3, str4}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$verifyIdentity$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportAbuse(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 11, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unreportAbuse(String str, String str2, Continuation continuation) {
        ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1 activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1;
        int i;
        if (continuation instanceof ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1) {
            activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1 = (ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1) continuation;
            int i2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 12, new Object[]{str, str2}, activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1 = new ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService$unreportAbuse$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }
}
