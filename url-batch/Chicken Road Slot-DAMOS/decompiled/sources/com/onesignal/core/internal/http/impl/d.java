package com.onesignal.core.internal.http.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    private final String cacheKey;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public /* synthetic */ d(String str, String str2, Integer num, Long l10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : l10);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, Integer num, Long l10, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dVar.cacheKey;
        }
        if ((i3 & 2) != 0) {
            str2 = dVar.rywToken;
        }
        if ((i3 & 4) != 0) {
            num = dVar.retryCount;
        }
        if ((i3 & 8) != 0) {
            l10 = dVar.sessionDuration;
        }
        return dVar.copy(str, str2, num, l10);
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

    public final d copy(String str, String str2, Integer num, Long l10) {
        return new d(str, str2, num, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.cacheKey, dVar.cacheKey) && Intrinsics.a(this.rywToken, dVar.rywToken) && Intrinsics.a(this.retryCount, dVar.retryCount) && Intrinsics.a(this.sessionDuration, dVar.sessionDuration);
    }

    public final String getCacheKey() {
        return this.cacheKey;
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
        Long l10 = this.sessionDuration;
        return hashCode3 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ')';
    }

    public d(String str, String str2, Integer num, Long l10) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l10;
    }

    public d() {
        this(null, null, null, null, 15, null);
    }
}
