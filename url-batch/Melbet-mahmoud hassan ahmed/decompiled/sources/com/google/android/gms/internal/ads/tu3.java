package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class tu3 extends qu3 {

    /* renamed from: p, reason: collision with root package name */
    private int f12382p;

    protected tu3(String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.f10837h) {
            d();
        }
        return this.f12382p;
    }

    protected final long g(ByteBuffer byteBuffer) {
        this.f12382p = o7.c(byteBuffer.get());
        o7.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
