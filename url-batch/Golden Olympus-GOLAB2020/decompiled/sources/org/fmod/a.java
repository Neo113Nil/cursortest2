package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final FMODAudioDevice f43332a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f43333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43335d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Thread f43336e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f43337f;

    /* renamed from: g, reason: collision with root package name */
    public AudioRecord f43338g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43339h;

    public a(FMODAudioDevice fMODAudioDevice, int i4, int i5) {
        this.f43332a = fMODAudioDevice;
        this.f43334c = i4;
        this.f43335d = i5;
        this.f43333b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i4, i5, 2));
    }

    public final void a() {
        AudioRecord audioRecord = this.f43338g;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f43338g.stop();
            }
            this.f43338g.release();
            this.f43338g = null;
        }
        this.f43333b.position(0);
        this.f43339h = false;
    }

    public final void b() {
        while (this.f43336e != null) {
            this.f43337f = false;
            try {
                this.f43336e.join();
                this.f43336e = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = 3;
        while (this.f43337f) {
            if (!this.f43339h && i4 > 0) {
                a();
                AudioRecord audioRecord = new AudioRecord(1, this.f43334c, this.f43335d, 2, this.f43333b.capacity());
                this.f43338g = audioRecord;
                boolean z4 = audioRecord.getState() == 1;
                this.f43339h = z4;
                if (z4) {
                    this.f43333b.position(0);
                    this.f43338g.startRecording();
                    i4 = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f43338g.getState() + ")");
                    i4 += -1;
                    a();
                }
            }
            if (this.f43339h && this.f43338g.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f43338g;
                ByteBuffer byteBuffer = this.f43333b;
                this.f43332a.fmodProcessMicData(this.f43333b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f43333b.position(0);
            }
        }
        a();
    }
}
