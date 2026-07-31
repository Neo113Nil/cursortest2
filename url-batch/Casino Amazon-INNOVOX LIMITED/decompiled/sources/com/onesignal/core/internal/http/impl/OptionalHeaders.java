package com.onesignal.core.internal.http.impl;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionalHeaders.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/onesignal/core/internal/http/impl/OptionalHeaders;", "", "cacheKey", "", "rywToken", "retryCount", "", "sessionDuration", "", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getCacheKey", "()Ljava/lang/String;", "getJwt", "getRetryCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRywToken", "getSessionDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/onesignal/core/internal/http/impl/OptionalHeaders;", "equals", "", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OptionalHeaders {
    private final String cacheKey;
    private final String jwt;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public OptionalHeaders() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OptionalHeaders copy$default(OptionalHeaders optionalHeaders, String str, String str2, Integer num, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionalHeaders.cacheKey;
        }
        if ((i & 2) != 0) {
            str2 = optionalHeaders.rywToken;
        }
        if ((i & 4) != 0) {
            num = optionalHeaders.retryCount;
        }
        if ((i & 8) != 0) {
            l = optionalHeaders.sessionDuration;
        }
        if ((i & 16) != 0) {
            str3 = optionalHeaders.jwt;
        }
        String str4 = str3;
        Integer num2 = num;
        return optionalHeaders.copy(str, str2, num2, l, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRywToken() {
        return this.rywToken;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    public final OptionalHeaders copy(String cacheKey, String rywToken, Integer retryCount, Long sessionDuration, String jwt) {
        return new OptionalHeaders(cacheKey, rywToken, retryCount, sessionDuration, jwt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionalHeaders)) {
            return false;
        }
        OptionalHeaders optionalHeaders = (OptionalHeaders) other;
        return Intrinsics.areEqual(this.cacheKey, optionalHeaders.cacheKey) && Intrinsics.areEqual(this.rywToken, optionalHeaders.rywToken) && Intrinsics.areEqual(this.retryCount, optionalHeaders.retryCount) && Intrinsics.areEqual(this.sessionDuration, optionalHeaders.sessionDuration) && Intrinsics.areEqual(this.jwt, optionalHeaders.jwt);
    }

    public int hashCode() {
        String str = this.cacheKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rywToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.sessionDuration;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.jwt;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ", jwt=" + this.jwt + ')';
    }

    public OptionalHeaders(String str, String str2, Integer num, Long l, String str3) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l;
        this.jwt = str3;
    }

    public /* synthetic */ OptionalHeaders(String str, String str2, Integer num, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getJwt() {
        return this.jwt;
    }
}
