package com.stripe.android.financialconnections.ui;

import android.webkit.URLUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.utils.UriUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class HandleClickableUrl {
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final Map internalLinkToPaneId;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final UriUtils uriUtils;

    public final class DeeplinkPayload {
        public final String nextPaneOrDrawerOnSecondaryCta;

        public DeeplinkPayload(String str) {
            this.nextPaneOrDrawerOnSecondaryCta = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeeplinkPayload) && Intrinsics.areEqual(this.nextPaneOrDrawerOnSecondaryCta, ((DeeplinkPayload) obj).nextPaneOrDrawerOnSecondaryCta);
        }

        public final int hashCode() {
            String str = this.nextPaneOrDrawerOnSecondaryCta;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeeplinkPayload(nextPaneOrDrawerOnSecondaryCta=", this.nextPaneOrDrawerOnSecondaryCta, ")");
        }
    }

    public HandleClickableUrl(UriUtils uriUtils, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        uriUtils.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.uriUtils = uriUtils;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.internalLinkToPaneId = Thread$State$EnumUnboxingLocalUtility.m("manual-entry", FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsSessionManifest.Pane pane, String str, Function1 function1, Map map, ContinuationImpl continuationImpl) {
        HandleClickableUrl$invoke$1 handleClickableUrl$invoke$1;
        int i;
        Object obj;
        Function2 function2;
        if (continuationImpl instanceof HandleClickableUrl$invoke$1) {
            handleClickableUrl$invoke$1 = (HandleClickableUrl$invoke$1) continuationImpl;
            int i2 = handleClickableUrl$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                handleClickableUrl$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = handleClickableUrl$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = handleClickableUrl$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    UriUtils uriUtils = this.uriUtils;
                    String queryParameter = uriUtils.getQueryParameter(str, "eventName");
                    if (queryParameter != null) {
                        this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(queryParameter, pane));
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        function1.invoke(str);
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (uriUtils.compareSchemeAuthorityAndPath((String) ((Map.Entry) obj).getKey(), str)) {
                                break;
                            }
                        }
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry == null || (function2 = (Function2) entry.getValue()) == null) {
                            this.logger.error("Unrecognized clickable text: ".concat(str), null);
                        } else {
                            String queryParameter2 = uriUtils.getQueryParameter(str, "nextPaneOrDrawerOnSecondaryCta");
                            DeeplinkPayload deeplinkPayload = new DeeplinkPayload(queryParameter2 != null ? (String) this.internalLinkToPaneId.get(queryParameter2) : null);
                            handleClickableUrl$invoke$1.label = 1;
                            if (function2.invoke(deeplinkPayload, handleClickableUrl$invoke$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        handleClickableUrl$invoke$1 = new HandleClickableUrl$invoke$1(this, continuationImpl);
        Object obj22 = handleClickableUrl$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = handleClickableUrl$invoke$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
