package com.yanzhenjie.kalle.exception;

/* loaded from: classes4.dex */
public class ConnectTimeoutError extends ConnectException {
    public ConnectTimeoutError(String str) {
        super(str);
    }

    public ConnectTimeoutError(String str, Throwable th) {
        super(str, th);
    }
}
