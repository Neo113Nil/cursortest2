package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class VastTracker implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean mCalled;
    private final String mContent;
    private boolean mIsRepeatable;
    private final MessageType mMessageType;

    enum MessageType {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public VastTracker(MessageType messageType, String str) {
        Preconditions.checkNotNull(messageType);
        Preconditions.checkNotNull(str);
        this.mMessageType = messageType;
        this.mContent = str;
    }

    public VastTracker(String str) {
        this(MessageType.TRACKING_URL, str);
    }

    public VastTracker(String str, boolean z) {
        this(str);
        this.mIsRepeatable = z;
    }

    public MessageType getMessageType() {
        return this.mMessageType;
    }

    public String getContent() {
        return this.mContent;
    }

    public void setTracked() {
        this.mCalled = true;
    }

    public boolean isTracked() {
        return this.mCalled;
    }

    public boolean isRepeatable() {
        return this.mIsRepeatable;
    }
}
