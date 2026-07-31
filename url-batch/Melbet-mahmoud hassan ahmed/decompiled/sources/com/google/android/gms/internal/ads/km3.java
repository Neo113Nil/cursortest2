package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class km3 extends ThreadLocal<Cipher> {
    km3() {
    }

    protected static final Cipher a() {
        try {
            return cn3.f3891e.a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Cipher initialValue() {
        return a();
    }
}
