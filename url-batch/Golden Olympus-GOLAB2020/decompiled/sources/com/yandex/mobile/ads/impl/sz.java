package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lr0;
import com.yandex.mobile.ads.impl.pr0;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class sz implements lr0 {
    public sz() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.lr0
    public final int a(int i4) {
        return i4 == 7 ? 6 : 3;
    }

    public sz(int i4) {
    }

    @Override // com.yandex.mobile.ads.impl.lr0
    public final long a(lr0.a aVar) {
        Throwable th = aVar.f28724a;
        if ((th instanceof wf1) || (th instanceof FileNotFoundException) || (th instanceof wg0) || (th instanceof pr0.g)) {
            return -9223372036854775807L;
        }
        int i4 = jv.f27827c;
        while (th != null) {
            if ((th instanceof jv) && ((jv) th).f27828b == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((aVar.f28725b - 1) * 1000, 5000);
    }
}
