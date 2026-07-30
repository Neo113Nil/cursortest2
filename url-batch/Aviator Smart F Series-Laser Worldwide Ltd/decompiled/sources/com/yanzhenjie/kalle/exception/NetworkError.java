package com.yanzhenjie.kalle.exception;

/* loaded from: classes4.dex */
public class NetworkError extends ConnectException {
    public NetworkError(String str) {
        super(str);
    }

    public NetworkError(String str, Throwable th) {
        super(str, th);
    }
}
