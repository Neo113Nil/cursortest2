package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class o40 extends u2.d {

    /* renamed from: a, reason: collision with root package name */
    private final n40 f9499a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f9500b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f9501c;

    /* renamed from: d, reason: collision with root package name */
    private final double f9502d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9503e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9504f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0023, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0024, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o40(n40 n40Var) {
        Drawable drawable;
        x3.a d7;
        this.f9499a = n40Var;
        Uri uri = null;
        try {
            d7 = n40Var.d();
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
        if (d7 != null) {
            drawable = (Drawable) x3.b.O0(d7);
            this.f9500b = drawable;
            uri = this.f9499a.b();
            this.f9501c = uri;
            double d8 = this.f9499a.a();
            this.f9502d = d8;
            int i7 = -1;
            int i8 = this.f9499a.g();
            this.f9503e = i8;
            i7 = this.f9499a.c();
            this.f9504f = i7;
        }
        drawable = null;
        this.f9500b = drawable;
        uri = this.f9499a.b();
        this.f9501c = uri;
        double d82 = this.f9499a.a();
        this.f9502d = d82;
        int i72 = -1;
        int i82 = this.f9499a.g();
        this.f9503e = i82;
        i72 = this.f9499a.c();
        this.f9504f = i72;
    }

    @Override // u2.d
    public final Drawable a() {
        return this.f9500b;
    }

    @Override // u2.d
    public final double b() {
        return this.f9502d;
    }

    @Override // u2.d
    public final Uri c() {
        return this.f9501c;
    }

    @Override // u2.d
    public final int d() {
        return this.f9504f;
    }

    @Override // u2.d
    public final int e() {
        return this.f9503e;
    }
}
