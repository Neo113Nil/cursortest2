package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class qo1 extends if1 {

    /* renamed from: g, reason: collision with root package name */
    public final li1 f10774g;

    public qo1(li1 li1Var, int i7, int i8) {
        super(b(2008, 1));
        this.f10774g = li1Var;
    }

    public qo1(IOException iOException, li1 li1Var, int i7, int i8) {
        super(iOException, b(i7, i8));
        this.f10774g = li1Var;
    }

    public qo1(String str, li1 li1Var, int i7, int i8) {
        super(str, b(2001, 1));
        this.f10774g = li1Var;
    }

    @Deprecated
    public qo1(String str, IOException iOException, li1 li1Var, int i7) {
        this(str, iOException, li1Var, 2000, 1);
    }

    public qo1(String str, IOException iOException, li1 li1Var, int i7, int i8) {
        super(str, iOException, b(i7, 1));
        this.f10774g = li1Var;
    }

    public static qo1 a(IOException iOException, li1 li1Var, int i7) {
        String message = iOException.getMessage();
        int i8 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i8 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i8 = 1004;
        } else if (message != null && w33.a(message).matches("cleartext.*not permitted.*")) {
            i8 = 2007;
        }
        return i8 == 2007 ? new pn1(iOException, li1Var) : new qo1(iOException, li1Var, i8, i7);
    }

    private static int b(int i7, int i8) {
        return i7 == 2000 ? i8 != 1 ? 2000 : 2001 : i7;
    }
}
