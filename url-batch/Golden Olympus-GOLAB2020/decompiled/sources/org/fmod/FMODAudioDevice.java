package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class FMODAudioDevice implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private volatile Thread f43318a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f43319b = false;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f43320c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43321d = false;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f43322e = null;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f43323f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile a f43324g;

    private native int fmodGetInfo(int i4);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f43320c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f43320c.stop();
            }
            this.f43320c.release();
            this.f43320c = null;
        }
        this.f43322e = null;
        this.f43323f = null;
        this.f43321d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i4);

    public boolean isRunning() {
        return this.f43318a != null && this.f43318a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4 = 3;
        while (this.f43319b) {
            if (!this.f43321d && i4 > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(0);
                int i5 = fmodGetInfo(4) == 1 ? 4 : 12;
                int minBufferSize = AudioTrack.getMinBufferSize(fmodGetInfo, i5, 2);
                int fmodGetInfo2 = fmodGetInfo(4) * 2;
                int round = Math.round(minBufferSize * 1.1f) & (~(fmodGetInfo2 - 1));
                int fmodGetInfo3 = fmodGetInfo(1);
                int fmodGetInfo4 = fmodGetInfo(2) * fmodGetInfo3 * fmodGetInfo2;
                AudioTrack audioTrack = new AudioTrack(3, fmodGetInfo, i5, 2, fmodGetInfo4 > round ? fmodGetInfo4 : round, 1);
                this.f43320c = audioTrack;
                boolean z4 = audioTrack.getState() == 1;
                this.f43321d = z4;
                if (z4) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo3 * fmodGetInfo2);
                    this.f43322e = allocateDirect;
                    this.f43323f = new byte[allocateDirect.capacity()];
                    this.f43320c.play();
                    i4 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f43320c.getState() + ")");
                    releaseAudioTrack();
                    i4 += -1;
                }
            }
            if (this.f43321d) {
                if (fmodGetInfo(3) == 1) {
                    fmodProcess(this.f43322e);
                    ByteBuffer byteBuffer = this.f43322e;
                    byteBuffer.get(this.f43323f, 0, byteBuffer.capacity());
                    this.f43320c.write(this.f43323f, 0, this.f43322e.capacity());
                    this.f43322e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        try {
            if (this.f43318a != null) {
                stop();
            }
            this.f43318a = new Thread(this, "FMODAudioDevice");
            this.f43318a.setPriority(10);
            this.f43319b = true;
            this.f43318a.start();
            if (this.f43324g != null) {
                a aVar = this.f43324g;
                if (aVar.f43336e != null) {
                    aVar.b();
                }
                aVar.f43337f = true;
                aVar.f43336e = new Thread(aVar);
                aVar.f43336e.start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int startAudioRecord(int i4, int i5, int i6) {
        try {
            if (this.f43324g == null) {
                this.f43324g = new a(this, i4, i5);
                a aVar = this.f43324g;
                if (aVar.f43336e != null) {
                    aVar.b();
                }
                aVar.f43337f = true;
                aVar.f43336e = new Thread(aVar);
                aVar.f43336e.start();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f43324g.f43333b.capacity();
    }

    public synchronized void stop() {
        while (this.f43318a != null) {
            this.f43319b = false;
            try {
                this.f43318a.join();
                this.f43318a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f43324g != null) {
            this.f43324g.b();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f43324g != null) {
            this.f43324g.b();
            this.f43324g = null;
        }
    }
}
