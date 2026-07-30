package com.google.android.exoplayer2.decoder;

@Deprecated
/* loaded from: classes3.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i8, String str) {
        super(str);
        this.errorCode = i8;
    }
}
