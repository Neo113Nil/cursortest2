package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class gv extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private mv f26298e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f26299f;

    /* renamed from: g, reason: collision with root package name */
    private int f26300g;

    /* renamed from: h, reason: collision with root package name */
    private int f26301h;

    public gv() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        b(mvVar);
        this.f26298e = mvVar;
        Uri uri = mvVar.f29239a;
        String scheme = uri.getScheme();
        C2253tf.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i4 = u82.f32873a;
        String[] split = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (split.length != 2) {
            throw wf1.a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f26299f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                throw wf1.a("Error while parsing Base64 encoded string: " + str, e4);
            }
        } else {
            this.f26299f = u82.c(URLDecoder.decode(str, un.f33181a.name()));
        }
        long j4 = mvVar.f29244f;
        byte[] bArr = this.f26299f;
        if (j4 > bArr.length) {
            this.f26299f = null;
            throw new jv(2008);
        }
        int i5 = (int) j4;
        this.f26300g = i5;
        int length = bArr.length - i5;
        this.f26301h = length;
        long j5 = mvVar.f29245g;
        if (j5 != -1) {
            this.f26301h = (int) Math.min(length, j5);
        }
        c(mvVar);
        long j6 = mvVar.f29245g;
        return j6 != -1 ? j6 : this.f26301h;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        if (this.f26299f != null) {
            this.f26299f = null;
            e();
        }
        this.f26298e = null;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        mv mvVar = this.f26298e;
        if (mvVar != null) {
            return mvVar.f29239a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f26301h;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i5, i6);
        byte[] bArr2 = this.f26299f;
        int i7 = u82.f32873a;
        System.arraycopy(bArr2, this.f26300g, bArr, i4, min);
        this.f26300g += min;
        this.f26301h -= min;
        c(min);
        return min;
    }
}
