package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.o;

/* loaded from: classes.dex */
public class g implements c {
    private final com.airbnb.lottie.model.animatable.b cornerRadius;
    private final boolean hidden;
    private final String name;
    private final com.airbnb.lottie.model.animatable.m position;
    private final com.airbnb.lottie.model.animatable.m size;

    public g(String str, com.airbnb.lottie.model.animatable.m mVar, com.airbnb.lottie.model.animatable.m mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z7) {
        this.name = str;
        this.position = mVar;
        this.size = mVar2;
        this.cornerRadius = bVar;
        this.hidden = z7;
    }

    public com.airbnb.lottie.model.animatable.b getCornerRadius() {
        return this.cornerRadius;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.m getPosition() {
        return this.position;
    }

    public com.airbnb.lottie.model.animatable.m getSize() {
        return this.size;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new o(lottieDrawable, bVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.position + ", size=" + this.size + '}';
    }
}
