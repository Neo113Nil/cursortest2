package com.withpersona.sdk2.inquiry.internal;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.scannerview.TextSetter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final class SilentNetworkAuthenticationManager {
    public volatile StandaloneCoroutine currentJob;
    public final TextSetter orchestrator;
    public final ContextScope scope;

    public final class SnaParams {
        public final String checkUrl;
        public final String sessionToken;
        public final Integer timeoutSeconds;

        public SnaParams(Integer num, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.sessionToken = str;
            this.checkUrl = str2;
            this.timeoutSeconds = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SnaParams)) {
                return false;
            }
            SnaParams snaParams = (SnaParams) obj;
            return Intrinsics.areEqual(this.sessionToken, snaParams.sessionToken) && Intrinsics.areEqual(this.checkUrl, snaParams.checkUrl) && Intrinsics.areEqual(this.timeoutSeconds, snaParams.timeoutSeconds);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionToken.hashCode() * 31, 31, this.checkUrl);
            Integer num = this.timeoutSeconds;
            return m + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SnaParams(sessionToken=", this.sessionToken, ", checkUrl=", this.checkUrl, ", timeoutSeconds="), this.timeoutSeconds, ")");
        }
    }

    public SilentNetworkAuthenticationManager(TextSetter textSetter, CoroutineDispatcher coroutineDispatcher) {
        textSetter.getClass();
        coroutineDispatcher.getClass();
        this.orchestrator = textSetter;
        this.scope = JobKt.CoroutineScope(coroutineDispatcher.plus(JobKt.SupervisorJob$default()));
    }
}
