package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f94 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private li1 f5053e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f5054f;

    /* renamed from: g, reason: collision with root package name */
    private int f5055g;

    /* renamed from: h, reason: collision with root package name */
    private int f5056h;

    public f94() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f5056h;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        System.arraycopy(n13.c(this.f5054f), this.f5055g, bArr, i7, min);
        this.f5055g += min;
        this.f5056h -= min;
        o(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        li1 li1Var = this.f5053e;
        if (li1Var != null) {
            return li1Var.f7985a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        if (this.f5054f != null) {
            this.f5054f = null;
            p();
        }
        this.f5053e = null;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        q(li1Var);
        this.f5053e = li1Var;
        Uri uri = li1Var.f7985a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        wu1.e(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] D = n13.D(uri.getSchemeSpecificPart(), ",");
        if (D.length != 2) {
            throw dz.b("Unexpected URI format: ".concat(String.valueOf(uri)), null);
        }
        String str = D[1];
        if (D[0].contains(";base64")) {
            try {
                this.f5054f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                String valueOf2 = String.valueOf(str);
                throw dz.b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e7);
            }
        } else {
            this.f5054f = n13.w(URLDecoder.decode(str, c43.f3727a.name()));
        }
        long j7 = li1Var.f7990f;
        int length = this.f5054f.length;
        if (j7 > length) {
            this.f5054f = null;
            throw new if1(2008);
        }
        int i7 = (int) j7;
        this.f5055g = i7;
        int i8 = length - i7;
        this.f5056h = i8;
        long j8 = li1Var.f7991g;
        if (j8 != -1) {
            this.f5056h = (int) Math.min(i8, j8);
        }
        r(li1Var);
        long j9 = li1Var.f7991g;
        return j9 != -1 ? j9 : this.f5056h;
    }
}
