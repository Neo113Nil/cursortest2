package com.startapp.sdk.common;

import E1.AbstractC0033i;
import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SDKException(String str, Uri uri, int i3, boolean z, IOException iOException) {
        super(r0.toString(), iOException);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(uri);
        sb.append(i3 != 0 ? AbstractC0033i.h(i3, ", status ") : "");
        sb.append(z ? ", retry" : "");
        this.method = str;
        this.uri = uri;
        this.statusCode = i3;
        this.retry = z;
    }

    public final int a() {
        return this.statusCode;
    }

    public SDKException() {
    }

    public SDKException(String str) {
        super(str);
    }

    public SDKException(String str, Exception exc) {
        super(str, exc);
    }
}
