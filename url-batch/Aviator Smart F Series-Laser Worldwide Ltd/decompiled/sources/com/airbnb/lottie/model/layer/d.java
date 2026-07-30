package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j0;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.utils.j;

/* loaded from: classes.dex */
public class d extends b {

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorFilterAnimation;
    private final Rect dst;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a imageAnimation;

    @Nullable
    private final j0 lottieImageAsset;
    private final Paint paint;
    private final Rect src;

    d(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.paint = new v.a(3);
        this.src = new Rect();
        this.dst = new Rect();
        this.lottieImageAsset = lottieDrawable.getLottieImageAssetForId(layer.getRefId());
    }

    @Nullable
    private Bitmap getBitmap() {
        Bitmap bitmap;
        com.airbnb.lottie.animation.keyframe.a aVar = this.imageAnimation;
        if (aVar != null && (bitmap = (Bitmap) aVar.getValue()) != null) {
            return bitmap;
        }
        Bitmap bitmapForId = this.lottieDrawable.getBitmapForId(this.layerModel.getRefId());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        j0 j0Var = this.lottieImageAsset;
        if (j0Var != null) {
            return j0Var.getBitmap();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        super.addValueCallback(t7, cVar);
        if (t7 == n0.COLOR_FILTER) {
            if (cVar == null) {
                this.colorFilterAnimation = null;
                return;
            } else {
                this.colorFilterAnimation = new q(cVar);
                return;
            }
        }
        if (t7 == n0.IMAGE) {
            if (cVar == null) {
                this.imageAnimation = null;
            } else {
                this.imageAnimation = new q(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i8) {
        Bitmap bitmap = getBitmap();
        if (bitmap == null || bitmap.isRecycled() || this.lottieImageAsset == null) {
            return;
        }
        float dpScale = j.dpScale();
        this.paint.setAlpha(i8);
        com.airbnb.lottie.animation.keyframe.a aVar = this.colorFilterAnimation;
        if (aVar != null) {
            this.paint.setColorFilter((ColorFilter) aVar.getValue());
        }
        canvas.save();
        canvas.concat(matrix);
        this.src.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (this.lottieDrawable.getMaintainOriginalImageBounds()) {
            this.dst.set(0, 0, (int) (this.lottieImageAsset.getWidth() * dpScale), (int) (this.lottieImageAsset.getHeight() * dpScale));
        } else {
            this.dst.set(0, 0, (int) (bitmap.getWidth() * dpScale), (int) (bitmap.getHeight() * dpScale));
        }
        canvas.drawBitmap(bitmap, this.src, this.dst, this.paint);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        super.getBounds(rectF, matrix, z7);
        if (this.lottieImageAsset != null) {
            float dpScale = j.dpScale();
            rectF.set(0.0f, 0.0f, this.lottieImageAsset.getWidth() * dpScale, this.lottieImageAsset.getHeight() * dpScale);
            this.boundsMatrix.mapRect(rectF);
        }
    }
}
