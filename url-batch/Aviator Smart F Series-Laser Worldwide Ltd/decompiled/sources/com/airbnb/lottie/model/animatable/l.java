package com.airbnb.lottie.model.animatable;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.p;

/* loaded from: classes.dex */
public class l implements com.airbnb.lottie.model.content.c {

    @Nullable
    private final e anchorPoint;

    @Nullable
    private final b endOpacity;

    @Nullable
    private final d opacity;

    @Nullable
    private final m position;

    @Nullable
    private final b rotation;

    @Nullable
    private final g scale;

    @Nullable
    private final b skew;

    @Nullable
    private final b skewAngle;

    @Nullable
    private final b startOpacity;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public p createAnimation() {
        return new p(this);
    }

    @Nullable
    public e getAnchorPoint() {
        return this.anchorPoint;
    }

    @Nullable
    public b getEndOpacity() {
        return this.endOpacity;
    }

    @Nullable
    public d getOpacity() {
        return this.opacity;
    }

    @Nullable
    public m getPosition() {
        return this.position;
    }

    @Nullable
    public b getRotation() {
        return this.rotation;
    }

    @Nullable
    public g getScale() {
        return this.scale;
    }

    @Nullable
    public b getSkew() {
        return this.skew;
    }

    @Nullable
    public b getSkewAngle() {
        return this.skewAngle;
    }

    @Nullable
    public b getStartOpacity() {
        return this.startOpacity;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    public l(@Nullable e eVar, @Nullable m mVar, @Nullable g gVar, @Nullable b bVar, @Nullable d dVar, @Nullable b bVar2, @Nullable b bVar3, @Nullable b bVar4, @Nullable b bVar5) {
        this.anchorPoint = eVar;
        this.position = mVar;
        this.scale = gVar;
        this.rotation = bVar;
        this.opacity = dVar;
        this.startOpacity = bVar2;
        this.endOpacity = bVar3;
        this.skew = bVar4;
        this.skewAngle = bVar5;
    }
}
