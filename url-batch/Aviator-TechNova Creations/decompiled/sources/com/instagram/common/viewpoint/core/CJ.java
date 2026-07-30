package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class CJ extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC1227eS {
    public static byte[] A0O;
    public static String[] A0P = {"8kg0gsxxraVcY9760AfDDdqqLp5YK9AT", "N8j2Ddyx", "HVNw4PtkXrEg8LlUN7XWbo", "maxPy5SeUtgOYTWaW", "FkAKyJNQQf2eCz2ilXM7tuAli1jbjSs3", "vA9Mb9Xk6BXUb", "TQHC", "vy65DpAohCvDmaIHVnToJ2EB52e80kqi"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    public MediaController A0A;
    public EnumC1175db A0B;
    public EnumC1229eU A0C;
    public EnumC1229eU A0D;
    public InterfaceC1230eV A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final MediaController.MediaPlayerControl A0M;
    public final C1159dL A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0O = new byte[]{115, 125, 113, 115, -74, -55, -59, -61, -78, 115, 113, -117, 113, 115, -54, 37, -115, -85, -72, -72, -71, -66, 106, -70, -68, -81, -70, -85, -68, -81, 106, -73, -81, -82, -77, -85, 106, -70, -74, -85, -61, -81, -68, 106, -63, -77, -66, -78, 106, -99, -65, -68, -80, -85, -83, -81, -98, -81, -62, -66, -65, -68, -81, -124, 106, -70, -26, -20, -29, -37, -27, -98, -21, -105, -23, -36, -21, -23, -32, -36, -19, -36, -105, -19, -32, -37, -36, -26, -105, -32, -27, -35, -26, -23, -28, -40, -21, -32, -26, -27, -47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -6, -5, -16, -7, -85, -20, -2, -2, -16, -1, -2, -104, -64, -64, -72, -67, -74, 113, -78, -67, -56, -78, -54, -60, 113, -59, -71, -61, -64, -56, 113, -78, -65, 113, -74, -55, -76, -74, -63, -59, -70, -64, -65, 113, -56, -70, -59, -71, 113, -60, -74, -59, -109, -78, -76, -68, -72, -61, -64, -58, -65, -75, -107, -61, -78, -56, -78, -77, -67, -74, 113, -64, -65, 113, -97, -64, -58, -72, -78, -59, 113, -78, -77, -64, -57, -74, Byte.MAX_VALUE, 113, -60, -64, 113, -56, -74, 113, -60, -70, -67, -74, -65, -59, -67, -54, 113, -70, -72, -65, -64, -61, -74, 113, -70, -59, Byte.MAX_VALUE, -23, 17, 17, 9, Ascii.SO, 7, -62, 3, Ascii.SO, Ascii.EM, 3, Ascii.ESC, Ascii.NAK, -62, Ascii.SYN, 10, Ascii.DC4, 17, Ascii.EM, -62, 3, 16, -62, 7, Ascii.SUB, 5, 7, Ascii.DC2, Ascii.SYN, Ascii.VT, 17, 16, -62, Ascii.EM, Ascii.VT, Ascii.SYN, 10, -62, Ascii.NAK, 7, Ascii.SYN, -24, 17, Ascii.DC4, 7, 9, Ascii.DC4, 17, Ascii.ETB, 16, 6, -62, 17, 16, -62, -16, 17, Ascii.ETB, 9, 3, Ascii.SYN, -62, 3, 4, 17, Ascii.CAN, 7, -48, -62, Ascii.NAK, 17, -62, Ascii.EM, 7, -62, Ascii.NAK, Ascii.VT, Ascii.SO, 7, 16, Ascii.SYN, Ascii.SO, Ascii.ESC, -62, Ascii.VT, 9, 16, 17, Ascii.DC4, 7, -62, Ascii.VT, Ascii.SYN, -48, -47, -22, -35, -34, -24, -31, -100, -16, -21, -100, -33, -24, -21, -17, -31, -13, 16, 7, -66, 17, 6, Ascii.CR, 19, 10, 2, -66, Ascii.FF, Ascii.CR, Ascii.DC2, -66, 0, 3, -66, 3, Ascii.VT, Ascii.SO, Ascii.DC2, Ascii.ETB, -52, -4, Ascii.SI, 10, Ascii.VT, Ascii.NAK, -58, Ascii.EM, Ascii.SUB, 7, Ascii.SUB, Ascii.VT, -58, 9, Ascii.SO, 7, Ascii.DC4, Ascii.CR, Ascii.VT, 10, -58, Ascii.SUB, Ascii.NAK, -58, -97, -79, -79, -93, -78, Ascii.SUB, Ascii.SYN, Ascii.VT, 35, Ascii.SI, Ascii.FS, Ascii.FF, -77, 8, -7, -14, 5, -77, -79, -53, -79, -77};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (U7.A1v(this.A0N)) {
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[4].charAt(10) != '2') {
                throw new RuntimeException();
            }
            A0P[4] = "ZKmo0lxTtT2mJSQRRhI8B7lsvNxlt9ka";
            if (mediaPlayer == null || !A07()) {
                return;
            }
            if (!this.A0I) {
                this.A0I = true;
                this.A0N.A0F().AIJ();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0E != null) {
                this.A0E.ADK(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A04();
        A0Q = CJ.class.getSimpleName();
    }

    public CJ(C1159dL c1159dL) {
        super(c1159dL);
        this.A0C = EnumC1229eU.A04;
        this.A0D = EnumC1229eU.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC1175db.A03;
        this.A0M = new C1224eP(this);
        this.A0I = false;
        this.A0N = c1159dL;
    }

    public CJ(C1159dL c1159dL, AttributeSet attributeSet) {
        super(c1159dL, attributeSet);
        this.A0C = EnumC1229eU.A04;
        this.A0D = EnumC1229eU.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC1175db.A03;
        this.A0M = new C1224eP(this);
        this.A0I = false;
        this.A0N = c1159dL;
    }

    public CJ(C1159dL c1159dL, AttributeSet attributeSet, int i) {
        super(c1159dL, attributeSet, i);
        this.A0C = EnumC1229eU.A04;
        this.A0D = EnumC1229eU.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC1175db.A03;
        this.A0M = new C1224eP(this);
        this.A0I = false;
        this.A0N = c1159dL;
    }

    private final void A05(MediaPlayer mediaPlayer, Uri uri) {
        String uriPath;
        String A03 = A03(TypedValues.AttributesType.TYPE_EASING, 15, 64);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    uriPath = uri.getPath();
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e) {
                            Log.w(A0Q, A03, e);
                        }
                    }
                    throw th;
                }
            } catch (IOException | SecurityException e2) {
                Log.w(A0Q, A03(100, 21, 79), e2);
                setVideoState(EnumC1229eU.A03);
                this.A0N.A0F().A3a(2);
                if (0 != 0) {
                    assetFileDescriptor.close();
                } else {
                    return;
                }
            }
            if (!TextUtils.isEmpty(uriPath)) {
                AssetFileDescriptor openFd = getContext().getAssets().openFd(uriPath.substring(1));
                mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                if (openFd != null) {
                    openFd.close();
                    return;
                }
                return;
            }
            throw new IOException(A03(332, 24, 98));
        } catch (IOException e3) {
            String str = A0Q;
            if (A0P[6].length() != 4) {
                throw new RuntimeException();
            }
            A0P[3] = "IDdSaYeoVr3R4FZ1u";
            Log.w(str, A03, e3);
        }
    }

    private boolean A06() {
        return (this.A0C == EnumC1229eU.A08 || this.A0C == EnumC1229eU.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == EnumC1229eU.A07 || this.A0C == EnumC1229eU.A0A || this.A0C == EnumC1229eU.A05 || this.A0C == EnumC1229eU.A06;
    }

    private boolean A08() {
        return (this.A0C == EnumC1229eU.A08 || this.A0C == EnumC1229eU.A07) ? false : true;
    }

    private boolean A09() {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0N.A08().AAy(A03(384, 6, 110), AbstractC0772Sv.A2H, new C0773Sw(e));
            return false;
        }
    }

    private boolean A0A(Surface surface) {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            this.A0N.A08().AAy(A03(384, 6, 110), AbstractC0772Sv.A2I, new C0773Sw(e));
            return false;
        }
    }

    public final /* synthetic */ void A0C() {
        Activity activity = this.A0N.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9V();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void A9V() {
        if (!this.A0F) {
            AG7(false, 3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final boolean A9i() {
        if (this.A06 == null) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                if (trackInfo.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(A0Q, A03(65, 35, 59), e);
            return true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final boolean A9j() {
        return this.A0K;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final boolean AAT() {
        return this.A0J;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void AG7(boolean z, int i) {
        this.A0N.A0F().A3W(i);
        this.A0D = EnumC1229eU.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0J = z;
            this.A06.pause();
            if (this.A0C != EnumC1229eU.A06) {
                setVideoState(EnumC1229eU.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC1229eU.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void AJH(int i) {
        this.A0N.A0F().ABy(i);
        setVideoState(EnumC1229eU.A09);
        AJU(5);
        this.A03 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void AJM(EnumC1175db enumC1175db, int i) {
        this.A0N.A0F().A3h(i);
        this.A0J = false;
        this.A0D = EnumC1229eU.A0A;
        this.A0B = enumC1175db;
        if (this.A0C == EnumC1229eU.A0A || this.A0C == EnumC1229eU.A07 || this.A0C == EnumC1229eU.A04 || this.A0C == EnumC1229eU.A05 || this.A0C == EnumC1229eU.A06) {
            if (this.A06 == null) {
                setup(this.A07);
            } else {
                if (this.A03 > 0) {
                    this.A06.seekTo(this.A03);
                }
                this.A06.start();
                if (this.A0C != EnumC1229eU.A07 || this.A0K) {
                    setVideoState(EnumC1229eU.A0A);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void AJU(int i) {
        this.A0N.A0F().A3j(i);
        this.A0D = EnumC1229eU.A04;
        if (this.A06 != null) {
            int currentPosition = this.A06.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            A09();
            this.A06.release();
            this.A06 = null;
            if (this.A0A != null) {
                this.A0A.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC1229eU.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[1].length() == 0) {
                throw new RuntimeException();
            }
            A0P[3] = "r7bVcQo0vwDc4SuX1";
            mediaPlayer.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(EnumC1229eU.A04);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public int getDuration() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public EnumC1175db getStartReason() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public EnumC1229eU getState() {
        return this.A0C;
    }

    public EnumC1229eU getTargetState() {
        return this.A0D;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public View getView() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC1229eU.A03);
            this.A0N.A0F().A3a(5);
            AJU(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.A06 != null) {
            this.A06.pause();
        }
        setVideoState(EnumC1229eU.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.A0N.A0F().ABx(A03(390, 11, 85) + i + A03(0, 14, 21) + i2 + A03(14, 2, 108));
        if (this.A01 > 0 && getState() == EnumC1229eU.A0A) {
            this.A01--;
            AJU(6);
            AJM(this.A0B, 10);
        } else {
            setVideoState(EnumC1229eU.A03);
            this.A0N.A0F().A3a(1);
            AJU(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        switch (i) {
            case 3:
                this.A0K = true;
                if (this.A0D == EnumC1229eU.A0A) {
                    setVideoState(EnumC1229eU.A0A);
                }
                return true;
            case TypedValues.TransitionType.TYPE_FROM /* 701 */:
                setVideoState(EnumC1229eU.A02);
                return false;
            case TypedValues.TransitionType.TYPE_TO /* 702 */:
                if (!A08()) {
                    return false;
                }
                setVideoState(EnumC1229eU.A0A);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(EnumC1229eU.A07);
        if (this.A0H && !this.A0G) {
            Activity A0E = this.A0N.A0E();
            if (A0E != null) {
                this.A0A = new MediaController(A0E);
                this.A0A.setAnchorView(this.A09 == null ? this : this.A09);
                this.A0A.setMediaPlayer(this.A0M);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A03 > 0) {
            int i = this.A03;
            int duration = ((MediaPlayer) AbstractC1336gF.A00(this.A06)).getDuration();
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[5] = "vYKpudhGuKF00mC0lqJEZv1Z";
            if (i >= duration) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        if (this.A0D == EnumC1229eU.A0A) {
            AJM(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.A0E == null) {
            return;
        }
        this.A0E.AF9(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(EnumC1229eU.A03);
            this.A0N.A0F().A3a(4);
            destroy();
        } else if (this.A0C == EnumC1229eU.A05 && !this.A0J) {
            AJM(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A0A(null);
        if (this.A08 != null) {
            this.A08.release();
            this.A08 = null;
        }
        if (this.A0C != EnumC1229eU.A05) {
            AG7(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r3 != false) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        if (this.A0A != null && this.A0A.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != EnumC1229eU.A05) {
                if (!this.A0N.A0H().A01()) {
                    boolean A1z = U7.A1z(this.A0N);
                    if (A0P[2].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0P[5] = "q2iXdwHPhxMMYJm8CrOmbfqNZQSE";
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.eO
                        @Override // java.lang.Runnable
                        public final void run() {
                            CJ.this.A0C();
                        }
                    }, 1000L);
                    return;
                }
                A9V();
                return;
            }
            return;
        }
        EnumC1229eU enumC1229eU = this.A0C;
        EnumC1229eU enumC1229eU2 = EnumC1229eU.A05;
        if (A0P[6].length() == 4) {
            A0P[6] = "r8oy";
            if (enumC1229eU != enumC1229eU2) {
                return;
            }
        } else if (enumC1229eU != enumC1229eU2) {
            return;
        }
        if (!this.A0J) {
            EnumC1175db enumC1175db = this.A0B;
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[1] = "grk6xKjGgtFswoEyrqXB";
            AJM(enumC1175db, 9);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public final void seekTo(int i) {
        if (this.A06 != null && A07()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(Opcodes.LSHL, 102, 21));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC1226eR(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(223, 94, 102));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new ViewOnTouchListenerC1225eQ(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 == null || this.A0C == EnumC1229eU.A08) {
            return;
        }
        EnumC1229eU enumC1229eU = this.A0C;
        String[] strArr = A0P;
        if (strArr[0].charAt(16) == strArr[7].charAt(16)) {
            throw new RuntimeException();
        }
        A0P[3] = "xC5rxgqNbqLUjjPrr";
        if (enumC1229eU != EnumC1229eU.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setVideoMPD(String str) {
    }

    private void setVideoState(EnumC1229eU enumC1229eU) {
        if (enumC1229eU != this.A0C) {
            if (this.A0N.A05().AAF()) {
                String str = A03(356, 23, 106) + enumC1229eU;
            }
            this.A0C = enumC1229eU;
            if (this.A0E != null) {
                this.A0E.AFt(enumC1229eU);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setVideoStateChangeListener(InterfaceC1230eV interfaceC1230eV) {
        this.A0E = interfaceC1230eV;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1227eS
    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        this.A0N.A0F().A3Z();
        this.A0K = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(EnumC1229eU.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (((String) AbstractC1336gF.A00(uri.getScheme())).equals(A03(379, 5, 2))) {
                A05(mediaPlayer, uri);
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(EnumC1229eU.A08);
        } catch (Exception e) {
            setVideoState(EnumC1229eU.A03);
            this.A0N.A0F().A3a(3);
            mediaPlayer.release();
            Log.e(A0Q, A03(16, 49, 14) + e);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
