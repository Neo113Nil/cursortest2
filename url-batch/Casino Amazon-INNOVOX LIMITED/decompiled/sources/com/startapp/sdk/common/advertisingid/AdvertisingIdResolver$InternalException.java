package com.startapp.sdk.common.advertisingid;

/* compiled from: Sta */
/* loaded from: classes3.dex */
class AdvertisingIdResolver$InternalException extends Exception {
    private static final long serialVersionUID = -3951983339713608735L;
    final int infoEventFlags;

    public AdvertisingIdResolver$InternalException(int i) {
        super(String.valueOf(i));
        this.infoEventFlags = i;
    }
}
