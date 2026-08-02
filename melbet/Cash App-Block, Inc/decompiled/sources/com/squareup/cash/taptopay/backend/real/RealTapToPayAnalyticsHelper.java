package com.squareup.cash.taptopay.backend.real;

import android.content.SharedPreferences;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.taptopay.ErrorType;
import com.squareup.cash.cdf.taptopay.FlowType;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.cdf.taptopay.TapToPayInteractSelectItem;
import com.squareup.cash.cdf.taptopay.TapToPayInteractTapCard;
import com.squareup.cash.cdf.taptopay.TapToPayInteractViewError;
import com.squareup.cash.cdf.taptopay.TapToPayInteractViewScreen;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealTapToPayAnalyticsHelper {
    public final Analytics analytics;
    public final SharedPreferences preferences;
    public final RealTapToPayEligibilityProvider ttpEligibilityProvider;
    public final RealTapToPaySessionManager ttpSessionManager;

    public RealTapToPayAnalyticsHelper(Analytics analytics, SharedPreferences sharedPreferences, RealTapToPaySessionManager realTapToPaySessionManager, RealTapToPayEligibilityProvider realTapToPayEligibilityProvider, RealUuidGenerator realUuidGenerator) {
        this.analytics = analytics;
        this.preferences = sharedPreferences;
        this.ttpSessionManager = realTapToPaySessionManager;
        this.ttpEligibilityProvider = realTapToPayEligibilityProvider;
    }

    public static /* synthetic */ Object submitSelectEvent$default(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, String str, String str2, ScreenID screenID, String str3, String str4, SuspendLambda suspendLambda, int i) {
        SuspendLambda suspendLambda2;
        String str5;
        FlowType flowType = FlowType.PAYMENT;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            flowType = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            suspendLambda2 = suspendLambda;
            str5 = null;
        } else {
            suspendLambda2 = suspendLambda;
            str5 = str4;
        }
        return realTapToPayAnalyticsHelper.submitSelectEvent(str, str2, flowType, screenID, str3, str5, suspendLambda2);
    }

    public static /* synthetic */ Object submitViewEvent$default(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, String str, ScreenID screenID, SuspendLambda suspendLambda, int i) {
        FlowType flowType = FlowType.PAYMENT;
        if ((i & 2) != 0) {
            str = null;
        }
        return realTapToPayAnalyticsHelper.submitViewEvent(null, str, flowType, screenID, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum determineFlowType(FlowType flowType, ContinuationImpl continuationImpl) {
        RealTapToPayAnalyticsHelper$determineFlowType$1 realTapToPayAnalyticsHelper$determineFlowType$1;
        int i;
        TapToPayPaymentData tapToPayPaymentData;
        if (continuationImpl instanceof RealTapToPayAnalyticsHelper$determineFlowType$1) {
            realTapToPayAnalyticsHelper$determineFlowType$1 = (RealTapToPayAnalyticsHelper$determineFlowType$1) continuationImpl;
            int i2 = realTapToPayAnalyticsHelper$determineFlowType$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayAnalyticsHelper$determineFlowType$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTapToPayAnalyticsHelper$determineFlowType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayAnalyticsHelper$determineFlowType$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (flowType == null) {
                        RealTapToPayEligibilityProvider realTapToPayEligibilityProvider = this.ttpEligibilityProvider;
                        FlowExtensionsKt$combine$$inlined$combine$1 flowExtensionsKt$combine$$inlined$combine$1 = new FlowExtensionsKt$combine$$inlined$combine$1(10, realTapToPayEligibilityProvider.syncValueReader.getAllValues(AndroidSyncValueSpecs.C4bTapToPay), realTapToPayEligibilityProvider);
                        realTapToPayAnalyticsHelper$determineFlowType$1.label = 1;
                        obj = FlowKt.firstOrNull(flowExtensionsKt$combine$$inlined$combine$1, realTapToPayAnalyticsHelper$determineFlowType$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return (flowType == FlowType.PAYMENT || (tapToPayPaymentData = this.ttpSessionManager.ttpSessionData) == null || !tapToPayPaymentData.isDemoMode) ? flowType : FlowType.DEMO_PAYMENT;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                flowType = !Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) ? FlowType.ONBOARDING : FlowType.PAYMENT;
                if (flowType == FlowType.PAYMENT) {
                }
            }
        }
        realTapToPayAnalyticsHelper$determineFlowType$1 = new RealTapToPayAnalyticsHelper$determineFlowType$1(this, continuationImpl);
        Object obj2 = realTapToPayAnalyticsHelper$determineFlowType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayAnalyticsHelper$determineFlowType$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual((Boolean) obj2, Boolean.TRUE)) {
        }
        if (flowType == FlowType.PAYMENT) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitErrorEvent(FlowType flowType, String str, ErrorType errorType, ContinuationImpl continuationImpl) {
        RealTapToPayAnalyticsHelper$submitErrorEvent$1 realTapToPayAnalyticsHelper$submitErrorEvent$1;
        int i;
        Analytics analytics;
        if (continuationImpl instanceof RealTapToPayAnalyticsHelper$submitErrorEvent$1) {
            realTapToPayAnalyticsHelper$submitErrorEvent$1 = (RealTapToPayAnalyticsHelper$submitErrorEvent$1) continuationImpl;
            int i2 = realTapToPayAnalyticsHelper$submitErrorEvent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayAnalyticsHelper$submitErrorEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTapToPayAnalyticsHelper$submitErrorEvent$1.result;
                Enum r1 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayAnalyticsHelper$submitErrorEvent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realTapToPayAnalyticsHelper$submitErrorEvent$1.L$2 = str;
                    realTapToPayAnalyticsHelper$submitErrorEvent$1.L$3 = errorType;
                    Analytics analytics2 = this.analytics;
                    realTapToPayAnalyticsHelper$submitErrorEvent$1.L$5 = analytics2;
                    realTapToPayAnalyticsHelper$submitErrorEvent$1.label = 1;
                    Enum determineFlowType = determineFlowType(flowType, realTapToPayAnalyticsHelper$submitErrorEvent$1);
                    if (determineFlowType == r1) {
                        return r1;
                    }
                    obj = determineFlowType;
                    analytics = analytics2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analytics = realTapToPayAnalyticsHelper$submitErrorEvent$1.L$5;
                    errorType = realTapToPayAnalyticsHelper$submitErrorEvent$1.L$3;
                    str = realTapToPayAnalyticsHelper$submitErrorEvent$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                analytics.track(new TapToPayInteractViewError((FlowType) obj, errorType, str, null, null), null);
                return Unit.INSTANCE;
            }
        }
        realTapToPayAnalyticsHelper$submitErrorEvent$1 = new RealTapToPayAnalyticsHelper$submitErrorEvent$1(this, continuationImpl);
        Object obj2 = realTapToPayAnalyticsHelper$submitErrorEvent$1.result;
        Enum r12 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayAnalyticsHelper$submitErrorEvent$1.label;
        if (i != 0) {
        }
        analytics.track(new TapToPayInteractViewError((FlowType) obj2, errorType, str, null, null), null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitSelectEvent(String str, String str2, FlowType flowType, ScreenID screenID, String str3, String str4, ContinuationImpl continuationImpl) {
        RealTapToPayAnalyticsHelper$submitSelectEvent$1 realTapToPayAnalyticsHelper$submitSelectEvent$1;
        Enum r3;
        int i;
        ScreenID screenID2;
        String str5;
        String str6;
        String str7;
        String str8;
        Analytics analytics;
        String string2;
        FlowType flowType2;
        ScreenID screenID3;
        String str9;
        String str10;
        if (continuationImpl instanceof RealTapToPayAnalyticsHelper$submitSelectEvent$1) {
            realTapToPayAnalyticsHelper$submitSelectEvent$1 = (RealTapToPayAnalyticsHelper$submitSelectEvent$1) continuationImpl;
            int i2 = realTapToPayAnalyticsHelper$submitSelectEvent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayAnalyticsHelper$submitSelectEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTapToPayAnalyticsHelper$submitSelectEvent$1.result;
                r3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayAnalyticsHelper$submitSelectEvent$1.label;
                SharedPreferences sharedPreferences = this.preferences;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.L$0 = str;
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.L$1 = str2;
                    screenID2 = screenID;
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.L$3 = screenID2;
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.L$4 = str3;
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.L$5 = str4;
                    Analytics analytics2 = this.analytics;
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.L$6 = analytics2;
                    realTapToPayAnalyticsHelper$submitSelectEvent$1.label = 1;
                    Enum determineFlowType = determineFlowType(flowType, realTapToPayAnalyticsHelper$submitSelectEvent$1);
                    if (determineFlowType != r3) {
                        str5 = str3;
                        str6 = str2;
                        str7 = str4;
                        str8 = str;
                        obj = determineFlowType;
                        analytics = analytics2;
                    }
                    return r3;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analytics = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$7;
                    FlowType flowType3 = (FlowType) realTapToPayAnalyticsHelper$submitSelectEvent$1.L$6;
                    str7 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$5;
                    str5 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$4;
                    ScreenID screenID4 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$3;
                    String str11 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$1;
                    String str12 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowType2 = flowType3;
                    screenID3 = screenID4;
                    str10 = str11;
                    str9 = str12;
                    String str13 = str7;
                    String str14 = str5;
                    analytics.track(new TapToPayInteractSelectItem(str9, sharedPreferences.getString("TAP_TO_PAY_SERVER_FLOW_KEY", null), (String) obj, str10, flowType2, screenID3, str14, str13), null);
                    return Unit.INSTANCE;
                }
                analytics = (Analytics) realTapToPayAnalyticsHelper$submitSelectEvent$1.L$6;
                str7 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$5;
                str5 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$4;
                screenID2 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$3;
                str6 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$1;
                str8 = realTapToPayAnalyticsHelper$submitSelectEvent$1.L$0;
                SafeTrace.throwOnFailure(obj);
                FlowType flowType4 = (FlowType) obj;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$0 = str8;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$1 = str6;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$3 = screenID2;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$4 = str5;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$5 = str7;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$6 = flowType4;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.L$7 = analytics;
                realTapToPayAnalyticsHelper$submitSelectEvent$1.label = 2;
                string2 = sharedPreferences.getString("TAP_TO_PAY_FLOW_KEY", null);
                if (string2 == null) {
                    string2 = re$$ExternalSyntheticOutline0.m();
                    sharedPreferences.edit().putString("TAP_TO_PAY_FLOW_KEY", string2).apply();
                }
                if (string2 != r3) {
                    flowType2 = flowType4;
                    obj = string2;
                    screenID3 = screenID2;
                    str9 = str8;
                    str10 = str6;
                    String str132 = str7;
                    String str142 = str5;
                    analytics.track(new TapToPayInteractSelectItem(str9, sharedPreferences.getString("TAP_TO_PAY_SERVER_FLOW_KEY", null), (String) obj, str10, flowType2, screenID3, str142, str132), null);
                    return Unit.INSTANCE;
                }
                return r3;
            }
        }
        realTapToPayAnalyticsHelper$submitSelectEvent$1 = new RealTapToPayAnalyticsHelper$submitSelectEvent$1(this, continuationImpl);
        Object obj2 = realTapToPayAnalyticsHelper$submitSelectEvent$1.result;
        r3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayAnalyticsHelper$submitSelectEvent$1.label;
        SharedPreferences sharedPreferences2 = this.preferences;
        if (i != 0) {
        }
        FlowType flowType42 = (FlowType) obj2;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$0 = str8;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$1 = str6;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$3 = screenID2;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$4 = str5;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$5 = str7;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$6 = flowType42;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.L$7 = analytics;
        realTapToPayAnalyticsHelper$submitSelectEvent$1.label = 2;
        string2 = sharedPreferences2.getString("TAP_TO_PAY_FLOW_KEY", null);
        if (string2 == null) {
        }
        if (string2 != r3) {
        }
        return r3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitTapEvent(String str, FlowType flowType, ScreenID screenID, ContinuationImpl continuationImpl) {
        RealTapToPayAnalyticsHelper$submitTapEvent$1 realTapToPayAnalyticsHelper$submitTapEvent$1;
        Enum r2;
        int i;
        ScreenID screenID2;
        Object obj;
        Analytics analytics;
        String string2;
        String str2;
        ScreenID screenID3;
        FlowType flowType2;
        if (continuationImpl instanceof RealTapToPayAnalyticsHelper$submitTapEvent$1) {
            realTapToPayAnalyticsHelper$submitTapEvent$1 = (RealTapToPayAnalyticsHelper$submitTapEvent$1) continuationImpl;
            int i2 = realTapToPayAnalyticsHelper$submitTapEvent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayAnalyticsHelper$submitTapEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realTapToPayAnalyticsHelper$submitTapEvent$1.result;
                r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayAnalyticsHelper$submitTapEvent$1.label;
                SharedPreferences sharedPreferences = this.preferences;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realTapToPayAnalyticsHelper$submitTapEvent$1.L$0 = str;
                    screenID2 = screenID;
                    realTapToPayAnalyticsHelper$submitTapEvent$1.L$2 = screenID2;
                    Analytics analytics2 = this.analytics;
                    realTapToPayAnalyticsHelper$submitTapEvent$1.L$3 = analytics2;
                    realTapToPayAnalyticsHelper$submitTapEvent$1.label = 1;
                    Enum determineFlowType = determineFlowType(flowType, realTapToPayAnalyticsHelper$submitTapEvent$1);
                    if (determineFlowType != r2) {
                        obj = determineFlowType;
                        analytics = analytics2;
                    }
                    return r2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analytics = realTapToPayAnalyticsHelper$submitTapEvent$1.L$4;
                    FlowType flowType3 = (FlowType) realTapToPayAnalyticsHelper$submitTapEvent$1.L$3;
                    ScreenID screenID4 = realTapToPayAnalyticsHelper$submitTapEvent$1.L$2;
                    String str3 = realTapToPayAnalyticsHelper$submitTapEvent$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    flowType2 = flowType3;
                    str2 = str3;
                    screenID3 = screenID4;
                    analytics.track(new TapToPayInteractTapCard(str2, sharedPreferences.getString("TAP_TO_PAY_SERVER_FLOW_KEY", null), (String) obj2, flowType2, screenID3), null);
                    return Unit.INSTANCE;
                }
                analytics = (Analytics) realTapToPayAnalyticsHelper$submitTapEvent$1.L$3;
                ScreenID screenID5 = realTapToPayAnalyticsHelper$submitTapEvent$1.L$2;
                String str4 = realTapToPayAnalyticsHelper$submitTapEvent$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                screenID2 = screenID5;
                str = str4;
                obj = obj2;
                FlowType flowType4 = (FlowType) obj;
                realTapToPayAnalyticsHelper$submitTapEvent$1.L$0 = str;
                realTapToPayAnalyticsHelper$submitTapEvent$1.L$2 = screenID2;
                realTapToPayAnalyticsHelper$submitTapEvent$1.L$3 = flowType4;
                realTapToPayAnalyticsHelper$submitTapEvent$1.L$4 = analytics;
                realTapToPayAnalyticsHelper$submitTapEvent$1.label = 2;
                string2 = sharedPreferences.getString("TAP_TO_PAY_FLOW_KEY", null);
                if (string2 == null) {
                    string2 = re$$ExternalSyntheticOutline0.m();
                    sharedPreferences.edit().putString("TAP_TO_PAY_FLOW_KEY", string2).apply();
                }
                if (string2 != r2) {
                    str2 = str;
                    screenID3 = screenID2;
                    flowType2 = flowType4;
                    obj2 = string2;
                    analytics.track(new TapToPayInteractTapCard(str2, sharedPreferences.getString("TAP_TO_PAY_SERVER_FLOW_KEY", null), (String) obj2, flowType2, screenID3), null);
                    return Unit.INSTANCE;
                }
                return r2;
            }
        }
        realTapToPayAnalyticsHelper$submitTapEvent$1 = new RealTapToPayAnalyticsHelper$submitTapEvent$1(this, continuationImpl);
        Object obj22 = realTapToPayAnalyticsHelper$submitTapEvent$1.result;
        r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayAnalyticsHelper$submitTapEvent$1.label;
        SharedPreferences sharedPreferences2 = this.preferences;
        if (i != 0) {
        }
        FlowType flowType42 = (FlowType) obj;
        realTapToPayAnalyticsHelper$submitTapEvent$1.L$0 = str;
        realTapToPayAnalyticsHelper$submitTapEvent$1.L$2 = screenID2;
        realTapToPayAnalyticsHelper$submitTapEvent$1.L$3 = flowType42;
        realTapToPayAnalyticsHelper$submitTapEvent$1.L$4 = analytics;
        realTapToPayAnalyticsHelper$submitTapEvent$1.label = 2;
        string2 = sharedPreferences2.getString("TAP_TO_PAY_FLOW_KEY", null);
        if (string2 == null) {
        }
        if (string2 != r2) {
        }
        return r2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitViewEvent(String str, String str2, FlowType flowType, ScreenID screenID, ContinuationImpl continuationImpl) {
        RealTapToPayAnalyticsHelper$submitViewEvent$1 realTapToPayAnalyticsHelper$submitViewEvent$1;
        Enum r2;
        int i;
        String str3;
        ScreenID screenID2;
        Object obj;
        String str4;
        Analytics analytics;
        String string2;
        String str5;
        String str6;
        FlowType flowType2;
        ScreenID screenID3;
        if (continuationImpl instanceof RealTapToPayAnalyticsHelper$submitViewEvent$1) {
            realTapToPayAnalyticsHelper$submitViewEvent$1 = (RealTapToPayAnalyticsHelper$submitViewEvent$1) continuationImpl;
            int i2 = realTapToPayAnalyticsHelper$submitViewEvent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTapToPayAnalyticsHelper$submitViewEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realTapToPayAnalyticsHelper$submitViewEvent$1.result;
                r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTapToPayAnalyticsHelper$submitViewEvent$1.label;
                SharedPreferences sharedPreferences = this.preferences;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realTapToPayAnalyticsHelper$submitViewEvent$1.L$0 = str;
                    str3 = str2;
                    realTapToPayAnalyticsHelper$submitViewEvent$1.L$1 = str3;
                    screenID2 = screenID;
                    realTapToPayAnalyticsHelper$submitViewEvent$1.L$3 = screenID2;
                    Analytics analytics2 = this.analytics;
                    realTapToPayAnalyticsHelper$submitViewEvent$1.L$4 = analytics2;
                    realTapToPayAnalyticsHelper$submitViewEvent$1.label = 1;
                    Enum determineFlowType = determineFlowType(flowType, realTapToPayAnalyticsHelper$submitViewEvent$1);
                    if (determineFlowType != r2) {
                        obj = determineFlowType;
                        str4 = str;
                        analytics = analytics2;
                    }
                    return r2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analytics = realTapToPayAnalyticsHelper$submitViewEvent$1.L$5;
                    FlowType flowType3 = (FlowType) realTapToPayAnalyticsHelper$submitViewEvent$1.L$4;
                    ScreenID screenID4 = realTapToPayAnalyticsHelper$submitViewEvent$1.L$3;
                    String str7 = realTapToPayAnalyticsHelper$submitViewEvent$1.L$1;
                    String str8 = realTapToPayAnalyticsHelper$submitViewEvent$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    str5 = str8;
                    flowType2 = flowType3;
                    screenID3 = screenID4;
                    str6 = str7;
                    analytics.track(new TapToPayInteractViewScreen(str5, sharedPreferences.getString("TAP_TO_PAY_SERVER_FLOW_KEY", null), (String) obj2, str6, flowType2, screenID3), null);
                    return Unit.INSTANCE;
                }
                analytics = (Analytics) realTapToPayAnalyticsHelper$submitViewEvent$1.L$4;
                ScreenID screenID5 = realTapToPayAnalyticsHelper$submitViewEvent$1.L$3;
                String str9 = realTapToPayAnalyticsHelper$submitViewEvent$1.L$1;
                String str10 = realTapToPayAnalyticsHelper$submitViewEvent$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                obj = obj2;
                str4 = str10;
                screenID2 = screenID5;
                str3 = str9;
                FlowType flowType4 = (FlowType) obj;
                realTapToPayAnalyticsHelper$submitViewEvent$1.L$0 = str4;
                realTapToPayAnalyticsHelper$submitViewEvent$1.L$1 = str3;
                realTapToPayAnalyticsHelper$submitViewEvent$1.L$3 = screenID2;
                realTapToPayAnalyticsHelper$submitViewEvent$1.L$4 = flowType4;
                realTapToPayAnalyticsHelper$submitViewEvent$1.L$5 = analytics;
                realTapToPayAnalyticsHelper$submitViewEvent$1.label = 2;
                string2 = sharedPreferences.getString("TAP_TO_PAY_FLOW_KEY", null);
                if (string2 == null) {
                    string2 = re$$ExternalSyntheticOutline0.m();
                    sharedPreferences.edit().putString("TAP_TO_PAY_FLOW_KEY", string2).apply();
                }
                if (string2 != r2) {
                    String str11 = string2;
                    str5 = str4;
                    obj2 = str11;
                    str6 = str3;
                    flowType2 = flowType4;
                    screenID3 = screenID2;
                    analytics.track(new TapToPayInteractViewScreen(str5, sharedPreferences.getString("TAP_TO_PAY_SERVER_FLOW_KEY", null), (String) obj2, str6, flowType2, screenID3), null);
                    return Unit.INSTANCE;
                }
                return r2;
            }
        }
        realTapToPayAnalyticsHelper$submitViewEvent$1 = new RealTapToPayAnalyticsHelper$submitViewEvent$1(this, continuationImpl);
        Object obj22 = realTapToPayAnalyticsHelper$submitViewEvent$1.result;
        r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTapToPayAnalyticsHelper$submitViewEvent$1.label;
        SharedPreferences sharedPreferences2 = this.preferences;
        if (i != 0) {
        }
        FlowType flowType42 = (FlowType) obj;
        realTapToPayAnalyticsHelper$submitViewEvent$1.L$0 = str4;
        realTapToPayAnalyticsHelper$submitViewEvent$1.L$1 = str3;
        realTapToPayAnalyticsHelper$submitViewEvent$1.L$3 = screenID2;
        realTapToPayAnalyticsHelper$submitViewEvent$1.L$4 = flowType42;
        realTapToPayAnalyticsHelper$submitViewEvent$1.L$5 = analytics;
        realTapToPayAnalyticsHelper$submitViewEvent$1.label = 2;
        string2 = sharedPreferences2.getString("TAP_TO_PAY_FLOW_KEY", null);
        if (string2 == null) {
        }
        if (string2 != r2) {
        }
        return r2;
    }
}
