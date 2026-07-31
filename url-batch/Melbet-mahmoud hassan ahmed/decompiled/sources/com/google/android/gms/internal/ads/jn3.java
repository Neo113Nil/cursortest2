package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class jn3 implements kn3<Signature> {
    @Override // com.google.android.gms.internal.ads.kn3
    public final /* bridge */ /* synthetic */ Signature a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
