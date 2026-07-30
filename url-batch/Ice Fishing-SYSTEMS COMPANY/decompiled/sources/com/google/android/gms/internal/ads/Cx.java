package com.google.android.gms.internal.ads;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Cx extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public Object f24275n;

    /* renamed from: u, reason: collision with root package name */
    public W7.d f24276u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24277v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Qx f24278w;

    /* renamed from: x, reason: collision with root package name */
    public int f24279x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cx(Qx qx, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f24278w = qx;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f24277v = obj;
        this.f24279x |= Integer.MIN_VALUE;
        return this.f24278w.c(this);
    }
}
