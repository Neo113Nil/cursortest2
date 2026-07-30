package com.baidu.ar.audio;

import com.baidu.ar.h;
import com.baidu.ar.s0;
import com.baidu.ar.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class EasyAudio implements IEasyAudio, s0, VolumeListener {

    /* renamed from: f, reason: collision with root package name */
    public static final String f1755f = "EasyAudio";

    /* renamed from: g, reason: collision with root package name */
    public static volatile EasyAudio f1756g;

    /* renamed from: a, reason: collision with root package name */
    public u0 f1757a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<EasyAudioCallback> f1758b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<VolumeListener> f1759c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f1760d = new ReentrantLock(true);

    /* renamed from: e, reason: collision with root package name */
    public final Lock f1761e = new ReentrantLock(true);

    public static void b() {
        f1756g = null;
    }

    public static EasyAudio getInstance() {
        if (f1756g == null) {
            synchronized (EasyAudio.class) {
                try {
                    if (f1756g == null) {
                        f1756g = new EasyAudio();
                    }
                } finally {
                }
            }
        }
        return f1756g;
    }

    public final synchronized void a() {
        try {
            this.f1760d.lock();
            try {
                ArrayList<EasyAudioCallback> arrayList = this.f1758b;
                if (arrayList != null) {
                    arrayList.clear();
                    this.f1758b = null;
                }
                this.f1760d.unlock();
                ArrayList<VolumeListener> arrayList2 = this.f1759c;
                if (arrayList2 != null) {
                    arrayList2.clear();
                    this.f1759c = null;
                }
                b();
            } catch (Throwable th) {
                this.f1760d.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        u0 u0Var = this.f1757a;
        if (u0Var != null) {
            u0Var.l();
            this.f1757a.h();
            this.f1757a = null;
        }
    }

    @Override // com.baidu.ar.s0
    public void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8) {
        this.f1760d.lock();
        try {
            ArrayList<EasyAudioCallback> arrayList = this.f1758b;
            if (arrayList != null) {
                Iterator<EasyAudioCallback> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onAudioFrameAvailable(byteBuffer, i8, j8);
                }
            }
        } finally {
            this.f1760d.unlock();
        }
    }

    @Override // com.baidu.ar.s0
    public void onAudioRelease() {
        a();
    }

    @Override // com.baidu.ar.s0
    public void onAudioSetup(boolean z7) {
        if (z7) {
            u0 u0Var = this.f1757a;
            if (u0Var != null) {
                u0Var.j();
                return;
            }
            return;
        }
        ArrayList<EasyAudioCallback> arrayList = this.f1758b;
        if (arrayList == null || arrayList.get(0) == null) {
            return;
        }
        this.f1758b.get(0).onAudioStart(false, null);
        release();
    }

    @Override // com.baidu.ar.s0
    public void onAudioStart(boolean z7) {
        ArrayList<EasyAudioCallback> arrayList = this.f1758b;
        if (arrayList != null && arrayList.get(0) != null && this.f1757a != null) {
            this.f1758b.get(0).onAudioStart(z7, this.f1757a.a());
        }
        if (z7) {
            return;
        }
        release();
    }

    @Override // com.baidu.ar.s0
    public void onAudioStop(boolean z7) {
        ArrayList<EasyAudioCallback> arrayList = this.f1758b;
        if (arrayList == null || arrayList.get(0) == null) {
            return;
        }
        this.f1758b.get(0).onAudioStop(z7);
    }

    @Override // com.baidu.ar.audio.VolumeListener
    public void onRealtimeVolume(int i8) {
        this.f1761e.lock();
        try {
            ArrayList<VolumeListener> arrayList = this.f1759c;
            if (arrayList != null) {
                Iterator<VolumeListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onRealtimeVolume(i8);
                }
            }
        } finally {
            this.f1761e.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void release() {
        c();
        a();
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void removeVolumeListener(VolumeListener volumeListener) {
        if (volumeListener == null) {
            h.b(f1755f, "VolumeListener can not be null!!!");
            return;
        }
        this.f1761e.lock();
        try {
            ArrayList<VolumeListener> arrayList = this.f1759c;
            if (arrayList != null && arrayList.size() > 0 && this.f1759c.contains(volumeListener)) {
                this.f1759c.remove(volumeListener);
            }
        } finally {
            this.f1761e.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void setVolumeListener(VolumeListener volumeListener) {
        if (volumeListener == null) {
            h.b(f1755f, "VolumeListener can not be null!!!");
            return;
        }
        if (this.f1759c == null) {
            this.f1759c = new ArrayList<>();
        }
        if (this.f1759c.contains(volumeListener)) {
            h.b(f1755f, "setVolumeListener volumeListener has been added!!!");
            return;
        }
        if (this.f1757a == null) {
            this.f1757a = u0.b();
        }
        this.f1761e.lock();
        try {
            if (this.f1759c.size() == 0) {
                this.f1757a.a(this);
            }
            this.f1759c.add(volumeListener);
            this.f1761e.unlock();
        } catch (Throwable th) {
            this.f1761e.unlock();
            throw th;
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void startAudio(AudioParams audioParams, EasyAudioCallback easyAudioCallback) {
        if (audioParams == null || easyAudioCallback == null) {
            h.b(f1755f, "AudioParams && EasyAudioCallback can not be null!!!");
            return;
        }
        if (this.f1757a == null) {
            this.f1757a = u0.b();
        }
        if (this.f1758b == null) {
            this.f1758b = new ArrayList<>();
        }
        if (this.f1758b.contains(easyAudioCallback)) {
            h.b(f1755f, "EasyAudio has been started!!!");
            return;
        }
        if (this.f1757a.g()) {
            easyAudioCallback.onAudioStart(true, this.f1757a.a());
        } else {
            this.f1758b.clear();
            this.f1757a.a(audioParams, this);
        }
        this.f1760d.lock();
        try {
            ArrayList<EasyAudioCallback> arrayList = this.f1758b;
            if (arrayList != null) {
                arrayList.add(easyAudioCallback);
            }
        } finally {
            this.f1760d.unlock();
        }
    }

    @Override // com.baidu.ar.audio.IEasyAudio
    public void stopAudio(EasyAudioCallback easyAudioCallback) {
        if (easyAudioCallback == null) {
            h.b(f1755f, "EasyAudioCallback can not be null!!!");
            return;
        }
        ArrayList<EasyAudioCallback> arrayList = this.f1758b;
        if (arrayList == null || !arrayList.contains(easyAudioCallback)) {
            h.b(f1755f, "Please confirm EasyAudio has been started!!!");
            return;
        }
        if (this.f1758b.size() <= 1) {
            c();
            return;
        }
        this.f1760d.lock();
        try {
            boolean remove = this.f1758b.remove(easyAudioCallback);
            this.f1760d.unlock();
            easyAudioCallback.onAudioStop(remove);
        } catch (Throwable th) {
            this.f1760d.unlock();
            throw th;
        }
    }
}
