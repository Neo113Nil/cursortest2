package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class jq0 {

    /* renamed from: f, reason: collision with root package name */
    protected static final AtomicInteger f7215f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    protected static final AtomicInteger f7216g = new AtomicInteger(0);

    public static int T() {
        return f7215f.get();
    }

    public static int V() {
        return f7216g.get();
    }

    public abstract void B(Uri[] uriArr, String str);

    public abstract void C(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z6);

    public abstract void D();

    public abstract void E(long j7);

    public abstract void F(int i7);

    public abstract void G(int i7);

    public abstract void H(iq0 iq0Var);

    public abstract void I(int i7);

    public abstract void J(int i7);

    public abstract void K(boolean z6);

    public abstract void L(boolean z6);

    public abstract void M(int i7);

    public abstract void N(Surface surface, boolean z6);

    public abstract void O(float f7, boolean z6);

    public abstract void P();

    public abstract boolean Q();

    public abstract boolean R();

    public abstract int S();

    public abstract int U();

    public abstract long W();

    public abstract long X();

    public abstract long Y();

    public abstract long Z();

    public abstract long a0();

    public abstract long b0();

    public abstract long c0();
}
