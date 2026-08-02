package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformBillingResult {
    public static final Companion Companion = new Companion(null);
    private final String debugMessage;
    private final PlatformBillingResponse responseCode;
    private final long subResponseCode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformBillingResult fromList(List<? extends Object> list) {
            PlatformBillingResponse platformBillingResponse = (PlatformBillingResponse) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResponse");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            return new PlatformBillingResult(platformBillingResponse, (String) obj, ((Long) obj2).longValue());
        }

        private Companion() {
        }
    }

    public PlatformBillingResult(PlatformBillingResponse responseCode, String debugMessage, long j4) {
        i.e(responseCode, "responseCode");
        i.e(debugMessage, "debugMessage");
        this.responseCode = responseCode;
        this.debugMessage = debugMessage;
        this.subResponseCode = j4;
    }

    public static /* synthetic */ PlatformBillingResult copy$default(PlatformBillingResult platformBillingResult, PlatformBillingResponse platformBillingResponse, String str, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformBillingResponse = platformBillingResult.responseCode;
        }
        if ((i4 & 2) != 0) {
            str = platformBillingResult.debugMessage;
        }
        if ((i4 & 4) != 0) {
            j4 = platformBillingResult.subResponseCode;
        }
        return platformBillingResult.copy(platformBillingResponse, str, j4);
    }

    public final PlatformBillingResponse component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.debugMessage;
    }

    public final long component3() {
        return this.subResponseCode;
    }

    public final PlatformBillingResult copy(PlatformBillingResponse responseCode, String debugMessage, long j4) {
        i.e(responseCode, "responseCode");
        i.e(debugMessage, "debugMessage");
        return new PlatformBillingResult(responseCode, debugMessage, j4);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformBillingResult.class)) {
            if (this == obj) {
                return true;
            }
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.responseCode, platformBillingResult.responseCode) && messagesPigeonUtils.deepEquals(this.debugMessage, platformBillingResult.debugMessage) && messagesPigeonUtils.deepEquals(Long.valueOf(this.subResponseCode), Long.valueOf(platformBillingResult.subResponseCode))) {
                return true;
            }
        }
        return false;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final PlatformBillingResponse getResponseCode() {
        return this.responseCode;
    }

    public final long getSubResponseCode() {
        return this.subResponseCode;
    }

    public int hashCode() {
        int hashCode = PlatformBillingResult.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((hashCode + messagesPigeonUtils.deepHash(this.responseCode)) * 31) + messagesPigeonUtils.deepHash(this.debugMessage)) * 31) + messagesPigeonUtils.deepHash(Long.valueOf(this.subResponseCode));
    }

    public final List<Object> toList() {
        return j.W(this.responseCode, this.debugMessage, Long.valueOf(this.subResponseCode));
    }

    public String toString() {
        PlatformBillingResponse platformBillingResponse = this.responseCode;
        String str = this.debugMessage;
        long j4 = this.subResponseCode;
        StringBuilder sb = new StringBuilder("PlatformBillingResult(responseCode=");
        sb.append(platformBillingResponse);
        sb.append(", debugMessage=");
        sb.append(str);
        sb.append(", subResponseCode=");
        return AbstractC0005f.p(sb, j4, ")");
    }
}
