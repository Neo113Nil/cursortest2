package com.yanzhenjie.kalle.exception;

/* loaded from: classes4.dex */
public class ReadTimeoutError extends ReadException {
    public ReadTimeoutError(String str) {
        super(str);
    }

    public ReadTimeoutError(String str, Throwable th) {
        super(str, th);
    }
}
