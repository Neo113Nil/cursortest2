package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.pA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3727pA implements InterfaceC3673oA, By {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33335a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33336b;

    /* renamed from: c, reason: collision with root package name */
    public final C4158xA f33337c;

    /* renamed from: d, reason: collision with root package name */
    public final SD f33338d;

    /* renamed from: e, reason: collision with root package name */
    public final C3066cy f33339e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f33340f;

    /* renamed from: g, reason: collision with root package name */
    public J3.a f33341g;

    public C3727pA(Context context, C4158xA c4158xA, C3066cy c3066cy, SD sd) {
        this.f33335a = 0;
        this.f33340f = new AtomicBoolean(false);
        this.f33341g = C3686oN.c("E");
        this.f33336b = context;
        this.f33337c = c4158xA;
        this.f33339e = c3066cy;
        this.f33338d = sd;
    }

    @Override // com.google.android.gms.internal.ads.By
    public final J3.a a() {
        switch (this.f33335a) {
            case 0:
                if (this.f33340f.getAndSet(true)) {
                    return OD.f26665u;
                }
                return ((C3157eg) this.f33338d).b(new Vs(9, this));
            default:
                if (this.f33340f.getAndSet(true) || !this.f33339e.S()) {
                    return OD.f26665u;
                }
                return ((C3157eg) this.f33338d).a(new RunnableC3873rw(6, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void b(HashMap hashMap) {
        switch (this.f33335a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f33341g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void c(HashMap hashMap) {
        switch (this.f33335a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f33341g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void d(HashMap hashMap, Context context, View view) {
        switch (this.f33335a) {
            case 0:
                e(hashMap);
                break;
            default:
                hashMap.put("gs", this.f33341g);
                break;
        }
    }

    public void e(HashMap hashMap) {
        synchronized (this) {
            hashMap.put(com.anythink.expressad.f.a.b.da, this.f33341g);
        }
    }

    public C3727pA(Context context, C4158xA c4158xA, SD sd, C3066cy c3066cy) {
        this.f33335a = 1;
        this.f33340f = new AtomicBoolean(false);
        this.f33341g = OD.f26665u;
        this.f33336b = context;
        this.f33337c = c4158xA;
        this.f33338d = sd;
        this.f33339e = c3066cy;
    }
}
