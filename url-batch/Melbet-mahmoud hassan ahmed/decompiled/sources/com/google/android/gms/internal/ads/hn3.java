package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class hn3 implements kn3<Mac> {
    @Override // com.google.android.gms.internal.ads.kn3
    public final /* bridge */ /* synthetic */ Mac a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
