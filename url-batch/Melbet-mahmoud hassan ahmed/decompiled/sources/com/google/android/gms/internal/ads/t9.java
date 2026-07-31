package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class t9 implements Runnable {
    /* synthetic */ t9(s9 s9Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            u9.f12699b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            u9.f12702e.countDown();
            throw th;
        }
        u9.f12702e.countDown();
    }
}
