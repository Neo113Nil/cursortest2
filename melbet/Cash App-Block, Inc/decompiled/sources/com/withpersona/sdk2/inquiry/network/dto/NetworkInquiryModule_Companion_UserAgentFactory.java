package com.withpersona.sdk2.inquiry.network.dto;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes9.dex */
public final class NetworkInquiryModule_Companion_UserAgentFactory implements Factory {

    public static final class InstanceHolder {
        static final NetworkInquiryModule_Companion_UserAgentFactory INSTANCE = new NetworkInquiryModule_Companion_UserAgentFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_Companion_UserAgentFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String userAgent() {
        String userAgent = NetworkInquiryModule.INSTANCE.userAgent();
        Preconditions.checkNotNullFromProvides(userAgent);
        return userAgent;
    }

    @Override // javax.inject.Provider
    public String get() {
        return userAgent();
    }
}
