package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class en3 implements kn3<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.kn3
    public final /* bridge */ /* synthetic */ KeyAgreement a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
