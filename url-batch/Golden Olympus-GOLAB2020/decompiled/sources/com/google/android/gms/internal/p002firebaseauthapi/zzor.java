package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzor {
    public static final zzzn zza = zzzn.zza(new byte[0]);

    public static final zzzn zza(int i4) {
        return zzzn.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i4).array());
    }

    public static final zzzn zzb(int i4) {
        return zzzn.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i4).array());
    }
}
