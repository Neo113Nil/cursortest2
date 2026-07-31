package com.bytedance.adsdk.ugeno.hhw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes5.dex */
public class fs extends zmn<com.bytedance.adsdk.ugeno.fs.zn> {
    private com.bytedance.adsdk.ugeno.fb fb;

    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zmn
    public View rc(int i) {
        return ((com.bytedance.adsdk.ugeno.fs.zn) this.zmn.get(i)).rc();
    }

    public void zmn(com.bytedance.adsdk.ugeno.fb fbVar) {
        this.fb = fbVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.fb fbVar = this.fb;
        if (fbVar != null) {
            int[] zmn = fbVar.zmn(i, i2);
            super.onMeasure(zmn[0], zmn[1]);
        } else {
            super.onMeasure(i, i2);
        }
        com.bytedance.adsdk.ugeno.fb fbVar2 = this.fb;
        if (fbVar2 != null) {
            fbVar2.btk();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.hhw();
        }
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.fb fbVar2 = this.fb;
        if (fbVar2 != null) {
            fbVar2.zmn(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
