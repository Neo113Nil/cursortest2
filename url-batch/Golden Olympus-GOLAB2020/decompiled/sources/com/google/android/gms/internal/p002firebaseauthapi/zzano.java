package com.google.android.gms.internal.p002firebaseauthapi;

import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
final class zzano extends ThreadLocal<SimpleDateFormat> {
    zzano() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SimpleDateFormat initialValue() {
        return zzanp.zza();
    }
}
