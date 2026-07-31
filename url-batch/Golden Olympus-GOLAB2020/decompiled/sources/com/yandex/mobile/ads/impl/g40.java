package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p52;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class g40 implements p52 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25999a = new byte[Base64Utils.IO_BUFFER_SIZE];

    @Override // com.yandex.mobile.ads.impl.p52
    public final void a(long j4, int i4, int i5, int i6, p52.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final void b(int i4, sf1 sf1Var) {
        sf1Var.f(i4);
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final void a(yb0 yb0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final int a(fv fvVar, int i4, boolean z4) {
        int read = fvVar.read(this.f25999a, 0, Math.min(this.f25999a.length, i4));
        if (read != -1) {
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }
}
