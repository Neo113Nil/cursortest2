package com.baidu.ar;

import com.baidu.ar.recg.IOnDeviceIR;
import com.baidu.ar.recg.IOnDeviceIRStateChangedListener;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class r9 extends d0 implements IOnDeviceIR {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<IOnDeviceIR> f3045a;

    /* renamed from: b, reason: collision with root package name */
    public IOnDeviceIRStateChangedListener f3046b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<IOnDeviceIR> weakReference = this.f3045a;
        if (weakReference != null) {
            weakReference.clear();
            this.f3045a = null;
        }
        this.f3046b = null;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIR
    public void retry() {
        WeakReference<IOnDeviceIR> weakReference = this.f3045a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f3045a.get().retry();
    }

    @Override // com.baidu.ar.recg.IOnDeviceIR
    public void setStateChangedListener(IOnDeviceIRStateChangedListener iOnDeviceIRStateChangedListener) {
        WeakReference<IOnDeviceIR> weakReference;
        this.f3046b = iOnDeviceIRStateChangedListener;
        if (iOnDeviceIRStateChangedListener == null || (weakReference = this.f3045a) == null || weakReference.get() == null) {
            return;
        }
        this.f3045a.get().setStateChangedListener(this.f3046b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof IOnDeviceIR) {
            IOnDeviceIR iOnDeviceIR = (IOnDeviceIR) c0Var;
            this.f3045a = new WeakReference<>(iOnDeviceIR);
            IOnDeviceIRStateChangedListener iOnDeviceIRStateChangedListener = this.f3046b;
            if (iOnDeviceIRStateChangedListener != null) {
                iOnDeviceIR.setStateChangedListener(iOnDeviceIRStateChangedListener);
            }
        }
    }
}
