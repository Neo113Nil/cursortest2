package com.baidu.ar.ihttp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class HttpException extends Exception {
    public static final int HTTP_ERROR = 4;
    public static final int INVOKE_ERROR = 3;
    public static final int LIB_ERROR = 2;
    public static final int NET_ERROR = 1;
    public static final int UNKNOWN_ERROR = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f2500a;

    public HttpException(int i8, Exception exc) {
        super(exc);
        this.f2500a = i8;
    }

    public final void a(IOException iOException) {
        this.f2500a = ((iOException instanceof ConnectException) || (iOException instanceof SocketTimeoutException) || (iOException instanceof NoRouteToHostException) || (iOException instanceof UnknownHostException)) ? 1 : iOException instanceof IOException ? -1 : 2;
    }

    public int getCode() {
        return this.f2500a;
    }

    public HttpException(int i8, String str) {
        super(str);
        this.f2500a = i8;
    }

    public HttpException(IOException iOException) {
        super(iOException);
        a(iOException);
    }
}
