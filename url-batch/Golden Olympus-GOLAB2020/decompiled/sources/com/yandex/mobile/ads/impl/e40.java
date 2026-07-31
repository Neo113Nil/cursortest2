package com.yandex.mobile.ads.impl;

import android.media.MediaDrmException;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.u30;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e40 implements b60 {
    @Override // com.yandex.mobile.ads.impl.b60
    public final void a(b60.b bVar) {
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final int b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final byte[] c() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final su d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final b60.a a(byte[] bArr, List<u30.b> list, int i4, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void b(byte[] bArr) {
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final b60.d a() {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final boolean a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
