package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ig1 implements xs0<Pauseroll> {
    @Override // com.yandex.mobile.ads.impl.xs0
    public final en0 a(ys0 playbackController) {
        Intrinsics.checkNotNullParameter(playbackController, "playbackController");
        return new en0(playbackController);
    }
}
