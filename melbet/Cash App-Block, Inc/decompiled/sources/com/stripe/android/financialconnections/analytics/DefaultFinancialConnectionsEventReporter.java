package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DefaultFinancialConnectionsEventReporter {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final AnalyticsRequestFactory analyticsRequestFactory;
    public final CoroutineContext workContext;

    /* loaded from: classes8.dex */
    public final class Event implements AnalyticsEvent {
        public final Map additionalParams;
        public final Code eventCode;
        public final String eventName;

        public enum Code {
            SheetPresented("sheet.presented"),
            SheetClosed("sheet.closed"),
            SheetFailed("sheet.failed");

            public final String code;

            Code(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "stripe_android.connections.".concat(this.code);
            }
        }

        public Event(Code code, Map map) {
            map.getClass();
            this.eventCode = code;
            this.additionalParams = map;
            this.eventName = code.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return this.eventCode == event.eventCode && Intrinsics.areEqual(this.additionalParams, event.additionalParams);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public final String getEventName() {
            return this.eventName;
        }

        public final int hashCode() {
            return this.additionalParams.hashCode() + (this.eventCode.hashCode() * 31);
        }

        public final String toString() {
            return "Event(eventCode=" + this.eventCode + ", additionalParams=" + this.additionalParams + ")";
        }
    }

    public DefaultFinancialConnectionsEventReporter(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, CoroutineContext coroutineContext) {
        defaultAnalyticsRequestExecutor.getClass();
        analyticsRequestFactory.getClass();
        coroutineContext.getClass();
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = coroutineContext;
    }
}
