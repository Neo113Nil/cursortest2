package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface t70 {
    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Fe
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                return t70.d();
            }
        };
    }

    static /* synthetic */ p70[] d() {
        return new p70[0];
    }

    p70[] a();

    default p70[] a(Uri uri, Map<String, List<String>> map) {
        return a();
    }
}
