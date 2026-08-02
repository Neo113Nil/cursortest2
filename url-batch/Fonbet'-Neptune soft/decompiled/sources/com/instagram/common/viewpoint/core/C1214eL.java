package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.eL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1214eL implements MediaController.MediaPlayerControl {
    public final /* synthetic */ CM A00;

    public C1214eL(CM cm) {
        this.A00 = cm;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C1208eF c1208eF;
        C1208eF c1208eF2;
        c1208eF = this.A00.A0C;
        if (c1208eF == null) {
            return 0;
        }
        c1208eF2 = this.A00.A0C;
        return c1208eF2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1208eF c1208eF;
        C1208eF c1208eF2;
        c1208eF = this.A00.A0C;
        if (c1208eF == null) {
            return 0;
        }
        c1208eF2 = this.A00.A0C;
        return c1208eF2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C1208eF c1208eF;
        C1208eF c1208eF2;
        c1208eF = this.A00.A0C;
        if (c1208eF != null) {
            c1208eF2 = this.A00.A0C;
            if (c1208eF2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1224eV interfaceC1224eV;
        InterfaceC1224eV interfaceC1224eV2;
        interfaceC1224eV = this.A00.A0F;
        if (interfaceC1224eV != null) {
            interfaceC1224eV2 = this.A00.A0F;
            interfaceC1224eV2.AE9();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1224eV interfaceC1224eV;
        InterfaceC1224eV interfaceC1224eV2;
        interfaceC1224eV = this.A00.A0F;
        if (interfaceC1224eV != null) {
            interfaceC1224eV2 = this.A00.A0F;
            interfaceC1224eV2.AEA();
        }
    }
}
