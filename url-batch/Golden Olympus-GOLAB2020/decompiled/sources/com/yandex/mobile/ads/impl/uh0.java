package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.yl1;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class uh0 implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final iv f33130a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33131b;

    /* renamed from: c, reason: collision with root package name */
    private final a f33132c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f33133d;

    /* renamed from: e, reason: collision with root package name */
    private int f33134e;

    public interface a {
    }

    public uh0(h22 h22Var, int i4, a aVar) {
        C2253tf.a(i4 > 0);
        this.f33130a = h22Var;
        this.f33131b = i4;
        this.f33132c = aVar;
        this.f33133d = new byte[1];
        this.f33134e = i4;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
        s62Var.getClass();
        this.f33130a.a(s62Var);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f33130a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f33130a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (this.f33134e == 0) {
            int i6 = 0;
            if (this.f33130a.read(this.f33133d, 0, 1) != -1) {
                int i7 = (this.f33133d[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i7 != 0) {
                    byte[] bArr2 = new byte[i7];
                    int i8 = i7;
                    while (i8 > 0) {
                        int read = this.f33130a.read(bArr2, i6, i8);
                        if (read != -1) {
                            i6 += read;
                            i8 -= read;
                        }
                    }
                    while (i7 > 0 && bArr2[i7 - 1] == 0) {
                        i7--;
                    }
                    if (i7 > 0) {
                        ((yl1.a) this.f33132c).a(new sf1(i7, bArr2));
                    }
                }
                this.f33134e = this.f33131b;
            }
            return -1;
        }
        int read2 = this.f33130a.read(bArr, i4, Math.min(this.f33134e, i5));
        if (read2 != -1) {
            this.f33134e -= read2;
        }
        return read2;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        throw new UnsupportedOperationException();
    }
}
