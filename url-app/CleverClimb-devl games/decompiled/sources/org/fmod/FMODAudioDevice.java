package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class FMODAudioDevice implements Runnable {
    private static int h = 0;
    private static int i = 1;
    private static int j = 2;
    private static int k = 3;

    /* renamed from: a, reason: collision with root package name */
    private volatile Thread f10005a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f10006b = false;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f10007c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10008d = false;
    private ByteBuffer e = null;
    private byte[] f = null;
    private volatile a g;

    private native int fmodGetInfo(int i2);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        if (this.f10007c != null) {
            if (this.f10007c.getState() == 1) {
                this.f10007c.stop();
            }
            this.f10007c.release();
            this.f10007c = null;
        }
        this.e = null;
        this.f = null;
        this.f10008d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i2);

    public boolean isRunning() {
        return this.f10005a != null && this.f10005a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2 = 3;
        while (this.f10006b) {
            if (!this.f10008d && i2 > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(h);
                int round = Math.round(AudioTrack.getMinBufferSize(fmodGetInfo, 3, 2) * 1.1f) & (-4);
                int fmodGetInfo2 = fmodGetInfo(i);
                int fmodGetInfo3 = fmodGetInfo(j) * fmodGetInfo2 * 4;
                this.f10007c = new AudioTrack(3, fmodGetInfo, 3, 2, fmodGetInfo3 > round ? fmodGetInfo3 : round, 1);
                this.f10008d = this.f10007c.getState() == 1;
                if (this.f10008d) {
                    this.e = ByteBuffer.allocateDirect(fmodGetInfo2 * 2 * 2);
                    this.f = new byte[this.e.capacity()];
                    this.f10007c.play();
                    i2 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f10007c.getState() + ")");
                    releaseAudioTrack();
                    i2 += -1;
                }
            }
            if (this.f10008d) {
                if (fmodGetInfo(k) == 1) {
                    fmodProcess(this.e);
                    this.e.get(this.f, 0, this.e.capacity());
                    this.f10007c.write(this.f, 0, this.e.capacity());
                    this.e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f10005a != null) {
            stop();
        }
        this.f10005a = new Thread(this, "FMODAudioDevice");
        this.f10005a.setPriority(10);
        this.f10006b = true;
        this.f10005a.start();
        if (this.g != null) {
            this.g.b();
        }
    }

    public synchronized int startAudioRecord(int i2, int i3, int i4) {
        if (this.g == null) {
            this.g = new a(this, i2, i3);
            this.g.b();
        }
        return this.g.a();
    }

    public synchronized void stop() {
        while (this.f10005a != null) {
            this.f10006b = false;
            try {
                this.f10005a.join();
                this.f10005a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.g != null) {
            this.g.c();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.g != null) {
            this.g.c();
            this.g = null;
        }
    }
}
