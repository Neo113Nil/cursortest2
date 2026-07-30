package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;

/* loaded from: classes.dex */
public class f implements c {
    private final ShapeStroke.LineCapType capType;

    @Nullable
    private final com.airbnb.lottie.model.animatable.b dashOffset;
    private final com.airbnb.lottie.model.animatable.f endPoint;
    private final com.airbnb.lottie.model.animatable.c gradientColor;
    private final GradientType gradientType;
    private final boolean hidden;
    private final ShapeStroke.LineJoinType joinType;
    private final List<com.airbnb.lottie.model.animatable.b> lineDashPattern;
    private final float miterLimit;
    private final String name;
    private final com.airbnb.lottie.model.animatable.d opacity;
    private final com.airbnb.lottie.model.animatable.f startPoint;
    private final com.airbnb.lottie.model.animatable.b width;

    public f(String str, GradientType gradientType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f8, List<com.airbnb.lottie.model.animatable.b> list, @Nullable com.airbnb.lottie.model.animatable.b bVar2, boolean z7) {
        this.name = str;
        this.gradientType = gradientType;
        this.gradientColor = cVar;
        this.opacity = dVar;
        this.startPoint = fVar;
        this.endPoint = fVar2;
        this.width = bVar;
        this.capType = lineCapType;
        this.joinType = lineJoinType;
        this.miterLimit = f8;
        this.lineDashPattern = list;
        this.dashOffset = bVar2;
        this.hidden = z7;
    }

    public ShapeStroke.LineCapType getCapType() {
        return this.capType;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.b getDashOffset() {
        return this.dashOffset;
    }

    public com.airbnb.lottie.model.animatable.f getEndPoint() {
        return this.endPoint;
    }

    public com.airbnb.lottie.model.animatable.c getGradientColor() {
        return this.gradientColor;
    }

    public GradientType getGradientType() {
        return this.gradientType;
    }

    public ShapeStroke.LineJoinType getJoinType() {
        return this.joinType;
    }

    public List<com.airbnb.lottie.model.animatable.b> getLineDashPattern() {
        return this.lineDashPattern;
    }

    public float getMiterLimit() {
        return this.miterLimit;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.d getOpacity() {
        return this.opacity;
    }

    public com.airbnb.lottie.model.animatable.f getStartPoint() {
        return this.startPoint;
    }

    public com.airbnb.lottie.model.animatable.b getWidth() {
        return this.width;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(lottieDrawable, bVar, this);
    }
}
