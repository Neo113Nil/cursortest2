package com.yanzhenjie.kalle.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ConnectException extends IOException {
    public ConnectException(String str) {
        super(str);
    }

    public ConnectException(String str, Throwable th) {
        super(str, th);
    }

    public ConnectException(Throwable th) {
        super(th);
    }
}
