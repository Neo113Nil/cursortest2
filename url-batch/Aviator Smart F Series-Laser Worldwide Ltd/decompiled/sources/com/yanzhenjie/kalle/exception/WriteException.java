package com.yanzhenjie.kalle.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public class WriteException extends IOException {
    public WriteException(String str) {
        super(str);
    }

    public WriteException(String str, Throwable th) {
        super(str, th);
    }

    public WriteException(Throwable th) {
        super(th);
    }
}
