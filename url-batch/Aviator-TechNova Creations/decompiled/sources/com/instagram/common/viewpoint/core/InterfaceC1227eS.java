package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1227eS {
    void A9V();

    boolean A9i();

    boolean A9j();

    boolean AAT();

    void AG7(boolean z, int i);

    void AJH(int i);

    void AJM(EnumC1175db enumC1175db, int i);

    void AJU(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1175db getStartReason();

    EnumC1229eU getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1230eV interfaceC1230eV);

    void setup(Uri uri);
}
