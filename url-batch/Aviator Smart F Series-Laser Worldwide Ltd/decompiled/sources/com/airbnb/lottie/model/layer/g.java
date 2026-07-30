package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.n0;

/* loaded from: classes.dex */
public class g extends b {

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorFilterAnimation;
    private final Layer layerModel;
    private final Paint paint;
    private final Path path;
    private final float[] points;
    private final RectF rect;

    g(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.rect = new RectF();
        v.a aVar = new v.a();
        this.paint = aVar;
        this.points = new float[8];
        this.path = new Path();
        this.layerModel = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.getSolidColor());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        super.addValueCallback(t7, cVar);
        if (t7 == n0.COLOR_FILTER) {
            if (cVar == null) {
                this.colorFilterAnimation = null;
            } else {
                this.colorFilterAnimation = new q(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        int alpha = Color.alpha(this.layerModel.getSolidColor());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i8 / 255.0f) * (((alpha / 255.0f) * (this.transform.getOpacity() == null ? 100 : ((Integer) this.transform.getOpacity().getValue()).intValue())) / 100.0f) * 255.0f);
        this.paint.setAlpha(intValue);
        com.airbnb.lottie.animation.keyframe.a aVar = this.colorFilterAnimation;
        if (aVar != null) {
            this.paint.setColorFilter((ColorFilter) aVar.getValue());
        }
        if (intValue > 0) {
            float[] fArr = this.points;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.layerModel.getSolidWidth();
            float[] fArr2 = this.points;
            fArr2[3] = 0.0f;
            fArr2[4] = this.layerModel.getSolidWidth();
            this.points[5] = this.layerModel.getSolidHeight();
            float[] fArr3 = this.points;
            fArr3[6] = 0.0f;
            fArr3[7] = this.layerModel.getSolidHeight();
            matrix.mapPoints(this.points);
            this.path.reset();
            Path path = this.path;
            float[] fArr4 = this.points;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.path;
            float[] fArr5 = this.points;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.path;
            float[] fArr6 = this.points;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.path;
            float[] fArr7 = this.points;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.path;
            float[] fArr8 = this.points;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.path.close();
            canvas.drawPath(this.path, this.paint);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        super.getBounds(rectF, matrix, z7);
        this.rect.set(0.0f, 0.0f, this.layerModel.getSolidWidth(), this.layerModel.getSolidHeight());
        this.boundsMatrix.mapRect(this.rect);
        rectF.set(this.rect);
    }
}
