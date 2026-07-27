package com.onesignal.core.internal.http.impl;

import B0.o;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OptionalHeaders {
    private final String cacheKey;
    private final String jwt;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public OptionalHeaders() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OptionalHeaders copy$default(OptionalHeaders optionalHeaders, String str, String str2, Integer num, Long l2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = optionalHeaders.cacheKey;
        }
        if ((i2 & 2) != 0) {
            str2 = optionalHeaders.rywToken;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            num = optionalHeaders.retryCount;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            l2 = optionalHeaders.sessionDuration;
        }
        Long l6 = l2;
        if ((i2 & 16) != 0) {
            str3 = optionalHeaders.jwt;
        }
        return optionalHeaders.copy(str, str4, num2, l6, str3);
    }

    public final String component1() {
        return this.cacheKey;
    }

    public final String component2() {
        return this.rywToken;
    }

    public final Integer component3() {
        return this.retryCount;
    }

    public final Long component4() {
        return this.sessionDuration;
    }

    public final String component5() {
        return this.jwt;
    }

    public final OptionalHeaders copy(String str, String str2, Integer num, Long l2, String str3) {
        return new OptionalHeaders(str, str2, num, l2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalHeaders)) {
            return false;
        }
        OptionalHeaders optionalHeaders = (OptionalHeaders) obj;
        return i.a(this.cacheKey, optionalHeaders.cacheKey) && i.a(this.rywToken, optionalHeaders.rywToken) && i.a(this.retryCount, optionalHeaders.retryCount) && i.a(this.sessionDuration, optionalHeaders.sessionDuration) && i.a(this.jwt, optionalHeaders.jwt);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final String getJwt() {
        return this.jwt;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public int hashCode() {
        String str = this.cacheKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rywToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.sessionDuration;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.jwt;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OptionalHeaders(cacheKey=");
        sb.append(this.cacheKey);
        sb.append(", rywToken=");
        sb.append(this.rywToken);
        sb.append(", retryCount=");
        sb.append(this.retryCount);
        sb.append(", sessionDuration=");
        sb.append(this.sessionDuration);
        sb.append(", jwt=");
        return o.l(sb, this.jwt, ')');
    }

    public OptionalHeaders(String str, String str2, Integer num, Long l2, String str3) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l2;
        this.jwt = str3;
    }

    public /* synthetic */ OptionalHeaders(String str, String str2, Integer num, Long l2, String str3, int i2, e eVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : str3);
    }
}
