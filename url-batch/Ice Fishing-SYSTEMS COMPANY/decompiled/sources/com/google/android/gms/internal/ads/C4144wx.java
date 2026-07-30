package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4144wx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public long f35096n;

    /* renamed from: u, reason: collision with root package name */
    public W7.d f35097u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f35098v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f35099w;

    /* renamed from: x, reason: collision with root package name */
    public int f35100x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4144wx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f35099w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f35098v = obj;
        this.f35100x |= Integer.MIN_VALUE;
        return this.f35099w.b(0L, this);
    }
}
