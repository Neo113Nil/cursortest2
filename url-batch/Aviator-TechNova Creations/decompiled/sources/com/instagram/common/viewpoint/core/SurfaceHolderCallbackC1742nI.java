package com.instagram.common.viewpoint.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolderCallbackC1742nI implements InterfaceC0432Fo, C8D, InterfaceC0382Dq, B3, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ C9V A00;

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void ACT(C1836or c1836or, C01835j c01835j) {
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void ACU(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void ACV(Exception exc) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final /* synthetic */ void ACr(int i, long j) {
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void AFF(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final /* synthetic */ void AFl(C1836or c1836or, C01835j c01835j) {
    }

    public SurfaceHolderCallbackC1742nI(C9V c9v) {
        this.A00 = c9v;
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACP(String str, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (hasNext) {
                ((C8D) it.next()).ACP(str, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACQ(C01805g c01805g) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACQ(c01805g);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACR(C01805g c01805g) {
        this.A00.A09 = c01805g;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACR(c01805g);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACS(C1836or c1836or) {
        this.A00.A07 = c1836or;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACS(c1836or);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACY(int i, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACY(i, j, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0382Dq
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACv(C1785o0 c1785o0) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC01142s) it.next()).ACv(c1785o0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0382Dq
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACw(List<C1787o2> list) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC01142s) it.next()).ACw(list);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AD7(int i, long j) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0432Fo) it.next()).AD7(i, j);
        }
    }

    @Override // com.instagram.common.viewpoint.core.B3
    public final void AEE(Metadata metadata, long j) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((B3) it.next()).AEE(metadata, j);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AEx(Object obj, long j) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0432Fo) it2.next()).AEx(obj, j);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AFd(String str, long j, long j2) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0432Fo) it.next()).AFd(str, j, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AFe(C01805g c01805g) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0432Fo) it.next()).AFe(c01805g);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AFf(C01805g c01805g) {
        this.A00.A0A = c01805g;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (hasNext) {
                ((InterfaceC0432Fo) it.next()).AFf(c01805g);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AFk(C1836or c1836or) {
        this.A00.A08 = c1836or;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (hasNext) {
                ((InterfaceC0432Fo) it.next()).AFk(c1836or);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0432Fo
    public final void AFr(C1789o4 c1789o4) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC01574j) it.next()).AFq(c1789o4.A03, c1789o4.A01, c1789o4.A02, c1789o4.A00);
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            InterfaceC0432Fo interfaceC0432Fo = (InterfaceC0432Fo) it2.next();
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            interfaceC0432Fo.AFr(c1789o4);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
