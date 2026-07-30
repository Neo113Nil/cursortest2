package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Px extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public W7.d f27080n;

    /* renamed from: u, reason: collision with root package name */
    public long f27081u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27082v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f27083w;

    /* renamed from: x, reason: collision with root package name */
    public int f27084x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Px(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f27083w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f27082v = obj;
        this.f27084x |= Integer.MIN_VALUE;
        return Qx.g(this.f27083w, this);
    }
}
