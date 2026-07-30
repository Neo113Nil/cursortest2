package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3571mG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3791qK f32676a = C3791qK.a(new byte[0]);

    public static final C3791qK a(int i) {
        return C3791qK.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final C3791qK b(int i) {
        return C3791qK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
