package com.startapp.sdk.common.advertisingid;

/* loaded from: classes.dex */
class AdvertisingIdResolver$InternalException extends Exception {
    private static final long serialVersionUID = -3951983339713608735L;
    final int infoEventFlags;

    public AdvertisingIdResolver$InternalException(int i4) {
        super(String.valueOf(i4));
        this.infoEventFlags = i4;
    }
}
