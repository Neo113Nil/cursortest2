package com.onesignal.core.internal.http.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {
    private final String cacheKey;
    private final String jwt;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public e() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ e copy$default(e eVar, String str, String str2, Integer num, Long l7, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eVar.cacheKey;
        }
        if ((i2 & 2) != 0) {
            str2 = eVar.rywToken;
        }
        if ((i2 & 4) != 0) {
            num = eVar.retryCount;
        }
        if ((i2 & 8) != 0) {
            l7 = eVar.sessionDuration;
        }
        if ((i2 & 16) != 0) {
            str3 = eVar.jwt;
        }
        String str4 = str3;
        Integer num2 = num;
        return eVar.copy(str, str2, num2, l7, str4);
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

    public final e copy(String str, String str2, Integer num, Long l7, String str3) {
        return new e(str, str2, num, l7, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.cacheKey, eVar.cacheKey) && Intrinsics.a(this.rywToken, eVar.rywToken) && Intrinsics.a(this.retryCount, eVar.retryCount) && Intrinsics.a(this.sessionDuration, eVar.sessionDuration) && Intrinsics.a(this.jwt, eVar.jwt);
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
        Long l7 = this.sessionDuration;
        int hashCode4 = (hashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str3 = this.jwt;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ", jwt=" + this.jwt + ')';
    }

    public e(String str, String str2, Integer num, Long l7, String str3) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l7;
        this.jwt = str3;
    }

    public /* synthetic */ e(String str, String str2, Integer num, Long l7, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : l7, (i2 & 16) != 0 ? null : str3);
    }
}
