package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class xg0 extends jv {

    /* renamed from: d, reason: collision with root package name */
    public final int f34557d;

    public xg0(int i4) {
        super(a(i4, 1));
        this.f34557d = 1;
    }

    private static int a(int i4, int i5) {
        return (i4 == 2000 && i5 == 1) ? IronSourceConstants.IS_LOAD_CALLED : i4;
    }

    public static xg0 a(IOException iOException, int i4) {
        String message = iOException.getMessage();
        int i5 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C2207rf.b(message).matches("cleartext.*not permitted.*")) ? IronSourceConstants.IS_LOAD_CALLED : 2007;
        return i5 == 2007 ? new wg0(iOException) : new xg0(iOException, i5, i4);
    }

    public xg0(IOException iOException, int i4, int i5) {
        super(iOException, a(i4, i5));
        this.f34557d = i5;
    }

    public xg0(String str, int i4) {
        super(a(i4, 1), str);
        this.f34557d = 1;
    }

    public xg0(String str, IOException iOException, int i4) {
        super(a(i4, 1), str, iOException);
        this.f34557d = 1;
    }
}
