package com.baidu.ar;

import android.graphics.Bitmap;
import com.baidu.ar.track2d.ITrack2D;
import com.baidu.ar.track2d.ITrack2DStateChangedListener;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class uc extends d0 implements ITrack2D {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<ITrack2D> f3413a;

    /* renamed from: b, reason: collision with root package name */
    public ITrack2DStateChangedListener f3414b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<ITrack2D> weakReference = this.f3413a;
        if (weakReference != null) {
            weakReference.clear();
            this.f3413a = null;
        }
        this.f3414b = null;
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public Bitmap getTargetBitmap() {
        WeakReference<ITrack2D> weakReference = this.f3413a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f3413a.get().getTargetBitmap();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void haltTrack() {
        WeakReference<ITrack2D> weakReference = this.f3413a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f3413a.get().haltTrack();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void resumeTrack() {
        WeakReference<ITrack2D> weakReference = this.f3413a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f3413a.get().resumeTrack();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void setStateChangedListener(ITrack2DStateChangedListener iTrack2DStateChangedListener) {
        WeakReference<ITrack2D> weakReference;
        this.f3414b = iTrack2DStateChangedListener;
        if (iTrack2DStateChangedListener == null || (weakReference = this.f3413a) == null || weakReference.get() == null) {
            return;
        }
        this.f3413a.get().setStateChangedListener(this.f3414b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof ITrack2D) {
            ITrack2D iTrack2D = (ITrack2D) c0Var;
            this.f3413a = new WeakReference<>(iTrack2D);
            ITrack2DStateChangedListener iTrack2DStateChangedListener = this.f3414b;
            if (iTrack2DStateChangedListener != null) {
                iTrack2D.setStateChangedListener(iTrack2DStateChangedListener);
            }
        }
    }
}
