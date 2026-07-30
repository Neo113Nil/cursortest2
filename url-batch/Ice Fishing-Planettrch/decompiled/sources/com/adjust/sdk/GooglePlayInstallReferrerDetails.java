package com.adjust.sdk;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class GooglePlayInstallReferrerDetails {
    public Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public String installReferrer;
    public String installVersion;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public GooglePlayInstallReferrerDetails(ReferrerDetails referrerDetails) {
        if (referrerDetails == null) {
            return;
        }
        this.installReferrer = referrerDetails.installReferrer;
        this.referrerClickTimestampSeconds = referrerDetails.referrerClickTimestampSeconds;
        this.installBeginTimestampSeconds = referrerDetails.installBeginTimestampSeconds;
        this.referrerClickTimestampServerSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        this.installBeginTimestampServerSeconds = referrerDetails.installBeginTimestampServerSeconds;
        this.installVersion = referrerDetails.installVersion;
        this.googlePlayInstant = referrerDetails.googlePlayInstant;
    }

    public String toString() {
        return Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s", this.installReferrer, Long.valueOf(this.referrerClickTimestampSeconds), Long.valueOf(this.installBeginTimestampSeconds), Long.valueOf(this.referrerClickTimestampServerSeconds), Long.valueOf(this.installBeginTimestampServerSeconds), this.installVersion, this.googlePlayInstant);
    }
}
