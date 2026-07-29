package com.cmplay.base.util.webview.encode;

/* loaded from: classes.dex */
public class OpensnsException extends Exception {
    private static final long serialVersionUID = 8243127099991355146L;
    private int code;

    public OpensnsException(int i, String str) {
        super(str);
        this.code = i;
    }

    public OpensnsException(int i, Exception exc) {
        super(exc);
        this.code = i;
    }

    public int getErrorCode() {
        return this.code;
    }
}
