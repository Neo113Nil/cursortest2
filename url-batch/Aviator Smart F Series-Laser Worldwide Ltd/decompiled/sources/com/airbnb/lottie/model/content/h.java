package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.p;

/* loaded from: classes.dex */
public class h implements c {
    private final com.airbnb.lottie.model.animatable.b copies;
    private final boolean hidden;
    private final String name;
    private final com.airbnb.lottie.model.animatable.b offset;
    private final com.airbnb.lottie.model.animatable.l transform;

    public h(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z7) {
        this.name = str;
        this.copies = bVar;
        this.offset = bVar2;
        this.transform = lVar;
        this.hidden = z7;
    }

    public com.airbnb.lottie.model.animatable.b getCopies() {
        return this.copies;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.b getOffset() {
        return this.offset;
    }

    public com.airbnb.lottie.model.animatable.l getTransform() {
        return this.transform;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new p(lottieDrawable, bVar, this);
    }
}
