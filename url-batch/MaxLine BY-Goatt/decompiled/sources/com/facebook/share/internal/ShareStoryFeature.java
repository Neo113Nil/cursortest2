package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.facebook.internal.NativeProtocol;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum ShareStoryFeature implements DialogFeature {
    SHARE_STORY_ASSET(NativeProtocol.PROTOCOL_VERSION_20170417);

    private final int minVersion;

    ShareStoryFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.DialogFeature
    public String getAction() {
        return NativeProtocol.ACTION_SHARE_STORY;
    }

    @Override // com.facebook.internal.DialogFeature
    public int getMinVersion() {
        return this.minVersion;
    }
}
