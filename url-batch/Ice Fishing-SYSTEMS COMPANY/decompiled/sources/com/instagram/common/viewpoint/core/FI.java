package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.instagram.common.viewpoint.core.FL;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public interface FI<T extends FL> {
    void AEc(T t9, long j9, long j10, boolean z8);

    void AEe(T t9, long j9, long j10);

    FJ AEf(T t9, long j9, long j10, IOException iOException, int i);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AEi(T t9, long j9, long j10, int i);
}
