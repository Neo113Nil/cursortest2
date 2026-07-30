package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.eL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1220eL implements MediaController.MediaPlayerControl {
    public final /* synthetic */ CM A00;

    public C1220eL(CM cm) {
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
        C1214eF c1214eF;
        C1214eF c1214eF2;
        c1214eF = this.A00.A0C;
        if (c1214eF == null) {
            return 0;
        }
        c1214eF2 = this.A00.A0C;
        return c1214eF2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1214eF c1214eF;
        C1214eF c1214eF2;
        c1214eF = this.A00.A0C;
        if (c1214eF == null) {
            return 0;
        }
        c1214eF2 = this.A00.A0C;
        return c1214eF2.A05();
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
        C1214eF c1214eF;
        C1214eF c1214eF2;
        c1214eF = this.A00.A0C;
        if (c1214eF != null) {
            c1214eF2 = this.A00.A0C;
            if (c1214eF2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1230eV interfaceC1230eV;
        InterfaceC1230eV interfaceC1230eV2;
        interfaceC1230eV = this.A00.A0F;
        if (interfaceC1230eV != null) {
            interfaceC1230eV2 = this.A00.A0F;
            interfaceC1230eV2.AE9();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1230eV interfaceC1230eV;
        InterfaceC1230eV interfaceC1230eV2;
        interfaceC1230eV = this.A00.A0F;
        if (interfaceC1230eV != null) {
            interfaceC1230eV2 = this.A00.A0F;
            interfaceC1230eV2.AEA();
        }
    }
}
