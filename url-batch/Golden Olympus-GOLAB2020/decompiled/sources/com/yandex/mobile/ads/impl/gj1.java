package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes3.dex */
public enum gj1 {
    f26175c(InstreamAdBreakType.PREROLL),
    f26176d(InstreamAdBreakType.MIDROLL),
    f26177e(InstreamAdBreakType.POSTROLL),
    f26178f("standalone");


    /* renamed from: b, reason: collision with root package name */
    private final String f26180b;

    gj1(String str) {
        this.f26180b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26180b;
    }
}
