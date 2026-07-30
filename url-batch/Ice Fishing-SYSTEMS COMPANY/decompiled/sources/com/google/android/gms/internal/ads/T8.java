package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p2.AbstractC4857b;

/* loaded from: classes2.dex */
public final class T8 extends AbstractC4857b {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f27720W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T8(Context context, Looper looper, int i, InterfaceC0365b interfaceC0365b, InterfaceC0366c interfaceC0366c) {
        super(context, looper, i, interfaceC0365b, interfaceC0366c);
        this.f27720W = 1;
    }

    public boolean A() {
        L2.d[] l9 = l();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue()) {
            L2.d dVar = k2.x.f38743c;
            int length = l9 != null ? l9.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!O2.w.l(l9[i], dVar)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // O2.AbstractC0369f, M2.c
    public int k() {
        switch (this.f27720W) {
            case 2:
                return ModuleDescriptor.MODULE_VERSION;
            default:
                return super.k();
        }
    }

    @Override // O2.AbstractC0369f
    public final IInterface p(IBinder iBinder) {
        switch (this.f27720W) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return queryLocalInterface instanceof V8 ? (V8) queryLocalInterface : new V8(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 2);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return queryLocalInterface2 instanceof C3800qc ? (C3800qc) queryLocalInterface2 : new C3800qc(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 2);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return queryLocalInterface3 instanceof InterfaceC2568Ge ? (InterfaceC2568Ge) queryLocalInterface3 : new C2551Fe(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 2);
        }
    }

    @Override // O2.AbstractC0369f
    public L2.d[] r() {
        switch (this.f27720W) {
            case 0:
                return k2.x.f38744d;
            default:
                return super.r();
        }
    }

    @Override // O2.AbstractC0369f
    public final String v() {
        switch (this.f27720W) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // O2.AbstractC0369f
    public final String w() {
        switch (this.f27720W) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T8(Context context, Looper looper, InterfaceC0365b interfaceC0365b, InterfaceC0366c interfaceC0366c, int i) {
        super(r15 == null ? context : r15, looper, 123, interfaceC0365b, interfaceC0366c);
        this.f27720W = i;
        switch (i) {
            case 2:
                int i4 = AbstractC2789Te.f27792a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, interfaceC0365b, interfaceC0366c);
                break;
            default:
                int i9 = AbstractC2789Te.f27792a;
                Context applicationContext2 = context.getApplicationContext();
                break;
        }
    }
}
