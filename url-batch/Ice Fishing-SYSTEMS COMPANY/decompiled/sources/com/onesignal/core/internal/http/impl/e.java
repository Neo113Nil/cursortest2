package com.onesignal.core.internal.http.impl;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class e {
    private final String cacheKey;
    private final String jwt;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public e() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ e copy$default(e eVar, String str, String str2, Integer num, Long l9, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.cacheKey;
        }
        if ((i & 2) != 0) {
            str2 = eVar.rywToken;
        }
        if ((i & 4) != 0) {
            num = eVar.retryCount;
        }
        if ((i & 8) != 0) {
            l9 = eVar.sessionDuration;
        }
        if ((i & 16) != 0) {
            str3 = eVar.jwt;
        }
        String str4 = str3;
        Integer num2 = num;
        return eVar.copy(str, str2, num2, l9, str4);
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

    public final e copy(String str, String str2, Integer num, Long l9, String str3) {
        return new e(str, str2, num, l9, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.cacheKey, eVar.cacheKey) && h.a(this.rywToken, eVar.rywToken) && h.a(this.retryCount, eVar.retryCount) && h.a(this.sessionDuration, eVar.sessionDuration) && h.a(this.jwt, eVar.jwt);
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
        Long l9 = this.sessionDuration;
        int hashCode4 = (hashCode3 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str3 = this.jwt;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ", jwt=" + this.jwt + ')';
    }

    public e(String str, String str2, Integer num, Long l9, String str3) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l9;
        this.jwt = str3;
    }

    public /* synthetic */ e(String str, String str2, Integer num, Long l9, String str3, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l9, (i & 16) != 0 ? null : str3);
    }
}
