package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.parser.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class f extends b {
    private final c compositionLayer;
    private final com.airbnb.lottie.animation.content.d contentGroup;

    f(LottieDrawable lottieDrawable, Layer layer, c cVar) {
        super(lottieDrawable, layer);
        this.compositionLayer = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(lottieDrawable, this, new l("__container", layer.getShapes(), false));
        this.contentGroup = dVar;
        dVar.setContents(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b
    void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i8) {
        this.contentGroup.draw(canvas, matrix, i8);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @Nullable
    public com.airbnb.lottie.model.content.a getBlurEffect() {
        com.airbnb.lottie.model.content.a blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.compositionLayer.getBlurEffect();
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        super.getBounds(rectF, matrix, z7);
        this.contentGroup.getBounds(rectF, this.boundsMatrix, z7);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @Nullable
    public j getDropShadowEffect() {
        j dropShadowEffect = super.getDropShadowEffect();
        return dropShadowEffect != null ? dropShadowEffect : this.compositionLayer.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void resolveChildKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.contentGroup.resolveKeyPath(dVar, i8, list, dVar2);
    }
}
