package com.yanzhenjie.kalle.exception;

/* loaded from: classes4.dex */
public class ParseError extends ReadException {
    public ParseError(String str) {
        super(str);
    }

    public ParseError(String str, Throwable th) {
        super(str, th);
    }
}
