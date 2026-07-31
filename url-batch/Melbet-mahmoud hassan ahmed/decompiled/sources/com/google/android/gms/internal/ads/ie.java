package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ie extends Exception {
    private ie(int i7, String str, Throwable th, int i8) {
        super(null, th);
    }

    public static ie a(Exception exc, int i7) {
        return new ie(1, null, exc, i7);
    }

    public static ie b(IOException iOException) {
        return new ie(0, null, iOException, -1);
    }

    static ie c(RuntimeException runtimeException) {
        return new ie(2, null, runtimeException, -1);
    }
}
