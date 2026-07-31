package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.iv;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class eh1 implements iv {

    /* renamed from: a, reason: collision with root package name */
    public static final eh1 f25301a = new eh1();

    static {
        new iv.a() { // from class: com.yandex.mobile.ads.impl.S1
            @Override // com.yandex.mobile.ads.impl.iv.a
            public final iv a() {
                return eh1.e();
            }
        };
    }

    private eh1() {
    }

    public static /* synthetic */ eh1 e() {
        return new eh1();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }
}
