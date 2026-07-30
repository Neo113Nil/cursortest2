package com.anythink.basead.exoplayer.d;

import android.media.MediaCrypto;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCrypto f7029a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7030b;

    private k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public final MediaCrypto a() {
        return this.f7029a;
    }

    public k(MediaCrypto mediaCrypto, boolean z8) {
        this.f7029a = (MediaCrypto) C0544a.a(mediaCrypto);
        this.f7030b = z8;
    }

    @Override // com.anythink.basead.exoplayer.d.i
    public final boolean a(String str) {
        return !this.f7030b && this.f7029a.requiresSecureDecoderComponent(str);
    }
}
