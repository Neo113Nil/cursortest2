package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2191mt implements InterfaceC0946Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    public final /* synthetic */ int AIp(InterfaceC05792c interfaceC05792c, int i, boolean z8) {
        return AbstractC0943Ha.A00(this, interfaceC05792c, i, z8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    public final /* synthetic */ void AIr(C06464v c06464v, int i) {
        AbstractC0943Ha.A01(this, c06464v, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    public final void A6e(C2399qI c2399qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    public final int AIq(InterfaceC05792c interfaceC05792c, int i, boolean z8, int i4) throws IOException {
        int bytesSkipped = interfaceC05792c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    public final void AIs(C06464v c06464v, int i, int i4) {
        c06464v.A0g(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    public final void AIu(long j9, int i, int i4, int i9, C0944Hb c0944Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0946Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
