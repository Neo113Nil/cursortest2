package h1;

import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.unity3d.player.UnityPlayerForActivityOrService;

/* renamed from: h1.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2439A extends SurfaceView {

    /* renamed from: a, reason: collision with root package name */
    public float f36700a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f36701b;

    public C2439A(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        this.f36701b = unityPlayerForActivityOrService;
    }

    @Override // android.view.View
    public final boolean onCapturedPointerEvent(MotionEvent motionEvent) {
        return this.f36701b.injectEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f36700a > 0.0f) {
            return this.f36701b.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f36700a <= 0.0f) {
            super.onMeasure(i4, i5);
            return;
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (size <= 0 || size2 <= 0 || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            super.onMeasure(i4, i5);
            return;
        }
        float f4 = size;
        float f5 = size2;
        float f6 = f4 / f5;
        float f7 = this.f36700a;
        if (f6 < f7) {
            size2 = (int) (f4 / f7);
        } else {
            size = (int) (f5 * f7);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36700a > 0.0f) {
            return this.f36701b.injectEvent(motionEvent);
        }
        return false;
    }
}
