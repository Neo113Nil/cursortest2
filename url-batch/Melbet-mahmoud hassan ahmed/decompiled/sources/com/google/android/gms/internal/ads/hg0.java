package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import f3.c;

/* loaded from: classes.dex */
public final class hg0 extends c.b {

    /* renamed from: a, reason: collision with root package name */
    private final n40 f6237a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f6238b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f6239c;

    /* renamed from: d, reason: collision with root package name */
    private final double f6240d;

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|3)|(4:(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|16|17|18)|33|6|7|8|9|10|11|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0023, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0024, code lost:
    
        com.google.android.gms.internal.ads.io0.e("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hg0(n40 n40Var) {
        Drawable drawable;
        x3.a d7;
        this.f6237a = n40Var;
        Uri uri = null;
        try {
            d7 = n40Var.d();
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
        try {
            if (d7 != null) {
                drawable = (Drawable) x3.b.O0(d7);
                this.f6238b = drawable;
                uri = this.f6237a.b();
                this.f6239c = uri;
                double d8 = this.f6237a.a();
                this.f6240d = d8;
                this.f6237a.g();
                this.f6237a.c();
                return;
            }
            this.f6237a.c();
            return;
        } catch (RemoteException e8) {
            io0.e("", e8);
            return;
        }
        drawable = null;
        this.f6238b = drawable;
        uri = this.f6237a.b();
        this.f6239c = uri;
        double d82 = this.f6237a.a();
        this.f6240d = d82;
        this.f6237a.g();
    }
}
