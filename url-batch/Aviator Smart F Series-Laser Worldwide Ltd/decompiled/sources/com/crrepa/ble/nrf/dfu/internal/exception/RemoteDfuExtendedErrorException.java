package com.crrepa.ble.nrf.dfu.internal.exception;

/* loaded from: classes3.dex */
public class RemoteDfuExtendedErrorException extends RemoteDfuException {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public RemoteDfuExtendedErrorException(String str, int i8) {
        super(str, 11);
        this.mError = i8;
    }

    public int getExtendedErrorNumber() {
        return this.mError;
    }

    @Override // com.crrepa.ble.nrf.dfu.internal.exception.RemoteDfuException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " (error 11." + this.mError + ")";
    }
}
