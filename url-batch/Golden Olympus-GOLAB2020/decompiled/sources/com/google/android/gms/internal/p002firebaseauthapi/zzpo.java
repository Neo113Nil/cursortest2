package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class zzpo extends ThreadLocal<SecureRandom> {
    zzpo() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return zzpp.zza();
    }
}
