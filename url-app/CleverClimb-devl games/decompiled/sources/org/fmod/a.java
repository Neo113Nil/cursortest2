package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final FMODAudioDevice f10009a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteBuffer f10010b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10011c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10012d;
    private final int e = 2;
    private volatile Thread f;
    private volatile boolean g;
    private AudioRecord h;
    private boolean i;

    a(FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f10009a = fMODAudioDevice;
        this.f10011c = i;
        this.f10012d = i2;
        this.f10010b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, 2));
    }

    private void d() {
        if (this.h != null) {
            if (this.h.getState() == 1) {
                this.h.stop();
            }
            this.h.release();
            this.h = null;
        }
        this.f10010b.position(0);
        this.i = false;
    }

    public final int a() {
        return this.f10010b.capacity();
    }

    public final void b() {
        if (this.f != null) {
            c();
        }
        this.g = true;
        this.f = new Thread(this);
        this.f.start();
    }

    public final void c() {
        while (this.f != null) {
            this.g = false;
            try {
                this.f.join();
                this.f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        while (this.g) {
            if (!this.i && i > 0) {
                d();
                this.h = new AudioRecord(1, this.f10011c, this.f10012d, this.e, this.f10010b.capacity());
                this.i = this.h.getState() == 1;
                if (this.i) {
                    this.f10010b.position(0);
                    this.h.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.h.getState() + ")");
                    i += -1;
                    d();
                }
            }
            if (this.i && this.h.getRecordingState() == 3) {
                this.f10009a.fmodProcessMicData(this.f10010b, this.h.read(this.f10010b, this.f10010b.capacity()));
                this.f10010b.position(0);
            }
        }
        d();
    }
}
