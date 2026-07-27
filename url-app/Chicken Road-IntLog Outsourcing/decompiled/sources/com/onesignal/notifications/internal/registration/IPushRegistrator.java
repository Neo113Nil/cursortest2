package com.onesignal.notifications.internal.registration;

import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface IPushRegistrator {

    public static final class RegisterResult {
        private final String id;
        private final SubscriptionStatus status;

        public RegisterResult(String str, SubscriptionStatus status) {
            i.e(status, "status");
            this.id = str;
            this.status = status;
        }

        public final String getId() {
            return this.id;
        }

        public final SubscriptionStatus getStatus() {
            return this.status;
        }
    }

    Object registerForPush(InterfaceC1218d interfaceC1218d);
}
