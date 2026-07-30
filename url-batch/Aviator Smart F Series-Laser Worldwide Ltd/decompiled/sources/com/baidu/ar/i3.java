package com.baidu.ar;

import com.baidu.ar.digital.IDigital;
import com.baidu.ar.digital.IDigitalListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class i3 extends d0 implements IDigital {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<IDigital> f2441a;

    /* renamed from: b, reason: collision with root package name */
    public IDigitalListener f2442b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.clear();
            this.f2441a = null;
        }
        this.f2442b = null;
    }

    @Override // com.baidu.ar.digital.IDigital
    public void initDigital(HashMap<String, Object> hashMap) {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().initDigital(hashMap);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void playAudio(byte[] bArr) {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().playAudio(bArr);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void sendChatMessage(String str) {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().sendChatMessage(str);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void sendReadingMessage(String str) {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().sendReadingMessage(str);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void setBlendShape(HashMap<String, Double> hashMap) {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().setBlendShape(hashMap);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void setDigitalListener(IDigitalListener iDigitalListener) {
        this.f2442b = iDigitalListener;
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().setDigitalListener(this.f2442b);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void setSkeletonData(HashMap<String, List<Double>> hashMap) {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().setSkeletonData(hashMap);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void startRecord() {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().startRecord();
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void stop() {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().stop();
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void stopRecord() {
        WeakReference<IDigital> weakReference = this.f2441a;
        if (weakReference != null) {
            weakReference.get().stopRecord();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var == 0) {
            WeakReference<IDigital> weakReference = this.f2441a;
            if (weakReference != null) {
                weakReference.clear();
                this.f2441a = null;
                return;
            }
            return;
        }
        if (c0Var instanceof IDigital) {
            WeakReference<IDigital> weakReference2 = new WeakReference<>((IDigital) c0Var);
            this.f2441a = weakReference2;
            weakReference2.get().setDigitalListener(this.f2442b);
        }
    }
}
