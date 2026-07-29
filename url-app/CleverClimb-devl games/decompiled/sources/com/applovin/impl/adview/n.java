package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
class n extends FrameLayout implements TextureView.SurfaceTextureListener, r {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f2614a;

    /* renamed from: b, reason: collision with root package name */
    private final TextureView f2615b;

    /* renamed from: c, reason: collision with root package name */
    private final MediaPlayer f2616c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f2617d;
    private int e;
    private int f;
    private int g;

    n(com.applovin.impl.sdk.j jVar, Context context, Runnable runnable) {
        super(context);
        this.f2614a = jVar.u();
        this.f2616c = new MediaPlayer();
        this.f2617d = runnable;
        this.f2615b = new TextureView(context);
        this.f2615b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2615b.setSurfaceTextureListener(this);
        addView(this.f2615b);
    }

    private void a() {
        AppLovinSdkUtils.runOnUiThreadDelayed(this.f2617d, 250L);
    }

    @Override // com.applovin.impl.adview.r
    public int getCurrentPosition() {
        return this.f2616c.getCurrentPosition();
    }

    @Override // com.applovin.impl.adview.r
    public int getDuration() {
        return this.f2616c.getDuration();
    }

    @Override // com.applovin.impl.adview.r
    public boolean isPlaying() {
        return this.f2616c.isPlaying();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        try {
            this.f2616c.setSurface(surface);
            this.f2616c.setAudioStreamType(3);
            this.f2616c.prepareAsync();
        } catch (Throwable th) {
            this.f2614a.b("TextureVideoView", "Failed to prepare media player", th);
            surface.release();
            a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.applovin.impl.adview.r
    public void pause() {
        this.f2616c.pause();
    }

    @Override // com.applovin.impl.adview.r
    public void seekTo(int i) {
        this.f2616c.seekTo(i);
    }

    @Override // com.applovin.impl.adview.r
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f2616c.setOnCompletionListener(onCompletionListener);
    }

    @Override // com.applovin.impl.adview.r
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f2616c.setOnErrorListener(onErrorListener);
    }

    @Override // com.applovin.impl.adview.r
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f2616c.setOnPreparedListener(onPreparedListener);
    }

    @Override // com.applovin.impl.adview.r
    public void setVideoSize(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int e = com.applovin.impl.sdk.e.l.e(getContext());
        if (this.e == 0) {
            i3 = this.f2615b.getWidth();
            i4 = this.f2615b.getHeight();
            this.e = e;
            this.f = i3;
            this.g = i4;
        } else if (e == this.e) {
            i3 = this.f;
            i4 = this.g;
        } else {
            i3 = this.g;
            i4 = this.f;
        }
        float f = i2 / i;
        float f2 = i3;
        int i6 = (int) (f2 * f);
        if (i4 >= i6) {
            i5 = i3;
        } else {
            i5 = (int) (i4 / f);
            i6 = i4;
        }
        try {
            Matrix matrix = new Matrix();
            this.f2615b.getTransform(matrix);
            matrix.setScale(i5 / f2, i6 / i4);
            matrix.postTranslate((i3 - i5) / 2, (i4 - i6) / 2);
            this.f2615b.setTransform(matrix);
            invalidate();
            requestLayout();
        } catch (Throwable unused) {
            this.f2614a.d("TextureVideoView", "Failed to set video size to width: " + i + " height: " + i2);
            a();
        }
    }

    @Override // com.applovin.impl.adview.r
    public void setVideoURI(Uri uri) {
        try {
            this.f2616c.setDataSource(uri.toString());
        } catch (Throwable th) {
            this.f2614a.b("TextureVideoView", "Failed to set video URI: " + uri, th);
            a();
        }
    }

    @Override // com.applovin.impl.adview.r
    public void start() {
        this.f2616c.start();
    }

    @Override // com.applovin.impl.adview.r
    public void stopPlayback() {
        this.f2616c.stop();
    }
}
