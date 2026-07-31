package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class t7 extends qu3 {

    /* renamed from: p, reason: collision with root package name */
    ByteBuffer f12128p;

    public t7(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.qu3
    public final void c(ByteBuffer byteBuffer) {
        this.f12128p = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
