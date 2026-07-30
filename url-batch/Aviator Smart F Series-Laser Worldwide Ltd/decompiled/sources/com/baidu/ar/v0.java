package com.baidu.ar;

import android.media.AudioRecord;
import com.baidu.ar.audio.AudioParams;
import com.baidu.ar.audio.VolumeListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3431i = "v0";

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f3432j = false;

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f3433a;

    /* renamed from: b, reason: collision with root package name */
    public AudioParams f3434b;

    /* renamed from: f, reason: collision with root package name */
    public s0 f3438f;

    /* renamed from: g, reason: collision with root package name */
    public VolumeListener f3439g;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3435c = null;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<ByteBuffer> f3436d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f3437e = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3440h = false;

    public AudioParams a() {
        return this.f3434b;
    }

    public final void b() {
        if (this.f3434b.getFrameSize() <= 0) {
            return;
        }
        if (this.f3436d == null) {
            this.f3436d = new ArrayList<>();
            for (int i8 = 0; i8 < this.f3434b.getFrameBufferCount(); i8++) {
                this.f3436d.add(ByteBuffer.allocate(this.f3434b.getFrameSize()));
            }
        }
        this.f3437e = 0;
        if (this.f3435c == null) {
            this.f3435c = new byte[this.f3434b.getFrameSize()];
        }
        int i9 = 0;
        while (f3432j) {
            long nanoTime = System.nanoTime();
            AudioRecord audioRecord = this.f3433a;
            byte[] bArr = this.f3435c;
            int read = audioRecord.read(bArr, 0, bArr.length);
            if (!this.f3440h || this.f3434b == null) {
                a(i9);
                i9++;
            } else {
                a(nanoTime, read);
            }
        }
        this.f3436d = null;
        this.f3435c = null;
        try {
            this.f3433a.stop();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        s0 s0Var = this.f3438f;
        if (s0Var != null) {
            s0Var.onAudioStop(true);
        }
    }

    public void c() {
        if (f3432j) {
            return;
        }
        this.f3433a.release();
        this.f3433a = null;
        s0 s0Var = this.f3438f;
        if (s0Var != null) {
            s0Var.onAudioRelease();
        }
        this.f3438f = null;
        this.f3439g = null;
    }

    public void d() {
        e();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int recordingState;
        boolean z7 = true;
        if (this.f3433a.getState() == 1) {
            try {
                this.f3433a.startRecording();
                recordingState = this.f3433a.getRecordingState();
            } catch (IllegalStateException e8) {
                h.b(f3431i, "startAudioRecord error!!!");
                e8.printStackTrace();
            }
            if (recordingState == 3) {
                f3432j = z7;
                if (z7) {
                    h.b(f3431i, "startAudioRecord error!!! mAudioRecord.getState() = " + this.f3433a.getState());
                    a(false);
                    return;
                }
                return;
            }
            h.b(f3431i, "startAudioRecord state = " + recordingState);
        }
        z7 = false;
        f3432j = z7;
        if (z7) {
        }
    }

    public void f() {
        f3432j = false;
    }

    public final void a(long j8) {
        if (j8 >= 20) {
            a(false);
        } else if (w0.a(this.f3435c) == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return;
        } else {
            a(true);
        }
        this.f3440h = true;
    }

    public final void a(long j8, int i8) {
        ByteBuffer byteBuffer = this.f3436d.get(this.f3437e);
        if (i8 == -3) {
            h.b(f3431i, "Audio read error");
        } else if (this.f3438f != null && byteBuffer != null && byteBuffer.capacity() >= i8) {
            if (this.f3434b.getAmplifyVolume() != 1.0f) {
                w0.a(this.f3435c, this.f3434b.getAmplifyVolume());
            }
            try {
                byteBuffer.clear();
                byteBuffer.position(0);
                byteBuffer.put(this.f3435c, 0, i8);
                byteBuffer.flip();
                this.f3438f.onAudioFrameAvailable(byteBuffer, i8, j8);
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        int i9 = this.f3437e + 1;
        this.f3437e = i9;
        this.f3437e = i9 % this.f3434b.getFrameBufferCount();
        if (this.f3439g != null) {
            this.f3439g.onRealtimeVolume((int) w0.b(this.f3435c));
        }
    }

    public void a(AudioParams audioParams) {
        int minBufferSize = AudioRecord.getMinBufferSize(audioParams.getSampleRate(), audioParams.getChannelConfig(), audioParams.getAudioFormat());
        if (audioParams.getFrameSize() < minBufferSize) {
            audioParams.setAudioBufferSize(((minBufferSize / 1024) + 1) * 2048);
        }
        this.f3433a = new AudioRecord(audioParams.getAudioSource(), audioParams.getSampleRate(), audioParams.getChannelConfig(), audioParams.getAudioFormat(), audioParams.getAudioBufferSize());
        this.f3434b = audioParams;
        this.f3440h = false;
        s0 s0Var = this.f3438f;
        if (s0Var != null) {
            s0Var.onAudioSetup(true);
        }
    }

    public void a(VolumeListener volumeListener) {
        this.f3439g = volumeListener;
    }

    public void a(s0 s0Var) {
        this.f3438f = s0Var;
    }

    public final void a(boolean z7) {
        s0 s0Var = this.f3438f;
        if (s0Var != null) {
            s0Var.onAudioStart(z7);
        }
    }
}
