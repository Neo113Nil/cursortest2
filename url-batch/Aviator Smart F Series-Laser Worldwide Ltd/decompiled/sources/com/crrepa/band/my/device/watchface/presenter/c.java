package com.crrepa.band.my.device.watchface.presenter;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public class c implements com.moyoung.dafit.module.common.baseui.f {
    private float angle;
    private Bitmap imageview_bitmap;
    private int segments = 24;
    private Bitmap source_image;
    x1.b watchFaceView;

    private float calculateCanvasSymmetryOffset(float f8) {
        float f9;
        if ((this.segments / 2) % 2 == 1) {
            f9 = this.angle;
        } else {
            float f10 = this.angle;
            f8 = ((f8 / f10) - ((int) r4)) * f10;
            if (f8 < f10 / 2.0f) {
                return -(f8 * 2.0f);
            }
            f9 = f10 * 2.0f;
        }
        return f9 - (f8 * 2.0f);
    }

    private Bitmap generateKaleidoscopeBitmap(float f8, boolean z7) {
        Canvas canvas = new Canvas(this.imageview_bitmap);
        canvas.drawColor(-16777216);
        int width = this.imageview_bitmap.getWidth();
        int height = this.imageview_bitmap.getHeight();
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        if (z7) {
            double d8 = width;
            float sqrt = (float) (Math.sqrt(Math.pow(d8, 2.0d) + Math.pow(height, 2.0d)) / d8);
            canvas.scale(sqrt, sqrt, rectF.centerX(), rectF.centerY());
        }
        Path path = new Path();
        int width2 = this.imageview_bitmap.getWidth() / 2;
        int height2 = this.imageview_bitmap.getHeight() / 2;
        float calculateCanvasSymmetryOffset = calculateCanvasSymmetryOffset(f8);
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.arcTo(rectF, f8, this.angle);
        path.close();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Bitmap bitmap = this.source_image;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        for (int i8 = 0; i8 < this.segments / 2; i8++) {
            canvas.drawPath(path, paint);
            canvas.rotate(this.angle * 2.0f, width2, height2);
        }
        float f9 = width2;
        float f10 = height2;
        canvas.scale(-1.0f, 1.0f, f9, f10);
        canvas.rotate(calculateCanvasSymmetryOffset, f9, f10);
        for (int i9 = 0; i9 < this.segments / 2; i9++) {
            canvas.drawPath(path, paint);
            canvas.rotate(this.angle * 2.0f, f9, f10);
        }
        return this.imageview_bitmap;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public void drawKaleidoscope(float f8, int i8, boolean z7) {
        int i9 = i8 * 2;
        this.segments = i9;
        this.angle = 360.0f / i9;
        this.watchFaceView.renderKaleidoscopeStyle(generateKaleidoscopeBitmap(f8, z7));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setSourceImage(Bitmap bitmap) {
        this.source_image = bitmap;
        this.imageview_bitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public void setView(x1.b bVar) {
        this.watchFaceView = bVar;
    }
}
