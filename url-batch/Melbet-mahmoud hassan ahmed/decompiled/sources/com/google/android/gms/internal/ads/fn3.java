package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class fn3 implements kn3<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.kn3
    public final /* bridge */ /* synthetic */ KeyFactory a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
