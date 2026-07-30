package com.baidu.ar;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class z0 implements p5 {

    /* renamed from: a, reason: collision with root package name */
    public AudioTrack f3785a = new AudioTrack(3, 16000, 4, 2, AudioTrack.getMinBufferSize(16000, 4, 2), 1);

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f3786b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f3787c;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 2) {
                if (z0.this.f3785a != null) {
                    z0.this.f3785a.play();
                }
            } else if (i8 == 7 && (message.obj instanceof byte[]) && z0.this.f3785a != null) {
                if (z0.this.f3785a.getPlayState() != 3) {
                    z0.this.f3785a.play();
                }
                byte[] bArr = (byte[]) message.obj;
                z0.this.f3785a.write(bArr, 0, bArr.length);
            }
        }
    }

    public z0() {
        HandlerThread handlerThread = new HandlerThread("AudioTrackPlayer");
        this.f3786b = handlerThread;
        handlerThread.start();
        this.f3787c = new a(this.f3786b.getLooper());
    }

    @Override // com.baidu.ar.p5
    public boolean b() {
        AudioTrack audioTrack = this.f3785a;
        return audioTrack != null && audioTrack.getPlayState() == 3;
    }

    @Override // com.baidu.ar.p5
    public void pause() {
        AudioTrack audioTrack = this.f3785a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f3785a.pause();
    }

    @Override // com.baidu.ar.p5
    public void release() {
        AudioTrack audioTrack = this.f3785a;
        if (audioTrack != null) {
            audioTrack.release();
        }
        this.f3787c.removeCallbacksAndMessages(null);
        this.f3786b.quitSafely();
    }

    @Override // com.baidu.ar.p5
    public void resume() {
        AudioTrack audioTrack = this.f3785a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f3785a.play();
    }

    @Override // com.baidu.ar.p5
    public void stop() {
        AudioTrack audioTrack = this.f3785a;
        if (audioTrack != null) {
            audioTrack.stop();
        }
    }

    @Override // com.baidu.ar.p5
    public void a() {
        Message.obtain(this.f3787c, 2).sendToTarget();
    }

    @Override // com.baidu.ar.p5
    public void a(byte[] bArr) {
        Message.obtain(this.f3787c, 7, bArr).sendToTarget();
    }
}
