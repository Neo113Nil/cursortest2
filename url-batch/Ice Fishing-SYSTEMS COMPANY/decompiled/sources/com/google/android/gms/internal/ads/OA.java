package com.google.android.gms.internal.ads;

import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class OA extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public x7.h f26658n;

    /* renamed from: u, reason: collision with root package name */
    public int f26659u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f26660v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Mu f26661w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x7.h f26662x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OA(Mu mu, E7.p pVar, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f26661w = mu;
        this.f26662x = (x7.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E7.p, x7.h] */
    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        OA oa = new OA(this.f26661w, this.f26662x, interfaceC5133d);
        oa.f26660v = obj;
        return oa;
    }

    @Override // E7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OA) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        W7.a aVar;
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f26659u;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            AbstractC0399y.g(((InterfaceC0397w) this.f26660v).z());
            W7.d dVar = (W7.d) this.f26661w.f26395u;
            this.f26660v = dVar;
            this.f26658n = this.f26662x;
            this.f26659u = 1;
            if (w8.a.m(NA.f26490v, dVar, this) != enumC5179a) {
                w8.a.f(this).resumeWith(q7.v.f40183a);
            }
            return enumC5179a;
        }
        if (i != 1) {
            aVar = (W7.a) this.f26660v;
            try {
                com.bumptech.glide.f.r(obj);
            } catch (Throwable th) {
                th = th;
                ((W7.d) aVar).d(null);
                throw th;
            }
        } else {
            E7.p pVar = (E7.p) this.f26658n;
            W7.a aVar2 = (W7.a) this.f26660v;
            com.bumptech.glide.f.r(obj);
            try {
                this.f26660v = aVar2;
                this.f26658n = null;
                this.f26659u = 2;
                obj = AbstractC0399y.e(pVar, this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
                aVar = aVar2;
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                ((W7.d) aVar).d(null);
                throw th;
            }
        }
        ((W7.d) aVar).d(null);
        return obj;
    }
}
