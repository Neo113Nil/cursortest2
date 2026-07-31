package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class dn3 implements kn3<Cipher> {
    @Override // com.google.android.gms.internal.ads.kn3
    public final /* bridge */ /* synthetic */ Cipher a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
