package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public class b implements c {
    private final boolean hidden;
    private final boolean isReversed;
    private final String name;
    private final com.airbnb.lottie.model.animatable.m position;
    private final com.airbnb.lottie.model.animatable.f size;

    public b(String str, com.airbnb.lottie.model.animatable.m mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z7, boolean z8) {
        this.name = str;
        this.position = mVar;
        this.size = fVar;
        this.isReversed = z7;
        this.hidden = z8;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.m getPosition() {
        return this.position;
    }

    public com.airbnb.lottie.model.animatable.f getSize() {
        return this.size;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean isReversed() {
        return this.isReversed;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(lottieDrawable, bVar, this);
    }
}
