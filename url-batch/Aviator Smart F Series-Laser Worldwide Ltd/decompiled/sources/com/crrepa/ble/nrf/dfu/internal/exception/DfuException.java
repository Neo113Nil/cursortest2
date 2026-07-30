package com.crrepa.ble.nrf.dfu.internal.exception;

/* loaded from: classes3.dex */
public class DfuException extends Exception {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public DfuException(String str, int i8) {
        super(str);
        this.mError = i8;
    }

    public int getErrorNumber() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " (error " + (this.mError & (-16385)) + ")";
    }
}
