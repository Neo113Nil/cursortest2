package com.baidu.ar;

import com.baidu.ar.cloud.ICloudIR;
import com.baidu.ar.cloud.ICloudIRStateChangedListener;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class g2 extends d0 implements ICloudIR {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<ICloudIR> f2312a;

    /* renamed from: b, reason: collision with root package name */
    public ICloudIRStateChangedListener f2313b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<ICloudIR> weakReference = this.f2312a;
        if (weakReference != null) {
            weakReference.clear();
            this.f2312a = null;
        }
        this.f2313b = null;
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void pause() {
        WeakReference<ICloudIR> weakReference = this.f2312a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2312a.get().pause();
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void resume() {
        WeakReference<ICloudIR> weakReference = this.f2312a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2312a.get().resume();
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void setStateChangedListener(ICloudIRStateChangedListener iCloudIRStateChangedListener) {
        WeakReference<ICloudIR> weakReference;
        this.f2313b = iCloudIRStateChangedListener;
        if (iCloudIRStateChangedListener == null || (weakReference = this.f2312a) == null || weakReference.get() == null) {
            return;
        }
        this.f2312a.get().setStateChangedListener(this.f2313b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof ICloudIR) {
            ICloudIR iCloudIR = (ICloudIR) c0Var;
            this.f2312a = new WeakReference<>(iCloudIR);
            ICloudIRStateChangedListener iCloudIRStateChangedListener = this.f2313b;
            if (iCloudIRStateChangedListener != null) {
                iCloudIR.setStateChangedListener(iCloudIRStateChangedListener);
            }
        }
    }
}
