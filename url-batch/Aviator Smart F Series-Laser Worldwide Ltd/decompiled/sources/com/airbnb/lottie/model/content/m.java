package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.r;

/* loaded from: classes.dex */
public class m implements c {
    private final boolean hidden;
    private final int index;
    private final String name;
    private final com.airbnb.lottie.model.animatable.h shapePath;

    public m(String str, int i8, com.airbnb.lottie.model.animatable.h hVar, boolean z7) {
        this.name = str;
        this.index = i8;
        this.shapePath = hVar;
        this.hidden = z7;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.h getShapePath() {
        return this.shapePath;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new r(lottieDrawable, bVar, this);
    }

    public String toString() {
        return "ShapePath{name=" + this.name + ", index=" + this.index + '}';
    }
}
