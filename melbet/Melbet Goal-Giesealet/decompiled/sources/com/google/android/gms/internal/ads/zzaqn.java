package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaqn extends ThreadLocal {
    zzaqn(zzaqo zzaqoVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
