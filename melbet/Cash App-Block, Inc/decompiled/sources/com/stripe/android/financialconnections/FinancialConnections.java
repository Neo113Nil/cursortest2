package com.stripe.android.financialconnections;

import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.stripe.api.Institution;
import com.squareup.cash.stripe.api.StripeLinkEvent$GenericEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes8.dex */
public final class FinancialConnections {
    public static MaterialButton$$ExternalSyntheticLambda3 eventListener;

    /* renamed from: emitEvent-gIAlu-s$financial_connections_release, reason: not valid java name */
    public static Object m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name name, FinancialConnectionsEvent.Metadata metadata) {
        StripeLinkEvent$GenericEvent stripeLinkEvent$GenericEvent;
        name.getClass();
        try {
            Result.Companion companion = Result.Companion;
            MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = eventListener;
            if (materialButton$$ExternalSyntheticLambda3 == null) {
                return null;
            }
            ProducerScope producerScope = (ProducerScope) materialButton$$ExternalSyntheticLambda3.f$0;
            String obj = name.toString();
            Institution institution = new Institution(metadata.institutionName);
            FinancialConnectionsEvent.ErrorCode errorCode = metadata.errorCode;
            int ordinal = name.ordinal();
            if (ordinal == 4) {
                stripeLinkEvent$GenericEvent = new StripeLinkEvent$GenericEvent(obj, institution, null);
            } else if (ordinal != 9) {
                stripeLinkEvent$GenericEvent = new StripeLinkEvent$GenericEvent(obj, institution, null);
            } else {
                stripeLinkEvent$GenericEvent = new StripeLinkEvent$GenericEvent(obj, institution, errorCode != null ? errorCode.name() : null);
            }
            ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(stripeLinkEvent$GenericEvent);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return new Result.Failure(th);
        }
    }
}
