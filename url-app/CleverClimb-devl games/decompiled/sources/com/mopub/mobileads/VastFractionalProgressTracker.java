package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.VastTracker;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public class VastFractionalProgressTracker extends VastTracker implements Serializable, Comparable<VastFractionalProgressTracker> {
    private static final long serialVersionUID = 0;
    private final float mFraction;

    public VastFractionalProgressTracker(VastTracker.MessageType messageType, String str, float f) {
        super(messageType, str);
        Preconditions.checkArgument(f >= 0.0f);
        this.mFraction = f;
    }

    public VastFractionalProgressTracker(String str, float f) {
        this(VastTracker.MessageType.TRACKING_URL, str, f);
    }

    public float trackingFraction() {
        return this.mFraction;
    }

    @Override // java.lang.Comparable
    public int compareTo(VastFractionalProgressTracker vastFractionalProgressTracker) {
        return Double.compare(trackingFraction(), vastFractionalProgressTracker.trackingFraction());
    }

    public String toString() {
        return String.format(Locale.US, "%2f: %s", Float.valueOf(this.mFraction), getContent());
    }
}
