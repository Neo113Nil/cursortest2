package com.google.firebase.heartbeatinfo;

import defpackage.ch2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j) {
        if (str == null) {
            ch2.l("Null sdkName");
            throw null;
        }
        this.sdkName = str;
        this.millis = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            if (this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        int hashCode = (this.sdkName.hashCode() ^ 1000003) * 1000003;
        long j = this.millis;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.sdkName + ", millis=" + this.millis + "}";
    }
}
