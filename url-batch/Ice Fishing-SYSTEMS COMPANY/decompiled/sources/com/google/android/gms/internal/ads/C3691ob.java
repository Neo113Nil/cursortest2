package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3691ob {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3637nb f33147a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f33148b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f33149c;

    /* renamed from: d, reason: collision with root package name */
    public final double f33150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33152f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        u2.i.d("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        u2.i.d("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        u2.i.d("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        u2.i.d("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3691ob(InterfaceC3637nb interfaceC3637nb) {
        Drawable drawable;
        V2.a d2;
        this.f33147a = interfaceC3637nb;
        Uri uri = null;
        try {
            d2 = interfaceC3637nb.d();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
        if (d2 != null) {
            drawable = (Drawable) V2.b.A0(d2);
            this.f33148b = drawable;
            uri = this.f33147a.i();
            this.f33149c = uri;
            double d3 = this.f33147a.o();
            this.f33150d = d3;
            int i = -1;
            int i4 = this.f33147a.c();
            this.f33151e = i4;
            i = this.f33147a.f();
            this.f33152f = i;
        }
        drawable = null;
        this.f33148b = drawable;
        uri = this.f33147a.i();
        this.f33149c = uri;
        double d32 = this.f33147a.o();
        this.f33150d = d32;
        int i9 = -1;
        int i42 = this.f33147a.c();
        this.f33151e = i42;
        i9 = this.f33147a.f();
        this.f33152f = i9;
    }
}
