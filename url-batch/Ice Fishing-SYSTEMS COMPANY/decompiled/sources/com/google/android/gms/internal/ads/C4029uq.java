package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4029uq implements InterfaceC2779Sl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34666n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3598mq f34667u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ut f34668v;

    public C4029uq(C4083vq c4083vq, C3598mq c3598mq, Ut ut) {
        this.f34667u = c3598mq;
        this.f34668v = ut;
        Objects.requireNonNull(c4083vq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public final Ut d() {
        switch (this.f34666n) {
        }
        return this.f34668v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public final void h(boolean z8, Context context, C4293zk c4293zk) {
        C3334hu c3334hu;
        C3598mq c3598mq = this.f34667u;
        switch (this.f34666n) {
            case 0:
                try {
                    C3656nu c3656nu = (C3656nu) c3598mq.f32761b;
                    c3656nu.b(z8);
                    try {
                        c3656nu.f33064a.a1(new V2.b(context));
                        return;
                    } finally {
                    }
                } catch (C3334hu e6) {
                    throw new C2762Rl(e6.getCause());
                }
            case 1:
                try {
                    C3656nu c3656nu2 = (C3656nu) c3598mq.f32761b;
                    c3656nu2.b(z8);
                    try {
                        c3656nu2.f33064a.r1(new V2.b(context));
                        return;
                    } finally {
                    }
                } catch (C3334hu e9) {
                    throw new C2762Rl(e9.getCause());
                }
            default:
                try {
                    C3656nu c3656nu3 = (C3656nu) c3598mq.f32761b;
                    c3656nu3.b(z8);
                    try {
                        c3656nu3.f33064a.I();
                        return;
                    } finally {
                    }
                } catch (C3334hu e10) {
                    int i = t2.C.f40822b;
                    u2.i.g("Cannot show rewarded video.", e10);
                    throw new C2762Rl(e10.getCause());
                }
        }
    }

    public C4029uq(C3168er c3168er, C3598mq c3598mq, Ut ut) {
        this.f34667u = c3598mq;
        this.f34668v = ut;
        Objects.requireNonNull(c3168er);
    }

    public C4029uq(C3168er c3168er, C3598mq c3598mq, Ut ut, byte b9) {
        this.f34667u = c3598mq;
        this.f34668v = ut;
        Objects.requireNonNull(c3168er);
    }
}
