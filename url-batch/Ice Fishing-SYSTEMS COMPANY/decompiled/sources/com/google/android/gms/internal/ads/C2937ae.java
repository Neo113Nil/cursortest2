package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2937ae {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3637nb f29236a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f29237b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f29238c;

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:2|3)|(13:5|6|7|8|9|10|11|13|14|16|17|18|(3:20|21|22)(1:27))|39|6|7|8|9|10|11|13|14|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|2|3|(13:5|6|7|8|9|10|11|13|14|16|17|18|(3:20|21|22)(1:27))|39|6|7|8|9|10|11|13|14|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        u2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        u2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        u2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
    
        u2.i.d("", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2937ae(InterfaceC3637nb interfaceC3637nb) {
        Drawable drawable;
        V2.a d2;
        this.f29236a = interfaceC3637nb;
        Uri uri = null;
        try {
            d2 = interfaceC3637nb.d();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
        if (d2 != null) {
            drawable = (Drawable) V2.b.A0(d2);
            this.f29237b = drawable;
            uri = this.f29236a.i();
            this.f29238c = uri;
            this.f29236a.o();
            this.f29236a.c();
            this.f29236a.f();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31514O4)).booleanValue()) {
                return;
            }
            try {
                this.f29236a.e();
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        drawable = null;
        this.f29237b = drawable;
        uri = this.f29236a.i();
        this.f29238c = uri;
        this.f29236a.o();
        this.f29236a.c();
        this.f29236a.f();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31514O4)).booleanValue()) {
        }
    }
}
