package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.wz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4146wz implements Ny {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3901sN f35102a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3901sN f35103b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3901sN f35104c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35105d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35106e;

    public C4146wz(InterfaceC3901sN interfaceC3901sN, InterfaceC3901sN interfaceC3901sN2, InterfaceC3901sN interfaceC3901sN3, boolean z8, long j9) {
        this.f35102a = interfaceC3901sN;
        this.f35103b = interfaceC3901sN2;
        this.f35104c = interfaceC3901sN3;
        this.f35105d = z8;
        this.f35106e = j9;
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final String a() {
        return ((Lz) this.f35103b.d()).a();
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a b(Context context) {
        return ((Lz) this.f35103b.d()).b(context);
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final void c(MotionEvent motionEvent) {
        ((Lz) this.f35103b.d()).c(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a d() {
        HD hd = HD.f25326n;
        if (this.f35105d) {
            final int i = 1;
            C3945tD y6 = C3686oN.y(C3686oN.u(JD.s(((Ez) this.f35102a.d()).a()), Throwable.class, J2.f25710v, hd), new CD(this) { // from class: com.google.android.gms.internal.ads.vz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C4146wz f34909b;

                {
                    this.f34909b = this;
                }

                @Override // com.google.android.gms.internal.ads.CD
                public final /* synthetic */ J3.a b(Object obj) {
                    switch (i) {
                        case 0:
                            return ((Lz) this.f34909b.f35103b.d()).d();
                        case 1:
                            return ((InterfaceC2970bA) this.f34909b.f35104c.d()).a();
                        default:
                            return ((Lz) this.f34909b.f35103b.d()).d();
                    }
                }
            }, hd);
            final int i4 = 2;
            return C3686oN.y(y6, new CD(this) { // from class: com.google.android.gms.internal.ads.vz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C4146wz f34909b;

                {
                    this.f34909b = this;
                }

                @Override // com.google.android.gms.internal.ads.CD
                public final /* synthetic */ J3.a b(Object obj) {
                    switch (i4) {
                        case 0:
                            return ((Lz) this.f34909b.f35103b.d()).d();
                        case 1:
                            return ((InterfaceC2970bA) this.f34909b.f35104c.d()).a();
                        default:
                            return ((Lz) this.f34909b.f35103b.d()).d();
                    }
                }
            }, hd);
        }
        final int i9 = 0;
        C3945tD y8 = C3686oN.y(C3686oN.u(JD.s(((InterfaceC2970bA) this.f35104c.d()).a()), Throwable.class, J2.f25711w, hd), new CD(this) { // from class: com.google.android.gms.internal.ads.vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4146wz f34909b;

            {
                this.f34909b = this;
            }

            @Override // com.google.android.gms.internal.ads.CD
            public final /* synthetic */ J3.a b(Object obj) {
                switch (i9) {
                    case 0:
                        return ((Lz) this.f34909b.f35103b.d()).d();
                    case 1:
                        return ((InterfaceC2970bA) this.f34909b.f35104c.d()).a();
                    default:
                        return ((Lz) this.f34909b.f35103b.d()).d();
                }
            }
        }, hd);
        y8.c(new RunnableC3873rw(4, this), hd);
        return y8;
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final int e() {
        return ((Lz) this.f35103b.d()).e();
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a f(Context context, View view, Activity activity) {
        return ((Lz) this.f35103b.d()).f(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.Ny
    public final J3.a g(Context context, String str, View view) {
        return ((Lz) this.f35103b.d()).g(context, str, view);
    }
}
