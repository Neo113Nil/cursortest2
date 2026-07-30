package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public class e implements c {
    private final com.airbnb.lottie.model.animatable.f endPoint;
    private final Path.FillType fillType;
    private final com.airbnb.lottie.model.animatable.c gradientColor;
    private final GradientType gradientType;
    private final boolean hidden;

    @Nullable
    private final com.airbnb.lottie.model.animatable.b highlightAngle;

    @Nullable
    private final com.airbnb.lottie.model.animatable.b highlightLength;
    private final String name;
    private final com.airbnb.lottie.model.animatable.d opacity;
    private final com.airbnb.lottie.model.animatable.f startPoint;

    public e(String str, GradientType gradientType, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z7) {
        this.gradientType = gradientType;
        this.fillType = fillType;
        this.gradientColor = cVar;
        this.opacity = dVar;
        this.startPoint = fVar;
        this.endPoint = fVar2;
        this.name = str;
        this.highlightLength = bVar;
        this.highlightAngle = bVar2;
        this.hidden = z7;
    }

    public com.airbnb.lottie.model.animatable.f getEndPoint() {
        return this.endPoint;
    }

    public Path.FillType getFillType() {
        return this.fillType;
    }

    public com.airbnb.lottie.model.animatable.c getGradientColor() {
        return this.gradientColor;
    }

    public GradientType getGradientType() {
        return this.gradientType;
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

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(lottieDrawable, bVar, this);
    }
}
