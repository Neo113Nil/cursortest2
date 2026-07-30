package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1779fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z8, int i);

    void AK1(int i);

    void AK6(EnumC1726et enumC1726et, int i);

    void AKF(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1726et getStartReason();

    EnumC1781fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z8);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z8);

    void setRequestedVolume(float f6);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1782fn interfaceC1782fn);

    void setup(Uri uri);
}
