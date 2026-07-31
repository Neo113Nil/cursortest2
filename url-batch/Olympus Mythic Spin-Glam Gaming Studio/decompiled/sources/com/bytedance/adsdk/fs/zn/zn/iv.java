package com.bytedance.adsdk.fs.zn.zn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes6.dex */
public class iv extends fb {
    private int bvs;
    private int iv;
    private Path zg;

    public iv(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar, Context context) {
        super(bvsVar, btkVar);
        this.zg = null;
        this.bvs = -1;
        this.iv = -1;
        if (((fb) this).nps != null) {
            float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn();
            this.bvs = (int) (((fb) this).nps.zmn() * zmn);
            this.iv = (int) (((fb) this).nps.fs() * zmn);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.bvs, this.iv);
            Path path = new Path();
            this.zg = path;
            float f = zmn * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.fb, com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        View zmn = this.fs.zmn();
        if (this.bvs <= 0 || zmn == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        zmn(i);
        float hhw = hhw();
        zmn(zmn, this.bvs, this.iv);
        zmn.setAlpha(hhw);
        canvas.clipPath(this.zg);
        zmn.draw(canvas);
        canvas.restore();
    }

    private static void zmn(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
