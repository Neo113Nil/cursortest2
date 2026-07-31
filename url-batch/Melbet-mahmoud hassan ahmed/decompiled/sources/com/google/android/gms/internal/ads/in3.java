package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public final class in3 implements kn3<MessageDigest> {
    @Override // com.google.android.gms.internal.ads.kn3
    public final /* bridge */ /* synthetic */ MessageDigest a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
