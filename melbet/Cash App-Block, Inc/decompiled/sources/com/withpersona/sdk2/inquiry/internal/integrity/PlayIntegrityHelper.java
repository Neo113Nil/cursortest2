package com.withpersona.sdk2.inquiry.internal.integrity;

import android.content.Context;
import com.google.android.play.core.integrity.bx;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger_Factory_Impl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes9.dex */
public final class PlayIntegrityHelper {
    public static final long INTEGRITY_TOKEN_PROVIDER_MAX_WAIT_DURATION;
    public final Context applicationContext;
    public final ContextScope coroutineScope;
    public final CoroutineDispatcher dispatcher;
    public final SubsystemLogger logger;
    public final MutexImpl mutex;
    public final StateFlowImpl playIntegrityState;
    public final RealStandardIntegrityManagerFactory standardIntegrityManagerFactory;

    public interface PlayIntegrityState {

        public final class Error implements PlayIntegrityState {
            public static final Error INSTANCE = new Error();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 1174409699;
            }

            public final String toString() {
                return "Error";
            }
        }

        public final class NotStarted implements PlayIntegrityState {
            public static final NotStarted INSTANCE = new NotStarted();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NotStarted);
            }

            public final int hashCode() {
                return -384804045;
            }

            public final String toString() {
                return "NotStarted";
            }
        }

        public final class Preparing implements PlayIntegrityState {
            public static final Preparing INSTANCE = new Preparing();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Preparing);
            }

            public final int hashCode() {
                return -230105505;
            }

            public final String toString() {
                return "Preparing";
            }
        }

        public final class Ready implements PlayIntegrityState {
            public final bx integrityTokenProvider;

            public Ready(bx bxVar) {
                bxVar.getClass();
                this.integrityTokenProvider = bxVar;
            }
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        INTEGRITY_TOKEN_PROVIDER_MAX_WAIT_DURATION = DurationKt.toDuration(10, DurationUnit.SECONDS);
    }

    public PlayIntegrityHelper(Context context, SubsystemLogger.Factory factory, RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory, CoroutineDispatcher coroutineDispatcher) {
        context.getClass();
        factory.getClass();
        realStandardIntegrityManagerFactory.getClass();
        coroutineDispatcher.getClass();
        this.applicationContext = context;
        this.standardIntegrityManagerFactory = realStandardIntegrityManagerFactory;
        this.dispatcher = coroutineDispatcher;
        this.logger = new SubsystemLogger((Logger) ((SubsystemLogger_Factory_Impl) factory).delegateFactory.loggerProvider.get(), "com.withpersona.sdk2.inquiry.integrity");
        this.mutex = new MutexImpl();
        this.coroutineScope = JobKt.CoroutineScope(coroutineDispatcher.plus(JobKt.SupervisorJob$default()));
        this.playIntegrityState = FlowKt.MutableStateFlow(PlayIntegrityState.NotStarted.INSTANCE);
    }
}
