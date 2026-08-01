package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class XR implements IL, AR, FZ, DH, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"nMHZhEZSp5EcTMzj890UQSIKsf7nOssk", "WLzxKTE2vNTMCpqDs", "SfczCGFglH", "X5aT15p3N3rGxVL5g", "GbnJfxrb9aQYK7s9S1Y8QTSWgx7P8ZxV", "tLWa3XxeFvyx8wOT4", "wILb6N7ReXeeP8cmU", "dyBLf42uqj"};
    public final /* synthetic */ C0440Di A00;

    public XR(C0440Di c0440Di) {
        this.A00 = c0440Di;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAZ(String str, long j, long j2) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AR) it.next()).AAZ(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAa(C0393Au c0393Au) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            AR ar = (AR) it.next();
            String[] strArr = A01;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "5uZ3F86UAJ67QZD2oUJwcWpEFJTFqeup";
            ar.AAa(c0393Au);
        }
        this.A00.A06 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAb(C0393Au c0393Au) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A09 = c0393Au;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AR) it.next()).AAb(c0393Au);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAc(Format format) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A06 = format;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AR) it.next()).AAc(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAd(int i) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A01 = i;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AR) it.next()).AAd(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AAe(int i, long j, long j2) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((AR) it.next()).AAe(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FZ
    public final void AB0(List<FV> list) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A0C = list;
        copyOnWriteArraySet = this.A00.A0K;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FZ) it.next()).AB0(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ABD(int i, long j) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IL) it.next()).ABD(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DH
    public final void AC8(Metadata metadata) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0J;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((DH) it.next()).AC8(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ACi(Surface surface) {
        Surface surface2;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        surface2 = this.A00.A03;
        if (surface2 == surface) {
            copyOnWriteArraySet2 = this.A00.A0M;
            Iterator it = copyOnWriteArraySet2.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((IL) it2.next()).ACi(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADK(String str, long j, long j2) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IL) it.next()).ADK(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADL(C0393Au c0393Au) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IL) it.next()).ADL(c0393Au);
        }
        this.A00.A07 = null;
        String[] strArr = A01;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A01[0] = "zG8NefRqMKYqbgzRufdCrC4W5rqrDhRZ";
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADM(C0393Au c0393Au) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A0A = c0393Au;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].charAt(5) == '7') {
                throw new RuntimeException();
            }
            A01[4] = "B3QwduSxUwudXX0SLqqw26pCzLpqq2sU";
            if (hasNext) {
                ((IL) it.next()).ADM(c0393Au);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADQ(Format format) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A07 = format;
        copyOnWriteArraySet = this.A00.A0L;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IL) it.next()).ADQ(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void ADV(int i, int i2, int i3, float f) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        copyOnWriteArraySet = this.A00.A0M;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((IC) it.next()).ADV(i, i2, i3, f);
        }
        copyOnWriteArraySet2 = this.A00.A0L;
        Iterator it2 = copyOnWriteArraySet2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[4] = "2vUTxC8fdDWhhRkArIujhTo4qLvFXYNt";
            if (hasNext) {
                ((IL) it2.next()).ADV(i, i2, i3, f);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0G(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
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
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}
