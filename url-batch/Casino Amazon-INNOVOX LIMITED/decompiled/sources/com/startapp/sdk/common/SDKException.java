package com.startapp.sdk.common;

import android.net.Uri;
import java.io.IOException;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    public SDKException(String str, Uri uri, int i, boolean z, IOException iOException) {
        super(str + ' ' + uri + (i != 0 ? ", status " + i : "") + (z ? ", retry" : ""), iOException);
        this.method = str;
        this.uri = uri;
        this.statusCode = i;
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
