package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c42 implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final iv f24058a;

    /* renamed from: b, reason: collision with root package name */
    private final hv f24059b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24060c;

    /* renamed from: d, reason: collision with root package name */
    private long f24061d;

    public c42(iv ivVar, C1909em c1909em) {
        this.f24058a = (iv) C2253tf.a(ivVar);
        this.f24059b = (hv) C2253tf.a(c1909em);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
        s62Var.getClass();
        this.f24058a.a(s62Var);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        try {
            this.f24058a.close();
        } finally {
            if (this.f24060c) {
                this.f24060c = false;
                this.f24059b.close();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f24058a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f24058a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (this.f24061d == 0) {
            return -1;
        }
        int read = this.f24058a.read(bArr, i4, i5);
        if (read > 0) {
            this.f24059b.write(bArr, i4, read);
            long j4 = this.f24061d;
            if (j4 != -1) {
                this.f24061d = j4 - read;
            }
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        long a4 = this.f24058a.a(mvVar);
        this.f24061d = a4;
        if (a4 == 0) {
            return 0L;
        }
        if (mvVar.f29245g == -1 && a4 != -1) {
            mvVar = mvVar.a(a4);
        }
        this.f24060c = true;
        this.f24059b.a(mvVar);
        return this.f24061d;
    }
}
