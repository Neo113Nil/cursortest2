package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h22 implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final iv f26533a;

    /* renamed from: b, reason: collision with root package name */
    private long f26534b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f26535c = Uri.EMPTY;

    public h22(iv ivVar) {
        this.f26533a = (iv) C2253tf.a(ivVar);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
        s62Var.getClass();
        this.f26533a.a(s62Var);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f26533a.close();
    }

    public final long e() {
        return this.f26534b;
    }

    public final Uri f() {
        return this.f26535c;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f26533a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f26533a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f26533a.read(bArr, i4, i5);
        if (read != -1) {
            this.f26534b += read;
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        this.f26535c = mvVar.f29239a;
        long a4 = this.f26533a.a(mvVar);
        Uri uri = this.f26533a.getUri();
        uri.getClass();
        this.f26535c = uri;
        this.f26533a.getResponseHeaders();
        return a4;
    }
}
