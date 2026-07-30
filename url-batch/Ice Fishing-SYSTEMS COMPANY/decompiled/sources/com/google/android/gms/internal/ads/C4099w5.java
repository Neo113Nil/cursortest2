package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4099w5 extends AbstractC3578mN {

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f34928B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4099w5(String str, int i) {
        super(str);
        this.f34928B = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3578mN
    public final void c(ByteBuffer byteBuffer) {
        switch (this.f34928B) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
