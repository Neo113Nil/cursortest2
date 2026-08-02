package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.model.ConsumerSession;
import java.util.Collection;
import java.util.List;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import org.slf4j.Marker;

/* loaded from: classes8.dex */
public final class RealConsumerSessionRepository {
    public final ReadonlyStateFlow consumerSessionFlow;
    public final SavedStateHandle savedStateHandle;

    public RealConsumerSessionRepository(SavedStateHandle savedStateHandle) {
        savedStateHandle.getClass();
        this.savedStateHandle = savedStateHandle;
        this.consumerSessionFlow = savedStateHandle.getStateFlow(null, "ConsumerSession");
    }

    public static CachedConsumerSession toCached(ConsumerSession consumerSession, String str) {
        String str2 = consumerSession.emailAddress;
        String replace$default = StringsKt__StringsJVMKt.replace$default(consumerSession.redactedFormattedPhoneNumber, Marker.ANY_MARKER, "•");
        String str3 = consumerSession.clientSecret;
        List<ConsumerSession.VerificationSession> list = consumerSession.verificationSessions;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ConsumerSession.VerificationSession verificationSession : list) {
                if (verificationSession.state == ConsumerSession.VerificationSession.SessionState.Verified || verificationSession.f1437type == ConsumerSession.VerificationSession.SessionType.SignUp) {
                    z = true;
                    break;
                }
            }
        }
        return new CachedConsumerSession(str2, replace$default, str3, str, z, consumerSession.linkBrand);
    }

    public final CachedConsumerSession provideConsumerSession() {
        return (CachedConsumerSession) this.savedStateHandle.get("ConsumerSession");
    }
}
