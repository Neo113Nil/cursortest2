package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.instagram.common.viewpoint.core.InterfaceC0401Ej;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Eg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0398Eg<T extends InterfaceC0401Ej> {
    void ADx(T t, long j, long j2, boolean z);

    void ADz(T t, long j, long j2);

    C0399Eh AE0(T t, long j, long j2, IOException iOException, int i);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AE3(T t, long j, long j2, int i);
}
