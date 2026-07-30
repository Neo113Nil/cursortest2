package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public class k implements c {

    @Nullable
    private final com.airbnb.lottie.model.animatable.a color;
    private final boolean fillEnabled;
    private final Path.FillType fillType;
    private final boolean hidden;
    private final String name;

    @Nullable
    private final com.airbnb.lottie.model.animatable.d opacity;

    public k(String str, boolean z7, Path.FillType fillType, @Nullable com.airbnb.lottie.model.animatable.a aVar, @Nullable com.airbnb.lottie.model.animatable.d dVar, boolean z8) {
        this.name = str;
        this.fillEnabled = z7;
        this.fillType = fillType;
        this.color = aVar;
        this.opacity = dVar;
        this.hidden = z8;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.a getColor() {
        return this.color;
    }

    public Path.FillType getFillType() {
        return this.fillType;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.d getOpacity() {
        return this.opacity;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(lottieDrawable, bVar, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.fillEnabled + '}';
    }
}
