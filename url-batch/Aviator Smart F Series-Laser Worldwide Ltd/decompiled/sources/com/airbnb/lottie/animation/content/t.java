package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.n0;

/* loaded from: classes.dex */
public class t extends a {
    private final com.airbnb.lottie.animation.keyframe.a colorAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorFilterAnimation;
    private final boolean hidden;
    private final com.airbnb.lottie.model.layer.b layer;
    private final String name;

    public t(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, bVar, shapeStroke.getCapType().toPaintCap(), shapeStroke.getJoinType().toPaintJoin(), shapeStroke.getMiterLimit(), shapeStroke.getOpacity(), shapeStroke.getWidth(), shapeStroke.getLineDashPattern(), shapeStroke.getDashOffset());
        this.layer = bVar;
        this.name = shapeStroke.getName();
        this.hidden = shapeStroke.isHidden();
        com.airbnb.lottie.animation.keyframe.a createAnimation = shapeStroke.getColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        bVar.addAnimation(createAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        super.addValueCallback(t7, cVar);
        if (t7 == n0.STROKE_COLOR) {
            this.colorAnimation.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.COLOR_FILTER) {
            com.airbnb.lottie.animation.keyframe.a aVar = this.colorFilterAnimation;
            if (aVar != null) {
                this.layer.removeAnimation(aVar);
            }
            if (cVar == null) {
                this.colorFilterAnimation = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(cVar);
            this.colorFilterAnimation = qVar;
            qVar.addUpdateListener(this);
            this.layer.addAnimation(this.colorAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.hidden) {
            return;
        }
        this.paint.setColor(((com.airbnb.lottie.animation.keyframe.b) this.colorAnimation).getIntValue());
        com.airbnb.lottie.animation.keyframe.a aVar = this.colorFilterAnimation;
        if (aVar != null) {
            this.paint.setColorFilter((ColorFilter) aVar.getValue());
        }
        super.draw(canvas, matrix, i8);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.k, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }
}
