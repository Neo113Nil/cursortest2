package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Lx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public W7.a f26271n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f26272u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Qx f26273v;

    /* renamed from: w, reason: collision with root package name */
    public int f26274w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f26273v = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f26272u = obj;
        this.f26274w |= Integer.MIN_VALUE;
        return Qx.d(this.f26273v, this);
    }
}
