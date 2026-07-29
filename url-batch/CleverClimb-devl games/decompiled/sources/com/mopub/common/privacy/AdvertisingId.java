package com.mopub.common.privacy;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes2.dex */
public class AdvertisingId implements Serializable {
    private static final String PREFIX_IFA = "ifa:";
    private static final String PREFIX_MOPUB = "mopub:";
    static final long ROTATION_TIME_MS = 86400000;
    final String mAdvertisingId;
    final boolean mDoNotTrack;
    final Calendar mLastRotation;
    final String mMopubId;

    AdvertisingId(String str, String str2, boolean z, long j) {
        Preconditions.NoThrow.checkNotNull(str);
        Preconditions.NoThrow.checkNotNull(str);
        this.mAdvertisingId = str;
        this.mMopubId = str2;
        this.mDoNotTrack = z;
        this.mLastRotation = Calendar.getInstance();
        this.mLastRotation.setTimeInMillis(j);
    }

    public String getIdentifier(boolean z) {
        return (this.mDoNotTrack || !z) ? this.mMopubId : this.mAdvertisingId;
    }

    public String getIdWithPrefix(boolean z) {
        if (this.mDoNotTrack || !z || this.mAdvertisingId.isEmpty()) {
            return PREFIX_MOPUB + this.mMopubId;
        }
        return PREFIX_IFA + this.mAdvertisingId;
    }

    String getIfaWithPrefix() {
        if (TextUtils.isEmpty(this.mAdvertisingId)) {
            return "";
        }
        return PREFIX_IFA + this.mAdvertisingId;
    }

    public boolean isDoNotTrack() {
        return this.mDoNotTrack;
    }

    static AdvertisingId generateExpiredAdvertisingId() {
        return new AdvertisingId("", generateIdString(), false, (Calendar.getInstance().getTimeInMillis() - 86400000) - 1);
    }

    static AdvertisingId generateFreshAdvertisingId() {
        return new AdvertisingId("", generateIdString(), false, Calendar.getInstance().getTimeInMillis());
    }

    static String generateIdString() {
        return UUID.randomUUID().toString();
    }

    boolean isRotationRequired() {
        return Calendar.getInstance().getTimeInMillis() - this.mLastRotation.getTimeInMillis() >= 86400000;
    }

    public String toString() {
        return "AdvertisingId{mLastRotation=" + this.mLastRotation + ", mAdvertisingId='" + this.mAdvertisingId + "', mMopubId='" + this.mMopubId + "', mDoNotTrack=" + this.mDoNotTrack + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisingId)) {
            return false;
        }
        AdvertisingId advertisingId = (AdvertisingId) obj;
        if (this.mDoNotTrack == advertisingId.mDoNotTrack && this.mAdvertisingId.equals(advertisingId.mAdvertisingId)) {
            return this.mMopubId.equals(advertisingId.mMopubId);
        }
        return false;
    }

    public int hashCode() {
        return (((this.mAdvertisingId.hashCode() * 31) + this.mMopubId.hashCode()) * 31) + (this.mDoNotTrack ? 1 : 0);
    }
}
