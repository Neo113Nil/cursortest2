package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.q;

/* loaded from: classes.dex */
public class i implements c {
    private final com.airbnb.lottie.model.animatable.m cornerRadius;
    private final String name;

    public i(String str, com.airbnb.lottie.model.animatable.m mVar) {
        this.name = str;
        this.cornerRadius = mVar;
    }

    public com.airbnb.lottie.model.animatable.m getCornerRadius() {
        return this.cornerRadius;
    }

    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new q(lottieDrawable, bVar, this);
    }
}
