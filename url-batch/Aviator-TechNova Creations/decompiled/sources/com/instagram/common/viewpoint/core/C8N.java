package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public interface C8N {
    void A51(C1836or c1836or, int i, int[] iArr) throws C8G;

    void A5r();

    void A6E();

    void A6L();

    long A7X(boolean z);

    C1820ob A8e();

    boolean A9W(ByteBuffer byteBuffer, long j, int i) throws C8H, C8M;

    void A9Z();

    boolean A9g();

    boolean AAG();

    void AGG();

    void AGI() throws C8M;

    void AIW(C1842oy c1842oy);

    void AIX(int i);

    void AIY(C1P c1p);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIg(boolean z);

    void AIl(C8J c8j);

    void AIt(C1820ob c1820ob);

    void AIw(C02387m c02387m);

    void AIy(AudioDeviceInfo audioDeviceInfo);

    void AJ4(boolean z);

    boolean AJc(C1836or c1836or);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJe(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
