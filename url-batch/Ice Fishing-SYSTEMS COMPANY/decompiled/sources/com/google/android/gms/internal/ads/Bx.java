package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Bx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public W7.d f24106n;

    /* renamed from: u, reason: collision with root package name */
    public long f24107u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24108v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f24109w;

    /* renamed from: x, reason: collision with root package name */
    public int f24110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f24109w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f24108v = obj;
        this.f24110x |= Integer.MIN_VALUE;
        return Qx.f(this.f24109w, this);
    }
}
